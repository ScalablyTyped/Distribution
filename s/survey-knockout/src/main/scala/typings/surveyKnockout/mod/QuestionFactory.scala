package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionFactory")
@js.native
open class QuestionFactory () extends StObject {
  
  def clear(): Unit = js.native
  
  def createQuestion(questionType: String, name: String): Question = js.native
  
  var creatorHash: Any = js.native
  
  def getAllTypes(): js.Array[Any] = js.native
  
  def registerQuestion(questionType: String, questionCreator: js.Function1[/* name */ String, Question]): Unit = js.native
  
  def unregisterElement(elementType: String): Unit = js.native
}
/* static members */
object QuestionFactory {
  
  @JSImport("survey-knockout", "QuestionFactory")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "QuestionFactory.Instance")
  @js.native
  def Instance: QuestionFactory = js.native
  inline def Instance_=(x: QuestionFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instance")(x.asInstanceOf[js.Any])
}
