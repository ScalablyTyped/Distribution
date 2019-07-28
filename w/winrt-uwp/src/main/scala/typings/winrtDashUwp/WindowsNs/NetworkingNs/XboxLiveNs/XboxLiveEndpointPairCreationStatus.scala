package typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs

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
  sealed trait canceled extends XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait localSystemNotAuthorized extends XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait noCompatibleNetworkPaths extends XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait noLocalNetworks extends XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait refusedDueToConfiguration extends XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait remoteSystemNotAuthorized extends XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait succeeded extends XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait timedOut extends XboxLiveEndpointPairCreationStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait unexpectedInternalError extends XboxLiveEndpointPairCreationStatus
  
  /* 4 */ val canceled: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus.canceled with Double = js.native
  /* 3 */ val localSystemNotAuthorized: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus.localSystemNotAuthorized with Double = js.native
  /* 2 */ val noCompatibleNetworkPaths: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus.noCompatibleNetworkPaths with Double = js.native
  /* 1 */ val noLocalNetworks: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus.noLocalNetworks with Double = js.native
  /* 7 */ val refusedDueToConfiguration: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus.refusedDueToConfiguration with Double = js.native
  /* 6 */ val remoteSystemNotAuthorized: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus.remoteSystemNotAuthorized with Double = js.native
  /* 0 */ val succeeded: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus.succeeded with Double = js.native
  /* 5 */ val timedOut: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus.timedOut with Double = js.native
  /* 8 */ val unexpectedInternalError: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairCreationStatus.unexpectedInternalError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XboxLiveEndpointPairCreationStatus with Double] = js.native
}

