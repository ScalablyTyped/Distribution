package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType
import typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.FileAccessMode
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This namespace gives your Windows Store app access to devices that support the Human Interface Device (HID) protocol. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice")
@js.native
object HumanInterfaceDevice extends js.Object {
  /** Represents a simple Boolean control on a HID device that returns on/off values. An example would be the LED light on a keyboard. */
  @js.native
  abstract class HidBooleanControl ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControl {
    /** Retrieves a description of the given Boolean control. */
    /* CompleteClass */
    override var controlDescription: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription = js.native
    /** Retrieves the identifier for a given Boolean control. */
    /* CompleteClass */
    override var id: Double = js.native
    /** Retrieves a Boolean value indicating whether the given Boolean control is active. */
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /** Retrieves the usage identifier associated with the given Boolean control. */
    /* CompleteClass */
    override var usageId: Double = js.native
    /** Retrieves the usage page for a given Boolean control. */
    /* CompleteClass */
    override var usagePage: Double = js.native
  }
  
  /** Describes a Boolean control for a given HID device. */
  @js.native
  abstract class HidBooleanControlDescription ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription {
    /** Retrieves the identifier for a given Boolean control. */
    /* CompleteClass */
    override var id: Double = js.native
    /** Retrieves the parent collection for a given Boolean control. */
    /* CompleteClass */
    override var parentCollections: IVectorView[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollection] = js.native
    /** Retrieves the identifier for the report associated with the given Boolean control. */
    /* CompleteClass */
    override var reportId: Double = js.native
    /** Retrieves the report type for the report associated with the given Boolean control. */
    /* CompleteClass */
    override var reportType: HidReportType = js.native
    /** Retrieves the usage identifier associated with the given Boolean control. */
    /* CompleteClass */
    override var usageId: Double = js.native
    /** Retrieves the usage page associated with the given Boolean control. */
    /* CompleteClass */
    override var usagePage: Double = js.native
  }
  
  /** Retrieves the collection information for a group of related controls. */
  @js.native
  abstract class HidCollection ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollection {
    /** Retrieves the identifier for a collection of HID controls. */
    /* CompleteClass */
    override var id: Double = js.native
    /** Retrieves the collection type. */
    /* CompleteClass */
    override var `type`: HidCollectionType = js.native
    /** Retrieves the usage identifier for the given control collection. */
    /* CompleteClass */
    override var usageId: Double = js.native
    /** Retrieves the usage page for the given control collection. */
    /* CompleteClass */
    override var usagePage: Double = js.native
  }
  
  /** Represents a top-level collection and the corresponding device. */
  @js.native
  abstract class HidDevice ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidDevice
  
  /** Represents a feature report. */
  @js.native
  abstract class HidFeatureReport ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidFeatureReport {
    /** Retrieves, or sets, the data associated with a given feature report. */
    /* CompleteClass */
    override var data: IBuffer = js.native
    /** Retrieves the identifier associated with a given feature report. */
    /* CompleteClass */
    override var id: Double = js.native
    /**
      * Retrieves the Boolean control associated with the usagePage and usageIdparameter and found in the given feature report.
      * @param usagePage The usage page of the top-level collection for the given HID device.
      * @param usageId The usage identifier of the top-level collection for the given HID device.
      * @return A HidBooleanControl object.
      */
    /* CompleteClass */
    override def getBooleanControl(usagePage: Double, usageId: Double): typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControl = js.native
    /**
      * Retrieves the Boolean control described by the controlDescription parameter and found in the given feature report.
      * @param controlDescription A HidBooleanControlDescription object.
      * @return A HidBooleanControl object.
      */
    /* CompleteClass */
    override def getBooleanControlByDescription(
      controlDescription: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription
    ): typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControl = js.native
    /**
      * Retrieves the numeric control associated with the usagePage and usageId parameters and found in the given feature report.
      * @param usagePage The usage page of the top-level collection for the given HID device.
      * @param usageId The usage identifier of the top-level collection for the given HID device.
      * @return A HidNumericControl object.
      */
    /* CompleteClass */
    override def getNumericControl(usagePage: Double, usageId: Double): typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControl = js.native
    /**
      * Retrieves the numeric control described by the controlDescription parameter and found in the given feature report.
      * @param controlDescription A HidNumericControlDescription object.
      * @return A HidNumericControl object.
      */
    /* CompleteClass */
    override def getNumericControlByDescription(
      controlDescription: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription
    ): typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControl = js.native
  }
  
