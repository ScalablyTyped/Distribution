package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextTFinalContext[TFinalContext] extends StObject {
  
  var context: TFinalContext = js.native
  
  var value: js.Any = js.native
}
object ContextTFinalContext {
  
  @scala.inline
  def apply[TFinalContext](context: TFinalContext, value: js.Any): ContextTFinalContext[TFinalContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextTFinalContext[TFinalContext]]
  }
  
  @scala.inline
  implicit class ContextTFinalContextMutableBuilder[Self <: ContextTFinalContext[_], TFinalContext] (val x: Self with ContextTFinalContext[TFinalContext]) extends AnyVal {
    
    @scala.inline
    def setContext(value: TFinalContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
