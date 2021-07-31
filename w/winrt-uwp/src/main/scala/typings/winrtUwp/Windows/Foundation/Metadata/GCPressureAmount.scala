package typings.winrtUwp.Windows.Foundation.Metadata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GCPressureAmount extends StObject
/** Microsoft internal use only. */
@JSGlobal("Windows.Foundation.Metadata.GCPressureAmount")
@js.native
object GCPressureAmount extends StObject {
  
  /** Over 100k of memory pressure. */
  @js.native
  sealed trait high
    extends StObject
       with GCPressureAmount
  
  /** Less than 10k of memory pressure. */
  @js.native
  sealed trait low
    extends StObject
       with GCPressureAmount
  
  /** Between 10k and 100k of memory pressure. */
  @js.native
  sealed trait medium
    extends StObject
       with GCPressureAmount
}
