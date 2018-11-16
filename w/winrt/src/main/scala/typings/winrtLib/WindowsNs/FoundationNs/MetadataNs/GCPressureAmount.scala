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
  
  val high: high with java.lang.String = js.native
  val low: low with java.lang.String = js.native
  val medium: medium with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.FoundationNs.MetadataNs.GCPressureAmount with java.lang.String
  ] = js.native
}

