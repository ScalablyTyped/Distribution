package typings.tensorflowTfjsData.testUtilsMod

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FakeAnalyser extends js.Object {
  
  def disconnect(): Unit = js.native
  
  var fftSize: Double = js.native
  
  def getFloatFrequencyData(data: Float32Array): Unit = js.native
  
  def getFloatTimeDomainData(data: Float32Array): Unit = js.native
  
  var smoothingTimeConstant: Double = js.native
  
  var x: js.Any = js.native
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
  
  @scala.inline
  implicit class FakeAnalyserOps[Self <: FakeAnalyser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFftSize(value: Double): Self = this.set("fftSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFloatFrequencyData(value: Float32Array => Unit): Self = this.set("getFloatFrequencyData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFloatTimeDomainData(value: Float32Array => Unit): Self = this.set("getFloatTimeDomainData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSmoothingTimeConstant(value: Double): Self = this.set("smoothingTimeConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: js.Any): Self = this.set("x", value.asInstanceOf[js.Any])
  }
}
