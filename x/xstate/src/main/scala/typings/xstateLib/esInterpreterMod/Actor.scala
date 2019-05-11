package typings
package xstateLib.esInterpreterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actor extends js.Object {
  @JSName("send")
  var send_Original: xstateLib.esTypesMod.Sender[_] = js.native
  var stop: js.Function0[scala.Unit] | scala.Unit = js.native
  def send(event: xstateLib.esTypesMod.Event[_]): scala.Unit = js.native
}

