package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "Vector2")
@js.native
class Vector2 ()
  extends typings.wonderJs.vector2Mod.Vector2 {
  def this(x: js.Any, y: js.Any) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "Vector2")
@js.native
object Vector2 extends js.Object {
  def create(): typings.wonderJs.vector2Mod.Vector2 = js.native
  def create(x: js.Any, y: js.Any): typings.wonderJs.vector2Mod.Vector2 = js.native
}

