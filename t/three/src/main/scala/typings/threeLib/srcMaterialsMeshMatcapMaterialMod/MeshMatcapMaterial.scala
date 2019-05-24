package typings
package threeLib.srcMaterialsMeshMatcapMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshMatcapMaterial", "MeshMatcapMaterial")
@js.native
class MeshMatcapMaterial ()
  extends threeLib.srcMaterialsMaterialMod.Material {
  def this(parameters: MeshMatcapMaterialParameters) = this()
  var alphaMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var bumpMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var bumpScale: scala.Double = js.native
  var color: threeLib.srcMathColorMod.Color = js.native
  var displacementBias: scala.Double = js.native
  var displacementMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var displacementScale: scala.Double = js.native
  var map: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var matMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var morphNormals: scala.Boolean = js.native
  var morphTargets: scala.Boolean = js.native
  var normalMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var normalMapType: threeLib.srcConstantsMod.NormalMapTypes = js.native
  var normalScale: threeLib.srcMathVector2Mod.Vector2 = js.native
  var skinning: scala.Boolean = js.native
  def setValues(parameters: MeshMatcapMaterialParameters): scala.Unit = js.native
}

