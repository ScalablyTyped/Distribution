package typings
package atUifabricUtilitiesLib.libSelectionSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionOptions extends js.Object {
  var canSelectItem: js.UndefOr[
    js.Function2[
      /* item */ atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.IObjectWithKey, 
      /* index */ js.UndefOr[scala.Double], 
      scala.Boolean
    ]
  ] = js.undefined
  var getKey: js.UndefOr[
    js.Function2[
      /* item */ atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.IObjectWithKey, 
      /* index */ js.UndefOr[scala.Double], 
      java.lang.String | scala.Double
    ]
  ] = js.undefined
  var onSelectionChanged: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var selectionMode: js.UndefOr[atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.SelectionMode] = js.undefined
}

object ISelectionOptions {
  @scala.inline
  def apply(
    canSelectItem: (/* item */ atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.IObjectWithKey, /* index */ js.UndefOr[scala.Double]) => scala.Boolean = null,
    getKey: (/* item */ atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.IObjectWithKey, /* index */ js.UndefOr[scala.Double]) => java.lang.String | scala.Double = null,
    onSelectionChanged: () => scala.Unit = null,
    selectionMode: atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.SelectionMode = null
  ): ISelectionOptions = {
    val __obj = js.Dynamic.literal()
    if (canSelectItem != null) __obj.updateDynamic("canSelectItem")(js.Any.fromFunction2(canSelectItem))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction2(getKey))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction0(onSelectionChanged))
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    __obj.asInstanceOf[ISelectionOptions]
  }
}

