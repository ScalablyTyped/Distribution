package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.IShortcutText because Already inherited
- typings.surveyKnockout.mod.ISurveyElement because Already inherited
- typings.surveyKnockout.mod.IConditionRunner because Already inherited
- typings.surveyKnockout.mod.IElement because var conflicts: containsErrors, isCollapsed, isExpanded, isPage, isPanel, isReadOnly, isVisible, maxWidth, minWidth, name, parent, renderWidth, rightIndent, shortcutText, skeletonComponentName, visible, width. Inlined startWithNewLine */ @JSImport("survey-knockout", "PanelModel")
@js.native
open class PanelModel () extends PanelModelBase {
  def this(name: String) = this()
  
  /*
    * The Panel toolbar gets adaptive if the property is set to true.
    */
  def allowAdaptiveActions: Boolean = js.native
  def allowAdaptiveActions_=(`val`: Boolean): Unit = js.native
  
  def cancelPreview(): Unit = js.native
  
  def clearOnDeletingContainer(): Unit = js.native
  
  def contentId: String = js.native
  
  var focusIn: Any = js.native
  
  def footerActions: Any = js.native
  
  var footerToolbarValue: Any = js.native
  
  def getContainerCss(): String = js.native
  
  /* protected */ def getCssError(cssClasses: Any): String = js.native
  
  def getFooterToolbar(): ActionContainer[Action] = js.native
  
  def hasEditButton: Boolean = js.native
  
  /*
    * The inner indent. Set this property to increase the panel content margin.
    */
  def innerIndent: Double = js.native
  def innerIndent_=(`val`: Double): Unit = js.native
  
  def innerPaddingLeft: String = js.native
  def innerPaddingLeft_=(`val`: String): Unit = js.native
  
  @JSName("isPanel")
  def isPanel_MPanelModel: Boolean = js.native
  
  def moveTo(container: IPanel): Boolean = js.native
  def moveTo(container: IPanel, insertBefore: Any): Boolean = js.native
  
  /*
    * The property returns the question number. If question is invisible then it returns empty string.
    * If visibleIndex is 1, then no is 2, or 'B' if survey.questionStartIndex is 'A'.
    */
  @JSName("no")
  def no_MPanelModel: String = js.native
  
  /*
    * Get/set the page where the panel is located.
    */
  def page: IPage = js.native
  def page_=(`val`: IPage): Unit = js.native
  
  /*
    * Gets or sets the first question index for elements inside the panel. The first question index is '1.' by default and it is taken from survey.questionStartIndex property.
    * You may start it from '100' or from 'A', by setting '100' or 'A' to this property.
    * You can set the start index to "(1)" or "# A)" or "a)" to render question number as (1), # A) and a) accordingly.
    */
  def questionStartIndex: String = js.native
  def questionStartIndex_=(`val`: String): Unit = js.native
  
  /* protected */ def setNo(visibleIndex: Double): Unit = js.native
  
  /*
    * Set showNumber to true to start showing the number for this panel.
    */
  def showNumber: Boolean = js.native
  def showNumber_=(`val`: Boolean): Unit = js.native
  
  /*
    * Gets or sets a value that specifies how the elements numbers inside panel are displayed.
    * 
    * The following options are available:
    * 
    * - `default` - display questions numbers as defined in parent panel or survey
    * - `onpanel` - display questions numbers, start numbering from beginning of this page
    * - `off` - turn off the numbering for questions titles
    */
  def showQuestionNumbers: String = js.native
  def showQuestionNumbers_=(`val`: String): Unit = js.native
  
  /*
    * The Panel renders on the new line if the property is true. If the property is false, the panel tries to render on the same line/row with a previous question/panel.
    */
  def startWithNewLine: Boolean = js.native
  def startWithNewLine_=(`val`: Boolean): Unit = js.native
  @JSName("startWithNewLine")
  var startWithNewLine_FPanelModel: Boolean = js.native
  
  /*
    * Returns the visible index of the panel in the survey. Commonly it is -1 and it doesn't show.
    * You have to set showNumber to true to show index/numbering for the Panel
    */
  def visibleIndex: Double = js.native
}
