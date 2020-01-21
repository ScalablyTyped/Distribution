package typings.themeUi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.csstype.mod.ColorProperty
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorMode extends /* k */ StringDictionary[ColorProperty | ObjectOrArray[ColorProperty]] {
  /**
    * A contrast color for emphasizing UI
    */
  var accent: js.UndefOr[ColorProperty] = js.undefined
  /**
    * Body background color
    */
  var background: ColorProperty
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

@JSImport("theme-ui", "ColorMode")
@js.native
object ColorMode
  extends TopLevel[ComponentType[js.Object]]

