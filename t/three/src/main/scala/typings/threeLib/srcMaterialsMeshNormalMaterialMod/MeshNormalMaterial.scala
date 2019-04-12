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
  var morphTargets: scala.Boolean = js.native
  var wireframe: scala.Boolean = js.native
  var wireframeLinewidth: scala.Double = js.native
  def setValues(parameters: MeshNormalMaterialParameters): scala.Unit = js.native
}

