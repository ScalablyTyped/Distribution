package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaPlayerError extends StObject
/** Indicates possible media player errors. */
@JSGlobal("Windows.Media.Playback.MediaPlayerError")
@js.native
object MediaPlayerError extends StObject {
  
  /** The last operation was aborted. */
  @js.native
  sealed trait aborted
    extends StObject
       with MediaPlayerError
  
  /** A media decoding error occurred. */
  @js.native
  sealed trait decodingError
    extends StObject
       with MediaPlayerError
  
  /** A network error occurred. */
  @js.native
  sealed trait networkError
    extends StObject
       with MediaPlayerError
  
  /** The media type is not supported. */
  @js.native
  sealed trait sourceNotSupported
    extends StObject
       with MediaPlayerError
  
  /** The error is unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with MediaPlayerError
}
