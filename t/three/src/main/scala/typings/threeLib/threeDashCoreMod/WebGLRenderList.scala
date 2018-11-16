package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "WebGLRenderList")
@js.native
class WebGLRenderList () extends js.Object {
  var opaque: js.Array[RenderItem] = js.native
  var transparent: js.Array[_] = js.native
  def init(): scala.Unit = js.native
  def push(`object`: Object3D, geometry: BufferGeometry, material: Material, z: scala.Double, group: Group): scala.Unit = js.native
  def push(`object`: Object3D, geometry: Geometry, material: Material, z: scala.Double, group: Group): scala.Unit = js.native
  def sort(): scala.Unit = js.native
}

