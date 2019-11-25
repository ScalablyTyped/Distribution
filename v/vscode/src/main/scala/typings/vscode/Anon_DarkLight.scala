package typings.vscode

import typings.vscode.vscodeMod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DarkLight extends js.Object {
  var dark: Uri
  var light: Uri
}

object Anon_DarkLight {
  @scala.inline
  def apply(dark: Uri, light: Uri): Anon_DarkLight = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DarkLight]
  }
}

