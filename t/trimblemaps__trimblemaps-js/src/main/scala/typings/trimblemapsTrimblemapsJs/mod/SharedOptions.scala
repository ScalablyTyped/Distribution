package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`0`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`1`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`2`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`3`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`4`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`5`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`6`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`7`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedOptions extends StObject {
  
  var estimatedTimeOptions: js.UndefOr[EstimatedTimeOptions] = js.undefined
  
  var includeVehicleRestrictedCleanupPoints: js.UndefOr[Boolean] = js.undefined
  
  var truckStyle: js.UndefOr[`3` | `2` | `4` | `0` | `7` | `5` | `6` | `8` | `1`] = js.undefined
  
  var useTraffic: js.UndefOr[Boolean] = js.undefined
}
object SharedOptions {
  
  inline def apply(): SharedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedOptions] (val x: Self) extends AnyVal {
    
    inline def setEstimatedTimeOptions(value: EstimatedTimeOptions): Self = StObject.set(x, "estimatedTimeOptions", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTimeOptionsUndefined: Self = StObject.set(x, "estimatedTimeOptions", js.undefined)
    
    inline def setIncludeVehicleRestrictedCleanupPoints(value: Boolean): Self = StObject.set(x, "includeVehicleRestrictedCleanupPoints", value.asInstanceOf[js.Any])
    
    inline def setIncludeVehicleRestrictedCleanupPointsUndefined: Self = StObject.set(x, "includeVehicleRestrictedCleanupPoints", js.undefined)
    
    inline def setTruckStyle(value: `3` | `2` | `4` | `0` | `7` | `5` | `6` | `8` | `1`): Self = StObject.set(x, "truckStyle", value.asInstanceOf[js.Any])
    
    inline def setTruckStyleUndefined: Self = StObject.set(x, "truckStyle", js.undefined)
    
    inline def setUseTraffic(value: Boolean): Self = StObject.set(x, "useTraffic", value.asInstanceOf[js.Any])
    
    inline def setUseTrafficUndefined: Self = StObject.set(x, "useTraffic", js.undefined)
  }
}
