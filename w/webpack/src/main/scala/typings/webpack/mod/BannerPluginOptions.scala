package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BannerPluginOptions extends StObject {
  
  /**
  	 * Specifies the banner.
  	 */
  var banner: String | (js.Function1[/* data */ typings.webpack.anon.Chunk, String])
  
  /**
  	 * If true, the banner will only be added to the entry chunks.
  	 */
  var entryOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Exclude all modules matching any of these conditions.
  	 */
  var exclude: js.UndefOr[String | js.RegExp | js.Array[Rule]] = js.undefined
  
  /**
  	 * If true, banner will be placed at the end of the output.
  	 */
  var footer: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Include all modules matching any of these conditions.
  	 */
  var include: js.UndefOr[String | js.RegExp | js.Array[Rule]] = js.undefined
  
  /**
  	 * If true, banner will not be wrapped in a comment.
  	 */
  var raw: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Include all modules that pass test assertion.
  	 */
  var test: js.UndefOr[String | js.RegExp | js.Array[Rule]] = js.undefined
}
object BannerPluginOptions {
  
  inline def apply(banner: String | (js.Function1[/* data */ typings.webpack.anon.Chunk, String])): BannerPluginOptions = {
    val __obj = js.Dynamic.literal(banner = banner.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannerPluginOptions]
  }
  
  extension [Self <: BannerPluginOptions](x: Self) {
    
    inline def setBanner(value: String | (js.Function1[/* data */ typings.webpack.anon.Chunk, String])): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    inline def setBannerFunction1(value: /* data */ typings.webpack.anon.Chunk => String): Self = StObject.set(x, "banner", js.Any.fromFunction1(value))
    
    inline def setEntryOnly(value: Boolean): Self = StObject.set(x, "entryOnly", value.asInstanceOf[js.Any])
    
    inline def setEntryOnlyUndefined: Self = StObject.set(x, "entryOnly", js.undefined)
    
    inline def setExclude(value: String | js.RegExp | js.Array[Rule]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: Rule*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setFooter(value: Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setInclude(value: String | js.RegExp | js.Array[Rule]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: Rule*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setTest(value: String | js.RegExp | js.Array[Rule]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setTestVarargs(value: Rule*): Self = StObject.set(x, "test", js.Array(value*))
  }
}
