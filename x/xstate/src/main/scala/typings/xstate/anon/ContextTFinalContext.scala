package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextTFinalContext[TFinalContext] extends StObject {
  
  var context: TFinalContext
  
  var value: js.Any
}
object ContextTFinalContext {
  
  inline def apply[TFinalContext](context: TFinalContext, value: js.Any): ContextTFinalContext[TFinalContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextTFinalContext[TFinalContext]]
  }
  
  extension [Self <: ContextTFinalContext[?], TFinalContext](x: Self & ContextTFinalContext[TFinalContext]) {
    
    inline def setContext(value: TFinalContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
