package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.ISurveyElement because Already inherited
- typings.surveyKnockout.mod.IConditionRunner because Already inherited
- typings.surveyKnockout.mod.IElement because var conflicts: containsErrors, isPage, isPanel, isReadOnly, isVisible, name, parent, visible. Inlined renderWidth, width, rightIndent, startWithNewLine */ @JSImport("survey-knockout", "PanelModel")
@js.native
class PanelModel () extends PanelModelBase {
  def this(name: String) = this()
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
  var paddingLeft: String = js.native
  var paddingRight: String = js.native
  /**
    * Get/set the page where the panel is located.
    */
  var page: IPage = js.native
  var renderWidth: String = js.native
  /**
    * The right indent of the Panel.
    */
  var rightIndent: Double = js.native
  /**
    * The Panel renders on the new line if the property is true. If the property is false, the panel tries to render on the same line/row with a previous question/panel.
    */
  var startWithNewLine: Boolean = js.native
  /**
    * Set this property to "collapsed" to render only Panel title and expanded button and to "expanded" to render the collapsed button in the Panel caption
    */
  var state: String = js.native
  /**
    * The Panel width.
    */
  var width: String = js.native
  def clearOnDeletingContainer(): Unit = js.native
  /**
    * Collapse the Panel
    * @see state
    */
  def collapse(): Unit = js.native
  /**
    * Expand the Panel
    * @see state
    */
  def expand(): Unit = js.native
  /**
    * Move panel to a new container Page/Panel. Add as a last element if insertBefore parameter is not used or inserted into the given index,
    * if insert parameter is number, or before the given element, if the insertBefore parameter is a question or panel
    * @param container Page or Panel to where a question is relocated.
    * @param insertBefore Use it if you want to set the panel to a specific position. You may use a number (use 0 to insert int the beginning) or element, if you want to insert before this element.
    */
  def moveTo(container: IPanel): Boolean = js.native
  def moveTo(container: IPanel, insertBefore: js.Any): Boolean = js.native
  def stateChangedCallback(): Unit = js.native
}

