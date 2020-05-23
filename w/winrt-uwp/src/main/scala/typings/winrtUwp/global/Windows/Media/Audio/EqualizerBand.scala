package typings.winrtUwp.global.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an equalizer band for the equalizer effect. */
@JSGlobal("Windows.Media.Audio.EqualizerBand")
@js.native
abstract class EqualizerBand ()
  extends typings.winrtUwp.Windows.Media.Audio.EqualizerBand {
  /** Gets or sets the bandwidth for the equalizer band. */
  /* CompleteClass */
  override var bandwidth: Double = js.native
  /** Gets or sets the frequency center for the equalizer band. */
  /* CompleteClass */
  override var frequencyCenter: Double = js.native
  /** Gets or sets the gain for the equalizer band. */
  /* CompleteClass */
  override var gain: Double = js.native
}

