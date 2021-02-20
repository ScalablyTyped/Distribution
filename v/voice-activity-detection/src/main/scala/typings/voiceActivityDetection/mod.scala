package typings.voiceActivityDetection

import typings.std.AudioContext
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("voice-activity-detection", JSImport.Namespace)
  @js.native
  def apply(audioContext: AudioContext, stream: MediaStream): Unit = js.native
  @JSImport("voice-activity-detection", JSImport.Namespace)
  @js.native
  def apply(audioContext: AudioContext, stream: MediaStream, options: VoiceActivityDetectionOptions): Unit = js.native
  
  @js.native
  trait VoiceActivityDetectionOptions extends StObject {
    
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
    implicit class VoiceActivityDetectionOptionsMutableBuilder[Self <: VoiceActivityDetectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvgNoiseMultiplier(value: Double): Self = StObject.set(x, "avgNoiseMultiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvgNoiseMultiplierUndefined: Self = StObject.set(x, "avgNoiseMultiplier", js.undefined)
      
      @scala.inline
      def setBufferLen(value: Double): Self = StObject.set(x, "bufferLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferLenUndefined: Self = StObject.set(x, "bufferLen", js.undefined)
      
      @scala.inline
      def setFftSize(value: Double): Self = StObject.set(x, "fftSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFftSizeUndefined: Self = StObject.set(x, "fftSize", js.undefined)
      
      @scala.inline
      def setMaxCaptureFreq(value: Double): Self = StObject.set(x, "maxCaptureFreq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCaptureFreqUndefined: Self = StObject.set(x, "maxCaptureFreq", js.undefined)
      
      @scala.inline
      def setMaxNoiseLevel(value: Double): Self = StObject.set(x, "maxNoiseLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxNoiseLevelUndefined: Self = StObject.set(x, "maxNoiseLevel", js.undefined)
      
      @scala.inline
      def setMinCaptureFreq(value: Double): Self = StObject.set(x, "minCaptureFreq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCaptureFreqUndefined: Self = StObject.set(x, "minCaptureFreq", js.undefined)
      
      @scala.inline
      def setMinNoiseLevel(value: Double): Self = StObject.set(x, "minNoiseLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinNoiseLevelUndefined: Self = StObject.set(x, "minNoiseLevel", js.undefined)
      
      @scala.inline
      def setNoiseCaptureDuration(value: Double): Self = StObject.set(x, "noiseCaptureDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoiseCaptureDurationUndefined: Self = StObject.set(x, "noiseCaptureDuration", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* val */ Double => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setOnVoiceStart(value: () => Unit): Self = StObject.set(x, "onVoiceStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnVoiceStartUndefined: Self = StObject.set(x, "onVoiceStart", js.undefined)
      
      @scala.inline
      def setOnVoiceStop(value: () => Unit): Self = StObject.set(x, "onVoiceStop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnVoiceStopUndefined: Self = StObject.set(x, "onVoiceStop", js.undefined)
      
      @scala.inline
      def setSmoothingTimeConstant(value: Double): Self = StObject.set(x, "smoothingTimeConstant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothingTimeConstantUndefined: Self = StObject.set(x, "smoothingTimeConstant", js.undefined)
    }
  }
}
