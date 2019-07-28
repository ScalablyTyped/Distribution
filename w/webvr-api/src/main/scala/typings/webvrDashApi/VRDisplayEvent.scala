package typings.webvrDashApi

import org.scalablytyped.runtime.Instantiable2
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRDisplayEvent extends Event {
  val display: VRDisplay = js.native
  val reason: VRDisplayEventReason_dt_alias | Null = js.native
}

@JSGlobal("VRDisplayEvent")
@js.native
class VRDisplayEventCls protected () extends VRDisplayEvent {
  def this(`type`: String, eventInitDict: VRDisplayEventInit) = this()
}

@JSGlobal("VRDisplayEvent")
@js.native
object VRDisplayEvent extends Instantiable2[/* type */ String, /* eventInitDict */ VRDisplayEventInit, VRDisplayEvent]

