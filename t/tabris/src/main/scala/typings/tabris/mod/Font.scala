package typings.tabris.mod

import typings.tabris.tabrisStrings.`sans-serif`
import typings.tabris.tabrisStrings.black
import typings.tabris.tabrisStrings.bold
import typings.tabris.tabrisStrings.italic
import typings.tabris.tabrisStrings.light
import typings.tabris.tabrisStrings.medium
import typings.tabris.tabrisStrings.normal
import typings.tabris.tabrisStrings.thin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Font")
@js.native
class Font protected () extends js.Object {
  def this(size: Double) = this()
  def this(size: Double, family: js.Array[String]) = this()
  def this(size: Double, family: js.Array[String], weight: black) = this()
  def this(size: Double, family: js.Array[String], weight: bold) = this()
  def this(size: Double, family: js.Array[String], weight: light) = this()
  def this(size: Double, family: js.Array[String], weight: medium) = this()
  def this(size: Double, family: js.Array[String], weight: normal) = this()
  def this(size: Double, family: js.Array[String], weight: thin) = this()
  def this(size: Double, family: js.Array[String], weight: black, style: italic) = this()
  def this(size: Double, family: js.Array[String], weight: black, style: normal) = this()
  def this(size: Double, family: js.Array[String], weight: bold, style: italic) = this()
  def this(size: Double, family: js.Array[String], weight: bold, style: normal) = this()
  def this(size: Double, family: js.Array[String], weight: light, style: italic) = this()
  def this(size: Double, family: js.Array[String], weight: light, style: normal) = this()
  def this(size: Double, family: js.Array[String], weight: medium, style: italic) = this()
  def this(size: Double, family: js.Array[String], weight: medium, style: normal) = this()
  def this(size: Double, family: js.Array[String], weight: normal, style: italic) = this()
  def this(size: Double, family: js.Array[String], weight: normal, style: normal) = this()
  def this(size: Double, family: js.Array[String], weight: thin, style: italic) = this()
  def this(size: Double, family: js.Array[String], weight: thin, style: normal) = this()
  /**
    * Prioritized list of font families
    * @constant
    */
  val family: js.Array[String] = js.native
  /**
    * Positive number in dip
    * @constant
    */
  val size: Double = js.native
  /**
    * Face of the font family to be used
    * @constant
    */
  val style: italic | normal = js.native
  /**
    * Boldness of the font
    * @constant
    */
  val weight: black | bold | medium | thin | light | normal = js.native
  /**
    * Tests if the given value is a `Font` instance that is deeply equal to this one.
    * @param value
    */
  def equals(value: Font): Boolean = js.native
}

/* static members */
@JSImport("tabris", "Font")
@js.native
object Font extends js.Object {
  val condensed: typings.tabris.tabrisStrings.condensed = js.native
  val monospace: typings.tabris.tabrisStrings.monospace = js.native
  val sansSerif: `sans-serif` = js.native
  val serif: typings.tabris.tabrisStrings.serif = js.native
  /**
    * Creates a new instance of Font using any valid font expression. For any other value, including `null`
    * and `'initial'` the method throws.
    * @param fontValue The value to create a Font instance from
    */
  def from(fontValue: FontValue): Font = js.native
  /**
    * Returns true if value is a FontValue. This includes `null` and `'initial'`. Use this to check if a
    * value will be accepted by a font property. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  def isFontValue(value: js.Any): /* is tabris.tabris.FontValue */ Boolean = js.native
  /**
    * Returns true if value is a valid FontValue. This excludes `null` and `'initial'`. Use this to check
    * if a value will be accepted by Font.from. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  def isValidFontValue(value: js.Any): /* is tabris.tabris.FontValue */ Boolean = js.native
}

