package typings
package twoDotJsLib.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("two.js", "Anchor")
@js.native
class Anchor protected () extends Vector {
  def this(x: scala.Double, y: scala.Double, lx: scala.Double, ly: scala.Double, rx: scala.Double, ry: scala.Double, command: java.lang.String) = this()
  def this(x: scala.Double, y: scala.Double, lx: scala.Double, ly: scala.Double, rx: scala.Double, ry: scala.Double, command: Commands) = this()
  var command: java.lang.String = js.native
  var controls: js.UndefOr[twoDotJsLib.Anon_Left] = js.native
  def ignore(): this.type = js.native
  def listen(): this.type = js.native
}

/* static members */
@JSImport("two.js", "Anchor")
@js.native
object Anchor extends js.Object {
  def AppendCurveProperties(): scala.Unit = js.native
}

