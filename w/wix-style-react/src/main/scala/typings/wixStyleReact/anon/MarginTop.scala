package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginTop extends StObject {
  
  var marginInlineStart: Any
  
  var marginTop: Unit
}
object MarginTop {
  
  inline def apply(marginInlineStart: Any, marginTop: Unit): MarginTop = {
    val __obj = js.Dynamic.literal(marginInlineStart = marginInlineStart.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginTop]
  }
  
  extension [Self <: MarginTop](x: Self) {
    
    inline def setMarginInlineStart(value: Any): Self = StObject.set(x, "marginInlineStart", value.asInstanceOf[js.Any])
    
    inline def setMarginTop(value: Unit): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
  }
}
