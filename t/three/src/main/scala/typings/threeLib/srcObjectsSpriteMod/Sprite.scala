package typings
package threeLib.srcObjectsSpriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Sprite", "Sprite")
@js.native
class Sprite ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  def this(material: threeLib.srcMaterialsMaterialsMod.SpriteMaterial) = this()
  var center: threeLib.srcMathVector2Mod.Vector2 = js.native
  var geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry = js.native
  var isSprite: threeLib.threeLibNumbers.`true` = js.native
  var material: threeLib.srcMaterialsMaterialsMod.SpriteMaterial = js.native
  @JSName("type")
  var type_Sprite: threeLib.threeLibStrings.Sprite = js.native
  def copy(source: this.type): this.type = js.native
}

