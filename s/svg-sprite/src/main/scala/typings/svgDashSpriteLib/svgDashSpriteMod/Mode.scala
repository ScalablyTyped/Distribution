package typings
package svgDashSpriteLib.svgDashSpriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode
  extends /* customConfigName */ org.scalablytyped.runtime.StringDictionary[ModeConfig | scala.Boolean] {
  var css: js.UndefOr[CssAndViewSpecificModeConfig | scala.Boolean] = js.undefined
  var defs: js.UndefOr[DefsAndSymbolSpecificModeConfig | scala.Boolean] = js.undefined
  var stack: js.UndefOr[ModeConfig | scala.Boolean] = js.undefined
  var symbol: js.UndefOr[DefsAndSymbolSpecificModeConfig | scala.Boolean] = js.undefined
  var view: js.UndefOr[CssAndViewSpecificModeConfig | scala.Boolean] = js.undefined
}

object Mode {
  @scala.inline
  def apply(
    StringDictionary: /* customConfigName */ org.scalablytyped.runtime.StringDictionary[ModeConfig | scala.Boolean] = null,
    css: CssAndViewSpecificModeConfig | scala.Boolean = null,
    defs: DefsAndSymbolSpecificModeConfig | scala.Boolean = null,
    stack: ModeConfig | scala.Boolean = null,
    symbol: DefsAndSymbolSpecificModeConfig | scala.Boolean = null,
    view: CssAndViewSpecificModeConfig | scala.Boolean = null
  ): Mode = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

