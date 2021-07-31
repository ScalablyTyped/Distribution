package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCommentModel")
@js.native
class QuestionCommentModel protected () extends Question {
  def this(name: String) = this()
  
  /**
    * The html cols attribute.
    */
  var cols: Double = js.native
  
  def getMaxLength(): js.Any = js.native
  
  val locPlaceHolder: LocalizableString = js.native
  
  /**
    * The maximum text length. If it is -1, defaul value, then the survey maxTextLength property will be used.
    * If it is 0, then the value is unlimited
    * @see SurveyModel.maxTextLength
    */
  var maxLength: Double = js.native
  
  /**
    * Use this property to set the input place holder.
    */
  var placeHolder: String = js.native
  
  /**
    * The html rows attribute.
    */
  var rows: Double = js.native
  
  /**
    * Gets or sets a value that specifies how the question updates it's value.
    *
    * The following options are available:
    * - `default` - get the value from survey.textUpdateMode
    * - `onBlur` - the value is updated after an input loses the focus.
    * - `onTyping` - update the value of text questions, "text" and "comment", on every key press.
    *
    * Note, that setting to "onTyping" may lead to a performance degradation, in case you have many expressions in the survey.
    * @see survey.textUpdateMode
    */
  var textUpdateMode: String = js.native
}
