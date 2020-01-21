package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionCheckboxBase")
@js.native
class QuestionCheckboxBase protected () extends QuestionSelectBase {
  def this(name: String) = this()
  /**
    * The number of columns for radiogroup and checkbox questions. Items are rendred in one line if the value is 0.
    */
  var colCount: Double = js.native
  def colCountChangedCallback(): Unit = js.native
}

