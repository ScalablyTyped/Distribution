package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Elements extends js.Object {
  var elements: js.Array[threeLib.threeDashCoreMod.Face3]
      // Sprite or Particle
  var lights: js.Array[threeLib.threeDashCoreMod.Light]
  var objects: js.Array[threeLib.threeDashCoreMod.Object3D]
       // Mesh, Line or other object
  var sprites: js.Array[threeLib.threeDashCoreMod.Object3D]
}

object Anon_Elements {
  @scala.inline
  def apply(
    elements: js.Array[threeLib.threeDashCoreMod.Face3],
    lights: js.Array[threeLib.threeDashCoreMod.Light],
    objects: js.Array[threeLib.threeDashCoreMod.Object3D],
    sprites: js.Array[threeLib.threeDashCoreMod.Object3D]
  ): Anon_Elements = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("elements")(elements)
    __obj.updateDynamic("lights")(lights)
    __obj.updateDynamic("objects")(objects)
    __obj.updateDynamic("sprites")(sprites)
    __obj.asInstanceOf[Anon_Elements]
  }
}

