package typings.xmlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var attributes: Attributes
  var children: js.Array[Node]
  var content: js.UndefOr[String] = js.undefined
  var name: String
}

object Node {
  @scala.inline
  def apply(attributes: Attributes, children: js.Array[Node], name: String, content: String = null): Node = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

