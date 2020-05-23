package typings.vscode.anon

import typings.vscode.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placeholder extends js.Object {
  var placeholder: String
  var range: Range
}

object Placeholder {
  @scala.inline
  def apply(placeholder: String, range: Range): Placeholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
}

