package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Octaveshift extends js.Object {
  var octave_shift: js.UndefOr[Double] = js.native
}

object Octaveshift {
  @scala.inline
  def apply(): Octaveshift = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Octaveshift]
  }
  @scala.inline
  implicit class OctaveshiftOps[Self <: Octaveshift] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOctave_shift(value: Double): Self = this.set("octave_shift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOctave_shift: Self = this.set("octave_shift", js.undefined)
  }
  
}

