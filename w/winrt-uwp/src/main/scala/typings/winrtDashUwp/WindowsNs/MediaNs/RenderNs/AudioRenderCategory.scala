package typings.winrtDashUwp.WindowsNs.MediaNs.RenderNs

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
  sealed trait alerts extends AudioRenderCategory
  
  /** Audio is for general media, for example audio for video, or streaming audio, and can be played as background. */
  @js.native
  sealed trait backgroundCapableMedia extends AudioRenderCategory
  
  /** Audio is for peer-to-peer communications, for example chat or VoIP. */
  @js.native
  sealed trait communications extends AudioRenderCategory
  
  /** Audio is for general media, for example audio for video, or streaming audio, but should not be played as background. */
  @js.native
  sealed trait foregroundOnlyMedia extends AudioRenderCategory
  
  /** Audio is voice chat for games. */
  @js.native
  sealed trait gameChat extends AudioRenderCategory
  
  /** Audio is for game-specific sound effects. */
  @js.native
  sealed trait gameEffects extends AudioRenderCategory
  
  /** Audio is background (non-event or ambient) audio for games. */
  @js.native
  sealed trait gameMedia extends AudioRenderCategory
  
  /** Audio is media playback. */
  @js.native
  sealed trait media extends AudioRenderCategory
  
  /** Audio is movie audio. */
  @js.native
  sealed trait movie extends AudioRenderCategory
  
  /** All other streams. */
  @js.native
  sealed trait other extends AudioRenderCategory
  
  /** Audio is for sound effects. */
  @js.native
  sealed trait soundEffects extends AudioRenderCategory
  
  /** Audio is speech. */
  @js.native
  sealed trait speech extends AudioRenderCategory
  
  /* 4 */ val alerts: typings.winrtDashUwp.WindowsNs.MediaNs.RenderNs.AudioRenderCategory.alerts with Double = js.native
  /* 2 */ val backgroundCapableMedia: typings.winrtDashUwp.WindowsNs.MediaNs.RenderNs.AudioRenderCategory.backgroundCapableMedia with Double = js.native
  /* 3 */ val communications: typings.winrtDashUwp.WindowsNs.MediaNs.RenderNs.AudioRenderCategory.communications with Double = js.native
  /* 1 */ val foregroundOnlyMedia: typings.winrtDashUwp.WindowsNs.MediaNs.RenderNs.AudioRenderCategory.foregroundOnlyMedia with Double = js.native
  /* 8 */ val gameChat: typings.winrtDashUwp.WindowsNs.MediaNs.RenderNs.AudioRenderCategory.gameChat with Double = js.native
  /* 6 */ val gameEffects: typings.winrtDashUwp.WindowsNs.MediaNs.RenderNs.AudioRenderCategory.gameEffects with Double = js.native
  /* 7 */ val gameMedia: typings.winrtDashUwp.WindowsNs.MediaNs.RenderNs.AudioRenderCategory.gameMedia with Double = js.native
  /* 11 */ val media: typings.winrtDashUwp.WindowsNs.MediaNs.RenderNs.AudioRenderCategory.media with Double = js.native
  /* 10 */ val movie: typings.winrtDashUwp.WindowsNs.MediaNs.RenderNs.AudioRenderCategory.movie with Double = js.native
  /* 0 */ val other: typings.winrtDashUwp.WindowsNs.MediaNs.RenderNs.AudioRenderCategory.other with Double = js.native
  /* 5 */ val soundEffects: typings.winrtDashUwp.WindowsNs.MediaNs.RenderNs.AudioRenderCategory.soundEffects with Double = js.native
  /* 9 */ val speech: typings.winrtDashUwp.WindowsNs.MediaNs.RenderNs.AudioRenderCategory.speech with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioRenderCategory with Double] = js.native
}

