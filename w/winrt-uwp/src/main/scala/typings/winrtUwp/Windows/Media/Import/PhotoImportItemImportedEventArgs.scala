package typings.winrtUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoImportFindItemsResult::ItemImported event. */
trait PhotoImportItemImportedEventArgs extends js.Object {
  /** Gets the imported item associated with the PhotoImportFindItemsResult::ItemImported event. */
  var importedItem: PhotoImportItem
}

object PhotoImportItemImportedEventArgs {
  @scala.inline
  def apply(importedItem: PhotoImportItem): PhotoImportItemImportedEventArgs = {
    val __obj = js.Dynamic.literal(importedItem = importedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportItemImportedEventArgs]
  }
}

