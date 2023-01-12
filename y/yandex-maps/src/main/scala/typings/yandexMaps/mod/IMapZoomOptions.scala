package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMapZoomOptions
  extends StObject
     with IMapMarginOptions
     with IMapCheckZoomRangeOptions {
  
  var duration: js.UndefOr[Double] = js.undefined
}
object IMapZoomOptions {
  
  inline def apply(): IMapZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapZoomOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMapZoomOptions] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
