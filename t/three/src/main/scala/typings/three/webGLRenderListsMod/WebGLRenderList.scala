package typings.three.webGLRenderListsMod

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.groupMod.Group
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.webGLPropertiesMod.WebGLProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLRenderLists", "WebGLRenderList")
@js.native
class WebGLRenderList protected () extends js.Object {
  def this(properties: WebGLProperties) = this()
  
  def finish(): Unit = js.native
  
  def init(): Unit = js.native
  
  /**
  	 * @default []
  	 */
  var opaque: js.Array[RenderItem] = js.native
  
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
  
  def sort(opaqueSort: js.Function, transparentSort: js.Function): Unit = js.native
  
  /**
  	 * @default []
  	 */
  var transparent: js.Array[RenderItem] = js.native
  
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
