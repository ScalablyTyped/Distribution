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
  
  val alerts: alerts with java.lang.String = js.native
  val communications: communications with java.lang.String = js.native
  val gameChat: gameChat with java.lang.String = js.native
  val gameEffects: gameEffects with java.lang.String = js.native
  val gameMedia: gameMedia with java.lang.String = js.native
  val media: media with java.lang.String = js.native
  val movie: movie with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val soundEffects: soundEffects with java.lang.String = js.native
  val speech: speech with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerAudioCategory with java.lang.String
  ] = js.native
}

