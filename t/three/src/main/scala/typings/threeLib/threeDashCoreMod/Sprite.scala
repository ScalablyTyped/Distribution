package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Sprite")
@js.native
class Sprite () extends Object3D {
  def this(material: Material) = this()
  var center: Vector2 = js.native
  var isSprite: threeLib.threeLibNumbers.`true` = js.native
  var material: Material = js.native
  @JSName("type")
  var type_Sprite: threeLib.threeLibStrings.Sprite = js.native
  def copy(source: this.type): this.type = js.native
  def copy(source: this.type, recursive: scala.Boolean): this.type = js.native
}

