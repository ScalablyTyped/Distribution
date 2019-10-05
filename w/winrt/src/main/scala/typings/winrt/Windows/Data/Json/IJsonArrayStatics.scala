package typings.winrt.Windows.Data.Json

import typings.winrt.Anon_Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonArrayStatics extends js.Object {
  def parse(input: String): JsonArray
  def tryParse(input: String): Anon_Result
}

object IJsonArrayStatics {
  @scala.inline
  def apply(parse: String => JsonArray, tryParse: String => Anon_Result): IJsonArrayStatics = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
  
    __obj.asInstanceOf[IJsonArrayStatics]
  }
}

