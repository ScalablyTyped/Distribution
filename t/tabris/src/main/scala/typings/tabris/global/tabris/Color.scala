package typings.tabris.global.tabris

import typings.tabris.mod.ColorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.Color")
@js.native
class Color protected ()
  extends typings.tabris.mod.Color {
  def this(red: Double, green: Double, blue: Double) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
}
/* static members */
object Color {
  
  @JSGlobal("tabris.Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.aqua")
  @js.native
  val aqua: typings.tabris.mod.Color = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.black")
  @js.native
  val black: typings.tabris.mod.Color = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.blue")
  @js.native
  val blue: typings.tabris.mod.Color = js.native
  
  /**
    * Creates a new instance of Color using any valid color expression. For any other value, including
    * `null` and `'initial'` the method throws.
    * @param colorValue The value to create a Color instance from
    */
  inline def from(colorValue: ColorValue): typings.tabris.mod.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(colorValue.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.Color]
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.fuchsia")
  @js.native
  val fuchsia: typings.tabris.mod.Color = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.gray")
  @js.native
  val gray: typings.tabris.mod.Color = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.green")
  @js.native
  val green: typings.tabris.mod.Color = js.native
  
  /**
    * Returns true if value is a ColorValue. This includes `null` and `'initial'`. Use this to check if a
    * value will be accepted by a color property. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  inline def isColorValue(value: js.Any): /* is tabris.tabris.ColorValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isColorValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.ColorValue */ Boolean]
  
  /**
    * Returns true if value is a valid ColorValue. This excludes `null` and `'initial'`. Use this to check
    * if a value will be accepted by Color.from. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  inline def isValidColorValue(value: js.Any): /* is tabris.tabris.ColorValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidColorValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.ColorValue */ Boolean]
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.lime")
  @js.native
  val lime: typings.tabris.mod.Color = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.maroon")
  @js.native
  val maroon: typings.tabris.mod.Color = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.navy")
  @js.native
  val navy: typings.tabris.mod.Color = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.olive")
  @js.native
  val olive: typings.tabris.mod.Color = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.purple")
  @js.native
  val purple: typings.tabris.mod.Color = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.red")
  @js.native
  val red: typings.tabris.mod.Color = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.silver")
  @js.native
  val silver: typings.tabris.mod.Color = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.teal")
  @js.native
  val teal: typings.tabris.mod.Color = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.transparent")
  @js.native
  val transparent: typings.tabris.mod.Color = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.white")
  @js.native
  val white: typings.tabris.mod.Color = js.native
  
  /**
    * @constant
    */
  @JSGlobal("tabris.Color.yellow")
  @js.native
  val yellow: typings.tabris.mod.Color = js.native
}
