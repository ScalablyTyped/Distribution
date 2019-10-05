package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import typings.winrtDashUwp.Windows.Devices.Sms.CellularClass
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the current state of the mobile broadband network device for the account. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation")
@js.native
abstract class MobileBroadbandDeviceInformation () extends js.Object {
  /** Gets the cellular technology used by the mobile broadband network device. */
  var cellularClass: CellularClass = js.native
  /** Gets a value indicating the radio state of the device. */
  var currentRadioState: MobileBroadbandRadioState = js.native
  /** Gets the name of the data class when the DataClasses property returns Custom. */
  var customDataClass: String = js.native
  /** Gets the cellular data services supported by the mobile broadband network device. */
  var dataClasses: DataClasses = js.native
  /** Gets the DeviceInformation Id of the mobile broadband device. */
  var deviceId: String = js.native
  /** Gets a value indicating the type of Mobile Broadband device. */
  var deviceType: MobileBroadbandDeviceType = js.native
  /** Gets the device-specific firmware information for the mobile broadband network device. */
  var firmwareInformation: String = js.native
  /** Gets the name of the manufacturer of the mobile broadband network device. */
  var manufacturer: String = js.native
  /** Gets the value that uniquely identifies the mobile broadband device to the network provider. */
  var mobileEquipmentId: String = js.native
  /** Gets the name of the model of the mobile broadband network device. */
  var model: String = js.native
  /** Gets the readiness status of the mobile broadband network device. */
  var networkDeviceStatus: NetworkDeviceStatus = js.native
  /** Gets a MobileBroadbandPinManager object for the mobile broadband device. */
  var pinManager: MobileBroadbandPinManager = js.native
  /** Gets the revision of the mobile broadband device. */
  var revision: String = js.native
  /** Gets the serial number of the mobile broadband device. */
  var serialNumber: String = js.native
  /** Gets the SIM integrated circuit card identifier (ICCID) for the mobile broadband network device. */
  var simIccId: String = js.native
  /** Gets the subscriber identifier for the mobile broadband network device. */
  var subscriberId: String = js.native
  /** Gets the telephone numbers for the mobile broadband device. */
  var telephoneNumbers: IVectorView[String] = js.native
}

