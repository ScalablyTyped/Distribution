package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait markup extends js.Object {
  var attribute: js.Any
  var dataTag: js.Any
  var namespace: js.Any
  def init(node: java.lang.String, target: java.lang.String): webixLib.webixMod.uiNs.baseview
  def parse(data: js.Any, datatype: java.lang.String): scala.Unit
}

object markup {
  @scala.inline
  def apply(
    attribute: js.Any,
    dataTag: js.Any,
    init: (java.lang.String, java.lang.String) => webixLib.webixMod.uiNs.baseview,
    namespace: js.Any,
    parse: (js.Any, java.lang.String) => scala.Unit
  ): markup = {
    val __obj = js.Dynamic.literal(attribute = attribute, dataTag = dataTag, init = js.Any.fromFunction2(init), namespace = namespace, parse = js.Any.fromFunction2(parse))
  
    __obj.asInstanceOf[markup]
  }
}

