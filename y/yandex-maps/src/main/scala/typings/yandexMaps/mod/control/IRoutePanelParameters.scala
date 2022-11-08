package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Autofocus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRoutePanelParameters extends StObject {
  
  var options: js.UndefOr[Autofocus] = js.undefined
  
  var state: js.UndefOr[js.Object] = js.undefined
}
object IRoutePanelParameters {
  
  inline def apply(): IRoutePanelParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRoutePanelParameters]
  }
  
  extension [Self <: IRoutePanelParameters](x: Self) {
    
    inline def setOptions(value: Autofocus): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setState(value: js.Object): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
