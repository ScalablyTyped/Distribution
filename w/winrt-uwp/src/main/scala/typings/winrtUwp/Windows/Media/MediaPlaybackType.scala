package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaPlaybackType extends StObject
/** Defines values for the types of media playback. */
@JSGlobal("Windows.Media.MediaPlaybackType")
@js.native
object MediaPlaybackType extends StObject {
  
  /** The media type is an image. */
  @js.native
  sealed trait image
    extends StObject
       with MediaPlaybackType
  
  /** The media type is audio music. */
  @js.native
  sealed trait music
    extends StObject
       with MediaPlaybackType
  
  /** The media type is unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with MediaPlaybackType
  
  /** The media type is video. */
  @js.native
  sealed trait video
    extends StObject
       with MediaPlaybackType
}
