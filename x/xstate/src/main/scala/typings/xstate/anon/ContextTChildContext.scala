package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextTChildContext[TChildContext] extends StObject {
  
  var context: TChildContext = js.native
  
  var value: js.Any = js.native
}
object ContextTChildContext {
  
  @scala.inline
  def apply[TChildContext](context: TChildContext, value: js.Any): ContextTChildContext[TChildContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextTChildContext[TChildContext]]
  }
  
  @scala.inline
  implicit class ContextTChildContextMutableBuilder[Self <: ContextTChildContext[_], TChildContext] (val x: Self with ContextTChildContext[TChildContext]) extends AnyVal {
    
    @scala.inline
    def setContext(value: TChildContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
