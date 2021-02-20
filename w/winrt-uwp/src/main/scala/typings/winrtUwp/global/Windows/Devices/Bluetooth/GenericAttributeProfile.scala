package typings.winrtUwp.global.Windows.Devices.Bluetooth

import typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.notify
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Devices.Bluetooth.GenericAttributeProfile namespace defines Windows Runtime classes that a Windows Store apps and desktop applications can use to communicate with Bluetooth LE devices. For more information, see Bluetooth. */
object GenericAttributeProfile {
  
  /** Represents a Characteristic of a GATT service. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic")
  @js.native
  abstract class GattCharacteristic ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
  object GattCharacteristic {
    
    /**
      * Converts a Bluetooth SIG defined short Id to a full GATT UUID.
      * @param shortId A 16-bit Bluetooth GATT Service UUID.
      * @return The corresponding 128-bit GATT Characteristic UUID, that uniquely identifies this characteristic.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic.convertShortIdToUuid")
    @js.native
    def convertShortIdToUuid(shortId: Double): String = js.native
  }
  
  /** Specifies the values for the GATT characteristic properties as well as the GATT Extended Characteristic Properties Descriptor. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties")
  @js.native
  object GattCharacteristicProperties extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties with Double
      ] = js.native
    
    /* 7 */ val authenticatedSignedWrites: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.authenticatedSignedWrites with Double = js.native
    
    /* 1 */ val broadcast: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.broadcast with Double = js.native
    
    /* 8 */ val extendedProperties: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.extendedProperties with Double = js.native
    
    /* 6 */ val indicate: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.indicate with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.none with Double = js.native
    
    /* 5 */ @JSName("notify")
    val notify_ : notify with Double = js.native
    
    /* 2 */ val read: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.read with Double = js.native
    
    /* 9 */ val reliableWrites: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.reliableWrites with Double = js.native
    
    /* 10 */ val writableAuxiliaries: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.writableAuxiliaries with Double = js.native
    
    /* 4 */ val write: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.write with Double = js.native
    
