package typings.svg4everybody

import typings.std.SVGElement
import typings.std.SVGUseElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(options: Svg4everybodyOpts): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("svg4everybody", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Svg4everybodyOpts extends StObject {
    
    var attributeName: js.UndefOr[String] = js.undefined
    
    var fallback: js.UndefOr[
        js.Function3[/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement, String]
      ] = js.undefined
    
    var nosvg: js.UndefOr[Boolean] = js.undefined
    
    var polyfill: js.UndefOr[Boolean] = js.undefined
    
    var validate: js.UndefOr[
        js.Function3[/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement, Boolean]
      ] = js.undefined
  }
  object Svg4everybodyOpts {
    
    inline def apply(): Svg4everybodyOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Svg4everybodyOpts]
    }
    
    extension [Self <: Svg4everybodyOpts](x: Self) {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
      
      inline def setFallback(value: (/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement) => String): Self = StObject.set(x, "fallback", js.Any.fromFunction3(value))
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setNosvg(value: Boolean): Self = StObject.set(x, "nosvg", value.asInstanceOf[js.Any])
      
      inline def setNosvgUndefined: Self = StObject.set(x, "nosvg", js.undefined)
      
      inline def setPolyfill(value: Boolean): Self = StObject.set(x, "polyfill", value.asInstanceOf[js.Any])
      
      inline def setPolyfillUndefined: Self = StObject.set(x, "polyfill", js.undefined)
      
      inline def setValidate(value: (/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
}
