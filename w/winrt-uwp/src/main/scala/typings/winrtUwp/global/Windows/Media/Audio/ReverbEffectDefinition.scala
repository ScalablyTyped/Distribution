package typings.winrtUwp.global.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reverberation effect definition supported by the audio graph. */
@JSGlobal("Windows.Media.Audio.ReverbEffectDefinition")
@js.native
class ReverbEffectDefinition protected ()
  extends typings.winrtUwp.Windows.Media.Audio.ReverbEffectDefinition {
  /**
    * Initializes a new instance of the ReverbffectDefinition class.
    * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
    */
  def this(audioGraph: typings.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
}
