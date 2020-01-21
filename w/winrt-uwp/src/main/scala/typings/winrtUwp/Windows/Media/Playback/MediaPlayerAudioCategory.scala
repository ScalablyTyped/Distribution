package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlayerAudioCategory with Double] = js.native
  /* 2 */ @js.native
  object alerts extends TopLevel[alerts with Double]
  
  /* 1 */ @js.native
  object communications extends TopLevel[communications with Double]
  
  /* 6 */ @js.native
  object gameChat extends TopLevel[gameChat with Double]
  
  /* 4 */ @js.native
  object gameEffects extends TopLevel[gameEffects with Double]
  
  /* 5 */ @js.native
  object gameMedia extends TopLevel[gameMedia with Double]
  
  /* 9 */ @js.native
  object media extends TopLevel[media with Double]
  
  /* 8 */ @js.native
  object movie extends TopLevel[movie with Double]
  
  /* 0 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 3 */ @js.native
  object soundEffects extends TopLevel[soundEffects with Double]
  
  /* 7 */ @js.native
  object speech extends TopLevel[speech with Double]
  
}

