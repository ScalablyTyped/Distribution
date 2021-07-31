package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextTContext[TContext] extends StObject {
  
  var context: TContext
  
  var value: js.Any
}
object ContextTContext {
  
  @scala.inline
  def apply[TContext](context: TContext, value: js.Any): ContextTContext[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextTContext[TContext]]
  }
  
  @scala.inline
  implicit class ContextTContextMutableBuilder[Self <: ContextTContext[?], TContext] (val x: Self & ContextTContext[TContext]) extends AnyVal {
    
    @scala.inline
    def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
