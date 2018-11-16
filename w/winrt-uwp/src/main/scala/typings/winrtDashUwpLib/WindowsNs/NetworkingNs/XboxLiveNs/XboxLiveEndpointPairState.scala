package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XboxLiveEndpointPairState extends js.Object

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairState")
@js.native
object XboxLiveEndpointPairState extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait creatingInbound
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait creatingOutbound
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait deleted
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait deletingLocally
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait invalid
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait ready
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait remoteEndpointTerminating
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState
  
  val creatingInbound: creatingInbound with java.lang.String = js.native
  val creatingOutbound: creatingOutbound with java.lang.String = js.native
  val deleted: deleted with java.lang.String = js.native
  val deletingLocally: deletingLocally with java.lang.String = js.native
  val invalid: invalid with java.lang.String = js.native
  val ready: ready with java.lang.String = js.native
  val remoteEndpointTerminating: remoteEndpointTerminating with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState with java.lang.String
  ] = js.native
}

