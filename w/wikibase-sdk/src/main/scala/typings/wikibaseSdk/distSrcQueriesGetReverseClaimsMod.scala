package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesEntityMod.PropertyId
import typings.wikibaseSdk.distSrcTypesOptionsMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueriesGetReverseClaimsMod {
  
  @JSImport("wikibase-sdk/dist/src/queries/get_reverse_claims", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getReverseClaimsFactory(sparqlEndpoint: Url): js.Function1[/* options */ GetReverseClaimsOptions, Url] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReverseClaimsFactory")(sparqlEndpoint.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ GetReverseClaimsOptions, Url]]
  
  trait GetReverseClaimsOptions extends StObject {
    
    var caseInsensitive: js.UndefOr[Boolean] = js.undefined
    
    var keepProperties: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var properties: PropertyId | js.Array[PropertyId]
    
    var values: String | Double | (js.Array[Double | String])
  }
  object GetReverseClaimsOptions {
    
    inline def apply(
      properties: PropertyId | js.Array[PropertyId],
      values: String | Double | (js.Array[Double | String])
    ): GetReverseClaimsOptions = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetReverseClaimsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetReverseClaimsOptions] (val x: Self) extends AnyVal {
      
      inline def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
      
      inline def setKeepProperties(value: Boolean): Self = StObject.set(x, "keepProperties", value.asInstanceOf[js.Any])
      
      inline def setKeepPropertiesUndefined: Self = StObject.set(x, "keepProperties", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setProperties(value: PropertyId | js.Array[PropertyId]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: PropertyId*): Self = StObject.set(x, "properties", js.Array(value*))
      
      inline def setValues(value: String | Double | (js.Array[Double | String])): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: (Double | String)*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
