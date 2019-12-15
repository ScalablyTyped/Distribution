package typings.vscode

import typings.vscode.vscodeMod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewUri extends js.Object {
  var newUri: Uri
  var oldUri: Uri
}

object Anon_NewUri {
  @scala.inline
  def apply(newUri: Uri, oldUri: Uri): Anon_NewUri = {
    val __obj = js.Dynamic.literal(newUri = newUri.asInstanceOf[js.Any], oldUri = oldUri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NewUri]
  }
}

