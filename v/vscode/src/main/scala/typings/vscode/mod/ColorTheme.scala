package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorTheme extends js.Object {
  /**
    * The kind of this color theme: light, dark or high contrast.
    */
  val kind: ColorThemeKind = js.native
}

object ColorTheme {
  @scala.inline
  def apply(kind: ColorThemeKind): ColorTheme = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorTheme]
  }
  @scala.inline
  implicit class ColorThemeOps[Self <: ColorTheme] (val x: Self) extends AnyVal {
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
    def setKind(value: ColorThemeKind): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

