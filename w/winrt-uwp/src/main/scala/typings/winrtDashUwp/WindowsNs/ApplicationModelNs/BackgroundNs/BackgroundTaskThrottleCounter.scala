package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs

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
  sealed trait all extends BackgroundTaskThrottleCounter
  
  /** Indicates a request for CPU throttle count. */
  @js.native
  sealed trait cpu extends BackgroundTaskThrottleCounter
  
  /** Indicates a request for network throttle count. */
  @js.native
  sealed trait network extends BackgroundTaskThrottleCounter
  
  /* 0 */ val all: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskThrottleCounter.all with Double = js.native
  /* 1 */ val cpu: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskThrottleCounter.cpu with Double = js.native
  /* 2 */ val network: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskThrottleCounter.network with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTaskThrottleCounter with Double] = js.native
}

