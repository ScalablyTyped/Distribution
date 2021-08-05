package typings.svgInjector

import org.scalablytyped.runtime.Shortcut
import typings.std.Node
import typings.std.NodeList
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("svg-injector", JSImport.Namespace)
  @js.native
  val ^ : SVGInjector = js.native
  
  type SVGInjector = js.Function3[
    /* elements */ Node | NodeList | js.Array[Node], 
    /* options */ js.UndefOr[SVGInjectorOptions], 
    /* done */ js.UndefOr[js.Function1[/* elementCount */ Double, Unit]], 
    Unit
  ]
  
  trait SVGInjectorOptions extends StObject {
    
    /**
      * Callback to run during each SVG injection. The SVG element is passed if
      * the injection was successful.
      */
    var each: js.UndefOr[js.Function1[/* svg */ SVGElement | String, Unit]] = js.undefined
    
    /**
      * Whether to run scripts blocks found in the SVG.
      *
      * Possible values:
      * 'always' — Run scripts every time.
      * 'once' — Only run scripts once for each SVG.
      * 'never' — Ignore scripts (default)
      */
    var evalScripts: js.UndefOr[String] = js.undefined
    
    /**
      * Location of fallback pngs, if desired.
      */
    var pngFallback: js.UndefOr[String] = js.undefined
  }
  object SVGInjectorOptions {
    
    inline def apply(): SVGInjectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SVGInjectorOptions]
    }
    
    extension [Self <: SVGInjectorOptions](x: Self) {
      
      inline def setEach(value: /* svg */ SVGElement | String => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
      
      inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      inline def setEvalScripts(value: String): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      inline def setEvalScriptsUndefined: Self = StObject.set(x, "evalScripts", js.undefined)
      
      inline def setPngFallback(value: String): Self = StObject.set(x, "pngFallback", value.asInstanceOf[js.Any])
      
      inline def setPngFallbackUndefined: Self = StObject.set(x, "pngFallback", js.undefined)
    }
  }
  
  type _To = SVGInjector
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SVGInjector = ^
}
