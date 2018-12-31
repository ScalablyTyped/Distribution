package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandDeviceInformation extends js.Object {
  var cellularClass: winrtLib.WindowsNs.DevicesNs.SmsNs.CellularClass
  var currentRadioState: MobileBroadbandRadioState
  var customDataClass: java.lang.String
  var dataClasses: DataClasses
  var deviceId: java.lang.String
  var deviceType: MobileBroadbandDeviceType
  var firmwareInformation: java.lang.String
  var manufacturer: java.lang.String
  var mobileEquipmentId: java.lang.String
  var model: java.lang.String
  var networkDeviceStatus: NetworkDeviceStatus
  var simIccId: java.lang.String
  var subscriberId: java.lang.String
  var telephoneNumbers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
}

