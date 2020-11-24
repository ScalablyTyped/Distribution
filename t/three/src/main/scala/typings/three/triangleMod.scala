package typings.three

import typings.three.box3Mod.Box3
import typings.three.planeMod.Plane
import typings.three.vector2Mod.Vector2
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/math/Triangle", JSImport.Namespace)
@js.native
object triangleMod extends js.Object {
  
  @js.native
  class Triangle () extends js.Object {
    def this(a: Vector3) = this()
    def this(a: js.UndefOr[scala.Nothing], b: Vector3) = this()
    def this(a: Vector3, b: Vector3) = this()
    def this(a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], c: Vector3) = this()
    def this(a: js.UndefOr[scala.Nothing], b: Vector3, c: Vector3) = this()
    def this(a: Vector3, b: js.UndefOr[scala.Nothing], c: Vector3) = this()
    def this(a: Vector3, b: Vector3, c: Vector3) = this()
    
    /**
    	 * @default new THREE.Vector3()
    	 */
    var a: Vector3 = js.native
    
    /**
    	 * @default new THREE.Vector3()
    	 */
    var b: Vector3 = js.native
    
    /**
    	 * @default new THREE.Vector3()
    	 */
    var c: Vector3 = js.native
    
    def closestPointToPoint(point: Vector3, target: Vector3): Vector3 = js.native
    
    def containsPoint(point: Vector3): Boolean = js.native
    
    def copy(triangle: Triangle): this.type = js.native
    
    def equals(triangle: Triangle): Boolean = js.native
    
    def getArea(): Double = js.native
    
    def getBarycoord(point: Vector3, target: Vector3): Vector3 = js.native
    
    def getMidpoint(target: Vector3): Vector3 = js.native
    
    def getNormal(target: Vector3): Vector3 = js.native
    
    def getPlane(target: Plane): Plane = js.native
    
    def getUV(point: Vector3, uv1: Vector2, uv2: Vector2, uv3: Vector2, target: Vector2): Vector2 = js.native
    
    def intersectsBox(box: Box3): Boolean = js.native
    
    def isFrontFacing(direction: Vector3): Boolean = js.native
    
    def set(a: Vector3, b: Vector3, c: Vector3): Triangle = js.native
    
    def setFromPointsAndIndices(points: js.Array[Vector3], i0: Double, i1: Double, i2: Double): Triangle = js.native
  }
  /* static members */
  @js.native
  object Triangle extends js.Object {
    
    def containsPoint(point: Vector3, a: Vector3, b: Vector3, c: Vector3): Boolean = js.native
    
    def getBarycoord(point: Vector3, a: Vector3, b: Vector3, c: Vector3, target: Vector3): Vector3 = js.native
    
    def getNormal(a: Vector3, b: Vector3, c: Vector3, target: Vector3): Vector3 = js.native
    
    def getUV(
      point: Vector3,
      p1: Vector3,
      p2: Vector3,
      p3: Vector3,
      uv1: Vector2,
      uv2: Vector2,
      uv3: Vector2,
      target: Vector2
    ): Vector2 = js.native
    
    def isFrontFacing(a: Vector3, b: Vector3, c: Vector3, direction: Vector3): Boolean = js.native
  }
}
