package typings
package threeLib.srcObjectsSkinnedMeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/SkinnedMesh", "SkinnedMesh")
@js.native
class SkinnedMesh ()
  extends threeLib.srcObjectsMeshMod.Mesh {
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material]) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: threeLib.srcMaterialsMaterialMod.Material) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material]) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: threeLib.srcMaterialsMaterialMod.Material) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material], useVertexTexture: scala.Boolean) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: threeLib.srcMaterialsMaterialMod.Material, useVertexTexture: scala.Boolean) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material], useVertexTexture: scala.Boolean) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: threeLib.srcMaterialsMaterialMod.Material, useVertexTexture: scala.Boolean) = this()
  var bindMatrix: threeLib.srcMathMatrix4Mod.Matrix4 = js.native
  var bindMatrixInverse: threeLib.srcMathMatrix4Mod.Matrix4 = js.native
  var bindMode: java.lang.String = js.native
  var skeleton: threeLib.srcObjectsSkeletonMod.Skeleton = js.native
  def bind(skeleton: threeLib.srcObjectsSkeletonMod.Skeleton): scala.Unit = js.native
  def bind(skeleton: threeLib.srcObjectsSkeletonMod.Skeleton, bindMatrix: threeLib.srcMathMatrix4Mod.Matrix4): scala.Unit = js.native
  def normalizeSkinWeights(): scala.Unit = js.native
  def pose(): scala.Unit = js.native
}

