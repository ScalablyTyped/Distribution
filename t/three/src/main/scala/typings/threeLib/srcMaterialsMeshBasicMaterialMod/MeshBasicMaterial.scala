package typings
package threeLib.srcMaterialsMeshBasicMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshBasicMaterial", "MeshBasicMaterial")
@js.native
class MeshBasicMaterial ()
  extends threeLib.srcMaterialsMaterialMod.Material {
  def this(parameters: MeshBasicMaterialParameters) = this()
  var alphaMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var aoMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var aoMapIntensity: scala.Double = js.native
  var color: threeLib.srcMathColorMod.Color = js.native
  var combine: threeLib.srcConstantsMod.Combine = js.native
  var envMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var map: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var morphTargets: scala.Boolean = js.native
  var reflectivity: scala.Double = js.native
  var refractionRatio: scala.Double = js.native
  var skinning: scala.Boolean = js.native
  var specularMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var wireframe: scala.Boolean = js.native
  var wireframeLinecap: java.lang.String = js.native
  var wireframeLinejoin: java.lang.String = js.native
  var wireframeLinewidth: scala.Double = js.native
  def setValues(parameters: MeshBasicMaterialParameters): scala.Unit = js.native
}

