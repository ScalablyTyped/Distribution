package typings.xstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextTFinalContext[TFinalContext] extends js.Object {
  
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
  implicit class ContextTFinalContextOps[Self <: ContextTFinalContext[_], TFinalContext] (val x: Self with ContextTFinalContext[TFinalContext]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: TFinalContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
