package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Color")
@js.native
open class Color protected () extends StObject {
  /**
    * Represents a color. See also ${doc:ColorValue}
    */
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
    * Tests if the given value is a `Color` instance that is deeply equal to this one.
    * @param value
    */
  def equals(value: Color): Boolean = js.native
  
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
    * Returns a array representation of the color in the format of `[red, green, blue, alpha]`. Each value
    * is a number between (and in including) 0 and 255.
    */
  def toArray(): js.Tuple4[Double, Double, Double, Double] = js.native
}
/* static members */
object Color {
  
  @JSImport("tabris", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.aqua")
  @js.native
  val aqua: Color = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.black")
  @js.native
  val black: Color = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.blue")
  @js.native
  val blue: Color = js.native
  
  /**
    * Creates a new instance of Color using any valid color expression. For any other value, including
    * `null` and `'initial'` the method throws.
    * @param colorValue The value to create a Color instance from
    */
  inline def from(colorValue: ColorValue): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(colorValue.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.fuchsia")
  @js.native
  val fuchsia: Color = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.gray")
  @js.native
  val gray: Color = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.green")
  @js.native
  val green: Color = js.native
  
  /**
    * Returns true if value is a ColorValue. This includes `null` and `'initial'`. Use this to check if a
    * value will be accepted by a color property. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  inline def isColorValue(value: Any): /* is tabris.tabris.ColorValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isColorValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.ColorValue */ Boolean]
  
  /**
    * Returns true if value is a valid ColorValue. This excludes `null` and `'initial'`. Use this to check
    * if a value will be accepted by Color.from. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  inline def isValidColorValue(value: Any): /* is tabris.tabris.ColorValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidColorValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.ColorValue */ Boolean]
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.lime")
  @js.native
  val lime: Color = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.maroon")
  @js.native
  val maroon: Color = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.navy")
  @js.native
  val navy: Color = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.olive")
  @js.native
  val olive: Color = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.purple")
  @js.native
  val purple: Color = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.red")
  @js.native
  val red: Color = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.silver")
  @js.native
  val silver: Color = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.teal")
  @js.native
  val teal: Color = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.transparent")
  @js.native
  val transparent: Color = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.white")
  @js.native
  val white: Color = js.native
  
  /**
    * @constant
    */
  @JSImport("tabris", "Color.yellow")
  @js.native
  val yellow: Color = js.native
}
