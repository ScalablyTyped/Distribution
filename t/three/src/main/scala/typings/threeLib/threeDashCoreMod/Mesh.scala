package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Mesh")
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
  var isMesh: threeLib.threeLibNumbers.`true` = js.native
  var material: Material | js.Array[Material] = js.native
  var morphTargetDictionary: js.UndefOr[ScalablyTyped.runtime.StringDictionary[scala.Double]] = js.native
  var morphTargetInfluences: js.UndefOr[js.Array[scala.Double]] = js.native
  def setDrawMode(drawMode: TrianglesDrawModes): scala.Unit = js.native
  def updateMorphTargets(): scala.Unit = js.native
}

