package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionImplementor")
@js.native
class QuestionImplementor protected () extends ImplementorBase {
  def this(question: Question) = this()
  var koComment: js.Any = js.native
  var koElementType: js.Any = js.native
  var koTemplateName: js.Any = js.native
  var question: Question = js.native
  /* protected */ def getNo(): java.lang.String = js.native
  /* protected */ def getQuestionTemplate(): java.lang.String = js.native
  /* protected */ def koQuestionAfterRender(elements: js.Any, con: js.Any): scala.Unit = js.native
  /* protected */ def onCommentChanged(): scala.Unit = js.native
  /* protected */ def onSurveyLoad(): scala.Unit = js.native
  /* protected */ def onVisibleIndexChanged(): scala.Unit = js.native
  /* protected */ def updateComment(newValue: js.Any): scala.Unit = js.native
  /* protected */ def updateKoDummy(): scala.Unit = js.native
  /* protected */ def updateQuestion(): scala.Unit = js.native
}

