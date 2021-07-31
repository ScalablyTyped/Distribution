package typings.winrtUwp.Windows.Services.Store

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StoreDurationUnit extends StObject
/** Defines values that represent the units of a trial period or billing period for a subscription. */
@JSGlobal("Windows.Services.Store.StoreDurationUnit")
@js.native
object StoreDurationUnit extends StObject {
  
  /** The period is defined in days. */
  @js.native
  sealed trait day
    extends StObject
       with StoreDurationUnit
  
  /** The period is defined in hours. */
  @js.native
  sealed trait hour
    extends StObject
       with StoreDurationUnit
  
  /** The period is defined in minutes. */
  @js.native
  sealed trait minute
    extends StObject
       with StoreDurationUnit
  
  /** The period is defined in months. */
  @js.native
  sealed trait month
    extends StObject
       with StoreDurationUnit
  
  /** The period is defined in weeks. */
  @js.native
  sealed trait week
    extends StObject
       with StoreDurationUnit
  
  /** The period is defined in years. */
  @js.native
  sealed trait year
    extends StObject
       with StoreDurationUnit
}
