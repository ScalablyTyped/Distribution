package typings
package winrtLib.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonArrayStatics extends js.Object {
  def parse(input: java.lang.String): JsonArray
  def tryParse(input: java.lang.String): winrtLib.Anon_Result
}

object IJsonArrayStatics {
  @scala.inline
  def apply(
    parse: js.Function1[java.lang.String, JsonArray],
    tryParse: js.Function1[java.lang.String, winrtLib.Anon_Result]
  ): IJsonArrayStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(parse)
    __obj.updateDynamic("tryParse")(tryParse)
    __obj.asInstanceOf[IJsonArrayStatics]
  }
}

