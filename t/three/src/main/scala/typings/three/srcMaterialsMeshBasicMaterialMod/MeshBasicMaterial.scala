package typings.three.srcMaterialsMeshBasicMaterialMod

import typings.three.srcConstantsMod.Combine
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.Color
import typings.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshBasicMaterial", "MeshBasicMaterial")
@js.native
class MeshBasicMaterial () extends Material {
  def this(parameters: MeshBasicMaterialParameters) = this()
  var alphaMap: Texture | Null = js.native
  var aoMap: Texture | Null = js.native
  var aoMapIntensity: Double = js.native
  var color: Color = js.native
  var combine: Combine = js.native
  var envMap: Texture | Null = js.native
  var map: Texture | Null = js.native
  var morphTargets: Boolean = js.native
  var reflectivity: Double = js.native
  var refractionRatio: Double = js.native
  var skinning: Boolean = js.native
  var specularMap: Texture | Null = js.native
  var wireframe: Boolean = js.native
  var wireframeLinecap: String = js.native
  var wireframeLinejoin: String = js.native
  var wireframeLinewidth: Double = js.native
  def setValues(parameters: MeshBasicMaterialParameters): Unit = js.native
}

