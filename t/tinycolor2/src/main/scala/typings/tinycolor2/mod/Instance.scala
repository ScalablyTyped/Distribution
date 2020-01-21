package typings.tinycolor2.mod

import typings.tinycolor2.mod.ColorFormats.HSLA
import typings.tinycolor2.mod.ColorFormats.HSVA
import typings.tinycolor2.mod.ColorFormats.PRGBA
import typings.tinycolor2.mod.ColorFormats.RGBA
import typings.tinycolor2.tinycolor2Booleans.`false`
import typings.tinycolor2.tinycolor2Strings.hex
import typings.tinycolor2.tinycolor2Strings.hex3
import typings.tinycolor2.tinycolor2Strings.hex4
import typings.tinycolor2.tinycolor2Strings.hex6
import typings.tinycolor2.tinycolor2Strings.hex8
import typings.tinycolor2.tinycolor2Strings.hsl
import typings.tinycolor2.tinycolor2Strings.hsv
import typings.tinycolor2.tinycolor2Strings.name
import typings.tinycolor2.tinycolor2Strings.prgb
import typings.tinycolor2.tinycolor2Strings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends _ColorInput {
  /**
    * Gets an analogous color scheme based off of the current color.
    *
    * @param results - The amount of results to return.
    *  Default value: 6.
    * @param slices - The amount to slice the input color by.
    *  Default value: 30.
    */
  def analogous(): js.Array[Instance] = js.native
  def analogous(results: Double): js.Array[Instance] = js.native
  def analogous(results: Double, slices: Double): js.Array[Instance] = js.native
  /**
    * Brighten the color a given amount.
    *
    * @param amount - The amount to brighten by. The valid range is 0 to 100.
    *  Default value: 10.
    */
  def brighten(): Instance = js.native
  def brighten(amount: Double): Instance = js.native
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
  def darken(amount: Double): Instance = js.native
  /**
    * Desaturate the color a given amount.
    *  Providing 100 will is the same as calling greyscale.
    *
    * @param amount - The amount to desaturate by. The valid range is 0 to 100.
    *  Default value: 10.
    */
  def desaturate(): Instance = js.native
  def desaturate(amount: Double): Instance = js.native
  /**
    * Returns the alpha value of the color
    */
  def getAlpha(): Double = js.native
  /**
    * Returns the perceived brightness of the color, from 0-255.
    */
  def getBrightness(): Double = js.native
  /**
    * Returns the format used to create the tinycolor instance.
    */
  def getFormat(): String = js.native
  /**
    * Returns the perceived luminance of a color, from 0-1.
    */
  def getLuminance(): Double = js.native
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
  def isDark(): Boolean = js.native
  /**
    * Return an indication whether the color's perceived brightness is light.
    */
  def isLight(): Boolean = js.native
  /**
    * Return an indication whether the color was successfully parsed.
    */
  def isValid(): Boolean = js.native
  /**
    * Lighten the color a given amount. Providing 100 will always return white.
    *
    * @param amount - The amount to lighten by. The valid range is 0 to 100.
    *  Default value: 10.
    */
  def lighten(): Instance = js.native
  def lighten(amount: Double): Instance = js.native
  /**
    * Gets a monochromatic color scheme based off of the current color.
    *
    * @param results - The amount of results to return.
    *  Default value: 6.
    */
  def monochromatic(): js.Array[Instance] = js.native
  def monochromatic(results: Double): js.Array[Instance] = js.native
  /**
    * Saturate the color a given amount.
    *
    * @param amount - The amount to saturate by. The valid range is 0  to 100.
    *  Default value: 10.
    */
  def saturate(): Instance = js.native
  def saturate(amount: Double): Instance = js.native
  /**
    * Sets the alpha value on the current color.
    *
    * @param alpha - The new alpha value. The accepted range is 0-1.
    */
  def setAlpha(alpha: Double): Instance = js.native
  /**
    * Spin the hue a given amount. Calling with 0, 360, or -360 will do nothing.
    *
    * @param amount - The amount to spin by. The valid range is -360 to 360.
    */
  def spin(amount: Double): Instance = js.native
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
  def toFilter(): String = js.native
  /**
    * Returns the hex value of the color.
    */
  def toHex(): String = js.native
  /**
    * Returns the hex 8 value of the color.
    */
  def toHex8(): String = js.native
  /**
    * Returns the hex 8  value of the color -with a # appened.
    */
  def toHex8String(): String = js.native
  /**
    * Returns the hex value of the color -with a # appened.
    */
  def toHexString(): String = js.native
  /**
    * Returns the object as a HSLA object.
    */
  def toHsl(): HSLA = js.native
  /**
    * Returns the hsla values interpolated into a string with the following format:
    * "hsla(xxx, xxx, xxx, xx)".
    */
  def toHslString(): String = js.native
  /**
    * Returns the object as a HSVA object.
    */
  def toHsv(): HSVA = js.native
  /**
    * Returns the hsva values interpolated into a string with the following format:
    * "hsva(xxx, xxx, xxx, xx)".
    */
  def toHsvString(): String = js.native
  /**
    * The 'real' name of the color -if there is one.
    */
  def toName(): String | `false` = js.native
  /**
    * Returns the object as a RGBA object.
    */
  def toPercentageRgb(): PRGBA = js.native
  /**
    * Returns the RGBA relative values interpolated into a string with the following format:
    * "RGBA(xxx, xxx, xxx, xx)".
    */
  def toPercentageRgbString(): String = js.native
  /**
    * Returns the object as a RGBA object.
    */
  def toRgb(): RGBA = js.native
  /**
    * Returns the RGBA values interpolated into a string with the following format:
    * "RGBA(xxx, xxx, xxx, xx)".
    */
  def toRgbString(): String = js.native
  def toString(format: rgb | prgb | hex | hex6 | hex3 | hex4 | hex8 | name | hsl | hsv): String = js.native
  /**
    * Gets a triad based off of the current color.
    */
  def triad(): js.Tuple3[Instance, Instance, Instance] = js.native
}

