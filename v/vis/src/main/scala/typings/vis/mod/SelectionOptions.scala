package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionOptions extends StObject {
  
  var highlightEdges: js.UndefOr[Boolean] = js.native
  
  var unselectAll: js.UndefOr[Boolean] = js.native
}
object SelectionOptions {
  
  @scala.inline
  def apply(): SelectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionOptions]
  }
  
  @scala.inline
  implicit class SelectionOptionsMutableBuilder[Self <: SelectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlightEdges(value: Boolean): Self = StObject.set(x, "highlightEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightEdgesUndefined: Self = StObject.set(x, "highlightEdges", js.undefined)
    
    @scala.inline
    def setUnselectAll(value: Boolean): Self = StObject.set(x, "unselectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectAllUndefined: Self = StObject.set(x, "unselectAll", js.undefined)
  }
}
