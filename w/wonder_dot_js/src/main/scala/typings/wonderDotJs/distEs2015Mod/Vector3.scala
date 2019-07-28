package typings.wonderDotJs.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "Vector3")
@js.native
class Vector3 ()
  extends typings.wonderDotJs.distEs2015MathVector3Mod.Vector3 {
  def this(x: Double, y: Double, z: Double) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "Vector3")
@js.native
object Vector3 extends js.Object {
  var forward: js.Any = js.native
  var right: js.Any = js.native
  var up: js.Any = js.native
  def create(): typings.wonderDotJs.distEs2015MathVector3Mod.Vector3 = js.native
  def create(x: Double, y: Double, z: Double): typings.wonderDotJs.distEs2015MathVector3Mod.Vector3 = js.native
}

