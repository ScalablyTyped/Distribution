package typings.vscode.anon

import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  /**
    * A target URI to open with more information about the diagnostic error.
    */
  var target: Uri
  /**
    * A code or identifier for this diagnostic.
    * Should be used for later processing, e.g. when providing [code actions](#CodeActionContext).
    */
  var value: String | Double
}

object Target {
  @scala.inline
  def apply(target: Uri, value: String | Double): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

