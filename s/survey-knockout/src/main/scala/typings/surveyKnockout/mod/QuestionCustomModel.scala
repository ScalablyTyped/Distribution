package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCustomModel")
@js.native
class QuestionCustomModel protected () extends QuestionCustomModelBase {
  def this(name: String, customQuestion: ComponentQuestionJSON) = this()
  
  val contentQuestion: Question = js.native
  
  /* protected */ def createQuestion(): Question = js.native
}
