package typings.wordpressComponents.autocompleteMod.Autocomplete

import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderProps extends js.Object {
  
  var activeId: String = js.native
  
  var isExpanded: Boolean = js.native
  
  var listBoxId: String = js.native
  
  def onKeyDown(event: KeyboardEvent[HTMLElement]): Unit = js.native
}
object RenderProps {
  
  @scala.inline
  def apply(
    activeId: String,
    isExpanded: Boolean,
    listBoxId: String,
    onKeyDown: KeyboardEvent[HTMLElement] => Unit
  ): RenderProps = {
    val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], listBoxId = listBoxId.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[RenderProps]
  }
  
  @scala.inline
  implicit class RenderPropsOps[Self <: RenderProps] (val x: Self) extends AnyVal {
    
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
    def setActiveId(value: String): Self = this.set("activeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListBoxId(value: String): Self = this.set("listBoxId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
  }
}
