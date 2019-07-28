package typings.winrtDashUwp.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AllJoynTrafficType extends js.Object

/** Defines values used to indicate the type of data carried in session traffic. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynTrafficType")
@js.native
object AllJoynTrafficType extends js.Object {
  /** Message traffic. */
  @js.native
  sealed trait messages extends AllJoynTrafficType
  
  /** Session carries a reliable byte stream. */
  @js.native
  sealed trait rawReliable extends AllJoynTrafficType
  
  /** Unreliable (lossy) byte stream. */
  @js.native
  sealed trait rawUnreliable extends AllJoynTrafficType
  
  /** Traffic type currently unknown. */
  @js.native
  sealed trait unknown extends AllJoynTrafficType
  
  /* 1 */ val messages: typings.winrtDashUwp.WindowsNs.DevicesNs.AllJoynNs.AllJoynTrafficType.messages with Double = js.native
  /* 3 */ val rawReliable: typings.winrtDashUwp.WindowsNs.DevicesNs.AllJoynNs.AllJoynTrafficType.rawReliable with Double = js.native
  /* 2 */ val rawUnreliable: typings.winrtDashUwp.WindowsNs.DevicesNs.AllJoynNs.AllJoynTrafficType.rawUnreliable with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.DevicesNs.AllJoynNs.AllJoynTrafficType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AllJoynTrafficType with Double] = js.native
}

