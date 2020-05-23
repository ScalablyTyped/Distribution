package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Octaveshift extends js.Object {
  var octave_shift: js.UndefOr[Double] = js.undefined
}

object Octaveshift {
  @scala.inline
  def apply(octave_shift: js.UndefOr[Double] = js.undefined): Octaveshift = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(octave_shift)) __obj.updateDynamic("octave_shift")(octave_shift.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Octaveshift]
  }
}

