package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "SkinnedMesh")
@js.native
class SkinnedMesh () extends Mesh {
  def this(geometry: BufferGeometry) = this()
  def this(geometry: Geometry) = this()
  def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
  def this(geometry: BufferGeometry, material: Material) = this()
  def this(geometry: Geometry, material: js.Array[Material]) = this()
  def this(geometry: Geometry, material: Material) = this()
  def this(geometry: BufferGeometry, material: js.Array[Material], useVertexTexture: scala.Boolean) = this()
  def this(geometry: BufferGeometry, material: Material, useVertexTexture: scala.Boolean) = this()
  def this(geometry: Geometry, material: js.Array[Material], useVertexTexture: scala.Boolean) = this()
  def this(geometry: Geometry, material: Material, useVertexTexture: scala.Boolean) = this()
  var bindMatrix: Matrix4 = js.native
  var bindMatrixInverse: Matrix4 = js.native
  var bindMode: java.lang.String = js.native
  var skeleton: Skeleton = js.native
  def bind(skeleton: Skeleton): scala.Unit = js.native
  def bind(skeleton: Skeleton, bindMatrix: Matrix4): scala.Unit = js.native
  def normalizeSkinWeights(): scala.Unit = js.native
  def pose(): scala.Unit = js.native
  def updateMatrixWorld(): scala.Unit = js.native
}

