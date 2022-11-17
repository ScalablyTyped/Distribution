package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImgHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var alt: js.UndefOr[String] = js.undefined
  
  var crossorigin: js.UndefOr["anonymous" | "use-credentials" | ""] = js.undefined
  
  var decoding: js.UndefOr["async" | "auto" | "sync"] = js.undefined
  
  var height: js.UndefOr[Numberish] = js.undefined
  
  var sizes: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var srcset: js.UndefOr[String] = js.undefined
  
  var usemap: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Numberish] = js.undefined
}
object ImgHTMLAttributes {
  
  inline def apply(): ImgHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImgHTMLAttributes]
  }
  
  extension [Self <: ImgHTMLAttributes](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setCrossorigin(value: "anonymous" | "use-credentials" | ""): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
    
    inline def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
    
    inline def setDecoding(value: "async" | "auto" | "sync"): Self = StObject.set(x, "decoding", value.asInstanceOf[js.Any])
    
    inline def setDecodingUndefined: Self = StObject.set(x, "decoding", js.undefined)
    
    inline def setHeight(value: Numberish): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
    
    inline def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
    
    inline def setUsemap(value: String): Self = StObject.set(x, "usemap", value.asInstanceOf[js.Any])
    
    inline def setUsemapUndefined: Self = StObject.set(x, "usemap", js.undefined)
    
    inline def setWidth(value: Numberish): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
