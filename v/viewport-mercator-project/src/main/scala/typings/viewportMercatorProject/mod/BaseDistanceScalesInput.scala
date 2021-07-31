package typings.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseDistanceScalesInput extends StObject {
  
  var latitude: Double
  
  var longitude: Double
}
object BaseDistanceScalesInput {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): BaseDistanceScalesInput = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDistanceScalesInput]
  }
  
  @scala.inline
  implicit class BaseDistanceScalesInputMutableBuilder[Self <: BaseDistanceScalesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
