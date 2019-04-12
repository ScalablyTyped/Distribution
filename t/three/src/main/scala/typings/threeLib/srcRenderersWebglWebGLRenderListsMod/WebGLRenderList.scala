package typings
package threeLib.srcRenderersWebglWebGLRenderListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLRenderLists", "WebGLRenderList")
@js.native
class WebGLRenderList () extends js.Object {
  var opaque: js.Array[RenderItem] = js.native
  var transparent: js.Array[_] = js.native
  def init(): scala.Unit = js.native
  def push(
    `object`: threeLib.srcCoreObject3DMod.Object3D,
    geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry,
    material: threeLib.srcMaterialsMaterialMod.Material,
    z: scala.Double,
    group: threeLib.srcObjectsGroupMod.Group
  ): scala.Unit = js.native
  def push(
    `object`: threeLib.srcCoreObject3DMod.Object3D,
    geometry: threeLib.srcCoreGeometryMod.Geometry,
    material: threeLib.srcMaterialsMaterialMod.Material,
    z: scala.Double,
    group: threeLib.srcObjectsGroupMod.Group
  ): scala.Unit = js.native
  def sort(): scala.Unit = js.native
}

