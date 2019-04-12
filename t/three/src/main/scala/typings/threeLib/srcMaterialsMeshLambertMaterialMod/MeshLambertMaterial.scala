package typings
package threeLib.srcMaterialsMeshLambertMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshLambertMaterial", "MeshLambertMaterial")
@js.native
class MeshLambertMaterial ()
  extends threeLib.srcMaterialsMaterialMod.Material {
  def this(parameters: MeshLambertMaterialParameters) = this()
  var alphaMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var aoMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var aoMapIntensity: scala.Double = js.native
  var color: threeLib.srcMathColorMod.Color = js.native
  var combine: threeLib.srcConstantsMod.Combine = js.native
  var emissive: threeLib.srcMathColorMod.Color = js.native
  var emissiveIntensity: scala.Double = js.native
  var emissiveMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var envMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var lightMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var lightMapIntensity: scala.Double = js.native
  var map: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var morphNormals: scala.Boolean = js.native
  var morphTargets: scala.Boolean = js.native
  var reflectivity: scala.Double = js.native
  var refractionRatio: scala.Double = js.native
  var skinning: scala.Boolean = js.native
  var specularMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var wireframe: scala.Boolean = js.native
  var wireframeLinecap: java.lang.String = js.native
  var wireframeLinejoin: java.lang.String = js.native
  var wireframeLinewidth: scala.Double = js.native
  def setValues(parameters: MeshLambertMaterialParameters): scala.Unit = js.native
}

