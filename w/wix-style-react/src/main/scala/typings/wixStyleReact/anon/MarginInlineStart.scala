package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginInlineStart extends StObject {
  
  var marginInlineStart: Unit
  
  var marginTop: Any
}
object MarginInlineStart {
  
  inline def apply(marginInlineStart: Unit, marginTop: Any): MarginInlineStart = {
    val __obj = js.Dynamic.literal(marginInlineStart = marginInlineStart.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginInlineStart]
  }
  
  extension [Self <: MarginInlineStart](x: Self) {
    
    inline def setMarginInlineStart(value: Unit): Self = StObject.set(x, "marginInlineStart", value.asInstanceOf[js.Any])
    
    inline def setMarginTop(value: Any): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
  }
}
