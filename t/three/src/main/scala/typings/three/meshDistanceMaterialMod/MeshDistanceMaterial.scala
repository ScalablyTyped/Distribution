package typings.three.meshDistanceMaterialMod

import typings.three.materialMod.Material
import typings.three.textureMod.Texture
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshDistanceMaterial", "MeshDistanceMaterial")
@js.native
class MeshDistanceMaterial () extends Material {
  def this(parameters: MeshDistanceMaterialParameters) = this()
  var alphaMap: Texture | Null = js.native
  var displacementBias: Double = js.native
  var displacementMap: Texture | Null = js.native
  var displacementScale: Double = js.native
  var farDistance: Double = js.native
  var map: Texture | Null = js.native
  var nearDistance: Double = js.native
  var referencePosition: Vector3 = js.native
  def setValues(parameters: MeshDistanceMaterialParameters): Unit = js.native
}

