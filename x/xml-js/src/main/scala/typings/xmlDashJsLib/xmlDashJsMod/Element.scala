package typings
package xmlDashJsLib.xmlDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var attributes: js.UndefOr[Attributes] = js.undefined
  var cdata: js.UndefOr[java.lang.String] = js.undefined
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var declaration: js.UndefOr[xmlDashJsLib.Anon_AttributesDeclarationAttributes] = js.undefined
  var doctype: js.UndefOr[java.lang.String] = js.undefined
  var elements: js.UndefOr[js.Array[Element]] = js.undefined
  var instruction: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String | scala.Double | scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Element {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    cdata: java.lang.String = null,
    comment: java.lang.String = null,
    declaration: xmlDashJsLib.Anon_AttributesDeclarationAttributes = null,
    doctype: java.lang.String = null,
    elements: js.Array[Element] = null,
    instruction: java.lang.String = null,
    name: java.lang.String = null,
    text: java.lang.String | scala.Double | scala.Boolean = null,
    `type`: java.lang.String = null
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

