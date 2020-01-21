package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimedMetadataTrackErrorCode extends js.Object

/** Specifies the type of error that occurred with a TimedMetadataTrack . */
@JSGlobal("Windows.Media.Core.TimedMetadataTrackErrorCode")
@js.native
object TimedMetadataTrackErrorCode extends js.Object {
  /** The error was related to the format of the timed metadata track data. */
  @js.native
  sealed trait dataFormatError extends TimedMetadataTrackErrorCode
  
  /** The error occurred internal to the system. */
  @js.native
  sealed trait internalError extends TimedMetadataTrackErrorCode
  
  /** A network error occurred. */
  @js.native
  sealed trait networkError extends TimedMetadataTrackErrorCode
  
  /** No error code. */
  @js.native
  sealed trait none extends TimedMetadataTrackErrorCode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedMetadataTrackErrorCode with Double] = js.native
  /* 1 */ @js.native
  object dataFormatError extends TopLevel[dataFormatError with Double]
  
  /* 3 */ @js.native
  object internalError extends TopLevel[internalError with Double]
  
  /* 2 */ @js.native
  object networkError extends TopLevel[networkError with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

