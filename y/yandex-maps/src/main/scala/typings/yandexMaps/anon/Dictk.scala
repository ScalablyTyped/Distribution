package typings.yandexMaps.anon

import org.scalablytyped.runtime.StringDictionary
import typings.yandexMaps.mod.IGeoObject
import typings.yandexMaps.mod.IGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictk
  extends StObject
     with /* index */ StringDictionary[Any] {
  
  var geoObjects: js.Array[IGeoObject[IGeometry]]
}
object Dictk {
  
  inline def apply(geoObjects: js.Array[IGeoObject[IGeometry]]): Dictk = {
    val __obj = js.Dynamic.literal(geoObjects = geoObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dictk] (val x: Self) extends AnyVal {
    
    inline def setGeoObjects(value: js.Array[IGeoObject[IGeometry]]): Self = StObject.set(x, "geoObjects", value.asInstanceOf[js.Any])
    
    inline def setGeoObjectsVarargs(value: IGeoObject[IGeometry]*): Self = StObject.set(x, "geoObjects", js.Array(value*))
  }
}
