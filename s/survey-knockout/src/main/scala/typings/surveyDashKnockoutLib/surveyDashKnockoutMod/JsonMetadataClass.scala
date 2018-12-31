package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "JsonMetadataClass")
@js.native
class JsonMetadataClass protected () extends js.Object {
  def this(name: java.lang.String, properties: js.Array[_]) = this()
  def this(name: java.lang.String, properties: js.Array[_], creator: js.Function1[/* json */ js.UndefOr[js.Any], _]) = this()
  def this(name: java.lang.String, properties: js.Array[_], creator: js.Function1[/* json */ js.UndefOr[js.Any], _], parentName: java.lang.String) = this()
  var name: java.lang.String = js.native
  var parentName: java.lang.String = js.native
  var properties: js.Array[JsonObjectProperty] = js.native
  def createProperty(propInfo: js.Any): JsonObjectProperty = js.native
  def creator(): js.Any = js.native
  def creator(json: js.Any): js.Any = js.native
  def find(name: java.lang.String): JsonObjectProperty = js.native
}

@JSImport("survey-knockout", "JsonMetadataClass")
@js.native
object JsonMetadataClass extends js.Object {
  var requiredSymbol: java.lang.String = js.native
  var typeSymbol: java.lang.String = js.native
}

