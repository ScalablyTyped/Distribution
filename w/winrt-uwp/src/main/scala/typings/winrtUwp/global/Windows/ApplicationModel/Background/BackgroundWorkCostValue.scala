package typings.winrtUwp.global.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the current cost of doing background work. Used as a hint to background tasks about how much work they can do. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundWorkCostValue")
@js.native
object BackgroundWorkCostValue extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundWorkCostValue with Double
  ] = js.native
  
  /* 2 */ val high: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundWorkCostValue.high with Double = js.native
  
  /* 0 */ val low: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundWorkCostValue.low with Double = js.native
  
  /* 1 */ val medium: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundWorkCostValue.medium with Double = js.native
}
