package typings.winrtDashUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an equalizer band for the equalizer effect. */
@JSGlobal("Windows.Media.Audio.EqualizerBand")
@js.native
abstract class EqualizerBand () extends js.Object {
  /** Gets or sets the bandwidth for the equalizer band. */
  var bandwidth: Double = js.native
  /** Gets or sets the frequency center for the equalizer band. */
  var frequencyCenter: Double = js.native
  /** Gets or sets the gain for the equalizer band. */
  var gain: Double = js.native
}

