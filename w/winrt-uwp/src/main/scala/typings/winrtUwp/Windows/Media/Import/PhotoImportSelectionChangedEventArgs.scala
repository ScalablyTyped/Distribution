package typings.winrtUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoImportFindItemsResult::SelectionChanged event. */
@js.native
trait PhotoImportSelectionChangedEventArgs extends js.Object {
  /** Gets a value indicating whether no items are selected after the selection has changed. */
  var isSelectionEmpty: Boolean = js.native
}

object PhotoImportSelectionChangedEventArgs {
  @scala.inline
  def apply(isSelectionEmpty: Boolean): PhotoImportSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(isSelectionEmpty = isSelectionEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportSelectionChangedEventArgs]
  }
  @scala.inline
  implicit class PhotoImportSelectionChangedEventArgsOps[Self <: PhotoImportSelectionChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setIsSelectionEmpty(value: Boolean): Self = this.set("isSelectionEmpty", value.asInstanceOf[js.Any])
  }
  
}

