package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "PopupSurveyModel")
@js.native
open class PopupSurveyModel protected () extends Base {
  def this(jsonObj: Any) = this()
  def this(jsonObj: Any, initialModel: SurveyModel) = this()
  
  def changeExpandCollapse(): Unit = js.native
  
  /*
    * Set this value to negative value, for example -1, to avoid closing the popup window on completing the survey. Leave it equals to 0 (default value) to close the popup window immediately, or set it to 3, 5, 10, ... to close the popup window in 3, 5, 10 seconds.
    */
  var closeOnCompleteTimeout: Double = js.native
  
  /*
    * Collapse the popup window and show survey title only.
    */
  def collapse(): Unit = js.native
  
  /* protected */ def createSurvey(jsonObj: Any): SurveyModel = js.native
  
  def css: Any = js.native
  
  def cssBody: String = js.native
  
  def cssButton: String = js.native
  
  def cssHeaderRoot: String = js.native
  
  def cssHeaderTitle: String = js.native
  
  def cssRoot: String = js.native
  
  /*
    * Expand the popup window to show the survey.
    */
  def expand(): Unit = js.native
  
  var expandedChangedCallback: Any = js.native
  
  /*
    * Hide the popup window
    */
  def hide(): Unit = js.native
  
  /*
    * Returns true if the popup window is expanded. Set it to true to expand the popup window or false to collapse it.
    */
  def isExpanded: Boolean = js.native
  def isExpanded_=(`val`: Boolean): Unit = js.native
  
  /*
    * Returns true if the popup window is currently showing. Set it to true to show the popup window and false to hide it.
    */
  def isShowing: Boolean = js.native
  def isShowing_=(`val`: Boolean): Unit = js.native
  
  def locTitle: LocalizableString = js.native
  
  /* protected */ def onCreating(): Unit = js.native
  
  /* protected */ def onExpandedChanged(): Unit = js.native
  
  /* protected */ def onSurveyComplete(): Unit = js.native
  
  def renderedWidth: String = js.native
  
  /*
    * Show the popup window
    */
  def show(): Unit = js.native
  
  var showingChangedCallback: Any = js.native
  
  /*
    * A survey object.
    */
  def survey: SurveyModel = js.native
  
  var surveyValue: SurveyModel = js.native
  
  var templateValue: String = js.native
  
  /*
    * The popup window and survey title.
    */
  def title: String = js.native
  def title_=(`val`: String): Unit = js.native
  
  var width: String = js.native
  
  var windowElement: Any = js.native
}
/* static members */
object PopupSurveyModel {
  
  @JSImport("survey-knockout", "PopupSurveyModel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "PopupSurveyModel.surveyElementName")
  @js.native
  def surveyElementName: String = js.native
  inline def surveyElementName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("surveyElementName")(x.asInstanceOf[js.Any])
}
