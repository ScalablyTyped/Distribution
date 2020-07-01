package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionCommentModel")
@js.native
class QuestionCommentModel protected () extends Question {
  def this(name: String) = this()
  /**
    * The html cols attribute.
    */
  var cols: Double = js.native
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
  def getMaxLength(): js.Any = js.native
}

