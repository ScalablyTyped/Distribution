package typings.winrtUwp.global.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoImportFindItemsResult::SelectionChanged event. */
@JSGlobal("Windows.Media.Import.PhotoImportSelectionChangedEventArgs")
@js.native
abstract class PhotoImportSelectionChangedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Import.PhotoImportSelectionChangedEventArgs {
  /** Gets a value indicating whether no items are selected after the selection has changed. */
  /* CompleteClass */
  override var isSelectionEmpty: Boolean = js.native
}

