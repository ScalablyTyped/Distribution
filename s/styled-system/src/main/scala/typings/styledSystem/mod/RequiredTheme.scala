package typings.styledSystem.mod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.BorderProperty
import typings.csstype.mod.BorderRadiusProperty
import typings.csstype.mod.BorderWidthProperty
import typings.csstype.mod.BoxShadowProperty
import typings.csstype.mod.ColorProperty
import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontSizeProperty
import typings.csstype.mod.FontWeightProperty
import typings.csstype.mod.HeightProperty
import typings.csstype.mod.LetterSpacingProperty
import typings.csstype.mod.LineHeightProperty
import typings.csstype.mod.MarginProperty
import typings.csstype.mod.StandardProperties
import typings.csstype.mod.WidthProperty
import typings.csstype.mod.ZIndexProperty
import typings.styledSystem.styledSystemNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<styled-system.styled-system.Theme<styled-system.styled-system.TLengthStyledSystem>> */
trait RequiredTheme extends js.Object {
  var borderStyles: ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]
  var borderWidths: ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], /* keyof any */ String]
  var borders: ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]
  var breakpoints: ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]
  var buttons: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
  var colorStyles: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
  var colors: ObjectOrArray[ColorProperty, /* keyof any */ String]
  var fontSizes: ObjectOrArray[FontSizeProperty[Double], /* keyof any */ String]
  var fontWeights: ObjectOrArray[FontWeightProperty, /* keyof any */ String]
  var fonts: ObjectOrArray[FontFamilyProperty, /* keyof any */ String]
  var letterSpacings: ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], /* keyof any */ String]
  var lineHeights: ObjectOrArray[LineHeightProperty[TLengthStyledSystem], /* keyof any */ String]
  var mediaQueries: StringDictionary[String]
  var radii: ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], /* keyof any */ String]
  var shadows: ObjectOrArray[BoxShadowProperty, /* keyof any */ String]
  var sizes: ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], /* keyof any */ String]
  var space: ObjectOrArray[MarginProperty[Double | String], /* keyof any */ String]
  var textStyles: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
  var zIndices: ObjectOrArray[ZIndexProperty, /* keyof any */ String]
}

object RequiredTheme {
  @scala.inline
  def apply(
    borderStyles: ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String],
    borderWidths: ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], /* keyof any */ String],
    borders: ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String],
    breakpoints: ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String],
    buttons: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String],
    colorStyles: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String],
    colors: ObjectOrArray[ColorProperty, /* keyof any */ String],
    fontSizes: ObjectOrArray[FontSizeProperty[Double], /* keyof any */ String],
    fontWeights: ObjectOrArray[FontWeightProperty, /* keyof any */ String],
    fonts: ObjectOrArray[FontFamilyProperty, /* keyof any */ String],
    letterSpacings: ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], /* keyof any */ String],
    lineHeights: ObjectOrArray[LineHeightProperty[TLengthStyledSystem], /* keyof any */ String],
    mediaQueries: StringDictionary[String],
    radii: ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], /* keyof any */ String],
    shadows: ObjectOrArray[BoxShadowProperty, /* keyof any */ String],
    sizes: ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], /* keyof any */ String],
    space: ObjectOrArray[MarginProperty[Double | String], /* keyof any */ String],
    textStyles: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String],
    zIndices: ObjectOrArray[ZIndexProperty, /* keyof any */ String]
  ): RequiredTheme = {
    val __obj = js.Dynamic.literal(borderStyles = borderStyles.asInstanceOf[js.Any], borderWidths = borderWidths.asInstanceOf[js.Any], borders = borders.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], colorStyles = colorStyles.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], fontSizes = fontSizes.asInstanceOf[js.Any], fontWeights = fontWeights.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], letterSpacings = letterSpacings.asInstanceOf[js.Any], lineHeights = lineHeights.asInstanceOf[js.Any], mediaQueries = mediaQueries.asInstanceOf[js.Any], radii = radii.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], textStyles = textStyles.asInstanceOf[js.Any], zIndices = zIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredTheme]
  }
}

