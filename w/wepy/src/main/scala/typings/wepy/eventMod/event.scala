package typings.wepy.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait event extends js.Object {
  var active: Boolean
  @JSName("$destroy")
  def $destroy(): Unit
  @JSName("$transfor")
  def $transfor(wxevent: js.Array[_]): Unit
}

object event {
  @scala.inline
  def apply($destroy: () => Unit, $transfor: js.Array[_] => Unit, active: Boolean): event = {
    val __obj = js.Dynamic.literal($destroy = js.Any.fromFunction0($destroy), $transfor = js.Any.fromFunction1($transfor), active = active.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[event]
  }
}

