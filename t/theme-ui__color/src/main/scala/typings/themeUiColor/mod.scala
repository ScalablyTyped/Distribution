package typings.themeUiColor

import typings.polished.FnCall
import typings.polished.colorMod.ContrastScores
import typings.polished.colorMod.HslColor
import typings.polished.colorMod.HslaColor
import typings.polished.colorMod.RgbColor
import typings.polished.colorMod.RgbaColor
import typings.polished.fluidRangeConfigurationMod.FluidRangeConfiguration
import typings.polished.fontFaceConfigurationMod.FontFaceConfiguration
import typings.polished.interactionStateMod.InteractionState
import typings.polished.linearGradientConfigurationMod.LinearGradientConfiguration
import typings.polished.modularScaleRatioMod.ModularScaleRatio
import typings.polished.radialGradientConfigurationMod.RadialGradientConfiguration
import typings.polished.sideKeywordMod.SideKeyword
import typings.polished.styleMod.Styles
import typings.polished.timingFunctionMod.TimingFunction
import typings.polished.triangleConfigurationMod.TriangleConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@theme-ui/color", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def adjustHue(degree: String): js.Function1[/* color */ String, String] = js.native
  def adjustHue(degree: String, color: String): String = js.native
  def adjustHue(degree: Double): js.Function1[/* color */ String, String] = js.native
  def adjustHue(degree: Double, color: String): String = js.native
  def alpha(firstValue: String): String = js.native
  def alpha(firstValue: String, secondValue: Double): String = js.native
  def alpha(firstValue: String, secondValue: Double, thirdValue: Double): String = js.native
  def alpha(firstValue: String, secondValue: Double, thirdValue: Double, fourthValue: Double): String = js.native
  def alpha(firstValue: Double): String = js.native
  def alpha(firstValue: Double, secondValue: Double): String = js.native
  def alpha(firstValue: Double, secondValue: Double, thirdValue: Double): String = js.native
  def alpha(firstValue: Double, secondValue: Double, thirdValue: Double, fourthValue: Double): String = js.native
  def alpha(firstValue: RgbaColor): String = js.native
  def alpha(firstValue: RgbaColor, secondValue: Double): String = js.native
  def alpha(firstValue: RgbaColor, secondValue: Double, thirdValue: Double): String = js.native
  def alpha(firstValue: RgbaColor, secondValue: Double, thirdValue: Double, fourthValue: Double): String = js.native
  def animation(args: ((js.Array[String | Double]) | String | Double)*): Styles = js.native
  def backgroundImages(properties: String*): Styles = js.native
  def backgrounds(properties: String*): Styles = js.native
  def between(fromSize: String, toSize: String): String = js.native
  def between(fromSize: String, toSize: String, minScreen: String): String = js.native
  def between(fromSize: String, toSize: String, minScreen: String, maxScreen: String): String = js.native
  def between(fromSize: String, toSize: Double): String = js.native
  def between(fromSize: String, toSize: Double, minScreen: String): String = js.native
  def between(fromSize: String, toSize: Double, minScreen: String, maxScreen: String): String = js.native
  def between(fromSize: Double, toSize: String): String = js.native
  def between(fromSize: Double, toSize: String, minScreen: String): String = js.native
  def between(fromSize: Double, toSize: String, minScreen: String, maxScreen: String): String = js.native
  def between(fromSize: Double, toSize: Double): String = js.native
  def between(fromSize: Double, toSize: Double, minScreen: String): String = js.native
  def between(fromSize: Double, toSize: Double, minScreen: String, maxScreen: String): String = js.native
  def border(sideKeyword: String, values: (String | Double)*): Styles = js.native
  def border(sideKeyword: Double, values: (String | Double)*): Styles = js.native
  def border(sideKeyword: SideKeyword, values: (String | Double)*): Styles = js.native
  def borderColor(values: (Null | Unit | String)*): Styles = js.native
  def borderRadius(side: String, radius: String): Styles = js.native
  def borderRadius(side: String, radius: Double): Styles = js.native
  def borderStyle(values: (Null | Unit | String)*): Styles = js.native
  def borderWidth(values: (Null | Unit | String | Double)*): Styles = js.native
  def buttons(states: InteractionState*): String = js.native
  def clearFix(): Styles = js.native
  def clearFix(parent: String): Styles = js.native
  def complement(color: String): String = js.native
  def cover(): Styles = js.native
  def cover(offset: String): Styles = js.native
  def cover(offset: Double): Styles = js.native
  def darken(amount: String): js.Function1[/* color */ String, String] = js.native
  def darken(amount: String, color: String): String = js.native
  def darken(amount: Double): js.Function1[/* color */ String, String] = js.native
  def darken(amount: Double, color: String): String = js.native
  def desaturate(amount: String): js.Function1[/* color */ String, String] = js.native
  def desaturate(amount: String, color: String): String = js.native
  def desaturate(amount: Double): js.Function1[/* color */ String, String] = js.native
  def desaturate(amount: Double, color: String): String = js.native
  def directionalProperty(property: String, values: (Null | Unit | String | Double)*): Styles = js.native
  def ellipsis(): Styles = js.native
  def ellipsis(width: String): Styles = js.native
  def ellipsis(width: Double): Styles = js.native
  def em(value: String): String = js.native
  def em(value: String, base: String): String = js.native
  def em(value: String, base: Double): String = js.native
  def em(value: Double): String = js.native
  def em(value: Double, base: String): String = js.native
  def em(value: Double, base: Double): String = js.native
  def fluidRange(cssProp: js.Array[FluidRangeConfiguration]): Styles = js.native
  def fluidRange(cssProp: js.Array[FluidRangeConfiguration], minScreen: String): Styles = js.native
  def fluidRange(cssProp: js.Array[FluidRangeConfiguration], minScreen: String, maxScreen: String): Styles = js.native
  def fluidRange(cssProp: FluidRangeConfiguration): Styles = js.native
  def fluidRange(cssProp: FluidRangeConfiguration, minScreen: String): Styles = js.native
  def fluidRange(cssProp: FluidRangeConfiguration, minScreen: String, maxScreen: String): Styles = js.native
  def fontFace(
    hasFontFamilyFontFilePathFontStretchFontStyleFontVariantFontWeightFileFormatsFormatHintLocalFontsUnicodeRangeFontDisplayFontVariationSettingsFontFeatureSettings: FontFaceConfiguration
  ): Styles = js.native
  def getContrast(color1: String, color2: String): Double = js.native
  def getLuminance(color: String): Double = js.native
  def getValueAndUnit(value: String): js.Tuple2[Double | String, String | Unit] = js.native
  def grayscale(color: String): String = js.native
  def hiDPI(): String = js.native
  def hiDPI(ratio: Double): String = js.native
  def hideText(): Styles = js.native
  def hideVisually(): Styles = js.native
  def hsl(value: Double): String = js.native
  def hsl(value: Double, saturation: Double): String = js.native
  def hsl(value: Double, saturation: Double, lightness: Double): String = js.native
  def hsl(value: HslColor): String = js.native
  def hsl(value: HslColor, saturation: Double): String = js.native
  def hsl(value: HslColor, saturation: Double, lightness: Double): String = js.native
  def hslToColorString(color: Double): String = js.native
  def hslToColorString(color: HslColor): String = js.native
  def hslToColorString(color: HslaColor): String = js.native
  def hsla(value: Double): String = js.native
  def hsla(value: Double, saturation: Double): String = js.native
  def hsla(value: Double, saturation: Double, lightness: Double): String = js.native
  def hsla(value: Double, saturation: Double, lightness: Double, alpha: Double): String = js.native
  def hsla(value: HslaColor): String = js.native
  def hsla(value: HslaColor, saturation: Double): String = js.native
  def hsla(value: HslaColor, saturation: Double, lightness: Double): String = js.native
  def hsla(value: HslaColor, saturation: Double, lightness: Double, alpha: Double): String = js.native
  def hue(hue: String): js.Function1[/* color */ String, String] = js.native
  def hue(hue: String, color: String): String = js.native
  def hue(hue: Double): js.Function1[/* color */ String, String] = js.native
  def hue(hue: Double, color: String): String = js.native
  def invert(color: String): String = js.native
  def lighten(amount: String): js.Function1[/* color */ String, String] = js.native
  def lighten(amount: String, color: String): String = js.native
  def lighten(amount: Double): js.Function1[/* color */ String, String] = js.native
  def lighten(amount: Double, color: String): String = js.native
  def lightness(lightness: String): js.Function1[/* color */ String, String] = js.native
  def lightness(lightness: String, color: String): String = js.native
  def lightness(lightness: Double): js.Function1[/* color */ String, String] = js.native
  def lightness(lightness: Double, color: String): String = js.native
  def linearGradient(hasColorStopsFallbackToDirection: LinearGradientConfiguration): Styles = js.native
  def margin(values: (Null | Unit | String | Double)*): Styles = js.native
  def math(formula: String): String = js.native
  def math(formula: String, additionalSymbols: js.Object): String = js.native
  def meetsContrastGuidelines(color1: String, color2: String): ContrastScores = js.native
  def mix(weight: String): FnCall = js.native
  def mix(weight: String, color: String): js.Function1[/* otherColor */ String, String] = js.native
  def mix(weight: String, color: String, otherColor: String): String = js.native
  def mix(weight: Double): FnCall = js.native
  def mix(weight: Double, color: String): js.Function1[/* otherColor */ String, String] = js.native
  def mix(weight: Double, color: String, otherColor: String): String = js.native
  def modularScale(steps: Double): String = js.native
  def modularScale(steps: Double, base: String): String = js.native
  def modularScale(steps: Double, base: String, ratio: ModularScaleRatio): String = js.native
  def modularScale(steps: Double, base: Double): String = js.native
  def modularScale(steps: Double, base: Double, ratio: ModularScaleRatio): String = js.native
  def normalize(): js.Array[Styles] = js.native
  def opacify(amount: String): js.Function1[/* color */ String, String] = js.native
  def opacify(amount: String, color: String): String = js.native
  def opacify(amount: Double): js.Function1[/* color */ String, String] = js.native
  def opacify(amount: Double, color: String): String = js.native
  def padding(values: (Null | Unit | String | Double)*): Styles = js.native
  def parseToHsl(color: String): HslColor | HslaColor = js.native
  def parseToRgb(color: String): RgbColor | RgbaColor = js.native
  def position(firstValue: String, values: (Null | Unit | String | Double)*): Styles = js.native
  def position(firstValue: Double, values: (Null | Unit | String | Double)*): Styles = js.native
  def position(values: (Null | Unit | String | Double)*): Styles = js.native
  def radialGradient(hasColorStopsExtentFallbackPositionShape: RadialGradientConfiguration): Styles = js.native
  def readableColor(color: String): String = js.native
  def readableColor(color: String, lightReturnColor: String): String = js.native
  def readableColor(color: String, lightReturnColor: String, darkReturnColor: String): String = js.native
  def rem(value: String): String = js.native
  def rem(value: String, base: String): String = js.native
  def rem(value: String, base: Double): String = js.native
  def rem(value: Double): String = js.native
  def rem(value: Double, base: String): String = js.native
  def rem(value: Double, base: Double): String = js.native
  def retinaImage(filename: String): Styles = js.native
  def retinaImage(filename: String, backgroundSize: String): Styles = js.native
  def retinaImage(filename: String, backgroundSize: String, extension: String): Styles = js.native
  def retinaImage(filename: String, backgroundSize: String, extension: String, retinaFilename: String): Styles = js.native
  def retinaImage(
    filename: String,
    backgroundSize: String,
    extension: String,
    retinaFilename: String,
    retinaSuffix: String
  ): Styles = js.native
  def rgb(value: Double): String = js.native
  def rgb(value: Double, green: Double): String = js.native
  def rgb(value: Double, green: Double, blue: Double): String = js.native
  def rgb(value: RgbColor): String = js.native
  def rgb(value: RgbColor, green: Double): String = js.native
  def rgb(value: RgbColor, green: Double, blue: Double): String = js.native
  def rgbToColorString(color: RgbColor): String = js.native
  def rgbToColorString(color: RgbaColor): String = js.native
  def rgba(firstValue: String): String = js.native
  def rgba(firstValue: String, secondValue: Double): String = js.native
  def rgba(firstValue: String, secondValue: Double, thirdValue: Double): String = js.native
  def rgba(firstValue: String, secondValue: Double, thirdValue: Double, fourthValue: Double): String = js.native
  def rgba(firstValue: Double): String = js.native
  def rgba(firstValue: Double, secondValue: Double): String = js.native
  def rgba(firstValue: Double, secondValue: Double, thirdValue: Double): String = js.native
  def rgba(firstValue: Double, secondValue: Double, thirdValue: Double, fourthValue: Double): String = js.native
  def rgba(firstValue: RgbaColor): String = js.native
  def rgba(firstValue: RgbaColor, secondValue: Double): String = js.native
  def rgba(firstValue: RgbaColor, secondValue: Double, thirdValue: Double): String = js.native
  def rgba(firstValue: RgbaColor, secondValue: Double, thirdValue: Double, fourthValue: Double): String = js.native
  def rotate(degree: String): js.Function1[/* color */ String, String] = js.native
  def rotate(degree: String, color: String): String = js.native
  def rotate(degree: Double): js.Function1[/* color */ String, String] = js.native
  def rotate(degree: Double, color: String): String = js.native
  def saturate(amount: String): js.Function1[/* color */ String, String] = js.native
  def saturate(amount: String, color: String): String = js.native
  def saturate(amount: Double): js.Function1[/* color */ String, String] = js.native
  def saturate(amount: Double, color: String): String = js.native
  def saturation(saturation: String): js.Function1[/* color */ String, String] = js.native
  def saturation(saturation: String, color: String): String = js.native
  def saturation(saturation: Double): js.Function1[/* color */ String, String] = js.native
  def saturation(saturation: Double, color: String): String = js.native
  def setHue(hue: String): js.Function1[/* color */ String, String] = js.native
  def setHue(hue: String, color: String): String = js.native
  def setHue(hue: Double): js.Function1[/* color */ String, String] = js.native
  def setHue(hue: Double, color: String): String = js.native
  def setLightness(lightness: String): js.Function1[/* color */ String, String] = js.native
  def setLightness(lightness: String, color: String): String = js.native
  def setLightness(lightness: Double): js.Function1[/* color */ String, String] = js.native
  def setLightness(lightness: Double, color: String): String = js.native
  def setSaturation(saturation: String): js.Function1[/* color */ String, String] = js.native
  def setSaturation(saturation: String, color: String): String = js.native
  def setSaturation(saturation: Double): js.Function1[/* color */ String, String] = js.native
  def setSaturation(saturation: Double, color: String): String = js.native
  def shade(percentage: String): js.Function1[/* color */ String, String] = js.native
  def shade(percentage: String, color: String): String = js.native
  def shade(percentage: Double): js.Function1[/* color */ String, String] = js.native
  def shade(percentage: Double, color: String): String = js.native
  def size(height: String): Styles = js.native
  def size(height: String, width: String): Styles = js.native
  def size(height: String, width: Double): Styles = js.native
  def size(height: Double): Styles = js.native
  def size(height: Double, width: String): Styles = js.native
  def size(height: Double, width: Double): Styles = js.native
  def stripUnit(value: String): js.Any = js.native
  def stripUnit(value: String, unitReturn: Boolean): js.Any = js.native
  def stripUnit(value: Double): js.Any = js.native
  def stripUnit(value: Double, unitReturn: Boolean): js.Any = js.native
  def textInputs(states: InteractionState*): String = js.native
  def timingFunctions(timingFunction: TimingFunction): String = js.native
  def tint(percentage: String): js.Function1[/* color */ String, String] = js.native
  def tint(percentage: String, color: String): String = js.native
  def tint(percentage: Double): js.Function1[/* color */ String, String] = js.native
  def tint(percentage: Double, color: String): String = js.native
  def toColorString(color: js.Object): String = js.native
  def transitions(properties: (String | js.Array[String])*): Styles = js.native
  def transparentize(amount: String): js.Function1[/* color */ String, String] = js.native
  def transparentize(amount: String, color: String): String = js.native
  def transparentize(amount: Double): js.Function1[/* color */ String, String] = js.native
  def transparentize(amount: Double, color: String): String = js.native
  def triangle(hasPointingDirectionHeightWidthForegroundColorBackgroundColor: TriangleConfiguration): Styles = js.native
  def wordWrap(): Styles = js.native
  def wordWrap(wrap: String): Styles = js.native
}

