package typings.twoJs.mod

import typings.twoJs.mod.Utils.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("two.js", "LinearGradient")
@js.native
class LinearGradient protected () extends _Color {
  def this(x1: Double, y1: Double, x2: Double, y2: Double, stops: js.Array[Stop]) = this()
  var left: Vector = js.native
  var right: Vector = js.native
  var spread: String = js.native
  var stops: Collection[Stop] = js.native
}

