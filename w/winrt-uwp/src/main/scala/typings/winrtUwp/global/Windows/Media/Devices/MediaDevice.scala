package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.defaultaudiocapturedevicechanged
import typings.winrtUwp.winrtUwpStrings.defaultaudiorenderdevicechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods used to select devices for capturing and rendering audio, and for capturing video. */
@JSGlobal("Windows.Media.Devices.MediaDevice")
@js.native
abstract class MediaDevice ()
  extends typings.winrtUwp.Windows.Media.Devices.MediaDevice

/* static members */
@JSGlobal("Windows.Media.Devices.MediaDevice")
@js.native
object MediaDevice extends js.Object {
  /** Raised when the default audio capture device is changed. */
  @JSName("ondefaultaudiocapturedevicechanged")
  var ondefaultaudiocapturedevicechanged_Original: TypedEventHandler[
    _, 
    typings.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
  ] = js.native
  /** Raised when the default audio render device is changed. */
  @JSName("ondefaultaudiorenderdevicechanged")
  var ondefaultaudiorenderdevicechanged_Original: TypedEventHandler[_, typings.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_defaultaudiocapturedevicechanged(
    `type`: defaultaudiocapturedevicechanged,
    listener: TypedEventHandler[
      _, 
      typings.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_defaultaudiorenderdevicechanged(
    `type`: defaultaudiorenderdevicechanged,
    listener: TypedEventHandler[_, typings.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs]
  ): Unit = js.native
  /**
    * Returns the identifier string of a device for capturing audio.
    * @return The identifier string of the audio capture device.
    */
  def getAudioCaptureSelector(): String = js.native
  /**
    * Returns the identifier string of a device for rendering audio.
    * @return The identifier string of the audio rendering device.
    */
  def getAudioRenderSelector(): String = js.native
  /**
    * Returns the identifier string of the default device for capturing audio in the specified role.
    * @param role The specified audio device role (console, media, or communications).
    * @return The identifier string of the default device.
    */
  def getDefaultAudioCaptureId(role: typings.winrtUwp.Windows.Media.Devices.AudioDeviceRole): String = js.native
  /**
    * Returns the identifier string of the default device for rendering audio in the specified role.
    * @param role The specified audio device role (console, media, or communications).
    * @return The identifier string of the default device.
    */
  def getDefaultAudioRenderId(role: typings.winrtUwp.Windows.Media.Devices.AudioDeviceRole): String = js.native
  /**
    * Returns the identifier string of a device for capturing video.
    * @return The identifier string of the video capture device.
    */
  def getVideoCaptureSelector(): String = js.native
  /** Raised when the default audio capture device is changed. */
  def ondefaultaudiocapturedevicechanged(
    ev: typings.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs with WinRTEvent[_]
  ): Unit = js.native
  /** Raised when the default audio render device is changed. */
  def ondefaultaudiorenderdevicechanged(
    ev: typings.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs with WinRTEvent[_]
  ): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_defaultaudiocapturedevicechanged(
    `type`: defaultaudiocapturedevicechanged,
    listener: TypedEventHandler[
      _, 
      typings.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
    ]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_defaultaudiorenderdevicechanged(
    `type`: defaultaudiorenderdevicechanged,
    listener: TypedEventHandler[_, typings.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs]
  ): Unit = js.native
}

