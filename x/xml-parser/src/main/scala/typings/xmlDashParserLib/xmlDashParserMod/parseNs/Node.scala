package typings
package xmlDashParserLib.xmlDashParserMod.parseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var attributes: Attributes
  var children: js.Array[Node]
  var content: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object Node {
  @scala.inline
  def apply(
    attributes: Attributes,
    children: js.Array[Node],
    name: java.lang.String,
    content: java.lang.String = null
  ): Node = {
    val __obj = js.Dynamic.literal(attributes = attributes, children = children, name = name)
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[Node]
  }
}

