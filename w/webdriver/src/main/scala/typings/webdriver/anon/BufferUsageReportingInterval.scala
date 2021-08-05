package typings.webdriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferUsageReportingInterval extends StObject {
  
  var bufferUsageReportingInterval: js.UndefOr[Boolean] = js.undefined
  
  var enableNetwork: js.UndefOr[Boolean] = js.undefined
  
  var enablePage: js.UndefOr[Boolean] = js.undefined
  
  var enableTimeline: js.UndefOr[Boolean] = js.undefined
  
  var tracingCategories: js.UndefOr[Boolean] = js.undefined
}
object BufferUsageReportingInterval {
  
  inline def apply(): BufferUsageReportingInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferUsageReportingInterval]
  }
  
  extension [Self <: BufferUsageReportingInterval](x: Self) {
    
    inline def setBufferUsageReportingInterval(value: Boolean): Self = StObject.set(x, "bufferUsageReportingInterval", value.asInstanceOf[js.Any])
    
    inline def setBufferUsageReportingIntervalUndefined: Self = StObject.set(x, "bufferUsageReportingInterval", js.undefined)
    
    inline def setEnableNetwork(value: Boolean): Self = StObject.set(x, "enableNetwork", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkUndefined: Self = StObject.set(x, "enableNetwork", js.undefined)
    
    inline def setEnablePage(value: Boolean): Self = StObject.set(x, "enablePage", value.asInstanceOf[js.Any])
    
    inline def setEnablePageUndefined: Self = StObject.set(x, "enablePage", js.undefined)
    
    inline def setEnableTimeline(value: Boolean): Self = StObject.set(x, "enableTimeline", value.asInstanceOf[js.Any])
    
    inline def setEnableTimelineUndefined: Self = StObject.set(x, "enableTimeline", js.undefined)
    
    inline def setTracingCategories(value: Boolean): Self = StObject.set(x, "tracingCategories", value.asInstanceOf[js.Any])
    
    inline def setTracingCategoriesUndefined: Self = StObject.set(x, "tracingCategories", js.undefined)
  }
}
