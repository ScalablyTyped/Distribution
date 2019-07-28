package typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs

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
  sealed trait deletingImportedItemsFromSource extends PhotoImportStage
  
  /** Items are currently being found. */
  @js.native
  sealed trait findingItems extends PhotoImportStage
  
  /** Items are currently being imported */
  @js.native
  sealed trait importingItems extends PhotoImportStage
  
  /** The photo import process has not started. */
  @js.native
  sealed trait notStarted extends PhotoImportStage
  
  /* 3 */ val deletingImportedItemsFromSource: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportStage.deletingImportedItemsFromSource with Double = js.native
  /* 1 */ val findingItems: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportStage.findingItems with Double = js.native
  /* 2 */ val importingItems: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportStage.importingItems with Double = js.native
  /* 0 */ val notStarted: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportStage.notStarted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportStage with Double] = js.native
}

