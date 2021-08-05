package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  var completed_in: js.UndefOr[Double] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var max_id: js.UndefOr[Double] = js.undefined
  
  var max_id_str: js.UndefOr[String] = js.undefined
  
  var next_results: js.UndefOr[String] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var refresh_url: js.UndefOr[String] = js.undefined
  
  var since_id: js.UndefOr[Double] = js.undefined
  
  var since_id_str: js.UndefOr[String] = js.undefined
}
object Metadata {
  
  inline def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  
  extension [Self <: Metadata](x: Self) {
    
    inline def setCompleted_in(value: Double): Self = StObject.set(x, "completed_in", value.asInstanceOf[js.Any])
    
    inline def setCompleted_inUndefined: Self = StObject.set(x, "completed_in", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setMax_id(value: Double): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
    
    inline def setMax_idUndefined: Self = StObject.set(x, "max_id", js.undefined)
    
    inline def setMax_id_str(value: String): Self = StObject.set(x, "max_id_str", value.asInstanceOf[js.Any])
    
    inline def setMax_id_strUndefined: Self = StObject.set(x, "max_id_str", js.undefined)
    
    inline def setNext_results(value: String): Self = StObject.set(x, "next_results", value.asInstanceOf[js.Any])
    
    inline def setNext_resultsUndefined: Self = StObject.set(x, "next_results", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRefresh_url(value: String): Self = StObject.set(x, "refresh_url", value.asInstanceOf[js.Any])
    
    inline def setRefresh_urlUndefined: Self = StObject.set(x, "refresh_url", js.undefined)
    
    inline def setSince_id(value: Double): Self = StObject.set(x, "since_id", value.asInstanceOf[js.Any])
    
    inline def setSince_idUndefined: Self = StObject.set(x, "since_id", js.undefined)
    
    inline def setSince_id_str(value: String): Self = StObject.set(x, "since_id_str", value.asInstanceOf[js.Any])
    
    inline def setSince_id_strUndefined: Self = StObject.set(x, "since_id_str", js.undefined)
  }
}
