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
  
  val high: high with java.lang.String = js.native
  val low: low with java.lang.String = js.native
  val medium: medium with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.GCPressureAmount with java.lang.String
  ] = js.native
}

