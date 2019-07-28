package typings.three.srcRenderersWebglWebGLRenderListsMod

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcObjectsGroupMod.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLRenderLists", "WebGLRenderList")
@js.native
class WebGLRenderList () extends js.Object {
  var opaque: js.Array[RenderItem] = js.native
  var transparent: js.Array[RenderItem] = js.native
  def init(): Unit = js.native
  def push(`object`: Object3D, geometry: Null, material: Material, groupOrder: Double, z: Double): Unit = js.native
  def push(
    `object`: Object3D,
    geometry: Null,
    material: Material,
    groupOrder: Double,
    z: Double,
    group: Group
  ): Unit = js.native
  def push(`object`: Object3D, geometry: BufferGeometry, material: Material, groupOrder: Double, z: Double): Unit = js.native
  def push(
    `object`: Object3D,
    geometry: BufferGeometry,
    material: Material,
    groupOrder: Double,
    z: Double,
    group: Group
  ): Unit = js.native
  def sort(): Unit = js.native
  def unshift(`object`: Object3D, geometry: Null, material: Material, groupOrder: Double, z: Double): Unit = js.native
  def unshift(
    `object`: Object3D,
    geometry: Null,
    material: Material,
    groupOrder: Double,
    z: Double,
    group: Group
  ): Unit = js.native
  def unshift(`object`: Object3D, geometry: BufferGeometry, material: Material, groupOrder: Double, z: Double): Unit = js.native
  def unshift(
    `object`: Object3D,
    geometry: BufferGeometry,
    material: Material,
    groupOrder: Double,
    z: Double,
    group: Group
  ): Unit = js.native
}

