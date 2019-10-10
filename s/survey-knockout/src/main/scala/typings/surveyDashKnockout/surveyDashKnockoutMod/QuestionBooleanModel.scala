package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionBooleanModel")
@js.native
class QuestionBooleanModel protected () extends Question {
  def this(name: String) = this()
  val checkedLabel: String = js.native
  /**
    * Get/set question value in 3 modes: indeterminate (value is empty), true (check is set) and false (check is unset).
    * @see valueTrue
    * @see valueFalse
    */
  var checkedValue: js.Any = js.native
  /**
    * Returns true if the question check will be rendered in indeterminate mode. value is empty.
    */
  val isIndeterminate: Boolean = js.native
  /**
    * The checkbox label. If it is empty and showTitle is false then title is rendered
    * @see showTitle
    * @see title
    */
  var label: String = js.native
  val locDisplayLabel: LocalizableString = js.native
  val locLabel: LocalizableString = js.native
  /**
    * Set this property to true to show the question title. It is hidden by default.
    */
  var showTitle: Boolean = js.native
  val uncheckedLabel: String = js.native
  /**
    * Set this property, if you want to have a different value from false when check is unset.
    */
  var valueFalse: js.Any = js.native
  /**
    * Set this property, if you want to have a different value from true when check is set.
    */
  var valueTrue: js.Any = js.native
}

