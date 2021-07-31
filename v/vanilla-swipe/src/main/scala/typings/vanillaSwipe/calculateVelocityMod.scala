package typings.vanillaSwipe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateVelocityMod {
  
  @JSImport("vanilla-swipe/lib/utils/calculateVelocity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def calculateVelocity(x: Double, y: Double, time: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateVelocity")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Double]
}
