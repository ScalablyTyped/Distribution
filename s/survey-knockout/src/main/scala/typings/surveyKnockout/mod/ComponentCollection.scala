package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ComponentCollection")
@js.native
class ComponentCollection () extends js.Object {
  
  def add(json: js.Any): Unit = js.native
  
  def clear(): Unit = js.native
  
  /* protected */ def createCompositeModel(name: String, questionJSON: ComponentQuestionJSON): QuestionCompositeModel = js.native
  
  /* protected */ def createCustomModel(name: String, questionJSON: ComponentQuestionJSON): QuestionCustomModel = js.native
  
  def createQuestion(name: String, questionJSON: ComponentQuestionJSON): Question = js.native
  
  def getCustomQuestionByName(name: String): ComponentQuestionJSON = js.native
  
  val items: js.Array[ComponentQuestionJSON] = js.native
  
  def onAddingJson(name: String, isComposite: Boolean): Unit = js.native
  
  def onCreateComposite(name: String, questionJSON: ComponentQuestionJSON): QuestionCompositeModel = js.native
  
  def onCreateCustom(name: String, questionJSON: ComponentQuestionJSON): QuestionCustomModel = js.native
}
/* static members */
@JSImport("survey-knockout", "ComponentCollection")
@js.native
object ComponentCollection extends js.Object {
  
  var Instance: ComponentCollection = js.native
}
