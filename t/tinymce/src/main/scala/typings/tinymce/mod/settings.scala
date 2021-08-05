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
    
    inline def apply(): Menu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Menu]
    }
    
    extension [Self <: Menu](x: Self) {
      
      inline def setEdit(value: MenuItem): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
      
      inline def setFile(value: MenuItem): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFormat(value: MenuItem): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setInsert(value: MenuItem): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setTable(value: MenuItem): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setTools(value: MenuItem): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
      
      inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
      
      inline def setView(value: MenuItem): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait MenuItem extends StObject {
    
    var items: String
    
    var title: String
  }
  object MenuItem {
    
    inline def apply(items: String, title: String): MenuItem = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItem]
    }
    
    extension [Self <: MenuItem](x: Self) {
      
      inline def setItems(value: String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
