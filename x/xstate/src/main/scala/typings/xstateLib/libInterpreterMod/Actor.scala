package typings
package xstateLib.libInterpreterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actor extends js.Object {
  @JSName("send")
  var send_Original: xstateLib.libTypesMod.Sender[_] = js.native
  var stop: js.Function0[scala.Unit] | scala.Unit = js.native
  def send(event: xstateLib.libTypesMod.Event[_]): scala.Unit = js.native
}

