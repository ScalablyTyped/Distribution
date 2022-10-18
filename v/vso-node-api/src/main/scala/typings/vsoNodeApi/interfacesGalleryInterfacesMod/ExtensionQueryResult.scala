package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionQueryResult extends StObject {
  
  /**
    * For each filter supplied in the query, a filter result will be returned in the query result.
    */
  var results: js.Array[ExtensionFilterResult]
}
object ExtensionQueryResult {
  
  inline def apply(results: js.Array[ExtensionFilterResult]): ExtensionQueryResult = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionQueryResult]
  }
  
  extension [Self <: ExtensionQueryResult](x: Self) {
    
    inline def setResults(value: js.Array[ExtensionFilterResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: ExtensionFilterResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
