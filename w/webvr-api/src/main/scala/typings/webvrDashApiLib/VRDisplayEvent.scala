package typings
package webvrDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRDisplayEvent
  extends stdLib.Event {
  val display: VRDisplay = js.native
  val reason: VRDisplayEventReason_dt_alias | scala.Null = js.native
}

@JSGlobal("VRDisplayEvent")
@js.native
class VRDisplayEventCls protected () extends VRDisplayEvent {
  def this(`type`: java.lang.String, eventInitDict: VRDisplayEventInit) = this()
}

@JSGlobal("VRDisplayEvent")
@js.native
object VRDisplayEvent
  extends org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ VRDisplayEventInit, VRDisplayEvent]

