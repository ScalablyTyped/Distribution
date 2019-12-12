package typings.winrtDashUwp.Windows.Networking.XboxLive

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.canceled
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.localSystemNotAuthorized
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.noCompatibleNetworkPaths
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.noLocalNetworks
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.refusedDueToConfiguration
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.remoteSystemNotAuthorized
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.succeeded
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.timedOut
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.unexpectedInternalError
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XboxLiveEndpointPairCreationStatus with Double] = js.native
  /* 4 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 3 */ @js.native
  object localSystemNotAuthorized extends TopLevel[localSystemNotAuthorized with Double]
  
  /* 2 */ @js.native
  object noCompatibleNetworkPaths extends TopLevel[noCompatibleNetworkPaths with Double]
  
  /* 1 */ @js.native
  object noLocalNetworks extends TopLevel[noLocalNetworks with Double]
  
  /* 7 */ @js.native
  object refusedDueToConfiguration extends TopLevel[refusedDueToConfiguration with Double]
  
  /* 6 */ @js.native
  object remoteSystemNotAuthorized extends TopLevel[remoteSystemNotAuthorized with Double]
  
  /* 0 */ @js.native
  object succeeded extends TopLevel[succeeded with Double]
  
  /* 5 */ @js.native
  object timedOut extends TopLevel[timedOut with Double]
  
  /* 8 */ @js.native
  object unexpectedInternalError extends TopLevel[unexpectedInternalError with Double]
  
}

