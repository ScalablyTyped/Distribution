package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizingOptionsMod {
  
  trait ResizingOptions extends StObject {
    
    /**
      * A value indicating whether column widths are saved locally.
      */
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether the last column should have a resize-handle.
      */
    var resizable_addLastColumn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether the user can resize the columns inside the footer.
      */
    var resizable_includeFooter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether always the last column should shrink when resizing.
      */
    var resizable_targetLast: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of milliseconds to wait before raising the `mousemove`-event.
      */
    var resizable_throttle: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * The initial widths of the columns.
      */
    var resizable_widths: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ResizingOptions {
    
    inline def apply(): ResizingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizingOptions]
    }
    
    extension [Self <: ResizingOptions](x: Self) {
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setResizable_addLastColumn(value: Boolean): Self = StObject.set(x, "resizable_addLastColumn", value.asInstanceOf[js.Any])
      
      inline def setResizable_addLastColumnUndefined: Self = StObject.set(x, "resizable_addLastColumn", js.undefined)
      
      inline def setResizable_includeFooter(value: Boolean): Self = StObject.set(x, "resizable_includeFooter", value.asInstanceOf[js.Any])
      
      inline def setResizable_includeFooterUndefined: Self = StObject.set(x, "resizable_includeFooter", js.undefined)
      
      inline def setResizable_targetLast(value: Boolean): Self = StObject.set(x, "resizable_targetLast", value.asInstanceOf[js.Any])
      
      inline def setResizable_targetLastUndefined: Self = StObject.set(x, "resizable_targetLast", js.undefined)
      
      inline def setResizable_throttle(value: Boolean | Double): Self = StObject.set(x, "resizable_throttle", value.asInstanceOf[js.Any])
      
      inline def setResizable_throttleUndefined: Self = StObject.set(x, "resizable_throttle", js.undefined)
      
      inline def setResizable_widths(value: js.Array[String]): Self = StObject.set(x, "resizable_widths", value.asInstanceOf[js.Any])
      
      inline def setResizable_widthsUndefined: Self = StObject.set(x, "resizable_widths", js.undefined)
      
      inline def setResizable_widthsVarargs(value: String*): Self = StObject.set(x, "resizable_widths", js.Array(value :_*))
    }
  }
}
