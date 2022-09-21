package typings.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebixFilter extends StObject {
  
  def getValue(node: HTMLElement): Any
  
  def refresh(master: baseview, node: HTMLElement, value: Any): Unit
  
  def render(master: baseview, config: StringDictionary[Any]): String
  
  def setValue(node: HTMLElement, value: Any): Any
}
object WebixFilter {
  
  inline def apply(
    getValue: HTMLElement => Any,
    refresh: (baseview, HTMLElement, Any) => Unit,
    render: (baseview, StringDictionary[Any]) => String,
    setValue: (HTMLElement, Any) => Any
  ): WebixFilter = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction1(getValue), refresh = js.Any.fromFunction3(refresh), render = js.Any.fromFunction2(render), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[WebixFilter]
  }
  
  extension [Self <: WebixFilter](x: Self) {
    
    inline def setGetValue(value: HTMLElement => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: (baseview, HTMLElement, Any) => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction3(value))
    
    inline def setRender(value: (baseview, StringDictionary[Any]) => String): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    
    inline def setSetValue(value: (HTMLElement, Any) => Any): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
  }
}
