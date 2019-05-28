package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unsubscribable extends js.Object {
  def unsubscribe(): js.Any | scala.Unit
}

object Unsubscribable {
  @scala.inline
  def apply(unsubscribe: () => js.Any | scala.Unit): Unsubscribable = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[Unsubscribable]
  }
}

