package typings.vscode.anon

import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewUri extends js.Object {
  var newUri: Uri
  var oldUri: Uri
}

object NewUri {
  @scala.inline
  def apply(newUri: Uri, oldUri: Uri): NewUri = {
    val __obj = js.Dynamic.literal(newUri = newUri.asInstanceOf[js.Any], oldUri = oldUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewUri]
  }
}

