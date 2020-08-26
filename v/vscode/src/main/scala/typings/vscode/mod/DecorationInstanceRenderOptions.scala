package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorationInstanceRenderOptions extends ThemableDecorationInstanceRenderOptions {
  /**
    * Overwrite options for dark themes.
    */
  var dark: js.UndefOr[ThemableDecorationInstanceRenderOptions] = js.native
  /**
    * Overwrite options for light themes.
    */
  var light: js.UndefOr[ThemableDecorationInstanceRenderOptions] = js.native
}

object DecorationInstanceRenderOptions {
  @scala.inline
  def apply(): DecorationInstanceRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorationInstanceRenderOptions]
  }
  @scala.inline
  implicit class DecorationInstanceRenderOptionsOps[Self <: DecorationInstanceRenderOptions] (val x: Self) extends AnyVal {
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
    def setDark(value: ThemableDecorationInstanceRenderOptions): Self = this.set("dark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDark: Self = this.set("dark", js.undefined)
    @scala.inline
    def setLight(value: ThemableDecorationInstanceRenderOptions): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLight: Self = this.set("light", js.undefined)
  }
  
}

