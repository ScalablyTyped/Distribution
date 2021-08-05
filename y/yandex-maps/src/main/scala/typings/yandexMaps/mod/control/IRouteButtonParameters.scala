package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.AdjustMapMargin
import typings.yandexMaps.anon.Expanded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRouteButtonParameters extends StObject {
  
  var options: js.UndefOr[AdjustMapMargin] = js.undefined
  
  var state: js.UndefOr[Expanded] = js.undefined
}
object IRouteButtonParameters {
  
  inline def apply(): IRouteButtonParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRouteButtonParameters]
  }
  
  extension [Self <: IRouteButtonParameters](x: Self) {
    
    inline def setOptions(value: AdjustMapMargin): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setState(value: Expanded): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
