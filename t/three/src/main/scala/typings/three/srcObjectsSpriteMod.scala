package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialsMod.SpriteMaterial
import typings.three.srcMathVector2Mod.Vector2
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Sprite", JSImport.Namespace)
@js.native
object srcObjectsSpriteMod extends js.Object {
  @js.native
  class Sprite () extends Object3D {
    def this(material: SpriteMaterial) = this()
    var center: Vector2 = js.native
    var geometry: BufferGeometry = js.native
    var isSprite: `true` = js.native
    var material: SpriteMaterial = js.native
    @JSName("type")
    var type_Sprite: typings.three.threeStrings.Sprite = js.native
  }
  
}

