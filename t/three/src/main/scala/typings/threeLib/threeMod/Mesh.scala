package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Mesh")
@js.native
class Mesh ()
  extends threeLib.srcObjectsMeshMod.Mesh {
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material]) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: threeLib.srcMaterialsMaterialMod.Material) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material]) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: threeLib.srcMaterialsMaterialMod.Material) = this()
}

