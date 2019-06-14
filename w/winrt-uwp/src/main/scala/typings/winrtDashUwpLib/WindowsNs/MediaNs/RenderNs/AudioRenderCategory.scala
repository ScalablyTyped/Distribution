package typings
package winrtDashUwpLib.WindowsNs.MediaNs.RenderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioRenderCategory extends js.Object

/** Describes the purpose of the audio information in an audio stream. */
@JSGlobal("Windows.Media.Render.AudioRenderCategory")
@js.native
object AudioRenderCategory extends js.Object {
  /** Audio is for system or application notifications, for example ring tones. */
  @js.native
  sealed trait alerts
    extends winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory
  
  /** Audio is for general media, for example audio for video, or streaming audio, and can be played as background. */
  @js.native
  sealed trait backgroundCapableMedia
    extends winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory
  
  /** Audio is for peer-to-peer communications, for example chat or VoIP. */
  @js.native
  sealed trait communications
    extends winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory
  
  /** Audio is for general media, for example audio for video, or streaming audio, but should not be played as background. */
  @js.native
  sealed trait foregroundOnlyMedia
    extends winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory
  
  /** Audio is voice chat for games. */
  @js.native
  sealed trait gameChat
    extends winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory
  
  /** Audio is for game-specific sound effects. */
  @js.native
  sealed trait gameEffects
    extends winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory
  
  /** Audio is background (non-event or ambient) audio for games. */
  @js.native
  sealed trait gameMedia
    extends winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory
  
  /** Audio is media playback. */
  @js.native
  sealed trait media
    extends winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory
  
  /** Audio is movie audio. */
  @js.native
  sealed trait movie
    extends winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory
  
  /** All other streams. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory
  
  /** Audio is for sound effects. */
  @js.native
  sealed trait soundEffects
    extends winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory
  
  /** Audio is speech. */
  @js.native
  sealed trait speech
    extends winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory
  
  /* 4 */ val alerts: alerts with scala.Double = js.native
  /* 2 */ val backgroundCapableMedia: backgroundCapableMedia with scala.Double = js.native
  /* 3 */ val communications: communications with scala.Double = js.native
  /* 1 */ val foregroundOnlyMedia: foregroundOnlyMedia with scala.Double = js.native
  /* 8 */ val gameChat: gameChat with scala.Double = js.native
  /* 6 */ val gameEffects: gameEffects with scala.Double = js.native
  /* 7 */ val gameMedia: gameMedia with scala.Double = js.native
  /* 11 */ val media: media with scala.Double = js.native
  /* 10 */ val movie: movie with scala.Double = js.native
  /* 0 */ val other: other with scala.Double = js.native
  /* 5 */ val soundEffects: soundEffects with scala.Double = js.native
  /* 9 */ val speech: speech with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.RenderNs.AudioRenderCategory with scala.Double] = js.native
}

