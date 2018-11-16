package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportItemSelectionMode extends js.Object

/** Specifies the initial selection state for items that are discovered using PhotoImportSession::FindItemsAsync . */
@JSGlobal("Windows.Media.Import.PhotoImportItemSelectionMode")
@js.native
object PhotoImportItemSelectionMode extends js.Object {
  /** All found items are initially selected. */
  @js.native
  sealed trait selectAll
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportItemSelectionMode
  
  /** New found items are initially selected. */
  @js.native
  sealed trait selectNew
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportItemSelectionMode
  
  /** No found items are initially selected. */
  @js.native
  sealed trait selectNone
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportItemSelectionMode
  
  val selectAll: selectAll with java.lang.String = js.native
  val selectNew: selectNew with java.lang.String = js.native
  val selectNone: selectNone with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportItemSelectionMode with java.lang.String
  ] = js.native
}

