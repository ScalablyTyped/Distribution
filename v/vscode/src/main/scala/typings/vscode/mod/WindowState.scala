package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowState extends js.Object {
  /**
    * Whether the current window is focused.
    */
  val focused: Boolean
}

object WindowState {
  @scala.inline
  def apply(focused: Boolean): WindowState = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowState]
  }
}

