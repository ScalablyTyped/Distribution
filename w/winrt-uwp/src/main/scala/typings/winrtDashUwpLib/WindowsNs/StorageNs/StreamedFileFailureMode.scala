package typings
package winrtDashUwpLib.WindowsNs.StorageNs

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
  sealed trait currentlyUnavailable
    extends winrtDashUwpLib.WindowsNs.StorageNs.StreamedFileFailureMode
  
  /** Streaming the data failed. */
  @js.native
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.StorageNs.StreamedFileFailureMode
  
  /** Streaming the data failed to complete. */
  @js.native
  sealed trait incomplete
    extends winrtDashUwpLib.WindowsNs.StorageNs.StreamedFileFailureMode
  
  /* 1 */ val currentlyUnavailable: currentlyUnavailable with scala.Double = js.native
  /* 0 */ val failed: failed with scala.Double = js.native
  /* 2 */ val incomplete: incomplete with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.StreamedFileFailureMode with scala.Double] = js.native
}

