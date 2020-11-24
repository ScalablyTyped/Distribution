package typings.virtualKeyboard.mod.global

import typings.virtualKeyboard.mod.KeyboardOptions
import typings.virtualKeyboard.mod.NavigateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def addNavigation(options: NavigateOptions): this.type = js.native
  
  def keyboard(options: KeyboardOptions): this.type = js.native
}
object JQuery {
  
  @scala.inline
  def apply(addNavigation: NavigateOptions => JQuery, keyboard: KeyboardOptions => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(addNavigation = js.Any.fromFunction1(addNavigation), keyboard = js.Any.fromFunction1(keyboard))
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryOps[Self <: JQuery] (val x: Self) extends AnyVal {
    
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
    def setAddNavigation(value: NavigateOptions => JQuery): Self = this.set("addNavigation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyboard(value: KeyboardOptions => JQuery): Self = this.set("keyboard", js.Any.fromFunction1(value))
  }
}
