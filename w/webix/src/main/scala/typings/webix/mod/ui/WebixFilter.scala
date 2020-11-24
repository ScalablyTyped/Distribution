package typings.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebixFilter extends js.Object {
  
  def getValue(node: HTMLElement): js.Any = js.native
  
  def refresh(master: typings.webix.webix.ui.baseview, node: HTMLElement, value: js.Any): Unit = js.native
  
  def render(master: typings.webix.webix.ui.baseview, config: StringDictionary[js.Any]): String = js.native
  
  def setValue(node: HTMLElement, value: js.Any): js.Any = js.native
}
object WebixFilter {
  
  @scala.inline
  def apply(
    getValue: HTMLElement => js.Any,
    refresh: (typings.webix.webix.ui.baseview, HTMLElement, js.Any) => Unit,
    render: (typings.webix.webix.ui.baseview, StringDictionary[js.Any]) => String,
    setValue: (HTMLElement, js.Any) => js.Any
  ): WebixFilter = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction1(getValue), refresh = js.Any.fromFunction3(refresh), render = js.Any.fromFunction2(render), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[WebixFilter]
  }
  
  @scala.inline
  implicit class WebixFilterOps[Self <: WebixFilter] (val x: Self) extends AnyVal {
    
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
    def setGetValue(value: HTMLElement => js.Any): Self = this.set("getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefresh(value: (typings.webix.webix.ui.baseview, HTMLElement, js.Any) => Unit): Self = this.set("refresh", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRender(value: (typings.webix.webix.ui.baseview, StringDictionary[js.Any]) => String): Self = this.set("render", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetValue(value: (HTMLElement, js.Any) => js.Any): Self = this.set("setValue", js.Any.fromFunction2(value))
  }
}
