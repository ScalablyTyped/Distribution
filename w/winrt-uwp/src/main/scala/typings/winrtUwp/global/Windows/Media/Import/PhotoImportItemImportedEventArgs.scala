package typings.winrtUwp.global.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoImportFindItemsResult::ItemImported event. */
@JSGlobal("Windows.Media.Import.PhotoImportItemImportedEventArgs")
@js.native
abstract class PhotoImportItemImportedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Import.PhotoImportItemImportedEventArgs {
  /** Gets the imported item associated with the PhotoImportFindItemsResult::ItemImported event. */
  /* CompleteClass */
  override var importedItem: typings.winrtUwp.Windows.Media.Import.PhotoImportItem = js.native
}

