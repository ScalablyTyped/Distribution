package typings.workboxRecipes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleFontsCacheMod {
  
  @JSImport("workbox-recipes/googleFontsCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An implementation of the [Google fonts]{@link https://developers.google.com/web/tools/workbox/guides/common-recipes#google_fonts} caching recipe
    *
    * @memberof workbox-recipes
    *
    * @param {Object} [options]
    * @param {string} [options.cachePrefix] Cache prefix for caching stylesheets and webfonts. Defaults to google-fonts
    * @param {number} [options.maxAgeSeconds] Maximum age, in seconds, that font entries will be cached for. Defaults to 1 year
    * @param {number} [options.maxEntries] Maximum number of fonts that will be cached. Defaults to 30
    */
  inline def googleFontsCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("googleFontsCache")().asInstanceOf[Unit]
  inline def googleFontsCache(options: GoogleFontCacheOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("googleFontsCache")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait GoogleFontCacheOptions extends StObject {
    
    var cachePrefix: js.UndefOr[String] = js.undefined
    
    var maxAgeSeconds: js.UndefOr[Double] = js.undefined
    
    var maxEntries: js.UndefOr[Double] = js.undefined
  }
  object GoogleFontCacheOptions {
    
    inline def apply(): GoogleFontCacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoogleFontCacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GoogleFontCacheOptions] (val x: Self) extends AnyVal {
      
      inline def setCachePrefix(value: String): Self = StObject.set(x, "cachePrefix", value.asInstanceOf[js.Any])
      
      inline def setCachePrefixUndefined: Self = StObject.set(x, "cachePrefix", js.undefined)
      
      inline def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
      
      inline def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      inline def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
    }
  }
}
