package typings.vueI18n.mod.VueI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageContext extends js.Object {
  
  def list(index: Double): js.Any = js.native
  
  def named(key: String): js.Any = js.native
}
object MessageContext {
  
  @scala.inline
  def apply(list: Double => js.Any, named: String => js.Any): MessageContext = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), named = js.Any.fromFunction1(named))
    __obj.asInstanceOf[MessageContext]
  }
  
  @scala.inline
  implicit class MessageContextOps[Self <: MessageContext] (val x: Self) extends AnyVal {
    
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
    def setList(value: Double => js.Any): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNamed(value: String => js.Any): Self = this.set("named", js.Any.fromFunction1(value))
  }
}
