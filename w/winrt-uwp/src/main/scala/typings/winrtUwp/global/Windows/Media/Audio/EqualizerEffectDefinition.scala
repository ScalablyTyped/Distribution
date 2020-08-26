package typings.winrtUwp.global.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an equalizer effect definition supported by the audio graph. */
@JSGlobal("Windows.Media.Audio.EqualizerEffectDefinition")
@js.native
class EqualizerEffectDefinition protected ()
  extends typings.winrtUwp.Windows.Media.Audio.EqualizerEffectDefinition {
  /**
    * Initializes a new instance of the EqualizerEffectDefinition class.
    * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
    */
  def this(audioGraph: typings.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
}

