package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.ToolbarState")
@js.native
class ToolbarState () extends js.Object {
  /** Gets the Viz object associated with the toolbar. */
  def getViz(): Viz = js.native
  /**
           * Gets a value indicating whether the specified toolbar button is enabled.
           * The supported buttons are defined in the ToobarButtonName enum.
           * Currently, only Undo and Redo are supported.
           * Checking this property with a toolbar button that is not supported causes an InvalidToolbarButtonName error.
           */
  def isButtonEnabled(toolbarButtonName: ToolbarButtonName): scala.Boolean = js.native
}

