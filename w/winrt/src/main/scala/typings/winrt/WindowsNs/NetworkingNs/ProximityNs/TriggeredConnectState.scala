package typings.winrt.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TriggeredConnectState extends js.Object

@JSGlobal("Windows.Networking.Proximity.TriggeredConnectState")
@js.native
object TriggeredConnectState extends js.Object {
  @js.native
  sealed trait canceled extends TriggeredConnectState
  
  @js.native
  sealed trait completed extends TriggeredConnectState
  
  @js.native
  sealed trait connecting extends TriggeredConnectState
  
  @js.native
  sealed trait failed extends TriggeredConnectState
  
  @js.native
  sealed trait listening extends TriggeredConnectState
  
  @js.native
  sealed trait peerFound extends TriggeredConnectState
  
  /* 4 */ val canceled: typings.winrt.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState.canceled with Double = js.native
  /* 3 */ val completed: typings.winrt.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState.completed with Double = js.native
  /* 2 */ val connecting: typings.winrt.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState.connecting with Double = js.native
  /* 5 */ val failed: typings.winrt.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState.failed with Double = js.native
  /* 1 */ val listening: typings.winrt.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState.listening with Double = js.native
  /* 0 */ val peerFound: typings.winrt.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState.peerFound with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TriggeredConnectState with Double] = js.native
}