  /** Represents an input report. */
  @js.native
  abstract class HidInputReport ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidInputReport {
    /** Retrieves the currently activated Boolean controls for the given HID device. */
    /* CompleteClass */
    override var activatedBooleanControls: IVectorView[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControl] = js.native
    /** Retrieves the data associated with a given input report. */
    /* CompleteClass */
    override var data: IBuffer = js.native
    /* CompleteClass */
    override var getBooleanControl: js.Any = js.native
    /* CompleteClass */
    override var getNumericControl: js.Any = js.native
    /** Retrieves the identifier associated with a given input report. */
    /* CompleteClass */
    override var id: Double = js.native
    /** Retrieves the recently transitioned Boolean controls for the given HID device. */
    /* CompleteClass */
    override var transitionedBooleanControls: IVectorView[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControl] = js.native
     /* unmapped type */ /**
      * Retrieves the Boolean control described by the controlDescription parameter and found in the given input report.
      * @param controlDescription A HidBooleanControlDescription object.
      * @return A HidBooleanControl object.
      */
    /* CompleteClass */
    override def getBooleanControlByDescription(
      controlDescription: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription
    ): typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControl = js.native
     /* unmapped type */ /**
      * Retrieves the numeric control described by the controlDescription parameter and found in the given input report.
      * @param controlDescription A HidNumericControlDescription object.
      * @return A HidNumericControl object.
      */
    /* CompleteClass */
    override def getNumericControlByDescription(
      controlDescription: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription
    ): typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControl = js.native
  }
  
  /** Represents the arguments which the HID API sends as part of an input-report event. */
  @js.native
  abstract class HidInputReportReceivedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidInputReportReceivedEventArgs {
    /** Retrieves the input report. */
    /* CompleteClass */
    override var report: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidInputReport = js.native
  }
  
  /** Represents a numeric control on a HID device that returns a range of values. An example would be the volume control on a speaker. */
  @js.native
  abstract class HidNumericControl ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControl {
    /** Retrieves a control description for the given numeric control. */
    /* CompleteClass */
    override var controlDescription: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription = js.native
    /** Retrieves the identifier for the given numeric control. */
    /* CompleteClass */
    override var id: Double = js.native
    /** Retrieves a Boolean value that indicates whether the given numeric control is grouped with other, related controls. */
    /* CompleteClass */
    override var isGrouped: Boolean = js.native
    /** Retrieves, or sets, a scaled numeric-value for the given control. */
    /* CompleteClass */
    override var scaledValue: Double = js.native
    /** Retrieves the usage identifier for the given numeric control. */
    /* CompleteClass */
    override var usageId: Double = js.native
    /** Retrieves the usage page for the given numeric control. */
    /* CompleteClass */
    override var usagePage: Double = js.native
    /** Retrieves, or sets, the numeric value for a given control. */
    /* CompleteClass */
    override var value: Double = js.native
  }
  
  /** Describes a numeric control for a given HID device. */
  @js.native
  abstract class HidNumericControlDescription ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription {
    /** Retrieves a Boolean value which indicates whether the control supports a null, or out-of-range, value. */
    /* CompleteClass */
    override var hasNull: Boolean = js.native
    /** Retrieves the identifier for a given numeric control. */
    /* CompleteClass */
    override var id: Double = js.native
    /** Retrieves a Boolean value indicating whether the given control values are absolute or relative. */
    /* CompleteClass */
    override var isAbsolute: Boolean = js.native
    /** Retrieves the logical maximum value for the given control. */
    /* CompleteClass */
    override var logicalMaximum: Double = js.native
    /** Retrieves the logical minimum value for the control. */
    /* CompleteClass */
    override var logicalMinimum: Double = js.native
    /** Retrieves the parent collections for a given numeric control. */
    /* CompleteClass */
    override var parentCollections: IVectorView[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollection] = js.native
    /** Retrieves the physical maximum-value for the given control. */
    /* CompleteClass */
    override var physicalMaximum: Double = js.native
    /** Retrieves the physical minimum-value for the given control. */
    /* CompleteClass */
    override var physicalMinimum: Double = js.native
    /** Retrieves the number of reports associated with the given control. */
    /* CompleteClass */
    override var reportCount: Double = js.native
    /** Retrieves the identifier for the report associated with the given numeric control. */
    /* CompleteClass */
    override var reportId: Double = js.native
    /** Retrieves the size, in bytes, of the given numeric control. */
    /* CompleteClass */
    override var reportSize: Double = js.native
    /** Retrieves the type of report associated with the given numeric control. */
    /* CompleteClass */
    override var reportType: HidReportType = js.native
    /** Retrieves the unit associated with the given numeric control. */
    /* CompleteClass */
    override var unit: Double = js.native
    /** Retrieves the unit exponent for the given numeric control. */
    /* CompleteClass */
    override var unitExponent: Double = js.native
    /** Retrieves the usage identifier associated with the given numeric control. */
    /* CompleteClass */
    override var usageId: Double = js.native
    /** Retrieves the usage page associated with the given numeric control. */
    /* CompleteClass */
    override var usagePage: Double = js.native
  }
  
