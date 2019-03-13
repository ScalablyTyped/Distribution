package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowState extends js.Object {
  /**
  		 * Whether the current window is focused.
  		 */
  val focused: scala.Boolean
}

object WindowState {
  @scala.inline
  def apply(focused: scala.Boolean): WindowState = {
    val __obj = js.Dynamic.literal(focused = focused)
  
    __obj.asInstanceOf[WindowState]
  }
}

