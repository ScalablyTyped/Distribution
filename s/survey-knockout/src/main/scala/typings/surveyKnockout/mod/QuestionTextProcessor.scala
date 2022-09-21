package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionTextProcessor")
@js.native
open class QuestionTextProcessor protected ()
  extends StObject
     with ITextProcessor {
  def this(variableName: String) = this()
  
  /* protected */ def getParentTextProcessor(): ITextProcessor = js.native
  
  /* protected */ def getQuestionByName(name: String): Question = js.native
  
  /* protected */ def getQuestionDisplayText(question: Question): String = js.native
  
  /* protected */ def getValues(): Any = js.native
  
  /* protected */ def onCustomProcessText(textValue: TextPreProcessorValue): Boolean = js.native
  
  /* protected */ def panel: PanelModel = js.native
  
  /* CompleteClass */
  override def processText(text: String, returnDisplayValue: Boolean): String = js.native
  
  def processTextEx(text: String, returnDisplayValue: Boolean): Any = js.native
  /* CompleteClass */
  override def processTextEx(text: String, returnDisplayValue: Boolean, doEncoding: Boolean): Any = js.native
  
  def processValue(name: String, returnDisplayValue: Boolean): TextPreProcessorValue = js.native
  
  /* protected */ def survey: ISurvey = js.native
  
  var textPreProcessor: TextPreProcessor = js.native
}
