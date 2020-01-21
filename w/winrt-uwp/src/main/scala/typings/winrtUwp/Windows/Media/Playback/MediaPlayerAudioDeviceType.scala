package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlayerAudioDeviceType with Double] = js.native
  /* 2 */ @js.native
  object communications extends TopLevel[communications with Double]
  
  /* 0 */ @js.native
  object console extends TopLevel[console with Double]
  
  /* 1 */ @js.native
  object multimedia extends TopLevel[multimedia with Double]
  
}

