package typings.vscode

import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDarkLight extends js.Object {
  var dark: Uri
  var light: Uri
}

object AnonDarkLight {
  @scala.inline
  def apply(dark: Uri, light: Uri): AnonDarkLight = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDarkLight]
  }
}

