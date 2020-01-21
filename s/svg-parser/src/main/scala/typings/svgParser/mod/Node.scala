package typings.svgParser.mod

import typings.std.Record
import typings.svgParser.svgParserStrings.element
import typings.svgParser.svgParserStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.svgParser.mod.TextNode
  - typings.svgParser.mod.ElementNode
*/
trait Node extends js.Object

object Node {
  @scala.inline
  def TextNode(`type`: text, value: String | Boolean | Double = null): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def ElementNode(
    children: js.Array[Node | String],
    `type`: element,
    metadata: String = null,
    properties: Record[String, String | Double] = null,
    tagName: String = null,
    value: String = null
  ): Node = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

