package typings.winrt.Windows.Globalization.Fonts

import typings.winrt.Windows.UI.Text.FontStretch
import typings.winrt.Windows.UI.Text.FontStyle
import typings.winrt.Windows.UI.Text.FontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageFont extends js.Object {
  var fontFamily: String
  var fontStretch: FontStretch
  var fontStyle: FontStyle
  var fontWeight: FontWeight
  var scaleFactor: Double
}

object ILanguageFont {
  @scala.inline
  def apply(
    fontFamily: String,
    fontStretch: FontStretch,
    fontStyle: FontStyle,
    fontWeight: FontWeight,
    scaleFactor: Double
  ): ILanguageFont = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily, fontStretch = fontStretch, fontStyle = fontStyle, fontWeight = fontWeight, scaleFactor = scaleFactor)
  
    __obj.asInstanceOf[ILanguageFont]
  }
}

