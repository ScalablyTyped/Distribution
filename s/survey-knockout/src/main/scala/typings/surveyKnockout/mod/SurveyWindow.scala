package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyWindow")
@js.native
class SurveyWindow () extends SurveyWindowModel {
  def this(jsonObj: js.Any) = this()
  def this(jsonObj: js.Any, initialModel: SurveyModel) = this()
  def this(jsonObj: Unit, initialModel: SurveyModel) = this()
  
  val css: js.Any = js.native
  
  var doExpand: js.Any = js.native
  
  /* protected */ def doShowingChanged(): Unit = js.native
  
  /* protected */ def getDefaultTemplate(): String = js.native
  
  var koExpanded: js.Any = js.native
  
  var koExpandedCss: js.Any = js.native
  
  /* protected */ var template: String = js.native
}
