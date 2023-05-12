package typings.vscodeLanguageclient.libCommonClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorHandlerResult extends StObject {
  
  /**
    * The action to take.
    */
  var action: ErrorAction
  
  /**
    * If set to true the client assumes that the corresponding
    * error handler has presented an appropriate message to the
    * user and the message will only be log to the client's
    * output channel.
    */
  var handled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional message to be presented to the user.
    */
  var message: js.UndefOr[String] = js.undefined
}
object ErrorHandlerResult {
  
  inline def apply(action: ErrorAction): ErrorHandlerResult = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorHandlerResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorHandlerResult] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ErrorAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setHandledUndefined: Self = StObject.set(x, "handled", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
