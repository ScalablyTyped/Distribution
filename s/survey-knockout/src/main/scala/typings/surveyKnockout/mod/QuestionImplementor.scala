package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionImplementor")
@js.native
open class QuestionImplementor protected () extends ImplementorBase {
  def this(question: Any) = this()
  
  var _koValue: Any = js.native
  
  var callBackFunctions: Any = js.native
  
  var disposedObjects: Any = js.native
  
  /* protected */ def getKoValue(): Any = js.native
  
  /* protected */ def getNo(): String = js.native
  
  /* protected */ def getQuestionTemplate(): String = js.native
  
  var koDummy: Any = js.native
  
  var koElementType: Any = js.native
  
  /* protected */ def koQuestionAfterRender(elements: Any, con: Any): Unit = js.native
  
  /* protected */ def onSurveyLoad(): Unit = js.native
  
  var question: Any = js.native
  
  /* protected */ def setCallbackFunc(name: String, func: Any): Unit = js.native
  
  /* protected */ def setKoValue(`val`: Any): Unit = js.native
  
  /* protected */ def setObservaleObj(name: String, obj: Any): Any = js.native
  /* protected */ def setObservaleObj(name: String, obj: Any, addToQuestion: Boolean): Any = js.native
  
  /* protected */ def updateKoDummy(): Unit = js.native
}
