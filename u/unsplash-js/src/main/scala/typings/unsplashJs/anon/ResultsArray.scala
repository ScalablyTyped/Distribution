package typings.unsplashJs.anon

import typings.unsplashJs.typesMod.Basic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultsArray extends StObject {
  
  var results: js.Array[Basic]
  
  var total: Double
}
object ResultsArray {
  
  inline def apply(results: js.Array[Basic], total: Double): ResultsArray = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultsArray]
  }
  
  extension [Self <: ResultsArray](x: Self) {
    
    inline def setResults(value: js.Array[Basic]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: Basic*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
