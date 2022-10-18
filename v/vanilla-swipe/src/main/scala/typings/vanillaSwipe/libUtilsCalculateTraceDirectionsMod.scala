package typings.vanillaSwipe

import typings.vanillaSwipe.libTypesMod.TraceDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsCalculateTraceDirectionsMod {
  
  @JSImport("vanilla-swipe/lib/utils/calculateTraceDirections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateTraceDirections(): js.Array[TraceDirection] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateTraceDirections")().asInstanceOf[js.Array[TraceDirection]]
  inline def calculateTraceDirections(trace: js.Array[Double]): js.Array[TraceDirection] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateTraceDirections")(trace.asInstanceOf[js.Any]).asInstanceOf[js.Array[TraceDirection]]
}
