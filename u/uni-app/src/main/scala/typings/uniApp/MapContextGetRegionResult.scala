package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapContextGetRegionResult extends StObject {
  
  /**
    * 东北角的经纬度
    */
  var northeast: js.UndefOr[LocationObject] = js.undefined
  
  /**
    * 西南角的经纬度
    */
  var southwest: js.UndefOr[LocationObject] = js.undefined
}
object MapContextGetRegionResult {
  
  inline def apply(): MapContextGetRegionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapContextGetRegionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapContextGetRegionResult] (val x: Self) extends AnyVal {
    
    inline def setNortheast(value: LocationObject): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    inline def setNortheastUndefined: Self = StObject.set(x, "northeast", js.undefined)
    
    inline def setSouthwest(value: LocationObject): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
    
    inline def setSouthwestUndefined: Self = StObject.set(x, "southwest", js.undefined)
  }
}
