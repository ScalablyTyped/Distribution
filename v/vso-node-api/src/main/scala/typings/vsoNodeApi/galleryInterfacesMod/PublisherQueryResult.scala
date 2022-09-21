package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublisherQueryResult extends StObject {
  
  /**
    * For each filter supplied in the query, a filter result will be returned in the query result.
    */
  var results: js.Array[PublisherFilterResult]
}
object PublisherQueryResult {
  
  inline def apply(results: js.Array[PublisherFilterResult]): PublisherQueryResult = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherQueryResult]
  }
  
  extension [Self <: PublisherQueryResult](x: Self) {
    
    inline def setResults(value: js.Array[PublisherFilterResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: PublisherFilterResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
