package typings.winrt.global.Windows.Media

import typings.winrt.Windows.Media.Devices.AudioDeviceRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Devices {
  
  @JSGlobal("Windows.Media.Devices.AudioDeviceController")
  @js.native
  class AudioDeviceController ()
    extends typings.winrt.Windows.Media.Devices.AudioDeviceController
  
  @JSGlobal("Windows.Media.Devices.AudioDeviceRole")
  @js.native
  object AudioDeviceRole extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Devices.AudioDeviceRole with Double] = js.native
    
    /* 0 */ val default: typings.winrt.Windows.Media.Devices.AudioDeviceRole.default with Double = js.native
    
    /* 1 */ val communications: typings.winrt.Windows.Media.Devices.AudioDeviceRole.communications with Double = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.CallControl")
  @js.native
  class CallControl ()
    extends typings.winrt.Windows.Media.Devices.CallControl
  /* static members */
  object CallControl {
    
    @JSGlobal("Windows.Media.Devices.CallControl.fromId")
    @js.native
    def fromId(deviceInterfaceId: String): typings.winrt.Windows.Media.Devices.CallControl = js.native
    
    @JSGlobal("Windows.Media.Devices.CallControl.getDefault")
    @js.native
    def getDefault(): typings.winrt.Windows.Media.Devices.CallControl = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs")
  @js.native
  class DefaultAudioCaptureDeviceChangedEventArgs ()
    extends typings.winrt.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
  
  @JSGlobal("Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs")
  @js.native
  class DefaultAudioRenderDeviceChangedEventArgs ()
    extends typings.winrt.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs
  
  @JSGlobal("Windows.Media.Devices.DialRequestedEventArgs")
  @js.native
  class DialRequestedEventArgs ()
    extends typings.winrt.Windows.Media.Devices.DialRequestedEventArgs
  
  @JSGlobal("Windows.Media.Devices.KeypadPressedEventArgs")
  @js.native
  class KeypadPressedEventArgs ()
    extends typings.winrt.Windows.Media.Devices.KeypadPressedEventArgs
  
  @JSGlobal("Windows.Media.Devices.MediaDevice")
  @js.native
  class MediaDevice ()
    extends typings.winrt.Windows.Media.Devices.MediaDevice
  /* static members */
  object MediaDevice {
    
    @JSGlobal("Windows.Media.Devices.MediaDevice")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.getAudioCaptureSelector")
    @js.native
    def getAudioCaptureSelector(): String = js.native
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.getAudioRenderSelector")
    @js.native
    def getAudioRenderSelector(): String = js.native
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.getDefaultAudioCaptureId")
    @js.native
    def getDefaultAudioCaptureId(role: AudioDeviceRole): String = js.native
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.getDefaultAudioRenderId")
    @js.native
    def getDefaultAudioRenderId(role: AudioDeviceRole): String = js.native
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.getVideoCaptureSelector")
    @js.native
    def getVideoCaptureSelector(): String = js.native
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.ondefaultaudiocapturedevicechanged")
    @js.native
    def ondefaultaudiocapturedevicechanged: js.Any = js.native
    @scala.inline
    def ondefaultaudiocapturedevicechanged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ondefaultaudiocapturedevicechanged")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.ondefaultaudiorenderdevicechanged")
    @js.native
    def ondefaultaudiorenderdevicechanged: js.Any = js.native
    @scala.inline
    def ondefaultaudiorenderdevicechanged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ondefaultaudiorenderdevicechanged")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Media.Devices.MediaDeviceControl")
  @js.native
  class MediaDeviceControl ()
    extends typings.winrt.Windows.Media.Devices.MediaDeviceControl
  
  @JSGlobal("Windows.Media.Devices.MediaDeviceControlCapabilities")
  @js.native
  class MediaDeviceControlCapabilities ()
    extends typings.winrt.Windows.Media.Devices.MediaDeviceControlCapabilities
  
  @JSGlobal("Windows.Media.Devices.RedialRequestedEventArgs")
  @js.native
  class RedialRequestedEventArgs ()
    extends typings.winrt.Windows.Media.Devices.RedialRequestedEventArgs
  
  @JSGlobal("Windows.Media.Devices.TelephonyKey")
  @js.native
  object TelephonyKey extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Devices.TelephonyKey with Double] = js.native
    
    /* 12 */ val a: typings.winrt.Windows.Media.Devices.TelephonyKey.a with Double = js.native
    
    /* 13 */ val b: typings.winrt.Windows.Media.Devices.TelephonyKey.b with Double = js.native
    
    /* 14 */ val c: typings.winrt.Windows.Media.Devices.TelephonyKey.c with Double = js.native
    
    /* 15 */ val d: typings.winrt.Windows.Media.Devices.TelephonyKey.d with Double = js.native
    
    /* 0 */ val d0: typings.winrt.Windows.Media.Devices.TelephonyKey.d0 with Double = js.native
    
    /* 1 */ val d1: typings.winrt.Windows.Media.Devices.TelephonyKey.d1 with Double = js.native
    
    /* 2 */ val d2: typings.winrt.Windows.Media.Devices.TelephonyKey.d2 with Double = js.native
    
    /* 3 */ val d3: typings.winrt.Windows.Media.Devices.TelephonyKey.d3 with Double = js.native
    
    /* 4 */ val d4: typings.winrt.Windows.Media.Devices.TelephonyKey.d4 with Double = js.native
    
    /* 5 */ val d5: typings.winrt.Windows.Media.Devices.TelephonyKey.d5 with Double = js.native
    
    /* 6 */ val d6: typings.winrt.Windows.Media.Devices.TelephonyKey.d6 with Double = js.native
    
    /* 7 */ val d7: typings.winrt.Windows.Media.Devices.TelephonyKey.d7 with Double = js.native
    
    /* 8 */ val d8: typings.winrt.Windows.Media.Devices.TelephonyKey.d8 with Double = js.native
    
    /* 9 */ val d9: typings.winrt.Windows.Media.Devices.TelephonyKey.d9 with Double = js.native
    
    /* 11 */ val pound: typings.winrt.Windows.Media.Devices.TelephonyKey.pound with Double = js.native
    
    /* 10 */ val star: typings.winrt.Windows.Media.Devices.TelephonyKey.star with Double = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.VideoDeviceController")
  @js.native
  class VideoDeviceController ()
    extends typings.winrt.Windows.Media.Devices.VideoDeviceController
}
