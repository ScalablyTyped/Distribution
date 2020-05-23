package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamedFileFailureMode extends js.Object

/** Indicates the reason that data could not be streamed. */
@JSGlobal("Windows.Storage.StreamedFileFailureMode")
@js.native
object StreamedFileFailureMode extends js.Object {
  /** The data could not be accessed. */
  @js.native
  sealed trait currentlyUnavailable extends StreamedFileFailureMode
  
  /** Streaming the data failed. */
  @js.native
  sealed trait failed extends StreamedFileFailureMode
  
  /** Streaming the data failed to complete. */
  @js.native
  sealed trait incomplete extends StreamedFileFailureMode
  
}