    /* 3 */ val writeWithoutResponse: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.writeWithoutResponse with Double = js.native
  }
  
  /** Represents an enumeration of the most well known Characteristic UUID values, and provides convenience methods for working with GATT characteristic UUIDs, and static properties providing characteristic UUIDs for common GATT characteristics. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids")
  @js.native
  abstract class GattCharacteristicUuids ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids
  object GattCharacteristicUuids {
    
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the Bluetooth SIG-defined AlertCategoryId characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.alertCategoryId")
    @js.native
    def alertCategoryId: String = js.native
    
    /** Gets the Bluetooth SIG-Defined AlertCategoryIdBitMask characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.alertCategoryIdBitMask")
    @js.native
    def alertCategoryIdBitMask: String = js.native
    @scala.inline
    def alertCategoryIdBitMask_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alertCategoryIdBitMask")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def alertCategoryId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alertCategoryId")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined AlertLevel characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.alertLevel")
    @js.native
    def alertLevel: String = js.native
    @scala.inline
    def alertLevel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alertLevel")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined AlertNotificationControlPoint characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.alertNotificationControlPoint")
    @js.native
    def alertNotificationControlPoint: String = js.native
    @scala.inline
    def alertNotificationControlPoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alertNotificationControlPoint")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined AlertStatus characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.alertStatus")
    @js.native
    def alertStatus: String = js.native
    @scala.inline
    def alertStatus_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alertStatus")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Battery Level Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.batteryLevel")
    @js.native
    def batteryLevel: String = js.native
    @scala.inline
    def batteryLevel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("batteryLevel")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Blood Pressure Feature Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.bloodPressureFeature")
    @js.native
    def bloodPressureFeature: String = js.native
    @scala.inline
    def bloodPressureFeature_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bloodPressureFeature")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Blood Pressure Measurement Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.bloodPressureMeasurement")
    @js.native
    def bloodPressureMeasurement: String = js.native
    @scala.inline
    def bloodPressureMeasurement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bloodPressureMeasurement")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Body Sensor Location Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.bodySensorLocation")
    @js.native
    def bodySensorLocation: String = js.native
    @scala.inline
    def bodySensorLocation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bodySensorLocation")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined BootKeyboardInputReport characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.bootKeyboardInputReport")
    @js.native
    def bootKeyboardInputReport: String = js.native
    @scala.inline
    def bootKeyboardInputReport_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bootKeyboardInputReport")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined BootKeyboardOutputReport characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.bootKeyboardOutputReport")
    @js.native
    def bootKeyboardOutputReport: String = js.native
    @scala.inline
    def bootKeyboardOutputReport_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bootKeyboardOutputReport")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined BootMouseInputReport characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.bootMouseInputReport")
    @js.native
    def bootMouseInputReport: String = js.native
    @scala.inline
    def bootMouseInputReport_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bootMouseInputReport")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Csc Feature Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.cscFeature")
    @js.native
    def cscFeature: String = js.native
    @scala.inline
    def cscFeature_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cscFeature")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Csc Measurement Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.cscMeasurement")
    @js.native
    def cscMeasurement: String = js.native
    @scala.inline
    def cscMeasurement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cscMeasurement")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined CurrentTime characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.currentTime")
    @js.native
    def currentTime: String = js.native
    @scala.inline
    def currentTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined CyclingPowerControlPoint characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.cyclingPowerControlPoint")
    @js.native
    def cyclingPowerControlPoint: String = js.native
    @scala.inline
    def cyclingPowerControlPoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cyclingPowerControlPoint")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined CyclingPowerFeature characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.cyclingPowerFeature")
    @js.native
    def cyclingPowerFeature: String = js.native
    @scala.inline
    def cyclingPowerFeature_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cyclingPowerFeature")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined CyclingPowerMeasurement characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.cyclingPowerMeasurement")
    @js.native
    def cyclingPowerMeasurement: String = js.native
    @scala.inline
    def cyclingPowerMeasurement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cyclingPowerMeasurement")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined CyclingPowerVector characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.cyclingPowerVector")
    @js.native
    def cyclingPowerVector: String = js.native
    @scala.inline
    def cyclingPowerVector_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cyclingPowerVector")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined DateTime characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.dateTime")
    @js.native
    def dateTime: String = js.native
    @scala.inline
    def dateTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined DayDateTime characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.dayDateTime")
    @js.native
    def dayDateTime: String = js.native
    @scala.inline
    def dayDateTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayDateTime")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined DayOfWeek characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.dayOfWeek")
    @js.native
    def dayOfWeek: String = js.native
    @scala.inline
    def dayOfWeek_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeek")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined DstOffset characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.dstOffset")
    @js.native
    def dstOffset: String = js.native
    @scala.inline
    def dstOffset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dstOffset")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined ExactTime256 characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.exactTime256")
    @js.native
    def exactTime256: String = js.native
    @scala.inline
    def exactTime256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exactTime256")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined FirmwareRevisionString characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.firmwareRevisionString")
    @js.native
    def firmwareRevisionString: String = js.native
    @scala.inline
    def firmwareRevisionString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firmwareRevisionString")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined GapAppearance characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.gapAppearance")
    @js.native
    def gapAppearance: String = js.native
    @scala.inline
    def gapAppearance_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gapAppearance")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined GapDeviceName characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.gapDeviceName")
    @js.native
    def gapDeviceName: String = js.native
    @scala.inline
    def gapDeviceName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gapDeviceName")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined GapPeripheralPreferredConnectionParameters characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.gapPeripheralPreferredConnectionParameters")
    @js.native
    def gapPeripheralPreferredConnectionParameters: String = js.native
    @scala.inline
    def gapPeripheralPreferredConnectionParameters_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gapPeripheralPreferredConnectionParameters")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth GapPeripheralPrivacyFlag characterisitc UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.gapPeripheralPrivacyFlag")
    @js.native
    def gapPeripheralPrivacyFlag: String = js.native
    @scala.inline
    def gapPeripheralPrivacyFlag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gapPeripheralPrivacyFlag")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined GapReconnectionAddress characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.gapReconnectionAddress")
    @js.native
    def gapReconnectionAddress: String = js.native
    @scala.inline
    def gapReconnectionAddress_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gapReconnectionAddress")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined GattServiceChanged characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.gattServiceChanged")
    @js.native
    def gattServiceChanged: String = js.native
    @scala.inline
    def gattServiceChanged_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gattServiceChanged")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Glucose Feature Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.glucoseFeature")
    @js.native
    def glucoseFeature: String = js.native
    @scala.inline
    def glucoseFeature_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("glucoseFeature")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Glucose Measurement Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.glucoseMeasurement")
    @js.native
    def glucoseMeasurement: String = js.native
    
    /** Gets the Bluetooth SIG-defined Glucose Measurement Context Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.glucoseMeasurementContext")
    @js.native
    def glucoseMeasurementContext: String = js.native
    @scala.inline
    def glucoseMeasurementContext_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("glucoseMeasurementContext")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def glucoseMeasurement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("glucoseMeasurement")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined HardwareRevisionString characterisitc UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.hardwareRevisionString")
    @js.native
    def hardwareRevisionString: String = js.native
    @scala.inline
    def hardwareRevisionString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hardwareRevisionString")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Heart Rate Control Point Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.heartRateControlPoint")
    @js.native
    def heartRateControlPoint: String = js.native
    @scala.inline
    def heartRateControlPoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heartRateControlPoint")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Heart Rate Measurement Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.heartRateMeasurement")
    @js.native
    def heartRateMeasurement: String = js.native
    @scala.inline
    def heartRateMeasurement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heartRateMeasurement")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined HidControlPoint characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.hidControlPoint")
    @js.native
    def hidControlPoint: String = js.native
    @scala.inline
    def hidControlPoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hidControlPoint")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined HidInformation characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.hidInformation")
    @js.native
    def hidInformation: String = js.native
    @scala.inline
    def hidInformation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hidInformation")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Ieee1107320601RegulatoryCertificationDataList characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.ieee1107320601RegulatoryCertificationDataList")
    @js.native
    def ieee1107320601RegulatoryCertificationDataList: String = js.native
    @scala.inline
    def ieee1107320601RegulatoryCertificationDataList_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ieee1107320601RegulatoryCertificationDataList")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Intermediate Cuff Pressure Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.intermediateCuffPressure")
    @js.native
    def intermediateCuffPressure: String = js.native
    @scala.inline
    def intermediateCuffPressure_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intermediateCuffPressure")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Intermediate Temperature Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.intermediateTemperature")
    @js.native
    def intermediateTemperature: String = js.native
    @scala.inline
    def intermediateTemperature_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intermediateTemperature")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined LnControlPoint characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.lnControlPoint")
    @js.native
    def lnControlPoint: String = js.native
    @scala.inline
    def lnControlPoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lnControlPoint")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined LnFeature characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.lnFeature")
    @js.native
    def lnFeature: String = js.native
    @scala.inline
    def lnFeature_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lnFeature")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined LocalTimeInformation characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.localTimeInformation")
    @js.native
    def localTimeInformation: String = js.native
    @scala.inline
    def localTimeInformation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localTimeInformation")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined LocationAndSpeed characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.locationAndSpeed")
    @js.native
    def locationAndSpeed: String = js.native
    @scala.inline
    def locationAndSpeed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locationAndSpeed")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined ManufacturerNameString characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.manufacturerNameString")
    @js.native
    def manufacturerNameString: String = js.native
    @scala.inline
    def manufacturerNameString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("manufacturerNameString")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Measurement Interval Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.measurementInterval")
    @js.native
    def measurementInterval: String = js.native
    @scala.inline
    def measurementInterval_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("measurementInterval")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined ModelNumberString UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.modelNumberString")
    @js.native
    def modelNumberString: String = js.native
    @scala.inline
    def modelNumberString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modelNumberString")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Navigation characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.navigation")
    @js.native
    def navigation: String = js.native
    @scala.inline
    def navigation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigation")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined NewAlert characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.newAlert")
    @js.native
    def newAlert: String = js.native
    @scala.inline
    def newAlert_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newAlert")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined PnpId characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.pnpId")
    @js.native
    def pnpId: String = js.native
    @scala.inline
    def pnpId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pnpId")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined PositionQuality characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.positionQuality")
    @js.native
    def positionQuality: String = js.native
    @scala.inline
    def positionQuality_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positionQuality")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined ProtocolMode characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.protocolMode")
    @js.native
    def protocolMode: String = js.native
    @scala.inline
    def protocolMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protocolMode")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Record Access Control Point Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.recordAccessControlPoint")
    @js.native
    def recordAccessControlPoint: String = js.native
    @scala.inline
    def recordAccessControlPoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recordAccessControlPoint")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined ReferenceTimeInformation characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.referenceTimeInformation")
    @js.native
    def referenceTimeInformation: String = js.native
    @scala.inline
    def referenceTimeInformation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("referenceTimeInformation")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Report characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.report")
    @js.native
    def report: String = js.native
    
    /** Gets the Bluetooth SIG-defined ReportMap characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.reportMap")
    @js.native
    def reportMap: String = js.native
    @scala.inline
    def reportMap_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reportMap")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def report_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("report")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined RingerControlPoint characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.ringerControlPoint")
    @js.native
    def ringerControlPoint: String = js.native
    @scala.inline
    def ringerControlPoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ringerControlPoint")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined RingerSetting characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.ringerSetting")
    @js.native
    def ringerSetting: String = js.native
    @scala.inline
    def ringerSetting_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ringerSetting")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Rsc Feature Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.rscFeature")
    @js.native
    def rscFeature: String = js.native
    @scala.inline
    def rscFeature_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rscFeature")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Rsc Measurement Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.rscMeasurement")
    @js.native
    def rscMeasurement: String = js.native
    @scala.inline
    def rscMeasurement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rscMeasurement")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined SC Control Point Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.scControlPoint")
    @js.native
    def scControlPoint: String = js.native
    @scala.inline
    def scControlPoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scControlPoint")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined ScanIntervalWindow characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.scanIntervalWindow")
    @js.native
    def scanIntervalWindow: String = js.native
    @scala.inline
    def scanIntervalWindow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scanIntervalWindow")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined ScanRefresh characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.scanRefresh")
    @js.native
    def scanRefresh: String = js.native
    @scala.inline
    def scanRefresh_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scanRefresh")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Sensor Location Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.sensorLocation")
    @js.native
    def sensorLocation: String = js.native
    @scala.inline
    def sensorLocation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sensorLocation")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined SerialNumberString characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.serialNumberString")
    @js.native
    def serialNumberString: String = js.native
    @scala.inline
    def serialNumberString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialNumberString")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined SoftwareRevisionString characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.softwareRevisionString")
    @js.native
    def softwareRevisionString: String = js.native
    @scala.inline
    def softwareRevisionString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("softwareRevisionString")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined SupportUnreadAlertCategory characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.supportUnreadAlertCategory")
    @js.native
    def supportUnreadAlertCategory: String = js.native
    @scala.inline
    def supportUnreadAlertCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportUnreadAlertCategory")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined SupportedNewAlertCategory characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.supportedNewAlertCategory")
    @js.native
    def supportedNewAlertCategory: String = js.native
    @scala.inline
    def supportedNewAlertCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedNewAlertCategory")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined SystemId characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.systemId")
    @js.native
    def systemId: String = js.native
    @scala.inline
    def systemId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("systemId")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Temperature Measurement Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.temperatureMeasurement")
    @js.native
    def temperatureMeasurement: String = js.native
    @scala.inline
    def temperatureMeasurement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("temperatureMeasurement")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Temperature Type Characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.temperatureType")
    @js.native
    def temperatureType: String = js.native
    @scala.inline
    def temperatureType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("temperatureType")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined TimeAccuracy characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.timeAccuracy")
    @js.native
    def timeAccuracy: String = js.native
    @scala.inline
    def timeAccuracy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeAccuracy")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined TimeSource characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.timeSource")
    @js.native
    def timeSource: String = js.native
    @scala.inline
    def timeSource_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeSource")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined TimeUpdateControlPoint characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.timeUpdateControlPoint")
    @js.native
    def timeUpdateControlPoint: String = js.native
    @scala.inline
    def timeUpdateControlPoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeUpdateControlPoint")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined TimeUpdateState characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.timeUpdateState")
    @js.native
    def timeUpdateState: String = js.native
    @scala.inline
    def timeUpdateState_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeUpdateState")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined TimeWithDst characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.timeWithDst")
    @js.native
    def timeWithDst: String = js.native
    @scala.inline
    def timeWithDst_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeWithDst")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined TimeZone characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.timeZone")
    @js.native
    def timeZone: String = js.native
    @scala.inline
    def timeZone_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined TxPowerLevel characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.txPowerLevel")
    @js.native
    def txPowerLevel: String = js.native
    @scala.inline
    def txPowerLevel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("txPowerLevel")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined UnreadAlertStatus characteristic UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids.unreadAlertStatus")
    @js.native
    def unreadAlertStatus: String = js.native
    @scala.inline
    def unreadAlertStatus_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unreadAlertStatus")(x.asInstanceOf[js.Any])
  }
  
  /** Represents the value of the GATT ClientCharacteristicConfigurationDescriptor. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue")
  @js.native
  object GattClientCharacteristicConfigurationDescriptorValue extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue with Double
      ] = js.native
    
    /* 2 */ val indicate: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue.indicate with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue.none with Double = js.native
    
    /* 1 */ @JSName("notify")
    val notify_ : typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue.notify with Double = js.native
  }
  
  /** Represents the return status of a WinRT GATT API related Async operation. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCommunicationStatus")
  @js.native
  object GattCommunicationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCommunicationStatus with Double
      ] = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCommunicationStatus.success with Double = js.native
    
    /* 1 */ val unreachable: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCommunicationStatus.unreachable with Double = js.native
  }
  
  /** Represents a Descriptor of a GATT Characteristic. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptor")
  @js.native
  abstract class GattDescriptor ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptor
  object GattDescriptor {
    
    /**
      * Converts a Bluetooth SIG defined short Id to a full GATT UUID.
      * @param shortId A 16-bit Bluetooth GATT Descriptor UUID.
      * @return The corresponding 128-bit GATT Descriptor UUID, that uniquely identifies this descriptor.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptor.convertShortIdToUuid")
    @js.native
    def convertShortIdToUuid(shortId: Double): String = js.native
  }
  
  /** Represents an enumeration of the most well known Descriptor UUID values, and provides convenience methods for working with GATT descriptor UUIDs, and static properties providing descriptor UUIDs for common GATT descriptors. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptorUuids")
  @js.native
  abstract class GattDescriptorUuids ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptorUuids
  object GattDescriptorUuids {
    
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptorUuids")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the Bluetooth SIG-defined Characteristic Aggregate Format Descriptor UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptorUuids.characteristicAggregateFormat")
    @js.native
    def characteristicAggregateFormat: String = js.native
    @scala.inline
    def characteristicAggregateFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("characteristicAggregateFormat")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Characteristic Extended Properties Descriptor UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptorUuids.characteristicExtendedProperties")
    @js.native
    def characteristicExtendedProperties: String = js.native
    @scala.inline
    def characteristicExtendedProperties_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("characteristicExtendedProperties")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Characteristic Presentation Format Descriptor UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptorUuids.characteristicPresentationFormat")
    @js.native
    def characteristicPresentationFormat: String = js.native
    @scala.inline
    def characteristicPresentationFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("characteristicPresentationFormat")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Characteristic User Description Descriptor UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptorUuids.characteristicUserDescription")
    @js.native
    def characteristicUserDescription: String = js.native
    @scala.inline
    def characteristicUserDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("characteristicUserDescription")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Client Characteristic Configuration Descriptor UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptorUuids.clientCharacteristicConfiguration")
    @js.native
    def clientCharacteristicConfiguration: String = js.native
    @scala.inline
    def clientCharacteristicConfiguration_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientCharacteristicConfiguration")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Server Characteristic Configuration Descriptor UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptorUuids.serverCharacteristicConfiguration")
    @js.native
    def serverCharacteristicConfiguration: String = js.native
    @scala.inline
    def serverCharacteristicConfiguration_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverCharacteristicConfiguration")(x.asInstanceOf[js.Any])
  }
  
  /** Represents a GATT Primary Service on a Bluetooth device. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService")
  @js.native
  abstract class GattDeviceService ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService
  object GattDeviceService {
    
    /**
      * Converts a Bluetooth SIG defined short Id to a full GATT UUID.
      * @param shortId A 16-bit Bluetooth GATT Service UUID.
      * @return The corresponding 128-bit GATT Service UUID, that uniquely identifies this service.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService.convertShortIdToUuid")
    @js.native
    def convertShortIdToUuid(shortId: Double): String = js.native
    
    /**
      * Instantiates a new GattDeviceService from the device ID.
      * @param deviceId The GATT device ID.
      * @return The object for managing the asynchronous operation, which, upon completion, returns the newly instantiated GattDeviceService.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService.fromIdAsync")
    @js.native
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[
        typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService
      ] = js.native
    
    /**
      * Creates a suitable AQS Filter string for use with the CreateWatcher method, from a 16-bit Bluetooth GATT Service UUID.
      * @param serviceShortId A 16-bit Bluetooth GATT Service UUID.
      * @return A suitable AQS Selector String which can be passed as a parameter to the CreateWatcher method, in order to retrieve a GATT service instance path
      */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService.getDeviceSelectorFromShortId")
    @js.native
    def getDeviceSelectorFromShortId(serviceShortId: Double): String = js.native
    
    /**
      * Creates a suitable AQS Filter string for use with the CreateWatcher method, from a Bluetooth service UUID.
      * @param serviceUuid A 128-bit Bluetooth GATT Service UUID, represented as a standard GUID object.
      * @return A suitable AQS Selector String which can be passed as a parameter to the CreateWatcher method, in order to retrieve a GATT service instance path.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService.getDeviceSelectorFromUuid")
    @js.native
    def getDeviceSelectorFromUuid(serviceUuid: String): String = js.native
  }
  
  /** Represents the value of a single Presentation Format GATT Descriptor. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormat")
  @js.native
  abstract class GattPresentationFormat ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormat
  object GattPresentationFormat {
    
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the value of the Bluetooth SIG Assigned Numbers Namespace. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormat.bluetoothSigAssignedNumbers")
    @js.native
    def bluetoothSigAssignedNumbers: Double = js.native
    @scala.inline
    def bluetoothSigAssignedNumbers_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bluetoothSigAssignedNumbers")(x.asInstanceOf[js.Any])
  }
  
  /** Represents the different well-known values that the GattPresentationFormat.FormatType property can take. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes")
  @js.native
  abstract class GattPresentationFormatTypes ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes
  object GattPresentationFormatTypes {
    
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the value of the Bit2 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.bit2")
    @js.native
    def bit2: Double = js.native
    @scala.inline
    def bit2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bit2")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the Boolean Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.boolean")
    @js.native
    def boolean: Double = js.native
    @scala.inline
    def boolean_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boolean")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the DUInt16 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.duInt16")
    @js.native
    def duInt16: Double = js.native
    @scala.inline
    def duInt16_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("duInt16")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the Float Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.float")
    @js.native
    def float: Double = js.native
    
    /** Gets the value of the Float32 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.float32")
    @js.native
    def float32: Double = js.native
    @scala.inline
    def float32_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float32")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the Float64 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.float64")
    @js.native
    def float64: Double = js.native
    @scala.inline
    def float64_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float64")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def float_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the Nibble Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.nibble")
    @js.native
    def nibble: Double = js.native
    @scala.inline
    def nibble_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nibble")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the SFloat Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.sfloat")
    @js.native
    def sfloat: Double = js.native
    @scala.inline
    def sfloat_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sfloat")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the SInt12 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.sint12")
    @js.native
    def sint12: Double = js.native
    
    /** Gets the value of the SInt128 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.sint128")
    @js.native
    def sint128: Double = js.native
    @scala.inline
    def sint128_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sint128")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def sint12_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sint12")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the SInt16 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.sint16")
    @js.native
    def sint16: Double = js.native
    @scala.inline
    def sint16_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sint16")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the SInt24 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.sint24")
    @js.native
    def sint24: Double = js.native
    @scala.inline
    def sint24_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sint24")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the SInt32 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.sint32")
    @js.native
    def sint32: Double = js.native
    @scala.inline
    def sint32_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sint32")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the SInt48 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.sint48")
    @js.native
    def sint48: Double = js.native
    @scala.inline
    def sint48_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sint48")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the SInt64 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.sint64")
    @js.native
    def sint64: Double = js.native
    @scala.inline
    def sint64_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sint64")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the SInt8 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.sint8")
    @js.native
    def sint8: Double = js.native
    @scala.inline
    def sint8_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sint8")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the Struct Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.struct")
    @js.native
    def struct: Double = js.native
    @scala.inline
    def struct_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("struct")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the UInt12 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.uint12")
    @js.native
    def uint12: Double = js.native
    
    /** Gets the value of the UInt128 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.uint128")
    @js.native
    def uint128: Double = js.native
    @scala.inline
    def uint128_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint128")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def uint12_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint12")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the UInt16 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.uint16")
    @js.native
    def uint16: Double = js.native
    @scala.inline
    def uint16_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint16")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the UInt24 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.uint24")
    @js.native
    def uint24: Double = js.native
    @scala.inline
    def uint24_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint24")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the UInt32 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.uint32")
    @js.native
    def uint32: Double = js.native
    @scala.inline
    def uint32_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint32")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the UInt48 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.uint48")
    @js.native
    def uint48: Double = js.native
    @scala.inline
    def uint48_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint48")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the UInt64 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.uint64")
    @js.native
    def uint64: Double = js.native
    @scala.inline
    def uint64_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint64")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the UInt8 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.uint8")
    @js.native
    def uint8: Double = js.native
    @scala.inline
    def uint8_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint8")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the Utf16 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.utf16")
    @js.native
    def utf16: Double = js.native
    @scala.inline
    def utf16_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utf16")(x.asInstanceOf[js.Any])
    
    /** Gets the value of the Utf8 Format Type. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes.utf8")
    @js.native
    def utf8: Double = js.native
    @scala.inline
    def utf8_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utf8")(x.asInstanceOf[js.Any])
  }
  
  /** Represents the desired security level. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel")
  @js.native
  object GattProtectionLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel with Double
      ] = js.native
    
    /* 1 */ val authenticationRequired: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel.authenticationRequired with Double = js.native
    
    /* 3 */ val encryptionAndAuthenticationRequired: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel.encryptionAndAuthenticationRequired with Double = js.native
    
    /* 2 */ val encryptionRequired: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel.encryptionRequired with Double = js.native
    
    /* 0 */ val plain: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel.plain with Double = js.native
  }
  
  /** Represents the result of reading a GATT Client CharacteristicConfigurationClientDescriptor value. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadClientCharacteristicConfigurationDescriptorResult")
  @js.native
  abstract class GattReadClientCharacteristicConfigurationDescriptorResult ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadClientCharacteristicConfigurationDescriptorResult
  
  /** Represents the result of an asynchronous read operation of a GATT Characteristic or Descriptor value. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadResult")
  @js.native
  abstract class GattReadResult ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadResult
  
  /** Performs GATT reliable writes on the Bluetooth LE device, in the form of a transaction write operation. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattReliableWriteTransaction")
  @js.native
  /** Creates a new GattReliableWriteTransaction object. */
  class GattReliableWriteTransaction ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattReliableWriteTransaction
  
  /** Represents an enumeration of the most well known Service UUID values, and provides convenience methods for working with GATT service UUIDs, and static properties providing service UUIDs for common GATT services. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids")
  @js.native
  abstract class GattServiceUuids ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids
  object GattServiceUuids {
    
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the Bluetooth SIG-defined AlertNotification Service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.alertNotification")
    @js.native
    def alertNotification: String = js.native
    @scala.inline
    def alertNotification_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alertNotification")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Battery Service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.battery")
    @js.native
    def battery: String = js.native
    @scala.inline
    def battery_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("battery")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Blood Pressure Service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.bloodPressure")
    @js.native
    def bloodPressure: String = js.native
    @scala.inline
    def bloodPressure_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bloodPressure")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined CurrentTime service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.currentTime")
    @js.native
    def currentTime: String = js.native
    @scala.inline
    def currentTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined CyclingPower service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.cyclingPower")
    @js.native
    def cyclingPower: String = js.native
    @scala.inline
    def cyclingPower_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cyclingPower")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Cycling Speed And Cadence Service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.cyclingSpeedAndCadence")
    @js.native
    def cyclingSpeedAndCadence: String = js.native
    @scala.inline
    def cyclingSpeedAndCadence_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cyclingSpeedAndCadence")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined DeviceInformation service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.deviceInformation")
    @js.native
    def deviceInformation: String = js.native
    @scala.inline
    def deviceInformation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deviceInformation")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined UUID for the Generic Access Service. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.genericAccess")
    @js.native
    def genericAccess: String = js.native
    @scala.inline
    def genericAccess_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("genericAccess")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined UUID for the Generic Attribute Service. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.genericAttribute")
    @js.native
    def genericAttribute: String = js.native
    @scala.inline
    def genericAttribute_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("genericAttribute")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Glucose Service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.glucose")
    @js.native
    def glucose: String = js.native
    @scala.inline
    def glucose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("glucose")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Health Thermometer Service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.healthThermometer")
    @js.native
    def healthThermometer: String = js.native
    @scala.inline
    def healthThermometer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("healthThermometer")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Heart Rate Service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.heartRate")
    @js.native
    def heartRate: String = js.native
    @scala.inline
    def heartRate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heartRate")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined HumanInterfaceDevice service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.humanInterfaceDevice")
    @js.native
    def humanInterfaceDevice: String = js.native
    @scala.inline
    def humanInterfaceDevice_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("humanInterfaceDevice")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined ImmediateAlert service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.immediateAlert")
    @js.native
    def immediateAlert: String = js.native
    @scala.inline
    def immediateAlert_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("immediateAlert")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined LinkLoss service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.linkLoss")
    @js.native
    def linkLoss: String = js.native
    @scala.inline
    def linkLoss_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkLoss")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined LocationAndNavigation service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.locationAndNavigation")
    @js.native
    def locationAndNavigation: String = js.native
    @scala.inline
    def locationAndNavigation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locationAndNavigation")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined NextDstChange service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.nextDstChange")
    @js.native
    def nextDstChange: String = js.native
    @scala.inline
    def nextDstChange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextDstChange")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined PhoneAlertStatus service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.phoneAlertStatus")
    @js.native
    def phoneAlertStatus: String = js.native
    @scala.inline
    def phoneAlertStatus_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneAlertStatus")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined ReferenceTimeUpdate service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.referenceTimeUpdate")
    @js.native
    def referenceTimeUpdate: String = js.native
    @scala.inline
    def referenceTimeUpdate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("referenceTimeUpdate")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined Running Speed And Cadence Service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.runningSpeedAndCadence")
    @js.native
    def runningSpeedAndCadence: String = js.native
    @scala.inline
    def runningSpeedAndCadence_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runningSpeedAndCadence")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined ScanParameters service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.scanParameters")
    @js.native
    def scanParameters: String = js.native
    @scala.inline
    def scanParameters_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scanParameters")(x.asInstanceOf[js.Any])
    
    /** Gets the Bluetooth SIG-defined TxPower service UUID. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids.txPower")
    @js.native
    def txPower: String = js.native
    @scala.inline
    def txPower_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("txPower")(x.asInstanceOf[js.Any])
  }
  
  /** Represents the value received when registering to receive notifications or indications from a Bluetooth LE device. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattValueChangedEventArgs")
  @js.native
  abstract class GattValueChangedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattValueChangedEventArgs
  
  /** Indicates what type of write operation is to be performed. */
  @JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattWriteOption")
  @js.native
  object GattWriteOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattWriteOption with Double
      ] = js.native
    
    /* 0 */ val writeWithResponse: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattWriteOption.writeWithResponse with Double = js.native
    
    /* 1 */ val writeWithoutResponse: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattWriteOption.writeWithoutResponse with Double = js.native
  }
}
