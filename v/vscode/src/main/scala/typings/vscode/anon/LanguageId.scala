package typings.vscode.anon

import typings.vscode.mod.ConfigurationScope
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageId extends ConfigurationScope {
  var languageId: String
  var uri: js.UndefOr[Uri] = js.undefined
}

object LanguageId {
  @scala.inline
  def apply(languageId: String, uri: Uri = null): LanguageId = {
    val __obj = js.Dynamic.literal(languageId = languageId.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageId]
  }
}

