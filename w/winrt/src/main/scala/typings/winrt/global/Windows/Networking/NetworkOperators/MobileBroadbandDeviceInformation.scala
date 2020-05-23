package typings.winrt.global.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Devices.Sms.CellularClass
import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation")
@js.native
class MobileBroadbandDeviceInformation ()
  extends typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation {
  /* CompleteClass */
  override var cellularClass: CellularClass = js.native
  /* CompleteClass */
  override var currentRadioState: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandRadioState = js.native
  /* CompleteClass */
  override var customDataClass: String = js.native
  /* CompleteClass */
  override var dataClasses: typings.winrt.Windows.Networking.NetworkOperators.DataClasses = js.native
  /* CompleteClass */
  override var deviceId: String = js.native
  /* CompleteClass */
  override var deviceType: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType = js.native
  /* CompleteClass */
  override var firmwareInformation: String = js.native
  /* CompleteClass */
  override var manufacturer: String = js.native
  /* CompleteClass */
  override var mobileEquipmentId: String = js.native
  /* CompleteClass */
  override var model: String = js.native
  /* CompleteClass */
  override var networkDeviceStatus: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus = js.native
  /* CompleteClass */
  override var simIccId: String = js.native
  /* CompleteClass */
  override var subscriberId: String = js.native
  /* CompleteClass */
  override var telephoneNumbers: IVectorView[String] = js.native
}

