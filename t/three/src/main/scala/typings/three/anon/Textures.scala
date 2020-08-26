package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Textures extends js.Object {
  var geometries: Double = js.native
  var textures: Double = js.native
}

object Textures {
  @scala.inline
  def apply(geometries: Double, textures: Double): Textures = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Textures]
  }
  @scala.inline
  implicit class TexturesOps[Self <: Textures] (val x: Self) extends AnyVal {
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
    def setGeometries(value: Double): Self = this.set("geometries", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextures(value: Double): Self = this.set("textures", value.asInstanceOf[js.Any])
  }
  
}

