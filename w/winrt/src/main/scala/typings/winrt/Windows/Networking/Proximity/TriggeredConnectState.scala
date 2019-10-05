package typings.winrt.Windows.Networking.Proximity

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
  
  /* 4 */ val canceled: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.canceled with Double = js.native
  /* 3 */ val completed: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.completed with Double = js.native
  /* 2 */ val connecting: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.connecting with Double = js.native
  /* 5 */ val failed: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.failed with Double = js.native
  /* 1 */ val listening: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.listening with Double = js.native
  /* 0 */ val peerFound: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.peerFound with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TriggeredConnectState with Double] = js.native
}

