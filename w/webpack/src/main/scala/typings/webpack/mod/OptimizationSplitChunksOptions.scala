package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.anon.AutomaticNameDelimiter
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.all
import typings.webpack.webpackStrings.async
import typings.webpack.webpackStrings.initial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options object for splitting chunks into smaller chunks.
  */
trait OptimizationSplitChunksOptions extends StObject {
  
  /**
  	 * Sets the name delimiter for created chunks.
  	 */
  var automaticNameDelimiter: js.UndefOr[String] = js.undefined
  
  /**
  	 * Assign modules to a cache group (modules from different cache groups are tried to keep in separate chunks, default categories: 'default', 'defaultVendors').
  	 */
  var cacheGroups: js.UndefOr[
    StringDictionary[String | `false` | js.Function | js.RegExp | OptimizationSplitChunksCacheGroup]
  ] = js.undefined
  
  /**
  	 * Select chunks for determining shared modules (defaults to "async", "initial" and "all" requires adding these chunks to the HTML).
  	 */
  var chunks: js.UndefOr[all | initial | async | (js.Function1[/* chunk */ Chunk, Boolean])] = js.undefined
  
  /**
  	 * Sets the size types which are used when a number is used for sizes.
  	 */
  var defaultSizeTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * Size threshold at which splitting is enforced and other restrictions (minRemainingSize, maxAsyncRequests, maxInitialRequests) are ignored.
  	 */
  var enforceSizeThreshold: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
  
  /**
  	 * Options for modules not selected by any other cache group.
  	 */
  var fallbackCacheGroup: js.UndefOr[AutomaticNameDelimiter] = js.undefined
  
  /**
  	 * Sets the template for the filename for created chunks.
  	 */
  var filename: js.UndefOr[
    String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
  
  /**
  	 * Prevents exposing path info when creating names for parts splitted by maxSize.
  	 */
  var hidePathInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Maximum number of requests which are accepted for on-demand loading.
  	 */
  var maxAsyncRequests: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Maximal size hint for the on-demand chunks.
  	 */
  var maxAsyncSize: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
  
  /**
  	 * Maximum number of initial chunks which are accepted for an entry point.
  	 */
  var maxInitialRequests: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Maximal size hint for the initial chunks.
  	 */
  var maxInitialSize: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
  
  /**
  	 * Maximal size hint for the created chunks.
  	 */
  var maxSize: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
  
  /**
  	 * Minimum number of times a module has to be duplicated until it's considered for splitting.
  	 */
  var minChunks: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Minimal size for the chunks the stay after moving the modules to a new chunk.
  	 */
  var minRemainingSize: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
  
  /**
  	 * Minimal size for the created chunks.
  	 */
  var minSize: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
  
  /**
  	 * Minimum size reduction due to the created chunk.
  	 */
  var minSizeReduction: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
  
  /**
  	 * Give chunks created a name (chunks with equal name are merged).
  	 */
  var name: js.UndefOr[String | `false` | js.Function] = js.undefined
  
  /**
  	 * Compare used exports when checking common modules. Modules will only be put in the same chunk when exports are equal.
  	 */
  var usedExports: js.UndefOr[Boolean] = js.undefined
}
object OptimizationSplitChunksOptions {
  
