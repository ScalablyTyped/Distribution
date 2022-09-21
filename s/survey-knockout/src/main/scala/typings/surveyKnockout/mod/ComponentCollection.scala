package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ComponentCollection")
@js.native
open class ComponentCollection () extends StObject {
  
  def add(json: ICustomQuestionTypeConfiguration): Unit = js.native
  
  def clear(): Unit = js.native
  
  /* protected */ def createCompositeModel(name: String, questionJSON: ComponentQuestionJSON): QuestionCompositeModel = js.native
  
  /* protected */ def createCustomModel(name: String, questionJSON: ComponentQuestionJSON): QuestionCustomModel = js.native
  
  def createQuestion(name: String, questionJSON: ComponentQuestionJSON): Question = js.native
  
  var customQuestionValues: Any = js.native
  
  def getCustomQuestionByName(name: String): ComponentQuestionJSON = js.native
  
  def items: Any = js.native
  
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
  inline def Instance_=(x: ComponentCollection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instance")(x.asInstanceOf[js.Any])
}
