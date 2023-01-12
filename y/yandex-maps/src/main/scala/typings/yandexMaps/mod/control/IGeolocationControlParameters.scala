package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeolocationControlParameters
  extends StObject
     with IButtonParameters {
  
  @JSName("data")
  var data_IGeolocationControlParameters: js.UndefOr[Image] = js.undefined
  
  @JSName("options")
  var options_IGeolocationControlParameters: js.UndefOr[IBaseButtonParametersOptions] = js.undefined
}
object IGeolocationControlParameters {
  
  inline def apply(): IGeolocationControlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeolocationControlParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGeolocationControlParameters] (val x: Self) extends AnyVal {
    
    inline def setData(value: Image): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setOptions(value: IBaseButtonParametersOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
