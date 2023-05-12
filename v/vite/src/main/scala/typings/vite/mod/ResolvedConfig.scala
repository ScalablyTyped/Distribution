package typings.vite.mod

import typings.std.NonNullable
import typings.std.Record
import typings.vite.anon.PartialInternalResolveOpt
import typings.vite.anon.ResolveOptionsaliasAliasO
import typings.vite.viteBooleans.`false`
import typings.vite.viteStrings.apply
import typings.vite.viteStrings.config
import typings.vite.viteStrings.configResolved
import typings.vite.viteStrings.configurePreviewServer
import typings.vite.viteStrings.configureServer
import typings.vite.viteStrings.enforce
import typings.vite.viteStrings.handleHotUpdate
import typings.vite.viteStrings.load
import typings.vite.viteStrings.resolveId
import typings.vite.viteStrings.serve
import typings.vite.viteStrings.transform
import typings.vite.viteStrings.transformIndexHtml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Omit<vite.vite.UserConfig, 'plugins' | 'assetsInclude' | 'optimizeDeps' | 'worker'> & {  configFile :string | undefined,   configFileDependencies :std.Array<string>,   inlineConfig :vite.vite.InlineConfig,   root :string,   base :string,   publicDir :string,   cacheDir :string,   command :'build' | 'serve',   mode :string,   isWorker :boolean,   isProduction :boolean,   envDir :string,   env :std.Record<string, any>,   resolve :std.Required<vite.vite.ResolveOptions> & {  alias :std.Array<vite.vite.Alias>},   plugins :std.Array<vite.vite.Plugin_2>,   esbuild :vite.vite.ESBuildOptions | false,   server :vite.vite.ResolvedServerOptions,   build :vite.vite.ResolvedBuildOptions,   preview :vite.vite.ResolvedPreviewOptions,   ssr :vite.vite.ResolvedSSROptions, assetsInclude (file : string): boolean,   logger :vite.vite.Logger, createResolver (options : std.Partial<vite.vite.InternalResolveOptions> | undefined): vite.vite.ResolveFn,   optimizeDeps :vite.vite.DepOptimizationOptions,   worker :vite.vite.ResolveWorkerOptions,   appType :vite.vite.AppType,   experimental :vite.vite.ExperimentalOptions} & vite.vite.PluginHookUtils> */
@js.native
trait ResolvedConfig extends StObject {
  
  val appType: js.UndefOr[AppType] = js.native
  
  def assetsInclude(file: String): Boolean = js.native
  
  val base: js.UndefOr[String] = js.native
  
  val build: js.UndefOr[BuildOptions] = js.native
  
  val cacheDir: js.UndefOr[String] = js.native
  
  val clearScreen: js.UndefOr[Boolean] = js.native
  
  val command: typings.vite.viteStrings.build | serve = js.native
  
  val configFile: js.UndefOr[String] = js.native
  
  val configFileDependencies: js.Array[String] = js.native
  
  def createResolver(): ResolveFn = js.native
  def createResolver(options: PartialInternalResolveOpt): ResolveFn = js.native
  
  val css: js.UndefOr[CSSOptions] = js.native
  
  val customLogger: js.UndefOr[Logger] = js.native
  
  val define: js.UndefOr[Record[String, Any]] = js.native
  
  val env: Record[String, Any] = js.native
  
  val envDir: js.UndefOr[String] = js.native
  
  val envPrefix: js.UndefOr[String | js.Array[String]] = js.native
  
  val esbuild: js.UndefOr[ESBuildOptions | `false`] = js.native
  
  val experimental: js.UndefOr[ExperimentalOptions] = js.native
  
  def getSortedPluginHooks[K /* <: enforce | apply | config | configResolved | configureServer | configurePreviewServer | transformIndexHtml | handleHotUpdate | resolveId | load | transform */](hookName: K): js.Array[
    NonNullable[
      HookHandler[
        /* import warning: importer.ImportType#apply Failed type conversion: vite.vite.Plugin_2[K] */ js.Any
      ]
    ]
  ] = js.native
  
  def getSortedPlugins(
    hookName: enforce | apply | config | configResolved | configureServer | configurePreviewServer | transformIndexHtml | handleHotUpdate | resolveId | load | transform
  ): js.Array[Plugin2] = js.native
  
  val inlineConfig: InlineConfig = js.native
  
  val isProduction: Boolean = js.native
  
  val isWorker: Boolean = js.native
  
  val json: js.UndefOr[JsonOptions] = js.native
  
  val legacy: js.UndefOr[LegacyOptions] = js.native
  
  val logLevel: js.UndefOr[LogLevel] = js.native
  
  val logger: Logger = js.native
  
  val mode: js.UndefOr[String] = js.native
  
  val optimizeDeps: DepOptimizationOptions = js.native
  
  val plugins: js.Array[Plugin2] = js.native
  
  val preview: js.UndefOr[PreviewOptions] = js.native
  
  val publicDir: js.UndefOr[String | `false`] = js.native
  
  val resolve: js.UndefOr[ResolveOptionsaliasAliasO] = js.native
  
  val root: js.UndefOr[String] = js.native
  
  val server: js.UndefOr[ServerOptions] = js.native
  
  val ssr: js.UndefOr[SSROptions] = js.native
  
  val worker: ResolveWorkerOptions = js.native
}
