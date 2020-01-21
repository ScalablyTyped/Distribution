package typings.winrtUwp.Windows.Networking.XboxLive

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XboxLiveQualityOfServiceMeasurementStatus with Double] = js.native
  /* 7 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 1 */ @js.native
  object inProgress extends TopLevel[inProgress with Double]
  
  /* 2 */ @js.native
  object inProgressWithProvisionalResults extends TopLevel[inProgressWithProvisionalResults with Double]
  
  /* 6 */ @js.native
  object localSystemNotAuthorized extends TopLevel[localSystemNotAuthorized with Double]
  
  /* 5 */ @js.native
  object noCompatibleNetworkPaths extends TopLevel[noCompatibleNetworkPaths with Double]
  
  /* 4 */ @js.native
  object noLocalNetworks extends TopLevel[noLocalNetworks with Double]
  
  /* 0 */ @js.native
  object notStarted extends TopLevel[notStarted with Double]
  
  /* 10 */ @js.native
  object refusedDueToConfiguration extends TopLevel[refusedDueToConfiguration with Double]
  
  /* 9 */ @js.native
  object remoteSystemNotAuthorized extends TopLevel[remoteSystemNotAuthorized with Double]
  
  /* 3 */ @js.native
  object succeeded extends TopLevel[succeeded with Double]
  
  /* 8 */ @js.native
  object timedOut extends TopLevel[timedOut with Double]
  
  /* 11 */ @js.native
  object unexpectedInternalError extends TopLevel[unexpectedInternalError with Double]
  
}

