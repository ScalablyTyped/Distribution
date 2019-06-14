package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs

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
  sealed trait high
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.GCPressureAmount
  
  /** Less than 10k of memory pressure. */
  @js.native
  sealed trait low
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.GCPressureAmount
  
  /** Between 10k and 100k of memory pressure. */
  @js.native
  sealed trait medium
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.GCPressureAmount
  
  /* 2 */ val high: high with scala.Double = js.native
  /* 0 */ val low: low with scala.Double = js.native
  /* 1 */ val medium: medium with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.GCPressureAmount with scala.Double
  ] = js.native
}

