package typings
package threeLib.srcMaterialsMeshNormalMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshNormalMaterial", "MeshNormalMaterial")
@js.native
class MeshNormalMaterial ()
  extends threeLib.srcMaterialsMaterialMod.Material {
  def this(parameters: MeshNormalMaterialParameters) = this()
  var bumpMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var bumpScale: scala.Double = js.native
  var displacementBias: scala.Double = js.native
  var displacementMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var displacementScale: scala.Double = js.native
  var morphNormals: scala.Boolean = js.native
  var morphTargets: scala.Boolean = js.native
  var normalMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var normalMapType: threeLib.srcConstantsMod.NormalMapTypes = js.native
  var normalScale: threeLib.srcMathVector2Mod.Vector2 = js.native
  var skinning: scala.Boolean = js.native
  var wireframe: scala.Boolean = js.native
  var wireframeLinewidth: scala.Double = js.native
  def setValues(parameters: MeshNormalMaterialParameters): scala.Unit = js.native
}

