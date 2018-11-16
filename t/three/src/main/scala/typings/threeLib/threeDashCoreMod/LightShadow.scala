package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "LightShadow")
@js.native
class LightShadow protected () extends js.Object {
  def this(camera: Camera) = this()
  var bias: scala.Double = js.native
  var camera: Camera = js.native
  var map: RenderTarget = js.native
  var mapSize: Vector2 = js.native
  var matrix: Matrix4 = js.native
  var radius: scala.Double = js.native
  def clone(recursive: scala.Boolean): this.type = js.native
  def copy(source: this.type): this.type = js.native
  def toJSON(): js.Any = js.native
}

