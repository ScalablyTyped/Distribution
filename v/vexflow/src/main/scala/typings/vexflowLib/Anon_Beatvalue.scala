package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Beatvalue extends js.Object {
  var beat_value: scala.Double
  var num_beats: scala.Double
  var resolution: scala.Double
}

object Anon_Beatvalue {
  @scala.inline
  def apply(beat_value: scala.Double, num_beats: scala.Double, resolution: scala.Double): Anon_Beatvalue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beat_value")(beat_value)
    __obj.updateDynamic("num_beats")(num_beats)
    __obj.updateDynamic("resolution")(resolution)
    __obj.asInstanceOf[Anon_Beatvalue]
  }
}

