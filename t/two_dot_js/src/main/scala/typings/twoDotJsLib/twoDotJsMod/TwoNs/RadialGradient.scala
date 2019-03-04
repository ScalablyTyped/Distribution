package typings
package twoDotJsLib.twoDotJsMod.TwoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGradient extends _Color {
  var center: Vector
  var focal: Vector
  var radius: scala.Double
  var spread: java.lang.String
  var stops: twoDotJsLib.twoDotJsMod.TwoNs.UtilsNs.Collection[Stop]
}

object RadialGradient {
  @scala.inline
  def apply(
    center: Vector,
    clone: js.Function0[RadialGradient],
    focal: Vector,
    radius: scala.Double,
    spread: java.lang.String,
    stops: twoDotJsLib.twoDotJsMod.TwoNs.UtilsNs.Collection[Stop]
  ): RadialGradient = {
    val __obj = js.Dynamic.literal(center = center, clone = clone, focal = focal, radius = radius, spread = spread, stops = stops)
  
    __obj.asInstanceOf[RadialGradient]
  }
}

