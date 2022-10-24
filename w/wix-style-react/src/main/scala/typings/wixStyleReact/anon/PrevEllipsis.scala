package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrevEllipsis extends StObject {
  
  var prevEllipsis: Any
  
  var prevMaxLines: Any
  
  var prevRender: Any
  
  var textRendered: Boolean
}
object PrevEllipsis {
  
  inline def apply(prevEllipsis: Any, prevMaxLines: Any, prevRender: Any, textRendered: Boolean): PrevEllipsis = {
    val __obj = js.Dynamic.literal(prevEllipsis = prevEllipsis.asInstanceOf[js.Any], prevMaxLines = prevMaxLines.asInstanceOf[js.Any], prevRender = prevRender.asInstanceOf[js.Any], textRendered = textRendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevEllipsis]
  }
  
  extension [Self <: PrevEllipsis](x: Self) {
    
    inline def setPrevEllipsis(value: Any): Self = StObject.set(x, "prevEllipsis", value.asInstanceOf[js.Any])
    
    inline def setPrevMaxLines(value: Any): Self = StObject.set(x, "prevMaxLines", value.asInstanceOf[js.Any])
    
    inline def setPrevRender(value: Any): Self = StObject.set(x, "prevRender", value.asInstanceOf[js.Any])
    
    inline def setTextRendered(value: Boolean): Self = StObject.set(x, "textRendered", value.asInstanceOf[js.Any])
  }
}
