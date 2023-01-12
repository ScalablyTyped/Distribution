package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Content
import typings.yandexMaps.anon.Enabled
import typings.yandexMaps.anon.IBaseButtonParametersOpti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IButtonParameters extends StObject {
  
  var data: js.UndefOr[Content] = js.undefined
  
  var options: js.UndefOr[IBaseButtonParametersOpti] = js.undefined
  
  var state: js.UndefOr[Enabled] = js.undefined
}
object IButtonParameters {
  
  inline def apply(): IButtonParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IButtonParameters] (val x: Self) extends AnyVal {
    
    inline def setData(value: Content): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setOptions(value: IBaseButtonParametersOpti): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setState(value: Enabled): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
