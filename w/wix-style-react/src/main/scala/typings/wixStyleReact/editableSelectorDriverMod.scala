package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.selectorDriverMod.SelectorDriver
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editableSelectorDriverMod {
  
  trait EditableSelectorDriver
    extends StObject
       with BaseDriver {
    
    def addNewRow(label: String): Unit
    
    def clickApprove(): Unit
    
    def clickCancel(): Unit
    
    def deleteButtonAt(index: Double): HTMLElement
    
    def deleteRow(index: Double): Unit
    
    def editButtonAt(index: Double): HTMLElement
    
    def editRow(index: Double, label: String): Unit
    
    def isAddingRow(): Boolean
    
    def isEditing(): Boolean
    
    def isEditingRow(): Boolean
    
    def items(): js.Array[SelectorDriver]
    
    def newRowButton(): HTMLElement
    
    def startAdding(): Unit
    
    def startEditing(index: Double): Unit
    
    def title(): String
    
    def toggleItem(index: Double): String
  }
  object EditableSelectorDriver {
    
    inline def apply(
      addNewRow: String => Unit,
      clickApprove: () => Unit,
      clickCancel: () => Unit,
      deleteButtonAt: Double => HTMLElement,
      deleteRow: Double => Unit,
      editButtonAt: Double => HTMLElement,
      editRow: (Double, String) => Unit,
      exists: () => Boolean,
      isAddingRow: () => Boolean,
      isEditing: () => Boolean,
      isEditingRow: () => Boolean,
      items: () => js.Array[SelectorDriver],
      newRowButton: () => HTMLElement,
      startAdding: () => Unit,
      startEditing: Double => Unit,
      title: () => String,
      toggleItem: Double => String
    ): EditableSelectorDriver = {
      val __obj = js.Dynamic.literal(addNewRow = js.Any.fromFunction1(addNewRow), clickApprove = js.Any.fromFunction0(clickApprove), clickCancel = js.Any.fromFunction0(clickCancel), deleteButtonAt = js.Any.fromFunction1(deleteButtonAt), deleteRow = js.Any.fromFunction1(deleteRow), editButtonAt = js.Any.fromFunction1(editButtonAt), editRow = js.Any.fromFunction2(editRow), exists = js.Any.fromFunction0(exists), isAddingRow = js.Any.fromFunction0(isAddingRow), isEditing = js.Any.fromFunction0(isEditing), isEditingRow = js.Any.fromFunction0(isEditingRow), items = js.Any.fromFunction0(items), newRowButton = js.Any.fromFunction0(newRowButton), startAdding = js.Any.fromFunction0(startAdding), startEditing = js.Any.fromFunction1(startEditing), title = js.Any.fromFunction0(title), toggleItem = js.Any.fromFunction1(toggleItem))
      __obj.asInstanceOf[EditableSelectorDriver]
    }
    
    extension [Self <: EditableSelectorDriver](x: Self) {
      
      inline def setAddNewRow(value: String => Unit): Self = StObject.set(x, "addNewRow", js.Any.fromFunction1(value))
      
      inline def setClickApprove(value: () => Unit): Self = StObject.set(x, "clickApprove", js.Any.fromFunction0(value))
      
      inline def setClickCancel(value: () => Unit): Self = StObject.set(x, "clickCancel", js.Any.fromFunction0(value))
      
      inline def setDeleteButtonAt(value: Double => HTMLElement): Self = StObject.set(x, "deleteButtonAt", js.Any.fromFunction1(value))
      
      inline def setDeleteRow(value: Double => Unit): Self = StObject.set(x, "deleteRow", js.Any.fromFunction1(value))
      
      inline def setEditButtonAt(value: Double => HTMLElement): Self = StObject.set(x, "editButtonAt", js.Any.fromFunction1(value))
      
      inline def setEditRow(value: (Double, String) => Unit): Self = StObject.set(x, "editRow", js.Any.fromFunction2(value))
      
      inline def setIsAddingRow(value: () => Boolean): Self = StObject.set(x, "isAddingRow", js.Any.fromFunction0(value))
      
      inline def setIsEditing(value: () => Boolean): Self = StObject.set(x, "isEditing", js.Any.fromFunction0(value))
      
      inline def setIsEditingRow(value: () => Boolean): Self = StObject.set(x, "isEditingRow", js.Any.fromFunction0(value))
      
      inline def setItems(value: () => js.Array[SelectorDriver]): Self = StObject.set(x, "items", js.Any.fromFunction0(value))
      
      inline def setNewRowButton(value: () => HTMLElement): Self = StObject.set(x, "newRowButton", js.Any.fromFunction0(value))
      
      inline def setStartAdding(value: () => Unit): Self = StObject.set(x, "startAdding", js.Any.fromFunction0(value))
      
      inline def setStartEditing(value: Double => Unit): Self = StObject.set(x, "startEditing", js.Any.fromFunction1(value))
      
      inline def setTitle(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      inline def setToggleItem(value: Double => String): Self = StObject.set(x, "toggleItem", js.Any.fromFunction1(value))
    }
  }
}
