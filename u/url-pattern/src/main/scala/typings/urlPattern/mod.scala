package typings.urlPattern

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-pattern", JSImport.Namespace)
  @js.native
  class ^ protected () extends UrlPattern {
    def this(pattern: String) = this()
    def this(pattern: RegExp) = this()
    def this(pattern: String, options: UrlPatternOptions) = this()
    def this(pattern: RegExp, groupNames: js.Array[String]) = this()
  }
  
  @js.native
  trait UrlPattern extends StObject {
    
    def `match`(url: String): js.Any = js.native
    
    def stringify(): String = js.native
    def stringify(values: js.Any): String = js.native
  }
  
  @js.native
  trait UrlPatternOptions extends StObject {
    
    var escapeChar: js.UndefOr[String] = js.native
    
    var optionalSegmentEndChar: js.UndefOr[String] = js.native
    
    var optionalSegmentStartChar: js.UndefOr[String] = js.native
    
    var segmentNameCharset: js.UndefOr[String] = js.native
    
    var segmentNameStartChar: js.UndefOr[String] = js.native
    
    var segmentValueCharset: js.UndefOr[String] = js.native
    
    var wildcardChar: js.UndefOr[String] = js.native
  }
  object UrlPatternOptions {
    
    @scala.inline
    def apply(): UrlPatternOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlPatternOptions]
    }
    
    @scala.inline
    implicit class UrlPatternOptionsMutableBuilder[Self <: UrlPatternOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEscapeChar(value: String): Self = StObject.set(x, "escapeChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeCharUndefined: Self = StObject.set(x, "escapeChar", js.undefined)
      
      @scala.inline
      def setOptionalSegmentEndChar(value: String): Self = StObject.set(x, "optionalSegmentEndChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalSegmentEndCharUndefined: Self = StObject.set(x, "optionalSegmentEndChar", js.undefined)
      
      @scala.inline
      def setOptionalSegmentStartChar(value: String): Self = StObject.set(x, "optionalSegmentStartChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalSegmentStartCharUndefined: Self = StObject.set(x, "optionalSegmentStartChar", js.undefined)
      
      @scala.inline
      def setSegmentNameCharset(value: String): Self = StObject.set(x, "segmentNameCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentNameCharsetUndefined: Self = StObject.set(x, "segmentNameCharset", js.undefined)
      
      @scala.inline
      def setSegmentNameStartChar(value: String): Self = StObject.set(x, "segmentNameStartChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentNameStartCharUndefined: Self = StObject.set(x, "segmentNameStartChar", js.undefined)
      
      @scala.inline
      def setSegmentValueCharset(value: String): Self = StObject.set(x, "segmentValueCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentValueCharsetUndefined: Self = StObject.set(x, "segmentValueCharset", js.undefined)
      
      @scala.inline
      def setWildcardChar(value: String): Self = StObject.set(x, "wildcardChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWildcardCharUndefined: Self = StObject.set(x, "wildcardChar", js.undefined)
    }
  }
}
