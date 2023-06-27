package typings.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait textFilter
  extends StObject
     with WebixFilter {
  
  def getInputNode(node: HTMLElement): HTMLElement
}
object textFilter {
  
  inline def apply(
    getInputNode: HTMLElement => HTMLElement,
    getValue: HTMLElement => Any,
    refresh: (baseview, HTMLElement, Any) => Unit,
    render: (baseview, StringDictionary[Any]) => String,
    setValue: (HTMLElement, Any) => Any
  ): textFilter = {
    val __obj = js.Dynamic.literal(getInputNode = js.Any.fromFunction1(getInputNode), getValue = js.Any.fromFunction1(getValue), refresh = js.Any.fromFunction3(refresh), render = js.Any.fromFunction2(render), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[textFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: textFilter] (val x: Self) extends AnyVal {
    
    inline def setGetInputNode(value: HTMLElement => HTMLElement): Self = StObject.set(x, "getInputNode", js.Any.fromFunction1(value))
  }
}
