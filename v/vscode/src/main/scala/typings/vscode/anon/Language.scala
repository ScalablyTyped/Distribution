package typings.vscode.anon

import typings.vscode.mod._MarkedString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends _MarkedString {
  var language: String
  var value: String
}

object Language {
  @scala.inline
  def apply(language: String, value: String): Language = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
}

