package typings.winrt.Windows.UI.Text

import typings.winrt.Windows.UI.Color
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
    val __obj = js.Dynamic.literal(autoColor = autoColor.asInstanceOf[js.Any], maxUnitCount = maxUnitCount.asInstanceOf[js.Any], minUnitCount = minUnitCount.asInstanceOf[js.Any], undefinedColor = undefinedColor.asInstanceOf[js.Any], undefinedFloatValue = undefinedFloatValue.asInstanceOf[js.Any], undefinedFontStretch = undefinedFontStretch.asInstanceOf[js.Any], undefinedFontStyle = undefinedFontStyle.asInstanceOf[js.Any], undefinedInt32Value = undefinedInt32Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextConstantsStatics]
  }
}

