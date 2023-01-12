package typings.wdioTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferUsageReportingInterval extends StObject {
  
  /**
    * The requested number of milliseconds between DevTools trace buffer
    * usage events. For example, if 1000, then once per second, DevTools
    * will report how full the trace buffer is. If a report indicates the
    * buffer usage is 100%, a warning will be issued.
    * @default 1000
    */
  var bufferUsageReportingInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether or not to collect events from Network domain.
    * @default true
    */
  var enableNetwork: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not to collect events from Page domain.
    * @default true
    */
  var enablePage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A comma-separated string of Chrome tracing categories for which trace events
    * should be collected. An unspecified or empty string disables tracing.
    * @default ''
    */
  var tracingCategories: js.UndefOr[String] = js.undefined
}
object BufferUsageReportingInterval {
  
  inline def apply(): BufferUsageReportingInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferUsageReportingInterval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferUsageReportingInterval] (val x: Self) extends AnyVal {
    
    inline def setBufferUsageReportingInterval(value: Double): Self = StObject.set(x, "bufferUsageReportingInterval", value.asInstanceOf[js.Any])
    
    inline def setBufferUsageReportingIntervalUndefined: Self = StObject.set(x, "bufferUsageReportingInterval", js.undefined)
    
    inline def setEnableNetwork(value: Boolean): Self = StObject.set(x, "enableNetwork", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkUndefined: Self = StObject.set(x, "enableNetwork", js.undefined)
    
    inline def setEnablePage(value: Boolean): Self = StObject.set(x, "enablePage", value.asInstanceOf[js.Any])
    
    inline def setEnablePageUndefined: Self = StObject.set(x, "enablePage", js.undefined)
    
    inline def setTracingCategories(value: String): Self = StObject.set(x, "tracingCategories", value.asInstanceOf[js.Any])
    
    inline def setTracingCategoriesUndefined: Self = StObject.set(x, "tracingCategories", js.undefined)
  }
}
