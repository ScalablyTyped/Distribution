package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods used to select devices for capturing and rendering audio, and for capturing video. */
@JSGlobal("Windows.Media.Devices.MediaDevice")
@js.native
abstract class MediaDevice () extends js.Object

/** Provides methods used to select devices for capturing and rendering audio, and for capturing video. */
@JSGlobal("Windows.Media.Devices.MediaDevice")
@js.native
object MediaDevice extends js.Object {
  /** Raised when the default audio capture device is changed. */
  @JSName("ondefaultaudiocapturedevicechanged")
  var ondefaultaudiocapturedevicechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
    _, 
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.DefaultAudioCaptureDeviceChangedEventArgs
  ] = js.native
  /** Raised when the default audio render device is changed. */
  @JSName("ondefaultaudiorenderdevicechanged")
  var ondefaultaudiorenderdevicechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
    _, 
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.DefaultAudioRenderDeviceChangedEventArgs
  ] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_defaultaudiocapturedevicechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.defaultaudiocapturedevicechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      _, 
      winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.DefaultAudioCaptureDeviceChangedEventArgs
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_defaultaudiorenderdevicechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.defaultaudiorenderdevicechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      _, 
      winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.DefaultAudioRenderDeviceChangedEventArgs
    ]
  ): scala.Unit = js.native
  /**
    * Returns the identifier string of a device for capturing audio.
    * @return The identifier string of the audio capture device.
    */
  def getAudioCaptureSelector(): java.lang.String = js.native
  /**
    * Returns the identifier string of a device for rendering audio.
    * @return The identifier string of the audio rendering device.
    */
  def getAudioRenderSelector(): java.lang.String = js.native
  /**
    * Returns the identifier string of the default device for capturing audio in the specified role.
    * @param role The specified audio device role (console, media, or communications).
    * @return The identifier string of the default device.
    */
  def getDefaultAudioCaptureId(role: winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AudioDeviceRole): java.lang.String = js.native
  /**
    * Returns the identifier string of the default device for rendering audio in the specified role.
    * @param role The specified audio device role (console, media, or communications).
    * @return The identifier string of the default device.
    */
  def getDefaultAudioRenderId(role: winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AudioDeviceRole): java.lang.String = js.native
  /**
    * Returns the identifier string of a device for capturing video.
    * @return The identifier string of the video capture device.
    */
  def getVideoCaptureSelector(): java.lang.String = js.native
  /** Raised when the default audio capture device is changed. */
  def ondefaultaudiocapturedevicechanged(
    ev: winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.DefaultAudioCaptureDeviceChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[_]
  ): scala.Unit = js.native
  /** Raised when the default audio render device is changed. */
  def ondefaultaudiorenderdevicechanged(
    ev: winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.DefaultAudioRenderDeviceChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[_]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_defaultaudiocapturedevicechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.defaultaudiocapturedevicechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      _, 
      winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.DefaultAudioCaptureDeviceChangedEventArgs
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_defaultaudiorenderdevicechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.defaultaudiorenderdevicechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      _, 
      winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.DefaultAudioRenderDeviceChangedEventArgs
    ]
  ): scala.Unit = js.native
}

