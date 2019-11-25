package typings.svgDashParser.svgDashParserMod

import typings.svgDashParser.svgDashParserStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextNode extends Node {
  var `type`: text
  var value: js.UndefOr[String | Boolean | Double] = js.undefined
}

object TextNode {
  @scala.inline
  def apply(`type`: text, value: String | Boolean | Double = null): TextNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNode]
  }
}

