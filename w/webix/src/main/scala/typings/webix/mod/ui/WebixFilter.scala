package typings.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebixFilter extends StObject {
  
  def getValue(node: HTMLElement): js.Any
  
  def refresh(master: typings.webix.webix.ui.baseview, node: HTMLElement, value: js.Any): Unit
  
  def render(master: typings.webix.webix.ui.baseview, config: StringDictionary[js.Any]): String
  
  def setValue(node: HTMLElement, value: js.Any): js.Any
}
object WebixFilter {
  
  inline def apply(
    getValue: HTMLElement => js.Any,
    refresh: (typings.webix.webix.ui.baseview, HTMLElement, js.Any) => Unit,
    render: (typings.webix.webix.ui.baseview, StringDictionary[js.Any]) => String,
    setValue: (HTMLElement, js.Any) => js.Any
  ): WebixFilter = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction1(getValue), refresh = js.Any.fromFunction3(refresh), render = js.Any.fromFunction2(render), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[WebixFilter]
  }
  
  extension [Self <: WebixFilter](x: Self) {
    
    inline def setGetValue(value: HTMLElement => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: (typings.webix.webix.ui.baseview, HTMLElement, js.Any) => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction3(value))
    
    inline def setRender(value: (typings.webix.webix.ui.baseview, StringDictionary[js.Any]) => String): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    
    inline def setSetValue(value: (HTMLElement, js.Any) => js.Any): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
  }
}
