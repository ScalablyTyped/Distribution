package typings.tabris.global.tabris

import typings.tabris.mod.FontValue
import typings.tabris.tabrisStrings.`sans-serif`
import typings.tabris.tabrisStrings.black
import typings.tabris.tabrisStrings.bold
import typings.tabris.tabrisStrings.italic
import typings.tabris.tabrisStrings.light
import typings.tabris.tabrisStrings.medium
import typings.tabris.tabrisStrings.normal
import typings.tabris.tabrisStrings.thin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.Font")
@js.native
open class Font protected ()
  extends typings.tabris.mod.Font {
  /**
    * Represents a font. See also ${doc:FontValue}
    */
  def this(size: Double) = this()
  def this(size: Double, family: js.Array[String]) = this()
  def this(size: Double, family: js.Array[String], weight: black | bold | medium | thin | light | normal) = this()
  def this(size: Double, family: Unit, weight: black | bold | medium | thin | light | normal) = this()
  def this(
    size: Double,
    family: js.Array[String],
    weight: black | bold | medium | thin | light | normal,
    style: italic | normal
  ) = this()
  def this(size: Double, family: js.Array[String], weight: Unit, style: italic | normal) = this()
  def this(
    size: Double,
    family: Unit,
    weight: black | bold | medium | thin | light | normal,
    style: italic | normal
  ) = this()
  def this(size: Double, family: Unit, weight: Unit, style: italic | normal) = this()
}
/* static members */
object Font {
  
  @JSGlobal("tabris.Font")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("tabris.Font.condensed")
  @js.native
  val condensed: typings.tabris.tabrisStrings.condensed = js.native
  
  /**
    * Creates a new instance of Font using any valid font expression. For any other value, including `null`
    * and `'initial'` the method throws.
    * @param fontValue The value to create a Font instance from
    */
  inline def from(fontValue: FontValue): typings.tabris.mod.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(fontValue.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.Font]
  
  /**
    * Returns true if value is a FontValue. This includes `null` and `'initial'`. Use this to check if a
    * value will be accepted by a font property. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  inline def isFontValue(value: Any): /* is tabris.tabris.FontValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFontValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.FontValue */ Boolean]
  
  /**
    * Returns true if value is a valid FontValue. This excludes `null` and `'initial'`. Use this to check
    * if a value will be accepted by Font.from. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  inline def isValidFontValue(value: Any): /* is tabris.tabris.FontValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFontValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.FontValue */ Boolean]
  
  @JSGlobal("tabris.Font.monospace")
  @js.native
  val monospace: typings.tabris.tabrisStrings.monospace = js.native
  
  @JSGlobal("tabris.Font.sansSerif")
  @js.native
  val sansSerif: `sans-serif` = js.native
  
  @JSGlobal("tabris.Font.serif")
  @js.native
  val serif: typings.tabris.tabrisStrings.serif = js.native
}
