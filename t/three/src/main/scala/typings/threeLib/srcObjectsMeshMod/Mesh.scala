package typings
package threeLib.srcObjectsMeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Mesh", "Mesh")
@js.native
class Mesh ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material]) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: threeLib.srcMaterialsMaterialMod.Material) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material]) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: threeLib.srcMaterialsMaterialMod.Material) = this()
  var drawMode: threeLib.srcConstantsMod.TrianglesDrawModes = js.native
  var geometry: threeLib.srcCoreGeometryMod.Geometry | threeLib.srcCoreBufferGeometryMod.BufferGeometry = js.native
  var isMesh: threeLib.threeLibNumbers.`true` = js.native
  var material: threeLib.srcMaterialsMaterialMod.Material | js.Array[threeLib.srcMaterialsMaterialMod.Material] = js.native
  var morphTargetDictionary: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.native
  var morphTargetInfluences: js.UndefOr[js.Array[scala.Double]] = js.native
  def copy(source: this.type): this.type = js.native
  def copy(source: this.type, recursive: scala.Boolean): this.type = js.native
  def setDrawMode(drawMode: threeLib.srcConstantsMod.TrianglesDrawModes): scala.Unit = js.native
  def updateMorphTargets(): scala.Unit = js.native
}

