package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundTaskThrottleCounter extends js.Object

/** Indicates the type of throttle count to check for in a GetThrottleCount request. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskThrottleCounter")
@js.native
object BackgroundTaskThrottleCounter extends js.Object {
  /** Indicates a request for all throttle counts (CPU and network). */
  @js.native
  sealed trait all
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskThrottleCounter
  
  /** Indicates a request for CPU throttle count. */
  @js.native
  sealed trait cpu
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskThrottleCounter
  
  /** Indicates a request for network throttle count. */
  @js.native
  sealed trait network
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskThrottleCounter
  
  val all: all with java.lang.String = js.native
  val cpu: cpu with java.lang.String = js.native
  val network: network with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskThrottleCounter with java.lang.String
  ] = js.native
}

