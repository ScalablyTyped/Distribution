package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "LinearGradient")
@js.native
class LinearGradient protected () extends StObject {
  def this(colorStops: js.Array[Color | (js.Tuple2[Color, Percent])]) = this()
  def this(colorStops: js.Array[Color | (js.Tuple2[Color, Percent])], direction: Double) = this()
  
  /**
    * An array with the gradient color stops. Defines the position and the offset of the gradient color
    * stop.
    * @constant
    */
  val colorStops: js.Array[Color | (js.Tuple2[Color, Percent])] = js.native
  
  /**
    * The direction of the gradient line in degrees.
    * @constant
    */
  val direction: Double = js.native
  
  /**
    * Tests if the given value is a `LinearGradient` instance that is deeply equal to this one.
    * @param value
    */
  def equals(value: LinearGradient): Boolean = js.native
}
/* static members */
object LinearGradient {
  
  @JSImport("tabris", "LinearGradient")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance of LinearGradient using any valid linear gradient expression. For any other
    * value, including `null` and `'initial'` the method throws.
    * @param linearGradientValue The value to create a LinearGradient instance from
    */
  @scala.inline
  def from(linearGradientValue: LinearGradientValue): LinearGradient = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(linearGradientValue.asInstanceOf[js.Any]).asInstanceOf[LinearGradient]
  
  /**
    * Returns true if value is a LinearGradientValue. This includes `null` and `'initial'`. Use this to
    * check if a value will be accepted by a linear gradient property. This is also a valid TypeScript type
    * guard function.
    * @param value The value to test
    */
  @scala.inline
  def isLinearGradientValue(value: js.Any): /* is tabris.tabris.LinearGradientValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinearGradientValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.LinearGradientValue */ Boolean]
  
  /**
    * Returns true if value is a valid LinearGradientValue. This excludes `null` and `'initial'`. Use this
    * to check if a value will be accepted by LinearGradient.from. This is also a valid TypeScript type
    * guard function.
    * @param value The value to test
    */
  @scala.inline
  def isValidLinearGradientValue(value: js.Any): /* is tabris.tabris.LinearGradientValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidLinearGradientValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.LinearGradientValue */ Boolean]
}
