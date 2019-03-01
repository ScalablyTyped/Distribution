package typings
package xmlDashJsLib.xmlDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementCompact
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var _attributes: js.UndefOr[Attributes] = js.undefined
  var _cdata: js.UndefOr[java.lang.String] = js.undefined
  var _comment: js.UndefOr[java.lang.String] = js.undefined
  var _declaration: js.UndefOr[xmlDashJsLib.Anon_Attributes] = js.undefined
  var _doctype: js.UndefOr[java.lang.String] = js.undefined
  var _instruction: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var _text: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object ElementCompact {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    _attributes: Attributes = null,
    _cdata: java.lang.String = null,
    _comment: java.lang.String = null,
    _declaration: xmlDashJsLib.Anon_Attributes = null,
    _doctype: java.lang.String = null,
    _instruction: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    _text: java.lang.String | scala.Double = null
  ): ElementCompact = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_attributes != null) __obj.updateDynamic("_attributes")(_attributes)
    if (_cdata != null) __obj.updateDynamic("_cdata")(_cdata)
    if (_comment != null) __obj.updateDynamic("_comment")(_comment)
    if (_declaration != null) __obj.updateDynamic("_declaration")(_declaration)
    if (_doctype != null) __obj.updateDynamic("_doctype")(_doctype)
    if (_instruction != null) __obj.updateDynamic("_instruction")(_instruction)
    if (_text != null) __obj.updateDynamic("_text")(_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCompact]
  }
}

