package typings.webix.webixMod

import typings.webix.webixMod.uiNs.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait markup extends js.Object {
  var attribute: js.Any
  var dataTag: js.Any
  var namespace: js.Any
  def init(node: String, target: String): baseview
  def parse(data: js.Any, datatype: String): Unit
}

object markup {
  @scala.inline
  def apply(
    attribute: js.Any,
    dataTag: js.Any,
    init: (String, String) => baseview,
    namespace: js.Any,
    parse: (js.Any, String) => Unit
  ): markup = {
    val __obj = js.Dynamic.literal(attribute = attribute, dataTag = dataTag, init = js.Any.fromFunction2(init), namespace = namespace, parse = js.Any.fromFunction2(parse))
  
    __obj.asInstanceOf[markup]
  }
}

