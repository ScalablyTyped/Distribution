package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMapCheckZoomRangeOptions extends StObject {
  
  var checkZoomRange: js.UndefOr[Boolean] = js.undefined
}
object IMapCheckZoomRangeOptions {
  
  inline def apply(): IMapCheckZoomRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapCheckZoomRangeOptions]
  }
  
  extension [Self <: IMapCheckZoomRangeOptions](x: Self) {
    
    inline def setCheckZoomRange(value: Boolean): Self = StObject.set(x, "checkZoomRange", value.asInstanceOf[js.Any])
    
    inline def setCheckZoomRangeUndefined: Self = StObject.set(x, "checkZoomRange", js.undefined)
  }
}
