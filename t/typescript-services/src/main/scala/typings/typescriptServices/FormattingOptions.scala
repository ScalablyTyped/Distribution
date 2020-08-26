package typings.typescriptServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattingOptions extends js.Object {
  var indentSpaces: Double = js.native
  var newLineCharacter: String = js.native
  var spacesPerTab: Double = js.native
  var useTabs: Boolean = js.native
}

object FormattingOptions {
  @scala.inline
  def apply(indentSpaces: Double, newLineCharacter: String, spacesPerTab: Double, useTabs: Boolean): FormattingOptions = {
    val __obj = js.Dynamic.literal(indentSpaces = indentSpaces.asInstanceOf[js.Any], newLineCharacter = newLineCharacter.asInstanceOf[js.Any], spacesPerTab = spacesPerTab.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattingOptions]
  }
  @scala.inline
  implicit class FormattingOptionsOps[Self <: FormattingOptions] (val x: Self) extends AnyVal {
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
    def setIndentSpaces(value: Double): Self = this.set("indentSpaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewLineCharacter(value: String): Self = this.set("newLineCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpacesPerTab(value: Double): Self = this.set("spacesPerTab", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseTabs(value: Boolean): Self = this.set("useTabs", value.asInstanceOf[js.Any])
  }
  
}

