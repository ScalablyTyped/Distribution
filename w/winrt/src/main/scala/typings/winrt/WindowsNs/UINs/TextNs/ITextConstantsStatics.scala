package typings.winrt.WindowsNs.UINs.TextNs

import typings.winrt.WindowsNs.UINs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextConstantsStatics extends js.Object {
  var autoColor: Color
  var maxUnitCount: Double
  var minUnitCount: Double
  var undefinedColor: Color
  var undefinedFloatValue: Double
  var undefinedFontStretch: FontStretch
  var undefinedFontStyle: FontStyle
  var undefinedInt32Value: Double
}

object ITextConstantsStatics {
  @scala.inline
  def apply(
    autoColor: Color,
    maxUnitCount: Double,
    minUnitCount: Double,
    undefinedColor: Color,
    undefinedFloatValue: Double,
    undefinedFontStretch: FontStretch,
    undefinedFontStyle: FontStyle,
    undefinedInt32Value: Double
  ): ITextConstantsStatics = {
    val __obj = js.Dynamic.literal(autoColor = autoColor, maxUnitCount = maxUnitCount, minUnitCount = minUnitCount, undefinedColor = undefinedColor, undefinedFloatValue = undefinedFloatValue, undefinedFontStretch = undefinedFontStretch, undefinedFontStyle = undefinedFontStyle, undefinedInt32Value = undefinedInt32Value)
  
    __obj.asInstanceOf[ITextConstantsStatics]
  }
}

