package typings.wonderJs.mod

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "Matrix4")
@js.native
class Matrix4 ()
  extends typings.wonderJs.matrix4Mod.Matrix4 {
  def this(mat: Float32Array) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "Matrix4")
@js.native
object Matrix4 extends js.Object {
  def create(): typings.wonderJs.matrix4Mod.Matrix4 = js.native
  def create(mat: Float32Array): typings.wonderJs.matrix4Mod.Matrix4 = js.native
}

