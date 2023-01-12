package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoObjectFeature extends StObject {
  
  var geometry: js.UndefOr[IGeometry | IGeometryJson] = js.undefined
  
  var properties: js.UndefOr[IDataManager | js.Object] = js.undefined
}
object IGeoObjectFeature {
  
  inline def apply(): IGeoObjectFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoObjectFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGeoObjectFeature] (val x: Self) extends AnyVal {
    
    inline def setGeometry(value: IGeometry | IGeometryJson): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setProperties(value: IDataManager | js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
