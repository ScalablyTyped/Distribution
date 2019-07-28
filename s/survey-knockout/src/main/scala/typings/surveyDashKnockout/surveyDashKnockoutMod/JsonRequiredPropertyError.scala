package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "JsonRequiredPropertyError")
@js.native
class JsonRequiredPropertyError protected () extends JsonError {
  def this(propertyName: String, className: String) = this()
  var className: String = js.native
  var propertyName: String = js.native
}

