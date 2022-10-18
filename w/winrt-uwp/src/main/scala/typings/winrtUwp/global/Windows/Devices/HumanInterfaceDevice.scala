package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType
import typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.FileAccessMode
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This namespace gives your Windows Store app access to devices that support the Human Interface Device (HID) protocol. */
object HumanInterfaceDevice {
  
  /** Represents a simple Boolean control on a HID device that returns on/off values. An example would be the LED light on a keyboard. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidBooleanControl")
  @js.native
  open class HidBooleanControl ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControl {
    
    /** Retrieves a description of the given Boolean control. */
    /* CompleteClass */
    var controlDescription: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription = js.native
    
    /** Retrieves the identifier for a given Boolean control. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Retrieves a Boolean value indicating whether the given Boolean control is active. */
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /** Retrieves the usage identifier associated with the given Boolean control. */
    /* CompleteClass */
    var usageId: Double = js.native
    
    /** Retrieves the usage page for a given Boolean control. */
    /* CompleteClass */
    var usagePage: Double = js.native
  }
  
  /** Describes a Boolean control for a given HID device. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription")
  @js.native
  open class HidBooleanControlDescription ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription {
    
    /** Retrieves the identifier for a given Boolean control. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Retrieves the parent collection for a given Boolean control. */
    /* CompleteClass */
    var parentCollections: IVectorView[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollection] = js.native
    
    /** Retrieves the identifier for the report associated with the given Boolean control. */
    /* CompleteClass */
    var reportId: Double = js.native
    
    /** Retrieves the report type for the report associated with the given Boolean control. */
    /* CompleteClass */
    var reportType: HidReportType = js.native
    
    /** Retrieves the usage identifier associated with the given Boolean control. */
    /* CompleteClass */
    var usageId: Double = js.native
    
    /** Retrieves the usage page associated with the given Boolean control. */
    /* CompleteClass */
    var usagePage: Double = js.native
  }
  
  /** Retrieves the collection information for a group of related controls. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidCollection")
  @js.native
  open class HidCollection ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollection {
    
    /** Retrieves the identifier for a collection of HID controls. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Retrieves the collection type. */
    /* CompleteClass */
    var `type`: HidCollectionType = js.native
    
    /** Retrieves the usage identifier for the given control collection. */
    /* CompleteClass */
    var usageId: Double = js.native
    
    /** Retrieves the usage page for the given control collection. */
    /* CompleteClass */
    var usagePage: Double = js.native
  }
  
  /** Identifies the relationship that defines a grouping of controls on the device. */
  @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidCollectionType")
  @js.native
  object HidCollectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType & Double] = js.native
    
    /* 1 */ val application: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.application & Double = js.native
    
    /* 2 */ val logical: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.logical & Double = js.native
    
    /* 4 */ val namedArray: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.namedArray & Double = js.native
    
    /* 7 */ val other: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.other & Double = js.native
    
    /* 0 */ val physical: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.physical & Double = js.native
    
    /* 3 */ val report: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.report & Double = js.native
    
    /* 6 */ val usageModifier: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.usageModifier & Double = js.native
    
    /* 5 */ val usageSwitch: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.usageSwitch & Double = js.native
  }
  
  /** Represents a top-level collection and the corresponding device. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidDevice")
  @js.native
  open class HidDevice ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidDevice
  object HidDevice {
    
    @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidDevice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Opens a handle to the device identified by the deviceId parameter. The acess type is specified by the accessMode parameter.
      * @param deviceId The DeviceInformation ID that identifies the HID device.
      * @param accessMode Specifies the access mode. The supported access modes are Read and ReadWrite.
      * @return A HidDevice object.
      */
    /* static member */
    inline def fromIdAsync(deviceId: String, accessMode: FileAccessMode): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidDevice] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any], accessMode.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidDevice]]
    
    /**
      * Retrieves an Advanced Query Syntax (AQS) string based on the given usagePage and usageId.
      * @param usagePage Specifies the usage page of the top-level collection for the given HID device.
      * @param usageId Specifies the usage identifier of the top-level collection for the given HID device.
      * @return An Advanced Query Syntax (AQS) string that represents a device selector.
      */
    /* static member */
    inline def getDeviceSelector(usagePage: Double, usageId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(usagePage.asInstanceOf[js.Any], usageId.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Retrieves an Advanced Query Syntax (AQS) string based on the given usagePage, usageId, vendorId, and productId.
      * @param usagePage Specifies the usage page of the top-level collection for the given HID device.
      * @param usageId Specifies the usage identifier of the top-level collection for the given HID device.
      * @param vendorId Identifies the device vendor.
      * @param productId Identifies the product.
      * @return An Advanced Query Syntax (AQS) string that represents a device selector.
      */
    /* static member */
    inline def getDeviceSelector(usagePage: Double, usageId: Double, vendorId: Double, productId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(usagePage.asInstanceOf[js.Any], usageId.asInstanceOf[js.Any], vendorId.asInstanceOf[js.Any], productId.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  /** Represents a feature report. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidFeatureReport")
  @js.native
  open class HidFeatureReport ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidFeatureReport {
    
    /** Retrieves, or sets, the data associated with a given feature report. */
    /* CompleteClass */
    var data: IBuffer = js.native
    
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
    
    /** Retrieves the identifier associated with a given feature report. */
    /* CompleteClass */
    var id: Double = js.native
  }
  
  /** Represents an input report. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidInputReport")
  @js.native
  open class HidInputReport ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidInputReport {
    
    /** Retrieves the currently activated Boolean controls for the given HID device. */
    /* CompleteClass */
    var activatedBooleanControls: IVectorView[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControl] = js.native
    
    /** Retrieves the data associated with a given input report. */
    /* CompleteClass */
    var data: IBuffer = js.native
    
    /* CompleteClass */
    var getBooleanControl: Any = js.native
    
    /* unmapped type */
    /**
      * Retrieves the Boolean control described by the controlDescription parameter and found in the given input report.
      * @param controlDescription A HidBooleanControlDescription object.
      * @return A HidBooleanControl object.
      */
    /* CompleteClass */
    override def getBooleanControlByDescription(
      controlDescription: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription
    ): typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControl = js.native
    
    /* CompleteClass */
    var getNumericControl: Any = js.native
    
    /* unmapped type */
    /**
      * Retrieves the numeric control described by the controlDescription parameter and found in the given input report.
      * @param controlDescription A HidNumericControlDescription object.
      * @return A HidNumericControl object.
      */
    /* CompleteClass */
    override def getNumericControlByDescription(
      controlDescription: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription
    ): typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControl = js.native
    
    /** Retrieves the identifier associated with a given input report. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Retrieves the recently transitioned Boolean controls for the given HID device. */
    /* CompleteClass */
    var transitionedBooleanControls: IVectorView[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControl] = js.native
  }
  
  /** Represents the arguments which the HID API sends as part of an input-report event. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidInputReportReceivedEventArgs")
  @js.native
  open class HidInputReportReceivedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidInputReportReceivedEventArgs {
    
    /** Retrieves the input report. */
    /* CompleteClass */
    var report: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidInputReport = js.native
  }
  
  /** Represents a numeric control on a HID device that returns a range of values. An example would be the volume control on a speaker. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidNumericControl")
  @js.native
  open class HidNumericControl ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControl {
    
    /** Retrieves a control description for the given numeric control. */
    /* CompleteClass */
    var controlDescription: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription = js.native
    
    /** Retrieves the identifier for the given numeric control. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Retrieves a Boolean value that indicates whether the given numeric control is grouped with other, related controls. */
    /* CompleteClass */
    var isGrouped: Boolean = js.native
    
    /** Retrieves, or sets, a scaled numeric-value for the given control. */
    /* CompleteClass */
    var scaledValue: Double = js.native
    
    /** Retrieves the usage identifier for the given numeric control. */
    /* CompleteClass */
    var usageId: Double = js.native
    
    /** Retrieves the usage page for the given numeric control. */
    /* CompleteClass */
    var usagePage: Double = js.native
    
    /** Retrieves, or sets, the numeric value for a given control. */
    /* CompleteClass */
    var value: Double = js.native
  }
  
  /** Describes a numeric control for a given HID device. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription")
  @js.native
  open class HidNumericControlDescription ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription {
    
    /** Retrieves a Boolean value which indicates whether the control supports a null, or out-of-range, value. */
    /* CompleteClass */
    var hasNull: Boolean = js.native
    
    /** Retrieves the identifier for a given numeric control. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Retrieves a Boolean value indicating whether the given control values are absolute or relative. */
    /* CompleteClass */
    var isAbsolute: Boolean = js.native
    
    /** Retrieves the logical maximum value for the given control. */
    /* CompleteClass */
    var logicalMaximum: Double = js.native
    
    /** Retrieves the logical minimum value for the control. */
    /* CompleteClass */
    var logicalMinimum: Double = js.native
    
    /** Retrieves the parent collections for a given numeric control. */
    /* CompleteClass */
    var parentCollections: IVectorView[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollection] = js.native
    
    /** Retrieves the physical maximum-value for the given control. */
    /* CompleteClass */
    var physicalMaximum: Double = js.native
    
    /** Retrieves the physical minimum-value for the given control. */
    /* CompleteClass */
    var physicalMinimum: Double = js.native
    
    /** Retrieves the number of reports associated with the given control. */
    /* CompleteClass */
    var reportCount: Double = js.native
    
    /** Retrieves the identifier for the report associated with the given numeric control. */
    /* CompleteClass */
    var reportId: Double = js.native
    
    /** Retrieves the size, in bytes, of the given numeric control. */
    /* CompleteClass */
    var reportSize: Double = js.native
    
    /** Retrieves the type of report associated with the given numeric control. */
    /* CompleteClass */
    var reportType: HidReportType = js.native
    
    /** Retrieves the unit associated with the given numeric control. */
    /* CompleteClass */
    var unit: Double = js.native
    
    /** Retrieves the unit exponent for the given numeric control. */
    /* CompleteClass */
    var unitExponent: Double = js.native
    
    /** Retrieves the usage identifier associated with the given numeric control. */
    /* CompleteClass */
    var usageId: Double = js.native
    
    /** Retrieves the usage page associated with the given numeric control. */
    /* CompleteClass */
    var usagePage: Double = js.native
  }
  
  /** Represents an output report. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidOutputReport")
  @js.native
  open class HidOutputReport ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidOutputReport {
    
    /** Retrieves, or sets, the data associated with a given output report. */
    /* CompleteClass */
    var data: IBuffer = js.native
    
    /* CompleteClass */
    var getBooleanControl: Any = js.native
    
    /* unmapped type */
    /**
      * Retrieves the boolean control associated with the given controlDescription.
      * @param controlDescription Describes the Boolean control.
      * @return A HidBooleanControl object.
      */
    /* CompleteClass */
    override def getBooleanControlByDescription(
      controlDescription: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription
    ): typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControl = js.native
    
    /* CompleteClass */
    var getNumericControl: Any = js.native
    
    /* unmapped type */
    /**
      * Retrieves the numeric control associated with the given controlDescription.
      * @param controlDescription Describes the numeric control.
      * @return A HidNumericControl object.
      */
    /* CompleteClass */
    override def getNumericControlByDescription(
      controlDescription: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription
    ): typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControl = js.native
    
    /** Retrieves the identifier associated with a given output report. */
    /* CompleteClass */
    var id: Double = js.native
  }
  
  /** Specifies a HID report type. */
  @JSGlobal("Windows.Devices.HumanInterfaceDevice.HidReportType")
  @js.native
  object HidReportType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType & Double] = js.native
    
    /* 2 */ val feature: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.feature & Double = js.native
    
    /* 0 */ val input: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.input & Double = js.native
    
    /* 1 */ val output: typings.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.output & Double = js.native
  }
}
