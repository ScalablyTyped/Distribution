package typings.urlPattern

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-pattern", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with UrlPattern {
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
  
  trait UrlPatternOptions extends StObject {
    
    var escapeChar: js.UndefOr[String] = js.undefined
    
    var optionalSegmentEndChar: js.UndefOr[String] = js.undefined
    
    var optionalSegmentStartChar: js.UndefOr[String] = js.undefined
    
    var segmentNameCharset: js.UndefOr[String] = js.undefined
    
    var segmentNameStartChar: js.UndefOr[String] = js.undefined
    
    var segmentValueCharset: js.UndefOr[String] = js.undefined
    
    var wildcardChar: js.UndefOr[String] = js.undefined
  }
  object UrlPatternOptions {
    
    inline def apply(): UrlPatternOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlPatternOptions]
    }
    
    extension [Self <: UrlPatternOptions](x: Self) {
      
      inline def setEscapeChar(value: String): Self = StObject.set(x, "escapeChar", value.asInstanceOf[js.Any])
      
      inline def setEscapeCharUndefined: Self = StObject.set(x, "escapeChar", js.undefined)
      
      inline def setOptionalSegmentEndChar(value: String): Self = StObject.set(x, "optionalSegmentEndChar", value.asInstanceOf[js.Any])
      
      inline def setOptionalSegmentEndCharUndefined: Self = StObject.set(x, "optionalSegmentEndChar", js.undefined)
      
      inline def setOptionalSegmentStartChar(value: String): Self = StObject.set(x, "optionalSegmentStartChar", value.asInstanceOf[js.Any])
      
      inline def setOptionalSegmentStartCharUndefined: Self = StObject.set(x, "optionalSegmentStartChar", js.undefined)
      
      inline def setSegmentNameCharset(value: String): Self = StObject.set(x, "segmentNameCharset", value.asInstanceOf[js.Any])
      
      inline def setSegmentNameCharsetUndefined: Self = StObject.set(x, "segmentNameCharset", js.undefined)
      
      inline def setSegmentNameStartChar(value: String): Self = StObject.set(x, "segmentNameStartChar", value.asInstanceOf[js.Any])
      
      inline def setSegmentNameStartCharUndefined: Self = StObject.set(x, "segmentNameStartChar", js.undefined)
      
      inline def setSegmentValueCharset(value: String): Self = StObject.set(x, "segmentValueCharset", value.asInstanceOf[js.Any])
      
      inline def setSegmentValueCharsetUndefined: Self = StObject.set(x, "segmentValueCharset", js.undefined)
      
      inline def setWildcardChar(value: String): Self = StObject.set(x, "wildcardChar", value.asInstanceOf[js.Any])
      
      inline def setWildcardCharUndefined: Self = StObject.set(x, "wildcardChar", js.undefined)
    }
  }
}
