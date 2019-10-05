package typings.winrt.Windows.Data.Json

import typings.winrt.Anon_ResultSucceededBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonValueStatics extends js.Object {
  def createBooleanValue(input: Boolean): JsonValue
  def createNumberValue(input: Double): JsonValue
  def createStringValue(input: String): JsonValue
  def parse(input: String): JsonValue
  def tryParse(input: String): Anon_ResultSucceededBoolean
}

object IJsonValueStatics {
  @scala.inline
  def apply(
    createBooleanValue: Boolean => JsonValue,
    createNumberValue: Double => JsonValue,
    createStringValue: String => JsonValue,
    parse: String => JsonValue,
    tryParse: String => Anon_ResultSucceededBoolean
  ): IJsonValueStatics = {
    val __obj = js.Dynamic.literal(createBooleanValue = js.Any.fromFunction1(createBooleanValue), createNumberValue = js.Any.fromFunction1(createNumberValue), createStringValue = js.Any.fromFunction1(createStringValue), parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
  
    __obj.asInstanceOf[IJsonValueStatics]
  }
}

