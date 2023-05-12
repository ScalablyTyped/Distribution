package typings.vite.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.rollup.mod.ExistingRawSourceMap
import typings.rollup.mod.GetManualChunk
import typings.rollup.mod.ObjectHook
import typings.rollup.mod.RollupError
import typings.rollup.mod.RollupOutput
import typings.rollup.mod.RollupWatcher
import typings.std.Map
import typings.std.Record
import typings.vite.anon.Cache
import typings.vite.anon.Config
import typings.vite.anon.HostId
import typings.vite.anon.HostType
import typings.vite.anon.Html
import typings.vite.anon.Relative
import typings.vite.anon.Resolve
import typings.vite.mod.^
import typings.vite.viteBooleans.`false`
import typings.vite.viteStrings.serve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type WebSocketAlias = WebSocket2

inline def build(): js.Promise[RollupOutput | js.Array[RollupOutput] | RollupWatcher] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")().asInstanceOf[js.Promise[RollupOutput | js.Array[RollupOutput] | RollupWatcher]]
inline def build(inlineConfig: InlineConfig): js.Promise[RollupOutput | js.Array[RollupOutput] | RollupWatcher] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(inlineConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RollupOutput | js.Array[RollupOutput] | RollupWatcher]]

inline def buildErrorMessage(err: RollupError): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildErrorMessage")(err.asInstanceOf[js.Any]).asInstanceOf[String]
inline def buildErrorMessage(err: RollupError, args: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildErrorMessage")(err.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildErrorMessage(err: RollupError, args: js.Array[String], includeStack: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildErrorMessage")(err.asInstanceOf[js.Any], args.asInstanceOf[js.Any], includeStack.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildErrorMessage(err: RollupError, args: Unit, includeStack: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildErrorMessage")(err.asInstanceOf[js.Any], args.asInstanceOf[js.Any], includeStack.asInstanceOf[js.Any])).asInstanceOf[String]

inline def createFilter(): js.Function1[/* id */ String | Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")().asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
inline def createFilter(include: Unit, exclude: Unit, options: Resolve): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
inline def createFilter(include: Unit, exclude: FilterPattern): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
inline def createFilter(include: Unit, exclude: FilterPattern, options: Resolve): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
inline def createFilter(include: FilterPattern): js.Function1[/* id */ String | Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
inline def createFilter(include: FilterPattern, exclude: Unit, options: Resolve): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
inline def createFilter(include: FilterPattern, exclude: FilterPattern): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]
inline def createFilter(include: FilterPattern, exclude: FilterPattern, options: Resolve): js.Function1[/* id */ String | Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ String | Any, Boolean]]

inline def createLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")().asInstanceOf[Logger]
inline def createLogger(level: Unit, options: LoggerOptions): Logger = (^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(level.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Logger]
inline def createLogger(level: LogLevel): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(level.asInstanceOf[js.Any]).asInstanceOf[Logger]
inline def createLogger(level: LogLevel, options: LoggerOptions): Logger = (^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(level.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Logger]

inline def createServer(): js.Promise[ViteDevServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[js.Promise[ViteDevServer]]
inline def createServer(inlineConfig: InlineConfig): js.Promise[ViteDevServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(inlineConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ViteDevServer]]

inline def defineConfig(config: UserConfigExport): UserConfigExport = ^.asInstanceOf[js.Dynamic].applyDynamic("defineConfig")(config.asInstanceOf[js.Any]).asInstanceOf[UserConfigExport]

inline def esbuildVersion: String = ^.asInstanceOf[js.Dynamic].selectDynamic("esbuildVersion").asInstanceOf[String]
inline def esbuildVersion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("esbuildVersion")(x.asInstanceOf[js.Any])

inline def formatPostcssSourceMap(rawMap: ExistingRawSourceMap, file: String): js.Promise[ExistingRawSourceMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPostcssSourceMap")(rawMap.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExistingRawSourceMap]]

inline def getDepOptimizationConfig(config: ResolvedConfig, ssr: Boolean): DepOptimizationConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("getDepOptimizationConfig")(config.asInstanceOf[js.Any], ssr.asInstanceOf[js.Any])).asInstanceOf[DepOptimizationConfig]

inline def isCSSRequest(request: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCSSRequest")(request.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isDepsOptimizerEnabled(config: ResolvedConfig, ssr: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDepsOptimizerEnabled")(config.asInstanceOf[js.Any], ssr.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isFileServingAllowed(url: String, server: ViteDevServer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFileServingAllowed")(url.asInstanceOf[js.Any], server.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def loadConfigFromFile(configEnv: ConfigEnv): js.Promise[Config | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigFromFile")(configEnv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Config | Null]]
inline def loadConfigFromFile(configEnv: ConfigEnv, configFile: String): js.Promise[Config | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigFromFile")(configEnv.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config | Null]]
inline def loadConfigFromFile(configEnv: ConfigEnv, configFile: String, configRoot: String): js.Promise[Config | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigFromFile")(configEnv.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any], configRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config | Null]]
inline def loadConfigFromFile(configEnv: ConfigEnv, configFile: String, configRoot: String, logLevel: LogLevel): js.Promise[Config | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigFromFile")(configEnv.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any], configRoot.asInstanceOf[js.Any], logLevel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config | Null]]
inline def loadConfigFromFile(configEnv: ConfigEnv, configFile: String, configRoot: Unit, logLevel: LogLevel): js.Promise[Config | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigFromFile")(configEnv.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any], configRoot.asInstanceOf[js.Any], logLevel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config | Null]]
inline def loadConfigFromFile(configEnv: ConfigEnv, configFile: Unit, configRoot: String): js.Promise[Config | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigFromFile")(configEnv.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any], configRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config | Null]]
inline def loadConfigFromFile(configEnv: ConfigEnv, configFile: Unit, configRoot: String, logLevel: LogLevel): js.Promise[Config | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigFromFile")(configEnv.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any], configRoot.asInstanceOf[js.Any], logLevel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config | Null]]
inline def loadConfigFromFile(configEnv: ConfigEnv, configFile: Unit, configRoot: Unit, logLevel: LogLevel): js.Promise[Config | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigFromFile")(configEnv.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any], configRoot.asInstanceOf[js.Any], logLevel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config | Null]]

inline def loadEnv(mode: String, envDir: String): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEnv")(mode.asInstanceOf[js.Any], envDir.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
inline def loadEnv(mode: String, envDir: String, prefixes: String): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEnv")(mode.asInstanceOf[js.Any], envDir.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
inline def loadEnv(mode: String, envDir: String, prefixes: js.Array[String]): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEnv")(mode.asInstanceOf[js.Any], envDir.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]

inline def mergeAlias(): js.UndefOr[AliasOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAlias")().asInstanceOf[js.UndefOr[AliasOptions]]
inline def mergeAlias(a: Unit, b: AliasOptions): js.UndefOr[AliasOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAlias")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[AliasOptions]]
inline def mergeAlias(a: AliasOptions): js.UndefOr[AliasOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAlias")(a.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[AliasOptions]]
inline def mergeAlias(a: AliasOptions, b: AliasOptions): js.UndefOr[AliasOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAlias")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[AliasOptions]]

inline def mergeConfig(defaults: Record[String, Any], overrides: Record[String, Any]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfig")(defaults.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
inline def mergeConfig(defaults: Record[String, Any], overrides: Record[String, Any], isRoot: Boolean): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfig")(defaults.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], isRoot.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]

inline def normalizePath(id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(id.asInstanceOf[js.Any]).asInstanceOf[String]

inline def optimizeDeps(config: ResolvedConfig): js.Promise[DepOptimizationMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("optimizeDeps")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DepOptimizationMetadata]]
inline def optimizeDeps(config: ResolvedConfig, force: Boolean): js.Promise[DepOptimizationMetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("optimizeDeps")(config.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DepOptimizationMetadata]]
inline def optimizeDeps(config: ResolvedConfig, force: Boolean, asCommand: Boolean): js.Promise[DepOptimizationMetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("optimizeDeps")(config.asInstanceOf[js.Any], force.asInstanceOf[js.Any], asCommand.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DepOptimizationMetadata]]
inline def optimizeDeps(config: ResolvedConfig, force: Unit, asCommand: Boolean): js.Promise[DepOptimizationMetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("optimizeDeps")(config.asInstanceOf[js.Any], force.asInstanceOf[js.Any], asCommand.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DepOptimizationMetadata]]

inline def preprocessCSS(code: String, filename: String, config: ResolvedConfig): js.Promise[PreprocessCSSResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("preprocessCSS")(code.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PreprocessCSSResult]]

inline def preview(): js.Promise[PreviewServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("preview")().asInstanceOf[js.Promise[PreviewServer]]
inline def preview(inlineConfig: InlineConfig): js.Promise[PreviewServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("preview")(inlineConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PreviewServer]]

inline def resolveBaseUrl(base: String, isBuild: Boolean, logger: Logger): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBaseUrl")(base.asInstanceOf[js.Any], isBuild.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[String]
inline def resolveBaseUrl(base: Unit, isBuild: Boolean, logger: Logger): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBaseUrl")(base.asInstanceOf[js.Any], isBuild.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[String]

inline def resolveConfig(inlineConfig: InlineConfig, command: typings.vite.viteStrings.build | serve): js.Promise[ResolvedConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfig")(inlineConfig.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResolvedConfig]]
inline def resolveConfig(inlineConfig: InlineConfig, command: typings.vite.viteStrings.build | serve, defaultMode: String): js.Promise[ResolvedConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfig")(inlineConfig.asInstanceOf[js.Any], command.asInstanceOf[js.Any], defaultMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResolvedConfig]]
inline def resolveConfig(
  inlineConfig: InlineConfig,
  command: typings.vite.viteStrings.build | serve,
  defaultMode: String,
  defaultNodeEnv: String
): js.Promise[ResolvedConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfig")(inlineConfig.asInstanceOf[js.Any], command.asInstanceOf[js.Any], defaultMode.asInstanceOf[js.Any], defaultNodeEnv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResolvedConfig]]
inline def resolveConfig(
  inlineConfig: InlineConfig,
  command: typings.vite.viteStrings.build | serve,
  defaultMode: Unit,
  defaultNodeEnv: String
): js.Promise[ResolvedConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfig")(inlineConfig.asInstanceOf[js.Any], command.asInstanceOf[js.Any], defaultMode.asInstanceOf[js.Any], defaultNodeEnv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResolvedConfig]]

inline def resolveEnvPrefix(param0: UserConfig): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveEnvPrefix")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def resolvePackageData(pkgName: String, basedir: String): PackageData | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePackageData")(pkgName.asInstanceOf[js.Any], basedir.asInstanceOf[js.Any])).asInstanceOf[PackageData | Null]
inline def resolvePackageData(pkgName: String, basedir: String, preserveSymlinks: Boolean): PackageData | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePackageData")(pkgName.asInstanceOf[js.Any], basedir.asInstanceOf[js.Any], preserveSymlinks.asInstanceOf[js.Any])).asInstanceOf[PackageData | Null]
inline def resolvePackageData(pkgName: String, basedir: String, preserveSymlinks: Boolean, packageCache: PackageCache): PackageData | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePackageData")(pkgName.asInstanceOf[js.Any], basedir.asInstanceOf[js.Any], preserveSymlinks.asInstanceOf[js.Any], packageCache.asInstanceOf[js.Any])).asInstanceOf[PackageData | Null]
inline def resolvePackageData(pkgName: String, basedir: String, preserveSymlinks: Unit, packageCache: PackageCache): PackageData | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePackageData")(pkgName.asInstanceOf[js.Any], basedir.asInstanceOf[js.Any], preserveSymlinks.asInstanceOf[js.Any], packageCache.asInstanceOf[js.Any])).asInstanceOf[PackageData | Null]

inline def resolvePackageEntry(id: String, param1: PackageData, targetWeb: Boolean, options: InternalResolveOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePackageEntry")(id.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], targetWeb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]

inline def rollupVersion: String = ^.asInstanceOf[js.Dynamic].selectDynamic("rollupVersion").asInstanceOf[String]

inline def searchForWorkspaceRoot(current: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("searchForWorkspaceRoot")(current.asInstanceOf[js.Any]).asInstanceOf[String]
inline def searchForWorkspaceRoot(current: String, root: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("searchForWorkspaceRoot")(current.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[String]

inline def send(
  req: IncomingMessage,
  res: ServerResponse[typings.node.httpMod.IncomingMessage],
  content: String,
  `type`: String,
  options: SendOptions
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], content.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def send(
  req: IncomingMessage,
  res: ServerResponse[typings.node.httpMod.IncomingMessage],
  content: Buffer,
  `type`: String,
  options: SendOptions
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], content.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def sortUserPlugins(): js.Tuple3[js.Array[Plugin2], js.Array[Plugin2], js.Array[Plugin2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortUserPlugins")().asInstanceOf[js.Tuple3[js.Array[Plugin2], js.Array[Plugin2], js.Array[Plugin2]]]
inline def sortUserPlugins(plugins: js.Array[Plugin2 | js.Array[Plugin2]]): js.Tuple3[js.Array[Plugin2], js.Array[Plugin2], js.Array[Plugin2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortUserPlugins")(plugins.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.Array[Plugin2], js.Array[Plugin2], js.Array[Plugin2]]]

inline def splitVendorChunk(): GetManualChunk = ^.asInstanceOf[js.Dynamic].applyDynamic("splitVendorChunk")().asInstanceOf[GetManualChunk]
inline def splitVendorChunk(options: Cache): GetManualChunk = ^.asInstanceOf[js.Dynamic].applyDynamic("splitVendorChunk")(options.asInstanceOf[js.Any]).asInstanceOf[GetManualChunk]

inline def splitVendorChunkPlugin(): Plugin2 = ^.asInstanceOf[js.Dynamic].applyDynamic("splitVendorChunkPlugin")().asInstanceOf[Plugin2]

inline def transformWithEsbuild(code: String, filename: String): js.Promise[ESBuildTransformResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformWithEsbuild")(code.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ESBuildTransformResult]]
inline def transformWithEsbuild(code: String, filename: String, options: Unit, inMap: js.Object): js.Promise[ESBuildTransformResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformWithEsbuild")(code.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], inMap.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ESBuildTransformResult]]
inline def transformWithEsbuild(code: String, filename: String, options: typings.esbuild.mod.TransformOptions): js.Promise[ESBuildTransformResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformWithEsbuild")(code.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ESBuildTransformResult]]
inline def transformWithEsbuild(code: String, filename: String, options: typings.esbuild.mod.TransformOptions, inMap: js.Object): js.Promise[ESBuildTransformResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformWithEsbuild")(code.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], inMap.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ESBuildTransformResult]]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type AliasOptions = js.Array[Alias] | StringDictionary[String]

type AnymatchFn = js.Function1[/* testString */ String, Boolean]

type AnymatchPattern = String | js.RegExp | AnymatchFn

type CorsOrigin = Boolean | String | js.RegExp | (js.Array[String | js.RegExp])

type FilterPattern = (js.Array[String | js.RegExp]) | String | js.RegExp | Null

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends rollup.rollup.ObjectHook<infer H, {}> ? H : T
  }}}
  */
type HookHandler[T] = T

/* Rewritten from type alias, can be one of: 
  - typings.vite.mod.IndexHtmlTransformHook
  - typings.vite.anon.Enforce
  - typings.vite.anon.Handler
*/
type IndexHtmlTransform = _IndexHtmlTransform | IndexHtmlTransformHook

type IndexHtmlTransformHook = js.ThisFunction2[
/* this */ Unit, 
/* html */ String, 
/* ctx */ IndexHtmlTransformContext, 
IndexHtmlTransformResult | Unit | (js.Promise[IndexHtmlTransformResult | Unit])]

type IndexHtmlTransformResult = String | js.Array[HtmlTagDescriptor] | Html

type Manifest = Record[String, ManifestChunk]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.Function ? T : never
  }}}
  */
type MapToFunction[T] = T

type Matcher = AnymatchPattern | js.Array[AnymatchPattern]

type PackageCache = Map[String, PackageData]

/** 
NOTE: Rewritten from type alias:
{{{
type PluginOption = vite.vite.Plugin_2 | false | null | undefined | std.Array<vite.vite.PluginOption> | std.Promise<vite.vite.Plugin_2 | false | null | undefined | std.Array<vite.vite.PluginOption>>
}}}
to avoid circular code involving: 
- vite.vite.PluginOption
*/
/* Rewritten from type alias, can be one of: 
  - typings.vite.mod.Plugin2
  - typings.vite.viteBooleans.`false`
  - scala.Null
  - scala.Unit
  - js.Array[scala.Any]
  - js.Promise[
js.UndefOr[
  typings.vite.mod.Plugin2 | typings.vite.viteBooleans.`false` | scala.Null | js.Array[scala.Any]
]]
*/
type PluginOption = js.UndefOr[
_PluginOption | js.Array[Any] | (js.Promise[js.UndefOr[Plugin2 | `false` | Null | js.Array[Any]]]) | Null]

type PreviewOptions = CommonServerOptions

type PreviewServerHook = js.ThisFunction1[
/* this */ Unit, 
/* server */ PreviewServerForHook, 
js.Function0[Unit] | Unit | (js.Promise[js.Function0[Unit] | Unit])]

type RenderBuiltAssetUrl = js.Function2[/* filename */ String, /* type */ HostId, js.UndefOr[String | Relative]]

type ResolveFn = js.Function4[
/* id */ String, 
/* importer */ js.UndefOr[String], 
/* aliasOnly */ js.UndefOr[Boolean], 
/* ssr */ js.UndefOr[Boolean], 
js.Promise[js.UndefOr[String]]]

type ResolveModulePreloadDependenciesFn = js.Function3[
/* filename */ String, 
/* deps */ js.Array[String], 
/* context */ HostType, 
js.Array[String]]

type ResolvedPreviewOptions = PreviewOptions

type ResolvedUrl = js.Tuple3[/* url */ String, /* resolvedId */ String, /* meta */ js.UndefOr[js.Object | Null]]

type ResolverFunction = MapToFunction[
ObjectHook[
  /* import warning: importer.ImportType#apply Failed type conversion: 'resolveId' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveIdHook> : rollup.rollup.ResolveIdHook */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: 'resolveId' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
]]

type ServerHook = js.ThisFunction1[
/* this */ Unit, 
/* server */ ViteDevServer, 
js.Function0[Unit] | Unit | (js.Promise[js.Function0[Unit] | Unit])]

type SsrDepOptimizationOptions = DepOptimizationConfig

type UserConfigExport = UserConfig | js.Promise[UserConfig] | UserConfigFn

type UserConfigFn = js.Function1[/* env */ ConfigEnv, UserConfig | js.Promise[UserConfig]]

type WebSocketCustomListener[T] = js.Function2[/* data */ T, /* client */ WebSocketClient, Unit]
