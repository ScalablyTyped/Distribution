package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderItem extends js.Object {
  var geometry: Geometry | BufferGeometry
  var group: Group
  var id: scala.Double
  var material: Material
  var `object`: Object3D
  var program: WebGLProgram
  var renderOrder: scala.Double
  var z: scala.Double
}

object RenderItem {
  @scala.inline
  def apply(
    geometry: Geometry | BufferGeometry,
    group: Group,
    id: scala.Double,
    material: Material,
    `object`: Object3D,
    program: WebGLProgram,
    renderOrder: scala.Double,
    z: scala.Double
  ): RenderItem = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("material")(material)
    __obj.updateDynamic("program")(program)
    __obj.updateDynamic("renderOrder")(renderOrder)
    __obj.updateDynamic("z")(z)
    __obj.asInstanceOf[RenderItem]
  }
}

