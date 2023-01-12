package typings.vite.anon

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.mod.ExternalOption
import typings.rollup.mod.ManualChunkMeta
import typings.rollup.mod.ManualChunksOption
import typings.rollup.mod.NullValue
import typings.rollup.mod.OutputOptions
import typings.rollup.mod.RollupCache
import typings.rollup.mod.TreeshakingOptions
import typings.rollup.mod.TreeshakingPreset
import typings.rollup.mod.WatcherOptions
import typings.std.Record
import typings.vite.viteBooleans.`false`
import typings.vite.viteStrings.ifRelativeSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<rollup.rollup.RollupOptions, 'plugins' | 'input' | 'onwarn' | 'preserveEntrySignatures'> */
trait OmitRollupOptionspluginsi extends StObject {
  
  var acorn: js.UndefOr[Record[String, Any]] = js.undefined
  
  var acornInjectPlugins: js.UndefOr[js.Array[js.Function0[Any]] | js.Function0[Any]] = js.undefined
  
  var cache: js.UndefOr[`false` | RollupCache] = js.undefined
  
  var context: js.UndefOr[String] = js.undefined
  
  var experimentalCacheExpiry: js.UndefOr[Double] = js.undefined
  
  var external: js.UndefOr[ExternalOption] = js.undefined
  
  var inlineDynamicImports: js.UndefOr[Boolean] = js.undefined
  
  var makeAbsoluteExternalsRelative: js.UndefOr[Boolean | ifRelativeSource] = js.undefined
  
  var manualChunks: js.UndefOr[ManualChunksOption] = js.undefined
  
  var maxParallelFileOps: js.UndefOr[Double] = js.undefined
  
  var maxParallelFileReads: js.UndefOr[Double] = js.undefined
  
  var moduleContext: js.UndefOr[(js.Function1[/* id */ String, String | NullValue]) | StringDictionary[String]] = js.undefined
  
  var output: js.UndefOr[OutputOptions | js.Array[OutputOptions]] = js.undefined
  
  var perf: js.UndefOr[Boolean] = js.undefined
  
  var preserveModules: js.UndefOr[Boolean] = js.undefined
  
  var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  
  var shimMissingExports: js.UndefOr[Boolean] = js.undefined
  
  var strictDeprecations: js.UndefOr[Boolean] = js.undefined
  
  var treeshake: js.UndefOr[Boolean | TreeshakingPreset | TreeshakingOptions] = js.undefined
  
  var watch: js.UndefOr[WatcherOptions | `false`] = js.undefined
}
object OmitRollupOptionspluginsi {
  
