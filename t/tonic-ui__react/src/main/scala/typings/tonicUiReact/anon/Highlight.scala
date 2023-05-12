package typings.tonicUiReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Highlight extends StObject {
  
  var highlight: String
  
  var selection: String
}
object Highlight {
  
  inline def apply(highlight: String, selection: String): Highlight = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Highlight] (val x: Self) extends AnyVal {
    
    inline def setHighlight(value: String): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
