package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionCheckboxBase")
@js.native
class QuestionCheckboxBase protected () extends QuestionSelectBase {
  def this(name: java.lang.String) = this()
  /**
    * The number of columns for radiogroup and checkbox questions. Items are rendred in one line if the value is 0.
    */
  var colCount: scala.Double = js.native
  def colCountChangedCallback(): scala.Unit = js.native
}

