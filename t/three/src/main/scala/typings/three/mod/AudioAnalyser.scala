package typings.three.mod

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "AudioAnalyser")
@js.native
open class AudioAnalyser protected ()
  extends typings.three.srcThreeMod.AudioAnalyser {
  /**
    * @param audio
    * @param [fftSize=2048]
    */
  def this(audio: typings.three.srcAudioAudioMod.Audio[AudioNode]) = this()
  def this(audio: typings.three.srcAudioAudioMod.Audio[AudioNode], fftSize: Double) = this()
}
