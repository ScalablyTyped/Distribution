package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "SurveyWindowModel")
@js.native
class SurveyWindowModel protected () extends Base {
  def this(jsonObj: js.Any) = this()
  def this(jsonObj: js.Any, initialModel: SurveyModel) = this()
  /**
    * Set this value to negative value, for example -1, to avoid closing the window on completing the survey. Leave it equals to 0 (default value) to close the window immediately, or set it to 3, 5, 10, ... to close the window in 3, 5, 10 seconds.
    */
  var closeOnCompleteTimeout: scala.Double = js.native
  /**
    * Returns true if the window is expanded. Set it to true to expand the window or false to collapse it.
    * @see expand
    * @see collapse
    */
  var isExpanded: scala.Boolean = js.native
  /**
    * Returns true if the window is currently showing. Set it to true to show the window and false to hide it.
    * @see show
    * @see hide
    */
  var isShowing: scala.Boolean = js.native
  val locTitle: LocalizableString = js.native
  /**
    * A survey object.
    * @see SurveyModel
    */
  val survey: SurveyModel = js.native
  var surveyValue: SurveyModel = js.native
  var templateValue: java.lang.String = js.native
  /**
    * The window and survey title.
    */
  var title: java.lang.String = js.native
  var windowElement: stdLib.HTMLDivElement = js.native
  /* protected */ def closeWindowOnComplete(): scala.Unit = js.native
  def closeWindowOnCompleteCallback(): scala.Unit = js.native
  /**
    * Collapse the window and show survey title only.
    */
  def collapse(): scala.Unit = js.native
  /* protected */ def createSurvey(jsonObj: js.Any): SurveyModel = js.native
  /**
    * Expand the window to show the survey.
    */
  def expand(): scala.Unit = js.native
  /* protected */ def expandcollapse(value: scala.Boolean): scala.Unit = js.native
  def expandedChangedCallback(): scala.Unit = js.native
  /**
    * Hide the window
    * @see show
    * @see isShowing
    */
  def hide(): scala.Unit = js.native
  /* protected */ def onSurveyComplete(): scala.Unit = js.native
  /**
    * Show the window
    * @see hide
    * @see isShowing
    */
  def show(): scala.Unit = js.native
  def showingChangedCallback(): scala.Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "SurveyWindowModel")
@js.native
object SurveyWindowModel extends js.Object {
  var surveyElementName: java.lang.String = js.native
}

