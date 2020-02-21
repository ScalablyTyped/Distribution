package typings.vscode

import typings.vscode.mod.ConfigurationScope
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLanguageId extends ConfigurationScope {
  var languageId: String
  var uri: js.UndefOr[Uri] = js.undefined
}

object AnonLanguageId {
  @scala.inline
  def apply(languageId: String, uri: Uri = null): AnonLanguageId = {
    val __obj = js.Dynamic.literal(languageId = languageId.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLanguageId]
  }
}

