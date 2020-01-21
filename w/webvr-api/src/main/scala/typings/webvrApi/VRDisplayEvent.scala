package typings.webvrApi

import org.scalablytyped.runtime.Instantiable2
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRDisplayEvent extends Event_ {
  val display: VRDisplay = js.native
  val reason: VRDisplayEventReasonDtAlias | Null = js.native
}

@JSGlobal("VRDisplayEvent")
@js.native
object VRDisplayEvent extends Instantiable2[/* type */ String, /* eventInitDict */ VRDisplayEventInit, VRDisplayEvent]

