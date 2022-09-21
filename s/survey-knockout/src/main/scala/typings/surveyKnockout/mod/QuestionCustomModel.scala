package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCustomModel")
@js.native
open class QuestionCustomModel protected () extends QuestionCustomModelBase {
  def this(name: String, customQuestion: ComponentQuestionJSON) = this()
  
  def contentQuestion: Question = js.native
  
  /* protected */ def createQuestion(): Question = js.native
  
  var questionWrapper: Question = js.native
}
