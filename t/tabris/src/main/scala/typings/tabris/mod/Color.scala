package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Color")
@js.native
class Color protected () extends js.Object {
  def this(red: Double, green: Double, blue: Double) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  /**
    * A number between and including 0 and 255
    * @constant
    */
  val alpha: Double = js.native
  /**
    * A number between and including 0 and 255
    * @constant
    */
  val blue: Double = js.native
  /**
    * A number between and including 0 and 255
    * @constant
    */
  val green: Double = js.native
  /**
    * A number between and including 0 and 255
    * @constant
    */
  val red: Double = js.native
  /**
    * Tests if the given value is a `Color` instance that is deeply equal to this one.
    * @param value
    */
  def equals(value: Color): Boolean = js.native
  /**
    * Returns a array representation of the color in the format of `[red, green, blue, alpha]`. Each value
    * is a number between (and in including) 0 and 255.
    */
  def toArray(): js.Tuple4[Double, Double, Double, Double] = js.native
}

/* static members */
@JSImport("tabris", "Color")
@js.native
object Color extends js.Object {
  /**
    * @constant
    */
  val aqua: Color = js.native
  /**
    * @constant
    */
  val black: Color = js.native
  /**
    * @constant
    */
  val blue: Color = js.native
  /**
    * @constant
    */
  val fuchsia: Color = js.native
  /**
    * @constant
    */
  val gray: Color = js.native
  /**
    * @constant
    */
  val green: Color = js.native
  /**
    * @constant
    */
  val lime: Color = js.native
  /**
    * @constant
    */
  val maroon: Color = js.native
  /**
    * @constant
    */
  val navy: Color = js.native
  /**
    * @constant
    */
  val olive: Color = js.native
  /**
    * @constant
    */
  val purple: Color = js.native
  /**
    * @constant
    */
  val red: Color = js.native
  /**
    * @constant
    */
  val silver: Color = js.native
  /**
    * @constant
    */
  val teal: Color = js.native
  /**
    * @constant
    */
  val transparent: Color = js.native
  /**
    * @constant
    */
  val white: Color = js.native
  /**
    * @constant
    */
  val yellow: Color = js.native
  /**
    * Creates a new instance of Color using any valid color expression. For any other value, including
    * `null` and `'initial'` the method throws.
    * @param colorValue The value to create a Color instance from
    */
  def from(colorValue: ColorValue): Color = js.native
  /**
    * Returns true if value is a ColorValue. This includes `null` and `'initial'`. Use this to check if a
    * value will be accepted by a color property. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  def isColorValue(value: js.Any): /* is tabris.tabris.ColorValue */ Boolean = js.native
  /**
    * Returns true if value is a valid ColorValue. This excludes `null` and `'initial'`. Use this to check
    * if a value will be accepted by Color.from. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  def isValidColorValue(value: js.Any): /* is tabris.tabris.ColorValue */ Boolean = js.native
}

