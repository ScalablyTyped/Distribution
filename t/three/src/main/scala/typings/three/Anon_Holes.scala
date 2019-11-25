package typings.three

import typings.three.srcMathVector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Holes extends js.Object {
  var holes: js.Array[js.Array[Vector2]]
  var shape: js.Array[Vector2]
}

object Anon_Holes {
  @scala.inline
  def apply(holes: js.Array[js.Array[Vector2]], shape: js.Array[Vector2]): Anon_Holes = {
    val __obj = js.Dynamic.literal(holes = holes.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Holes]
  }
}

