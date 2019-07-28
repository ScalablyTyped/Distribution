package typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
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
  var isErrorTransient: Boolean = js.native
  /** Gets a value indicating whether the send operation was successful. */
  var isSuccessful: Boolean = js.native
  /** Gets a list of message numbers sent. */
  var messageReferenceNumbers: IVectorView[Double] = js.native
  /** Gets the error code for a modem error associated with the send operation. */
  var modemErrorCode: SmsModemErrorCode = js.native
  /** Gets the error code for a network error associated with the send operation. */
  var networkCauseCode: Double = js.native
  /** Gets the error code for a transport failure associated with the send operation. */
  var transportFailureCause: Double = js.native
}

