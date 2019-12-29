package typings.wonderDotJs

import typings.std.Float32Array
import typings.wonderDotJs.distEs2015MathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/math/Vector4", JSImport.Namespace)
@js.native
object distEs2015MathVector4Mod extends js.Object {
  @js.native
  class Vector4 () extends js.Object {
    def this(x: js.Any, y: js.Any, z: js.Any, w: js.Any) = this()
    var values: Float32Array = js.native
    var w: Double = js.native
    var x: Double = js.native
    var y: Double = js.native
    var z: Double = js.native
    /* protected */ def copyHelper(vector4: Vector4): js.Any = js.native
    def dot(v: Vector4): Double = js.native
    def isEqual(v: Vector4): Boolean = js.native
    def lengthManhattan(): js.Any = js.native
    def multiplyScalar(scalar: Double): this.type = js.native
    def normalize(): Vector4 = js.native
    def set(x: Double, y: Double, z: Double, w: Double): Unit = js.native
    def toVector3(): Vector3 = js.native
  }
  
  /* static members */
  @js.native
  object Vector4 extends js.Object {
    def create(): js.Any = js.native
    def create(x: js.Any, y: js.Any, z: js.Any, w: js.Any): js.Any = js.native
  }
  
}

