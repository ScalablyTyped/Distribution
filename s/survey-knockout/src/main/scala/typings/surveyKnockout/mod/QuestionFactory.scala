package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionFactory")
@js.native
class QuestionFactory () extends StObject {
  
  def clear(): Unit = js.native
  
  def createQuestion(questionType: String, name: String): Question = js.native
  
  def getAllTypes(): js.Array[String] = js.native
  
  def registerQuestion(questionType: String, questionCreator: js.Function1[/* name */ String, Question]): Unit = js.native
  
  def unregisterElement(elementType: String): Unit = js.native
}
/* static members */
object QuestionFactory {
  
  @JSImport("survey-knockout", "QuestionFactory")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "QuestionFactory.DefaultChoices")
  @js.native
  val DefaultChoices: js.Array[String] = js.native
  
  @JSImport("survey-knockout", "QuestionFactory.DefaultColums")
  @js.native
  val DefaultColums: js.Array[String] = js.native
  
  @JSImport("survey-knockout", "QuestionFactory.DefaultRows")
  @js.native
  val DefaultRows: js.Array[String] = js.native
  
  @JSImport("survey-knockout", "QuestionFactory.Instance")
  @js.native
  def Instance: QuestionFactory = js.native
  inline def Instance_=(x: QuestionFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instance")(x.asInstanceOf[js.Any])
}
