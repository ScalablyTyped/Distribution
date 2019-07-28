package typings.winrtDashUwp.WindowsNs.FoundationNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GCPressureAmount extends js.Object

/** Microsoft internal use only. */
@JSGlobal("Windows.Foundation.Metadata.GCPressureAmount")
@js.native
object GCPressureAmount extends js.Object {
  /** Over 100k of memory pressure. */
  @js.native
  sealed trait high extends GCPressureAmount
  
  /** Less than 10k of memory pressure. */
  @js.native
  sealed trait low extends GCPressureAmount
  
  /** Between 10k and 100k of memory pressure. */
  @js.native
  sealed trait medium extends GCPressureAmount
  
  /* 2 */ val high: typings.winrtDashUwp.WindowsNs.FoundationNs.MetadataNs.GCPressureAmount.high with Double = js.native
  /* 0 */ val low: typings.winrtDashUwp.WindowsNs.FoundationNs.MetadataNs.GCPressureAmount.low with Double = js.native
  /* 1 */ val medium: typings.winrtDashUwp.WindowsNs.FoundationNs.MetadataNs.GCPressureAmount.medium with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GCPressureAmount with Double] = js.native
}

