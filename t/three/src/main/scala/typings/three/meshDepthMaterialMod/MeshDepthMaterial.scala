package typings.three.meshDepthMaterialMod

import typings.three.constantsMod.DepthPackingStrategies
import typings.three.materialMod.Material
import typings.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshDepthMaterial", "MeshDepthMaterial")
@js.native
class MeshDepthMaterial () extends Material {
  def this(parameters: MeshDepthMaterialParameters) = this()
  var depthPacking: DepthPackingStrategies = js.native
  var displacementBias: Double = js.native
  var displacementMap: Texture | Null = js.native
  var displacementScale: Double = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  def setValues(parameters: MeshDepthMaterialParameters): Unit = js.native
}

