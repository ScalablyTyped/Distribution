package typings.voiceActivityDetection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceActivityDetectionOptions extends js.Object {
  
  var avgNoiseMultiplier: js.UndefOr[Double] = js.native
  
  var bufferLen: js.UndefOr[Double] = js.native
  
  var fftSize: js.UndefOr[Double] = js.native
  
  var maxCaptureFreq: js.UndefOr[Double] = js.native
  
  var maxNoiseLevel: js.UndefOr[Double] = js.native
  
  var minCaptureFreq: js.UndefOr[Double] = js.native
  
  var minNoiseLevel: js.UndefOr[Double] = js.native
  
  var noiseCaptureDuration: js.UndefOr[Double] = js.native
  
  var onUpdate: js.UndefOr[js.Function1[/* val */ Double, Unit]] = js.native
  
  var onVoiceStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onVoiceStop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var smoothingTimeConstant: js.UndefOr[Double] = js.native
}
object VoiceActivityDetectionOptions {
  
  @scala.inline
  def apply(): VoiceActivityDetectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceActivityDetectionOptions]
  }
  
  @scala.inline
  implicit class VoiceActivityDetectionOptionsOps[Self <: VoiceActivityDetectionOptions] (val x: Self) extends AnyVal {
    
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
    def setAvgNoiseMultiplier(value: Double): Self = this.set("avgNoiseMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvgNoiseMultiplier: Self = this.set("avgNoiseMultiplier", js.undefined)
    
    @scala.inline
    def setBufferLen(value: Double): Self = this.set("bufferLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferLen: Self = this.set("bufferLen", js.undefined)
    
    @scala.inline
    def setFftSize(value: Double): Self = this.set("fftSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFftSize: Self = this.set("fftSize", js.undefined)
    
    @scala.inline
    def setMaxCaptureFreq(value: Double): Self = this.set("maxCaptureFreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCaptureFreq: Self = this.set("maxCaptureFreq", js.undefined)
    
    @scala.inline
    def setMaxNoiseLevel(value: Double): Self = this.set("maxNoiseLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNoiseLevel: Self = this.set("maxNoiseLevel", js.undefined)
    
    @scala.inline
    def setMinCaptureFreq(value: Double): Self = this.set("minCaptureFreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCaptureFreq: Self = this.set("minCaptureFreq", js.undefined)
    
    @scala.inline
    def setMinNoiseLevel(value: Double): Self = this.set("minNoiseLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinNoiseLevel: Self = this.set("minNoiseLevel", js.undefined)
    
    @scala.inline
    def setNoiseCaptureDuration(value: Double): Self = this.set("noiseCaptureDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoiseCaptureDuration: Self = this.set("noiseCaptureDuration", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: /* val */ Double => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setOnVoiceStart(value: () => Unit): Self = this.set("onVoiceStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnVoiceStart: Self = this.set("onVoiceStart", js.undefined)
    
    @scala.inline
    def setOnVoiceStop(value: () => Unit): Self = this.set("onVoiceStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnVoiceStop: Self = this.set("onVoiceStop", js.undefined)
    
    @scala.inline
    def setSmoothingTimeConstant(value: Double): Self = this.set("smoothingTimeConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmoothingTimeConstant: Self = this.set("smoothingTimeConstant", js.undefined)
  }
}
