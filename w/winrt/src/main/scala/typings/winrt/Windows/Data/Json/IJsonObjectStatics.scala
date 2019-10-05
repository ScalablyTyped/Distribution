package typings.winrt.Windows.Data.Json

import typings.winrt.Anon_ResultSucceeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonObjectStatics extends js.Object {
  def parse(input: String): JsonObject
  def tryParse(input: String): Anon_ResultSucceeded
}

object IJsonObjectStatics {
  @scala.inline
  def apply(parse: String => JsonObject, tryParse: String => Anon_ResultSucceeded): IJsonObjectStatics = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
  
    __obj.asInstanceOf[IJsonObjectStatics]
  }
}

