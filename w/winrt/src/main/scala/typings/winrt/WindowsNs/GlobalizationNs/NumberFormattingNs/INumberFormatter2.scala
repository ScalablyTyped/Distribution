package typings.winrt.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberFormatter2 extends js.Object {
  def formatDouble(value: Double): String
  def formatInt(value: Double): String
  def formatUInt(value: Double): String
}

object INumberFormatter2 {
  @scala.inline
  def apply(formatDouble: Double => String, formatInt: Double => String, formatUInt: Double => String): INumberFormatter2 = {
    val __obj = js.Dynamic.literal(formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt))
  
    __obj.asInstanceOf[INumberFormatter2]
  }
}

