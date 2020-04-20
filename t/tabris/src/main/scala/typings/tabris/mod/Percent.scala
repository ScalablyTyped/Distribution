package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Percent")
@js.native
class Percent protected () extends js.Object {
  def this(value: Double) = this()
  /**
    * A number between and including 0 and 100
    * @constant
    */
  val percent: Double = js.native
}

/* static members */
@JSImport("tabris", "Percent")
@js.native
object Percent extends js.Object {
  /**
    * Creates a new instance of Percent using any valid percent expression. For any other value, including
    * `null` the method throws.
    * @param percentValue The value to create a Percent instance from
    */
  def from(percentValue: PercentValue): Percent = js.native
  /**
    * Returns true if value is a valid PercentValue. This excludes `null`. Use this to check if a value
    * will be accepted by Percent.from. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  def isValidPercentValue(value: js.Any): /* is tabris.tabris.PercentValue */ Boolean = js.native
}

