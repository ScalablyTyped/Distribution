package typings.whatwgUrl

import typings.whatwgUrl.mod.StateOverride
import typings.whatwgUrl.mod.URLRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BaseURL extends StObject {
    
    var baseURL: js.UndefOr[String] = js.native
    
    var encodingOverride: js.UndefOr[String] = js.native
  }
  object BaseURL {
    
    @scala.inline
    def apply(): BaseURL = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseURL]
    }
    
    @scala.inline
    implicit class BaseURLMutableBuilder[Self <: BaseURL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      @scala.inline
      def setEncodingOverride(value: String): Self = StObject.set(x, "encodingOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingOverrideUndefined: Self = StObject.set(x, "encodingOverride", js.undefined)
    }
  }
  
  @js.native
  trait DoNotStripQMark extends StObject {
    
    var doNotStripQMark: js.UndefOr[Boolean] = js.native
  }
  object DoNotStripQMark {
    
    @scala.inline
    def apply(): DoNotStripQMark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoNotStripQMark]
    }
    
    @scala.inline
    implicit class DoNotStripQMarkMutableBuilder[Self <: DoNotStripQMark] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoNotStripQMark(value: Boolean): Self = StObject.set(x, "doNotStripQMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoNotStripQMarkUndefined: Self = StObject.set(x, "doNotStripQMark", js.undefined)
    }
  }
  
  @js.native
  trait EncodingOverride extends StObject {
    
    var baseURL: js.UndefOr[String] = js.native
    
    var encodingOverride: js.UndefOr[String] = js.native
    
    var stateOverride: js.UndefOr[StateOverride] = js.native
    
    var url: js.UndefOr[URLRecord] = js.native
  }
  object EncodingOverride {
    
    @scala.inline
    def apply(): EncodingOverride = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingOverride]
    }
    
    @scala.inline
    implicit class EncodingOverrideMutableBuilder[Self <: EncodingOverride] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      @scala.inline
      def setEncodingOverride(value: String): Self = StObject.set(x, "encodingOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingOverrideUndefined: Self = StObject.set(x, "encodingOverride", js.undefined)
      
      @scala.inline
      def setStateOverride(value: StateOverride): Self = StObject.set(x, "stateOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateOverrideUndefined: Self = StObject.set(x, "stateOverride", js.undefined)
      
      @scala.inline
      def setUrl(value: URLRecord): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
