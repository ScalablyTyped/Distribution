package typings.three.mod

import typings.std.AudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "AudioAnalyser")
@js.native
class AudioAnalyser protected ()
  extends typings.three.audioAnalyserMod.AudioAnalyser {
  def this(audio: typings.three.audioMod.Audio[AudioNode], fftSize: Double) = this()
}

