package typings.uifabricUtilities.selectionSelectionMod

import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptions<TItem> & std.Required<std.Pick<@uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptions<TItem>, 'getKey'>> */
@js.native
trait ISelectionOptionsWithRequiredGetKey[TItem] extends js.Object {
  
  var canSelectItem: js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], Boolean]] = js.native
  
  /** Custom logic to generate item keys. Required if `TItem` does not have a `key` property. */
  var getKey: (js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double]]) with (js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double]) = js.native
  
  var items: js.UndefOr[js.Array[TItem]] = js.native
  
  var onSelectionChanged: js.UndefOr[js.Function0[Unit]] = js.native
  
  var selectionMode: js.UndefOr[SelectionMode] = js.native
}
object ISelectionOptionsWithRequiredGetKey {
  
  @scala.inline
  def apply[TItem](
    getKey: (js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double]]) with (js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double])
  ): ISelectionOptionsWithRequiredGetKey[TItem] = {
    val __obj = js.Dynamic.literal(getKey = getKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionOptionsWithRequiredGetKey[TItem]]
  }
  
  @scala.inline
  implicit class ISelectionOptionsWithRequiredGetKeyOps[Self <: ISelectionOptionsWithRequiredGetKey[_], TItem] (val x: Self with ISelectionOptionsWithRequiredGetKey[TItem]) extends AnyVal {
    
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
    def setGetKey(
      value: (js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double]]) with (js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double])
    ): Self = this.set("getKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSelectItem(value: (/* item */ TItem, /* index */ js.UndefOr[Double]) => Boolean): Self = this.set("canSelectItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCanSelectItem: Self = this.set("canSelectItem", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[TItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setOnSelectionChanged(value: () => Unit): Self = this.set("onSelectionChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
}
