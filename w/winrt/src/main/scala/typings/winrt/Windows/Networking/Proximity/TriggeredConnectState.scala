package typings.winrt.Windows.Networking.Proximity

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.canceled
import typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.completed
import typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.connecting
import typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.failed
import typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.listening
import typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.peerFound
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TriggeredConnectState with Double] = js.native
  /* 4 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 3 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 2 */ @js.native
  object connecting extends TopLevel[connecting with Double]
  
  /* 5 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 1 */ @js.native
  object listening extends TopLevel[listening with Double]
  
  /* 0 */ @js.native
  object peerFound extends TopLevel[peerFound with Double]
  
}

