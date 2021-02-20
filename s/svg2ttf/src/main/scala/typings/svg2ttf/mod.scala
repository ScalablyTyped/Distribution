package typings.svg2ttf

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg2ttf", JSImport.Namespace)
  @js.native
  def apply(svgFontString: String): MicroBuffer = js.native
  @JSImport("svg2ttf", JSImport.Namespace)
  @js.native
  def apply(svgFontString: String, options: FontOptions): MicroBuffer = js.native
  
  @js.native
  trait FontOptions extends StObject {
    
    var copyright: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    /**
      * Unix timestamp (in seconds) to override creation time
      */
    var ts: js.UndefOr[Double] = js.native
    
    /**
      * manufacturer url
      */
    var url: js.UndefOr[String] = js.native
    
    /**
      * font version string, can be Version x.y or x.y
      * @default 'Version 1.0'
      */
    var version: js.UndefOr[String] = js.native
  }
  object FontOptions {
    
    @scala.inline
    def apply(): FontOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontOptions]
    }
    
    @scala.inline
    implicit class FontOptionsMutableBuilder[Self <: FontOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait MicroBuffer extends StObject {
    
    var buffer: Uint8Array = js.native
  }
  object MicroBuffer {
    
    @scala.inline
    def apply(buffer: Uint8Array): MicroBuffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[MicroBuffer]
    }
    
    @scala.inline
    implicit class MicroBufferMutableBuilder[Self <: MicroBuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    }
  }
}
