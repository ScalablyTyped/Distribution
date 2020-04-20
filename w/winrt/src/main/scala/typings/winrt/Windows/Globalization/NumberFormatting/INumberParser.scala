package typings.winrt.Windows.Globalization.NumberFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberParser extends js.Object {
  def parseDouble(text: String): Double
  def parseInt(text: String): Double
  def parseUInt(text: String): Double
}

object INumberParser {
  @scala.inline
  def apply(parseDouble: String => Double, parseInt: String => Double, parseUInt: String => Double): INumberParser = {
    val __obj = js.Dynamic.literal(parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt))
    __obj.asInstanceOf[INumberParser]
  }
}

