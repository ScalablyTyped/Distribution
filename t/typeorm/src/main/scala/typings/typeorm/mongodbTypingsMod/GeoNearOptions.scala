package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoNearOptions extends StObject {
  
  /**
    * Include a value to multiply the distances with allowing for range conversions.
    */
  var distanceMultiplier: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Include the location data fields in the top level of the results MongoDB > 2.X.
    */
  var includeLocs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Include results up to maxDistance from the point.
    */
  var maxDistance: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Include results starting at minDistance from a point (2.6 or higher).
    */
  var minDistance: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Max number of results to return.
    */
  var num: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Filter the results by a query.
    */
  var query: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED,
    * ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
  
  /**
    * Perform query using a spherical model.
    */
  var spherical: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The closest location in a document to the center of the search region will always be returned MongoDB > 2.X.
    */
  var uniqueDocs: js.UndefOr[Boolean] = js.undefined
}
object GeoNearOptions {
  
  inline def apply(): GeoNearOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoNearOptions]
  }
  
  extension [Self <: GeoNearOptions](x: Self) {
    
    inline def setDistanceMultiplier(value: scala.Double): Self = StObject.set(x, "distanceMultiplier", value.asInstanceOf[js.Any])
    
    inline def setDistanceMultiplierUndefined: Self = StObject.set(x, "distanceMultiplier", js.undefined)
    
    inline def setIncludeLocs(value: Boolean): Self = StObject.set(x, "includeLocs", value.asInstanceOf[js.Any])
    
    inline def setIncludeLocsUndefined: Self = StObject.set(x, "includeLocs", js.undefined)
    
    inline def setMaxDistance(value: scala.Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    inline def setMinDistance(value: scala.Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
    
    inline def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
    
    inline def setNum(value: scala.Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
    
    inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setSpherical(value: Boolean): Self = StObject.set(x, "spherical", value.asInstanceOf[js.Any])
    
    inline def setSphericalUndefined: Self = StObject.set(x, "spherical", js.undefined)
    
    inline def setUniqueDocs(value: Boolean): Self = StObject.set(x, "uniqueDocs", value.asInstanceOf[js.Any])
    
    inline def setUniqueDocsUndefined: Self = StObject.set(x, "uniqueDocs", js.undefined)
  }
}
