package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionFileImplementor")
@js.native
class QuestionFileImplementor protected () extends QuestionImplementor {
  def this(question: Question) = this()
  @JSName("koData")
  var koData_Original: knockoutLib.KnockoutComputed[js.Array[_]] = js.native
  @JSName("koHasValue")
  var koHasValue_Original: knockoutLib.KnockoutComputed[scala.Boolean] = js.native
  @JSName("koInputTitle")
  var koInputTitle_Original: knockoutLib.KnockoutObservable[java.lang.String] = js.native
  @JSName("koState")
  var koState_Original: knockoutLib.KnockoutObservable[java.lang.String] = js.native
  def koData(): js.Array[_] = js.native
  def koData(value: js.Array[_]): scala.Unit = js.native
  def koHasValue(): scala.Boolean = js.native
  def koHasValue(value: scala.Boolean): scala.Unit = js.native
  def koInputTitle(): java.lang.String = js.native
  def koInputTitle(value: java.lang.String): scala.Unit = js.native
  def koState(): java.lang.String = js.native
  def koState(value: java.lang.String): scala.Unit = js.native
}

