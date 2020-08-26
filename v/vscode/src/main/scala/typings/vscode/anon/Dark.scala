package typings.vscode.anon

import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dark extends js.Object {
  var dark: Uri = js.native
  var light: Uri = js.native
}

object Dark {
  @scala.inline
  def apply(dark: Uri, light: Uri): Dark = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dark]
  }
  @scala.inline
  implicit class DarkOps[Self <: Dark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDark(value: Uri): Self = this.set("dark", value.asInstanceOf[js.Any])
    @scala.inline
    def setLight(value: Uri): Self = this.set("light", value.asInstanceOf[js.Any])
  }
  
}

