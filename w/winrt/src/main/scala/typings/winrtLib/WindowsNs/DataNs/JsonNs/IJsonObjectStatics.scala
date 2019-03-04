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
  def apply(
    parse: js.Function1[java.lang.String, JsonObject],
    tryParse: js.Function1[java.lang.String, winrtLib.Anon_ResultSucceeded]
  ): IJsonObjectStatics = {
    val __obj = js.Dynamic.literal(parse = parse, tryParse = tryParse)
  
    __obj.asInstanceOf[IJsonObjectStatics]
  }
}

