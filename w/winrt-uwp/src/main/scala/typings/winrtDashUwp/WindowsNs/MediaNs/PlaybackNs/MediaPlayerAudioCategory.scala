package typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs

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
  
  /* 2 */ val alerts: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory.alerts with Double = js.native
  /* 1 */ val communications: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory.communications with Double = js.native
  /* 6 */ val gameChat: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory.gameChat with Double = js.native
  /* 4 */ val gameEffects: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory.gameEffects with Double = js.native
  /* 5 */ val gameMedia: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory.gameMedia with Double = js.native
  /* 9 */ val media: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory.media with Double = js.native
  /* 8 */ val movie: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory.movie with Double = js.native
  /* 0 */ val other: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory.other with Double = js.native
  /* 3 */ val soundEffects: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory.soundEffects with Double = js.native
  /* 7 */ val speech: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory.speech with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlayerAudioCategory with Double] = js.native
}

