package typings.uifabricUtilities.selectionSelectionMod

import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionOptions[TItem] extends js.Object {
  var canSelectItem: js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], Boolean]] = js.undefined
  /** Custom logic to generate item keys. Required if `TItem` does not have a `key` property. */
  var getKey: js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double]] = js.undefined
  var onSelectionChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  var selectionMode: js.UndefOr[SelectionMode] = js.undefined
}

object ISelectionOptions {
  @scala.inline
  def apply[TItem](
    canSelectItem: (/* item */ TItem, /* index */ js.UndefOr[Double]) => Boolean = null,
    getKey: (/* item */ TItem, /* index */ js.UndefOr[Double]) => String | Double = null,
    onSelectionChanged: () => Unit = null,
    selectionMode: SelectionMode = null
  ): ISelectionOptions[TItem] = {
    val __obj = js.Dynamic.literal()
    if (canSelectItem != null) __obj.updateDynamic("canSelectItem")(js.Any.fromFunction2(canSelectItem))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction2(getKey))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction0(onSelectionChanged))
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionOptions[TItem]]
  }
}

