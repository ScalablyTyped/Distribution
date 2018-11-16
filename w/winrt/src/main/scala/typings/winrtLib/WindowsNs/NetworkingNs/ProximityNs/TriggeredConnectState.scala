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
  
  val canceled: canceled with java.lang.String = js.native
  val completed: completed with java.lang.String = js.native
  val connecting: connecting with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val listening: listening with java.lang.String = js.native
  val peerFound: peerFound with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState with java.lang.String
  ] = js.native
}

