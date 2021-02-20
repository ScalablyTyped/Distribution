package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.FileAccessMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This namespace gives your Windows Store app access to devices that support the Human Interface Device (HID) protocol. */
object HumanInterfaceDevice {
  
  /** Represents a simple Boolean control on a HID device that returns on/off values. An example would be the LED light on a keyboard. */
  @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidBooleanControl")
  @js.native
  abstract class HidBooleanControl ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControl
  
  /** Describes a Boolean control for a given HID device. */
  @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription")
  @js.native
  abstract class HidBooleanControlDescription ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription
  
  /** Retrieves the collection information for a group of related controls. */
  @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidCollection")
  @js.native
  abstract class HidCollection ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollection
  
  /** Identifies the relationship that defines a grouping of controls on the device. */
  @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidCollectionType")
  @js.native
  object HidCollectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType with Double
      ] = js.native
    
    /* 1 */ val application: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.application with Double = js.native
    
    /* 2 */ val logical: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.logical with Double = js.native
    
    /* 4 */ val namedArray: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.namedArray with Double = js.native
    
    /* 7 */ val other: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.other with Double = js.native
    
    /* 0 */ val physical: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.physical with Double = js.native
    
    /* 3 */ val report: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.report with Double = js.native
    
    /* 6 */ val usageModifier: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.usageModifier with Double = js.native
    
    /* 5 */ val usageSwitch: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.usageSwitch with Double = js.native
  }
  
  /** Represents a top-level collection and the corresponding device. */
  @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidDevice")
  @js.native
  abstract class HidDevice ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidDevice
  object HidDevice {
    
    /**
      * Opens a handle to the device identified by the deviceId parameter. The acess type is specified by the accessMode parameter.
      * @param deviceId The DeviceInformation ID that identifies the HID device.
      * @param accessMode Specifies the access mode. The supported access modes are Read and ReadWrite.
      * @return A HidDevice object.
      */
    /* static member */
    @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidDevice.fromIdAsync")
    @js.native
    def fromIdAsync(deviceId: String, accessMode: FileAccessMode): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidDevice] = js.native
    
    /**
      * Retrieves an Advanced Query Syntax (AQS) string based on the given usagePage and usageId.
      * @param usagePage Specifies the usage page of the top-level collection for the given HID device.
      * @param usageId Specifies the usage identifier of the top-level collection for the given HID device.
      * @return An Advanced Query Syntax (AQS) string that represents a device selector.
      */
    /* static member */
    @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(usagePage: Double, usageId: Double): String = js.native
    /**
      * Retrieves an Advanced Query Syntax (AQS) string based on the given usagePage, usageId, vendorId, and productId.
      * @param usagePage Specifies the usage page of the top-level collection for the given HID device.
      * @param usageId Specifies the usage identifier of the top-level collection for the given HID device.
      * @param vendorId Identifies the device vendor.
      * @param productId Identifies the product.
      * @return An Advanced Query Syntax (AQS) string that represents a device selector.
      */
    /* static member */
    @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(usagePage: Double, usageId: Double, vendorId: Double, productId: Double): String = js.native
  }
  
  /** Represents a feature report. */
  @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidFeatureReport")
  @js.native
  abstract class HidFeatureReport ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidFeatureReport
  
  /** Represents an input report. */
  @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidInputReport")
  @js.native
  abstract class HidInputReport ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidInputReport
  
  /** Represents the arguments which the HID API sends as part of an input-report event. */
  @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidInputReportReceivedEventArgs")
  @js.native
  abstract class HidInputReportReceivedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidInputReportReceivedEventArgs
  
  /** Represents a numeric control on a HID device that returns a range of values. An example would be the volume control on a speaker. */
  @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidNumericControl")
  @js.native
  abstract class HidNumericControl ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControl
  
  /** Describes a numeric control for a given HID device. */
  @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription")
  @js.native
  abstract class HidNumericControlDescription ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription
  
  /** Represents an output report. */
  @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidOutputReport")
  @js.native
  abstract class HidOutputReport ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidOutputReport
  
  /** Specifies a HID report type. */
  @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidReportType")
  @js.native
  object HidReportType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType with Double] = js.native
    
    /* 2 */ val feature: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.feature with Double = js.native
    
    /* 0 */ val input: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.input with Double = js.native
    
    /* 1 */ val output: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.output with Double = js.native
  }
}
