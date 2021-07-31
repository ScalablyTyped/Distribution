package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "JsonRequiredPropertyError")
@js.native
class JsonRequiredPropertyError protected () extends JsonError {
  def this(propertyName: String, className: String) = this()
  
  var className: String = js.native
  
  var propertyName: String = js.native
}
