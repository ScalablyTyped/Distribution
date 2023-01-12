package typings.webpack.mod

import typings.webpack.anon.`2`
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.DotDotDot
import typings.webpack.webpackStrings.`total-size`
import typings.webpack.webpackStrings.deterministic
import typings.webpack.webpackStrings.flag
import typings.webpack.webpackStrings.global
import typings.webpack.webpackStrings.hashed
import typings.webpack.webpackStrings.multiple
import typings.webpack.webpackStrings.named
import typings.webpack.webpackStrings.natural
import typings.webpack.webpackStrings.single
import typings.webpack.webpackStrings.size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables/Disables integrated optimizations.
  */
trait Optimization extends StObject {
  
  /**
  	 * Check for incompatible wasm types when importing/exporting from/to ESM.
  	 */
  var checkWasmTypes: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Define the algorithm to choose chunk ids (named: readable ids for better debugging, deterministic: numeric hash ids for better long term caching, size: numeric ids focused on minimal initial download size, total-size: numeric ids focused on minimal total download size, false: no algorithm used, as custom one can be provided via plugin).
  	 */
  var chunkIds: js.UndefOr[`false` | natural | named | deterministic | size | `total-size`] = js.undefined
  
  /**
  	 * Concatenate modules when possible to generate less modules, more efficient code and enable more optimizations by the minimizer.
  	 */
  var concatenateModules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Emit assets even when errors occur. Critical errors are emitted into the generated code and will cause errors at runtime.
  	 */
  var emitOnErrors: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Also flag chunks as loaded which contain a subset of the modules.
  	 */
  var flagIncludedChunks: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Creates a module-internal dependency graph for top level symbols, exports and imports, to improve unused exports detection.
  	 */
  var innerGraph: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Rename exports when possible to generate shorter code (depends on optimization.usedExports and optimization.providedExports, true/"deterministic": generate short deterministic names optimized for caching, "size": generate the shortest possible names).
  	 */
  var mangleExports: js.UndefOr[Boolean | deterministic | size] = js.undefined
  
  /**
  	 * Reduce size of WASM by changing imports to shorter strings.
  	 */
  var mangleWasmImports: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Merge chunks which contain the same modules.
  	 */
  var mergeDuplicateChunks: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable minimizing the output. Uses optimization.minimizer.
  	 */
  var minimize: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Minimizer(s) to use for minimizing the output.
  	 */
  var minimizer: js.UndefOr[
    js.Array[
      (js.ThisFunction1[/* this */ Compiler, /* compiler */ Compiler, Unit]) | WebpackPluginInstance | DotDotDot
    ]
  ] = js.undefined
  
  /**
  	 * Define the algorithm to choose module ids (natural: numeric ids in order of usage, named: readable ids for better debugging, hashed: (deprecated) short hashes as ids for better long term caching, deterministic: numeric hash ids for better long term caching, size: numeric ids focused on minimal initial download size, false: no algorithm used, as custom one can be provided via plugin).
  	 */
  var moduleIds: js.UndefOr[`false` | natural | named | deterministic | size | hashed] = js.undefined
  
  /**
  	 * Avoid emitting assets when errors occur (deprecated: use 'emitOnErrors' instead).
  	 */
  var noEmitOnErrors: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Set process.env.NODE_ENV to a specific value.
  	 */
  var nodeEnv: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * Generate records with relative paths to be able to move the context folder.
  	 */
  var portableRecords: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Figure out which exports are provided by modules to generate more efficient code.
  	 */
  var providedExports: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Use real [contenthash] based on final content of the assets.
  	 */
  var realContentHash: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Removes modules from chunks when these modules are already included in all parents.
  	 */
  var removeAvailableModules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Remove chunks which are empty.
  	 */
  var removeEmptyChunks: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Create an additional chunk which contains only the webpack runtime and chunk hash maps.
  	 */
  var runtimeChunk: js.UndefOr[Boolean | single | multiple | `2`] = js.undefined
  
  /**
  	 * Skip over modules which contain no side effects when exports are not used (false: disabled, 'flag': only use manually placed side effects flag, true: also analyse source code for side effects).
  	 */
  var sideEffects: js.UndefOr[Boolean | flag] = js.undefined
  
  /**
  	 * Optimize duplication and caching by splitting chunks by shared modules and cache group.
  	 */
  var splitChunks: js.UndefOr[`false` | OptimizationSplitChunksOptions] = js.undefined
  
  /**
  	 * Figure out which exports are used by modules to mangle export names, omit unused exports and generate more efficient code (true: analyse used exports for each runtime, "global": analyse exports globally for all runtimes combined).
  	 */
  var usedExports: js.UndefOr[Boolean | global] = js.undefined
}
object Optimization {
  
