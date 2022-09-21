package typings.vanillaSwipe

import typings.vanillaSwipe.typesMod.Axis
import typings.vanillaSwipe.typesMod.Direction
import typings.vanillaSwipe.typesMod.TraceDirectionKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("vanilla-swipe/lib/utils/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDifference(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDifference")().asInstanceOf[Double]
  inline def getDifference(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDifference")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getDifference(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDifference")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDifference(x: Unit, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDifference")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDirectionKey(): TraceDirectionKey = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionKey")().asInstanceOf[TraceDirectionKey]
  inline def getDirectionKey(`object`: js.Object): TraceDirectionKey = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionKey")(`object`.asInstanceOf[js.Any]).asInstanceOf[TraceDirectionKey]
  
  inline def getDirectionValue(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionValue")().asInstanceOf[Double]
  inline def getDirectionValue(values: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionValue")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def resolveAxisDirection(axis: Axis, key: TraceDirectionKey): Direction = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAxisDirection")(axis.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Direction]
}
