package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQuestion
  extends StObject
     with IElement
     with ISurveyErrorOwner {
  
  def clearUnusedValues(): Any = js.native
  
  def clearValue(): Any = js.native
  
  def clearValueIfInvisible(): Any = js.native
  
  def getDisplayValue(keysAsText: Boolean, value: Any): Any = js.native
  
  def getQuestionFromArray(name: String, index: Double): IQuestion = js.native
  
  def getValueName(): String = js.native
  
  var hasTitle: Boolean = js.native
  
  def isAnswerCorrect(): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  def onSurveyValueChanged(newValue: Any): Any = js.native
  
  def supportGoNextPageAutomatic(): Boolean = js.native
  
  var survey: Any = js.native
  
  def updateCommentFromSurvey(newValue: Any): Any = js.native
  
  def updateValueFromSurvey(newValue: Any): Any = js.native
  
  def updateValueWithDefaults(): Any = js.native
  
  var value: Any = js.native
}
