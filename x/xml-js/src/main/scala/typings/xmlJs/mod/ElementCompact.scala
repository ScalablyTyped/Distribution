package typings.xmlJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementCompact
  extends /* key */ StringDictionary[js.Any] {
  var _attributes: js.UndefOr[Attributes] = js.undefined
  var _cdata: js.UndefOr[String] = js.undefined
  var _comment: js.UndefOr[String] = js.undefined
  var _declaration: js.UndefOr[typings.xmlJs.anon.Attributes] = js.undefined
  var _doctype: js.UndefOr[String] = js.undefined
  var _instruction: js.UndefOr[StringDictionary[String]] = js.undefined
  var _text: js.UndefOr[String | Double] = js.undefined
}

object ElementCompact {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    _attributes: Attributes = null,
    _cdata: String = null,
    _comment: String = null,
    _declaration: typings.xmlJs.anon.Attributes = null,
    _doctype: String = null,
    _instruction: StringDictionary[String] = null,
    _text: String | Double = null
  ): ElementCompact = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_attributes != null) __obj.updateDynamic("_attributes")(_attributes.asInstanceOf[js.Any])
    if (_cdata != null) __obj.updateDynamic("_cdata")(_cdata.asInstanceOf[js.Any])
    if (_comment != null) __obj.updateDynamic("_comment")(_comment.asInstanceOf[js.Any])
    if (_declaration != null) __obj.updateDynamic("_declaration")(_declaration.asInstanceOf[js.Any])
    if (_doctype != null) __obj.updateDynamic("_doctype")(_doctype.asInstanceOf[js.Any])
    if (_instruction != null) __obj.updateDynamic("_instruction")(_instruction.asInstanceOf[js.Any])
    if (_text != null) __obj.updateDynamic("_text")(_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCompact]
  }
}

