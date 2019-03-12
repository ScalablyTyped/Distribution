package typings
package wepyLib.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait event extends js.Object {
  var active: scala.Boolean
  @JSName("$destroy")
  def $destroy(): scala.Unit
  @JSName("$transfor")
  def $transfor(wxevent: js.Array[_]): scala.Unit
}

object event {
  @scala.inline
  def apply($destroy: () => scala.Unit, $transfor: js.Array[_] => scala.Unit, active: scala.Boolean): event = {
    val __obj = js.Dynamic.literal($destroy = js.Any.fromFunction0($destroy), $transfor = js.Any.fromFunction1($transfor), active = active)
  
    __obj.asInstanceOf[event]
  }
}

