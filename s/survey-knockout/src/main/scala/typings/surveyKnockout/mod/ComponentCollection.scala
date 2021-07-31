package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ComponentCollection")
@js.native
class ComponentCollection () extends StObject {
  
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
object ComponentCollection {
  
  @JSImport("survey-knockout", "ComponentCollection")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "ComponentCollection.Instance")
  @js.native
  def Instance: ComponentCollection = js.native
  @scala.inline
  def Instance_=(x: ComponentCollection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instance")(x.asInstanceOf[js.Any])
}
