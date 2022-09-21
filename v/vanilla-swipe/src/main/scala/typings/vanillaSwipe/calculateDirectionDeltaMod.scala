package typings.vanillaSwipe

import typings.vanillaSwipe.typesMod.TraceDirection
import typings.vanillaSwipe.typesMod.TraceDirectionKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateDirectionDeltaMod {
  
  @JSImport("vanilla-swipe/lib/utils/calculateDirectionDelta", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateDirectionDelta(traceDirections: js.Array[TraceDirection]): TraceDirectionKey = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateDirectionDelta")(traceDirections.asInstanceOf[js.Any]).asInstanceOf[TraceDirectionKey]
  inline def calculateDirectionDelta(traceDirections: js.Array[TraceDirection], delta: Double): TraceDirectionKey = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDirectionDelta")(traceDirections.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[TraceDirectionKey]
}
