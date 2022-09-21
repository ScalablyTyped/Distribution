package typings.yandexMaps.anon

import typings.yandexMaps.mod.IDataManager
import typings.yandexMaps.mod.IGeoObject
import typings.yandexMaps.mod.IGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: js.UndefOr[js.Array[IGeoObject[IGeometry]]] = js.undefined
  
  var geometry: js.UndefOr[IGeometry | js.Object] = js.undefined
  
  var properties: js.UndefOr[IDataManager | js.Object] = js.undefined
}
object Children {
  
  inline def apply(): Children = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: js.Array[IGeoObject[IGeometry]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: IGeoObject[IGeometry]*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setGeometry(value: IGeometry | js.Object): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setProperties(value: IDataManager | js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
