package typings.three.anon

import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Holes extends js.Object {
  var holes: js.Array[js.Array[Vector2]] = js.native
  var shape: js.Array[Vector2] = js.native
}

object Holes {
  @scala.inline
  def apply(holes: js.Array[js.Array[Vector2]], shape: js.Array[Vector2]): Holes = {
    val __obj = js.Dynamic.literal(holes = holes.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Holes]
  }
  @scala.inline
  implicit class HolesOps[Self <: Holes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHolesVarargs(value: js.Array[Vector2]*): Self = this.set("holes", js.Array(value :_*))
    @scala.inline
    def setHoles(value: js.Array[js.Array[Vector2]]): Self = this.set("holes", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapeVarargs(value: Vector2*): Self = this.set("shape", js.Array(value :_*))
    @scala.inline
    def setShape(value: js.Array[Vector2]): Self = this.set("shape", value.asInstanceOf[js.Any])
  }
  
}

