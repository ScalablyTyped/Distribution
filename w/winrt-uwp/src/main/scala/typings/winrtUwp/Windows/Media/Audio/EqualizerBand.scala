package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an equalizer band for the equalizer effect. */
@js.native
trait EqualizerBand extends js.Object {
  /** Gets or sets the bandwidth for the equalizer band. */
  var bandwidth: Double = js.native
  /** Gets or sets the frequency center for the equalizer band. */
  var frequencyCenter: Double = js.native
  /** Gets or sets the gain for the equalizer band. */
  var gain: Double = js.native
}

object EqualizerBand {
  @scala.inline
  def apply(bandwidth: Double, frequencyCenter: Double, gain: Double): EqualizerBand = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], frequencyCenter = frequencyCenter.asInstanceOf[js.Any], gain = gain.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqualizerBand]
  }
  @scala.inline
  implicit class EqualizerBandOps[Self <: EqualizerBand] (val x: Self) extends AnyVal {
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
    def setBandwidth(value: Double): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrequencyCenter(value: Double): Self = this.set("frequencyCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setGain(value: Double): Self = this.set("gain", value.asInstanceOf[js.Any])
  }
  
}

