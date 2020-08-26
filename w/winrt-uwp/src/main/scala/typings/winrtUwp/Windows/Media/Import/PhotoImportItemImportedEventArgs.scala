package typings.winrtUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoImportFindItemsResult::ItemImported event. */
@js.native
trait PhotoImportItemImportedEventArgs extends js.Object {
  /** Gets the imported item associated with the PhotoImportFindItemsResult::ItemImported event. */
  var importedItem: PhotoImportItem = js.native
}

object PhotoImportItemImportedEventArgs {
  @scala.inline
  def apply(importedItem: PhotoImportItem): PhotoImportItemImportedEventArgs = {
    val __obj = js.Dynamic.literal(importedItem = importedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportItemImportedEventArgs]
  }
  @scala.inline
  implicit class PhotoImportItemImportedEventArgsOps[Self <: PhotoImportItemImportedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImportedItem(value: PhotoImportItem): Self = this.set("importedItem", value.asInstanceOf[js.Any])
  }
  
}

