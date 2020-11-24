package typings.winrtUwp.global.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an echo effect definition supported by the audio graph. */
@JSGlobal("Windows.Media.Audio.EchoEffectDefinition")
@js.native
class EchoEffectDefinition protected ()
  extends typings.winrtUwp.Windows.Media.Audio.EchoEffectDefinition {
  /**
    * Creates an EchoEffectDefinition object.
    * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
    */
  def this(audioGraph: typings.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
}
