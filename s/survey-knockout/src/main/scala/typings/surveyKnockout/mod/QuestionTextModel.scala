package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionTextModel")
@js.native
class QuestionTextModel protected () extends Question {
  def this(name: String) = this()
  /**
    * Use this property to change the default input type.
    */
  var inputType: String = js.native
  val locPlaceHolder: LocalizableString = js.native
  /**
    * The maximum value
    */
  var max: String = js.native
  /**
    * The maximum text length. If it is -1, defaul value, then the survey maxTextLength property will be used.
    * If it is 0, then the value is unlimited
    * @see SurveyModel.maxTextLength
    */
  var maxLength: Double = js.native
  /**
    * The minimum value
    */
  var min: String = js.native
  /**
    * The input place holder.
    */
  var placeHolder: String = js.native
  /**
    * The text input size
    */
  var size: Double = js.native
  /**
    * The step value
    */
  var step: String = js.native
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
  /* protected */ def correctValueType(newValue: js.Any): js.Any = js.native
  def getMaxLength(): js.Any = js.native
}

