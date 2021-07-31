package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "CustomError")
@js.native
class CustomError protected () extends SurveyError {
  def this(text: String) = this()
  def this(text: String, errorOwner: ISurveyErrorOwner) = this()
}
