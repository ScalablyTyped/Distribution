package typings.three

import typings.three.box3Mod.Box3
import typings.three.matrix4Mod.Matrix4
import typings.three.planeMod.Plane
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/math/Sphere", JSImport.Namespace)
@js.native
object sphereMod extends js.Object {
  
  @js.native
  class Sphere () extends js.Object {
    def this(center: Vector3) = this()
    def this(center: js.UndefOr[scala.Nothing], radius: Double) = this()
    def this(center: Vector3, radius: Double) = this()
    
    def applyMatrix4(matrix: Matrix4): Sphere = js.native
    
    /**
    	 * @default new Vector3()
    	 */
    var center: Vector3 = js.native
    
    def clampPoint(point: Vector3, target: Vector3): Vector3 = js.native
    
    def containsPoint(point: Vector3): Boolean = js.native
    
    def copy(sphere: Sphere): this.type = js.native
    
    def distanceToPoint(point: Vector3): Double = js.native
    
    /**
    	 * @deprecated Use {@link Sphere#isEmpty .isEmpty()} instead.
    	 */
    def empty(): js.Any = js.native
    
    def equals(sphere: Sphere): Boolean = js.native
    
    def getBoundingBox(target: Box3): Box3 = js.native
    
    def intersectsBox(box: Box3): Boolean = js.native
    
    def intersectsPlane(plane: Plane): Boolean = js.native
    
    def intersectsSphere(sphere: Sphere): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def makeEmpty(): this.type = js.native
    
    /**
    	 * @default 1
    	 */
    var radius: Double = js.native
    
    def set(center: Vector3, radius: Double): Sphere = js.native
    
    def setFromPoints(points: js.Array[Vector3]): Sphere = js.native
    def setFromPoints(points: js.Array[Vector3], optionalCenter: Vector3): Sphere = js.native
    
    def translate(offset: Vector3): Sphere = js.native
  }
}
