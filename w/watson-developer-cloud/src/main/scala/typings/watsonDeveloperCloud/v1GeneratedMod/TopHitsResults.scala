package typings.watsonDeveloperCloud.v1GeneratedMod

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
  
  @scala.inline
  def apply(): TopHitsResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopHitsResults]
  }
  
  @scala.inline
  implicit class TopHitsResultsMutableBuilder[Self <: TopHitsResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHits(value: js.Array[QueryResult]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsUndefined: Self = StObject.set(x, "hits", js.undefined)
    
    @scala.inline
    def setHitsVarargs(value: QueryResult*): Self = StObject.set(x, "hits", js.Array(value :_*))
    
    @scala.inline
    def setMatching_results(value: Double): Self = StObject.set(x, "matching_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatching_resultsUndefined: Self = StObject.set(x, "matching_results", js.undefined)
  }
}
