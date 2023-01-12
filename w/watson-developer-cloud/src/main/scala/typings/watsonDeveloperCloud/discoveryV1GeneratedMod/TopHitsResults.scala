package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TopHitsResults. */
trait TopHitsResults extends StObject {
  
  /** Top results returned by the aggregation. */
  var hits: js.UndefOr[js.Array[QueryResult]] = js.undefined
  
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.undefined
}
object TopHitsResults {
  
  inline def apply(): TopHitsResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopHitsResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopHitsResults] (val x: Self) extends AnyVal {
    
    inline def setHits(value: js.Array[QueryResult]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsUndefined: Self = StObject.set(x, "hits", js.undefined)
    
    inline def setHitsVarargs(value: QueryResult*): Self = StObject.set(x, "hits", js.Array(value*))
    
    inline def setMatching_results(value: Double): Self = StObject.set(x, "matching_results", value.asInstanceOf[js.Any])
    
    inline def setMatching_resultsUndefined: Self = StObject.set(x, "matching_results", js.undefined)
  }
}
