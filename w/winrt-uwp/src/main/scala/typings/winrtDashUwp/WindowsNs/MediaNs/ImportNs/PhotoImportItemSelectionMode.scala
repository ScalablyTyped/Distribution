package typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs

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
  sealed trait selectAll extends PhotoImportItemSelectionMode
  
  /** New found items are initially selected. */
  @js.native
  sealed trait selectNew extends PhotoImportItemSelectionMode
  
  /** No found items are initially selected. */
  @js.native
  sealed trait selectNone extends PhotoImportItemSelectionMode
  
  /* 0 */ val selectAll: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportItemSelectionMode.selectAll with Double = js.native
  /* 2 */ val selectNew: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportItemSelectionMode.selectNew with Double = js.native
  /* 1 */ val selectNone: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportItemSelectionMode.selectNone with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportItemSelectionMode with Double] = js.native
}

