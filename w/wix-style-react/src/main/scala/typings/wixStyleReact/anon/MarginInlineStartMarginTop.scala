package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginInlineStartMarginTop extends StObject {
  
  var marginInlineStart: Unit
  
  var marginTop: Unit
}
object MarginInlineStartMarginTop {
  
  inline def apply(marginInlineStart: Unit, marginTop: Unit): MarginInlineStartMarginTop = {
    val __obj = js.Dynamic.literal(marginInlineStart = marginInlineStart.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginInlineStartMarginTop]
  }
  
  extension [Self <: MarginInlineStartMarginTop](x: Self) {
    
    inline def setMarginInlineStart(value: Unit): Self = StObject.set(x, "marginInlineStart", value.asInstanceOf[js.Any])
    
    inline def setMarginTop(value: Unit): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
  }
}
