package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

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
  sealed trait alerts
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory
  
  /** The audio is used for communications. */
  @js.native
  sealed trait communications
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory
  
  /** The audio is used for game chat. */
  @js.native
  sealed trait gameChat
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory
  
  /** The audio is a game effect. */
  @js.native
  sealed trait gameEffects
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory
  
  /** The audio is game media, such as background music. */
  @js.native
  sealed trait gameMedia
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory
  
  /** The audio is for media playback. */
  @js.native
  sealed trait media
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory
  
  /** The audio is for movie playback. */
  @js.native
  sealed trait movie
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory
  
  /** The audio type is not one of the provided enumeration values. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory
  
  /** The audio is a sound effect. */
  @js.native
  sealed trait soundEffects
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory
  
  /** The audio is used for speech. */
  @js.native
  sealed trait speech
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory
  
  /* 2 */ val alerts: alerts with scala.Double = js.native
  /* 1 */ val communications: communications with scala.Double = js.native
  /* 6 */ val gameChat: gameChat with scala.Double = js.native
  /* 4 */ val gameEffects: gameEffects with scala.Double = js.native
  /* 5 */ val gameMedia: gameMedia with scala.Double = js.native
  /* 9 */ val media: media with scala.Double = js.native
  /* 8 */ val movie: movie with scala.Double = js.native
  /* 0 */ val other: other with scala.Double = js.native
  /* 3 */ val soundEffects: soundEffects with scala.Double = js.native
  /* 7 */ val speech: speech with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory with scala.Double
  ] = js.native
}

