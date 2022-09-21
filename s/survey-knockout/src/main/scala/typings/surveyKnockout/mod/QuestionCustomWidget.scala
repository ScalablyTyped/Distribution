package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCustomWidget")
@js.native
open class QuestionCustomWidget protected () extends StObject {
  def this(name: String, widgetJson: Any) = this()
  
  def activatedByChanged(activatedBy: String): Unit = js.native
  
  def afterRender(question: IQuestion, el: Any): Unit = js.native
  
  def canShowInToolbox: Boolean = js.native
  
  def getDisplayValue(question: IQuestion): String = js.native
  def getDisplayValue(question: IQuestion, value: Any): String = js.native
  
  var htmlTemplate: String = js.native
  
  def init(): Unit = js.native
  
  def isDefaultRender: Boolean = js.native
  
  def isFit(question: IQuestion): Boolean = js.native
  
  var name: String = js.native
  
  def pdfQuestionType: String = js.native
  
  def pdfRender: Any = js.native
  
  def showInToolbox: Boolean = js.native
  def showInToolbox_=(`val`: Boolean): Unit = js.native
  
  var widgetJson: Any = js.native
  
  def willUnmount(question: IQuestion, el: Any): Unit = js.native
}
