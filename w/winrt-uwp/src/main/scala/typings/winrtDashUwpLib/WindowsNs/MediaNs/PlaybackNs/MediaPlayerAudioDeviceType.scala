package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaPlayerAudioDeviceType extends js.Object

/** Describes the primary usage of the device that is being used to play back audio. This value is used by MediaPlayer::AudioDeviceType . */
@JSGlobal("Windows.Media.Playback.MediaPlayerAudioDeviceType")
@js.native
object MediaPlayerAudioDeviceType extends js.Object {
  /** The device is primarily for voice communications. */
  @js.native
  sealed trait communications
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioDeviceType
  
  /** The device is a console and the audio session might support games, notifications, voice commands, and so on. */
  @js.native
  sealed trait console
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioDeviceType
  
  /** The device is intended for multimedia playback and/or recording. */
  @js.native
  sealed trait multimedia
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioDeviceType
  
  val communications: communications with java.lang.String = js.native
  val console: console with java.lang.String = js.native
  val multimedia: multimedia with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioDeviceType with java.lang.String
  ] = js.native
}

