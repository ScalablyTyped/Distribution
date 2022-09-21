package typings.winrt.global.Windows.Media

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Media.Capture.MediaStreamType
import typings.winrt.Windows.Media.Capture.PowerlineFrequency
import typings.winrt.Windows.Media.Devices.AudioDeviceRole
import typings.winrt.Windows.Media.Devices.TelephonyKey
import typings.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrt.anon.SucceededBoolean
import typings.winrt.anon.SucceededValue
import typings.winrt.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Devices {
  
  @JSGlobal("Windows.Media.Devices.AudioDeviceController")
  @js.native
  open class AudioDeviceController ()
    extends StObject
       with typings.winrt.Windows.Media.Devices.AudioDeviceController {
    
    /* CompleteClass */
    override def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
    
    /* CompleteClass */
    override def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
    
    /* CompleteClass */
    var muted: Boolean = js.native
    
    /* CompleteClass */
    override def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IAsyncAction = js.native
    
    /* CompleteClass */
    var volumePercent: Double = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.AudioDeviceRole")
  @js.native
  object AudioDeviceRole extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Devices.AudioDeviceRole & Double] = js.native
    
    /* 0 */ val default: typings.winrt.Windows.Media.Devices.AudioDeviceRole.default & Double = js.native
    
    /* 1 */ val communications: typings.winrt.Windows.Media.Devices.AudioDeviceRole.communications & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.CallControl")
  @js.native
  open class CallControl ()
    extends StObject
       with typings.winrt.Windows.Media.Devices.CallControl {
    
    /* CompleteClass */
    override def endCall(callToken: Double): Unit = js.native
    
    /* CompleteClass */
    var hasRinger: Boolean = js.native
    
    /* CompleteClass */
    override def indicateActiveCall(callToken: Double): Unit = js.native
    
    /* CompleteClass */
    override def indicateNewIncomingCall(enableRinger: Boolean, callerId: String): Double = js.native
    
    /* CompleteClass */
    override def indicateNewOutgoingCall(): Double = js.native
    
    /* CompleteClass */
    var onanswerrequested: Any = js.native
    
    /* CompleteClass */
    var onaudiotransferrequested: Any = js.native
    
    /* CompleteClass */
    var ondialrequested: Any = js.native
    
    /* CompleteClass */
    var onhanguprequested: Any = js.native
    
    /* CompleteClass */
    var onkeypadpressed: Any = js.native
    
    /* CompleteClass */
    var onredialrequested: Any = js.native
  }
  /* static members */
  object CallControl {
    
    @JSGlobal("Windows.Media.Devices.CallControl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromId(deviceInterfaceId: String): typings.winrt.Windows.Media.Devices.CallControl = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(deviceInterfaceId.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Media.Devices.CallControl]
    
    inline def getDefault(): typings.winrt.Windows.Media.Devices.CallControl = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrt.Windows.Media.Devices.CallControl]
  }
  
  @JSGlobal("Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs")
  @js.native
  open class DefaultAudioCaptureDeviceChangedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs {
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    var role: AudioDeviceRole = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs")
  @js.native
  open class DefaultAudioRenderDeviceChangedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs {
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    var role: AudioDeviceRole = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.DialRequestedEventArgs")
  @js.native
  open class DialRequestedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.Devices.DialRequestedEventArgs {
    
    /* CompleteClass */
    var contact: Any = js.native
    
    /* CompleteClass */
    override def handled(): Unit = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.KeypadPressedEventArgs")
  @js.native
  open class KeypadPressedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.Devices.KeypadPressedEventArgs {
    
    /* CompleteClass */
    var telephonyKey: TelephonyKey = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.MediaDevice")
  @js.native
  open class MediaDevice ()
    extends StObject
       with typings.winrt.Windows.Media.Devices.MediaDevice
  /* static members */
  object MediaDevice {
    
    @JSGlobal("Windows.Media.Devices.MediaDevice")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAudioCaptureSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAudioCaptureSelector")().asInstanceOf[String]
    
    inline def getAudioRenderSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAudioRenderSelector")().asInstanceOf[String]
    
    inline def getDefaultAudioCaptureId(role: AudioDeviceRole): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAudioCaptureId")(role.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getDefaultAudioRenderId(role: AudioDeviceRole): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAudioRenderId")(role.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getVideoCaptureSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVideoCaptureSelector")().asInstanceOf[String]
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.ondefaultaudiocapturedevicechanged")
    @js.native
    def ondefaultaudiocapturedevicechanged: Any = js.native
    inline def ondefaultaudiocapturedevicechanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ondefaultaudiocapturedevicechanged")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Media.Devices.MediaDevice.ondefaultaudiorenderdevicechanged")
    @js.native
    def ondefaultaudiorenderdevicechanged: Any = js.native
    inline def ondefaultaudiorenderdevicechanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ondefaultaudiorenderdevicechanged")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Media.Devices.MediaDeviceControl")
  @js.native
  open class MediaDeviceControl ()
    extends StObject
       with typings.winrt.Windows.Media.Devices.MediaDeviceControl {
    
    /* CompleteClass */
    var capabilities: typings.winrt.Windows.Media.Devices.MediaDeviceControlCapabilities = js.native
    
    /* CompleteClass */
    override def tryGetAuto(): SucceededBoolean = js.native
    
    /* CompleteClass */
    override def tryGetValue(): SucceededValue = js.native
    
    /* CompleteClass */
    override def trySetAuto(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def trySetValue(value: Double): Boolean = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.MediaDeviceControlCapabilities")
  @js.native
  open class MediaDeviceControlCapabilities ()
    extends StObject
       with typings.winrt.Windows.Media.Devices.MediaDeviceControlCapabilities {
    
    /* CompleteClass */
    var default: Double = js.native
    
    /* CompleteClass */
    var autoModeSupported: Boolean = js.native
    
    /* CompleteClass */
    var max: Double = js.native
    
    /* CompleteClass */
    var min: Double = js.native
    
    /* CompleteClass */
    var step: Double = js.native
    
    /* CompleteClass */
    var supported: Boolean = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.RedialRequestedEventArgs")
  @js.native
  open class RedialRequestedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.Devices.RedialRequestedEventArgs {
    
    /* CompleteClass */
    override def handled(): Unit = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.TelephonyKey")
  @js.native
  object TelephonyKey extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Devices.TelephonyKey & Double] = js.native
    
    /* 12 */ val a: typings.winrt.Windows.Media.Devices.TelephonyKey.a & Double = js.native
    
    /* 13 */ val b: typings.winrt.Windows.Media.Devices.TelephonyKey.b & Double = js.native
    
    /* 14 */ val c: typings.winrt.Windows.Media.Devices.TelephonyKey.c & Double = js.native
    
    /* 15 */ val d: typings.winrt.Windows.Media.Devices.TelephonyKey.d & Double = js.native
    
    /* 0 */ val d0: typings.winrt.Windows.Media.Devices.TelephonyKey.d0 & Double = js.native
    
    /* 1 */ val d1: typings.winrt.Windows.Media.Devices.TelephonyKey.d1 & Double = js.native
    
    /* 2 */ val d2: typings.winrt.Windows.Media.Devices.TelephonyKey.d2 & Double = js.native
    
    /* 3 */ val d3: typings.winrt.Windows.Media.Devices.TelephonyKey.d3 & Double = js.native
    
    /* 4 */ val d4: typings.winrt.Windows.Media.Devices.TelephonyKey.d4 & Double = js.native
    
    /* 5 */ val d5: typings.winrt.Windows.Media.Devices.TelephonyKey.d5 & Double = js.native
    
    /* 6 */ val d6: typings.winrt.Windows.Media.Devices.TelephonyKey.d6 & Double = js.native
    
    /* 7 */ val d7: typings.winrt.Windows.Media.Devices.TelephonyKey.d7 & Double = js.native
    
    /* 8 */ val d8: typings.winrt.Windows.Media.Devices.TelephonyKey.d8 & Double = js.native
    
    /* 9 */ val d9: typings.winrt.Windows.Media.Devices.TelephonyKey.d9 & Double = js.native
    
    /* 11 */ val pound: typings.winrt.Windows.Media.Devices.TelephonyKey.pound & Double = js.native
    
    /* 10 */ val star: typings.winrt.Windows.Media.Devices.TelephonyKey.star & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Devices.VideoDeviceController")
  @js.native
  open class VideoDeviceController ()
    extends StObject
       with typings.winrt.Windows.Media.Devices.VideoDeviceController {
    
    /* CompleteClass */
    var backlightCompensation: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    
    /* CompleteClass */
    var brightness: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    
    /* CompleteClass */
    var contrast: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    
    /* CompleteClass */
    var exposure: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    
    /* CompleteClass */
    var focus: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    
    /* CompleteClass */
    override def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
    
    /* CompleteClass */
    override def getDeviceProperty(propertyId: String): Any = js.native
    
    /* CompleteClass */
    override def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
    
    /* CompleteClass */
    var hue: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    
    /* CompleteClass */
    var pan: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    
    /* CompleteClass */
    var roll: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    
    /* CompleteClass */
    override def setDeviceProperty(propertyId: String, propertyValue: Any): Unit = js.native
    
    /* CompleteClass */
    override def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IAsyncAction = js.native
    
    /* CompleteClass */
    var tilt: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    
    /* CompleteClass */
    override def tryGetPowerlineFrequency(): Value = js.native
    
    /* CompleteClass */
    override def trySetPowerlineFrequency(value: PowerlineFrequency): Boolean = js.native
    
    /* CompleteClass */
    var whiteBalance: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    
    /* CompleteClass */
    var zoom: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
  }
}
