package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.IParentElement because Already inherited
- typings.surveyKnockout.mod.ISurveyElement because Already inherited
- typings.surveyKnockout.mod.IConditionRunner because Already inherited
- typings.surveyKnockout.mod.IPanel because Already inherited
- typings.surveyKnockout.mod.IPage because var conflicts: containsErrors, elements, isPage, isPanel, isReadOnly, isVisible, name, parent. Inlined isStarted */ @JSImport("survey-knockout", "PageModel")
@js.native
class PageModel () extends PanelModelBase {
  def this(name: String) = this()
  /**
    * The property returns true, if the elements are randomized on the page
    * @see hasShown
    * @see questionsOrder
    * @see SurveyModel.questionsOrder
    */
  val areQuestionsRandomized: Boolean = js.native
  val hasShown: Boolean = js.native
  /**
    * Returns true, if the page is started page in the survey. It can be shown on the start only and the end-user could not comeback to it after it passed it.
    */
  val isStarted: Boolean = js.native
  /**
    * The maximum time in seconds that end-user has to complete the page. If the value is 0 or less, the end-user has unlimited number of time to finish the page.
    * @see startTimer
    * @see SurveyModel.maxTimeToFinishPage
    */
  var maxTimeToFinish: Double = js.native
  /**
    * Set this property to "hide" to make "Prev", "Next" and "Complete" buttons are invisible for this page. Set this property to "show" to make these buttons visible, even if survey showNavigationButtons property is false.
    * @see SurveyMode.showNavigationButtons
    */
  var navigationButtonsVisibility: String = js.native
  var num: Double = js.native
  /**
    * Use this property to randomize questions. Set it to 'random' to randomize questions, 'initial' to keep them in the same order or 'default' to use the Survey questionsOrder property
    * @see SurveyModel.questionsOrder
    * @see areQuestionsRandomized
    */
  var questionsOrder: String = js.native
  /**
    * Time in seconds end-user spent on this page
    */
  var timeSpent: Double = js.native
  /**
    * The visible index of the page. It has values from 0 to visible page count - 1.
    * @see SurveyModel.visiblePages
    * @see SurveyModel.pages
    */
  var visibleIndex: Double = js.native
  /**
    * The property returns true, if the page has been shown to the end-user.
    */
  val wasShown: Boolean = js.native
  def dragDropFinish(): IElement = js.native
  def dragDropFinish(isCancel: Boolean): IElement = js.native
  def dragDropMoveTo(destination: ISurveyElement): Boolean = js.native
  def dragDropMoveTo(destination: ISurveyElement, isBottom: Boolean): Boolean = js.native
  def dragDropMoveTo(destination: ISurveyElement, isBottom: Boolean, isEdge: Boolean): Boolean = js.native
  def dragDropStart(src: IElement, target: IElement): Unit = js.native
  def dragDropStart(src: IElement, target: IElement, nestedPanelDepth: Double): Unit = js.native
  /**
    * Returns the list of all panels in the page
    */
  def getPanels(): js.Array[IPanel] = js.native
  def getPanels(visibleOnly: Boolean): js.Array[IPanel] = js.native
  def getPanels(visibleOnly: Boolean, includingDesignTime: Boolean): js.Array[IPanel] = js.native
  /* protected */ def onNumChanged(value: Double): Unit = js.native
  /**
    * Call it to scroll to the page top.
    */
  def scrollToTop(): Unit = js.native
  def setWasShown(`val`: Boolean): Unit = js.native
}

