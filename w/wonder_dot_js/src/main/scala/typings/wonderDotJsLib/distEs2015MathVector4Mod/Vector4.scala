package typings
package wonderDotJsLib.distEs2015MathVector4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/math/Vector4", "Vector4")
@js.native
class Vector4 () extends js.Object {
  def this(x: js.Any, y: js.Any, z: js.Any, w: js.Any) = this()
  var values: stdLib.Float32Array = js.native
  var w: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  /* protected */ def copyHelper(vector4: Vector4): js.Any = js.native
  def dot(v: Vector4): scala.Double = js.native
  def isEqual(v: Vector4): scala.Boolean = js.native
  def lengthManhattan(): js.Any = js.native
  def multiplyScalar(scalar: scala.Double): this.type = js.native
  def normalize(): Vector4 = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): scala.Unit = js.native
  def toVector3(): wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
}

@JSImport("wonder.js/dist/es2015/math/Vector4", "Vector4")
@js.native
object Vector4 extends js.Object {
  def create(): js.Any = js.native
  def create(x: js.Any, y: js.Any, z: js.Any, w: js.Any): js.Any = js.native
}

