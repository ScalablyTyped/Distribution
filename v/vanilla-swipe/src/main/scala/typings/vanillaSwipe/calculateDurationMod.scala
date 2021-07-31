package typings.vanillaSwipe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateDurationMod {
  
  @JSImport("vanilla-swipe/lib/utils/calculateDuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def calculateDuration(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateDuration")().asInstanceOf[Double]
  @scala.inline
  def calculateDuration(prevTime: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateDuration")(prevTime.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def calculateDuration(prevTime: Double, nextTime: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDuration")(prevTime.asInstanceOf[js.Any], nextTime.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def calculateDuration(prevTime: Unit, nextTime: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDuration")(prevTime.asInstanceOf[js.Any], nextTime.asInstanceOf[js.Any])).asInstanceOf[Double]
}
