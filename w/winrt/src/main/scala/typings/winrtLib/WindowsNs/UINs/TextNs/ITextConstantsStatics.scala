package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextConstantsStatics extends js.Object {
  var autoColor: winrtLib.WindowsNs.UINs.Color
  var maxUnitCount: scala.Double
  var minUnitCount: scala.Double
  var undefinedColor: winrtLib.WindowsNs.UINs.Color
  var undefinedFloatValue: scala.Double
  var undefinedFontStretch: FontStretch
  var undefinedFontStyle: FontStyle
  var undefinedInt32Value: scala.Double
}

object ITextConstantsStatics {
  @scala.inline
  def apply(
    autoColor: winrtLib.WindowsNs.UINs.Color,
    maxUnitCount: scala.Double,
    minUnitCount: scala.Double,
    undefinedColor: winrtLib.WindowsNs.UINs.Color,
    undefinedFloatValue: scala.Double,
    undefinedFontStretch: FontStretch,
    undefinedFontStyle: FontStyle,
    undefinedInt32Value: scala.Double
  ): ITextConstantsStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoColor")(autoColor)
    __obj.updateDynamic("maxUnitCount")(maxUnitCount)
    __obj.updateDynamic("minUnitCount")(minUnitCount)
    __obj.updateDynamic("undefinedColor")(undefinedColor)
    __obj.updateDynamic("undefinedFloatValue")(undefinedFloatValue)
    __obj.updateDynamic("undefinedFontStretch")(undefinedFontStretch)
    __obj.updateDynamic("undefinedFontStyle")(undefinedFontStyle)
    __obj.updateDynamic("undefinedInt32Value")(undefinedInt32Value)
    __obj.asInstanceOf[ITextConstantsStatics]
  }
}

