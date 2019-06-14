package typings
package winrtLib.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TriggeredConnectState extends js.Object

@JSGlobal("Windows.Networking.Proximity.TriggeredConnectState")
@js.native
object TriggeredConnectState extends js.Object {
  @js.native
  sealed trait canceled
    extends winrtLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState
  
  @js.native
  sealed trait completed
    extends winrtLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState
  
  @js.native
  sealed trait connecting
    extends winrtLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState
  
  @js.native
  sealed trait failed
    extends winrtLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState
  
  @js.native
  sealed trait listening
    extends winrtLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState
  
  @js.native
  sealed trait peerFound
    extends winrtLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState
  
  /* 4 */ val canceled: canceled with scala.Double = js.native
  /* 3 */ val completed: completed with scala.Double = js.native
  /* 2 */ val connecting: connecting with scala.Double = js.native
  /* 5 */ val failed: failed with scala.Double = js.native
  /* 1 */ val listening: listening with scala.Double = js.native
  /* 0 */ val peerFound: peerFound with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState with scala.Double
  ] = js.native
}

