package typings.themeDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.csstypeMod.ColorProperty
import typings.std.Partial
import typings.styledDashSystem.styledDashSystemMod.ObjectOrArray
import typings.themeDashUi.themeDashUiStrings.modes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background
  extends /* k */ StringDictionary[Partial[Omit[js.UndefOr[ObjectOrArray[ColorProperty]], modes]]] {
  /**
    * This is required for the color mode.
    */
  var background: String
  /**
    * This is required for a color mode.
    */
  var text: String
}

object Anon_Background {
  @scala.inline
  def apply(
    background: String,
    text: String,
    StringDictionary: /* k */ StringDictionary[Partial[Omit[js.UndefOr[ObjectOrArray[ColorProperty]], modes]]] = null
  ): Anon_Background = {
    val __obj = js.Dynamic.literal(background = background, text = text)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Background]
  }
}

