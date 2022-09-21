package typings.three.threeMod

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "AudioAnalyser")
@js.native
open class AudioAnalyser protected ()
  extends typings.three.audioAnalyserMod.AudioAnalyser {
  /**
    * @param audio
    * @param [fftSize=2048]
    */
  def this(audio: typings.three.audioMod.Audio[AudioNode]) = this()
  def this(audio: typings.three.audioMod.Audio[AudioNode], fftSize: Double) = this()
}
