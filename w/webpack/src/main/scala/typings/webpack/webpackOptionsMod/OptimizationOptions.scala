package typings.webpack.webpackOptionsMod

import typings.webpack.anon.Name
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.`total-size`
import typings.webpack.webpackStrings.hashed
import typings.webpack.webpackStrings.multiple
import typings.webpack.webpackStrings.named
import typings.webpack.webpackStrings.natural
import typings.webpack.webpackStrings.single
import typings.webpack.webpackStrings.size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimizationOptions extends StObject {
  
  /**
  	 * Check for incompatible wasm types when importing/exporting from/to ESM
  	 */
  var checkWasmTypes: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Define the algorithm to choose chunk ids (named: readable ids for better debugging, size: numeric ids focused on minimal initial download size, total-size: numeric ids focused on minimal total download size, false: no algorithm used, as custom one can be provided via plugin)
  	 */
  var chunkIds: js.UndefOr[natural | named | size | `total-size` | `false`] = js.native
  
  /**
  	 * Concatenate modules when possible to generate less modules, more efficient code and enable more optimizations by the minimizer
  	 */
  var concatenateModules: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Also flag chunks as loaded which contain a subset of the modules
  	 */
  var flagIncludedChunks: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Use hashed module id instead module identifiers for better long term caching (deprecated, used moduleIds: hashed instead)
  	 */
  var hashedModuleIds: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Reduce size of WASM by changing imports to shorter strings.
  	 */
  var mangleWasmImports: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Merge chunks which contain the same modules
  	 */
  var mergeDuplicateChunks: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enable minimizing the output. Uses optimization.minimizer.
  	 */
  var minimize: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Minimizer(s) to use for minimizing the output
  	 */
  var minimizer: js.UndefOr[js.Array[WebpackPluginInstance | WebpackPluginFunction]] = js.native
  
  /**
  	 * Define the algorithm to choose module ids (natural: numeric ids in order of usage, named: readable ids for better debugging, hashed: short hashes as ids for better long term caching, size: numeric ids focused on minimal initial download size, total-size: numeric ids focused on minimal total download size, false: no algorithm used, as custom one can be provided via plugin)
  	 */
  var moduleIds: js.UndefOr[natural | named | hashed | size | `total-size` | `false`] = js.native
  
  /**
  	 * Use readable chunk identifiers for better debugging (deprecated, used chunkIds: named instead)
  	 */
  var namedChunks: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Use readable module identifiers for better debugging (deprecated, used moduleIds: named instead)
  	 */
  var namedModules: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Avoid emitting assets when errors occur
  	 */
  var noEmitOnErrors: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Set process.env.NODE_ENV to a specific value
  	 */
  var nodeEnv: js.UndefOr[`false` | String] = js.native
  
  /**
  	 * Figure out a order of modules which results in the smallest initial bundle
  	 */
  var occurrenceOrder: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Generate records with relative paths to be able to move the context folder
  	 */
  var portableRecords: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Figure out which exports are provided by modules to generate more efficient code
  	 */
  var providedExports: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Removes modules from chunks when these modules are already included in all parents
  	 */
  var removeAvailableModules: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Remove chunks which are empty
  	 */
  var removeEmptyChunks: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Create an additional chunk which contains only the webpack runtime and chunk hash maps
  	 */
  var runtimeChunk: js.UndefOr[Boolean | single | multiple | Name] = js.native
  
  /**
  	 * Skip over modules which are flagged to contain no side effects when exports are not used
  	 */
  var sideEffects: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Optimize duplication and caching by splitting chunks by shared modules and cache group
  	 */
  var splitChunks: js.UndefOr[`false` | OptimizationSplitChunksOptions] = js.native
  
  /**
  	 * Figure out which exports are used by modules to mangle export names, omit unused exports and generate more efficient code
  	 */
  var usedExports: js.UndefOr[Boolean] = js.native
}
object OptimizationOptions {
  
