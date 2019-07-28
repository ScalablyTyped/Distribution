package typings.atUifabricUtilities.libSelectionSelectionMod

import typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.IObjectWithKey
import typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionOptions extends js.Object {
  var canSelectItem: js.UndefOr[js.Function2[/* item */ IObjectWithKey, /* index */ js.UndefOr[Double], Boolean]] = js.undefined
  var getKey: js.UndefOr[
    js.Function2[/* item */ IObjectWithKey, /* index */ js.UndefOr[Double], String | Double]
  ] = js.undefined
  var onSelectionChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  var selectionMode: js.UndefOr[SelectionMode] = js.undefined
}

object ISelectionOptions {
  @scala.inline
  def apply(
    canSelectItem: (/* item */ IObjectWithKey, /* index */ js.UndefOr[Double]) => Boolean = null,
    getKey: (/* item */ IObjectWithKey, /* index */ js.UndefOr[Double]) => String | Double = null,
    onSelectionChanged: () => Unit = null,
    selectionMode: SelectionMode = null
  ): ISelectionOptions = {
    val __obj = js.Dynamic.literal()
    if (canSelectItem != null) __obj.updateDynamic("canSelectItem")(js.Any.fromFunction2(canSelectItem))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction2(getKey))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction0(onSelectionChanged))
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    __obj.asInstanceOf[ISelectionOptions]
  }
}

