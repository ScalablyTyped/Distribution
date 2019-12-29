package typings.winrtDashUwp.Windows.Media

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides classes for managing media rendering. */
@JSGlobal("Windows.Media.Render")
@js.native
object Render extends js.Object {
  @js.native
  sealed trait AudioRenderCategory extends js.Object
  
  /** Describes the purpose of the audio information in an audio stream. */
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AudioRenderCategory with Double] = js.native
    /* 4 */ @js.native
    object alerts extends TopLevel[alerts with Double]
    
    /* 2 */ @js.native
    object backgroundCapableMedia extends TopLevel[backgroundCapableMedia with Double]
    
    /* 3 */ @js.native
    object communications extends TopLevel[communications with Double]
    
    /* 1 */ @js.native
    object foregroundOnlyMedia extends TopLevel[foregroundOnlyMedia with Double]
    
    /* 8 */ @js.native
    object gameChat extends TopLevel[gameChat with Double]
    
    /* 6 */ @js.native
    object gameEffects extends TopLevel[gameEffects with Double]
    
    /* 7 */ @js.native
    object gameMedia extends TopLevel[gameMedia with Double]
    
    /* 11 */ @js.native
    object media extends TopLevel[media with Double]
    
    /* 10 */ @js.native
    object movie extends TopLevel[movie with Double]
    
    /* 0 */ @js.native
    object other extends TopLevel[other with Double]
    
    /* 5 */ @js.native
    object soundEffects extends TopLevel[soundEffects with Double]
    
    /* 9 */ @js.native
    object speech extends TopLevel[speech with Double]
    
  }
  
}

