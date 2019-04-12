package typings
package threeLib.srcRenderersWebglWebGLRenderListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderItem extends js.Object {
  var geometry: threeLib.srcCoreGeometryMod.Geometry | threeLib.srcCoreBufferGeometryMod.BufferGeometry
  var group: threeLib.srcObjectsGroupMod.Group
  var groupOrder: scala.Double
  var id: scala.Double
  var material: threeLib.srcMaterialsMaterialMod.Material
  var `object`: threeLib.srcCoreObject3DMod.Object3D
  var program: threeLib.srcRenderersWebglWebGLProgramMod.WebGLProgram
  var renderOrder: scala.Double
  var z: scala.Double
}

object RenderItem {
  @scala.inline
  def apply(
    geometry: threeLib.srcCoreGeometryMod.Geometry | threeLib.srcCoreBufferGeometryMod.BufferGeometry,
    group: threeLib.srcObjectsGroupMod.Group,
    groupOrder: scala.Double,
    id: scala.Double,
    material: threeLib.srcMaterialsMaterialMod.Material,
    `object`: threeLib.srcCoreObject3DMod.Object3D,
    program: threeLib.srcRenderersWebglWebGLProgramMod.WebGLProgram,
    renderOrder: scala.Double,
    z: scala.Double
  ): RenderItem = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], group = group, groupOrder = groupOrder, id = id, material = material, program = program, renderOrder = renderOrder, z = z)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[RenderItem]
  }
}

