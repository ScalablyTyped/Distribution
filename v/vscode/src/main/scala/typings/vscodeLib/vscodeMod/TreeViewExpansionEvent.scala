package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewExpansionEvent[T] extends js.Object {
  /**
  		 * Element that is expanded or collapsed.
  		 */
  val element: T
}

object TreeViewExpansionEvent {
  @scala.inline
  def apply[T](element: T): TreeViewExpansionEvent[T] = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TreeViewExpansionEvent[T]]
  }
}