  /** Represents an output report. */
  @js.native
  abstract class HidOutputReport ()
    extends typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidOutputReport {
    /** Retrieves, or sets, the data associated with a given output report. */
    /* CompleteClass */
    override var data: IBuffer = js.native
    /* CompleteClass */
    override var getBooleanControl: js.Any = js.native
    /* CompleteClass */
    override var getNumericControl: js.Any = js.native
    /** Retrieves the identifier associated with a given output report. */
    /* CompleteClass */
    override var id: Double = js.native
     /* unmapped type */ /**
      * Retrieves the boolean control associated with the given controlDescription.
      * @param controlDescription Describes the Boolean control.
      * @return A HidBooleanControl object.
      */
    /* CompleteClass */
    override def getBooleanControlByDescription(
      controlDescription: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription
    ): typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControl = js.native
     /* unmapped type */ /**
      * Retrieves the numeric control associated with the given controlDescription.
      * @param controlDescription Describes the numeric control.
      * @return A HidNumericControl object.
      */
    /* CompleteClass */
    override def getNumericControlByDescription(
      controlDescription: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription
    ): typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControl = js.native
  }
  
  /** Identifies the relationship that defines a grouping of controls on the device. */
  @js.native
  object HidCollectionType extends js.Object {
    /* 1 */ val application: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.application with Double = js.native
    /* 2 */ val logical: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.logical with Double = js.native
    /* 4 */ val namedArray: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.namedArray with Double = js.native
    /* 7 */ val other: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.other with Double = js.native
    /* 0 */ val physical: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.physical with Double = js.native
    /* 3 */ val report: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.report with Double = js.native
    /* 6 */ val usageModifier: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.usageModifier with Double = js.native
    /* 5 */ val usageSwitch: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.usageSwitch with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object HidDevice extends js.Object {
    /**
      * Opens a handle to the device identified by the deviceId parameter. The acess type is specified by the accessMode parameter.
      * @param deviceId The DeviceInformation ID that identifies the HID device.
      * @param accessMode Specifies the access mode. The supported access modes are Read and ReadWrite.
      * @return A HidDevice object.
      */
    def fromIdAsync(deviceId: String, accessMode: FileAccessMode): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidDevice] = js.native
    /**
      * Retrieves an Advanced Query Syntax (AQS) string based on the given usagePage and usageId.
      * @param usagePage Specifies the usage page of the top-level collection for the given HID device.
      * @param usageId Specifies the usage identifier of the top-level collection for the given HID device.
      * @return An Advanced Query Syntax (AQS) string that represents a device selector.
      */
    def getDeviceSelector(usagePage: Double, usageId: Double): String = js.native
    /**
      * Retrieves an Advanced Query Syntax (AQS) string based on the given usagePage, usageId, vendorId, and productId.
      * @param usagePage Specifies the usage page of the top-level collection for the given HID device.
      * @param usageId Specifies the usage identifier of the top-level collection for the given HID device.
      * @param vendorId Identifies the device vendor.
      * @param productId Identifies the product.
      * @return An Advanced Query Syntax (AQS) string that represents a device selector.
      */
    def getDeviceSelector(usagePage: Double, usageId: Double, vendorId: Double, productId: Double): String = js.native
  }
  
  /** Specifies a HID report type. */
  @js.native
  object HidReportType extends js.Object {
    /* 2 */ val feature: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.feature with Double = js.native
    /* 0 */ val input: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.input with Double = js.native
    /* 1 */ val output: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.output with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType with Double] = js.native
  }
  
}

