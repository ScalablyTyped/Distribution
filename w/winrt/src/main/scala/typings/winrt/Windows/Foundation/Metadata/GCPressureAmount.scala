package typings.winrt.Windows.Foundation.Metadata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GCPressureAmount extends StObject
@JSGlobal("Windows.Foundation.Metadata.GCPressureAmount")
@js.native
object GCPressureAmount extends StObject {
  
  @js.native
  sealed trait high
    extends StObject
       with GCPressureAmount
  
  @js.native
  sealed trait low
    extends StObject
       with GCPressureAmount
  
  @js.native
  sealed trait medium
    extends StObject
       with GCPressureAmount
}
