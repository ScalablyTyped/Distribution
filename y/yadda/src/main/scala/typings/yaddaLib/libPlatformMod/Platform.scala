package typings
package yaddaLib.libPlatformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platform extends js.Object {
  def get_container(): js.Any
  def is_browser(): scala.Boolean
  def is_karma(): scala.Boolean
   // Window | NodeJS.Global | Phantom
  def is_node(): scala.Boolean
  def is_phantom(): scala.Boolean
}

object Platform {
  @scala.inline
  def apply(
    get_container: () => js.Any,
    is_browser: () => scala.Boolean,
    is_karma: () => scala.Boolean,
    is_node: () => scala.Boolean,
    is_phantom: () => scala.Boolean
  ): Platform = {
    val __obj = js.Dynamic.literal(get_container = js.Any.fromFunction0(get_container), is_browser = js.Any.fromFunction0(is_browser), is_karma = js.Any.fromFunction0(is_karma), is_node = js.Any.fromFunction0(is_node), is_phantom = js.Any.fromFunction0(is_phantom))
  
    __obj.asInstanceOf[Platform]
  }
}

