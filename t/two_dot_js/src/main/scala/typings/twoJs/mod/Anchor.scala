package typings.twoJs.mod

import typings.twoJs.AnonLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("two.js", "Anchor")
@js.native
class Anchor protected () extends Vector {
  def this(x: Double, y: Double, lx: Double, ly: Double, rx: Double, ry: Double, command: String) = this()
  def this(x: Double, y: Double, lx: Double, ly: Double, rx: Double, ry: Double, command: Commands) = this()
  var command: String = js.native
  var controls: js.UndefOr[AnonLeft] = js.native
  def ignore(): this.type = js.native
  def listen(): this.type = js.native
}

/* static members */
@JSImport("two.js", "Anchor")
@js.native
object Anchor extends js.Object {
  def AppendCurveProperties(): Unit = js.native
}

