package typings.xmlDashJs.xmlDashJsMod

import typings.xmlDashJs.Anon_AttributesDeclarationAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var attributes: js.UndefOr[Attributes] = js.undefined
  var cdata: js.UndefOr[String] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var declaration: js.UndefOr[Anon_AttributesDeclarationAttributes] = js.undefined
  var doctype: js.UndefOr[String] = js.undefined
  var elements: js.UndefOr[js.Array[Element]] = js.undefined
  var instruction: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String | Double | Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Element {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    cdata: String = null,
    comment: String = null,
    declaration: Anon_AttributesDeclarationAttributes = null,
    doctype: String = null,
    elements: js.Array[Element] = null,
    instruction: String = null,
    name: String = null,
    text: String | Double | Boolean = null,
    `type`: String = null
  ): Element = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (cdata != null) __obj.updateDynamic("cdata")(cdata)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (declaration != null) __obj.updateDynamic("declaration")(declaration)
    if (doctype != null) __obj.updateDynamic("doctype")(doctype)
    if (elements != null) __obj.updateDynamic("elements")(elements)
    if (instruction != null) __obj.updateDynamic("instruction")(instruction)
    if (name != null) __obj.updateDynamic("name")(name)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Element]
  }
}

