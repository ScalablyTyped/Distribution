package typings.trimblemapsTrimblemapsJs.anon

import typings.trimblemapsTrimblemapsJs.mod.LngLatLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dataset extends StObject {
  
  var dataset: js.UndefOr[String] = js.undefined
  
  var failure: js.UndefOr[js.Function1[/* response */ Any, Unit]] = js.undefined
  
  var lonLat: LngLatLike
  
  var matchNamedRoadsOnly: js.UndefOr[Boolean] = js.undefined
  
  var maxCleanupMiles: js.UndefOr[Double] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  def success(response: Any): Unit
}
object Dataset {
  
  inline def apply(lonLat: LngLatLike, success: Any => Unit): Dataset = {
    val __obj = js.Dynamic.literal(lonLat = lonLat.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Dataset]
  }
  
  extension [Self <: Dataset](x: Self) {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setFailure(value: /* response */ Any => Unit): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setLonLat(value: LngLatLike): Self = StObject.set(x, "lonLat", value.asInstanceOf[js.Any])
    
    inline def setMatchNamedRoadsOnly(value: Boolean): Self = StObject.set(x, "matchNamedRoadsOnly", value.asInstanceOf[js.Any])
    
    inline def setMatchNamedRoadsOnlyUndefined: Self = StObject.set(x, "matchNamedRoadsOnly", js.undefined)
    
    inline def setMaxCleanupMiles(value: Double): Self = StObject.set(x, "maxCleanupMiles", value.asInstanceOf[js.Any])
    
    inline def setMaxCleanupMilesUndefined: Self = StObject.set(x, "maxCleanupMiles", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSuccess(value: Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
