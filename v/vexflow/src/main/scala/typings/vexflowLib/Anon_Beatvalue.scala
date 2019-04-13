package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Beatvalue extends js.Object {
  var beat_value: js.UndefOr[scala.Double] = js.undefined
  var num_beats: js.UndefOr[scala.Double] = js.undefined
  var resolution: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Beatvalue {
  @scala.inline
  def apply(
    beat_value: scala.Int | scala.Double = null,
    num_beats: scala.Int | scala.Double = null,
    resolution: scala.Int | scala.Double = null
  ): Anon_Beatvalue = {
    val __obj = js.Dynamic.literal()
    if (beat_value != null) __obj.updateDynamic("beat_value")(beat_value.asInstanceOf[js.Any])
    if (num_beats != null) __obj.updateDynamic("num_beats")(num_beats.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Beatvalue]
  }
}

