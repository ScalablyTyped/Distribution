package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoHaystackSearchOptions extends StObject {
  
  /**
    * Max number of results to return.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Include results up to maxDistance from the point.
    */
  var maxDistance: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED,
    * ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
  
  /**
    * Filter the results by a query.
    */
  var search: js.UndefOr[js.Object] = js.undefined
}
object GeoHaystackSearchOptions {
  
  inline def apply(): GeoHaystackSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoHaystackSearchOptions]
  }
  
  extension [Self <: GeoHaystackSearchOptions](x: Self) {
    
    inline def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMaxDistance(value: scala.Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    inline def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setSearch(value: js.Object): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
