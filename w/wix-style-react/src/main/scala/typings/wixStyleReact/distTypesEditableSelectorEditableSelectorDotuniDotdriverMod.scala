package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.distTypesSelectorSelectorDotuniDotdriverMod.SelectorUniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEditableSelectorEditableSelectorDotuniDotdriverMod {
  
  trait EditableSelectorUniDriver
    extends StObject
       with BaseUniDriver {
    
    def addNewRow(label: String): js.Promise[Unit]
    
    def clickApprove(): js.Promise[Unit]
    
    def clickCancel(): js.Promise[Unit]
    
    def deleteButtonAt(index: Double): js.Promise[HTMLElement]
    
    def deleteRow(index: Double): js.Promise[Unit]
    
    def editButtonAt(index: Double): js.Promise[HTMLElement]
    
    def editRow(index: Double, label: String): js.Promise[Unit]
    
    def isAddingRow(): js.Promise[Boolean]
    
    def isEditing(): js.Promise[Boolean]
    
    def isEditingRow(): js.Promise[Boolean]
    
    def items(): js.Array[SelectorUniDriver]
    
    def newRowButton(): js.Promise[HTMLElement]
    
    def startAdding(): js.Promise[Unit]
    
    def startEditing(index: Double): js.Promise[Unit]
    
    def title(): js.Promise[String]
    
    def toggleItem(index: Double): js.Promise[String]
  }
  object EditableSelectorUniDriver {
    
    inline def apply(
      addNewRow: String => js.Promise[Unit],
      click: () => js.Promise[Unit],
      clickApprove: () => js.Promise[Unit],
      clickCancel: () => js.Promise[Unit],
      deleteButtonAt: Double => js.Promise[HTMLElement],
      deleteRow: Double => js.Promise[Unit],
      editButtonAt: Double => js.Promise[HTMLElement],
      editRow: (Double, String) => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      isAddingRow: () => js.Promise[Boolean],
      isEditing: () => js.Promise[Boolean],
      isEditingRow: () => js.Promise[Boolean],
      items: () => js.Array[SelectorUniDriver],
      newRowButton: () => js.Promise[HTMLElement],
      startAdding: () => js.Promise[Unit],
      startEditing: Double => js.Promise[Unit],
      title: () => js.Promise[String],
      toggleItem: Double => js.Promise[String]
    ): EditableSelectorUniDriver = {
      val __obj = js.Dynamic.literal(addNewRow = js.Any.fromFunction1(addNewRow), click = js.Any.fromFunction0(click), clickApprove = js.Any.fromFunction0(clickApprove), clickCancel = js.Any.fromFunction0(clickCancel), deleteButtonAt = js.Any.fromFunction1(deleteButtonAt), deleteRow = js.Any.fromFunction1(deleteRow), editButtonAt = js.Any.fromFunction1(editButtonAt), editRow = js.Any.fromFunction2(editRow), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), isAddingRow = js.Any.fromFunction0(isAddingRow), isEditing = js.Any.fromFunction0(isEditing), isEditingRow = js.Any.fromFunction0(isEditingRow), items = js.Any.fromFunction0(items), newRowButton = js.Any.fromFunction0(newRowButton), startAdding = js.Any.fromFunction0(startAdding), startEditing = js.Any.fromFunction1(startEditing), title = js.Any.fromFunction0(title), toggleItem = js.Any.fromFunction1(toggleItem))
      __obj.asInstanceOf[EditableSelectorUniDriver]
    }
    
    extension [Self <: EditableSelectorUniDriver](x: Self) {
      
      inline def setAddNewRow(value: String => js.Promise[Unit]): Self = StObject.set(x, "addNewRow", js.Any.fromFunction1(value))
      
      inline def setClickApprove(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickApprove", js.Any.fromFunction0(value))
      
      inline def setClickCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickCancel", js.Any.fromFunction0(value))
      
      inline def setDeleteButtonAt(value: Double => js.Promise[HTMLElement]): Self = StObject.set(x, "deleteButtonAt", js.Any.fromFunction1(value))
      
      inline def setDeleteRow(value: Double => js.Promise[Unit]): Self = StObject.set(x, "deleteRow", js.Any.fromFunction1(value))
      
      inline def setEditButtonAt(value: Double => js.Promise[HTMLElement]): Self = StObject.set(x, "editButtonAt", js.Any.fromFunction1(value))
      
      inline def setEditRow(value: (Double, String) => js.Promise[Unit]): Self = StObject.set(x, "editRow", js.Any.fromFunction2(value))
      
      inline def setIsAddingRow(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isAddingRow", js.Any.fromFunction0(value))
      
      inline def setIsEditing(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isEditing", js.Any.fromFunction0(value))
      
      inline def setIsEditingRow(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isEditingRow", js.Any.fromFunction0(value))
      
      inline def setItems(value: () => js.Array[SelectorUniDriver]): Self = StObject.set(x, "items", js.Any.fromFunction0(value))
      
      inline def setNewRowButton(value: () => js.Promise[HTMLElement]): Self = StObject.set(x, "newRowButton", js.Any.fromFunction0(value))
      
      inline def setStartAdding(value: () => js.Promise[Unit]): Self = StObject.set(x, "startAdding", js.Any.fromFunction0(value))
      
      inline def setStartEditing(value: Double => js.Promise[Unit]): Self = StObject.set(x, "startEditing", js.Any.fromFunction1(value))
      
      inline def setTitle(value: () => js.Promise[String]): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      inline def setToggleItem(value: Double => js.Promise[String]): Self = StObject.set(x, "toggleItem", js.Any.fromFunction1(value))
    }
  }
}
