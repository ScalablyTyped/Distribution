package typings.trimblemapsTrimblemapsJs.anon

import typings.trimblemapsTrimblemapsJs.mod.LngLat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Countries extends StObject {
  
  var countries: js.UndefOr[String] = js.undefined
  
  var countryType: js.UndefOr[String] = js.undefined
  
  var currentLonLat: js.UndefOr[LngLat] = js.undefined
  
  var excludeResultsFor: js.UndefOr[String] = js.undefined
  
  var getAllHNRanges: js.UndefOr[Boolean] = js.undefined
  
  // reverse geocoding only
  var heading: js.UndefOr[Double] = js.undefined
  
  var include: js.UndefOr[String] = js.undefined
  
  // excludedSearchTypes deprecated
  var includeOnly: js.UndefOr[String] = js.undefined
  
  var includeTrimblePlaceIds: js.UndefOr[Boolean] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var matchNamedRoadsOnly: js.UndefOr[Boolean] = js.undefined
  
  // reverse geocoding only
  var maxCleanupMiles: js.UndefOr[Double] = js.undefined
  
  var maxResults: js.UndefOr[Double] = js.undefined
  
  var poiCategories: js.UndefOr[String] = js.undefined
  
  var query: String
  
  // required
  var region: js.UndefOr[String] = js.undefined
  
  var separateHN: js.UndefOr[Boolean] = js.undefined
  
  var states: js.UndefOr[String] = js.undefined
  
  var useCustomPlaces: js.UndefOr[Boolean] = js.undefined
}
object Countries {
  
  inline def apply(query: String): Countries = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Countries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Countries] (val x: Self) extends AnyVal {
    
    inline def setCountries(value: String): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
    
    inline def setCountryType(value: String): Self = StObject.set(x, "countryType", value.asInstanceOf[js.Any])
    
    inline def setCountryTypeUndefined: Self = StObject.set(x, "countryType", js.undefined)
    
    inline def setCurrentLonLat(value: LngLat): Self = StObject.set(x, "currentLonLat", value.asInstanceOf[js.Any])
    
    inline def setCurrentLonLatUndefined: Self = StObject.set(x, "currentLonLat", js.undefined)
    
    inline def setExcludeResultsFor(value: String): Self = StObject.set(x, "excludeResultsFor", value.asInstanceOf[js.Any])
    
    inline def setExcludeResultsForUndefined: Self = StObject.set(x, "excludeResultsFor", js.undefined)
    
    inline def setGetAllHNRanges(value: Boolean): Self = StObject.set(x, "getAllHNRanges", value.asInstanceOf[js.Any])
    
    inline def setGetAllHNRangesUndefined: Self = StObject.set(x, "getAllHNRanges", js.undefined)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeOnly(value: String): Self = StObject.set(x, "includeOnly", value.asInstanceOf[js.Any])
    
    inline def setIncludeOnlyUndefined: Self = StObject.set(x, "includeOnly", js.undefined)
    
    inline def setIncludeTrimblePlaceIds(value: Boolean): Self = StObject.set(x, "includeTrimblePlaceIds", value.asInstanceOf[js.Any])
    
    inline def setIncludeTrimblePlaceIdsUndefined: Self = StObject.set(x, "includeTrimblePlaceIds", js.undefined)
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setMatchNamedRoadsOnly(value: Boolean): Self = StObject.set(x, "matchNamedRoadsOnly", value.asInstanceOf[js.Any])
    
    inline def setMatchNamedRoadsOnlyUndefined: Self = StObject.set(x, "matchNamedRoadsOnly", js.undefined)
    
    inline def setMaxCleanupMiles(value: Double): Self = StObject.set(x, "maxCleanupMiles", value.asInstanceOf[js.Any])
    
    inline def setMaxCleanupMilesUndefined: Self = StObject.set(x, "maxCleanupMiles", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPoiCategories(value: String): Self = StObject.set(x, "poiCategories", value.asInstanceOf[js.Any])
    
    inline def setPoiCategoriesUndefined: Self = StObject.set(x, "poiCategories", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSeparateHN(value: Boolean): Self = StObject.set(x, "separateHN", value.asInstanceOf[js.Any])
    
    inline def setSeparateHNUndefined: Self = StObject.set(x, "separateHN", js.undefined)
    
    inline def setStates(value: String): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setUseCustomPlaces(value: Boolean): Self = StObject.set(x, "useCustomPlaces", value.asInstanceOf[js.Any])
    
    inline def setUseCustomPlacesUndefined: Self = StObject.set(x, "useCustomPlaces", js.undefined)
  }
}
