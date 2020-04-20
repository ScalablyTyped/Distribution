package typings.vscode

import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewUri extends js.Object {
  var newUri: Uri
  var oldUri: Uri
}

object AnonNewUri {
  @scala.inline
  def apply(newUri: Uri, oldUri: Uri): AnonNewUri = {
    val __obj = js.Dynamic.literal(newUri = newUri.asInstanceOf[js.Any], oldUri = oldUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewUri]
  }
}

