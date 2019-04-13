package typings
package twoDotJsLib.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("two.js", "RadialGradient")
@js.native
class RadialGradient protected () extends _Color {
  def this(x: scala.Double, y: scala.Double, radius: scala.Double, stops: js.Array[Stop]) = this()
  def this(x: scala.Double, y: scala.Double, radius: scala.Double, stops: js.Array[Stop], fx: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, radius: scala.Double, stops: js.Array[Stop], fx: scala.Double, fy: scala.Double) = this()
  var center: Vector = js.native
  var focal: Vector = js.native
  var radius: scala.Double = js.native
  var spread: java.lang.String = js.native
  var stops: twoDotJsLib.twoDotJsMod.UtilsNs.Collection[Stop] = js.native
}

