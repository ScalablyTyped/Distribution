package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

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
  sealed trait dataFormatError
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataTrackErrorCode
  
  /** The error occurred internal to the system. */
  @js.native
  sealed trait internalError
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataTrackErrorCode
  
  /** A network error occurred. */
  @js.native
  sealed trait networkError
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataTrackErrorCode
  
  /** No error code. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataTrackErrorCode
  
  val dataFormatError: dataFormatError with java.lang.String = js.native
  val internalError: internalError with java.lang.String = js.native
  val networkError: networkError with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataTrackErrorCode with java.lang.String
  ] = js.native
}

