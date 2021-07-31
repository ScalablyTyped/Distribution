package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for managing media rendering. */
object Render {
  
  @js.native
  sealed trait AudioRenderCategory extends StObject
  /** Describes the purpose of the audio information in an audio stream. */
  @JSGlobal("Windows.Media.Render.AudioRenderCategory")
  @js.native
  object AudioRenderCategory extends StObject {
    
    /** Audio is for system or application notifications, for example ring tones. */
    @js.native
    sealed trait alerts
      extends StObject
         with AudioRenderCategory
    
    /** Audio is for general media, for example audio for video, or streaming audio, and can be played as background. */
    @js.native
    sealed trait backgroundCapableMedia
      extends StObject
         with AudioRenderCategory
    
    /** Audio is for peer-to-peer communications, for example chat or VoIP. */
    @js.native
    sealed trait communications
      extends StObject
         with AudioRenderCategory
    
    /** Audio is for general media, for example audio for video, or streaming audio, but should not be played as background. */
    @js.native
    sealed trait foregroundOnlyMedia
      extends StObject
         with AudioRenderCategory
    
    /** Audio is voice chat for games. */
    @js.native
    sealed trait gameChat
      extends StObject
         with AudioRenderCategory
    
    /** Audio is for game-specific sound effects. */
    @js.native
    sealed trait gameEffects
      extends StObject
         with AudioRenderCategory
    
    /** Audio is background (non-event or ambient) audio for games. */
    @js.native
    sealed trait gameMedia
      extends StObject
         with AudioRenderCategory
    
    /** Audio is media playback. */
    @js.native
    sealed trait media
      extends StObject
         with AudioRenderCategory
    
    /** Audio is movie audio. */
    @js.native
    sealed trait movie
      extends StObject
         with AudioRenderCategory
    
    /** All other streams. */
    @js.native
    sealed trait other
      extends StObject
         with AudioRenderCategory
    
    /** Audio is for sound effects. */
    @js.native
    sealed trait soundEffects
      extends StObject
         with AudioRenderCategory
    
    /** Audio is speech. */
    @js.native
    sealed trait speech
      extends StObject
         with AudioRenderCategory
  }
}
