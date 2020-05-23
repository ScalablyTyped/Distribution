package typings.winrtUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoImportFindItemsResult::SelectionChanged event. */
trait PhotoImportSelectionChangedEventArgs extends js.Object {
  /** Gets a value indicating whether no items are selected after the selection has changed. */
  var isSelectionEmpty: Boolean
}

object PhotoImportSelectionChangedEventArgs {
  @scala.inline
  def apply(isSelectionEmpty: Boolean): PhotoImportSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(isSelectionEmpty = isSelectionEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportSelectionChangedEventArgs]
  }
}

