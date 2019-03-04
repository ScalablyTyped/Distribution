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
    formatDouble: js.Function1[scala.Double, java.lang.String],
    formatInt: js.Function1[scala.Double, java.lang.String],
    formatUInt: js.Function1[scala.Double, java.lang.String]
  ): INumberFormatter2 = {
    val __obj = js.Dynamic.literal(formatDouble = formatDouble, formatInt = formatInt, formatUInt = formatUInt)
  
    __obj.asInstanceOf[INumberFormatter2]
  }
}

