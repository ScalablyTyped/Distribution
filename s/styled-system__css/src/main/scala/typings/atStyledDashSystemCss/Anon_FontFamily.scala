package typings.atStyledDashSystemCss

import typings.csstype.csstypeMod.FontFamilyProperty
import typings.csstype.csstypeMod.FontSizeProperty
import typings.csstype.csstypeMod.FontWeightProperty
import typings.csstype.csstypeMod.LetterSpacingProperty
import typings.csstype.csstypeMod.LineHeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamily extends js.Object {
  var fontFamily: FontFamilyProperty
  var fontSize: FontSizeProperty[Double]
  var fontWeight: FontWeightProperty | String
  var letterSpacing: LetterSpacingProperty[String | Double]
  var lineHeight: LineHeightProperty[String]
}

object Anon_FontFamily {
  @scala.inline
  def apply(
    fontFamily: FontFamilyProperty,
    fontSize: FontSizeProperty[Double],
    fontWeight: FontWeightProperty | String,
    letterSpacing: LetterSpacingProperty[String | Double],
    lineHeight: LineHeightProperty[String]
  ): Anon_FontFamily = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FontFamily]
  }
}

