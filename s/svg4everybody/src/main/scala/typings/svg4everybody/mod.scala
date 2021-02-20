package typings.svg4everybody

import typings.std.SVGElement
import typings.std.SVGUseElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg4everybody", JSImport.Namespace)
  @js.native
  def apply(): Unit = js.native
  @JSImport("svg4everybody", JSImport.Namespace)
  @js.native
  def apply(options: Svg4everybodyOpts): Unit = js.native
  
  @js.native
  trait Svg4everybodyOpts extends StObject {
    
    var attributeName: js.UndefOr[String] = js.native
    
    var fallback: js.UndefOr[
        js.Function3[/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement, String]
      ] = js.native
    
    var nosvg: js.UndefOr[Boolean] = js.native
    
    var polyfill: js.UndefOr[Boolean] = js.native
    
    var validate: js.UndefOr[
        js.Function3[/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement, Boolean]
      ] = js.native
  }
  object Svg4everybodyOpts {
    
    @scala.inline
    def apply(): Svg4everybodyOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Svg4everybodyOpts]
    }
    
    @scala.inline
    implicit class Svg4everybodyOptsMutableBuilder[Self <: Svg4everybodyOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
      
      @scala.inline
      def setFallback(value: (/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement) => String): Self = StObject.set(x, "fallback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setNosvg(value: Boolean): Self = StObject.set(x, "nosvg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNosvgUndefined: Self = StObject.set(x, "nosvg", js.undefined)
      
      @scala.inline
      def setPolyfill(value: Boolean): Self = StObject.set(x, "polyfill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolyfillUndefined: Self = StObject.set(x, "polyfill", js.undefined)
      
      @scala.inline
      def setValidate(value: (/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
}
