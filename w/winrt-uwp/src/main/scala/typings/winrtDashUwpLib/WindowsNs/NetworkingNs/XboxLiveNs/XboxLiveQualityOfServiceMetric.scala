package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs

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
  sealed trait averageInboundBitsPerSecond
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait averageLatencyInMilliseconds
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait averageOutboundBitsPerSecond
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait maxInboundBitsPerSecond
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait maxLatencyInMilliseconds
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait maxOutboundBitsPerSecond
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait minInboundBitsPerSecond
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait minLatencyInMilliseconds
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMetric
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait minOutboundBitsPerSecond
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMetric
  
  val averageInboundBitsPerSecond: averageInboundBitsPerSecond with java.lang.String = js.native
  val averageLatencyInMilliseconds: averageLatencyInMilliseconds with java.lang.String = js.native
  val averageOutboundBitsPerSecond: averageOutboundBitsPerSecond with java.lang.String = js.native
  val maxInboundBitsPerSecond: maxInboundBitsPerSecond with java.lang.String = js.native
  val maxLatencyInMilliseconds: maxLatencyInMilliseconds with java.lang.String = js.native
  val maxOutboundBitsPerSecond: maxOutboundBitsPerSecond with java.lang.String = js.native
  val minInboundBitsPerSecond: minInboundBitsPerSecond with java.lang.String = js.native
  val minLatencyInMilliseconds: minLatencyInMilliseconds with java.lang.String = js.native
  val minOutboundBitsPerSecond: minOutboundBitsPerSecond with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveQualityOfServiceMetric with java.lang.String
  ] = js.native
}

