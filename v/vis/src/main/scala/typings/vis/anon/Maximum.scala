package typings.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maximum extends StObject {
  
  var maximum: js.UndefOr[Double] = js.undefined
  
  var minimum: js.UndefOr[Double] = js.undefined
}
object Maximum {
  
  inline def apply(): Maximum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maximum]
  }
  
  extension [Self <: Maximum](x: Self) {
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
  }
}