  inline def apply(): OmitRollupOptionspluginsi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitRollupOptionspluginsi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitRollupOptionspluginsi] (val x: Self) extends AnyVal {
    
    inline def setAcorn(value: Record[String, Any]): Self = StObject.set(x, "acorn", value.asInstanceOf[js.Any])
    
    inline def setAcornInjectPlugins(value: js.Array[js.Function0[Any]] | js.Function0[Any]): Self = StObject.set(x, "acornInjectPlugins", value.asInstanceOf[js.Any])
    
    inline def setAcornInjectPluginsFunction0(value: () => Any): Self = StObject.set(x, "acornInjectPlugins", js.Any.fromFunction0(value))
    
    inline def setAcornInjectPluginsUndefined: Self = StObject.set(x, "acornInjectPlugins", js.undefined)
    
    inline def setAcornInjectPluginsVarargs(value: js.Function0[Any]*): Self = StObject.set(x, "acornInjectPlugins", js.Array(value*))
    
    inline def setAcornUndefined: Self = StObject.set(x, "acorn", js.undefined)
    
    inline def setCache(value: `false` | RollupCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setExperimentalCacheExpiry(value: Double): Self = StObject.set(x, "experimentalCacheExpiry", value.asInstanceOf[js.Any])
    
    inline def setExperimentalCacheExpiryUndefined: Self = StObject.set(x, "experimentalCacheExpiry", js.undefined)
    
    inline def setExternal(value: ExternalOption): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalFunction3(
      value: (/* source */ String, /* importer */ js.UndefOr[String], /* isResolved */ Boolean) => Boolean | NullValue
    ): Self = StObject.set(x, "external", js.Any.fromFunction3(value))
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setExternalVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "external", js.Array(value*))
    
    inline def setInlineDynamicImports(value: Boolean): Self = StObject.set(x, "inlineDynamicImports", value.asInstanceOf[js.Any])
    
    inline def setInlineDynamicImportsUndefined: Self = StObject.set(x, "inlineDynamicImports", js.undefined)
    
    inline def setMakeAbsoluteExternalsRelative(value: Boolean | ifRelativeSource): Self = StObject.set(x, "makeAbsoluteExternalsRelative", value.asInstanceOf[js.Any])
    
    inline def setMakeAbsoluteExternalsRelativeUndefined: Self = StObject.set(x, "makeAbsoluteExternalsRelative", js.undefined)
    
    inline def setManualChunks(value: ManualChunksOption): Self = StObject.set(x, "manualChunks", value.asInstanceOf[js.Any])
    
    inline def setManualChunksFunction2(value: (/* id */ String, /* meta */ ManualChunkMeta) => String | NullValue): Self = StObject.set(x, "manualChunks", js.Any.fromFunction2(value))
    
    inline def setManualChunksUndefined: Self = StObject.set(x, "manualChunks", js.undefined)
    
    inline def setMaxParallelFileOps(value: Double): Self = StObject.set(x, "maxParallelFileOps", value.asInstanceOf[js.Any])
    
    inline def setMaxParallelFileOpsUndefined: Self = StObject.set(x, "maxParallelFileOps", js.undefined)
    
    inline def setMaxParallelFileReads(value: Double): Self = StObject.set(x, "maxParallelFileReads", value.asInstanceOf[js.Any])
    
    inline def setMaxParallelFileReadsUndefined: Self = StObject.set(x, "maxParallelFileReads", js.undefined)
    
    inline def setModuleContext(value: (js.Function1[/* id */ String, String | NullValue]) | StringDictionary[String]): Self = StObject.set(x, "moduleContext", value.asInstanceOf[js.Any])
    
    inline def setModuleContextFunction1(value: /* id */ String => String | NullValue): Self = StObject.set(x, "moduleContext", js.Any.fromFunction1(value))
    
    inline def setModuleContextUndefined: Self = StObject.set(x, "moduleContext", js.undefined)
    
    inline def setOutput(value: OutputOptions | js.Array[OutputOptions]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setOutputVarargs(value: OutputOptions*): Self = StObject.set(x, "output", js.Array(value*))
    
    inline def setPerf(value: Boolean): Self = StObject.set(x, "perf", value.asInstanceOf[js.Any])
    
    inline def setPerfUndefined: Self = StObject.set(x, "perf", js.undefined)
    
    inline def setPreserveModules(value: Boolean): Self = StObject.set(x, "preserveModules", value.asInstanceOf[js.Any])
    
    inline def setPreserveModulesUndefined: Self = StObject.set(x, "preserveModules", js.undefined)
    
    inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
    
    inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
    
    inline def setShimMissingExports(value: Boolean): Self = StObject.set(x, "shimMissingExports", value.asInstanceOf[js.Any])
    
    inline def setShimMissingExportsUndefined: Self = StObject.set(x, "shimMissingExports", js.undefined)
    
    inline def setStrictDeprecations(value: Boolean): Self = StObject.set(x, "strictDeprecations", value.asInstanceOf[js.Any])
    
    inline def setStrictDeprecationsUndefined: Self = StObject.set(x, "strictDeprecations", js.undefined)
    
    inline def setTreeshake(value: Boolean | TreeshakingPreset | TreeshakingOptions): Self = StObject.set(x, "treeshake", value.asInstanceOf[js.Any])
    
    inline def setTreeshakeUndefined: Self = StObject.set(x, "treeshake", js.undefined)
    
    inline def setWatch(value: WatcherOptions | `false`): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