  inline def apply(): OptimizationSplitChunksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizationSplitChunksOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptimizationSplitChunksOptions] (val x: Self) extends AnyVal {
    
    inline def setAutomaticNameDelimiter(value: String): Self = StObject.set(x, "automaticNameDelimiter", value.asInstanceOf[js.Any])
    
    inline def setAutomaticNameDelimiterUndefined: Self = StObject.set(x, "automaticNameDelimiter", js.undefined)
    
    inline def setCacheGroups(
      value: StringDictionary[String | `false` | js.Function | js.RegExp | OptimizationSplitChunksCacheGroup]
    ): Self = StObject.set(x, "cacheGroups", value.asInstanceOf[js.Any])
    
    inline def setCacheGroupsUndefined: Self = StObject.set(x, "cacheGroups", js.undefined)
    
    inline def setChunks(value: all | initial | async | (js.Function1[/* chunk */ Chunk, Boolean])): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksFunction1(value: /* chunk */ Chunk => Boolean): Self = StObject.set(x, "chunks", js.Any.fromFunction1(value))
    
    inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    inline def setDefaultSizeTypes(value: js.Array[String]): Self = StObject.set(x, "defaultSizeTypes", value.asInstanceOf[js.Any])
    
    inline def setDefaultSizeTypesUndefined: Self = StObject.set(x, "defaultSizeTypes", js.undefined)
    
    inline def setDefaultSizeTypesVarargs(value: String*): Self = StObject.set(x, "defaultSizeTypes", js.Array(value*))
    
    inline def setEnforceSizeThreshold(value: Double | StringDictionary[Double]): Self = StObject.set(x, "enforceSizeThreshold", value.asInstanceOf[js.Any])
    
    inline def setEnforceSizeThresholdUndefined: Self = StObject.set(x, "enforceSizeThreshold", js.undefined)
    
    inline def setFallbackCacheGroup(value: AutomaticNameDelimiter): Self = StObject.set(x, "fallbackCacheGroup", value.asInstanceOf[js.Any])
    
    inline def setFallbackCacheGroupUndefined: Self = StObject.set(x, "fallbackCacheGroup", js.undefined)
    
    inline def setFilename(
      value: String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
    ): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameFunction2(value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "filename", js.Any.fromFunction2(value))
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setHidePathInfo(value: Boolean): Self = StObject.set(x, "hidePathInfo", value.asInstanceOf[js.Any])
    
    inline def setHidePathInfoUndefined: Self = StObject.set(x, "hidePathInfo", js.undefined)
    
    inline def setMaxAsyncRequests(value: Double): Self = StObject.set(x, "maxAsyncRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxAsyncRequestsUndefined: Self = StObject.set(x, "maxAsyncRequests", js.undefined)
    
    inline def setMaxAsyncSize(value: Double | StringDictionary[Double]): Self = StObject.set(x, "maxAsyncSize", value.asInstanceOf[js.Any])
    
    inline def setMaxAsyncSizeUndefined: Self = StObject.set(x, "maxAsyncSize", js.undefined)
    
    inline def setMaxInitialRequests(value: Double): Self = StObject.set(x, "maxInitialRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxInitialRequestsUndefined: Self = StObject.set(x, "maxInitialRequests", js.undefined)
    
    inline def setMaxInitialSize(value: Double | StringDictionary[Double]): Self = StObject.set(x, "maxInitialSize", value.asInstanceOf[js.Any])
    
    inline def setMaxInitialSizeUndefined: Self = StObject.set(x, "maxInitialSize", js.undefined)
    
    inline def setMaxSize(value: Double | StringDictionary[Double]): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinChunks(value: Double): Self = StObject.set(x, "minChunks", value.asInstanceOf[js.Any])
    
    inline def setMinChunksUndefined: Self = StObject.set(x, "minChunks", js.undefined)
    
    inline def setMinRemainingSize(value: Double | StringDictionary[Double]): Self = StObject.set(x, "minRemainingSize", value.asInstanceOf[js.Any])
    
    inline def setMinRemainingSizeUndefined: Self = StObject.set(x, "minRemainingSize", js.undefined)
    
    inline def setMinSize(value: Double | StringDictionary[Double]): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeReduction(value: Double | StringDictionary[Double]): Self = StObject.set(x, "minSizeReduction", value.asInstanceOf[js.Any])
    
    inline def setMinSizeReductionUndefined: Self = StObject.set(x, "minSizeReduction", js.undefined)
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    inline def setName(value: String | `false` | js.Function): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUsedExports(value: Boolean): Self = StObject.set(x, "usedExports", value.asInstanceOf[js.Any])
    
    inline def setUsedExportsUndefined: Self = StObject.set(x, "usedExports", js.undefined)
  }
}
