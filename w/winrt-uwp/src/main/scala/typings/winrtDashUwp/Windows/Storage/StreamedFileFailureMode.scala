package typings.winrtDashUwp.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Storage.StreamedFileFailureMode.currentlyUnavailable
import typings.winrtDashUwp.Windows.Storage.StreamedFileFailureMode.failed
import typings.winrtDashUwp.Windows.Storage.StreamedFileFailureMode.incomplete
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StreamedFileFailureMode with Double] = js.native
  /* 1 */ @js.native
  object currentlyUnavailable extends TopLevel[currentlyUnavailable with Double]
  
  /* 0 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 2 */ @js.native
  object incomplete extends TopLevel[incomplete with Double]
  
}

