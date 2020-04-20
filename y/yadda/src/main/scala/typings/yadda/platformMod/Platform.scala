package typings.yadda.platformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platform extends js.Object {
  def get_container(): js.Any
  def is_browser(): Boolean
  def is_karma(): Boolean
   // Window | NodeJS.Global | Phantom
  def is_node(): Boolean
  def is_phantom(): Boolean
}

object Platform {
  @scala.inline
  def apply(
    get_container: () => js.Any,
    is_browser: () => Boolean,
    is_karma: () => Boolean,
    is_node: () => Boolean,
    is_phantom: () => Boolean
  ): Platform = {
    val __obj = js.Dynamic.literal(get_container = js.Any.fromFunction0(get_container), is_browser = js.Any.fromFunction0(is_browser), is_karma = js.Any.fromFunction0(is_karma), is_node = js.Any.fromFunction0(is_node), is_phantom = js.Any.fromFunction0(is_phantom))
    __obj.asInstanceOf[Platform]
  }
}

