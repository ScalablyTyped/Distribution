package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Color")
@js.native
class Color () extends js.Object {
  def this(color: java.lang.String) = this()
  def this(color: scala.Double) = this()
  def this(color: Color) = this()
  def this(r: scala.Double, g: scala.Double, b: scala.Double) = this()
  /**
    * Blue channel value between 0 and 1. Default is 1.
    */
  var b: scala.Double = js.native
  /**
    * Green channel value between 0 and 1. Default is 1.
    */
  var g: scala.Double = js.native
  /**
    * Red channel value between 0 and 1. Default is 1.
    */
  var r: scala.Double = js.native
  def add(color: Color): this.type = js.native
  def addColors(color1: Color, color2: Color): this.type = js.native
  def addScalar(s: scala.Double): this.type = js.native
  /**
    * Converts this color from gamma to linear space.
    */
  def convertGammaToLinear(): Color = js.native
  /**
    * Converts this color from linear to gamma space.
    */
  def convertLinearToGamma(): Color = js.native
  /**
    * Copies given color.
    * @param color Color to copy.
    */
  def copy(color: this.type): this.type = js.native
  /**
    * Copies given color making conversion from gamma to linear space.
    * @param color Color to copy.
    */
  def copyGammaToLinear(color: Color): Color = js.native
  def copyGammaToLinear(color: Color, gammaFactor: scala.Double): Color = js.native
  /**
    * Copies given color making conversion from linear to gamma space.
    * @param color Color to copy.
    */
  def copyLinearToGamma(color: Color): Color = js.native
  def copyLinearToGamma(color: Color, gammaFactor: scala.Double): Color = js.native
  def equals(color: Color): scala.Boolean = js.native
  def fromArray(rgb: js.Array[scala.Double]): this.type = js.native
  def fromArray(rgb: js.Array[scala.Double], offset: scala.Double): this.type = js.native
  def getHSL(target: HSL): HSL = js.native
  /**
    * Returns the hexadecimal value of this color.
    */
  def getHex(): scala.Double = js.native
  /**
    * Returns the string formated hexadecimal value of this color.
    */
  def getHexString(): java.lang.String = js.native
  /**
    * Returns the value of this color in CSS context style.
    * Example: rgb(r, g, b)
    */
  def getStyle(): java.lang.String = js.native
  def lerp(color: Color, alpha: scala.Double): this.type = js.native
  def lerpHSL(color: Color, alpha: scala.Double): this.type = js.native
  def multiply(color: Color): this.type = js.native
  def multiplyScalar(s: scala.Double): this.type = js.native
  def offsetHSL(h: scala.Double, s: scala.Double, l: scala.Double): this.type = js.native
  def set(color: java.lang.String): Color = js.native
  def set(color: scala.Double): Color = js.native
  def set(color: Color): Color = js.native
  /**
    * Sets this color from HSL values.
    * Based on MochiKit implementation by Bob Ippolito.
    *
    * @param h Hue channel value between 0 and 1.
    * @param s Saturation value channel between 0 and 1.
    * @param l Value channel value between 0 and 1.
    */
  def setHSL(h: scala.Double, s: scala.Double, l: scala.Double): Color = js.native
  def setHex(hex: scala.Double): Color = js.native
  /**
    * Sets this color from RGB values.
    * @param r Red channel value between 0 and 1.
    * @param g Green channel value between 0 and 1.
    * @param b Blue channel value between 0 and 1.
    */
  def setRGB(r: scala.Double, g: scala.Double, b: scala.Double): Color = js.native
  def setScalar(scalar: scala.Double): Color = js.native
  /**
    * Sets this color from a CSS context style string.
    * @param contextStyle Color in CSS context style format.
    */
  def setStyle(style: java.lang.String): Color = js.native
  def sub(color: Color): this.type = js.native
  def toArray(): js.Array[scala.Double] = js.native
  def toArray(array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toArray(array: js.Array[scala.Double], offset: scala.Double): js.Array[scala.Double] = js.native
}

