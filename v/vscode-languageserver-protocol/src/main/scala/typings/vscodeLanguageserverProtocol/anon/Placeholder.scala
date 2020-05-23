package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placeholder extends js.Object {
  var placeholder: String
  var range: typings.vscodeLanguageserverTypes.mod.Range
}

object Placeholder {
  @scala.inline
  def apply(placeholder: String, range: typings.vscodeLanguageserverTypes.mod.Range): Placeholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
}

