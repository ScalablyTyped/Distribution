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
  
  val deletingImportedItemsFromSource: deletingImportedItemsFromSource with java.lang.String = js.native
  val findingItems: findingItems with java.lang.String = js.native
  val importingItems: importingItems with java.lang.String = js.native
  val notStarted: notStarted with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportStage with java.lang.String
  ] = js.native
}

