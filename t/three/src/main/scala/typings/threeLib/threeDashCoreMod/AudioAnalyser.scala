package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "AudioAnalyser")
@js.native
class AudioAnalyser protected () extends js.Object {
  def this(audio: js.Any, fftSize: scala.Double) = this()
  var analyser: js.Any = js.native
  var data: stdLib.Uint8Array = js.native
  def getAverageFrequency(): scala.Double = js.native
  /**
    * @deprecated Use {@link AudioAnalyser#getFrequencyData .getFrequencyData()} instead.
    */
  def getData(file: js.Any): js.Any = js.native
  def getFrequencyData(): stdLib.Uint8Array = js.native
}

