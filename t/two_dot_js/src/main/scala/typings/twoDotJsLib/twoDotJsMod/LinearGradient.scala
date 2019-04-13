package typings
package twoDotJsLib.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("two.js", "LinearGradient")
@js.native
class LinearGradient protected () extends _Color {
  def this(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, stops: js.Array[Stop]) = this()
  var left: Vector = js.native
  var right: Vector = js.native
  var spread: java.lang.String = js.native
  var stops: twoDotJsLib.twoDotJsMod.UtilsNs.Collection[Stop] = js.native
}

