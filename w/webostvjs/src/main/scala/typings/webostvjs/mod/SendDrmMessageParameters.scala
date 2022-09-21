package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendDrmMessageParameters extends StObject {
  
  /**
    * The message to be provided to the underlying DRM server, which is formatted according to the DRM type.
    */
  var msg: String
  
  /**
    * The callback function called when the method fails.
    */
  def onFailure(error: FailureResponse): Unit
  
  /**
    * The callback function called when the method succeeds.
    */
  def onSuccess(response: SendDrmMessageSuccessResponse): Unit
}
object SendDrmMessageParameters {
  
  inline def apply(msg: String, onFailure: FailureResponse => Unit, onSuccess: SendDrmMessageSuccessResponse => Unit): SendDrmMessageParameters = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess))
    __obj.asInstanceOf[SendDrmMessageParameters]
  }
  
  extension [Self <: SendDrmMessageParameters](x: Self) {
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setOnFailure(value: FailureResponse => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
    
    inline def setOnSuccess(value: SendDrmMessageSuccessResponse => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
  }
}
