package typings.three.meshNormalMaterialMod

import typings.three.constantsMod.NormalMapTypes
import typings.three.materialMod.Material
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/MeshNormalMaterial", "MeshNormalMaterial")
@js.native
class MeshNormalMaterial () extends Material {
  def this(parameters: MeshNormalMaterialParameters) = this()
  var bumpMap: Texture | Null = js.native
  var bumpScale: Double = js.native
  var displacementBias: Double = js.native
  var displacementMap: Texture | Null = js.native
  var displacementScale: Double = js.native
  var morphNormals: Boolean = js.native
  var morphTargets: Boolean = js.native
  var normalMap: Texture | Null = js.native
  var normalMapType: NormalMapTypes = js.native
  var normalScale: Vector2 = js.native
  var skinning: Boolean = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  def setValues(parameters: MeshNormalMaterialParameters): Unit = js.native
}

