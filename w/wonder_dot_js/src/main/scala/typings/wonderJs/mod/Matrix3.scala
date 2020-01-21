package typings.wonderJs.mod

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "Matrix3")
@js.native
class Matrix3 ()
  extends typings.wonderJs.matrix3Mod.Matrix3 {
  def this(mat: Float32Array) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "Matrix3")
@js.native
object Matrix3 extends js.Object {
  def create(): typings.wonderJs.matrix3Mod.Matrix3 = js.native
  def create(mat: Float32Array): typings.wonderJs.matrix3Mod.Matrix3 = js.native
}

