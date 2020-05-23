package typings.webix.webix.ui.datafilter

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.webix.ui.WebixFilter
import typings.webix.webix.ui.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait textFilter extends WebixFilter {
  def getInputNode(node: HTMLElement): HTMLElement
}

object textFilter {
  @scala.inline
  def apply(
    getInputNode: HTMLElement => HTMLElement,
    getValue: HTMLElement => js.Any,
    refresh: (baseview, HTMLElement, js.Any) => Unit,
    render: (baseview, StringDictionary[js.Any]) => String,
    setValue: (HTMLElement, js.Any) => js.Any
  ): textFilter = {
    val __obj = js.Dynamic.literal(getInputNode = js.Any.fromFunction1(getInputNode), getValue = js.Any.fromFunction1(getValue), refresh = js.Any.fromFunction3(refresh), render = js.Any.fromFunction2(render), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[textFilter]
  }
}

