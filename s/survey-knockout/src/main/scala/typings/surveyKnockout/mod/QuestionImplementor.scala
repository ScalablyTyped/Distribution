package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionImplementor")
@js.native
class QuestionImplementor protected () extends ImplementorBase {
  def this(question: Question) = this()
  
  /* protected */ def getKoValue(): js.Any = js.native
  
  /* protected */ def getNo(): String = js.native
  
  /* protected */ def getQuestionTemplate(): String = js.native
  
  var koElementType: js.Any = js.native
  
  /* protected */ def koQuestionAfterRender(elements: js.Any, con: js.Any): Unit = js.native
  
  var koTemplateName: js.Any = js.native
  
  /* protected */ def onSurveyLoad(): Unit = js.native
  
  /* protected */ def onVisibleIndexChanged(): Unit = js.native
  
  var question: Question = js.native
  
  /* protected */ def updateKoDummy(): Unit = js.native
  
  /* protected */ def updateQuestion(): Unit = js.native
}
