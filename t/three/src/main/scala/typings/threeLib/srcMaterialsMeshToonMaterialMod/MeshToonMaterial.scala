package typings
package threeLib.srcMaterialsMeshToonMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshToonMaterial", "MeshToonMaterial")
@js.native
class MeshToonMaterial ()
  extends threeLib.srcMaterialsMeshPhongMaterialMod.MeshPhongMaterial {
  def this(parameters: MeshToonMaterialParameters) = this()
  var gradientMap: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  def setValues(parameters: MeshToonMaterialParameters): scala.Unit = js.native
}

