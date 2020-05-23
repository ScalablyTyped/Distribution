package typings.winrtUwp.Windows.Globalization.Fonts

import typings.winrtUwp.Windows.UI.Text.FontStretch
import typings.winrtUwp.Windows.UI.Text.FontStyle
import typings.winrtUwp.Windows.UI.Text.FontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data related to a particular font recommendation for a given language. */
trait LanguageFont extends js.Object {
  /** Gets the family name of the font. */
  var fontFamily: String
  /** Gets the FontStretch property of the font. */
  var fontStretch: FontStretch
  /** Gets the FontStyle property of the font. */
  var fontStyle: FontStyle
  /** Gets the weight of the font ( FontWeight ). */
  var fontWeight: FontWeight
  /** Gets a recommended font size scaling factor for the font. */
  var scaleFactor: Double
}

object LanguageFont {
  @scala.inline
  def apply(
    fontFamily: String,
    fontStretch: FontStretch,
    fontStyle: FontStyle,
    fontWeight: FontWeight,
    scaleFactor: Double
  ): LanguageFont = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageFont]
  }
}

