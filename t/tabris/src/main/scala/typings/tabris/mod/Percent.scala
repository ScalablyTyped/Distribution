package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Percent")
@js.native
class Percent protected () extends StObject {
  def this(value: Double) = this()
  
  /**
    * A number between and including 0 and 100
    * @constant
    */
  val percent: Double = js.native
}
/* static members */
object Percent {
  
  @JSImport("tabris", "Percent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance of Percent using any valid percent expression. For any other value, including
    * `null` the method throws.
    * @param percentValue The value to create a Percent instance from
    */
  @scala.inline
  def from(percentValue: PercentValue): Percent = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(percentValue.asInstanceOf[js.Any]).asInstanceOf[Percent]
  
  /**
    * Returns true if value is a valid PercentValue. This excludes `null`. Use this to check if a value
    * will be accepted by Percent.from. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  @scala.inline
  def isValidPercentValue(value: js.Any): /* is tabris.tabris.PercentValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPercentValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.PercentValue */ Boolean]
}
