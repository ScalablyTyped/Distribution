package typings.winrtUwp.Windows.Services.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StoreDurationUnit extends js.Object

/** Defines values that represent the units of a trial period or billing period for a subscription. */
@JSGlobal("Windows.Services.Store.StoreDurationUnit")
@js.native
object StoreDurationUnit extends js.Object {
  /** The period is defined in days. */
  @js.native
  sealed trait day extends StoreDurationUnit
  
  /** The period is defined in hours. */
  @js.native
  sealed trait hour extends StoreDurationUnit
  
  /** The period is defined in minutes. */
  @js.native
  sealed trait minute extends StoreDurationUnit
  
  /** The period is defined in months. */
  @js.native
  sealed trait month extends StoreDurationUnit
  
  /** The period is defined in weeks. */
  @js.native
  sealed trait week extends StoreDurationUnit
  
  /** The period is defined in years. */
  @js.native
  sealed trait year extends StoreDurationUnit
  
}

