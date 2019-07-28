package typings.surveyDashKnockout.surveyDashKnockoutMod

import typings.knockout.KnockoutComputed
import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionFileImplementor")
@js.native
class QuestionFileImplementor protected () extends QuestionImplementor {
  def this(question: Question) = this()
  @JSName("koData")
  var koData_Original: KnockoutComputed[js.Array[_]] = js.native
  @JSName("koHasValue")
  var koHasValue_Original: KnockoutComputed[Boolean] = js.native
  @JSName("koInputTitle")
  var koInputTitle_Original: KnockoutObservable[String] = js.native
  @JSName("koState")
  var koState_Original: KnockoutObservable[String] = js.native
  def koData(): js.Array[_] = js.native
  def koData(value: js.Array[_]): Unit = js.native
  def koHasValue(): Boolean = js.native
  def koHasValue(value: Boolean): Unit = js.native
  def koInputTitle(): String = js.native
  def koInputTitle(value: String): Unit = js.native
  def koState(): String = js.native
  def koState(value: String): Unit = js.native
}

