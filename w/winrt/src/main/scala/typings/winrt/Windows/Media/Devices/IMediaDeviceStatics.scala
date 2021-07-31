package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMediaDeviceStatics extends StObject {
  
  def getAudioCaptureSelector(): String
  
  def getAudioRenderSelector(): String
  
  def getDefaultAudioCaptureId(role: AudioDeviceRole): String
  
  def getDefaultAudioRenderId(role: AudioDeviceRole): String
  
  def getVideoCaptureSelector(): String
  
  var ondefaultaudiocapturedevicechanged: js.Any
  
  var ondefaultaudiorenderdevicechanged: js.Any
}
object IMediaDeviceStatics {
  
  @scala.inline
  def apply(
    getAudioCaptureSelector: () => String,
    getAudioRenderSelector: () => String,
    getDefaultAudioCaptureId: AudioDeviceRole => String,
    getDefaultAudioRenderId: AudioDeviceRole => String,
    getVideoCaptureSelector: () => String,
    ondefaultaudiocapturedevicechanged: js.Any,
    ondefaultaudiorenderdevicechanged: js.Any
  ): IMediaDeviceStatics = {
    val __obj = js.Dynamic.literal(getAudioCaptureSelector = js.Any.fromFunction0(getAudioCaptureSelector), getAudioRenderSelector = js.Any.fromFunction0(getAudioRenderSelector), getDefaultAudioCaptureId = js.Any.fromFunction1(getDefaultAudioCaptureId), getDefaultAudioRenderId = js.Any.fromFunction1(getDefaultAudioRenderId), getVideoCaptureSelector = js.Any.fromFunction0(getVideoCaptureSelector), ondefaultaudiocapturedevicechanged = ondefaultaudiocapturedevicechanged.asInstanceOf[js.Any], ondefaultaudiorenderdevicechanged = ondefaultaudiorenderdevicechanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaDeviceStatics]
  }
  
  @scala.inline
  implicit class IMediaDeviceStaticsMutableBuilder[Self <: IMediaDeviceStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAudioCaptureSelector(value: () => String): Self = StObject.set(x, "getAudioCaptureSelector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAudioRenderSelector(value: () => String): Self = StObject.set(x, "getAudioRenderSelector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultAudioCaptureId(value: AudioDeviceRole => String): Self = StObject.set(x, "getDefaultAudioCaptureId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefaultAudioRenderId(value: AudioDeviceRole => String): Self = StObject.set(x, "getDefaultAudioRenderId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVideoCaptureSelector(value: () => String): Self = StObject.set(x, "getVideoCaptureSelector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOndefaultaudiocapturedevicechanged(value: js.Any): Self = StObject.set(x, "ondefaultaudiocapturedevicechanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndefaultaudiorenderdevicechanged(value: js.Any): Self = StObject.set(x, "ondefaultaudiorenderdevicechanged", value.asInstanceOf[js.Any])
  }
}
