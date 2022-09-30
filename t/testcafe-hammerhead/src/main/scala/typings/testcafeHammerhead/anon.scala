package typings.testcafeHammerhead

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hostname extends StObject {
    
    var hostname: String
    
    var url: String
  }
  object Hostname {
    
    inline def apply(hostname: String, url: String): Hostname = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hostname]
    }
    
    extension [Self <: Hostname](x: Self) {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<testcafe-hammerhead.RequestFilterRuleObjectInitializer> */
  trait PartialRequestFilterRuleO extends StObject {
    
    var isAjax: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String | js.RegExp] = js.undefined
  }
  object PartialRequestFilterRuleO {
    
    inline def apply(): PartialRequestFilterRuleO = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRequestFilterRuleO]
    }
    
    extension [Self <: PartialRequestFilterRuleO](x: Self) {
      
      inline def setIsAjax(value: Boolean): Self = StObject.set(x, "isAjax", value.asInstanceOf[js.Any])
      
      inline def setIsAjaxUndefined: Self = StObject.set(x, "isAjax", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setUrl(value: String | js.RegExp): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Inlined std.Partial<testcafe-hammerhead.SessionOptions> */
  trait PartialSessionOptions extends StObject {
    
    var allowMultipleWindows: js.UndefOr[Boolean] = js.undefined
    
    var disablePageCaching: js.UndefOr[Boolean] = js.undefined
    
    var requestTimeout: js.UndefOr[RequestTimeout] = js.undefined
    
    var windowId: js.UndefOr[String] = js.undefined
  }
  object PartialSessionOptions {
    
    inline def apply(): PartialSessionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSessionOptions]
    }
    
    extension [Self <: PartialSessionOptions](x: Self) {
      
      inline def setAllowMultipleWindows(value: Boolean): Self = StObject.set(x, "allowMultipleWindows", value.asInstanceOf[js.Any])
      
      inline def setAllowMultipleWindowsUndefined: Self = StObject.set(x, "allowMultipleWindows", js.undefined)
      
      inline def setDisablePageCaching(value: Boolean): Self = StObject.set(x, "disablePageCaching", value.asInstanceOf[js.Any])
      
      inline def setDisablePageCachingUndefined: Self = StObject.set(x, "disablePageCaching", js.undefined)
      
      inline def setRequestTimeout(value: RequestTimeout): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      inline def setWindowId(value: String): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  trait Port extends StObject {
    
    var hostname: String
    
    var port: String
  }
  object Port {
    
    inline def apply(hostname: String, port: String): Port = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Port]
    }
    
    extension [Self <: Port](x: Self) {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
