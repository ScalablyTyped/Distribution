package typings.whatwgUrl

import typings.whatwgUrl.mod.StateOverride
import typings.whatwgUrl.mod.URLRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BaseURL extends StObject {
    
    var baseURL: js.UndefOr[String] = js.undefined
    
    var encodingOverride: js.UndefOr[String] = js.undefined
  }
  object BaseURL {
    
    inline def apply(): BaseURL = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseURL]
    }
    
    extension [Self <: BaseURL](x: Self) {
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      inline def setEncodingOverride(value: String): Self = StObject.set(x, "encodingOverride", value.asInstanceOf[js.Any])
      
      inline def setEncodingOverrideUndefined: Self = StObject.set(x, "encodingOverride", js.undefined)
    }
  }
  
  trait DoNotStripQMark extends StObject {
    
    var doNotStripQMark: js.UndefOr[Boolean] = js.undefined
  }
  object DoNotStripQMark {
    
    inline def apply(): DoNotStripQMark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoNotStripQMark]
    }
    
    extension [Self <: DoNotStripQMark](x: Self) {
      
      inline def setDoNotStripQMark(value: Boolean): Self = StObject.set(x, "doNotStripQMark", value.asInstanceOf[js.Any])
      
      inline def setDoNotStripQMarkUndefined: Self = StObject.set(x, "doNotStripQMark", js.undefined)
    }
  }
  
  trait EncodingOverride extends StObject {
    
    var baseURL: js.UndefOr[String] = js.undefined
    
    var encodingOverride: js.UndefOr[String] = js.undefined
    
    var stateOverride: js.UndefOr[StateOverride] = js.undefined
    
    var url: js.UndefOr[URLRecord] = js.undefined
  }
  object EncodingOverride {
    
    inline def apply(): EncodingOverride = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingOverride]
    }
    
    extension [Self <: EncodingOverride](x: Self) {
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      inline def setEncodingOverride(value: String): Self = StObject.set(x, "encodingOverride", value.asInstanceOf[js.Any])
      
      inline def setEncodingOverrideUndefined: Self = StObject.set(x, "encodingOverride", js.undefined)
      
      inline def setStateOverride(value: StateOverride): Self = StObject.set(x, "stateOverride", value.asInstanceOf[js.Any])
      
      inline def setStateOverrideUndefined: Self = StObject.set(x, "stateOverride", js.undefined)
      
      inline def setUrl(value: URLRecord): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
