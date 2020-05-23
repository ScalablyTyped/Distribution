package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarState extends js.Object {
  /** Gets the Viz object associated with the toolbar. */
  def getViz(): Viz
  /**
    * Gets a value indicating whether the specified toolbar button is enabled.
    * The supported buttons are defined in the ToobarButtonName enum.
    * Currently, only Undo and Redo are supported.
    * Checking this property with a toolbar button that is not supported causes an InvalidToolbarButtonName error.
    */
  def isButtonEnabled(toolbarButtonName: ToolbarButtonName): Boolean
}

object ToolbarState {
  @scala.inline
  def apply(getViz: () => Viz, isButtonEnabled: ToolbarButtonName => Boolean): ToolbarState = {
    val __obj = js.Dynamic.literal(getViz = js.Any.fromFunction0(getViz), isButtonEnabled = js.Any.fromFunction1(isButtonEnabled))
    __obj.asInstanceOf[ToolbarState]
  }
}

