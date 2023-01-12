package typings.vueCompilerSfc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetURLOptions extends StObject {
  
  /**
    * If base is provided, instead of transforming relative asset urls into
    * imports, they will be directly rewritten to absolute urls.
    */
  var base: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, also processes absolute urls.
    */
  var includeAbsolute: js.UndefOr[Boolean] = js.undefined
  
  var tags: js.UndefOr[AssetURLTagConfig] = js.undefined
}
object AssetURLOptions {
  
  inline def apply(): AssetURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetURLOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetURLOptions] (val x: Self) extends AnyVal {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseNull: Self = StObject.set(x, "base", null)
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setIncludeAbsolute(value: Boolean): Self = StObject.set(x, "includeAbsolute", value.asInstanceOf[js.Any])
    
    inline def setIncludeAbsoluteUndefined: Self = StObject.set(x, "includeAbsolute", js.undefined)
    
    inline def setTags(value: AssetURLTagConfig): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
