package typings.three.meshPhysicalMaterialMod

import typings.three.colorMod.Color
import typings.three.meshStandardMaterialMod.MeshStandardMaterial
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshPhysicalMaterial", "MeshPhysicalMaterial")
@js.native
class MeshPhysicalMaterial protected () extends MeshStandardMaterial {
  def this(parameters: MeshPhysicalMaterialParameters) = this()
  var clearcoat: Double = js.native
  var clearcoatMap: Texture | Null = js.native
  var clearcoatNormalMap: Texture | Null = js.native
  var clearcoatNormalScale: Vector2 = js.native
  var clearcoatRoughness: Double = js.native
  var clearcoatRoughnessMap: Texture | Null = js.native
  var reflectivity: Double = js.native
  var sheen: Color | Null = js.native
  var transmission: Double = js.native
  var transmissionMap: Texture | Null = js.native
}

