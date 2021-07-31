package typings.tinymce.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settings {
  
  trait Menu extends StObject {
    
    var edit: js.UndefOr[MenuItem] = js.undefined
    
    var file: js.UndefOr[MenuItem] = js.undefined
    
    var format: js.UndefOr[MenuItem] = js.undefined
    
    var insert: js.UndefOr[MenuItem] = js.undefined
    
    var table: js.UndefOr[MenuItem] = js.undefined
    
    var tools: js.UndefOr[MenuItem] = js.undefined
    
    var view: js.UndefOr[MenuItem] = js.undefined
  }
  object Menu {
    
    @scala.inline
    def apply(): Menu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Menu]
    }
    
    @scala.inline
    implicit class MenuMutableBuilder[Self <: Menu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdit(value: MenuItem): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
      
      @scala.inline
      def setFile(value: MenuItem): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setFormat(value: MenuItem): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setInsert(value: MenuItem): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      @scala.inline
      def setTable(value: MenuItem): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setTools(value: MenuItem): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
      
      @scala.inline
      def setView(value: MenuItem): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait MenuItem extends StObject {
    
    var items: String
    
    var title: String
  }
  object MenuItem {
    
    @scala.inline
    def apply(items: String, title: String): MenuItem = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItem]
    }
    
    @scala.inline
    implicit class MenuItemMutableBuilder[Self <: MenuItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
