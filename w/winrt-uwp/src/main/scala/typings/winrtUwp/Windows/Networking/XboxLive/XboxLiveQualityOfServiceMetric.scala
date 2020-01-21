package typings.winrtUwp.Windows.Networking.XboxLive

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XboxLiveQualityOfServiceMetric extends js.Object

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric")
@js.native
object XboxLiveQualityOfServiceMetric extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait averageInboundBitsPerSecond extends XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait averageLatencyInMilliseconds extends XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait averageOutboundBitsPerSecond extends XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait maxInboundBitsPerSecond extends XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait maxLatencyInMilliseconds extends XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait maxOutboundBitsPerSecond extends XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait minInboundBitsPerSecond extends XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait minLatencyInMilliseconds extends XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait minOutboundBitsPerSecond extends XboxLiveQualityOfServiceMetric
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XboxLiveQualityOfServiceMetric with Double] = js.native
  /* 6 */ @js.native
  object averageInboundBitsPerSecond extends TopLevel[averageInboundBitsPerSecond with Double]
  
  /* 0 */ @js.native
  object averageLatencyInMilliseconds extends TopLevel[averageLatencyInMilliseconds with Double]
  
  /* 3 */ @js.native
  object averageOutboundBitsPerSecond extends TopLevel[averageOutboundBitsPerSecond with Double]
  
  /* 8 */ @js.native
  object maxInboundBitsPerSecond extends TopLevel[maxInboundBitsPerSecond with Double]
  
  /* 2 */ @js.native
  object maxLatencyInMilliseconds extends TopLevel[maxLatencyInMilliseconds with Double]
  
  /* 5 */ @js.native
  object maxOutboundBitsPerSecond extends TopLevel[maxOutboundBitsPerSecond with Double]
  
  /* 7 */ @js.native
  object minInboundBitsPerSecond extends TopLevel[minInboundBitsPerSecond with Double]
  
  /* 1 */ @js.native
  object minLatencyInMilliseconds extends TopLevel[minLatencyInMilliseconds with Double]
  
  /* 4 */ @js.native
  object minOutboundBitsPerSecond extends TopLevel[minOutboundBitsPerSecond with Double]
  
}

