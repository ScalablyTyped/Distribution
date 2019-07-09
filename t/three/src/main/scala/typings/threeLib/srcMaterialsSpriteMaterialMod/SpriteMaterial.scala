package typings
package threeLib.srcMaterialsSpriteMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/SpriteMaterial", "SpriteMaterial")
@js.native
class SpriteMaterial ()
  extends threeLib.srcMaterialsMaterialMod.Material {
  def this(parameters: SpriteMaterialParameters) = this()
  var color: threeLib.srcMathColorMod.Color = js.native
  var isSpriteMaterial: threeLib.threeLibNumbers.`true` = js.native
  var map: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var rotation: scala.Double = js.native
  var sizeAttenuation: scala.Boolean = js.native
  def copy(source: SpriteMaterial): this.type = js.native
  def setValues(parameters: SpriteMaterialParameters): scala.Unit = js.native
}

