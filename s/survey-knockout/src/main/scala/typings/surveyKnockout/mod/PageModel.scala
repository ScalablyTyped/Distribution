package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.IShortcutText because Already inherited
- typings.surveyKnockout.mod.IParentElement because Already inherited
- typings.surveyKnockout.mod.ISurveyElement because Already inherited
- typings.surveyKnockout.mod.IConditionRunner because Already inherited
- typings.surveyKnockout.mod.IPanel because Already inherited
- typings.surveyKnockout.mod.IPage because var conflicts: containsErrors, elements, isPage, isPanel, isReadOnly, isVisible, name, parent, shortcutText, skeletonComponentName. Inlined isStarted */ @JSImport("survey-knockout", "PageModel")
@js.native
open class PageModel () extends PanelModelBase {
  def this(name: String) = this()
  
  /*
    * The property returns true, if the elements are randomized on the page
    */
  def areQuestionsRandomized: Boolean = js.native
  
  /* protected */ def canShowPageNumber(): Boolean = js.native
  
  def cssRoot: String = js.native
  
  def dragDropFinish(): IElement = js.native
  def dragDropFinish(isCancel: Boolean): IElement = js.native
  
  var dragDropInfo: DragDropInfo = js.native
  
  def dragDropMoveTo(destination: ISurveyElement): Boolean = js.native
  def dragDropMoveTo(destination: ISurveyElement, isBottom: Boolean): Boolean = js.native
  def dragDropMoveTo(destination: ISurveyElement, isBottom: Boolean, isEdge: Boolean): Boolean = js.native
  def dragDropMoveTo(destination: ISurveyElement, isBottom: Unit, isEdge: Boolean): Boolean = js.native
  
  def dragDropStart(src: IElement, target: IElement): Unit = js.native
  def dragDropStart(src: IElement, target: IElement, nestedPanelDepth: Double): Unit = js.native
  
  /*
    * Returns the list of all panels in the page
    */
  def getPanels(): js.Array[IPanel] = js.native
  def getPanels(visibleOnly: Boolean): js.Array[IPanel] = js.native
  def getPanels(visibleOnly: Boolean, includingDesignTime: Boolean): js.Array[IPanel] = js.native
  def getPanels(visibleOnly: Unit, includingDesignTime: Boolean): js.Array[IPanel] = js.native
  
  def hasShown: Boolean = js.native
  
  var hasShownValue: Boolean = js.native
  
  @JSName("isPage")
  def isPage_MPageModel: Boolean = js.native
  
  /*
    * Returns true, if the page is started page in the survey. It can be shown on the start only and the end-user could not comeback to it after it passed it.
    */
  def isStarted: Boolean = js.native
  @JSName("isStarted")
  var isStarted_FPageModel: Boolean = js.native
  
  def locNavigationDescription: LocalizableString = js.native
  
  def locNavigationTitle: LocalizableString = js.native
  
  /*
    * The maximum time in seconds that end-user has to complete the page. If the value is 0 or less, the end-user has unlimited number of time to finish the page.
    */
  def maxTimeToFinish: Double = js.native
  def maxTimeToFinish_=(`val`: Double): Unit = js.native
  
  /*
    * Set this property to "hide" to make "Prev", "Next" and "Complete" buttons are invisible for this page. Set this property to "show" to make these buttons visible, even if survey showNavigationButtons property is false.
    */
  def navigationButtonsVisibility: String = js.native
  def navigationButtonsVisibility_=(`val`: String): Unit = js.native
  
  def navigationDescription: String = js.native
  def navigationDescription_=(`val`: String): Unit = js.native
  
  def navigationLocStrChanged(): Unit = js.native
  
  /*
    * Use this property to show title in navigation buttons. If the value is empty then page name is used.
    */
  def navigationTitle: String = js.native
  def navigationTitle_=(`val`: String): Unit = js.native
  
  var num: Double = js.native
  
  /* protected */ def onNumChanged(value: Double): Unit = js.native
  
  def passed: Boolean = js.native
  def passed_=(`val`: Boolean): Unit = js.native
  
  /*
    * Call it to scroll to the page top.
    */
  def scrollToTop(): Unit = js.native
  
  def setWasShown(`val`: Boolean): Unit = js.native
  
  /*
    * Time in seconds end-user spent on this page
    */
  var timeSpent: Double = js.native
  
  /*
    * The visible index of the page. It has values from 0 to visible page count - 1.
    */
  def visibleIndex: Double = js.native
  def visibleIndex_=(`val`: Double): Unit = js.native
  
  /*
    * The property returns true, if the page has been shown to the end-user.
    */
  def wasShown: Boolean = js.native
}
