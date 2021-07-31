package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaPlaybackItemErrorCode extends StObject
/** Specifies the type of error that occurred while opening a MediaPlaybackItem . */
@JSGlobal("Windows.Media.Playback.MediaPlaybackItemErrorCode")
@js.native
object MediaPlaybackItemErrorCode extends StObject {
  
  /** Opening of the playback item was aborted. */
  @js.native
  sealed trait aborted
    extends StObject
       with MediaPlaybackItemErrorCode
  
  /** An error occurred while decoding the playback item. */
  @js.native
  sealed trait decodeError
    extends StObject
       with MediaPlaybackItemErrorCode
  
  /** An error occurred related to the playback item's encryption. */
  @js.native
  sealed trait encryptionError
    extends StObject
       with MediaPlaybackItemErrorCode
  
  /** A network error occurred while opening the playback item. */
  @js.native
  sealed trait networkError
    extends StObject
       with MediaPlaybackItemErrorCode
  
  /** No error code. */
  @js.native
  sealed trait none
    extends StObject
       with MediaPlaybackItemErrorCode
  
  /** The media source of the playback item is not supported. */
  @js.native
  sealed trait sourceNotSupportedError
    extends StObject
       with MediaPlaybackItemErrorCode
}
