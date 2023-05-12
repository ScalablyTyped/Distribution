package typings.three.buildThreeDotmoduleDotminMod

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module.min", "AudioAnalyser")
@js.native
open class AudioAnalyser protected ()
  extends typings.three.srcThreeMod.AudioAnalyser {
  /**
    * Create a new {@link {@link AudioAnalyser} | AudioAnalyser}.
    * @param audio
    * @param fftSize See {@link https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/fftSize | AnalyserNode.fftSize }. Expects a `unsigned integer`. Default `2048`.
    */
  def this(audio: typings.three.srcAudioAudioMod.Audio[AudioNode]) = this()
  def this(audio: typings.three.srcAudioAudioMod.Audio[AudioNode], fftSize: Double) = this()
}
