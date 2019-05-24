package typings
package threeLib.srcMaterialsMeshDepthMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshDepthMaterial", "MeshDepthMaterial")
@js.native
class MeshDepthMaterial ()
  extends threeLib.srcMaterialsMaterialMod.Material {
  def this(parameters: MeshDepthMaterialParameters) = this()
  var depthPacking: threeLib.srcConstantsMod.DepthPackingStrategies = js.native
  var displacementBias: scala.Double = js.native
  var displacementMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var displacementScale: scala.Double = js.native
  var wireframe: scala.Boolean = js.native
  var wireframeLinewidth: scala.Double = js.native
  def setValues(parameters: MeshDepthMaterialParameters): scala.Unit = js.native
}

