package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClustererOptions
  extends StObject
     with IClustererOptionsInject {
  
  var hasBalloon: js.UndefOr[Boolean] = js.undefined
  
  var hasHint: js.UndefOr[Boolean] = js.undefined
}
object IClustererOptions {
  
  inline def apply(): IClustererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClustererOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClustererOptions] (val x: Self) extends AnyVal {
    
    inline def setHasBalloon(value: Boolean): Self = StObject.set(x, "hasBalloon", value.asInstanceOf[js.Any])
    
    inline def setHasBalloonUndefined: Self = StObject.set(x, "hasBalloon", js.undefined)
    
    inline def setHasHint(value: Boolean): Self = StObject.set(x, "hasHint", value.asInstanceOf[js.Any])
    
    inline def setHasHintUndefined: Self = StObject.set(x, "hasHint", js.undefined)
  }
}
