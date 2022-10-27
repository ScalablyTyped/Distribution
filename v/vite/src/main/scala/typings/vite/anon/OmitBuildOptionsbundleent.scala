package typings.vite.anon

import org.scalablytyped.runtime.StringDictionary
import typings.esbuild.mod.Charset
import typings.esbuild.mod.Drop
import typings.esbuild.mod.Loader
import typings.esbuild.mod.LogLevel
import typings.esbuild.mod.Platform
import typings.esbuild.mod.Plugin
import typings.esbuild.mod.StdinOptions
import typings.std.Record
import typings.vite.viteBooleans.`false`
import typings.vite.viteStrings.`inline`
import typings.vite.viteStrings.automatic
import typings.vite.viteStrings.both
import typings.vite.viteStrings.eof
import typings.vite.viteStrings.external
import typings.vite.viteStrings.linked
import typings.vite.viteStrings.none
import typings.vite.viteStrings.preserve
import typings.vite.viteStrings.transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<esbuild.esbuild.BuildOptions, 'bundle' | 'entryPoints' | 'external' | 'write' | 'watch' | 'outdir' | 'outfile' | 'outbase' | 'outExtension' | 'metafile'> */
trait OmitBuildOptionsbundleent extends StObject {
  
  var absWorkingDir: js.UndefOr[String] = js.undefined
  
  var allowOverwrite: js.UndefOr[Boolean] = js.undefined
  
  var assetNames: js.UndefOr[String] = js.undefined
  
  var banner: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var charset: js.UndefOr[Charset] = js.undefined
  
  var chunkNames: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[Boolean] = js.undefined
  
  var conditions: js.UndefOr[js.Array[String]] = js.undefined
  
  var define: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var drop: js.UndefOr[js.Array[Drop]] = js.undefined
  
  var entryNames: js.UndefOr[String] = js.undefined
  
  var footer: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var format: js.UndefOr[typings.esbuild.mod.Format] = js.undefined
  
  var globalName: js.UndefOr[String] = js.undefined
  
  var ignoreAnnotations: js.UndefOr[Boolean] = js.undefined
  
  var incremental: js.UndefOr[Boolean] = js.undefined
  
  var inject: js.UndefOr[js.Array[String]] = js.undefined
  
  var jsx: js.UndefOr[transform | preserve | automatic] = js.undefined
  
  var jsxDev: js.UndefOr[Boolean] = js.undefined
  
  var jsxFactory: js.UndefOr[String] = js.undefined
  
  var jsxFragment: js.UndefOr[String] = js.undefined
  
  var jsxImportSource: js.UndefOr[String] = js.undefined
  
  var jsxSideEffects: js.UndefOr[Boolean] = js.undefined
  
  var keepNames: js.UndefOr[Boolean] = js.undefined
  
  var legalComments: js.UndefOr[none | `inline` | eof | linked | external] = js.undefined
  
  var loader: js.UndefOr[StringDictionary[Loader]] = js.undefined
  
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  var logLimit: js.UndefOr[Double] = js.undefined
  
  var logOverride: js.UndefOr[Record[String, LogLevel]] = js.undefined
  
  var mainFields: js.UndefOr[js.Array[String]] = js.undefined
  
  var mangleCache: js.UndefOr[Record[String, String | `false`]] = js.undefined
  
  var mangleProps: js.UndefOr[js.RegExp] = js.undefined
  
  var mangleQuoted: js.UndefOr[Boolean] = js.undefined
  
  var minify: js.UndefOr[Boolean] = js.undefined
  
  var minifyIdentifiers: js.UndefOr[Boolean] = js.undefined
  
  var minifySyntax: js.UndefOr[Boolean] = js.undefined
  
  var minifyWhitespace: js.UndefOr[Boolean] = js.undefined
  
  var nodePaths: js.UndefOr[js.Array[String]] = js.undefined
  
  var platform: js.UndefOr[Platform] = js.undefined
  
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  
  var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  
  var publicPath: js.UndefOr[String] = js.undefined
  
  var pure: js.UndefOr[js.Array[String]] = js.undefined
  
  var reserveProps: js.UndefOr[js.RegExp] = js.undefined
  
  var resolveExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var sourceRoot: js.UndefOr[String] = js.undefined
  
  var sourcemap: js.UndefOr[Boolean | linked | `inline` | external | both] = js.undefined
  
  var sourcesContent: js.UndefOr[Boolean] = js.undefined
  
  var splitting: js.UndefOr[Boolean] = js.undefined
  
