package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XboxLiveEndpointPairCreationStatus extends js.Object

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus")
@js.native
object XboxLiveEndpointPairCreationStatus extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait canceled
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait localSystemNotAuthorized
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait noCompatibleNetworkPaths
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait noLocalNetworks
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait refusedDueToConfiguration
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait remoteSystemNotAuthorized
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait succeeded
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait timedOut
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait unexpectedInternalError
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus
  
  val canceled: canceled with java.lang.String = js.native
  val localSystemNotAuthorized: localSystemNotAuthorized with java.lang.String = js.native
  val noCompatibleNetworkPaths: noCompatibleNetworkPaths with java.lang.String = js.native
  val noLocalNetworks: noLocalNetworks with java.lang.String = js.native
  val refusedDueToConfiguration: refusedDueToConfiguration with java.lang.String = js.native
  val remoteSystemNotAuthorized: remoteSystemNotAuthorized with java.lang.String = js.native
  val succeeded: succeeded with java.lang.String = js.native
  val timedOut: timedOut with java.lang.String = js.native
  val unexpectedInternalError: unexpectedInternalError with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus with java.lang.String
  ] = js.native
}

