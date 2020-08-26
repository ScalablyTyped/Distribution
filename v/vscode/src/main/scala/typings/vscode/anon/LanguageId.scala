package typings.vscode.anon

import typings.vscode.mod.ConfigurationScope
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageId extends ConfigurationScope {
  var languageId: String = js.native
  var uri: js.UndefOr[Uri] = js.native
}

object LanguageId {
  @scala.inline
  def apply(languageId: String): LanguageId = {
    val __obj = js.Dynamic.literal(languageId = languageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageId]
  }
  @scala.inline
  implicit class LanguageIdOps[Self <: LanguageId] (val x: Self) extends AnyVal {
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
    def setLanguageId(value: String): Self = this.set("languageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: Uri): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

