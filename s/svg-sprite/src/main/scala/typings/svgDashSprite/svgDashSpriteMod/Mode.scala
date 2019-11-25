package typings.svgDashSprite.svgDashSpriteMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends /* customConfigName */ StringDictionary[ModeConfig | Boolean] {
  var css: js.UndefOr[CssAndViewSpecificModeConfig | Boolean] = js.undefined
  var defs: js.UndefOr[DefsAndSymbolSpecificModeConfig | Boolean] = js.undefined
  var stack: js.UndefOr[ModeConfig | Boolean] = js.undefined
  var symbol: js.UndefOr[DefsAndSymbolSpecificModeConfig | Boolean] = js.undefined
  var view: js.UndefOr[CssAndViewSpecificModeConfig | Boolean] = js.undefined
}

object Mode {
  @scala.inline
  def apply(
    StringDictionary: /* customConfigName */ StringDictionary[ModeConfig | Boolean] = null,
    css: CssAndViewSpecificModeConfig | Boolean = null,
    defs: DefsAndSymbolSpecificModeConfig | Boolean = null,
    stack: ModeConfig | Boolean = null,
    symbol: DefsAndSymbolSpecificModeConfig | Boolean = null,
    view: CssAndViewSpecificModeConfig | Boolean = null
  ): Mode = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

