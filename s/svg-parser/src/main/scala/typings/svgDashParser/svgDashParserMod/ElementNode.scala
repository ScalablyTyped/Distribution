package typings.svgDashParser.svgDashParserMod

import typings.std.Record
import typings.svgDashParser.svgDashParserStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementNode extends Node {
  var children: js.Array[Node | String]
  var metadata: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[Record[String, String | Double]] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  var `type`: element
  var value: js.UndefOr[String] = js.undefined
}

object ElementNode {
  @scala.inline
  def apply(
    children: js.Array[Node | String],
    `type`: element,
    metadata: String = null,
    properties: Record[String, String | Double] = null,
    tagName: String = null,
    value: String = null
  ): ElementNode = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ElementNode]
  }
}