  @scala.inline
  def apply(): OptimizationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizationOptions]
  }
  
  @scala.inline
  implicit class OptimizationOptionsMutableBuilder[Self <: OptimizationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckWasmTypes(value: Boolean): Self = StObject.set(x, "checkWasmTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckWasmTypesUndefined: Self = StObject.set(x, "checkWasmTypes", js.undefined)
    
    @scala.inline
    def setChunkIds(value: natural | named | size | `total-size` | `false`): Self = StObject.set(x, "chunkIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkIdsUndefined: Self = StObject.set(x, "chunkIds", js.undefined)
    
    @scala.inline
    def setConcatenateModules(value: Boolean): Self = StObject.set(x, "concatenateModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcatenateModulesUndefined: Self = StObject.set(x, "concatenateModules", js.undefined)
    
    @scala.inline
    def setFlagIncludedChunks(value: Boolean): Self = StObject.set(x, "flagIncludedChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagIncludedChunksUndefined: Self = StObject.set(x, "flagIncludedChunks", js.undefined)
    
    @scala.inline
    def setHashedModuleIds(value: Boolean): Self = StObject.set(x, "hashedModuleIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashedModuleIdsUndefined: Self = StObject.set(x, "hashedModuleIds", js.undefined)
    
    @scala.inline
    def setMangleWasmImports(value: Boolean): Self = StObject.set(x, "mangleWasmImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMangleWasmImportsUndefined: Self = StObject.set(x, "mangleWasmImports", js.undefined)
    
    @scala.inline
    def setMergeDuplicateChunks(value: Boolean): Self = StObject.set(x, "mergeDuplicateChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeDuplicateChunksUndefined: Self = StObject.set(x, "mergeDuplicateChunks", js.undefined)
    
    @scala.inline
    def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
    
    @scala.inline
    def setMinimizer(value: js.Array[WebpackPluginInstance | WebpackPluginFunction]): Self = StObject.set(x, "minimizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimizerUndefined: Self = StObject.set(x, "minimizer", js.undefined)
    
    @scala.inline
    def setMinimizerVarargs(value: (WebpackPluginInstance | WebpackPluginFunction)*): Self = StObject.set(x, "minimizer", js.Array(value :_*))
    
    @scala.inline
    def setModuleIds(value: natural | named | hashed | size | `total-size` | `false`): Self = StObject.set(x, "moduleIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleIdsUndefined: Self = StObject.set(x, "moduleIds", js.undefined)
    
    @scala.inline
    def setNamedChunks(value: Boolean): Self = StObject.set(x, "namedChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedChunksUndefined: Self = StObject.set(x, "namedChunks", js.undefined)
    
    @scala.inline
    def setNamedModules(value: Boolean): Self = StObject.set(x, "namedModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedModulesUndefined: Self = StObject.set(x, "namedModules", js.undefined)
    
    @scala.inline
    def setNoEmitOnErrors(value: Boolean): Self = StObject.set(x, "noEmitOnErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoEmitOnErrorsUndefined: Self = StObject.set(x, "noEmitOnErrors", js.undefined)
    
    @scala.inline
    def setNodeEnv(value: `false` | String): Self = StObject.set(x, "nodeEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeEnvUndefined: Self = StObject.set(x, "nodeEnv", js.undefined)
    
    @scala.inline
    def setOccurrenceOrder(value: Boolean): Self = StObject.set(x, "occurrenceOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceOrderUndefined: Self = StObject.set(x, "occurrenceOrder", js.undefined)
    
    @scala.inline
    def setPortableRecords(value: Boolean): Self = StObject.set(x, "portableRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortableRecordsUndefined: Self = StObject.set(x, "portableRecords", js.undefined)
    
    @scala.inline
    def setProvidedExports(value: Boolean): Self = StObject.set(x, "providedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidedExportsUndefined: Self = StObject.set(x, "providedExports", js.undefined)
    
    @scala.inline
    def setRemoveAvailableModules(value: Boolean): Self = StObject.set(x, "removeAvailableModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAvailableModulesUndefined: Self = StObject.set(x, "removeAvailableModules", js.undefined)
    
    @scala.inline
    def setRemoveEmptyChunks(value: Boolean): Self = StObject.set(x, "removeEmptyChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEmptyChunksUndefined: Self = StObject.set(x, "removeEmptyChunks", js.undefined)
    
    @scala.inline
    def setRuntimeChunk(value: Boolean | single | multiple | Name): Self = StObject.set(x, "runtimeChunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeChunkUndefined: Self = StObject.set(x, "runtimeChunk", js.undefined)
    
    @scala.inline
    def setSideEffects(value: Boolean): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
    
    @scala.inline
    def setSplitChunks(value: `false` | OptimizationSplitChunksOptions): Self = StObject.set(x, "splitChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitChunksUndefined: Self = StObject.set(x, "splitChunks", js.undefined)
    
    @scala.inline
    def setUsedExports(value: Boolean): Self = StObject.set(x, "usedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedExportsUndefined: Self = StObject.set(x, "usedExports", js.undefined)
  }
}
