package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorSettings extends js.Object {
  var baseIndentSize: js.UndefOr[Double] = js.native
  var convertTabsToSpaces: js.UndefOr[Boolean] = js.native
  var indentSize: js.UndefOr[Double] = js.native
  var indentStyle: js.UndefOr[IndentStyle] = js.native
  var newLineCharacter: js.UndefOr[java.lang.String] = js.native
  var tabSize: js.UndefOr[Double] = js.native
  var trimTrailingWhitespace: js.UndefOr[Boolean] = js.native
}

object EditorSettings {
  @scala.inline
  def apply(): EditorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorSettings]
  }
  @scala.inline
  implicit class EditorSettingsOps[Self <: EditorSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseIndentSize(value: Double): Self = this.set("baseIndentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseIndentSize: Self = this.set("baseIndentSize", js.undefined)
    @scala.inline
    def setConvertTabsToSpaces(value: Boolean): Self = this.set("convertTabsToSpaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvertTabsToSpaces: Self = this.set("convertTabsToSpaces", js.undefined)
    @scala.inline
    def setIndentSize(value: Double): Self = this.set("indentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentSize: Self = this.set("indentSize", js.undefined)
    @scala.inline
    def setIndentStyle(value: IndentStyle): Self = this.set("indentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentStyle: Self = this.set("indentStyle", js.undefined)
    @scala.inline
    def setNewLineCharacter(value: java.lang.String): Self = this.set("newLineCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewLineCharacter: Self = this.set("newLineCharacter", js.undefined)
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    @scala.inline
    def setTrimTrailingWhitespace(value: Boolean): Self = this.set("trimTrailingWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrimTrailingWhitespace: Self = this.set("trimTrailingWhitespace", js.undefined)
  }
  
}

