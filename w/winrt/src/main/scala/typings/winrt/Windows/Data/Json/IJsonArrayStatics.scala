package typings.winrt.Windows.Data.Json

import typings.winrt.AnonResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonArrayStatics extends js.Object {
  def parse(input: String): JsonArray
  def tryParse(input: String): AnonResult
}

object IJsonArrayStatics {
  @scala.inline
  def apply(parse: String => JsonArray, tryParse: String => AnonResult): IJsonArrayStatics = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
    __obj.asInstanceOf[IJsonArrayStatics]
  }
}

