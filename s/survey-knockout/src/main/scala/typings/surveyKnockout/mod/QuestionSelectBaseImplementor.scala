package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionSelectBaseImplementor")
@js.native
class QuestionSelectBaseImplementor protected () extends QuestionImplementor {
  def this(question: Question) = this()
  val isOtherSelected: Boolean = js.native
  /* protected */ def onCreated(): Unit = js.native
}

