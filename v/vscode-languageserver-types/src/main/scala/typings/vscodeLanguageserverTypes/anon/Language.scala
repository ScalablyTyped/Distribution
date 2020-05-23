package typings.vscodeLanguageserverTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
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

