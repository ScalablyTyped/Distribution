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
  
  val currentlyUnavailable: currentlyUnavailable with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val incomplete: incomplete with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.StreamedFileFailureMode with java.lang.String] = js.native
}

