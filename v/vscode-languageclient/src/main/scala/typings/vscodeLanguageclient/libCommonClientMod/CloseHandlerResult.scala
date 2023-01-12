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
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
