package typings.winrtDashUwp.Windows.Networking.XboxLive

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
  
  /* 6 */ val averageInboundBitsPerSecond: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageInboundBitsPerSecond with Double = js.native
  /* 0 */ val averageLatencyInMilliseconds: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageLatencyInMilliseconds with Double = js.native
  /* 3 */ val averageOutboundBitsPerSecond: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageOutboundBitsPerSecond with Double = js.native
  /* 8 */ val maxInboundBitsPerSecond: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxInboundBitsPerSecond with Double = js.native
  /* 2 */ val maxLatencyInMilliseconds: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxLatencyInMilliseconds with Double = js.native
  /* 5 */ val maxOutboundBitsPerSecond: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxOutboundBitsPerSecond with Double = js.native
  /* 7 */ val minInboundBitsPerSecond: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minInboundBitsPerSecond with Double = js.native
  /* 1 */ val minLatencyInMilliseconds: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minLatencyInMilliseconds with Double = js.native
  /* 4 */ val minOutboundBitsPerSecond: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minOutboundBitsPerSecond with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XboxLiveQualityOfServiceMetric with Double] = js.native
}

