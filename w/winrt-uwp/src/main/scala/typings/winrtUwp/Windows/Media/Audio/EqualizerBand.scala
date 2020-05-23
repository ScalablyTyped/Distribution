package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an equalizer band for the equalizer effect. */
trait EqualizerBand extends js.Object {
  /** Gets or sets the bandwidth for the equalizer band. */
  var bandwidth: Double
  /** Gets or sets the frequency center for the equalizer band. */
  var frequencyCenter: Double
  /** Gets or sets the gain for the equalizer band. */
  var gain: Double
}

object EqualizerBand {
  @scala.inline
  def apply(bandwidth: Double, frequencyCenter: Double, gain: Double): EqualizerBand = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], frequencyCenter = frequencyCenter.asInstanceOf[js.Any], gain = gain.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqualizerBand]
  }
}