  inline def apply(): Optimization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optimization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Optimization] (val x: Self) extends AnyVal {
    
    inline def setCheckWasmTypes(value: Boolean): Self = StObject.set(x, "checkWasmTypes", value.asInstanceOf[js.Any])
    
    inline def setCheckWasmTypesUndefined: Self = StObject.set(x, "checkWasmTypes", js.undefined)
    
    inline def setChunkIds(value: `false` | natural | named | deterministic | size | `total-size`): Self = StObject.set(x, "chunkIds", value.asInstanceOf[js.Any])
    
    inline def setChunkIdsUndefined: Self = StObject.set(x, "chunkIds", js.undefined)
    
    inline def setConcatenateModules(value: Boolean): Self = StObject.set(x, "concatenateModules", value.asInstanceOf[js.Any])
    
    inline def setConcatenateModulesUndefined: Self = StObject.set(x, "concatenateModules", js.undefined)
    
    inline def setEmitOnErrors(value: Boolean): Self = StObject.set(x, "emitOnErrors", value.asInstanceOf[js.Any])
    
    inline def setEmitOnErrorsUndefined: Self = StObject.set(x, "emitOnErrors", js.undefined)
    
    inline def setFlagIncludedChunks(value: Boolean): Self = StObject.set(x, "flagIncludedChunks", value.asInstanceOf[js.Any])
    
    inline def setFlagIncludedChunksUndefined: Self = StObject.set(x, "flagIncludedChunks", js.undefined)
    
    inline def setInnerGraph(value: Boolean): Self = StObject.set(x, "innerGraph", value.asInstanceOf[js.Any])
    
    inline def setInnerGraphUndefined: Self = StObject.set(x, "innerGraph", js.undefined)
    
    inline def setMangleExports(value: Boolean | deterministic | size): Self = StObject.set(x, "mangleExports", value.asInstanceOf[js.Any])
    
    inline def setMangleExportsUndefined: Self = StObject.set(x, "mangleExports", js.undefined)
    
    inline def setMangleWasmImports(value: Boolean): Self = StObject.set(x, "mangleWasmImports", value.asInstanceOf[js.Any])
    
    inline def setMangleWasmImportsUndefined: Self = StObject.set(x, "mangleWasmImports", js.undefined)
    
    inline def setMergeDuplicateChunks(value: Boolean): Self = StObject.set(x, "mergeDuplicateChunks", value.asInstanceOf[js.Any])
    
    inline def setMergeDuplicateChunksUndefined: Self = StObject.set(x, "mergeDuplicateChunks", js.undefined)
    
    inline def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
    
    inline def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
    
    inline def setMinimizer(
      value: js.Array[
          (js.ThisFunction1[/* this */ Compiler, /* compiler */ Compiler, Unit]) | WebpackPluginInstance | DotDotDot
        ]
    ): Self = StObject.set(x, "minimizer", value.asInstanceOf[js.Any])
    
    inline def setMinimizerUndefined: Self = StObject.set(x, "minimizer", js.undefined)
    
    inline def setMinimizerVarargs(
      value: ((js.ThisFunction1[/* this */ Compiler, /* compiler */ Compiler, Unit]) | WebpackPluginInstance | DotDotDot)*
    ): Self = StObject.set(x, "minimizer", js.Array(value*))
    
    inline def setModuleIds(value: `false` | natural | named | deterministic | size | hashed): Self = StObject.set(x, "moduleIds", value.asInstanceOf[js.Any])
    
    inline def setModuleIdsUndefined: Self = StObject.set(x, "moduleIds", js.undefined)
    
    inline def setNoEmitOnErrors(value: Boolean): Self = StObject.set(x, "noEmitOnErrors", value.asInstanceOf[js.Any])
    
    inline def setNoEmitOnErrorsUndefined: Self = StObject.set(x, "noEmitOnErrors", js.undefined)
    
    inline def setNodeEnv(value: String | `false`): Self = StObject.set(x, "nodeEnv", value.asInstanceOf[js.Any])
    
    inline def setNodeEnvUndefined: Self = StObject.set(x, "nodeEnv", js.undefined)
    
    inline def setPortableRecords(value: Boolean): Self = StObject.set(x, "portableRecords", value.asInstanceOf[js.Any])
    
    inline def setPortableRecordsUndefined: Self = StObject.set(x, "portableRecords", js.undefined)
    
    inline def setProvidedExports(value: Boolean): Self = StObject.set(x, "providedExports", value.asInstanceOf[js.Any])
    
    inline def setProvidedExportsUndefined: Self = StObject.set(x, "providedExports", js.undefined)
    
    inline def setRealContentHash(value: Boolean): Self = StObject.set(x, "realContentHash", value.asInstanceOf[js.Any])
    
    inline def setRealContentHashUndefined: Self = StObject.set(x, "realContentHash", js.undefined)
    
    inline def setRemoveAvailableModules(value: Boolean): Self = StObject.set(x, "removeAvailableModules", value.asInstanceOf[js.Any])
    
    inline def setRemoveAvailableModulesUndefined: Self = StObject.set(x, "removeAvailableModules", js.undefined)
    
    inline def setRemoveEmptyChunks(value: Boolean): Self = StObject.set(x, "removeEmptyChunks", value.asInstanceOf[js.Any])
    
    inline def setRemoveEmptyChunksUndefined: Self = StObject.set(x, "removeEmptyChunks", js.undefined)
    
    inline def setRuntimeChunk(value: Boolean | single | multiple | `2`): Self = StObject.set(x, "runtimeChunk", value.asInstanceOf[js.Any])
    
    inline def setRuntimeChunkUndefined: Self = StObject.set(x, "runtimeChunk", js.undefined)
    
    inline def setSideEffects(value: Boolean | flag): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
    
    inline def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
    
    inline def setSplitChunks(value: `false` | OptimizationSplitChunksOptions): Self = StObject.set(x, "splitChunks", value.asInstanceOf[js.Any])
    
    inline def setSplitChunksUndefined: Self = StObject.set(x, "splitChunks", js.undefined)
    
    inline def setUsedExports(value: Boolean | global): Self = StObject.set(x, "usedExports", value.asInstanceOf[js.Any])
    
    inline def setUsedExportsUndefined: Self = StObject.set(x, "usedExports", js.undefined)
  }
}
