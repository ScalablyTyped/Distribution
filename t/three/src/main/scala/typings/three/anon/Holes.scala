package typings.three.anon

import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Holes extends js.Object {
  var holes: js.Array[js.Array[Vector2]]
  var shape: js.Array[Vector2]
}

object Holes {
  @scala.inline
  def apply(holes: js.Array[js.Array[Vector2]], shape: js.Array[Vector2]): Holes = {
    val __obj = js.Dynamic.literal(holes = holes.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Holes]
  }
}

