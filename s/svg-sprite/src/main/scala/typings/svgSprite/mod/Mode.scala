package typings.svgSprite.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mode extends /* customConfigName */ StringDictionary[ModeConfig | Boolean] {
  var css: js.UndefOr[CssAndViewSpecificModeConfig | Boolean] = js.native
  var defs: js.UndefOr[DefsAndSymbolSpecificModeConfig | Boolean] = js.native
  var stack: js.UndefOr[ModeConfig | Boolean] = js.native
  var symbol: js.UndefOr[DefsAndSymbolSpecificModeConfig | Boolean] = js.native
  var view: js.UndefOr[CssAndViewSpecificModeConfig | Boolean] = js.native
}

object Mode {
  @scala.inline
  def apply(): Mode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mode]
  }
  @scala.inline
  implicit class ModeOps[Self <: Mode] (val x: Self) extends AnyVal {
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
    def setCss(value: CssAndViewSpecificModeConfig | Boolean): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setDefs(value: DefsAndSymbolSpecificModeConfig | Boolean): Self = this.set("defs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefs: Self = this.set("defs", js.undefined)
    @scala.inline
    def setStack(value: ModeConfig | Boolean): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setSymbol(value: DefsAndSymbolSpecificModeConfig | Boolean): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setView(value: CssAndViewSpecificModeConfig | Boolean): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

