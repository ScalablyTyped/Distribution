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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Devices")
@js.native
object Devices extends js.Object {
  @js.native
  class AudioDeviceController ()
    extends typings.winrt.Windows.Media.Devices.AudioDeviceController {
    /* CompleteClass */
    override var muted: Boolean = js.native
    /* CompleteClass */
    override var volumePercent: Double = js.native
    /* CompleteClass */
    override def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
    /* CompleteClass */
    override def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
    /* CompleteClass */
    override def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IAsyncAction = js.native
  }
  
  @js.native
  class CallControl ()
    extends typings.winrt.Windows.Media.Devices.CallControl {
    /* CompleteClass */
    override var hasRinger: Boolean = js.native
    /* CompleteClass */
    override var onanswerrequested: js.Any = js.native
    /* CompleteClass */
    override var onaudiotransferrequested: js.Any = js.native
    /* CompleteClass */
    override var ondialrequested: js.Any = js.native
    /* CompleteClass */
    override var onhanguprequested: js.Any = js.native
    /* CompleteClass */
    override var onkeypadpressed: js.Any = js.native
    /* CompleteClass */
    override var onredialrequested: js.Any = js.native
    /* CompleteClass */
    override def endCall(callToken: Double): Unit = js.native
    /* CompleteClass */
    override def indicateActiveCall(callToken: Double): Unit = js.native
    /* CompleteClass */
    override def indicateNewIncomingCall(enableRinger: Boolean, callerId: String): Double = js.native
    /* CompleteClass */
    override def indicateNewOutgoingCall(): Double = js.native
  }
  
  @js.native
  class DefaultAudioCaptureDeviceChangedEventArgs ()
    extends typings.winrt.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs {
    /* CompleteClass */
    override var id: String = js.native
    /* CompleteClass */
    override var role: AudioDeviceRole = js.native
  }
  
  @js.native
  class DefaultAudioRenderDeviceChangedEventArgs ()
    extends typings.winrt.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs {
    /* CompleteClass */
    override var id: String = js.native
    /* CompleteClass */
    override var role: AudioDeviceRole = js.native
  }
  
  @js.native
  class DialRequestedEventArgs ()
    extends typings.winrt.Windows.Media.Devices.DialRequestedEventArgs {
    /* CompleteClass */
    override var contact: js.Any = js.native
    /* CompleteClass */
    override def handled(): Unit = js.native
  }
  
  @js.native
  class KeypadPressedEventArgs ()
    extends typings.winrt.Windows.Media.Devices.KeypadPressedEventArgs {
    /* CompleteClass */
    override var telephonyKey: TelephonyKey = js.native
  }
  
  @js.native
  class MediaDevice ()
    extends typings.winrt.Windows.Media.Devices.MediaDevice
  
  @js.native
  class MediaDeviceControl ()
    extends typings.winrt.Windows.Media.Devices.MediaDeviceControl {
    /* CompleteClass */
    override var capabilities: typings.winrt.Windows.Media.Devices.MediaDeviceControlCapabilities = js.native
    /* CompleteClass */
    override def tryGetAuto(): SucceededBoolean = js.native
    /* CompleteClass */
    override def tryGetValue(): SucceededValue = js.native
    /* CompleteClass */
    override def trySetAuto(value: Boolean): Boolean = js.native
    /* CompleteClass */
    override def trySetValue(value: Double): Boolean = js.native
  }
  
  @js.native
  class MediaDeviceControlCapabilities ()
    extends typings.winrt.Windows.Media.Devices.MediaDeviceControlCapabilities {
    /* CompleteClass */
    override var autoModeSupported: Boolean = js.native
    /* CompleteClass */
    override var default: Double = js.native
    /* CompleteClass */
    override var max: Double = js.native
    /* CompleteClass */
    override var min: Double = js.native
    /* CompleteClass */
    override var step: Double = js.native
    /* CompleteClass */
    override var supported: Boolean = js.native
  }
  
  @js.native
  class RedialRequestedEventArgs ()
    extends typings.winrt.Windows.Media.Devices.RedialRequestedEventArgs {
    /* CompleteClass */
    override def handled(): Unit = js.native
  }
  
  @js.native
  class VideoDeviceController ()
    extends typings.winrt.Windows.Media.Devices.VideoDeviceController {
    /* CompleteClass */
    override var backlightCompensation: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    /* CompleteClass */
    override var brightness: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    /* CompleteClass */
    override var contrast: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    /* CompleteClass */
    override var exposure: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    /* CompleteClass */
    override var focus: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    /* CompleteClass */
    override var hue: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    /* CompleteClass */
    override var pan: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    /* CompleteClass */
    override var roll: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    /* CompleteClass */
    override var tilt: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    /* CompleteClass */
    override var whiteBalance: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    /* CompleteClass */
    override var zoom: typings.winrt.Windows.Media.Devices.MediaDeviceControl = js.native
    /* CompleteClass */
    override def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
    /* CompleteClass */
    override def getDeviceProperty(propertyId: String): js.Any = js.native
    /* CompleteClass */
    override def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
    /* CompleteClass */
    override def setDeviceProperty(propertyId: String, propertyValue: js.Any): Unit = js.native
    /* CompleteClass */
    override def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IAsyncAction = js.native
    /* CompleteClass */
    override def tryGetPowerlineFrequency(): Value = js.native
    /* CompleteClass */
    override def trySetPowerlineFrequency(value: PowerlineFrequency): Boolean = js.native
  }
  
  @js.native
  object AudioDeviceRole extends js.Object {
    /* 1 */ val communications: typings.winrt.Windows.Media.Devices.AudioDeviceRole.communications with Double = js.native
    /* 0 */ val default: typings.winrt.Windows.Media.Devices.AudioDeviceRole.default with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Devices.AudioDeviceRole with Double] = js.native
  }
  
  /* static members */
  @js.native
  object CallControl extends js.Object {
    def fromId(deviceInterfaceId: String): typings.winrt.Windows.Media.Devices.CallControl = js.native
    def getDefault(): typings.winrt.Windows.Media.Devices.CallControl = js.native
  }
  
  /* static members */
  @js.native
  object MediaDevice extends js.Object {
    var ondefaultaudiocapturedevicechanged: js.Any = js.native
    var ondefaultaudiorenderdevicechanged: js.Any = js.native
    def getAudioCaptureSelector(): String = js.native
    def getAudioRenderSelector(): String = js.native
    def getDefaultAudioCaptureId(role: AudioDeviceRole): String = js.native
    def getDefaultAudioRenderId(role: AudioDeviceRole): String = js.native
    def getVideoCaptureSelector(): String = js.native
  }
  
  @js.native
  object TelephonyKey extends js.Object {
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
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Devices.TelephonyKey with Double] = js.native
  }
  
}

