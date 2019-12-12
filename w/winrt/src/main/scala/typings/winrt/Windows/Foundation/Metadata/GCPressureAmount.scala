package typings.winrt.Windows.Foundation.Metadata

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Foundation.Metadata.GCPressureAmount.high
import typings.winrt.Windows.Foundation.Metadata.GCPressureAmount.low
import typings.winrt.Windows.Foundation.Metadata.GCPressureAmount.medium
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GCPressureAmount with Double] = js.native
  /* 2 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 0 */ @js.native
  object low extends TopLevel[low with Double]
  
  /* 1 */ @js.native
  object medium extends TopLevel[medium with Double]
  
}

