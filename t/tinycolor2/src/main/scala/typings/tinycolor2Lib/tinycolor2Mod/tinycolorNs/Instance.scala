package typings
package tinycolor2Lib.tinycolor2Mod.tinycolorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends ColorInput {
  /**
    * Gets an analogous color scheme based off of the current color.
    *
    * @param results - The amount of results to return.
    *  Default value: 6.
    * @param slices - The amount to slice the input color by.
    *  Default value: 30.
    */
  def analogous(): js.Array[Instance] = js.native
  def analogous(results: scala.Double): js.Array[Instance] = js.native
  def analogous(results: scala.Double, slices: scala.Double): js.Array[Instance] = js.native
  /**
    * Brighten the color a given amount.
    *
    * @param amount - The amount to brighten by. The valid range is 0 to 100.
    *  Default value: 10.
    */
  def brighten(): Instance = js.native
  def brighten(amount: scala.Double): Instance = js.native
  /**
    * Gets the complement of the current color
    */
  def complement(): Instance = js.native
  /**
    * Darken the color a given amount.
    *  Providing 100 will always return black.
    *
    * @param amount - The amount to darken by. The valid range is 0 to 100.
    *  Default value: 10.
    */
  def darken(): Instance = js.native
  def darken(amount: scala.Double): Instance = js.native
  /**
    * Desaturate the color a given amount.
    *  Providing 100 will is the same as calling greyscale.
    *
    * @param amount - The amount to desaturate by. The valid range is 0 to 100.
    *  Default value: 10.
    */
  def desaturate(): Instance = js.native
  def desaturate(amount: scala.Double): Instance = js.native
  /**
    * Returns the alpha value of the color
    */
  def getAlpha(): scala.Double = js.native
  /**
    * Returns the perceived brightness of the color, from 0-255.
    */
  def getBrightness(): scala.Double = js.native
  /**
    * Returns the format used to create the tinycolor instance.
    */
  def getFormat(): java.lang.String = js.native
  /**
    * Returns the perceived luminance of a color, from 0-1.
    */
  def getLuminance(): scala.Double = js.native
  /**
    * Returns the input passed into the constructer used to create the tinycolor instance.
    */
  def getOriginalInput(): ColorInput = js.native
  /**
    * Completely desaturates a color into greyscale.
    * Same as calling desaturate(100).
    */
  def greyscale(): Instance = js.native
  /**
    * Return an indication whether the color's perceived brightness is dark.
    */
  def isDark(): scala.Boolean = js.native
  /**
    * Return an indication whether the color's perceived brightness is light.
    */
  def isLight(): scala.Boolean = js.native
  /**
    * Return an indication whether the color was successfully parsed.
    */
  def isValid(): scala.Boolean = js.native
  /**
    * Lighten the color a given amount. Providing 100 will always return white.
    *
    * @param amount - The amount to lighten by. The valid range is 0 to 100.
    *  Default value: 10.
    */
  def lighten(): Instance = js.native
  def lighten(amount: scala.Double): Instance = js.native
  /**
    * Gets a monochromatic color scheme based off of the current color.
    *
    * @param results - The amount of results to return.
    *  Default value: 6.
    */
  def monochromatic(): js.Array[Instance] = js.native
  def monochromatic(results: scala.Double): js.Array[Instance] = js.native
  /**
    * Saturate the color a given amount.
    *
    * @param amount - The amount to saturate by. The valid range is 0  to 100.
    *  Default value: 10.
    */
  def saturate(): Instance = js.native
  def saturate(amount: scala.Double): Instance = js.native
  /**
    * Sets the alpha value on the current color.
    *
    * @param alpha - The new alpha value. The accepted range is 0-1.
    */
  def setAlpha(alpha: scala.Double): Instance = js.native
  /**
    * Spin the hue a given amount. Calling with 0, 360, or -360 will do nothing.
    *
    * @param amount - The amount to spin by. The valid range is -360 to 360.
    */
  def spin(amount: scala.Double): Instance = js.native
  /**
    * Gets a split complement color scheme based off of the current color.
    */
  def splitcomplement(): js.Tuple3[Instance, Instance, Instance] = js.native
  /**
    * Gets a tetrad based off of the current color.
    */
  def tetrad(): js.Tuple4[Instance, Instance, Instance, Instance] = js.native
  /**
    * Returns the color represented as a Microsoft filter for use in old versions of IE.
    */
  def toFilter(): java.lang.String = js.native
  /**
    * Returns the hex value of the color.
    */
  def toHex(): java.lang.String = js.native
  /**
    * Returns the hex 8 value of the color.
    */
  def toHex8(): java.lang.String = js.native
  /**
    * Returns the hex 8  value of the color -with a # appened.
    */
  def toHex8String(): java.lang.String = js.native
  /**
    * Returns the hex value of the color -with a # appened.
    */
  def toHexString(): java.lang.String = js.native
  /**
    * Returns the object as a HSLA object.
    */
  def toHsl(): tinycolor2Lib.tinycolor2Mod.tinycolorNs.ColorFormatsNs.HSLA = js.native
  /**
    * Returns the hsla values interpolated into a string with the following format:
    * "hsla(xxx, xxx, xxx, xx)".
    */
  def toHslString(): java.lang.String = js.native
  /**
    * Returns the object as a HSVA object.
    */
  def toHsv(): tinycolor2Lib.tinycolor2Mod.tinycolorNs.ColorFormatsNs.HSVA = js.native
  /**
    * Returns the hsva values interpolated into a string with the following format:
    * "hsva(xxx, xxx, xxx, xx)".
    */
  def toHsvString(): java.lang.String = js.native
  /**
    * The 'real' name of the color -if there is one.
    */
  def toName(): java.lang.String | tinycolor2Lib.tinycolor2LibNumbers.`false` = js.native
  /**
    * Returns the object as a RGBA object.
    */
  def toPercentageRgb(): tinycolor2Lib.tinycolor2Mod.tinycolorNs.ColorFormatsNs.PRGBA = js.native
  /**
    * Returns the RGBA relative values interpolated into a string with the following format:
    * "RGBA(xxx, xxx, xxx, xx)".
    */
  def toPercentageRgbString(): java.lang.String = js.native
  /**
    * Returns the object as a RGBA object.
    */
  def toRgb(): tinycolor2Lib.tinycolor2Mod.tinycolorNs.ColorFormatsNs.RGBA = js.native
  /**
    * Returns the RGBA values interpolated into a string with the following format:
    * "RGBA(xxx, xxx, xxx, xx)".
    */
  def toRgbString(): java.lang.String = js.native
  def toString(
    format: tinycolor2Lib.tinycolor2LibStrings.rgb | tinycolor2Lib.tinycolor2LibStrings.prgb | tinycolor2Lib.tinycolor2LibStrings.hex | tinycolor2Lib.tinycolor2LibStrings.hex6 | tinycolor2Lib.tinycolor2LibStrings.hex3 | tinycolor2Lib.tinycolor2LibStrings.hex4 | tinycolor2Lib.tinycolor2LibStrings.hex8 | tinycolor2Lib.tinycolor2LibStrings.name | tinycolor2Lib.tinycolor2LibStrings.hsl | tinycolor2Lib.tinycolor2LibStrings.hsv
  ): java.lang.String = js.native
  /**
    * Gets a triad based off of the current color.
    */
  def triad(): js.Tuple3[Instance, Instance, Instance] = js.native
}

