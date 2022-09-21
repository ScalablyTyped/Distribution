package typings.uapiJson.airMod

import typings.uapiJson.uapiJsonStrings.Business
import typings.uapiJson.uapiJsonStrings.Economy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShopParams extends StObject {
  
  var allowDirectAccess: Boolean
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var cabins: Cabins
  
  var faresOnly: js.UndefOr[Boolean] = js.undefined
  
  var legs: js.Array[Leg]
  
  var maxJourneyTime: Double
  
  var maxSolutions: js.UndefOr[Double] = js.undefined
  
  var passengers: SearchPassengers
  
  var permittedCarriers: js.UndefOr[js.Array[String]] = js.undefined
  
  var permittedConnectionPoint: js.UndefOr[js.Array[String]] = js.undefined
  
  var preferredCarriers: js.UndefOr[js.Array[String]] = js.undefined
  
  var preferredConnectionPoint: js.UndefOr[js.Array[String]] = js.undefined
  
  var pricing: js.UndefOr[Pricing] = js.undefined
  
  var prohibitedConnectionPoint: js.UndefOr[js.Array[String]] = js.undefined
  
  var requestId: String
  
  var solutionResult: js.UndefOr[Boolean] = js.undefined
}
object ShopParams {
  
  inline def apply(
    allowDirectAccess: Boolean,
    cabins: Cabins,
    legs: js.Array[Leg],
    maxJourneyTime: Double,
    passengers: SearchPassengers,
    requestId: String
  ): ShopParams = {
    val __obj = js.Dynamic.literal(allowDirectAccess = allowDirectAccess.asInstanceOf[js.Any], cabins = cabins.asInstanceOf[js.Any], legs = legs.asInstanceOf[js.Any], maxJourneyTime = maxJourneyTime.asInstanceOf[js.Any], passengers = passengers.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShopParams]
  }
  
  extension [Self <: ShopParams](x: Self) {
    
    inline def setAllowDirectAccess(value: Boolean): Self = StObject.set(x, "allowDirectAccess", value.asInstanceOf[js.Any])
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setCabins(value: Cabins): Self = StObject.set(x, "cabins", value.asInstanceOf[js.Any])
    
    inline def setCabinsVarargs(value: (Economy | Business)*): Self = StObject.set(x, "cabins", js.Array(value*))
    
    inline def setFaresOnly(value: Boolean): Self = StObject.set(x, "faresOnly", value.asInstanceOf[js.Any])
    
    inline def setFaresOnlyUndefined: Self = StObject.set(x, "faresOnly", js.undefined)
    
    inline def setLegs(value: js.Array[Leg]): Self = StObject.set(x, "legs", value.asInstanceOf[js.Any])
    
    inline def setLegsVarargs(value: Leg*): Self = StObject.set(x, "legs", js.Array(value*))
    
    inline def setMaxJourneyTime(value: Double): Self = StObject.set(x, "maxJourneyTime", value.asInstanceOf[js.Any])
    
    inline def setMaxSolutions(value: Double): Self = StObject.set(x, "maxSolutions", value.asInstanceOf[js.Any])
    
    inline def setMaxSolutionsUndefined: Self = StObject.set(x, "maxSolutions", js.undefined)
    
    inline def setPassengers(value: SearchPassengers): Self = StObject.set(x, "passengers", value.asInstanceOf[js.Any])
    
    inline def setPermittedCarriers(value: js.Array[String]): Self = StObject.set(x, "permittedCarriers", value.asInstanceOf[js.Any])
    
    inline def setPermittedCarriersUndefined: Self = StObject.set(x, "permittedCarriers", js.undefined)
    
    inline def setPermittedCarriersVarargs(value: String*): Self = StObject.set(x, "permittedCarriers", js.Array(value*))
    
    inline def setPermittedConnectionPoint(value: js.Array[String]): Self = StObject.set(x, "permittedConnectionPoint", value.asInstanceOf[js.Any])
    
    inline def setPermittedConnectionPointUndefined: Self = StObject.set(x, "permittedConnectionPoint", js.undefined)
    
    inline def setPermittedConnectionPointVarargs(value: String*): Self = StObject.set(x, "permittedConnectionPoint", js.Array(value*))
    
    inline def setPreferredCarriers(value: js.Array[String]): Self = StObject.set(x, "preferredCarriers", value.asInstanceOf[js.Any])
    
    inline def setPreferredCarriersUndefined: Self = StObject.set(x, "preferredCarriers", js.undefined)
    
    inline def setPreferredCarriersVarargs(value: String*): Self = StObject.set(x, "preferredCarriers", js.Array(value*))
    
    inline def setPreferredConnectionPoint(value: js.Array[String]): Self = StObject.set(x, "preferredConnectionPoint", value.asInstanceOf[js.Any])
    
    inline def setPreferredConnectionPointUndefined: Self = StObject.set(x, "preferredConnectionPoint", js.undefined)
    
    inline def setPreferredConnectionPointVarargs(value: String*): Self = StObject.set(x, "preferredConnectionPoint", js.Array(value*))
    
    inline def setPricing(value: Pricing): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
    
    inline def setPricingUndefined: Self = StObject.set(x, "pricing", js.undefined)
    
    inline def setProhibitedConnectionPoint(value: js.Array[String]): Self = StObject.set(x, "prohibitedConnectionPoint", value.asInstanceOf[js.Any])
    
    inline def setProhibitedConnectionPointUndefined: Self = StObject.set(x, "prohibitedConnectionPoint", js.undefined)
    
    inline def setProhibitedConnectionPointVarargs(value: String*): Self = StObject.set(x, "prohibitedConnectionPoint", js.Array(value*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setSolutionResult(value: Boolean): Self = StObject.set(x, "solutionResult", value.asInstanceOf[js.Any])
    
    inline def setSolutionResultUndefined: Self = StObject.set(x, "solutionResult", js.undefined)
  }
}
