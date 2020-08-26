package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the results of calling SmsDevice2.SendMessageAndGetResultAsync . */
@js.native
trait SmsSendMessageResult extends js.Object {
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

object SmsSendMessageResult {
  @scala.inline
  def apply(
    cellularClass: CellularClass,
    isErrorTransient: Boolean,
    isSuccessful: Boolean,
    messageReferenceNumbers: IVectorView[Double],
    modemErrorCode: SmsModemErrorCode,
    networkCauseCode: Double,
    transportFailureCause: Double
  ): SmsSendMessageResult = {
    val __obj = js.Dynamic.literal(cellularClass = cellularClass.asInstanceOf[js.Any], isErrorTransient = isErrorTransient.asInstanceOf[js.Any], isSuccessful = isSuccessful.asInstanceOf[js.Any], messageReferenceNumbers = messageReferenceNumbers.asInstanceOf[js.Any], modemErrorCode = modemErrorCode.asInstanceOf[js.Any], networkCauseCode = networkCauseCode.asInstanceOf[js.Any], transportFailureCause = transportFailureCause.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsSendMessageResult]
  }
  @scala.inline
  implicit class SmsSendMessageResultOps[Self <: SmsSendMessageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCellularClass(value: CellularClass): Self = this.set("cellularClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsErrorTransient(value: Boolean): Self = this.set("isErrorTransient", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSuccessful(value: Boolean): Self = this.set("isSuccessful", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageReferenceNumbers(value: IVectorView[Double]): Self = this.set("messageReferenceNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setModemErrorCode(value: SmsModemErrorCode): Self = this.set("modemErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkCauseCode(value: Double): Self = this.set("networkCauseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportFailureCause(value: Double): Self = this.set("transportFailureCause", value.asInstanceOf[js.Any])
  }
  
}

