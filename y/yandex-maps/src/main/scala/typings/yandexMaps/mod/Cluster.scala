package typings.yandexMaps.mod

import typings.yandexMaps.anon.Dictk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  var geometry: IGeometry
  
  var id: String
  
  var options: IOptionManager
  
  var properties: Dictk
}
object Cluster {
  
  inline def apply(geometry: IGeometry, id: String, options: IOptionManager, properties: Dictk): Cluster = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cluster]
  }
  
  extension [Self <: Cluster](x: Self) {
    
    inline def setGeometry(value: IGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: IOptionManager): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Dictk): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
