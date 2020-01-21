package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlaybackItemErrorCode with Double] = js.native
  /* 1 */ @js.native
  object aborted extends TopLevel[aborted with Double]
  
  /* 3 */ @js.native
  object decodeError extends TopLevel[decodeError with Double]
  
  /* 5 */ @js.native
  object encryptionError extends TopLevel[encryptionError with Double]
  
  /* 2 */ @js.native
  object networkError extends TopLevel[networkError with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 4 */ @js.native
  object sourceNotSupportedError extends TopLevel[sourceNotSupportedError with Double]
  
}

