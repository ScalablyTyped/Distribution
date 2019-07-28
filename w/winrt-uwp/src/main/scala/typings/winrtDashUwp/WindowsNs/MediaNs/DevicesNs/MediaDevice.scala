package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.defaultaudiocapturedevicechanged
import typings.winrtDashUwp.winrtDashUwpStrings.defaultaudiorenderdevicechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods used to select devices for capturing and rendering audio, and for capturing video. */
@JSGlobal("Windows.Media.Devices.MediaDevice")
@js.native
abstract class MediaDevice () extends js.Object

/* static members */
@JSGlobal("Windows.Media.Devices.MediaDevice")
@js.native
object MediaDevice extends js.Object {
  /** Raised when the default audio capture device is changed. */
  @JSName("ondefaultaudiocapturedevicechanged")
  var ondefaultaudiocapturedevicechanged_Original: TypedEventHandler[_, DefaultAudioCaptureDeviceChangedEventArgs] = js.native
  /** Raised when the default audio render device is changed. */
  @JSName("ondefaultaudiorenderdevicechanged")
  var ondefaultaudiorenderdevicechanged_Original: TypedEventHandler[_, DefaultAudioRenderDeviceChangedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_defaultaudiocapturedevicechanged(
    `type`: defaultaudiocapturedevicechanged,
    listener: TypedEventHandler[_, DefaultAudioCaptureDeviceChangedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_defaultaudiorenderdevicechanged(
    `type`: defaultaudiorenderdevicechanged,
    listener: TypedEventHandler[_, DefaultAudioRenderDeviceChangedEventArgs]
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
  def getDefaultAudioCaptureId(role: AudioDeviceRole): String = js.native
  /**
    * Returns the identifier string of the default device for rendering audio in the specified role.
    * @param role The specified audio device role (console, media, or communications).
    * @return The identifier string of the default device.
    */
  def getDefaultAudioRenderId(role: AudioDeviceRole): String = js.native
  /**
    * Returns the identifier string of a device for capturing video.
    * @return The identifier string of the video capture device.
    */
  def getVideoCaptureSelector(): String = js.native
  /** Raised when the default audio capture device is changed. */
  def ondefaultaudiocapturedevicechanged(ev: DefaultAudioCaptureDeviceChangedEventArgs with WinRTEvent[_]): Unit = js.native
  /** Raised when the default audio render device is changed. */
  def ondefaultaudiorenderdevicechanged(ev: DefaultAudioRenderDeviceChangedEventArgs with WinRTEvent[_]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_defaultaudiocapturedevicechanged(
    `type`: defaultaudiocapturedevicechanged,
    listener: TypedEventHandler[_, DefaultAudioCaptureDeviceChangedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_defaultaudiorenderdevicechanged(
    `type`: defaultaudiorenderdevicechanged,
    listener: TypedEventHandler[_, DefaultAudioRenderDeviceChangedEventArgs]
  ): Unit = js.native
}

