package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionTextBase")
@js.native
open class QuestionTextBase protected () extends Question {
  def this(name: String) = this()
  
  /* protected */ def calcRenderedPlaceholder(): Unit = js.native
  
  def getControlClass(): String = js.native
  
  def getMaxLength(): Any = js.native
  
  /* protected */ def hasPlaceHolder(): Boolean = js.native
  
  def locPlaceHolder: LocalizableString = js.native
  
  def locPlaceholder: LocalizableString = js.native
  
  /*
    * The maximum text length. If it is -1, defaul value, then the survey maxTextLength property will be used.
    * If it is 0, then the value is unlimited
    */
  def maxLength: Double = js.native
  def maxLength_=(`val`: Double): Unit = js.native
  
  def placeHolder: String = js.native
  def placeHolder_=(`val`: String): Unit = js.native
  
  /*
    * Use this property to set the input place holder.
    */
  def placeholder: String = js.native
  def placeholder_=(`val`: String): Unit = js.native
  
  def renderedPlaceholder: String = js.native
  
  /* protected */ def setRenderedPlaceholder(`val`: String): Unit = js.native
  
  /*
    * Gets or sets a value that specifies how the question updates it's value.
    * 
    * The following options are available:
    * - `default` - get the value from survey.textUpdateMode
    * - `onBlur` - the value is updated after an input loses the focus.
    * - `onTyping` - update the value of text questions, "text" and "comment", on every key press.
    * 
    * Note, that setting to "onTyping" may lead to a performance degradation, in case you have many expressions in the survey.
    */
  def textUpdateMode: String = js.native
  def textUpdateMode_=(`val`: String): Unit = js.native
}
