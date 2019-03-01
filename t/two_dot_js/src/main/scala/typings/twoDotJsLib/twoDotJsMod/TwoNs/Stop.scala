package typings
package twoDotJsLib.twoDotJsMod.TwoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stop extends js.Object {
  var color: java.lang.String
  var offset: scala.Double
  var opacity: scala.Double
}

object Stop {
  @scala.inline
  def apply(clone: js.Function0[Stop], color: java.lang.String, offset: scala.Double, opacity: scala.Double): Stop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[Stop]
  }
}

