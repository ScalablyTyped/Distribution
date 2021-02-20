package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates the results of calling SmsDevice2.SendMessageAndGetResultAsync . */
@js.native
trait SmsSendMessageResult extends StObject {
  
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
  implicit class SmsSendMessageResultMutableBuilder[Self <: SmsSendMessageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellularClass(value: CellularClass): Self = StObject.set(x, "cellularClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsErrorTransient(value: Boolean): Self = StObject.set(x, "isErrorTransient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuccessful(value: Boolean): Self = StObject.set(x, "isSuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageReferenceNumbers(value: IVectorView[Double]): Self = StObject.set(x, "messageReferenceNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModemErrorCode(value: SmsModemErrorCode): Self = StObject.set(x, "modemErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkCauseCode(value: Double): Self = StObject.set(x, "networkCauseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportFailureCause(value: Double): Self = StObject.set(x, "transportFailureCause", value.asInstanceOf[js.Any])
  }
}
