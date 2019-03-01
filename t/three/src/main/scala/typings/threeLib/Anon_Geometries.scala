package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Geometries extends js.Object {
  var geometries: js.Any
  var images: js.Any
  var materials: js.Any
  var textures: js.Any
}

object Anon_Geometries {
  @scala.inline
  def apply(geometries: js.Any, images: js.Any, materials: js.Any, textures: js.Any): Anon_Geometries = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("geometries")(geometries)
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("materials")(materials)
    __obj.updateDynamic("textures")(textures)
    __obj.asInstanceOf[Anon_Geometries]
  }
}

