package typings.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaPlayerAudioCategory extends js.Object

/** Specifies the types of audio that can be played by a media player. */
@JSGlobal("Windows.Media.Playback.MediaPlayerAudioCategory")
@js.native
object MediaPlayerAudioCategory extends js.Object {
  /** The audio is used for alerts. */
  @js.native
  sealed trait alerts extends MediaPlayerAudioCategory
  
  /** The audio is used for communications. */
  @js.native
  sealed trait communications extends MediaPlayerAudioCategory
  
  /** The audio is used for game chat. */
  @js.native
  sealed trait gameChat extends MediaPlayerAudioCategory
  
  /** The audio is a game effect. */
  @js.native
  sealed trait gameEffects extends MediaPlayerAudioCategory
  
  /** The audio is game media, such as background music. */
  @js.native
  sealed trait gameMedia extends MediaPlayerAudioCategory
  
  /** The audio is for media playback. */
  @js.native
  sealed trait media extends MediaPlayerAudioCategory
  
  /** The audio is for movie playback. */
  @js.native
  sealed trait movie extends MediaPlayerAudioCategory
  
  /** The audio type is not one of the provided enumeration values. */
  @js.native
  sealed trait other extends MediaPlayerAudioCategory
  
  /** The audio is a sound effect. */
  @js.native
  sealed trait soundEffects extends MediaPlayerAudioCategory
  
  /** The audio is used for speech. */
  @js.native
  sealed trait speech extends MediaPlayerAudioCategory
  
}

