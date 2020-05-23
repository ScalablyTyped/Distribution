package typings.winrtUwp.global.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the results of calling SmsDevice2.SendMessageAndGetResultAsync . */
@JSGlobal("Windows.Devices.Sms.SmsSendMessageResult")
@js.native
abstract class SmsSendMessageResult ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsSendMessageResult {
  /** Gets the cellular class used in the send operation. */
  /* CompleteClass */
  override var cellularClass: typings.winrtUwp.Windows.Devices.Sms.CellularClass = js.native
  /** Gets a boolean value indicating whether the send operation has encountered a transient error. */
  /* CompleteClass */
  override var isErrorTransient: Boolean = js.native
  /** Gets a value indicating whether the send operation was successful. */
  /* CompleteClass */
  override var isSuccessful: Boolean = js.native
  /** Gets a list of message numbers sent. */
  /* CompleteClass */
  override var messageReferenceNumbers: IVectorView[Double] = js.native
  /** Gets the error code for a modem error associated with the send operation. */
  /* CompleteClass */
  override var modemErrorCode: typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode = js.native
  /** Gets the error code for a network error associated with the send operation. */
  /* CompleteClass */
  override var networkCauseCode: Double = js.native
  /** Gets the error code for a transport failure associated with the send operation. */
  /* CompleteClass */
  override var transportFailureCause: Double = js.native
}

