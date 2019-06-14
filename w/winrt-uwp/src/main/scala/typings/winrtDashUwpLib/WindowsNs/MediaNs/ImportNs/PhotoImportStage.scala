package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportStage extends js.Object

/** Specifies the stages of the photo import process. */
@JSGlobal("Windows.Media.Import.PhotoImportStage")
@js.native
object PhotoImportStage extends js.Object {
  /** Imported items are currently being deleted from the source. */
  @js.native
  sealed trait deletingImportedItemsFromSource
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportStage
  
  /** Items are currently being found. */
  @js.native
  sealed trait findingItems
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportStage
  
  /** Items are currently being imported */
  @js.native
  sealed trait importingItems
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportStage
  
  /** The photo import process has not started. */
  @js.native
  sealed trait notStarted
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportStage
  
  /* 3 */ val deletingImportedItemsFromSource: deletingImportedItemsFromSource with scala.Double = js.native
  /* 1 */ val findingItems: findingItems with scala.Double = js.native
  /* 2 */ val importingItems: importingItems with scala.Double = js.native
  /* 0 */ val notStarted: notStarted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportStage with scala.Double] = js.native
}

