package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.winrtUwpStrings.defaultaudiocapturedevicechanged
import typings.winrtUwp.winrtUwpStrings.defaultaudiorenderdevicechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods used to select devices for capturing and rendering audio, and for capturing video. */
@JSGlobal("Windows.Media.Devices.MediaDevice")
@js.native
abstract class MediaDevice ()
  extends typings.winrtUwp.Windows.Media.Devices.MediaDevice
object MediaDevice {
  
  @JSGlobal("Windows.Media.Devices.MediaDevice")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.addEventListener")
  @js.native
  def addEventListener_defaultaudiocapturedevicechanged(
    `type`: defaultaudiocapturedevicechanged,
    listener: TypedEventHandler[
      _, 
      typings.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
    ]
  ): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.addEventListener")
  @js.native
  def addEventListener_defaultaudiorenderdevicechanged(
    `type`: defaultaudiorenderdevicechanged,
    listener: TypedEventHandler[_, typings.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs]
  ): Unit = js.native
  
  /**
    * Returns the identifier string of a device for capturing audio.
    * @return The identifier string of the audio capture device.
    */
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.getAudioCaptureSelector")
  @js.native
  def getAudioCaptureSelector(): String = js.native
  
  /**
    * Returns the identifier string of a device for rendering audio.
    * @return The identifier string of the audio rendering device.
    */
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.getAudioRenderSelector")
  @js.native
  def getAudioRenderSelector(): String = js.native
  
  /**
    * Returns the identifier string of the default device for capturing audio in the specified role.
    * @param role The specified audio device role (console, media, or communications).
    * @return The identifier string of the default device.
    */
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.getDefaultAudioCaptureId")
  @js.native
  def getDefaultAudioCaptureId(role: typings.winrtUwp.Windows.Media.Devices.AudioDeviceRole): String = js.native
  
  /**
    * Returns the identifier string of the default device for rendering audio in the specified role.
    * @param role The specified audio device role (console, media, or communications).
    * @return The identifier string of the default device.
    */
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.getDefaultAudioRenderId")
  @js.native
  def getDefaultAudioRenderId(role: typings.winrtUwp.Windows.Media.Devices.AudioDeviceRole): String = js.native
  
  /**
    * Returns the identifier string of a device for capturing video.
    * @return The identifier string of the video capture device.
    */
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.getVideoCaptureSelector")
  @js.native
  def getVideoCaptureSelector(): String = js.native
  
  /** Raised when the default audio capture device is changed. */
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.ondefaultaudiocapturedevicechanged")
  @js.native
  def ondefaultaudiocapturedevicechanged: TypedEventHandler[
    js.Any, 
    typings.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
  ] = js.native
  @scala.inline
  def ondefaultaudiocapturedevicechanged_=(
    x: TypedEventHandler[
      js.Any, 
      typings.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ondefaultaudiocapturedevicechanged")(x.asInstanceOf[js.Any])
  
  /** Raised when the default audio render device is changed. */
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.ondefaultaudiorenderdevicechanged")
  @js.native
  def ondefaultaudiorenderdevicechanged: TypedEventHandler[
    js.Any, 
    typings.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs
  ] = js.native
  @scala.inline
  def ondefaultaudiorenderdevicechanged_=(
    x: TypedEventHandler[
      js.Any, 
      typings.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ondefaultaudiorenderdevicechanged")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.removeEventListener")
  @js.native
  def removeEventListener_defaultaudiocapturedevicechanged(
    `type`: defaultaudiocapturedevicechanged,
    listener: TypedEventHandler[
      _, 
      typings.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
    ]
  ): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.removeEventListener")
  @js.native
  def removeEventListener_defaultaudiorenderdevicechanged(
    `type`: defaultaudiorenderdevicechanged,
    listener: TypedEventHandler[_, typings.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs]
  ): Unit = js.native
}
