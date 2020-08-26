package typings.xmlJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementCompact
  extends /* key */ StringDictionary[js.Any] {
  var _attributes: js.UndefOr[Attributes] = js.native
  var _cdata: js.UndefOr[String] = js.native
  var _comment: js.UndefOr[String] = js.native
  var _declaration: js.UndefOr[typings.xmlJs.anon.Attributes] = js.native
  var _doctype: js.UndefOr[String] = js.native
  var _instruction: js.UndefOr[StringDictionary[String]] = js.native
  var _text: js.UndefOr[String | Double] = js.native
}

object ElementCompact {
  @scala.inline
  def apply(): ElementCompact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementCompact]
  }
  @scala.inline
  implicit class ElementCompactOps[Self <: ElementCompact] (val x: Self) extends AnyVal {
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
    def set_attributes(value: Attributes): Self = this.set("_attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_attributes: Self = this.set("_attributes", js.undefined)
    @scala.inline
    def set_cdata(value: String): Self = this.set("_cdata", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_cdata: Self = this.set("_cdata", js.undefined)
    @scala.inline
    def set_comment(value: String): Self = this.set("_comment", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_comment: Self = this.set("_comment", js.undefined)
    @scala.inline
    def set_declaration(value: typings.xmlJs.anon.Attributes): Self = this.set("_declaration", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_declaration: Self = this.set("_declaration", js.undefined)
    @scala.inline
    def set_doctype(value: String): Self = this.set("_doctype", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_doctype: Self = this.set("_doctype", js.undefined)
    @scala.inline
    def set_instruction(value: StringDictionary[String]): Self = this.set("_instruction", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_instruction: Self = this.set("_instruction", js.undefined)
    @scala.inline
    def set_text(value: String | Double): Self = this.set("_text", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_text: Self = this.set("_text", js.undefined)
  }
  
}

