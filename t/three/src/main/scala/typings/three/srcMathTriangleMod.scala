package typings.three

import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import typings.three.srcCoreInterleavedBufferAttributeMod.InterleavedBufferAttribute
import typings.three.srcMathBox3Mod.Box3
import typings.three.srcMathPlaneMod.Plane
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcMathVector3Mod.Vector3
import typings.three.srcMathVector4Mod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathTriangleMod {
  
  @JSImport("three/src/math/Triangle", "Triangle")
  @js.native
  open class Triangle () extends StObject {
    def this(a: Vector3) = this()
    def this(a: Unit, b: Vector3) = this()
    def this(a: Vector3, b: Vector3) = this()
    def this(a: Unit, b: Unit, c: Vector3) = this()
    def this(a: Unit, b: Vector3, c: Vector3) = this()
    def this(a: Vector3, b: Unit, c: Vector3) = this()
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
    
    def getInterpolation(point: Vector3, v1: Vector2, v2: Vector2, v3: Vector2, target: Vector2): Vector2 = js.native
    def getInterpolation(point: Vector3, v1: Vector3, v2: Vector3, v3: Vector3, target: Vector3): Vector3 = js.native
    def getInterpolation(point: Vector3, v1: Vector4, v2: Vector4, v3: Vector4, target: Vector4): Vector4 = js.native
    
    def getMidpoint(target: Vector3): Vector3 = js.native
    
    def getNormal(target: Vector3): Vector3 = js.native
    
    def getPlane(target: Plane): Plane = js.native
    
    /**
      * @deprecated Triangle.getUV() has been renamed to Triangle.getInterpolation().
      */
    def getUV(point: Vector3, uv1: Vector2, uv2: Vector2, uv3: Vector2, target: Vector2): Vector2 = js.native
    
    def intersectsBox(box: Box3): Boolean = js.native
    
    def isFrontFacing(direction: Vector3): Boolean = js.native
    
    def set(a: Vector3, b: Vector3, c: Vector3): Triangle = js.native
    
    def setFromAttributeAndIndices(attribute: BufferAttribute, i0: Double, i1: Double, i2: Double): this.type = js.native
    def setFromAttributeAndIndices(attribute: InterleavedBufferAttribute, i0: Double, i1: Double, i2: Double): this.type = js.native
    
    def setFromPointsAndIndices(points: js.Array[Vector3], i0: Double, i1: Double, i2: Double): this.type = js.native
  }
  /* static members */
  object Triangle {
    
    @JSImport("three/src/math/Triangle", "Triangle")
    @js.native
    val ^ : js.Any = js.native
    
    inline def containsPoint(point: Vector3, a: Vector3, b: Vector3, c: Vector3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsPoint")(point.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def getBarycoord(point: Vector3, a: Vector3, b: Vector3, c: Vector3, target: Vector3): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getBarycoord")(point.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    inline def getInterpolation(
      point: Vector3,
      p1: Vector3,
      p2: Vector3,
      p3: Vector3,
      v1: Vector2,
      v2: Vector2,
      v3: Vector2,
      target: Vector2
    ): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getInterpolation")(point.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    inline def getInterpolation(
      point: Vector3,
      p1: Vector3,
      p2: Vector3,
      p3: Vector3,
      v1: Vector3,
      v2: Vector3,
      v3: Vector3,
      target: Vector3
    ): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getInterpolation")(point.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    inline def getInterpolation(
      point: Vector3,
      p1: Vector3,
      p2: Vector3,
      p3: Vector3,
      v1: Vector4,
      v2: Vector4,
      v3: Vector4,
      target: Vector4
    ): Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("getInterpolation")(point.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector4]
    
    inline def getNormal(a: Vector3, b: Vector3, c: Vector3, target: Vector3): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getNormal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    /**
      * @deprecated THREE.Triangle.getUV() has been renamed to THREE.Triangle.getInterpolation().
      */
    inline def getUV(
      point: Vector3,
      p1: Vector3,
      p2: Vector3,
      p3: Vector3,
      uv1: Vector2,
      uv2: Vector2,
      uv3: Vector2,
      target: Vector2
    ): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getUV")(point.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], uv1.asInstanceOf[js.Any], uv2.asInstanceOf[js.Any], uv3.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    inline def isFrontFacing(a: Vector3, b: Vector3, c: Vector3, direction: Vector3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFrontFacing")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
