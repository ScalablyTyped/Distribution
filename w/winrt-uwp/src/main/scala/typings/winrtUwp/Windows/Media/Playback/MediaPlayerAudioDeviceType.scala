package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaPlayerAudioDeviceType extends StObject
/** Describes the primary usage of the device that is being used to play back audio. This value is used by MediaPlayer::AudioDeviceType . */
@JSGlobal("Windows.Media.Playback.MediaPlayerAudioDeviceType")
@js.native
object MediaPlayerAudioDeviceType extends StObject {
  
  /** The device is primarily for voice communications. */
  @js.native
  sealed trait communications
    extends StObject
       with MediaPlayerAudioDeviceType
  
  /** The device is a console and the audio session might support games, notifications, voice commands, and so on. */
  @js.native
  sealed trait console
    extends StObject
       with MediaPlayerAudioDeviceType
  
  /** The device is intended for multimedia playback and/or recording. */
  @js.native
  sealed trait multimedia
    extends StObject
       with MediaPlayerAudioDeviceType
}
