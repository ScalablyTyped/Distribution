package typings.vanillaSwipe

import typings.vanillaSwipe.libTypesMod.Axis
import typings.vanillaSwipe.libTypesMod.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsResolveDirectionMod {
  
  @JSImport("vanilla-swipe/lib/utils/resolveDirection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveDirection(trace: js.Array[Double]): Direction = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirection")(trace.asInstanceOf[js.Any]).asInstanceOf[Direction]
  inline def resolveDirection(trace: js.Array[Double], axis: Unit, directionDelta: Double): Direction = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirection")(trace.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], directionDelta.asInstanceOf[js.Any])).asInstanceOf[Direction]
  inline def resolveDirection(trace: js.Array[Double], axis: Axis): Direction = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirection")(trace.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Direction]
  inline def resolveDirection(trace: js.Array[Double], axis: Axis, directionDelta: Double): Direction = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirection")(trace.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], directionDelta.asInstanceOf[js.Any])).asInstanceOf[Direction]
}
