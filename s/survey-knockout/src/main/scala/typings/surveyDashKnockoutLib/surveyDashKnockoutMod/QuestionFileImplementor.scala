package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionFileImplementor")
@js.native
class QuestionFileImplementor protected () extends QuestionImplementor {
  def this(question: Question) = this()
  var koData: knockoutLib.KnockoutComputed[js.Array[_]] = js.native
  var koHasValue: knockoutLib.KnockoutComputed[scala.Boolean] = js.native
  @JSName("koInputTitle")
  var koInputTitle_Original: knockoutLib.KnockoutObservable[java.lang.String] = js.native
  @JSName("koState")
  var koState_Original: knockoutLib.KnockoutObservable[java.lang.String] = js.native
  def koInputTitle(): java.lang.String = js.native
  def koInputTitle(value: java.lang.String): scala.Unit = js.native
  def koState(): java.lang.String = js.native
  def koState(value: java.lang.String): scala.Unit = js.native
}

