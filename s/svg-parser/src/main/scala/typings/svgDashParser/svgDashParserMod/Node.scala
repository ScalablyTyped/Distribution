package typings.svgDashParser.svgDashParserMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var attributes: Record[String, String | Double]
  var children: js.Array[Node]
  var metadata: js.UndefOr[String] = js.undefined
  var name: String
}

object Node {
  @scala.inline
  def apply(
    attributes: Record[String, String | Double],
    children: js.Array[Node],
    name: String,
    metadata: String = null
  ): Node = {
    val __obj = js.Dynamic.literal(attributes = attributes, children = children, name = name)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[Node]
  }
}

