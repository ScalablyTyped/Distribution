package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

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
  sealed trait messages
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynTrafficType
  
  /** Session carries a reliable byte stream. */
  @js.native
  sealed trait rawReliable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynTrafficType
  
  /** Unreliable (lossy) byte stream. */
  @js.native
  sealed trait rawUnreliable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynTrafficType
  
  /** Traffic type currently unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynTrafficType
  
  /* 1 */ val messages: messages with scala.Double = js.native
  /* 3 */ val rawReliable: rawReliable with scala.Double = js.native
  /* 2 */ val rawUnreliable: rawUnreliable with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynTrafficType with scala.Double
  ] = js.native
}

