package typings.winrtDashUwp.Windows.Storage

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
  
  /* 1 */ val currentlyUnavailable: typings.winrtDashUwp.Windows.Storage.StreamedFileFailureMode.currentlyUnavailable with Double = js.native
  /* 0 */ val failed: typings.winrtDashUwp.Windows.Storage.StreamedFileFailureMode.failed with Double = js.native
  /* 2 */ val incomplete: typings.winrtDashUwp.Windows.Storage.StreamedFileFailureMode.incomplete with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StreamedFileFailureMode with Double] = js.native
}

