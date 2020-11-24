package typings.winrtUwp.Windows.Foundation.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
