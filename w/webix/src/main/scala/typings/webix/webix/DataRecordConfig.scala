package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRecordConfig extends StObject {
  
  var data: js.UndefOr[String | js.Array[Any] | obj] = js.undefined
  
  var dataFeed: js.UndefOr[String | obj | WebixCallback] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var on: js.UndefOr[EventHash] = js.undefined
  
  var url: js.UndefOr[String | WebixCallback | obj] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
}
object DataRecordConfig {
  
  inline def apply(): DataRecordConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRecordConfig]
  }
  
  extension [Self <: DataRecordConfig](x: Self) {
    
    inline def setData(value: String | js.Array[Any] | obj): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataFeed(value: String | obj | WebixCallback): Self = StObject.set(x, "dataFeed", value.asInstanceOf[js.Any])
    
    inline def setDataFeedUndefined: Self = StObject.set(x, "dataFeed", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setUrl(value: String | WebixCallback | obj): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
