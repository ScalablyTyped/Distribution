package typings
package threeLib.srcMaterialsMeshDistanceMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshDistanceMaterial", "MeshDistanceMaterial")
@js.native
class MeshDistanceMaterial ()
  extends threeLib.srcMaterialsMaterialMod.Material {
  def this(parameters: MeshDistanceMaterialParameters) = this()
  var displacementBias: scala.Double = js.native
  var displacementMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var displacementScale: scala.Double = js.native
  var farDistance: scala.Double = js.native
  var nearDistance: scala.Double = js.native
  var referencePosition: threeLib.srcMathVector3Mod.Vector3 = js.native
  def setValues(parameters: MeshDistanceMaterialParameters): scala.Unit = js.native
}

