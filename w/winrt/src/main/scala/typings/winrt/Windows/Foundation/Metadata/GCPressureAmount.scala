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
  
}

