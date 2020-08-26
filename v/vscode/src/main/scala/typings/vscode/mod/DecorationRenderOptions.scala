package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorationRenderOptions extends ThemableDecorationRenderOptions {
  /**
    * Overwrite options for dark themes.
    */
  var dark: js.UndefOr[ThemableDecorationRenderOptions] = js.native
  /**
    * Should the decoration be rendered also on the whitespace after the line text.
    * Defaults to `false`.
    */
  var isWholeLine: js.UndefOr[Boolean] = js.native
  /**
    * Overwrite options for light themes.
    */
  var light: js.UndefOr[ThemableDecorationRenderOptions] = js.native
  /**
    * The position in the overview ruler where the decoration should be rendered.
    */
  var overviewRulerLane: js.UndefOr[OverviewRulerLane] = js.native
  /**
    * Customize the growing behavior of the decoration when edits occur at the edges of the decoration's range.
    * Defaults to `DecorationRangeBehavior.OpenOpen`.
    */
  var rangeBehavior: js.UndefOr[DecorationRangeBehavior] = js.native
}

object DecorationRenderOptions {
  @scala.inline
  def apply(): DecorationRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorationRenderOptions]
  }
  @scala.inline
  implicit class DecorationRenderOptionsOps[Self <: DecorationRenderOptions] (val x: Self) extends AnyVal {
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
    def setDark(value: ThemableDecorationRenderOptions): Self = this.set("dark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDark: Self = this.set("dark", js.undefined)
    @scala.inline
    def setIsWholeLine(value: Boolean): Self = this.set("isWholeLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsWholeLine: Self = this.set("isWholeLine", js.undefined)
    @scala.inline
    def setLight(value: ThemableDecorationRenderOptions): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLight: Self = this.set("light", js.undefined)
    @scala.inline
    def setOverviewRulerLane(value: OverviewRulerLane): Self = this.set("overviewRulerLane", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverviewRulerLane: Self = this.set("overviewRulerLane", js.undefined)
    @scala.inline
    def setRangeBehavior(value: DecorationRangeBehavior): Self = this.set("rangeBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeBehavior: Self = this.set("rangeBehavior", js.undefined)
  }
  
}

