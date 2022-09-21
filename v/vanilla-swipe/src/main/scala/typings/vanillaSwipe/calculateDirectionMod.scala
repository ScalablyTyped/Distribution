package typings.vanillaSwipe

import typings.vanillaSwipe.typesMod.TraceDirectionKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateDirectionMod {
  
  @JSImport("vanilla-swipe/lib/utils/calculateDirection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateDirection(trace: js.Array[Double]): TraceDirectionKey = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateDirection")(trace.asInstanceOf[js.Any]).asInstanceOf[TraceDirectionKey]
}
