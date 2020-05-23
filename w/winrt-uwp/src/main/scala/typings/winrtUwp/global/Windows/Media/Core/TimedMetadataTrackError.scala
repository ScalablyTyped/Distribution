package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an error that occurred with a timed metadata track. */
@JSGlobal("Windows.Media.Core.TimedMetadataTrackError")
@js.native
abstract class TimedMetadataTrackError ()
  extends typings.winrtUwp.Windows.Media.Core.TimedMetadataTrackError {
  /** Gets the error code associated with the timed metadata track error. */
  /* CompleteClass */
  override var errorCode: typings.winrtUwp.Windows.Media.Core.TimedMetadataTrackErrorCode = js.native
  /** Gets the extended error code for the TimedMetadataTrackError . */
  /* CompleteClass */
  override var extendedError: WinRTError = js.native
}

