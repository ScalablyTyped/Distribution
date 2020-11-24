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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimizationOptions extends js.Object {
  
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
  implicit class OptimizationOptionsOps[Self <: OptimizationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckWasmTypes(value: Boolean): Self = this.set("checkWasmTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckWasmTypes: Self = this.set("checkWasmTypes", js.undefined)
    
    @scala.inline
    def setChunkIds(value: natural | named | size | `total-size` | `false`): Self = this.set("chunkIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkIds: Self = this.set("chunkIds", js.undefined)
    
    @scala.inline
    def setConcatenateModules(value: Boolean): Self = this.set("concatenateModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcatenateModules: Self = this.set("concatenateModules", js.undefined)
    
    @scala.inline
    def setFlagIncludedChunks(value: Boolean): Self = this.set("flagIncludedChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlagIncludedChunks: Self = this.set("flagIncludedChunks", js.undefined)
    
    @scala.inline
    def setHashedModuleIds(value: Boolean): Self = this.set("hashedModuleIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashedModuleIds: Self = this.set("hashedModuleIds", js.undefined)
    
    @scala.inline
    def setMangleWasmImports(value: Boolean): Self = this.set("mangleWasmImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMangleWasmImports: Self = this.set("mangleWasmImports", js.undefined)
    
    @scala.inline
    def setMergeDuplicateChunks(value: Boolean): Self = this.set("mergeDuplicateChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeDuplicateChunks: Self = this.set("mergeDuplicateChunks", js.undefined)
    
    @scala.inline
    def setMinimize(value: Boolean): Self = this.set("minimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimize: Self = this.set("minimize", js.undefined)
    
    @scala.inline
    def setMinimizerVarargs(value: (WebpackPluginInstance | WebpackPluginFunction)*): Self = this.set("minimizer", js.Array(value :_*))
    
    @scala.inline
    def setMinimizer(value: js.Array[WebpackPluginInstance | WebpackPluginFunction]): Self = this.set("minimizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimizer: Self = this.set("minimizer", js.undefined)
    
    @scala.inline
    def setModuleIds(value: natural | named | hashed | size | `total-size` | `false`): Self = this.set("moduleIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleIds: Self = this.set("moduleIds", js.undefined)
    
    @scala.inline
    def setNamedChunks(value: Boolean): Self = this.set("namedChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedChunks: Self = this.set("namedChunks", js.undefined)
    
    @scala.inline
    def setNamedModules(value: Boolean): Self = this.set("namedModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedModules: Self = this.set("namedModules", js.undefined)
    
    @scala.inline
    def setNoEmitOnErrors(value: Boolean): Self = this.set("noEmitOnErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEmitOnErrors: Self = this.set("noEmitOnErrors", js.undefined)
    
    @scala.inline
    def setNodeEnv(value: `false` | String): Self = this.set("nodeEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeEnv: Self = this.set("nodeEnv", js.undefined)
    
    @scala.inline
    def setOccurrenceOrder(value: Boolean): Self = this.set("occurrenceOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrenceOrder: Self = this.set("occurrenceOrder", js.undefined)
    
    @scala.inline
    def setPortableRecords(value: Boolean): Self = this.set("portableRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortableRecords: Self = this.set("portableRecords", js.undefined)
    
    @scala.inline
    def setProvidedExports(value: Boolean): Self = this.set("providedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvidedExports: Self = this.set("providedExports", js.undefined)
    
    @scala.inline
    def setRemoveAvailableModules(value: Boolean): Self = this.set("removeAvailableModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveAvailableModules: Self = this.set("removeAvailableModules", js.undefined)
    
    @scala.inline
    def setRemoveEmptyChunks(value: Boolean): Self = this.set("removeEmptyChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveEmptyChunks: Self = this.set("removeEmptyChunks", js.undefined)
    
    @scala.inline
    def setRuntimeChunk(value: Boolean | single | multiple | Name): Self = this.set("runtimeChunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeChunk: Self = this.set("runtimeChunk", js.undefined)
    
    @scala.inline
    def setSideEffects(value: Boolean): Self = this.set("sideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideEffects: Self = this.set("sideEffects", js.undefined)
    
    @scala.inline
    def setSplitChunks(value: `false` | OptimizationSplitChunksOptions): Self = this.set("splitChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitChunks: Self = this.set("splitChunks", js.undefined)
    
    @scala.inline
    def setUsedExports(value: Boolean): Self = this.set("usedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedExports: Self = this.set("usedExports", js.undefined)
  }
}
