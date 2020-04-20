package typings.tensorflowTfjsData.testUtilsMod

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeAnalyser extends js.Object {
  var fftSize: Double
  var smoothingTimeConstant: Double
  var x: js.Any
  def disconnect(): Unit
  def getFloatFrequencyData(data: Float32Array): Unit
  def getFloatTimeDomainData(data: Float32Array): Unit
}

object FakeAnalyser {
  @scala.inline
  def apply(
    disconnect: () => Unit,
    fftSize: Double,
    getFloatFrequencyData: Float32Array => Unit,
    getFloatTimeDomainData: Float32Array => Unit,
    smoothingTimeConstant: Double,
    x: js.Any
  ): FakeAnalyser = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), fftSize = fftSize.asInstanceOf[js.Any], getFloatFrequencyData = js.Any.fromFunction1(getFloatFrequencyData), getFloatTimeDomainData = js.Any.fromFunction1(getFloatTimeDomainData), smoothingTimeConstant = smoothingTimeConstant.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[FakeAnalyser]
  }
}

