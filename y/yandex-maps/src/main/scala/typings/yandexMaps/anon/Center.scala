package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  var center: js.Array[js.Array[Double]]
  
  var zoom: Double
}
object Center {
  
  inline def apply(center: js.Array[js.Array[Double]], zoom: Double): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterVarargs(value: js.Array[Double]*): Self = StObject.set(x, "center", js.Array(value*))
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
