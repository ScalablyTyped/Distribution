package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.IBaseButtonParametersOptiFloat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IListBoxParameters
  extends StObject
     with IButtonParameters {
  
  @JSName("options")
  var options_IListBoxParameters: js.UndefOr[IBaseButtonParametersOptiFloat] = js.undefined
}
object IListBoxParameters {
  
  inline def apply(): IListBoxParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListBoxParameters]
  }
  
  extension [Self <: IListBoxParameters](x: Self) {
    
    inline def setOptions(value: IBaseButtonParametersOptiFloat): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
