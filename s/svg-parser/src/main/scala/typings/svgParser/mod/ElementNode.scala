package typings.svgParser.mod

import typings.std.Record
import typings.svgParser.svgParserStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementNode extends Node {
  var children: js.Array[Node | String] = js.native
  var metadata: js.UndefOr[String] = js.native
  var properties: js.UndefOr[Record[String, String | Double]] = js.native
  var tagName: js.UndefOr[String] = js.native
  var `type`: element = js.native
  var value: js.UndefOr[String] = js.native
}

object ElementNode {
  @scala.inline
  def apply(children: js.Array[Node | String], `type`: element): ElementNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementNode]
  }
  @scala.inline
  implicit class ElementNodeOps[Self <: ElementNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenVarargs(value: (Node | String)*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[Node | String]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: element): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setProperties(value: Record[String, String | Double]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

