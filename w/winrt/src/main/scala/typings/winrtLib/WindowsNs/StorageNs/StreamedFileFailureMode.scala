package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamedFileFailureMode extends js.Object

@JSGlobal("Windows.Storage.StreamedFileFailureMode")
@js.native
object StreamedFileFailureMode extends js.Object {
  @js.native
  sealed trait currentlyUnavailable
    extends winrtLib.WindowsNs.StorageNs.StreamedFileFailureMode
  
  @js.native
  sealed trait failed
    extends winrtLib.WindowsNs.StorageNs.StreamedFileFailureMode
  
  @js.native
  sealed trait incomplete
    extends winrtLib.WindowsNs.StorageNs.StreamedFileFailureMode
  
  /* 1 */ val currentlyUnavailable: currentlyUnavailable with scala.Double = js.native
  /* 0 */ val failed: failed with scala.Double = js.native
  /* 2 */ val incomplete: incomplete with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.StreamedFileFailureMode with scala.Double] = js.native
}

