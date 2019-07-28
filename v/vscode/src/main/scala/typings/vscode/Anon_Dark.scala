package typings.vscode

import typings.vscode.vscodeMod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dark extends js.Object {
  var dark: String | Uri
  var light: String | Uri
}

object Anon_Dark {
  @scala.inline
  def apply(dark: String | Uri, light: String | Uri): Anon_Dark = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dark]
  }
}

