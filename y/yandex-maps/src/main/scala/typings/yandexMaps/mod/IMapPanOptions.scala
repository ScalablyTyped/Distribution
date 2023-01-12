package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMapPanOptions
  extends StObject
     with IMapPositionOptions {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var flying: js.UndefOr[Boolean] = js.undefined
  
  var safe: js.UndefOr[Boolean] = js.undefined
}
object IMapPanOptions {
  
  inline def apply(): IMapPanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapPanOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMapPanOptions] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setFlying(value: Boolean): Self = StObject.set(x, "flying", value.asInstanceOf[js.Any])
    
    inline def setFlyingUndefined: Self = StObject.set(x, "flying", js.undefined)
    
    inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
    
    inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
  }
}
