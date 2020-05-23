package typings.uifabricUtilities.selectionSelectionMod

import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptions<TItem> & std.Required<std.Pick<@uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptions<TItem>, 'getKey'>> */
@js.native
trait ISelectionOptionsWithRequiredGetKey[TItem] extends js.Object {
  var canSelectItem: js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], Boolean]] = js.native
  /** Custom logic to generate item keys. Required if `TItem` does not have a `key` property. */
  var getKey: js.UndefOr[js.Function2[/* item */ TItem, js.UndefOr[Double], Double | String]] = js.native
  var items: js.UndefOr[js.Array[TItem]] = js.native
  var onSelectionChanged: js.UndefOr[js.Function0[Unit]] = js.native
  var selectionMode: js.UndefOr[SelectionMode] = js.native
}

