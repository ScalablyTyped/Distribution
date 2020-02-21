package typings.themeUi

import org.scalablytyped.runtime.StringDictionary
import typings.themeUi.mod.ColorMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonK extends js.Object {
  /**
    * Nested color modes can provide overrides when used in conjunction with
    * `Theme.initialColorModeName and `useColorMode()`
    */
  var modes: js.UndefOr[StringDictionary[ColorMode]] = js.undefined
}

object AnonK {
  @scala.inline
  def apply(modes: StringDictionary[ColorMode] = null): AnonK = {
    val __obj = js.Dynamic.literal()
    if (modes != null) __obj.updateDynamic("modes")(modes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonK]
  }
}

