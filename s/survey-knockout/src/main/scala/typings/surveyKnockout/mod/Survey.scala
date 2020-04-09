package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "Survey")
@js.native
class Survey () extends SurveyModel {
  def this(jsonObj: js.Any) = this()
  def this(jsonObj: js.Any, renderedElement: js.Any) = this()
  def this(jsonObj: js.Any, renderedElement: js.Any, css: js.Any) = this()
  val completedCss: String = js.native
  val cssNavigationComplete: String = js.native
  val cssNavigationNext: String = js.native
  val cssNavigationPrev: String = js.native
  val cssNavigationStart: String = js.native
  var dummyObservable: js.Any = js.native
  var koAfterRenderHeader: js.Any = js.native
  var koAfterRenderPage: js.Any = js.native
  var koCompletedState: js.Any = js.native
  var koCompletedStateCss: js.Any = js.native
  var koCompletedStateText: js.Any = js.native
  var koCurrentPage: js.Any = js.native
  var koIsFirstPage: js.Any = js.native
  var koIsLastPage: js.Any = js.native
  var koProgress: js.Any = js.native
  var koProgressText: js.Any = js.native
  var koState: js.Any = js.native
  var koTimerInfoText: js.Any = js.native
  /* protected */ def getHtmlTemplate(): String = js.native
  def koEventAfterRender(element: js.Any, survey: js.Any): Unit = js.native
  def loadSurveyFromService(surveyId: String, clientId: String, renderedElement: js.Any): Unit = js.native
  def nextPageMouseDown(): Unit = js.native
  def nextPageUIClick(): Unit = js.native
  def render(): Unit = js.native
  def render(element: js.Any): Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "Survey")
@js.native
object Survey extends js.Object {
  var cssType: String = js.native
}

