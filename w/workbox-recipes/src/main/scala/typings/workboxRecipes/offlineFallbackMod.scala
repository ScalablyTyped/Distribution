package typings.workboxRecipes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offlineFallbackMod {
  
  @JSImport("workbox-recipes/offlineFallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An implementation of the [comprehensive fallbacks recipe]{@link https://developers.google.com/web/tools/workbox/guides/advanced-recipes#comprehensive_fallbacks}. Be sure to include the fallbacks in your precache injection
    *
    * @memberof workbox-recipes
    *
    * @param {Object} [options]
    * @param {string} [options.pageFallback] Precache name to match for pag fallbacks. Defaults to offline.html
    * @param {string} [options.imageFallback] Precache name to match for image fallbacks.
    * @param {string} [options.fontFallback] Precache name to match for font fallbacks.
    */
  inline def offlineFallback(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offlineFallback")().asInstanceOf[Unit]
  inline def offlineFallback(options: OfflineFallbackOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offlineFallback")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait OfflineFallbackOptions extends StObject {
    
    var fontFallback: js.UndefOr[String] = js.undefined
    
    var imageFallback: js.UndefOr[String] = js.undefined
    
    var pageFallback: js.UndefOr[String] = js.undefined
  }
  object OfflineFallbackOptions {
    
    inline def apply(): OfflineFallbackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OfflineFallbackOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OfflineFallbackOptions] (val x: Self) extends AnyVal {
      
      inline def setFontFallback(value: String): Self = StObject.set(x, "fontFallback", value.asInstanceOf[js.Any])
      
      inline def setFontFallbackUndefined: Self = StObject.set(x, "fontFallback", js.undefined)
      
      inline def setImageFallback(value: String): Self = StObject.set(x, "imageFallback", value.asInstanceOf[js.Any])
      
      inline def setImageFallbackUndefined: Self = StObject.set(x, "imageFallback", js.undefined)
      
      inline def setPageFallback(value: String): Self = StObject.set(x, "pageFallback", value.asInstanceOf[js.Any])
      
      inline def setPageFallbackUndefined: Self = StObject.set(x, "pageFallback", js.undefined)
    }
  }
}
