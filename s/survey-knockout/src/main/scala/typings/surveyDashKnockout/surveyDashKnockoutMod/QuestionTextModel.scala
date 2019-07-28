package typings.surveyDashKnockout.surveyDashKnockoutMod

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
    * The maximim text length. If it is -1, defaul value, then the survey maxTextLength property will be used.
    * If it is 0, then the value is unlimited
    * @see SurveyModel.maxTextLength
    */
  var maxLength: Double = js.native
  /**
    * The input place holder.
    */
  var placeHolder: String = js.native
  /**
    * The text input size
    */
  var size: Double = js.native
  /* protected */ def correctValueType(newValue: js.Any): js.Any = js.native
  def getMaxLength(): js.Any = js.native
}

