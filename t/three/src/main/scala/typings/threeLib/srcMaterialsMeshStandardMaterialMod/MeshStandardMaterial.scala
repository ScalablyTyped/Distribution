package typings
package threeLib.srcMaterialsMeshStandardMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshStandardMaterial", "MeshStandardMaterial")
@js.native
class MeshStandardMaterial ()
  extends threeLib.srcMaterialsMaterialMod.Material {
  def this(parameters: MeshStandardMaterialParameters) = this()
  var alphaMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var aoMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var aoMapIntensity: scala.Double = js.native
  var bumpMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var bumpScale: scala.Double = js.native
  var color: threeLib.srcMathColorMod.Color = js.native
  var defines: js.Any = js.native
  var displacementBias: scala.Double = js.native
  var displacementMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var displacementScale: scala.Double = js.native
  var emissive: threeLib.srcMathColorMod.Color = js.native
  var emissiveIntensity: scala.Double = js.native
  var emissiveMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var envMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var envMapIntensity: scala.Double = js.native
  var lightMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var lightMapIntensity: scala.Double = js.native
  var map: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var metalness: scala.Double = js.native
  var metalnessMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var morphNormals: scala.Boolean = js.native
  var morphTargets: scala.Boolean = js.native
  var normalMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var normalScale: scala.Double = js.native
  var refractionRatio: scala.Double = js.native
  var roughness: scala.Double = js.native
  var roughnessMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var skinning: scala.Boolean = js.native
  var wireframe: scala.Boolean = js.native
  var wireframeLinewidth: scala.Double = js.native
  def setValues(parameters: MeshStandardMaterialParameters): scala.Unit = js.native
}

