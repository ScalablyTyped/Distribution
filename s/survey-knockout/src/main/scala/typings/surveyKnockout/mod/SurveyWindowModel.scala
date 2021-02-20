package typings.surveyKnockout.mod

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyWindowModel")
@js.native
class SurveyWindowModel protected () extends Base {
  def this(jsonObj: js.Any) = this()
  def this(jsonObj: js.Any, initialModel: SurveyModel) = this()
  
  /**
    * Set this value to negative value, for example -1, to avoid closing the window on completing the survey. Leave it equals to 0 (default value) to close the window immediately, or set it to 3, 5, 10, ... to close the window in 3, 5, 10 seconds.
    */
  var closeOnCompleteTimeout: Double = js.native
  
  /* protected */ def closeWindowOnComplete(): Unit = js.native
  
  def closeWindowOnCompleteCallback(): Unit = js.native
  
  /**
    * Collapse the window and show survey title only.
    */
  def collapse(): Unit = js.native
  
  /* protected */ def createSurvey(jsonObj: js.Any): SurveyModel = js.native
  
  /**
    * Expand the window to show the survey.
    */
  def expand(): Unit = js.native
  
  /* protected */ def expandcollapse(value: Boolean): Unit = js.native
  
  def expandedChangedCallback(): Unit = js.native
  
  /**
    * Hide the window
    * @see show
    * @see isShowing
    */
  def hide(): Unit = js.native
  
  /**
    * Returns true if the window is expanded. Set it to true to expand the window or false to collapse it.
    * @see expand
    * @see collapse
    */
  var isExpanded: Boolean = js.native
  
  /**
    * Returns true if the window is currently showing. Set it to true to show the window and false to hide it.
    * @see show
    * @see hide
    */
  var isShowing: Boolean = js.native
  
  val locTitle: LocalizableString = js.native
  
  /* protected */ def onSurveyComplete(): Unit = js.native
  
  /**
    * Show the window
    * @see hide
    * @see isShowing
    */
  def show(): Unit = js.native
  
  def showingChangedCallback(): Unit = js.native
  
  /**
    * A survey object.
    * @see SurveyModel
    */
  val survey: SurveyModel = js.native
  
  var surveyValue: SurveyModel = js.native
  
  var templateValue: String = js.native
  
  /**
    * The window and survey title.
    */
  var title: String = js.native
  
  var windowElement: HTMLDivElement = js.native
}
/* static members */
object SurveyWindowModel {
  
  @JSImport("survey-knockout", "SurveyWindowModel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "SurveyWindowModel.surveyElementName")
  @js.native
  def surveyElementName: String = js.native
  @scala.inline
  def surveyElementName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("surveyElementName")(x.asInstanceOf[js.Any])
}
