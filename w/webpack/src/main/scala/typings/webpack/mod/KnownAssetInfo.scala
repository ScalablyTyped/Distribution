package typings.webpack.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownAssetInfo extends StObject {
  
  /**
  	 * the value(s) of the chunk hash used for this asset
  	 */
  var chunkhash: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
  	 * the value(s) of the content hash used for this asset
  	 */
  var contenthash: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
  	 * true, when asset is only used for development and doesn't count towards user-facing assets
  	 */
  var development: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * the value(s) of the full hash used for this asset
  	 */
  var fullhash: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
  	 * true, when asset ships data for updating an existing application (HMR)
  	 */
  var hotModuleReplacement: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * true, if the asset can be long term cached forever (contains a hash)
  	 */
  var immutable: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * true, when asset is javascript and an ESM
  	 */
  var javascriptModule: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * whether the asset is minimized
  	 */
  var minimized: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * the value(s) of the module hash used for this asset
  	 */
  var modulehash: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
  	 * object of pointers to other assets, keyed by type of relation (only points from parent to child)
  	 */
  var related: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
  
  /**
  	 * size in bytes, only set after asset has been emitted
  	 */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
  	 * when asset was created from a source file (potentially transformed), the original filename relative to compilation context
  	 */
  var sourceFilename: js.UndefOr[String] = js.undefined
}
object KnownAssetInfo {
  
  inline def apply(): KnownAssetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownAssetInfo]
  }
  
  extension [Self <: KnownAssetInfo](x: Self) {
    
    inline def setChunkhash(value: String | js.Array[String]): Self = StObject.set(x, "chunkhash", value.asInstanceOf[js.Any])
    
    inline def setChunkhashUndefined: Self = StObject.set(x, "chunkhash", js.undefined)
    
    inline def setChunkhashVarargs(value: String*): Self = StObject.set(x, "chunkhash", js.Array(value*))
    
    inline def setContenthash(value: String | js.Array[String]): Self = StObject.set(x, "contenthash", value.asInstanceOf[js.Any])
    
    inline def setContenthashUndefined: Self = StObject.set(x, "contenthash", js.undefined)
    
    inline def setContenthashVarargs(value: String*): Self = StObject.set(x, "contenthash", js.Array(value*))
    
    inline def setDevelopment(value: Boolean): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
    
    inline def setDevelopmentUndefined: Self = StObject.set(x, "development", js.undefined)
    
    inline def setFullhash(value: String | js.Array[String]): Self = StObject.set(x, "fullhash", value.asInstanceOf[js.Any])
    
    inline def setFullhashUndefined: Self = StObject.set(x, "fullhash", js.undefined)
    
    inline def setFullhashVarargs(value: String*): Self = StObject.set(x, "fullhash", js.Array(value*))
    
    inline def setHotModuleReplacement(value: Boolean): Self = StObject.set(x, "hotModuleReplacement", value.asInstanceOf[js.Any])
    
    inline def setHotModuleReplacementUndefined: Self = StObject.set(x, "hotModuleReplacement", js.undefined)
    
    inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
    
    inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
    
    inline def setJavascriptModule(value: Boolean): Self = StObject.set(x, "javascriptModule", value.asInstanceOf[js.Any])
    
    inline def setJavascriptModuleUndefined: Self = StObject.set(x, "javascriptModule", js.undefined)
    
    inline def setMinimized(value: Boolean): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
    
    inline def setMinimizedUndefined: Self = StObject.set(x, "minimized", js.undefined)
    
    inline def setModulehash(value: String | js.Array[String]): Self = StObject.set(x, "modulehash", value.asInstanceOf[js.Any])
    
    inline def setModulehashUndefined: Self = StObject.set(x, "modulehash", js.undefined)
    
    inline def setModulehashVarargs(value: String*): Self = StObject.set(x, "modulehash", js.Array(value*))
    
    inline def setRelated(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSourceFilename(value: String): Self = StObject.set(x, "sourceFilename", value.asInstanceOf[js.Any])
    
    inline def setSourceFilenameUndefined: Self = StObject.set(x, "sourceFilename", js.undefined)
  }
}
