package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoObjectFeature extends StObject {
  
  var geometry: js.UndefOr[IGeometry | IGeometryJson] = js.native
  
  var properties: js.UndefOr[IDataManager | js.Object] = js.native
}
object IGeoObjectFeature {
  
  @scala.inline
  def apply(): IGeoObjectFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoObjectFeature]
  }
  
  @scala.inline
  implicit class IGeoObjectFeatureMutableBuilder[Self <: IGeoObjectFeature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: IGeometry | IGeometryJson): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    @scala.inline
    def setProperties(value: IDataManager | js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
