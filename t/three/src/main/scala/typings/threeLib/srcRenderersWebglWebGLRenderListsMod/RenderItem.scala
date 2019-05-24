package typings
package threeLib.srcRenderersWebglWebGLRenderListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderItem extends js.Object {
  var geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry | scala.Null
  var group: threeLib.srcObjectsGroupMod.Group | scala.Null
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
    groupOrder: scala.Double,
    id: scala.Double,
    material: threeLib.srcMaterialsMaterialMod.Material,
    `object`: threeLib.srcCoreObject3DMod.Object3D,
    program: threeLib.srcRenderersWebglWebGLProgramMod.WebGLProgram,
    renderOrder: scala.Double,
    z: scala.Double,
    geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry = null,
    group: threeLib.srcObjectsGroupMod.Group = null
  ): RenderItem = {
    val __obj = js.Dynamic.literal(groupOrder = groupOrder, id = id, material = material, program = program, renderOrder = renderOrder, z = z)
    __obj.updateDynamic("object")(`object`)
    if (geometry != null) __obj.updateDynamic("geometry")(geometry)
    if (group != null) __obj.updateDynamic("group")(group)
    __obj.asInstanceOf[RenderItem]
  }
}

