package typings.webrtc

import typings.std.DOMException
import typings.std.RTCErrorDetailType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcerror
trait RTCError
  extends StObject
     with DOMException {
  
  val errorDetail: RTCErrorDetailType
  
  val httpRequestStatusCode: Double | Null
  
  val receivedAlert: Double | Null
  
  val sctpCauseCode: Double | Null
  
  val sdpLineNumber: Double | Null
  
  val sentAlert: Double | Null
}
object RTCError {
  
  inline def apply(code: Double, errorDetail: RTCErrorDetailType, message: String, name: String): RTCError = {
    val __obj = js.Dynamic.literal(ABORT_ERR = 20, DATA_CLONE_ERR = 25, DOMSTRING_SIZE_ERR = 2, HIERARCHY_REQUEST_ERR = 3, INDEX_SIZE_ERR = 1, INUSE_ATTRIBUTE_ERR = 10, INVALID_ACCESS_ERR = 15, INVALID_CHARACTER_ERR = 5, INVALID_MODIFICATION_ERR = 13, INVALID_NODE_TYPE_ERR = 24, INVALID_STATE_ERR = 11, NAMESPACE_ERR = 14, NETWORK_ERR = 19, NOT_FOUND_ERR = 8, NOT_SUPPORTED_ERR = 9, NO_DATA_ALLOWED_ERR = 6, NO_MODIFICATION_ALLOWED_ERR = 7, QUOTA_EXCEEDED_ERR = 22, SECURITY_ERR = 18, SYNTAX_ERR = 12, TIMEOUT_ERR = 23, TYPE_MISMATCH_ERR = 17, URL_MISMATCH_ERR = 21, VALIDATION_ERR = 16, WRONG_DOCUMENT_ERR = 4, code = code.asInstanceOf[js.Any], errorDetail = errorDetail.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], httpRequestStatusCode = null, receivedAlert = null, sctpCauseCode = null, sdpLineNumber = null, sentAlert = null)
    __obj.asInstanceOf[RTCError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCError] (val x: Self) extends AnyVal {
    
    inline def setErrorDetail(value: RTCErrorDetailType): Self = StObject.set(x, "errorDetail", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestStatusCode(value: Double): Self = StObject.set(x, "httpRequestStatusCode", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestStatusCodeNull: Self = StObject.set(x, "httpRequestStatusCode", null)
    
    inline def setReceivedAlert(value: Double): Self = StObject.set(x, "receivedAlert", value.asInstanceOf[js.Any])
    
    inline def setReceivedAlertNull: Self = StObject.set(x, "receivedAlert", null)
    
    inline def setSctpCauseCode(value: Double): Self = StObject.set(x, "sctpCauseCode", value.asInstanceOf[js.Any])
    
    inline def setSctpCauseCodeNull: Self = StObject.set(x, "sctpCauseCode", null)
    
    inline def setSdpLineNumber(value: Double): Self = StObject.set(x, "sdpLineNumber", value.asInstanceOf[js.Any])
    
    inline def setSdpLineNumberNull: Self = StObject.set(x, "sdpLineNumber", null)
    
    inline def setSentAlert(value: Double): Self = StObject.set(x, "sentAlert", value.asInstanceOf[js.Any])
    
    inline def setSentAlertNull: Self = StObject.set(x, "sentAlert", null)
  }
}
