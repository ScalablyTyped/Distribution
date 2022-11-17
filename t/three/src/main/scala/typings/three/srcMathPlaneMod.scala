package typings.three

import typings.three.srcMathBox3Mod.Box3
import typings.three.srcMathLine3Mod.Line3
import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathSphereMod.Sphere
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathPlaneMod {
  
  @JSImport("three/src/math/Plane", "Plane")
  @js.native
  open class Plane () extends StObject {
    def this(normal: Vector3) = this()
    def this(normal: Unit, constant: Double) = this()
    def this(normal: Vector3, constant: Double) = this()
    
    def applyMatrix4(matrix: Matrix4): Plane = js.native
    def applyMatrix4(matrix: Matrix4, optionalNormalMatrix: Matrix3): Plane = js.native
    
    /**
      * @default 0
      */
    var constant: Double = js.native
    
    def coplanarPoint(target: Vector3): Vector3 = js.native
    
    def copy(plane: Plane): this.type = js.native
    
    def distanceToPoint(point: Vector3): Double = js.native
    
    def distanceToSphere(sphere: Sphere): Double = js.native
    
    def equals(plane: Plane): Boolean = js.native
    
    def intersectLine(line: Line3, target: Vector3): Vector3 | Null = js.native
    
    def intersectsBox(box: Box3): Boolean = js.native
    
    def intersectsLine(line: Line3): Boolean = js.native
    
    def intersectsSphere(sphere: Sphere): Boolean = js.native
    
    /**
      * @deprecated Use {@link Plane#intersectsLine .intersectsLine()} instead.
      */
    def isIntersectionLine(l: Any): Any = js.native
    
    val isPlane: true = js.native
    
    def negate(): Plane = js.native
    
    /**
      * @default new THREE.Vector3( 1, 0, 0 )
      */
    var normal: Vector3 = js.native
    
    def normalize(): Plane = js.native
    
    def projectPoint(point: Vector3, target: Vector3): Vector3 = js.native
    
    def set(normal: Vector3, constant: Double): Plane = js.native
    
    def setComponents(x: Double, y: Double, z: Double, w: Double): Plane = js.native
    
    def setFromCoplanarPoints(a: Vector3, b: Vector3, c: Vector3): Plane = js.native
    
    def setFromNormalAndCoplanarPoint(normal: Vector3, point: Vector3): Plane = js.native
    
    def translate(offset: Vector3): Plane = js.native
  }
}
