package typings
package winrtLib.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonValueStatics extends js.Object {
  def createBooleanValue(input: scala.Boolean): JsonValue
  def createNumberValue(input: scala.Double): JsonValue
  def createStringValue(input: java.lang.String): JsonValue
  def parse(input: java.lang.String): JsonValue
  def tryParse(input: java.lang.String): winrtLib.Anon_ResultSucceededBoolean
}

object IJsonValueStatics {
  @scala.inline
  def apply(
    createBooleanValue: scala.Boolean => JsonValue,
    createNumberValue: scala.Double => JsonValue,
    createStringValue: java.lang.String => JsonValue,
    parse: java.lang.String => JsonValue,
    tryParse: java.lang.String => winrtLib.Anon_ResultSucceededBoolean
  ): IJsonValueStatics = {
    val __obj = js.Dynamic.literal(createBooleanValue = js.Any.fromFunction1(createBooleanValue), createNumberValue = js.Any.fromFunction1(createNumberValue), createStringValue = js.Any.fromFunction1(createStringValue), parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
  
    __obj.asInstanceOf[IJsonValueStatics]
  }
}

