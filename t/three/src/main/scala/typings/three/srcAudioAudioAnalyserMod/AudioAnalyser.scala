package typings.three.srcAudioAudioAnalyserMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/audio/AudioAnalyser", "AudioAnalyser")
@js.native
class AudioAnalyser protected () extends js.Object {
  def this(audio: js.Any, fftSize: Double) = this()
  var analyser: js.Any = js.native
  var data: Uint8Array = js.native
  def getAverageFrequency(): Double = js.native
  /**
  	 * @deprecated Use {@link AudioAnalyser#getFrequencyData .getFrequencyData()} instead.
  	 */
  def getData(file: js.Any): js.Any = js.native
  def getFrequencyData(): Uint8Array = js.native
}

