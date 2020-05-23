package typings.three.webGLRenderListsMod

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.groupMod.Group
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.webGLProgramMod.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderItem extends js.Object {
  var geometry: BufferGeometry | Null
  var group: Group | Null
  var groupOrder: Double
  var id: Double
  var material: Material
  var `object`: Object3D
  var program: WebGLProgram
  var renderOrder: Double
  var z: Double
}

object RenderItem {
  @scala.inline
  def apply(
    groupOrder: Double,
    id: Double,
    material: Material,
    `object`: Object3D,
    program: WebGLProgram,
    renderOrder: Double,
    z: Double,
    geometry: BufferGeometry = null,
    group: Group = null
  ): RenderItem = {
    val __obj = js.Dynamic.literal(groupOrder = groupOrder.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], renderOrder = renderOrder.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderItem]
  }
}

