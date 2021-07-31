package typings.winrtUwp.Windows.Networking.XboxLive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait XboxLiveQualityOfServiceMeasurementStatus extends StObject
/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus")
@js.native
object XboxLiveQualityOfServiceMeasurementStatus extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait canceled
    extends StObject
       with XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait inProgress
    extends StObject
       with XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait inProgressWithProvisionalResults
    extends StObject
       with XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait localSystemNotAuthorized
    extends StObject
       with XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait noCompatibleNetworkPaths
    extends StObject
       with XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait noLocalNetworks
    extends StObject
       with XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait notStarted
    extends StObject
       with XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait refusedDueToConfiguration
    extends StObject
       with XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait remoteSystemNotAuthorized
    extends StObject
       with XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait succeeded
    extends StObject
       with XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait timedOut
    extends StObject
       with XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait unexpectedInternalError
    extends StObject
       with XboxLiveQualityOfServiceMeasurementStatus
}
