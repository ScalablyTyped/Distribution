package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyserNode extends AudioNode {
  var fftSize: scala.Double = js.native
  val frequencyBinCount: scala.Double = js.native
  var maxDecibels: scala.Double = js.native
  var minDecibels: scala.Double = js.native
  var smoothingTimeConstant: scala.Double = js.native
  def getByteFrequencyData(array: stdLib.Uint8Array): scala.Unit = js.native
  def getByteTimeDomainData(array: stdLib.Uint8Array): scala.Unit = js.native
  def getFloatFrequencyData(array: stdLib.Float32Array): scala.Unit = js.native
  def getFloatTimeDomainData(array: stdLib.Float32Array): scala.Unit = js.native
}

@JSGlobal("AnalyserNode")
@js.native
object AnalyserNode
  extends ScalablyTyped.runtime.Instantiable1[/* context */ BaseAudioContext, AnalyserNode]
     with ScalablyTyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ AnalyserOptions, AnalyserNode]

