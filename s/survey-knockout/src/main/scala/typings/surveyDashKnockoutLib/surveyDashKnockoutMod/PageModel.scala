package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- surveyDashKnockoutLib.surveyDashKnockoutMod.IPage because var conflicts: isPage, isReadOnly, isVisible, name, parent. Inlined  */ @JSImport("survey-knockout", "PageModel")
@js.native
class PageModel () extends PanelModelBase {
  def this(name: java.lang.String) = this()
  /**
    * The property returns true, if the elements are randomized on the page
    * @see hasShown
    * @see questionsOrder
    * @see SurveyModel.questionsOrder
    */
  val areQuestionsRandomized: scala.Boolean = js.native
  val hasShown: scala.Boolean = js.native
  /**
    * Returns true, if the page is started page in the survey. It can be shown on the start only and the end-user could not comeback to it after it passed it.
    */
  val isStarted: scala.Boolean = js.native
  /**
    * The maximum time in seconds that end-user has to complete the page. If the value is 0 or less, the end-user has unlimited number of time to finish the page.
    * @see startTimer
    * @see SurveyModel.maxTimeToFinishPage
    */
  var maxTimeToFinish: scala.Double = js.native
  /**
    * Set this property to "hide" to make "Prev", "Next" and "Complete" buttons are invisible for this page. Set this property to "show" to make these buttons visible, even if survey showNavigationButtons property is false.
    * @see SurveyMode.showNavigationButtons
    */
  var navigationButtonsVisibility: java.lang.String = js.native
  var num: scala.Double = js.native
  /**
    * Use this property to randomize questions. Set it to 'random' to randomize questions, 'initial' to keep them in the same order or 'default' to use the Survey questionsOrder property
    * @see SurveyModel.questionsOrder
    * @see areQuestionsRandomized
    */
  var questionsOrder: java.lang.String = js.native
  /**
    * Time in seconds end-user spent on this page
    */
  var timeSpent: scala.Double = js.native
  /**
    * The visible index of the page. It has values from 0 to visible page count - 1.
    * @see SurveyModel.visiblePages
    * @see SurveyModel.pages
    */
  var visibleIndex: scala.Double = js.native
  /**
    * The property returns true, if the page has been shown to the end-user.
    */
  val wasShown: scala.Boolean = js.native
  def dragDropFinish(): IElement = js.native
  def dragDropFinish(isCancel: scala.Boolean): IElement = js.native
  def dragDropMoveTo(destination: ISurveyElement): scala.Boolean = js.native
  def dragDropMoveTo(destination: ISurveyElement, isBottom: scala.Boolean): scala.Boolean = js.native
  def dragDropMoveTo(destination: ISurveyElement, isBottom: scala.Boolean, isEdge: scala.Boolean): scala.Boolean = js.native
  def dragDropStart(src: IElement, target: IElement): scala.Unit = js.native
  def dragDropStart(src: IElement, target: IElement, nestedPanelDepth: scala.Double): scala.Unit = js.native
  /**
    * Call it to focus the input of the first question that has an error.
    */
  def focusFirstErrorQuestion(): scala.Unit = js.native
  /**
    * Call it to focus the input on the first question
    */
  def focusFirstQuestion(): scala.Unit = js.native
  /**
    * Returns the list of all panels in the page
    */
  def getPanels(): js.Array[IPanel] = js.native
  def getPanels(visibleOnly: scala.Boolean): js.Array[IPanel] = js.native
  def getPanels(visibleOnly: scala.Boolean, includingDesignTime: scala.Boolean): js.Array[IPanel] = js.native
  /* protected */ def onNumChanged(value: scala.Double): scala.Unit = js.native
  /**
    * Call it to scroll to the page top.
    */
  def scrollToTop(): scala.Unit = js.native
  def setWasShown(`val`: scala.Boolean): scala.Unit = js.native
}

