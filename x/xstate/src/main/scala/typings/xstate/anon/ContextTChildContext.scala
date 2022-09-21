package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextTChildContext[TChildContext] extends StObject {
  
  var context: TChildContext
  
  var value: Any
}
object ContextTChildContext {
  
  inline def apply[TChildContext](context: TChildContext, value: Any): ContextTChildContext[TChildContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextTChildContext[TChildContext]]
  }
  
  extension [Self <: ContextTChildContext[?], TChildContext](x: Self & ContextTChildContext[TChildContext]) {
    
    inline def setContext(value: TChildContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
