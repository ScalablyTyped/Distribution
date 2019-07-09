package typings
package atStyledDashSystemCssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamily extends js.Object {
  var fontFamily: csstypeLib.csstypeMod.FontFamilyProperty
  var fontSize: csstypeLib.csstypeMod.FontSizeProperty[scala.Double]
  var fontWeight: csstypeLib.csstypeMod.FontWeightProperty | java.lang.String
  var letterSpacing: csstypeLib.csstypeMod.LetterSpacingProperty[java.lang.String | scala.Double]
  var lineHeight: csstypeLib.csstypeMod.LineHeightProperty[java.lang.String]
}

object Anon_FontFamily {
  @scala.inline
  def apply(
    fontFamily: csstypeLib.csstypeMod.FontFamilyProperty,
    fontSize: csstypeLib.csstypeMod.FontSizeProperty[scala.Double],
    fontWeight: csstypeLib.csstypeMod.FontWeightProperty | java.lang.String,
    letterSpacing: csstypeLib.csstypeMod.LetterSpacingProperty[java.lang.String | scala.Double],
    lineHeight: csstypeLib.csstypeMod.LineHeightProperty[java.lang.String]
  ): Anon_FontFamily = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FontFamily]
  }
}

