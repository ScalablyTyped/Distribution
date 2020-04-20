package typings.vscodeLanguageserverProtocol

import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlaceholder extends js.Object {
  var placeholder: String
  var range: Range
}

object AnonPlaceholder {
  @scala.inline
  def apply(placeholder: String, range: Range): AnonPlaceholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlaceholder]
  }
}

