package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyTemplateText")
@js.native
class SurveyTemplateText () extends js.Object {
  
  def addText(newText: String, id: String, name: String): Unit = js.native
  
  /* protected */ def getId(id: String, questionType: String): String = js.native
  
  def replaceText(replaceText: String, id: String): Unit = js.native
  def replaceText(replaceText: String, id: String, questionType: String): Unit = js.native
  
  var text: String = js.native
}
