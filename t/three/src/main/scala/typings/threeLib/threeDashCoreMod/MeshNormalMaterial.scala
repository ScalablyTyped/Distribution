package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "MeshNormalMaterial")
@js.native
class MeshNormalMaterial () extends Material {
  def this(parameters: MeshNormalMaterialParameters) = this()
  var morphTargets: scala.Boolean = js.native
  var wireframe: scala.Boolean = js.native
  var wireframeLinewidth: scala.Double = js.native
  def setValues(parameters: MeshNormalMaterialParameters): scala.Unit = js.native
}

