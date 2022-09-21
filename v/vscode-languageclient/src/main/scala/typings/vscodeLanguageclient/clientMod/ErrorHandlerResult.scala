package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorHandlerResult extends StObject {
  
  /**
    * The action to take.
    */
  var action: ErrorAction
  
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
  
  extension [Self <: ErrorHandlerResult](x: Self) {
    
    inline def setAction(value: ErrorAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
