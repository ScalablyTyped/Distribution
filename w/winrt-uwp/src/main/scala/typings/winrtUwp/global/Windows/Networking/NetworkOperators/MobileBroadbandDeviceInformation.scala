package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Devices.Sms.CellularClass
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the current state of the mobile broadband network device for the account. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation")
@js.native
abstract class MobileBroadbandDeviceInformation ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation {
  
  /** Gets the cellular technology used by the mobile broadband network device. */
  /* CompleteClass */
  var cellularClass: CellularClass = js.native
  
  /** Gets a value indicating the radio state of the device. */
  /* CompleteClass */
  var currentRadioState: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandRadioState = js.native
  
  /** Gets the name of the data class when the DataClasses property returns Custom. */
  /* CompleteClass */
  var customDataClass: String = js.native
  
  /** Gets the cellular data services supported by the mobile broadband network device. */
  /* CompleteClass */
  var dataClasses: typings.winrtUwp.Windows.Networking.NetworkOperators.DataClasses = js.native
  
  /** Gets the DeviceInformation Id of the mobile broadband device. */
  /* CompleteClass */
  var deviceId: String = js.native
  
  /** Gets a value indicating the type of Mobile Broadband device. */
  /* CompleteClass */
  var deviceType: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType = js.native
  
  /** Gets the device-specific firmware information for the mobile broadband network device. */
  /* CompleteClass */
  var firmwareInformation: String = js.native
  
  /** Gets the name of the manufacturer of the mobile broadband network device. */
  /* CompleteClass */
  var manufacturer: String = js.native
  
  /** Gets the value that uniquely identifies the mobile broadband device to the network provider. */
  /* CompleteClass */
  var mobileEquipmentId: String = js.native
  
  /** Gets the name of the model of the mobile broadband network device. */
  /* CompleteClass */
  var model: String = js.native
  
  /** Gets the readiness status of the mobile broadband network device. */
  /* CompleteClass */
  var networkDeviceStatus: typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkDeviceStatus = js.native
  
  /** Gets a MobileBroadbandPinManager object for the mobile broadband device. */
  /* CompleteClass */
  var pinManager: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinManager = js.native
  
  /** Gets the revision of the mobile broadband device. */
  /* CompleteClass */
  var revision: String = js.native
  
  /** Gets the serial number of the mobile broadband device. */
  /* CompleteClass */
  var serialNumber: String = js.native
  
  /** Gets the SIM integrated circuit card identifier (ICCID) for the mobile broadband network device. */
  /* CompleteClass */
  var simIccId: String = js.native
  
  /** Gets the subscriber identifier for the mobile broadband network device. */
  /* CompleteClass */
  var subscriberId: String = js.native
  
  /** Gets the telephone numbers for the mobile broadband device. */
  /* CompleteClass */
  var telephoneNumbers: IVectorView[String] = js.native
}
