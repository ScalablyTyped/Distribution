package typings.winrtUwp.Windows.Networking.XboxLive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait XboxLiveQualityOfServiceMetric extends StObject
/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric")
@js.native
object XboxLiveQualityOfServiceMetric extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait averageInboundBitsPerSecond
    extends StObject
       with XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait averageLatencyInMilliseconds
    extends StObject
       with XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait averageOutboundBitsPerSecond
    extends StObject
       with XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait maxInboundBitsPerSecond
    extends StObject
       with XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait maxLatencyInMilliseconds
    extends StObject
       with XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait maxOutboundBitsPerSecond
    extends StObject
       with XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait minInboundBitsPerSecond
    extends StObject
       with XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait minLatencyInMilliseconds
    extends StObject
       with XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait minOutboundBitsPerSecond
    extends StObject
       with XboxLiveQualityOfServiceMetric
}
