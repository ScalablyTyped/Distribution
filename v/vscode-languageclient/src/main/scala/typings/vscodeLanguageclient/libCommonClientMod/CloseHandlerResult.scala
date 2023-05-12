package typings.vscodeLanguageclient.libCommonClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseHandlerResult extends StObject {
  
  /**
    * The action to take.
    */
  var action: CloseAction
  
  /**
    * If set to true the client assumes that the corresponding
    * close handler has presented an appropriate message to the
    * user and the message will only be log to the client's
    * output channel.
    */
  var handled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional message to be presented to the user.
    */
  var message: js.UndefOr[String] = js.undefined
}
object CloseHandlerResult {
  
  inline def apply(action: CloseAction): CloseHandlerResult = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseHandlerResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseHandlerResult] (val x: Self) extends AnyVal {
    
    inline def setAction(value: CloseAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setHandledUndefined: Self = StObject.set(x, "handled", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
