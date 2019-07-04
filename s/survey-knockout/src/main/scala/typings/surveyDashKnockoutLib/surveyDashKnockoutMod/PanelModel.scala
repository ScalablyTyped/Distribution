package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- surveyDashKnockoutLib.surveyDashKnockoutMod.IElement because var conflicts: isPage, isPanel, isReadOnly, isVisible, name, parent, visible. Inlined renderWidth, width, rightIndent, startWithNewLine */ @JSImport("survey-knockout", "PanelModel")
@js.native
class PanelModel () extends PanelModelBase {
  def this(name: java.lang.String) = this()
  /**
    * The left indent. Set this property to increase the panel left indent.
    */
  var indent: scala.Double = js.native
  /**
    * The inner indent. Set this property to increase the panel content margin.
    */
  var innerIndent: scala.Double = js.native
  var innerPaddingLeft: java.lang.String = js.native
  /**
    * Returns true if the Panel is in the collapsed state
    * @see state
    * @see collapse
    * @see isExpanded
    */
  val isCollapsed: scala.Boolean = js.native
  /**
    * Returns true if the Panel is in the expanded state
    * @see state
    * @see expand
    * @see isCollapsed
    */
  val isExpanded: scala.Boolean = js.native
  var paddingLeft: java.lang.String = js.native
  var paddingRight: java.lang.String = js.native
  /**
    * Get/set the page where the panel is located.
    */
  var page: IPage = js.native
  var renderWidth: java.lang.String = js.native
  /**
    * The right indent of the Panel.
    */
  var rightIndent: scala.Double = js.native
  /**
    * The Panel renders on the new line if the property is true. If the property is false, the panel tries to render on the same line/row with a previous question/panel.
    */
  var startWithNewLine: scala.Boolean = js.native
  /**
    * Set this property to "collapsed" to render only Panel title and expanded button and to "expanded" to render the collapsed button in the Panel caption
    */
  var state: java.lang.String = js.native
  /**
    * The Panel width.
    */
  var width: java.lang.String = js.native
  /**
    * Collapse the Panel
    * @see state
    */
  def collapse(): scala.Unit = js.native
  /**
    * Expand the Panel
    * @see state
    */
  def expand(): scala.Unit = js.native
  /**
    * Move panel to a new container Page/Panel. Add as a last element if insertBefore parameter is not used or inserted into the given index,
    * if insert parameter is number, or before the given element, if the insertBefore parameter is a question or panel
    * @param container Page or Panel to where a question is relocated.
    * @param insertBefore Use it if you want to set the panel to a specific position. You may use a number (use 0 to insert int the beginning) or element, if you want to insert before this element.
    */
  def moveTo(container: IPanel): scala.Boolean = js.native
  def moveTo(container: IPanel, insertBefore: js.Any): scala.Boolean = js.native
  def stateChangedCallback(): scala.Unit = js.native
}

