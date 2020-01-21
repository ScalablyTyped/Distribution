package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "Quaternion")
@js.native
class Quaternion ()
  extends typings.wonderJs.quaternionMod.Quaternion {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "Quaternion")
@js.native
object Quaternion extends js.Object {
  def create(): typings.wonderJs.quaternionMod.Quaternion = js.native
  def create(x: Double): typings.wonderJs.quaternionMod.Quaternion = js.native
  def create(x: Double, y: Double): typings.wonderJs.quaternionMod.Quaternion = js.native
  def create(x: Double, y: Double, z: Double): typings.wonderJs.quaternionMod.Quaternion = js.native
  def create(x: Double, y: Double, z: Double, w: Double): typings.wonderJs.quaternionMod.Quaternion = js.native
}

