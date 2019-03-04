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
    parseDouble: js.Function1[java.lang.String, scala.Double],
    parseInt: js.Function1[java.lang.String, scala.Double],
    parseUInt: js.Function1[java.lang.String, scala.Double]
  ): INumberParser = {
    val __obj = js.Dynamic.literal(parseDouble = parseDouble, parseInt = parseInt, parseUInt = parseUInt)
  
    __obj.asInstanceOf[INumberParser]
  }
}

