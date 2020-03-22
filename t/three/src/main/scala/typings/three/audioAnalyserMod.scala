package typings.three

import typings.std.AnalyserNode
import typings.std.AudioNode
import typings.std.Uint8Array
import typings.three.audioMod.Audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/audio/AudioAnalyser", JSImport.Namespace)
@js.native
object audioAnalyserMod extends js.Object {
  @js.native
  class AudioAnalyser protected () extends js.Object {
    def this(audio: Audio[AudioNode], fftSize: Double) = this()
    var analyser: AnalyserNode = js.native
    var data: Uint8Array = js.native
    def getAverageFrequency(): Double = js.native
    /**
    	 * @deprecated Use {@link AudioAnalyser#getFrequencyData .getFrequencyData()} instead.
    	 */
    def getData(file: js.Any): js.Any = js.native
    def getFrequencyData(): Uint8Array = js.native
  }
  
}

