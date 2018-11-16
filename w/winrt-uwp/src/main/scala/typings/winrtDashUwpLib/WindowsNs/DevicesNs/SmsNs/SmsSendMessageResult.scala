package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the results of calling SmsDevice2.SendMessageAndGetResultAsync . */
@JSGlobal("Windows.Devices.Sms.SmsSendMessageResult")
@js.native
abstract class SmsSendMessageResult () extends js.Object {
  /** Gets the cellular class used in the send operation. */
  var cellularClass: CellularClass = js.native
  /** Gets a boolean value indicating whether the send operation has encountered a transient error. */
  var isErrorTransient: scala.Boolean = js.native
  /** Gets a value indicating whether the send operation was successful. */
  var isSuccessful: scala.Boolean = js.native
  /** Gets a list of message numbers sent. */
  var messageReferenceNumbers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[scala.Double] = js.native
  /** Gets the error code for a modem error associated with the send operation. */
  var modemErrorCode: SmsModemErrorCode = js.native
  /** Gets the error code for a network error associated with the send operation. */
  var networkCauseCode: scala.Double = js.native
  /** Gets the error code for a transport failure associated with the send operation. */
  var transportFailureCause: scala.Double = js.native
}

