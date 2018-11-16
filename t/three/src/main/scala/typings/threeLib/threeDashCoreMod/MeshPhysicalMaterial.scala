package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "MeshPhysicalMaterial")
@js.native
class MeshPhysicalMaterial protected () extends MeshStandardMaterial {
  def this(parameters: MeshPhysicalMaterialParameters) = this()
  var clearCoat: scala.Double = js.native
  var clearCoatRoughness: scala.Double = js.native
  var reflectivity: scala.Double = js.native
}

