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
  
  val currentlyUnavailable: currentlyUnavailable with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val incomplete: incomplete with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.StreamedFileFailureMode with java.lang.String
  ] = js.native
}

