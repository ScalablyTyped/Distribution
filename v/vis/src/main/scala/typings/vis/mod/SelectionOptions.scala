package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionOptions extends StObject {
  
  var highlightEdges: js.UndefOr[Boolean] = js.undefined
  
  var unselectAll: js.UndefOr[Boolean] = js.undefined
}
object SelectionOptions {
  
  inline def apply(): SelectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectionOptions] (val x: Self) extends AnyVal {
    
    inline def setHighlightEdges(value: Boolean): Self = StObject.set(x, "highlightEdges", value.asInstanceOf[js.Any])
    
    inline def setHighlightEdgesUndefined: Self = StObject.set(x, "highlightEdges", js.undefined)
    
    inline def setUnselectAll(value: Boolean): Self = StObject.set(x, "unselectAll", value.asInstanceOf[js.Any])
    
    inline def setUnselectAllUndefined: Self = StObject.set(x, "unselectAll", js.undefined)
  }
}
