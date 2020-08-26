package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometries extends js.Object {
  var geometries: js.Any = js.native
  var images: js.Any = js.native
  var materials: js.Any = js.native
  var textures: js.Any = js.native
}

object Geometries {
  @scala.inline
  def apply(geometries: js.Any, images: js.Any, materials: js.Any, textures: js.Any): Geometries = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], materials = materials.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometries]
  }
  @scala.inline
  implicit class GeometriesOps[Self <: Geometries] (val x: Self) extends AnyVal {
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
    def setGeometries(value: js.Any): Self = this.set("geometries", value.asInstanceOf[js.Any])
    @scala.inline
    def setImages(value: js.Any): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaterials(value: js.Any): Self = this.set("materials", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextures(value: js.Any): Self = this.set("textures", value.asInstanceOf[js.Any])
  }
  
}

