package typings
package winrtLib.WindowsNs.FoundationNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GCPressureAmount extends js.Object

@JSGlobal("Windows.Foundation.Metadata.GCPressureAmount")
@js.native
object GCPressureAmount extends js.Object {
  @js.native
  sealed trait high
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.GCPressureAmount
  
  @js.native
  sealed trait low
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.GCPressureAmount
  
  @js.native
  sealed trait medium
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.GCPressureAmount
  
  /* 2 */ val high: high with scala.Double = js.native
  /* 0 */ val low: low with scala.Double = js.native
  /* 1 */ val medium: medium with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.FoundationNs.MetadataNs.GCPressureAmount with scala.Double] = js.native
}

