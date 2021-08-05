package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCompassChangeSuccess extends StObject {
  
  /**
    * 面对的方向度数
    */
  var direction: js.UndefOr[Double] = js.undefined
}
object OnCompassChangeSuccess {
  
  inline def apply(): OnCompassChangeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnCompassChangeSuccess]
  }
  
  extension [Self <: OnCompassChangeSuccess](x: Self) {
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}
