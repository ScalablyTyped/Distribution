package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.winrt.WindowsNs.DevicesNs.SmsNs.ISmsMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorNotificationEventDetails")
@js.native
class NetworkOperatorNotificationEventDetails () extends INetworkOperatorNotificationEventDetails {
  /* CompleteClass */
  override var encodingType: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var networkAccountId: String = js.native
  /* CompleteClass */
  override var notificationType: NetworkOperatorEventMessageType = js.native
  /* CompleteClass */
  override var ruleId: String = js.native
  /* CompleteClass */
  override var smsMessage: ISmsMessage = js.native
}

