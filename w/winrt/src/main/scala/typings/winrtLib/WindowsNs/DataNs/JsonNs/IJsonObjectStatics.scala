package typings
package winrtLib.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonObjectStatics extends js.Object {
  def parse(input: java.lang.String): JsonObject
  def tryParse(input: java.lang.String): winrtLib.Anon_ResultSucceeded
}

object IJsonObjectStatics {
  @scala.inline
  def apply(parse: java.lang.String => JsonObject, tryParse: java.lang.String => winrtLib.Anon_ResultSucceeded): IJsonObjectStatics = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
  
    __obj.asInstanceOf[IJsonObjectStatics]
  }
}

