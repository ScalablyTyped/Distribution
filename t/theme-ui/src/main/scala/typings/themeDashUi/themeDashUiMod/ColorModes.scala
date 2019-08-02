package typings.themeDashUi.themeDashUiMod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.csstypeMod.ColorProperty
import typings.std.Partial
import typings.themeDashUi.Omit
import typings.themeDashUi.themeDashUiStrings.modes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorModes
  extends /* k */ StringDictionary[
      Partial[
        Omit[
          js.UndefOr[typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[ColorProperty]], 
          modes
        ]
      ]
    ] {
  /**
    * This is required for the color mode.
    */
  var background: String
  /**
    * This is required for a color mode.
    */
  var text: String
}

object ColorModes {
  @scala.inline
  def apply(
    background: String,
    text: String,
    StringDictionary: /* k */ StringDictionary[
      Partial[
        Omit[
          js.UndefOr[typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[ColorProperty]], 
          modes
        ]
      ]
    ] = null
  ): ColorModes = {
    val __obj = js.Dynamic.literal(background = background, text = text)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ColorModes]
  }
}

