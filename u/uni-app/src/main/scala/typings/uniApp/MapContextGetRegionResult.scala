package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapContextGetRegionResult extends StObject {
  
  /**
    * 东北角的经纬度
    */
  var northeast: js.UndefOr[LocationObject] = js.native
  
  /**
    * 西南角的经纬度
    */
  var southwest: js.UndefOr[LocationObject] = js.native
}
object MapContextGetRegionResult {
  
  @scala.inline
  def apply(): MapContextGetRegionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapContextGetRegionResult]
  }
  
  @scala.inline
  implicit class MapContextGetRegionResultMutableBuilder[Self <: MapContextGetRegionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNortheast(value: LocationObject): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNortheastUndefined: Self = StObject.set(x, "northeast", js.undefined)
    
    @scala.inline
    def setSouthwest(value: LocationObject): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthwestUndefined: Self = StObject.set(x, "southwest", js.undefined)
  }
}
