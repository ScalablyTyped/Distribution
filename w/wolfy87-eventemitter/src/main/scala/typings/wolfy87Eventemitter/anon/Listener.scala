package typings.wolfy87Eventemitter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener extends js.Object {
  var listener: js.Function
}

object Listener {
  @scala.inline
  def apply(listener: js.Function): Listener = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
}

