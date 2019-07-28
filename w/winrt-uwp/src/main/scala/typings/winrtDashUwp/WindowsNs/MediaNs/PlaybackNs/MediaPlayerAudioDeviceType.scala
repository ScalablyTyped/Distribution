package typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs

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
  sealed trait communications extends MediaPlayerAudioDeviceType
  
  /** The device is a console and the audio session might support games, notifications, voice commands, and so on. */
  @js.native
  sealed trait console extends MediaPlayerAudioDeviceType
  
  /** The device is intended for multimedia playback and/or recording. */
  @js.native
  sealed trait multimedia extends MediaPlayerAudioDeviceType
  
  /* 2 */ val communications: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioDeviceType.communications with Double = js.native
  /* 0 */ val console: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioDeviceType.console with Double = js.native
  /* 1 */ val multimedia: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioDeviceType.multimedia with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlayerAudioDeviceType with Double] = js.native
}

