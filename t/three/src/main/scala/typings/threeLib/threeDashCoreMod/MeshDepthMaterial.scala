package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "MeshDepthMaterial")
@js.native
class MeshDepthMaterial () extends Material {
  def this(parameters: MeshDepthMaterialParameters) = this()
  var depthPacking: DepthPackingStrategies = js.native
  var wireframe: scala.Boolean = js.native
  var wireframeLinewidth: scala.Double = js.native
  def setValues(parameters: MeshDepthMaterialParameters): scala.Unit = js.native
}

