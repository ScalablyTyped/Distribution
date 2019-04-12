package typings
package threeLib.srcObjectsLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Line", "Line")
@js.native
class Line ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material]) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: threeLib.srcMaterialsMaterialMod.Material) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material]) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: threeLib.srcMaterialsMaterialMod.Material) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material], mode: scala.Double) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: threeLib.srcMaterialsMaterialMod.Material, mode: scala.Double) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material], mode: scala.Double) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: threeLib.srcMaterialsMaterialMod.Material, mode: scala.Double) = this()
  var geometry: threeLib.srcCoreGeometryMod.Geometry | threeLib.srcCoreBufferGeometryMod.BufferGeometry = js.native
  var isLine: threeLib.threeLibNumbers.`true` = js.native
  var material: threeLib.srcMaterialsMaterialMod.Material | js.Array[threeLib.srcMaterialsMaterialMod.Material] = js.native
  @JSName("type")
  var type_Line: threeLib.threeLibStrings.Line | threeLib.threeLibStrings.LineLoop | threeLib.threeLibStrings.LineSegments = js.native
  def computeLineDistances(): this.type = js.native
}

