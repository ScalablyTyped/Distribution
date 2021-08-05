package typings.vanillaSwipe

import typings.vanillaSwipe.vanillaSwipeStrings.x
import typings.vanillaSwipe.vanillaSwipeStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateDirectionMod {
  
  @JSImport("vanilla-swipe/lib/utils/calculateDirection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateDirection_x(trace: js.Array[Double], axis: x): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDirection")(trace.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def calculateDirection_y(trace: js.Array[Double], axis: y): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDirection")(trace.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[String]
}
