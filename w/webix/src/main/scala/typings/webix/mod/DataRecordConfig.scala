package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRecordConfig extends StObject {
  
  var data: js.UndefOr[String | js.Array[js.Any]] = js.undefined
  
  var dataFeed: js.UndefOr[String | WebixCallback] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var on: js.UndefOr[EventHash] = js.undefined
  
  var url: js.UndefOr[js.Any] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
}
object DataRecordConfig {
  
  @scala.inline
  def apply(): DataRecordConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRecordConfig]
  }
  
  @scala.inline
  implicit class DataRecordConfigMutableBuilder[Self <: DataRecordConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFeed(value: String | WebixCallback): Self = StObject.set(x, "dataFeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFeedUndefined: Self = StObject.set(x, "dataFeed", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setUrl(value: js.Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
