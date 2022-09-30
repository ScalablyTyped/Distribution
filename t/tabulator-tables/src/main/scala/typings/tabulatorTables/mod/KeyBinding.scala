package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyBinding extends StObject {
  
  var copyToClipboard: js.UndefOr[String | Boolean] = js.undefined
  
  var navDown: js.UndefOr[String | Boolean] = js.undefined
  
  var navLeft: js.UndefOr[String | Boolean] = js.undefined
  
  var navNext: js.UndefOr[String | Boolean] = js.undefined
  
  var navPrev: js.UndefOr[String | Boolean] = js.undefined
  
  var navRight: js.UndefOr[String | Boolean] = js.undefined
  
  var navUp: js.UndefOr[String | Boolean] = js.undefined
  
  var redo: js.UndefOr[String | Boolean] = js.undefined
  
  var scrollPageDown: js.UndefOr[String | Boolean] = js.undefined
  
  var scrollPageUp: js.UndefOr[String | Boolean] = js.undefined
  
  var scrollToEnd: js.UndefOr[String | Boolean] = js.undefined
  
  var scrollToStart: js.UndefOr[String | Boolean] = js.undefined
  
  var undo: js.UndefOr[String | Boolean] = js.undefined
}
object KeyBinding {
  
  inline def apply(): KeyBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyBinding]
  }
  
  extension [Self <: KeyBinding](x: Self) {
    
    inline def setCopyToClipboard(value: String | Boolean): Self = StObject.set(x, "copyToClipboard", value.asInstanceOf[js.Any])
    
    inline def setCopyToClipboardUndefined: Self = StObject.set(x, "copyToClipboard", js.undefined)
    
    inline def setNavDown(value: String | Boolean): Self = StObject.set(x, "navDown", value.asInstanceOf[js.Any])
    
    inline def setNavDownUndefined: Self = StObject.set(x, "navDown", js.undefined)
    
    inline def setNavLeft(value: String | Boolean): Self = StObject.set(x, "navLeft", value.asInstanceOf[js.Any])
    
    inline def setNavLeftUndefined: Self = StObject.set(x, "navLeft", js.undefined)
    
    inline def setNavNext(value: String | Boolean): Self = StObject.set(x, "navNext", value.asInstanceOf[js.Any])
    
    inline def setNavNextUndefined: Self = StObject.set(x, "navNext", js.undefined)
    
    inline def setNavPrev(value: String | Boolean): Self = StObject.set(x, "navPrev", value.asInstanceOf[js.Any])
    
    inline def setNavPrevUndefined: Self = StObject.set(x, "navPrev", js.undefined)
    
    inline def setNavRight(value: String | Boolean): Self = StObject.set(x, "navRight", value.asInstanceOf[js.Any])
    
    inline def setNavRightUndefined: Self = StObject.set(x, "navRight", js.undefined)
    
    inline def setNavUp(value: String | Boolean): Self = StObject.set(x, "navUp", value.asInstanceOf[js.Any])
    
    inline def setNavUpUndefined: Self = StObject.set(x, "navUp", js.undefined)
    
    inline def setRedo(value: String | Boolean): Self = StObject.set(x, "redo", value.asInstanceOf[js.Any])
    
    inline def setRedoUndefined: Self = StObject.set(x, "redo", js.undefined)
    
    inline def setScrollPageDown(value: String | Boolean): Self = StObject.set(x, "scrollPageDown", value.asInstanceOf[js.Any])
    
    inline def setScrollPageDownUndefined: Self = StObject.set(x, "scrollPageDown", js.undefined)
    
    inline def setScrollPageUp(value: String | Boolean): Self = StObject.set(x, "scrollPageUp", value.asInstanceOf[js.Any])
    
    inline def setScrollPageUpUndefined: Self = StObject.set(x, "scrollPageUp", js.undefined)
    
    inline def setScrollToEnd(value: String | Boolean): Self = StObject.set(x, "scrollToEnd", value.asInstanceOf[js.Any])
    
    inline def setScrollToEndUndefined: Self = StObject.set(x, "scrollToEnd", js.undefined)
    
    inline def setScrollToStart(value: String | Boolean): Self = StObject.set(x, "scrollToStart", value.asInstanceOf[js.Any])
    
    inline def setScrollToStartUndefined: Self = StObject.set(x, "scrollToStart", js.undefined)
    
    inline def setUndo(value: String | Boolean): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
    
    inline def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
  }
}
