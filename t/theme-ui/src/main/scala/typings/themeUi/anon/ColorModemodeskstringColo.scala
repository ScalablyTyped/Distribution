package typings.themeUi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.ColorProperty
import typings.themeUi.mod.ColorMode
import typings.themeUi.mod.ObjectOrArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined theme-ui.theme-ui.ColorMode & {  modes ? :{[k: string] : theme-ui.theme-ui.ColorMode}} */
trait ColorModemodeskstringColo extends /* k */ StringDictionary[ColorProperty | ObjectOrArray[ColorProperty]] {
  /**
    * A contrast color for emphasizing UI
    */
  var accent: js.UndefOr[ColorProperty] = js.undefined
  /**
    * Body background color
    */
  var background: ColorProperty
  /**
    * Nested color modes can provide overrides when used in conjunction with
    * `Theme.initialColorModeName and `useColorMode()`
    */
  var modes: js.UndefOr[StringDictionary[ColorMode]] = js.undefined
  /**
    * A faint color for backgrounds, borders, and accents that do not require
    * high contrast with the background color
    */
  var muted: js.UndefOr[ColorProperty] = js.undefined
  /**
    * Primary brand color for links, buttons, etc.
    */
  var primary: js.UndefOr[ColorProperty] = js.undefined
  /**
    * A secondary brand color for alternative styling
    */
  var secondary: js.UndefOr[ColorProperty] = js.undefined
  /**
    * Body foreground color
    */
  var text: ColorProperty
}

object ColorModemodeskstringColo {
  @scala.inline
  def apply(
    background: ColorProperty,
    text: ColorProperty,
    StringDictionary: /* k */ StringDictionary[ColorProperty | ObjectOrArray[ColorProperty]] = null,
    accent: ColorProperty = null,
    modes: StringDictionary[ColorMode] = null,
    muted: ColorProperty = null,
    primary: ColorProperty = null,
    secondary: ColorProperty = null
  ): ColorModemodeskstringColo = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accent != null) __obj.updateDynamic("accent")(accent.asInstanceOf[js.Any])
    if (modes != null) __obj.updateDynamic("modes")(modes.asInstanceOf[js.Any])
    if (muted != null) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorModemodeskstringColo]
  }
}

