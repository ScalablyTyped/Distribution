package typings.winrt.Windows.Foundation.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GCPressureAmount extends js.Object

@JSGlobal("Windows.Foundation.Metadata.GCPressureAmount")
@js.native
object GCPressureAmount extends js.Object {
  @js.native
  sealed trait high extends GCPressureAmount
  
  @js.native
  sealed trait low extends GCPressureAmount
  
  @js.native
  sealed trait medium extends GCPressureAmount
  
  /* 2 */ val high: typings.winrt.Windows.Foundation.Metadata.GCPressureAmount.high with Double = js.native
  /* 0 */ val low: typings.winrt.Windows.Foundation.Metadata.GCPressureAmount.low with Double = js.native
  /* 1 */ val medium: typings.winrt.Windows.Foundation.Metadata.GCPressureAmount.medium with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GCPressureAmount with Double] = js.native
}

