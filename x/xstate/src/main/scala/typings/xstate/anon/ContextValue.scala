package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextValue[TContext] extends StObject {
  
  var context: TContext = js.native
  
  var value: js.Any = js.native
}
object ContextValue {
  
  @scala.inline
  def apply[TContext](context: TContext, value: js.Any): ContextValue[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextValue[TContext]]
  }
  
  @scala.inline
  implicit class ContextValueMutableBuilder[Self <: ContextValue[_], TContext] (val x: Self with ContextValue[TContext]) extends AnyVal {
    
    @scala.inline
    def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
