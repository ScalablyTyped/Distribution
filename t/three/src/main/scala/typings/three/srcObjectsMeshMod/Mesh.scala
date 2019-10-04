package typings.three.srcObjectsMeshMod

import org.scalablytyped.runtime.StringDictionary
import typings.three.srcConstantsMod.TrianglesDrawModes
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreGeometryMod.Geometry
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.threeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Mesh", "Mesh")
@js.native
class Mesh () extends Object3D {
  def this(geometry: BufferGeometry) = this()
  def this(geometry: Geometry) = this()
  def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
  def this(geometry: BufferGeometry, material: Material) = this()
  def this(geometry: Geometry, material: js.Array[Material]) = this()
  def this(geometry: Geometry, material: Material) = this()
  var drawMode: TrianglesDrawModes = js.native
  var geometry: Geometry | BufferGeometry = js.native
  var isMesh: `true` = js.native
  var material: Material | js.Array[Material] = js.native
  var morphTargetDictionary: js.UndefOr[StringDictionary[Double]] = js.native
  var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native
  def setDrawMode(drawMode: TrianglesDrawModes): Unit = js.native
  def updateMorphTargets(): Unit = js.native
}

