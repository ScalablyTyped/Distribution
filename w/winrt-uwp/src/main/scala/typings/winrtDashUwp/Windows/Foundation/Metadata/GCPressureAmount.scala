package typings.winrtDashUwp.Windows.Foundation.Metadata

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GCPressureAmount with Double] = js.native
  /* 2 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 0 */ @js.native
  object low extends TopLevel[low with Double]
  
  /* 1 */ @js.native
  object medium extends TopLevel[medium with Double]
  
}

