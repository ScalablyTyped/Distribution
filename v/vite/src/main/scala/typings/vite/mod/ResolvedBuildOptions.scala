package typings.vite.mod

import typings.rollup.mod.RollupOptions
import typings.rollup.mod.WatcherOptions
import typings.vite.mod.Terser.MinifyOptions
import typings.vite.viteBooleans.`false`
import typings.vite.viteStrings.`inline`
import typings.vite.viteStrings.esbuild
import typings.vite.viteStrings.hidden
import typings.vite.viteStrings.modules
import typings.vite.viteStrings.terser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Required<std.Omit<vite.vite.BuildOptions, 'polyfillModulePreload'>> */
trait ResolvedBuildOptions extends StObject {
  
  var assetsDir: String
  
  var assetsInlineLimit: Double
  
  var chunkSizeWarningLimit: Double
  
  var commonjsOptions: RollupCommonJSOptions
  
  var copyPublicDir: Boolean
  
  var cssCodeSplit: Boolean
  
  var cssTarget: String | js.Array[String] | `false`
  
  var dynamicImportVarsOptions: RollupDynamicImportVarsOptions
  
  var emptyOutDir: Boolean
  
  var lib: LibraryOptions | `false`
  
  var manifest: Boolean | String
  
  var minify: Boolean | terser | esbuild
  
  var modulePreload: `false` | ResolvedModulePreloadOptions
  
  var outDir: String
  
  var reportCompressedSize: Boolean
  
  var rollupOptions: RollupOptions
  
  var sourcemap: Boolean | `inline` | hidden
  
  var ssr: Boolean | String
  
  var ssrManifest: Boolean | String
  
  var target: modules | String | js.Array[String] | `false`
  
  var terserOptions: MinifyOptions
  
  var watch: WatcherOptions
  
  var write: Boolean
}
object ResolvedBuildOptions {
  
  inline def apply(
    assetsDir: String,
    assetsInlineLimit: Double,
    chunkSizeWarningLimit: Double,
    commonjsOptions: RollupCommonJSOptions,
    copyPublicDir: Boolean,
    cssCodeSplit: Boolean,
    cssTarget: String | js.Array[String] | `false`,
    dynamicImportVarsOptions: RollupDynamicImportVarsOptions,
    emptyOutDir: Boolean,
    lib: LibraryOptions | `false`,
    manifest: Boolean | String,
    minify: Boolean | terser | esbuild,
    modulePreload: `false` | ResolvedModulePreloadOptions,
    outDir: String,
    reportCompressedSize: Boolean,
    rollupOptions: RollupOptions,
    sourcemap: Boolean | `inline` | hidden,
    ssr: Boolean | String,
    ssrManifest: Boolean | String,
    target: modules | String | js.Array[String] | `false`,
    terserOptions: MinifyOptions,
    watch: WatcherOptions,
    write: Boolean
  ): ResolvedBuildOptions = {
    val __obj = js.Dynamic.literal(assetsDir = assetsDir.asInstanceOf[js.Any], assetsInlineLimit = assetsInlineLimit.asInstanceOf[js.Any], chunkSizeWarningLimit = chunkSizeWarningLimit.asInstanceOf[js.Any], commonjsOptions = commonjsOptions.asInstanceOf[js.Any], copyPublicDir = copyPublicDir.asInstanceOf[js.Any], cssCodeSplit = cssCodeSplit.asInstanceOf[js.Any], cssTarget = cssTarget.asInstanceOf[js.Any], dynamicImportVarsOptions = dynamicImportVarsOptions.asInstanceOf[js.Any], emptyOutDir = emptyOutDir.asInstanceOf[js.Any], lib = lib.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], modulePreload = modulePreload.asInstanceOf[js.Any], outDir = outDir.asInstanceOf[js.Any], reportCompressedSize = reportCompressedSize.asInstanceOf[js.Any], rollupOptions = rollupOptions.asInstanceOf[js.Any], sourcemap = sourcemap.asInstanceOf[js.Any], ssr = ssr.asInstanceOf[js.Any], ssrManifest = ssrManifest.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], terserOptions = terserOptions.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedBuildOptions]
  }
  
  extension [Self <: ResolvedBuildOptions](x: Self) {
    
    inline def setAssetsDir(value: String): Self = StObject.set(x, "assetsDir", value.asInstanceOf[js.Any])
    
    inline def setAssetsInlineLimit(value: Double): Self = StObject.set(x, "assetsInlineLimit", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeWarningLimit(value: Double): Self = StObject.set(x, "chunkSizeWarningLimit", value.asInstanceOf[js.Any])
    
    inline def setCommonjsOptions(value: RollupCommonJSOptions): Self = StObject.set(x, "commonjsOptions", value.asInstanceOf[js.Any])
    
    inline def setCopyPublicDir(value: Boolean): Self = StObject.set(x, "copyPublicDir", value.asInstanceOf[js.Any])
    
    inline def setCssCodeSplit(value: Boolean): Self = StObject.set(x, "cssCodeSplit", value.asInstanceOf[js.Any])
    
    inline def setCssTarget(value: String | js.Array[String] | `false`): Self = StObject.set(x, "cssTarget", value.asInstanceOf[js.Any])
    
    inline def setCssTargetVarargs(value: String*): Self = StObject.set(x, "cssTarget", js.Array(value*))
    
    inline def setDynamicImportVarsOptions(value: RollupDynamicImportVarsOptions): Self = StObject.set(x, "dynamicImportVarsOptions", value.asInstanceOf[js.Any])
    
    inline def setEmptyOutDir(value: Boolean): Self = StObject.set(x, "emptyOutDir", value.asInstanceOf[js.Any])
    
    inline def setLib(value: LibraryOptions | `false`): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
    
    inline def setManifest(value: Boolean | String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setMinify(value: Boolean | terser | esbuild): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setModulePreload(value: `false` | ResolvedModulePreloadOptions): Self = StObject.set(x, "modulePreload", value.asInstanceOf[js.Any])
    
    inline def setOutDir(value: String): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
    
    inline def setReportCompressedSize(value: Boolean): Self = StObject.set(x, "reportCompressedSize", value.asInstanceOf[js.Any])
    
    inline def setRollupOptions(value: RollupOptions): Self = StObject.set(x, "rollupOptions", value.asInstanceOf[js.Any])
    
    inline def setSourcemap(value: Boolean | `inline` | hidden): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    
    inline def setSsr(value: Boolean | String): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    inline def setSsrManifest(value: Boolean | String): Self = StObject.set(x, "ssrManifest", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: modules | String | js.Array[String] | `false`): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setTerserOptions(value: MinifyOptions): Self = StObject.set(x, "terserOptions", value.asInstanceOf[js.Any])
    
    inline def setWatch(value: WatcherOptions): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
  }
}
