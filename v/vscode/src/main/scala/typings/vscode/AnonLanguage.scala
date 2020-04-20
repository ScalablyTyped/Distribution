package typings.vscode

import typings.vscode.mod._MarkedString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLanguage extends _MarkedString {
  var language: String
  var value: String
}

object AnonLanguage {
  @scala.inline
  def apply(language: String, value: String): AnonLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLanguage]
  }
}

