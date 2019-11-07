package typings.themeDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.themeDashUi.themeDashUiMod.ColorMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_K extends js.Object {
  /**
    * Nested color modes can provide overrides when used in conjunction with
    * `Theme.initialColorMode and `useColorMode()`
    */
  var modes: js.UndefOr[StringDictionary[ColorMode]] = js.undefined
}

object Anon_K {
  @scala.inline
  def apply(modes: StringDictionary[ColorMode] = null): Anon_K = {
    val __obj = js.Dynamic.literal()
    if (modes != null) __obj.updateDynamic("modes")(modes)
    __obj.asInstanceOf[Anon_K]
  }
}

