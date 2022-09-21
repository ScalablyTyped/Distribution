package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "MinRowCountError")
@js.native
open class MinRowCountError protected () extends SurveyError {
  def this(minRowCount: Double) = this()
  def this(minRowCount: Double, errorOwner: ISurveyErrorOwner) = this()
  
  var minRowCount: Double = js.native
}
