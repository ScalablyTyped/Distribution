package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "JsonObject")
@js.native
class JsonObject () extends js.Object {
  var errors: js.Array[JsonError] = js.native
  def toJsonObject(obj: js.Any): js.Any = js.native
  def toJsonObject(obj: js.Any, storeDefaults: scala.Boolean): js.Any = js.native
  /* protected */ def toJsonObjectCore(obj: js.Any, property: JsonObjectProperty): js.Any = js.native
  /* protected */ def toJsonObjectCore(obj: js.Any, property: JsonObjectProperty, storeDefaults: scala.Boolean): js.Any = js.native
  def toObject(jsonObj: js.Any, obj: js.Any): scala.Unit = js.native
  def valueToJson(obj: js.Any, result: js.Any, property: JsonObjectProperty): scala.Unit = js.native
  def valueToJson(obj: js.Any, result: js.Any, property: JsonObjectProperty, storeDefaults: scala.Boolean): scala.Unit = js.native
  /* protected */ def valueToObj(value: js.Any, obj: js.Any, property: JsonObjectProperty): scala.Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "JsonObject")
@js.native
object JsonObject extends js.Object {
  val metaData: surveyDashKnockoutLib.surveyDashKnockoutMod.JsonMetadata = js.native
}

