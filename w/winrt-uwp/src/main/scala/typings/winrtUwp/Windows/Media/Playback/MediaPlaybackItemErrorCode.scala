package typings.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaPlaybackItemErrorCode extends js.Object

/** Specifies the type of error that occurred while opening a MediaPlaybackItem . */
@JSGlobal("Windows.Media.Playback.MediaPlaybackItemErrorCode")
@js.native
object MediaPlaybackItemErrorCode extends js.Object {
  /** Opening of the playback item was aborted. */
  @js.native
  sealed trait aborted extends MediaPlaybackItemErrorCode
  
  /** An error occurred while decoding the playback item. */
  @js.native
  sealed trait decodeError extends MediaPlaybackItemErrorCode
  
  /** An error occurred related to the playback item's encryption. */
  @js.native
  sealed trait encryptionError extends MediaPlaybackItemErrorCode
  
  /** A network error occurred while opening the playback item. */
  @js.native
  sealed trait networkError extends MediaPlaybackItemErrorCode
  
  /** No error code. */
  @js.native
  sealed trait none extends MediaPlaybackItemErrorCode
  
  /** The media source of the playback item is not supported. */
  @js.native
  sealed trait sourceNotSupportedError extends MediaPlaybackItemErrorCode
  
}

