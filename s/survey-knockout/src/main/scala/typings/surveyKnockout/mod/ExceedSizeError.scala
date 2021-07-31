package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ExceedSizeError")
@js.native
class ExceedSizeError protected () extends SurveyError {
  def this(maxSize: Double) = this()
  def this(maxSize: Double, errorOwner: ISurveyErrorOwner) = this()
}
