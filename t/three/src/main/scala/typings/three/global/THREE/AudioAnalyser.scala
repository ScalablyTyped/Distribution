package typings.three.global.THREE

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.AudioAnalyser")
@js.native
class AudioAnalyser protected ()
  extends typings.three.mod.AudioAnalyser {
  /**
  	 * @param audio
  	 * @param [fftSize=2048]
  	 */
  def this(audio: typings.three.audioMod.Audio[AudioNode]) = this()
  def this(audio: typings.three.audioMod.Audio[AudioNode], fftSize: Double) = this()
}
