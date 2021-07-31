package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaPlayerAudioCategory extends StObject
/** Specifies the types of audio that can be played by a media player. */
@JSGlobal("Windows.Media.Playback.MediaPlayerAudioCategory")
@js.native
object MediaPlayerAudioCategory extends StObject {
  
  /** The audio is used for alerts. */
  @js.native
  sealed trait alerts
    extends StObject
       with MediaPlayerAudioCategory
  
  /** The audio is used for communications. */
  @js.native
  sealed trait communications
    extends StObject
       with MediaPlayerAudioCategory
  
  /** The audio is used for game chat. */
  @js.native
  sealed trait gameChat
    extends StObject
       with MediaPlayerAudioCategory
  
  /** The audio is a game effect. */
  @js.native
  sealed trait gameEffects
    extends StObject
       with MediaPlayerAudioCategory
  
  /** The audio is game media, such as background music. */
  @js.native
  sealed trait gameMedia
    extends StObject
       with MediaPlayerAudioCategory
  
  /** The audio is for media playback. */
  @js.native
  sealed trait media
    extends StObject
       with MediaPlayerAudioCategory
  
  /** The audio is for movie playback. */
  @js.native
  sealed trait movie
    extends StObject
       with MediaPlayerAudioCategory
  
  /** The audio type is not one of the provided enumeration values. */
  @js.native
  sealed trait other
    extends StObject
       with MediaPlayerAudioCategory
  
  /** The audio is a sound effect. */
  @js.native
  sealed trait soundEffects
    extends StObject
       with MediaPlayerAudioCategory
  
  /** The audio is used for speech. */
  @js.native
  sealed trait speech
    extends StObject
       with MediaPlayerAudioCategory
}
