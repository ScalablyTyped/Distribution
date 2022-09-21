package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextTContext[TContext] extends StObject {
  
  var context: TContext
  
  var value: Any
}
object ContextTContext {
  
  inline def apply[TContext](context: TContext, value: Any): ContextTContext[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextTContext[TContext]]
  }
  
  extension [Self <: ContextTContext[?], TContext](x: Self & ContextTContext[TContext]) {
    
    inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
