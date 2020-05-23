package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometries extends js.Object {
  var geometries: js.Any
  var images: js.Any
  var materials: js.Any
  var textures: js.Any
}

object Geometries {
  @scala.inline
  def apply(geometries: js.Any, images: js.Any, materials: js.Any, textures: js.Any): Geometries = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], materials = materials.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometries]
  }
}

