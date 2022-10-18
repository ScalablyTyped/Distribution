package typings.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Minimum extends StObject {
  
  var maximum: js.UndefOr[Double] = js.undefined
  
  var minimum: js.UndefOr[Double] = js.undefined
}
object Minimum {
  
  inline def apply(): Minimum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Minimum]
  }
  
  extension [Self <: Minimum](x: Self) {
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
  }
}
