package typings.three

import typings.three.curveMod.Curve
import typings.three.geometryMod.Geometry
import typings.three.vector2Mod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curvePathMod {
  
  @JSImport("three/src/extras/core/CurvePath", "CurvePath")
  @js.native
  class CurvePath[T /* <: Vector */] () extends Curve[T] {
    
    def add(curve: Curve[T]): Unit = js.native
    
    /**
    	 * @default false
    	 */
    var autoClose: Boolean = js.native
    
    def closePath(): Unit = js.native
    
    /**
    	 * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
    	 */
    def createGeometry(points: js.Array[T]): Geometry = js.native
    
    /**
    	 * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
    	 */
    def createPointsGeometry(divisions: Double): Geometry = js.native
    
    /**
    	 * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
    	 */
    def createSpacedPointsGeometry(divisions: Double): Geometry = js.native
    
    /**
    	 * @default []
    	 */
    var curves: js.Array[Curve[T]] = js.native
    
    def getCurveLengths(): js.Array[Double] = js.native
  }
}
