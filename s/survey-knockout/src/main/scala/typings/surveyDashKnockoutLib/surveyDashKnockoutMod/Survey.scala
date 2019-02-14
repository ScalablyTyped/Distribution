package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "Survey")
@js.native
class Survey () extends SurveyModel {
  def this(jsonObj: js.Any) = this()
  def this(jsonObj: js.Any, renderedElement: js.Any) = this()
  def this(jsonObj: js.Any, renderedElement: js.Any, css: js.Any) = this()
  val completedCss: java.lang.String = js.native
  var css: js.Any = js.native
  val cssNavigationComplete: java.lang.String = js.native
  val cssNavigationNext: java.lang.String = js.native
  val cssNavigationPrev: java.lang.String = js.native
  val cssNavigationStart: java.lang.String = js.native
  var dummyObservable: js.Any = js.native
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
  var onRendered: Event[js.Function1[/* sender */ SurveyModel, _], _] = js.native
  /* protected */ def getHtmlTemplate(): java.lang.String = js.native
  def koEventAfterRender(element: js.Any, survey: js.Any): scala.Unit = js.native
  def loadSurveyFromService(surveyId: java.lang.String, clientId: java.lang.String, renderedElement: js.Any): scala.Unit = js.native
  def nextPageMouseDown(): scala.Unit = js.native
  def nextPageUIClick(): scala.Unit = js.native
  def render(): scala.Unit = js.native
  def render(element: js.Any): scala.Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "Survey")
@js.native
object Survey extends js.Object {
  var cssType: java.lang.String = js.native
}

