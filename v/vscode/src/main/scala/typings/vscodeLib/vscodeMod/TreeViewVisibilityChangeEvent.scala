package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewVisibilityChangeEvent extends js.Object {
  /**
  		 * `true` if the [tree view](#TreeView) is visible otherwise `false`.
  		 */
  val visible: scala.Boolean
}

object TreeViewVisibilityChangeEvent {
  @scala.inline
  def apply(visible: scala.Boolean): TreeViewVisibilityChangeEvent = {
    val __obj = js.Dynamic.literal(visible = visible)
  
    __obj.asInstanceOf[TreeViewVisibilityChangeEvent]
  }
}

