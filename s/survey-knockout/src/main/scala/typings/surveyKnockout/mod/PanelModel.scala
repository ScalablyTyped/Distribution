package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.ISurveyElement because Already inherited
- typings.surveyKnockout.mod.IConditionRunner because Already inherited
- typings.surveyKnockout.mod.ITitleOwner because var conflicts: isRequireTextAfterTitle, isRequireTextBeforeTitle, isRequireTextOnStart, locTitle, name, requiredText. Inlined no
- typings.surveyKnockout.mod.IElement because var conflicts: containsErrors, isPage, isPanel, isReadOnly, isVisible, name, parent, visible. Inlined renderWidth, width, minWidth, maxWidth, rightIndent, startWithNewLine */ @JSImport("survey-knockout", "PanelModel")
@js.native
class PanelModel () extends PanelModelBase {
  def this(name: String) = this()
  
  def cancelPreview(): Unit = js.native
  
  def clearOnDeletingContainer(): Unit = js.native
  
  /**
    * Collapse the Panel
    * @see state
    */
  def collapse(): Unit = js.native
  
  val contentId: String = js.native
  
  /**
    * Expand the Panel
    * @see state
    */
  def expand(): Unit = js.native
  
  val hasEditButton: Boolean = js.native
  
  /**
    * The left indent. Set this property to increase the panel left indent.
    */
  var indent: Double = js.native
  
  /**
    * The inner indent. Set this property to increase the panel content margin.
    */
  var innerIndent: Double = js.native
  
  var innerPaddingLeft: String = js.native
  
  /**
    * Returns true if the Panel is in the collapsed state
    * @see state
    * @see collapse
    * @see isExpanded
    */
  val isCollapsed: Boolean = js.native
  
  /**
    * Returns true if the Panel is in the expanded state
    * @see state
    * @see expand
    * @see isCollapsed
    */
  val isExpanded: Boolean = js.native
  
  var maxWidth: js.UndefOr[String] = js.native
  
  var minWidth: js.UndefOr[String] = js.native
  
  /**
    * Move panel to a new container Page/Panel. Add as a last element if insertBefore parameter is not used or inserted into the given index,
    * if insert parameter is number, or before the given element, if the insertBefore parameter is a question or panel
    * @param container Page or Panel to where a question is relocated.
    * @param insertBefore Use it if you want to set the panel to a specific position. You may use a number (use 0 to insert int the beginning) or element, if you want to insert before this element.
    */
  def moveTo(container: IPanel): Boolean = js.native
  def moveTo(container: IPanel, insertBefore: js.Any): Boolean = js.native
  
  /**
    * The property returns the question number. If question is invisible then it returns empty string.
    * If visibleIndex is 1, then no is 2, or 'B' if survey.questionStartIndex is 'A'.
    * @see SurveyModel.questionStartIndex
    */
  val no: String = js.native
  
  var paddingLeft: String = js.native
  
  var paddingRight: String = js.native
  
  /**
    * Get/set the page where the panel is located.
    */
  var page: IPage = js.native
  
  /**
    * Gets or sets the first question index for elements inside the panel. The first question index is '1.' by default and it is taken from survey.questionStartIndex property.
    * You may start it from '100' or from 'A', by setting '100' or 'A' to this property.
    * You can set the start index to "(1)" or "# A)" or "a)" to render question number as (1), # A) and a) accordingly.
    * @see survey.questionStartIndex
    */
  var questionStartIndex: String = js.native
  
  var renderWidth: String = js.native
  
  /**
    * The right indent of the Panel.
    */
  var rightIndent: Double = js.native
  
  /* protected */ def setNo(visibleIndex: Double): Unit = js.native
  
  /**
    * Set showNumber to true to start showing the number for this panel.
    * @see visibleIndex
    */
  var showNumber: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies how the elements numbers inside panel are displayed.
    *
    * The following options are available:
    *
    * - `default` - display questions numbers as defined in parent panel or survey
    * - `onpanel` - display questions numbers, start numbering from beginning of this page
    * - `off` - turn off the numbering for questions titles
    * @see showNumber
    */
  var showQuestionNumbers: String = js.native
  
  /**
    * The Panel renders on the new line if the property is true. If the property is false, the panel tries to render on the same line/row with a previous question/panel.
    */
  var startWithNewLine: Boolean = js.native
  
  /**
    * Set this property to "collapsed" to render only Panel title and expanded button and to "expanded" to render the collapsed button in the Panel caption
    */
  var state: String = js.native
  
  def stateChangedCallback(): Unit = js.native
  
  /**
    * Returns the visible index of the panel in the survey. Commonly it is -1 and it doesn't show.
    * You have to set showNumber to true to show index/numbering for the Panel
    * @see showNumber
    */
  val visibleIndex: Double = js.native
  
  /**
    * The Panel width.
    */
  var width: String = js.native
}
