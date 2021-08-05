package typings.terminalKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Continue extends StObject {
  
  var continue: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var width: Null | Double
  
  var x: Double
}
object Continue {
  
  inline def apply(x: Double): Continue = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], width = null)
    __obj.asInstanceOf[Continue]
  }
  
  extension [Self <: Continue](x: Self) {
    
    inline def setContinue(value: Boolean): Self = StObject.set(x, "continue", value.asInstanceOf[js.Any])
    
    inline def setContinueUndefined: Self = StObject.set(x, "continue", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
