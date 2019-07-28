package typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XboxLiveQualityOfServiceMeasurementStatus extends js.Object

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus")
@js.native
object XboxLiveQualityOfServiceMeasurementStatus extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait canceled extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait inProgress extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait inProgressWithProvisionalResults extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait localSystemNotAuthorized extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait noCompatibleNetworkPaths extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait noLocalNetworks extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait notStarted extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait refusedDueToConfiguration extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait remoteSystemNotAuthorized extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait succeeded extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait timedOut extends XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait unexpectedInternalError extends XboxLiveQualityOfServiceMeasurementStatus
  
  /* 7 */ val canceled: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMeasurementStatus.canceled with Double = js.native
  /* 1 */ val inProgress: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMeasurementStatus.inProgress with Double = js.native
  /* 2 */ val inProgressWithProvisionalResults: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMeasurementStatus.inProgressWithProvisionalResults with Double = js.native
  /* 6 */ val localSystemNotAuthorized: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMeasurementStatus.localSystemNotAuthorized with Double = js.native
  /* 5 */ val noCompatibleNetworkPaths: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMeasurementStatus.noCompatibleNetworkPaths with Double = js.native
  /* 4 */ val noLocalNetworks: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMeasurementStatus.noLocalNetworks with Double = js.native
  /* 0 */ val notStarted: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMeasurementStatus.notStarted with Double = js.native
  /* 10 */ val refusedDueToConfiguration: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMeasurementStatus.refusedDueToConfiguration with Double = js.native
  /* 9 */ val remoteSystemNotAuthorized: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMeasurementStatus.remoteSystemNotAuthorized with Double = js.native
  /* 3 */ val succeeded: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMeasurementStatus.succeeded with Double = js.native
  /* 8 */ val timedOut: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMeasurementStatus.timedOut with Double = js.native
  /* 11 */ val unexpectedInternalError: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMeasurementStatus.unexpectedInternalError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XboxLiveQualityOfServiceMeasurementStatus with Double] = js.native
}

