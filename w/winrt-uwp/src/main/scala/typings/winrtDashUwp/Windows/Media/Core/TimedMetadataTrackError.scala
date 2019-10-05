package typings.winrtDashUwp.Windows.Media.Core

import typings.winrtDashUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an error that occurred with a timed metadata track. */
@JSGlobal("Windows.Media.Core.TimedMetadataTrackError")
@js.native
abstract class TimedMetadataTrackError () extends js.Object {
  /** Gets the error code associated with the timed metadata track error. */
  var errorCode: TimedMetadataTrackErrorCode = js.native
  /** Gets the extended error code for the TimedMetadataTrackError . */
  var extendedError: WinRTError = js.native
}

