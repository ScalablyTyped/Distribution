package typings
package twoDotJsLib.twoDotJsMod.TwoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradient extends _Color {
  var left: Vector
  var right: Vector
  var spread: java.lang.String
  var stops: twoDotJsLib.twoDotJsMod.TwoNs.UtilsNs.Collection[Stop]
}

object LinearGradient {
  @scala.inline
  def apply(
    clone: () => LinearGradient,
    left: Vector,
    right: Vector,
    spread: java.lang.String,
    stops: twoDotJsLib.twoDotJsMod.TwoNs.UtilsNs.Collection[Stop]
  ): LinearGradient = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), left = left, right = right, spread = spread, stops = stops)
  
    __obj.asInstanceOf[LinearGradient]
  }
}

