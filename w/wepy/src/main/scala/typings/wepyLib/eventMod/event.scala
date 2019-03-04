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
  def apply(
    $destroy: js.Function0[scala.Unit],
    $transfor: js.Function1[js.Array[_], scala.Unit],
    active: scala.Boolean
  ): event = {
    val __obj = js.Dynamic.literal($destroy = $destroy, $transfor = $transfor, active = active)
  
    __obj.asInstanceOf[event]
  }
}

