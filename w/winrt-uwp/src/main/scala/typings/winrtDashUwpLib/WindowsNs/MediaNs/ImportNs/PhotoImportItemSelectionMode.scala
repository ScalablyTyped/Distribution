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
  
  /* 0 */ val selectAll: selectAll with scala.Double = js.native
  /* 2 */ val selectNew: selectNew with scala.Double = js.native
  /* 1 */ val selectNone: selectNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportItemSelectionMode with scala.Double
  ] = js.native
}

