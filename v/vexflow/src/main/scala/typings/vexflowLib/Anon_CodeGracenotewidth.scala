package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeGracenotewidth extends js.Object {
  var code: java.lang.String
  var gracenote_width: scala.Double
  var shift_down: scala.Double
  var shift_right: scala.Double
  var width: scala.Double
}

object Anon_CodeGracenotewidth {
  @scala.inline
  def apply(
    code: java.lang.String,
    gracenote_width: scala.Double,
    shift_down: scala.Double,
    shift_right: scala.Double,
    width: scala.Double
  ): Anon_CodeGracenotewidth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("gracenote_width")(gracenote_width)
    __obj.updateDynamic("shift_down")(shift_down)
    __obj.updateDynamic("shift_right")(shift_right)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_CodeGracenotewidth]
  }
}

