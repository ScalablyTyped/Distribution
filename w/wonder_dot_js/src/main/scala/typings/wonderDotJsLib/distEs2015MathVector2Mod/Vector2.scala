package typings
package wonderDotJsLib.distEs2015MathVector2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/math/Vector2", "Vector2")
@js.native
class Vector2 () extends js.Object {
  def this(x: js.Any, y: js.Any) = this()
  var values: stdLib.Float32Array = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def add(v: Vector2): this.type = js.native
  def isEqual(v: Vector2): scala.Boolean = js.native
  def mul(v: Vector2): this.type = js.native
  def set(x: scala.Double, y: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/math/Vector2", "Vector2")
@js.native
object Vector2 extends js.Object {
  def create(): wonderDotJsLib.distEs2015MathVector2Mod.Vector2 = js.native
  def create(x: js.Any, y: js.Any): wonderDotJsLib.distEs2015MathVector2Mod.Vector2 = js.native
}

