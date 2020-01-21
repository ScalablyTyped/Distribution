package typings.winrtUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoImportFindItemsResult::ItemImported event. */
@JSGlobal("Windows.Media.Import.PhotoImportItemImportedEventArgs")
@js.native
abstract class PhotoImportItemImportedEventArgs () extends js.Object {
  /** Gets the imported item associated with the PhotoImportFindItemsResult::ItemImported event. */
  var importedItem: PhotoImportItem = js.native
}

