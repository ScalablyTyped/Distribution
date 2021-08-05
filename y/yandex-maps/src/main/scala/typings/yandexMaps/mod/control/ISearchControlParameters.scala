package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.BoundedBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchControlParameters extends StObject {
  
  var data: js.UndefOr[js.Object] = js.undefined
  
  var options: js.UndefOr[BoundedBy] = js.undefined
  
  var state: js.UndefOr[js.Object] = js.undefined
}
object ISearchControlParameters {
  
  inline def apply(): ISearchControlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISearchControlParameters]
  }
  
  extension [Self <: ISearchControlParameters](x: Self) {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setOptions(value: BoundedBy): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setState(value: js.Object): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