  var stdin: js.UndefOr[StdinOptions] = js.undefined
  
  var supported: js.UndefOr[Record[String, Boolean]] = js.undefined
  
  var target: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var treeShaking: js.UndefOr[Boolean] = js.undefined
  
  var tsconfig: js.UndefOr[String] = js.undefined
}
object OmitBuildOptionsbundleent {
  
  inline def apply(): OmitBuildOptionsbundleent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitBuildOptionsbundleent]
  }
  
  extension [Self <: OmitBuildOptionsbundleent](x: Self) {
    
    inline def setAbsWorkingDir(value: String): Self = StObject.set(x, "absWorkingDir", value.asInstanceOf[js.Any])
    
    inline def setAbsWorkingDirUndefined: Self = StObject.set(x, "absWorkingDir", js.undefined)
    
    inline def setAllowOverwrite(value: Boolean): Self = StObject.set(x, "allowOverwrite", value.asInstanceOf[js.Any])
    
    inline def setAllowOverwriteUndefined: Self = StObject.set(x, "allowOverwrite", js.undefined)
    
    inline def setAssetNames(value: String): Self = StObject.set(x, "assetNames", value.asInstanceOf[js.Any])
    
    inline def setAssetNamesUndefined: Self = StObject.set(x, "assetNames", js.undefined)
    
    inline def setBanner(value: StringDictionary[String]): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    inline def setCharset(value: Charset): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    inline def setChunkNames(value: String): Self = StObject.set(x, "chunkNames", value.asInstanceOf[js.Any])
    
    inline def setChunkNamesUndefined: Self = StObject.set(x, "chunkNames", js.undefined)
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setDefine(value: StringDictionary[String]): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
    
    inline def setDefineUndefined: Self = StObject.set(x, "define", js.undefined)
    
    inline def setDrop(value: js.Array[Drop]): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setDropVarargs(value: Drop*): Self = StObject.set(x, "drop", js.Array(value*))
    
    inline def setEntryNames(value: String): Self = StObject.set(x, "entryNames", value.asInstanceOf[js.Any])
    
    inline def setEntryNamesUndefined: Self = StObject.set(x, "entryNames", js.undefined)
    
    inline def setFooter(value: StringDictionary[String]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFormat(value: typings.esbuild.mod.Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGlobalName(value: String): Self = StObject.set(x, "globalName", value.asInstanceOf[js.Any])
    
    inline def setGlobalNameUndefined: Self = StObject.set(x, "globalName", js.undefined)
    
    inline def setIgnoreAnnotations(value: Boolean): Self = StObject.set(x, "ignoreAnnotations", value.asInstanceOf[js.Any])
    
    inline def setIgnoreAnnotationsUndefined: Self = StObject.set(x, "ignoreAnnotations", js.undefined)
    
    inline def setIncremental(value: Boolean): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
    
    inline def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
    
    inline def setInject(value: js.Array[String]): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
    
    inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
    
    inline def setInjectVarargs(value: String*): Self = StObject.set(x, "inject", js.Array(value*))
    
    inline def setJsx(value: transform | preserve | automatic): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
    
    inline def setJsxDev(value: Boolean): Self = StObject.set(x, "jsxDev", value.asInstanceOf[js.Any])
    
    inline def setJsxDevUndefined: Self = StObject.set(x, "jsxDev", js.undefined)
    
    inline def setJsxFactory(value: String): Self = StObject.set(x, "jsxFactory", value.asInstanceOf[js.Any])
    
    inline def setJsxFactoryUndefined: Self = StObject.set(x, "jsxFactory", js.undefined)
    
    inline def setJsxFragment(value: String): Self = StObject.set(x, "jsxFragment", value.asInstanceOf[js.Any])
    
    inline def setJsxFragmentUndefined: Self = StObject.set(x, "jsxFragment", js.undefined)
    
    inline def setJsxImportSource(value: String): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
    
    inline def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
    
    inline def setJsxSideEffects(value: Boolean): Self = StObject.set(x, "jsxSideEffects", value.asInstanceOf[js.Any])
    
    inline def setJsxSideEffectsUndefined: Self = StObject.set(x, "jsxSideEffects", js.undefined)
    
    inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
    
    inline def setKeepNames(value: Boolean): Self = StObject.set(x, "keepNames", value.asInstanceOf[js.Any])
    
    inline def setKeepNamesUndefined: Self = StObject.set(x, "keepNames", js.undefined)
    
    inline def setLegalComments(value: none | `inline` | eof | linked | external): Self = StObject.set(x, "legalComments", value.asInstanceOf[js.Any])
    
    inline def setLegalCommentsUndefined: Self = StObject.set(x, "legalComments", js.undefined)
    
    inline def setLoader(value: StringDictionary[Loader]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogLimit(value: Double): Self = StObject.set(x, "logLimit", value.asInstanceOf[js.Any])
    
    inline def setLogLimitUndefined: Self = StObject.set(x, "logLimit", js.undefined)
    
    inline def setLogOverride(value: Record[String, LogLevel]): Self = StObject.set(x, "logOverride", value.asInstanceOf[js.Any])
    
    inline def setLogOverrideUndefined: Self = StObject.set(x, "logOverride", js.undefined)
    
    inline def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
    
    inline def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
    
    inline def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value*))
    
    inline def setMangleCache(value: Record[String, String | `false`]): Self = StObject.set(x, "mangleCache", value.asInstanceOf[js.Any])
    
    inline def setMangleCacheUndefined: Self = StObject.set(x, "mangleCache", js.undefined)
    
    inline def setMangleProps(value: js.RegExp): Self = StObject.set(x, "mangleProps", value.asInstanceOf[js.Any])
    
    inline def setManglePropsUndefined: Self = StObject.set(x, "mangleProps", js.undefined)
    
    inline def setMangleQuoted(value: Boolean): Self = StObject.set(x, "mangleQuoted", value.asInstanceOf[js.Any])
    
    inline def setMangleQuotedUndefined: Self = StObject.set(x, "mangleQuoted", js.undefined)
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyIdentifiers(value: Boolean): Self = StObject.set(x, "minifyIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setMinifyIdentifiersUndefined: Self = StObject.set(x, "minifyIdentifiers", js.undefined)
    
    inline def setMinifySyntax(value: Boolean): Self = StObject.set(x, "minifySyntax", value.asInstanceOf[js.Any])
    
    inline def setMinifySyntaxUndefined: Self = StObject.set(x, "minifySyntax", js.undefined)
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    inline def setMinifyWhitespace(value: Boolean): Self = StObject.set(x, "minifyWhitespace", value.asInstanceOf[js.Any])
    
    inline def setMinifyWhitespaceUndefined: Self = StObject.set(x, "minifyWhitespace", js.undefined)
    
    inline def setNodePaths(value: js.Array[String]): Self = StObject.set(x, "nodePaths", value.asInstanceOf[js.Any])
    
    inline def setNodePathsUndefined: Self = StObject.set(x, "nodePaths", js.undefined)
    
    inline def setNodePathsVarargs(value: String*): Self = StObject.set(x, "nodePaths", js.Array(value*))
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
    
    inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
    
    inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    
    inline def setPure(value: js.Array[String]): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    
    inline def setPureVarargs(value: String*): Self = StObject.set(x, "pure", js.Array(value*))
    
    inline def setReserveProps(value: js.RegExp): Self = StObject.set(x, "reserveProps", value.asInstanceOf[js.Any])
    
    inline def setReservePropsUndefined: Self = StObject.set(x, "reserveProps", js.undefined)
    
    inline def setResolveExtensions(value: js.Array[String]): Self = StObject.set(x, "resolveExtensions", value.asInstanceOf[js.Any])
    
    inline def setResolveExtensionsUndefined: Self = StObject.set(x, "resolveExtensions", js.undefined)
    
    inline def setResolveExtensionsVarargs(value: String*): Self = StObject.set(x, "resolveExtensions", js.Array(value*))
    
    inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    
    inline def setSourcemap(value: Boolean | linked | `inline` | external | both): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    
    inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
    
    inline def setSourcesContent(value: Boolean): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
    
    inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
    
    inline def setSplitting(value: Boolean): Self = StObject.set(x, "splitting", value.asInstanceOf[js.Any])
    
    inline def setSplittingUndefined: Self = StObject.set(x, "splitting", js.undefined)
    
    inline def setStdin(value: StdinOptions): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    inline def setSupported(value: Record[String, Boolean]): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setSupportedUndefined: Self = StObject.set(x, "supported", js.undefined)
    
    inline def setTarget(value: String | js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setTreeShaking(value: Boolean): Self = StObject.set(x, "treeShaking", value.asInstanceOf[js.Any])
    
    inline def setTreeShakingUndefined: Self = StObject.set(x, "treeShaking", js.undefined)
    
    inline def setTsconfig(value: String): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
    
    inline def setTsconfigUndefined: Self = StObject.set(x, "tsconfig", js.undefined)
  }
}
