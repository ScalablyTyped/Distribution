package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XboxLiveSocketKind extends js.Object

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveSocketKind")
@js.native
object XboxLiveSocketKind extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait datagram
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveSocketKind
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveSocketKind
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait stream
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveSocketKind
  
  val datagram: datagram with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val stream: stream with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveSocketKind with java.lang.String
  ] = js.native
}

