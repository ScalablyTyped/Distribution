package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionTypesMod {
  
  @JSImport("@uifabric/utilities/lib/selection/Selection.types", "SELECTION_CHANGE")
  @js.native
  val SELECTION_CHANGE: /* "change" */ String = js.native
  
  @js.native
  sealed trait SelectionDirection extends StObject
  @JSImport("@uifabric/utilities/lib/selection/Selection.types", "SelectionDirection")
  @js.native
  object SelectionDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SelectionDirection with Double] = js.native
    
    @js.native
    sealed trait horizontal extends SelectionDirection
    /* 0 */ val horizontal: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal with Double = js.native
    
    @js.native
    sealed trait vertical extends SelectionDirection
    /* 1 */ val vertical: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical with Double = js.native
  }
  
  @js.native
  sealed trait SelectionMode extends StObject
  @JSImport("@uifabric/utilities/lib/selection/Selection.types", "SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SelectionMode with Double] = js.native
    
    @js.native
    sealed trait multiple extends SelectionMode
    /* 2 */ val multiple: typings.uifabricUtilities.selectionTypesMod.SelectionMode.multiple with Double = js.native
    
    @js.native
    sealed trait none extends SelectionMode
    /* 0 */ val none: typings.uifabricUtilities.selectionTypesMod.SelectionMode.none with Double = js.native
    
    @js.native
    sealed trait single extends SelectionMode
    /* 1 */ val single: typings.uifabricUtilities.selectionTypesMod.SelectionMode.single with Double = js.native
  }
  
  @js.native
  trait IObjectWithKey extends StObject {
    
    var key: js.UndefOr[String | Double] = js.native
  }
  object IObjectWithKey {
    
    @scala.inline
    def apply(): IObjectWithKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IObjectWithKey]
    }
    
    @scala.inline
    implicit class IObjectWithKeyMutableBuilder[Self <: IObjectWithKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  @js.native
  trait ISelection[TItem] extends StObject {
    
    def canSelectItem(item: TItem): Boolean = js.native
    def canSelectItem(item: TItem, index: Double): Boolean = js.native
    
    var count: Double = js.native
    
    def getItems(): js.Array[TItem] = js.native
    
    def getSelectedCount(): Double = js.native
    
    def getSelectedIndices(): js.Array[Double] = js.native
    
    def getSelection(): js.Array[TItem] = js.native
    
    def isAllSelected(): Boolean = js.native
    
    def isIndexSelected(index: Double): Boolean = js.native
    
    def isKeySelected(key: String): Boolean = js.native
    
    var isModal: js.UndefOr[js.Function0[Boolean]] = js.native
    
    def isRangeSelected(fromIndex: Double, count: Double): Boolean = js.native
    
    var mode: SelectionMode = js.native
    
    def selectToIndex(index: Double): Unit = js.native
    def selectToIndex(index: Double, clearSelection: Boolean): Unit = js.native
    
    def selectToKey(key: String): Unit = js.native
    def selectToKey(key: String, clearSelection: Boolean): Unit = js.native
    
    def setAllSelected(isAllSelected: Boolean): Unit = js.native
    
    def setChangeEvents(isEnabled: Boolean): Unit = js.native
    def setChangeEvents(isEnabled: Boolean, suppressChange: Boolean): Unit = js.native
    
    def setIndexSelected(index: Double, isSelected: Boolean, shouldAnchor: Boolean): Unit = js.native
    
    def setItems(items: js.Array[TItem], shouldClear: Boolean): Unit = js.native
    
    def setKeySelected(key: String, isSelected: Boolean, shouldAnchor: Boolean): Unit = js.native
    
    var setModal: js.UndefOr[js.Function1[/* isModal */ Boolean, Unit]] = js.native
    
    def toggleAllSelected(): Unit = js.native
    
    def toggleIndexSelected(index: Double): Unit = js.native
    
    def toggleKeySelected(key: String): Unit = js.native
    
    def toggleRangeSelected(fromIndex: Double, count: Double): Unit = js.native
  }
}
