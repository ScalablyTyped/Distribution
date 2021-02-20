package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends StObject {
  
  var completed_in: js.UndefOr[Double] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var max_id: js.UndefOr[Double] = js.native
  
  var max_id_str: js.UndefOr[String] = js.native
  
  var next_results: js.UndefOr[String] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var refresh_url: js.UndefOr[String] = js.native
  
  var since_id: js.UndefOr[Double] = js.native
  
  var since_id_str: js.UndefOr[String] = js.native
}
object Metadata {
  
  @scala.inline
  def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted_in(value: Double): Self = StObject.set(x, "completed_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted_inUndefined: Self = StObject.set(x, "completed_in", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setMax_id(value: Double): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_idUndefined: Self = StObject.set(x, "max_id", js.undefined)
    
    @scala.inline
    def setMax_id_str(value: String): Self = StObject.set(x, "max_id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_id_strUndefined: Self = StObject.set(x, "max_id_str", js.undefined)
    
    @scala.inline
    def setNext_results(value: String): Self = StObject.set(x, "next_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_resultsUndefined: Self = StObject.set(x, "next_results", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRefresh_url(value: String): Self = StObject.set(x, "refresh_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh_urlUndefined: Self = StObject.set(x, "refresh_url", js.undefined)
    
    @scala.inline
    def setSince_id(value: Double): Self = StObject.set(x, "since_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSince_idUndefined: Self = StObject.set(x, "since_id", js.undefined)
    
    @scala.inline
    def setSince_id_str(value: String): Self = StObject.set(x, "since_id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSince_id_strUndefined: Self = StObject.set(x, "since_id_str", js.undefined)
  }
}
