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
    createBooleanValue: js.Function1[scala.Boolean, JsonValue],
    createNumberValue: js.Function1[scala.Double, JsonValue],
    createStringValue: js.Function1[java.lang.String, JsonValue],
    parse: js.Function1[java.lang.String, JsonValue],
    tryParse: js.Function1[java.lang.String, winrtLib.Anon_ResultSucceededBoolean]
  ): IJsonValueStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createBooleanValue")(createBooleanValue)
    __obj.updateDynamic("createNumberValue")(createNumberValue)
    __obj.updateDynamic("createStringValue")(createStringValue)
    __obj.updateDynamic("parse")(parse)
    __obj.updateDynamic("tryParse")(tryParse)
    __obj.asInstanceOf[IJsonValueStatics]
  }
}

