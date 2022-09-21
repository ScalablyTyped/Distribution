package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendDrmMessageSuccessResponse extends StObject {
  
  /**
    * The unique ID of message which has led to this resulting message.
    */
  var msgId: js.UndefOr[String] = js.undefined
  
  /**
    * The result code only for PlayReady.
    */
  var resultCode: js.UndefOr[Double] = js.undefined
  
  /**
    * The DRM system specific result message only for PlayReady.
    */
  var resultMsg: js.UndefOr[String] = js.undefined
}
object SendDrmMessageSuccessResponse {
  
  inline def apply(): SendDrmMessageSuccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendDrmMessageSuccessResponse]
  }
  
  extension [Self <: SendDrmMessageSuccessResponse](x: Self) {
    
    inline def setMsgId(value: String): Self = StObject.set(x, "msgId", value.asInstanceOf[js.Any])
    
    inline def setMsgIdUndefined: Self = StObject.set(x, "msgId", js.undefined)
    
    inline def setResultCode(value: Double): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    
    inline def setResultCodeUndefined: Self = StObject.set(x, "resultCode", js.undefined)
    
    inline def setResultMsg(value: String): Self = StObject.set(x, "resultMsg", value.asInstanceOf[js.Any])
    
    inline def setResultMsgUndefined: Self = StObject.set(x, "resultMsg", js.undefined)
  }
}
