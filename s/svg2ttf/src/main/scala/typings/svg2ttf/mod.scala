package typings.svg2ttf

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(svgFontString: String): MicroBuffer = ^.asInstanceOf[js.Dynamic].apply(svgFontString.asInstanceOf[js.Any]).asInstanceOf[MicroBuffer]
  inline def apply(svgFontString: String, options: FontOptions): MicroBuffer = (^.asInstanceOf[js.Dynamic].apply(svgFontString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MicroBuffer]
  
  @JSImport("svg2ttf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FontOptions extends StObject {
    
    var copyright: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Unix timestamp (in seconds) to override creation time
      */
    var ts: js.UndefOr[Double] = js.undefined
    
    /**
      * manufacturer url
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * font version string, can be Version x.y or x.y
      * @default 'Version 1.0'
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object FontOptions {
    
    inline def apply(): FontOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontOptions]
    }
    
    extension [Self <: FontOptions](x: Self) {
      
      inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait MicroBuffer extends StObject {
    
    var buffer: Uint8Array
  }
  object MicroBuffer {
    
    inline def apply(buffer: Uint8Array): MicroBuffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[MicroBuffer]
    }
    
    extension [Self <: MicroBuffer](x: Self) {
      
      inline def setBuffer(value: Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    }
  }
}
