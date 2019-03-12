package typings
package winrtLib.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberFormatter2 extends js.Object {
  def formatDouble(value: scala.Double): java.lang.String
  def formatInt(value: scala.Double): java.lang.String
  def formatUInt(value: scala.Double): java.lang.String
}

object INumberFormatter2 {
  @scala.inline
  def apply(
    formatDouble: scala.Double => java.lang.String,
    formatInt: scala.Double => java.lang.String,
    formatUInt: scala.Double => java.lang.String
  ): INumberFormatter2 = {
    val __obj = js.Dynamic.literal(formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt))
  
    __obj.asInstanceOf[INumberFormatter2]
  }
}

