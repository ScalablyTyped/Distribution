package typings.vscode

import typings.vscode.vscodeMod._MarkedString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Language extends _MarkedString {
  var language: String
  var value: String
}

object Anon_Language {
  @scala.inline
  def apply(language: String, value: String): Anon_Language = {
    val __obj = js.Dynamic.literal(language = language, value = value)
  
    __obj.asInstanceOf[Anon_Language]
  }
}

