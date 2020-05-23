package typings.vscode.anon

import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dark extends js.Object {
  var dark: Uri
  var light: Uri
}

object Dark {
  @scala.inline
  def apply(dark: Uri, light: Uri): Dark = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dark]
  }
}

