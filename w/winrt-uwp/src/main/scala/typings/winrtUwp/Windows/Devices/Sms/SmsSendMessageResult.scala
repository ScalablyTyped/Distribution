package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates the results of calling SmsDevice2.SendMessageAndGetResultAsync . */
trait SmsSendMessageResult extends StObject {
  
  /** Gets the cellular class used in the send operation. */
  var cellularClass: CellularClass
  
  /** Gets a boolean value indicating whether the send operation has encountered a transient error. */
  var isErrorTransient: Boolean
  
  /** Gets a value indicating whether the send operation was successful. */
  var isSuccessful: Boolean
  
  /** Gets a list of message numbers sent. */
  var messageReferenceNumbers: IVectorView[Double]
  
  /** Gets the error code for a modem error associated with the send operation. */
  var modemErrorCode: SmsModemErrorCode
  
  /** Gets the error code for a network error associated with the send operation. */
  var networkCauseCode: Double
  
  /** Gets the error code for a transport failure associated with the send operation. */
  var transportFailureCause: Double
}
object SmsSendMessageResult {
  
  inline def apply(
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
  
  extension [Self <: SmsSendMessageResult](x: Self) {
    
    inline def setCellularClass(value: CellularClass): Self = StObject.set(x, "cellularClass", value.asInstanceOf[js.Any])
    
    inline def setIsErrorTransient(value: Boolean): Self = StObject.set(x, "isErrorTransient", value.asInstanceOf[js.Any])
    
    inline def setIsSuccessful(value: Boolean): Self = StObject.set(x, "isSuccessful", value.asInstanceOf[js.Any])
    
    inline def setMessageReferenceNumbers(value: IVectorView[Double]): Self = StObject.set(x, "messageReferenceNumbers", value.asInstanceOf[js.Any])
    
    inline def setModemErrorCode(value: SmsModemErrorCode): Self = StObject.set(x, "modemErrorCode", value.asInstanceOf[js.Any])
    
    inline def setNetworkCauseCode(value: Double): Self = StObject.set(x, "networkCauseCode", value.asInstanceOf[js.Any])
    
    inline def setTransportFailureCause(value: Double): Self = StObject.set(x, "transportFailureCause", value.asInstanceOf[js.Any])
  }
}
