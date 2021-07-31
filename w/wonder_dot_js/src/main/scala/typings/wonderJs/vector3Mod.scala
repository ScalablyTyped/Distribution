package typings.wonderJs

import typings.std.Float32Array
import typings.wonderJs.matrix3Mod.Matrix3
import typings.wonderJs.matrix4Mod.Matrix4
import typings.wonderJs.vector4Mod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vector3Mod {
  
  @JSImport("wonder.js/dist/es2015/math/Vector3", "Vector3")
  @js.native
  class Vector3 () extends StObject {
    def this(x: Double, y: Double, z: Double) = this()
    
    def add(v: Vector3): this.type = js.native
    
    def add2(v1: Vector3, v2: Vector3): this.type = js.native
    
    def applyMatrix3(m: Matrix3): this.type = js.native
    
    def applyMatrix4(m: Matrix4): this.type = js.native
    
    def calAngleCos(v1: Vector3): Double = js.native
    
    def cross(lhs: Vector3, rhs: Vector3): this.type = js.native
    
    def distanceTo(v: Vector3): js.Any = js.native
    
    def distanceToSquared(v: Vector3): Double = js.native
    
    def dot(rhs: js.Any): Double = js.native
    
    def isEqual(v: Vector3): Boolean = js.native
    
    def isZero(): Boolean = js.native
    
    def length(): js.Any = js.native
    
    def lerp(lhs: Vector3, rhs: Vector3, alpha: Double): this.type = js.native
    
    def max(v: Vector3): this.type = js.native
    
    def min(v: Vector3): this.type = js.native
    
    def mul(v: Vector3): this.type = js.native
    
    def mul2(v1: Vector3, v2: Vector3): this.type = js.native
    
    def normalize(): Vector3 = js.native
    
    def reverse(): Vector3 = js.native
    
    def scale(scalar: Double): js.Any = js.native
    def scale(x: Double, y: Double, z: Double): js.Any = js.native
    
    def set(v: Vector3): js.Any = js.native
    def set(x: Double, y: Double, z: Double): js.Any = js.native
    
    def sub(v: Vector3): Vector3 = js.native
    
    def sub2(v1: Vector3, v2: Vector3): this.type = js.native
    
    def toArray(): js.Array[Double] = js.native
    
    def toVector4(): Vector4 = js.native
    
    var values: Float32Array = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  /* static members */
  object Vector3 {
    
    @JSImport("wonder.js/dist/es2015/math/Vector3", "Vector3")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Vector3]
    @scala.inline
    def create(x: Double, y: Double, z: Double): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    @JSImport("wonder.js/dist/es2015/math/Vector3", "Vector3.forward")
    @js.native
    def forward: js.Any = js.native
    @scala.inline
    def forward_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forward")(x.asInstanceOf[js.Any])
    
    @JSImport("wonder.js/dist/es2015/math/Vector3", "Vector3.right")
    @js.native
    def right: js.Any = js.native
    @scala.inline
    def right_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    
    @JSImport("wonder.js/dist/es2015/math/Vector3", "Vector3.up")
    @js.native
    def up: js.Any = js.native
    @scala.inline
    def up_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("up")(x.asInstanceOf[js.Any])
  }
}
