package typings.winrt.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberFormatter extends js.Object {
  def format(value: Double): String
}

object INumberFormatter {
  @scala.inline
  def apply(format: Double => String): INumberFormatter = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format))
  
    __obj.asInstanceOf[INumberFormatter]
  }
}

