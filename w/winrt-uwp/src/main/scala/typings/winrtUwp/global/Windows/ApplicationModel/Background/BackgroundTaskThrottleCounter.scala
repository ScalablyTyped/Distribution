package typings.winrtUwp.global.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates the type of throttle count to check for in a GetThrottleCount request. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskThrottleCounter")
@js.native
object BackgroundTaskThrottleCounter extends js.Object {
  /* 0 */ val all: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskThrottleCounter.all with Double = js.native
  /* 1 */ val cpu: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskThrottleCounter.cpu with Double = js.native
  /* 2 */ val network: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskThrottleCounter.network with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskThrottleCounter with Double
  ] = js.native
}

