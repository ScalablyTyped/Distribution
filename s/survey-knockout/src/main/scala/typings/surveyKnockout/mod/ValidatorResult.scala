package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ValidatorResult")
@js.native
open class ValidatorResult protected () extends StObject {
  def this(value: Any) = this()
  def this(value: Any, error: SurveyError) = this()
  
  var error: SurveyError = js.native
  
  var value: Any = js.native
}
