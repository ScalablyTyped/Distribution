package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "SkinnedMesh")
@js.native
class SkinnedMesh ()
  extends threeLib.srcObjectsSkinnedMeshMod.SkinnedMesh {
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
}

