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
  
}

