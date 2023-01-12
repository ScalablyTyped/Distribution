package typings.wxServerSdk.anon

import typings.wxServerSdk.mod.Point
import typings.wxServerSdk.wxServerSdkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceField extends StObject {
  
  var distanceField: String
  
  var distanceMultiplier: js.UndefOr[Double] = js.undefined
  
  var includeLocs: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var maxDistance: js.UndefOr[Double] = js.undefined
  
  var minDistance: js.UndefOr[Double] = js.undefined
  
  def near(longitude: Double, latitude: Double): Point
  @JSName("near")
  var near_Original: Point
  
  var query: js.UndefOr[js.Object] = js.undefined
  
  var spherical: `true`
}
object DistanceField {
  
  inline def apply(distanceField: String, near: Point): DistanceField = {
    val __obj = js.Dynamic.literal(distanceField = distanceField.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], spherical = true)
    __obj.asInstanceOf[DistanceField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistanceField] (val x: Self) extends AnyVal {
    
    inline def setDistanceField(value: String): Self = StObject.set(x, "distanceField", value.asInstanceOf[js.Any])
    
    inline def setDistanceMultiplier(value: Double): Self = StObject.set(x, "distanceMultiplier", value.asInstanceOf[js.Any])
    
    inline def setDistanceMultiplierUndefined: Self = StObject.set(x, "distanceMultiplier", js.undefined)
    
    inline def setIncludeLocs(value: String): Self = StObject.set(x, "includeLocs", value.asInstanceOf[js.Any])
    
    inline def setIncludeLocsUndefined: Self = StObject.set(x, "includeLocs", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
    
    inline def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
    
    inline def setNear(value: Point): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSpherical(value: `true`): Self = StObject.set(x, "spherical", value.asInstanceOf[js.Any])
  }
}
