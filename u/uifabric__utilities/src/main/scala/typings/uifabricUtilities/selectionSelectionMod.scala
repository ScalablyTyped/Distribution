package typings.uifabricUtilities

import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionSelectionMod {
  
  @JSImport("@uifabric/utilities/lib/selection/Selection", "Selection")
  @js.native
  class Selection[TItem] protected ()
    extends StObject
       with ISelection[TItem] {
    /**
      * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
      * object with a `getKey` implementation. Providing options is optional otherwise.
      * (At most one `options` object is accepted.)
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: js.Array[js.Any | ISelectionOptions[TItem] | ISelectionOptionsWithRequiredGetKey[TItem]]) = this()
    
    /* private */ var _anchoredIndex: js.Any = js.native
    
    /* private */ var _canSelectItem: js.Any = js.native
    
    /* private */ var _change: js.Any = js.native
    
    /* private */ var _changeEventSuppressionCount: js.Any = js.native
    
    /* private */ var _exemptedCount: js.Any = js.native
    
    /* private */ var _exemptedIndices: js.Any = js.native
    
    /* private */ var _getKey: js.Any = js.native
    
    /* private */ var _hasChanged: js.Any = js.native
    
    /* private */ var _isAllSelected: js.Any = js.native
    
    /* private */ var _isModal: js.Any = js.native
    
    /* private */ var _items: js.Any = js.native
    
    /* private */ var _keyToIndexMap: js.Any = js.native
    
    /* private */ var _onSelectionChanged: js.Any = js.native
    
    /* private */ var _selectedIndices: js.Any = js.native
    
    /* private */ var _selectedItems: js.Any = js.native
    
    /* private */ var _setAllSelected: js.Any = js.native
    
    /* private */ var _unselectableCount: js.Any = js.native
    
    /* private */ var _unselectableIndices: js.Any = js.native
    
    /* private */ var _updateCount: js.Any = js.native
    
    def getKey(item: TItem): String = js.native
    def getKey(item: TItem, index: Double): String = js.native
    
    @JSName("isModal")
    def isModal_MSelection(): Boolean = js.native
    
    /**
      * Selection needs the items, call this method to set them. If the set
      * of items is the same, this will re-evaluate selection and index maps.
      * Otherwise, shouldClear should be set to true, so that selection is
      * cleared.
      */
    def setItems(items: js.Array[TItem]): Unit = js.native
    
    @JSName("setModal")
    def setModal_MSelection(isModal: Boolean): Unit = js.native
  }
  
  trait ISelectionOptions[TItem] extends StObject {
    
    var canSelectItem: js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], Boolean]] = js.undefined
    
    /** Custom logic to generate item keys. Required if `TItem` does not have a `key` property. */
    var getKey: js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double]] = js.undefined
    
    var items: js.UndefOr[js.Array[TItem]] = js.undefined
    
    var onSelectionChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var selectionMode: js.UndefOr[SelectionMode] = js.undefined
  }
  object ISelectionOptions {
    
    inline def apply[TItem](): ISelectionOptions[TItem] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISelectionOptions[TItem]]
    }
    
    extension [Self <: ISelectionOptions[?], TItem](x: Self & ISelectionOptions[TItem]) {
      
      inline def setCanSelectItem(value: (/* item */ TItem, /* index */ js.UndefOr[Double]) => Boolean): Self = StObject.set(x, "canSelectItem", js.Any.fromFunction2(value))
      
      inline def setCanSelectItemUndefined: Self = StObject.set(x, "canSelectItem", js.undefined)
      
      inline def setGetKey(value: (/* item */ TItem, /* index */ js.UndefOr[Double]) => String | Double): Self = StObject.set(x, "getKey", js.Any.fromFunction2(value))
      
      inline def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
      
      inline def setItems(value: js.Array[TItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: TItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setOnSelectionChanged(value: () => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction0(value))
      
      inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
      
      inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    }
  }
  
  /* Inlined @uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptions<TItem> & std.Required<std.Pick<@uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptions<TItem>, 'getKey'>> */
  trait ISelectionOptionsWithRequiredGetKey[TItem] extends StObject {
    
    var canSelectItem: js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], Boolean]] = js.undefined
    
    /** Custom logic to generate item keys. Required if `TItem` does not have a `key` property. */
    var getKey: (js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double]]) & (js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double])
    
    var items: js.UndefOr[js.Array[TItem]] = js.undefined
    
    var onSelectionChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var selectionMode: js.UndefOr[SelectionMode] = js.undefined
  }
  object ISelectionOptionsWithRequiredGetKey {
    
    inline def apply[TItem](
      getKey: (js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double]]) & (js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double])
    ): ISelectionOptionsWithRequiredGetKey[TItem] = {
      val __obj = js.Dynamic.literal(getKey = getKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectionOptionsWithRequiredGetKey[TItem]]
    }
    
    extension [Self <: ISelectionOptionsWithRequiredGetKey[?], TItem](x: Self & ISelectionOptionsWithRequiredGetKey[TItem]) {
      
      inline def setCanSelectItem(value: (/* item */ TItem, /* index */ js.UndefOr[Double]) => Boolean): Self = StObject.set(x, "canSelectItem", js.Any.fromFunction2(value))
      
      inline def setCanSelectItemUndefined: Self = StObject.set(x, "canSelectItem", js.undefined)
      
      inline def setGetKey(
        value: (js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double]]) & (js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double])
      ): Self = StObject.set(x, "getKey", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[TItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: TItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setOnSelectionChanged(value: () => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction0(value))
      
      inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
      
      inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    }
  }
}
