package typings.winrtDashUwp.Windows.Media.Core

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
  
  /* 1 */ val dataFormatError: typings.winrtDashUwp.Windows.Media.Core.TimedMetadataTrackErrorCode.dataFormatError with Double = js.native
  /* 3 */ val internalError: typings.winrtDashUwp.Windows.Media.Core.TimedMetadataTrackErrorCode.internalError with Double = js.native
  /* 2 */ val networkError: typings.winrtDashUwp.Windows.Media.Core.TimedMetadataTrackErrorCode.networkError with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Media.Core.TimedMetadataTrackErrorCode.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedMetadataTrackErrorCode with Double] = js.native
}

