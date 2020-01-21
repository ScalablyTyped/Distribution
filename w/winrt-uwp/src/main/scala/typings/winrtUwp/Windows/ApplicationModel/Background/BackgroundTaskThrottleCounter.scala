package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTaskThrottleCounter with Double] = js.native
  /* 0 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 1 */ @js.native
  object cpu extends TopLevel[cpu with Double]
  
  /* 2 */ @js.native
  object network extends TopLevel[network with Double]
  
}

