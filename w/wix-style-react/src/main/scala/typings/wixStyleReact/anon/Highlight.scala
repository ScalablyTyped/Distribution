package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Highlight extends StObject {
  
  var highlight: Boolean
  
  var `match`: String
}
object Highlight {
  
  inline def apply(highlight: Boolean, `match`: String): Highlight = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlight]
  }
  
  extension [Self <: Highlight](x: Self) {
    
    inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
