package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOctaveshift extends js.Object {
  var octave_shift: js.UndefOr[Double] = js.undefined
}

object AnonOctaveshift {
  @scala.inline
  def apply(octave_shift: Int | Double = null): AnonOctaveshift = {
    val __obj = js.Dynamic.literal()
    if (octave_shift != null) __obj.updateDynamic("octave_shift")(octave_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOctaveshift]
  }
}

