package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionCommentModel")
@js.native
class QuestionCommentModel protected () extends Question {
  def this(name: java.lang.String) = this()
  /**
    * The html cols attribute.
    */
  var cols: scala.Double = js.native
  val locPlaceHolder: LocalizableString = js.native
  /**
    * The maximim text length. If it is -1, defaul value, then the survey maxTextLength property will be used.
    * If it is 0, then the value is unlimited
    * @see SurveyModel.maxTextLength
    */
  var maxLength: scala.Double = js.native
  /**
    * Use this property to set the input place holder.
    */
  var placeHolder: java.lang.String = js.native
  /**
    * The html rows attribute.
    */
  var rows: scala.Double = js.native
  def getMaxLength(): js.Any = js.native
}

