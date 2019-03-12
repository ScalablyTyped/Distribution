package typings
package winrtLib.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberParser extends js.Object {
  def parseDouble(text: java.lang.String): scala.Double
  def parseInt(text: java.lang.String): scala.Double
  def parseUInt(text: java.lang.String): scala.Double
}

object INumberParser {
  @scala.inline
  def apply(
    parseDouble: java.lang.String => scala.Double,
    parseInt: java.lang.String => scala.Double,
    parseUInt: java.lang.String => scala.Double
  ): INumberParser = {
    val __obj = js.Dynamic.literal(parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt))
  
    __obj.asInstanceOf[INumberParser]
  }
}

