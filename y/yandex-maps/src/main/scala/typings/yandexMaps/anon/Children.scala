package typings.yandexMaps.anon

import typings.yandexMaps.mod.IDataManager
import typings.yandexMaps.mod.IGeoObject
import typings.yandexMaps.mod.IGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends StObject {
  
  var children: js.UndefOr[js.Array[IGeoObject[IGeometry]]] = js.native
  
  var geometry: js.UndefOr[IGeometry | js.Object] = js.native
  
  var properties: js.UndefOr[IDataManager | js.Object] = js.native
}
object Children {
  
  @scala.inline
  def apply(): Children = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[IGeoObject[IGeometry]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: IGeoObject[IGeometry]*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setGeometry(value: IGeometry | js.Object): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    @scala.inline
    def setProperties(value: IDataManager | js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
