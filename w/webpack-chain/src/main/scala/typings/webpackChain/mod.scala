package typings.webpackChain

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.node.httpsMod.ServerOptions
import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.std.ConstructorParameters
import typings.webpack.mod.Compiler
import typings.webpack.mod.Configuration
import typings.webpackChain.anon.Errors
import typings.webpackChain.anon.Path
import typings.webpackChain.webpackChainStrings.development
import typings.webpackChain.webpackChainStrings.error
import typings.webpackChain.webpackChainStrings.info
import typings.webpackChain.webpackChainStrings.javascriptSlashauto
import typings.webpackChain.webpackChainStrings.javascriptSlashdynamic
import typings.webpackChain.webpackChainStrings.javascriptSlashesm
import typings.webpackChain.webpackChainStrings.json
import typings.webpackChain.webpackChainStrings.multiple
import typings.webpackChain.webpackChainStrings.none
import typings.webpackChain.webpackChainStrings.post
import typings.webpackChain.webpackChainStrings.pre
import typings.webpackChain.webpackChainStrings.production
import typings.webpackChain.webpackChainStrings.single
import typings.webpackChain.webpackChainStrings.warning
import typings.webpackChain.webpackChainStrings.webassemblySlashexperimental
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-chain", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Config {
    
    /* CompleteClass */
    override def end(): Unit = js.native
  }
  
  @JSImport("webpack-chain", "Chained")
  @js.native
  open class Chained[Parent] ()
    extends StObject
       with typings.webpackChain.mod._Config.Chained[Parent] {
    
    /* CompleteClass */
    override def end(): Parent = js.native
  }
  
  @JSImport("webpack-chain", "ChainedMap")
  @js.native
  open class ChainedMap[Parent] ()
    extends StObject
       with typings.webpackChain.mod._Config.TypedChainedMap[Parent, Any] {
    
    /* CompleteClass */
    override def end(): Parent = js.native
  }
  
  @JSImport("webpack-chain", "ChainedSet")
  @js.native
  open class ChainedSet[Parent] ()
    extends StObject
       with typings.webpackChain.mod._Config.TypedChainedSet[Parent, Any] {
    
    /* CompleteClass */
    override def end(): Parent = js.native
  }
  
  @JSImport("webpack-chain", "DevServer")
  @js.native
  open class DevServer () extends ChainedMap[Config] {
    
    def apply(value: String): this.type = js.native
    
    def after(value: js.Function3[/* app */ Any, /* server */ Any, /* compiler */ Compiler, Unit]): this.type = js.native
    
    var allowedHosts: TypedChainedSet[this.type, String] = js.native
    
    def before(value: js.Function3[/* app */ Any, /* server */ Any, /* compiler */ Compiler, Unit]): this.type = js.native
    
    def bonjour(value: Boolean): this.type = js.native
    
    def clientLogLevel(value: none | error | warning | info): this.type = js.native
    
    def color(value: Boolean): this.type = js.native
    
    def compress(value: Boolean): this.type = js.native
    
    def contentBase(value: String): this.type = js.native
    def contentBase(value: js.Array[String]): this.type = js.native
    def contentBase(value: Boolean): this.type = js.native
    
    def disableHostCheck(value: Boolean): this.type = js.native
    
    def filename(value: String): this.type = js.native
    
    def headers(value: StringDictionary[String]): this.type = js.native
    
    def historyApiFallback(value: Any): this.type = js.native
    def historyApiFallback(value: Boolean): this.type = js.native
    
    def host(value: String): this.type = js.native
    
    def hot(value: Boolean): this.type = js.native
    
    def hotOnly(value: Boolean): this.type = js.native
    
    def http2(value: Boolean): this.type = js.native
    
    def https(value: Boolean): this.type = js.native
    def https(
      value: ServerOptions[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ]
    ): this.type = js.native
    
    def index(value: String): this.type = js.native
    
    def info(value: Boolean): this.type = js.native
    
    def `inline`(value: Boolean): this.type = js.native
    
    def `lazy`(value: Boolean): this.type = js.native
    
    def mimeTypes(value: js.Object): this.type = js.native
    
    def noInfo(value: Boolean): this.type = js.native
    
    def open(value: Boolean): this.type = js.native
    
    def openPage(value: String): this.type = js.native
    def openPage(value: js.Array[String]): this.type = js.native
    
    def overlay(value: Boolean): this.type = js.native
    def overlay(value: Errors): this.type = js.native
    
    def pfx(value: String): this.type = js.native
    
    def pfxPassphrase(value: String): this.type = js.native
    
    def port(value: Double): this.type = js.native
    
    def progress(value: Boolean): this.type = js.native
    
    def proxy(value: Any): this.type = js.native
    
    def publicPath(publicPath: String): this.type = js.native
    
    def quiet(value: Boolean): this.type = js.native
    
    def setup(value: js.Function1[/* expressApp */ Any, Unit]): this.type = js.native
    
    def sockHost(value: String): this.type = js.native
    
    def sockPath(value: String): this.type = js.native
    
    def sockPort(value: Double): this.type = js.native
    
    def socket(value: String): this.type = js.native
    
    def staticOptions(value: Any): this.type = js.native
    
    def stats(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ Any
    ): this.type = js.native
    
    def stdin(value: Boolean): this.type = js.native
    
    def useLocalIp(value: Boolean): this.type = js.native
    
    def watchContentBase(value: Boolean): this.type = js.native
    
    def watchOptions(value: Any): this.type = js.native
    
    def writeToDisk(value: Boolean): this.type = js.native
  }
  
  @JSImport("webpack-chain", "EntryPoint")
  @js.native
  open class EntryPoint () extends TypedChainedSet[Config, String]
  
  @JSImport("webpack-chain", "Module")
  @js.native
  open class Module () extends ChainedMap[Config] {
    
    def noParse(noParse: js.Array[js.RegExp]): this.type = js.native
    def noParse(noParse: js.Function1[/* contentPath */ String, Boolean]): this.type = js.native
    def noParse(noParse: js.RegExp): this.type = js.native
    
    def rule(name: String): Rule[Module] = js.native
    
    var rules: TypedChainedMap[this.type, Rule[Module]] = js.native
    
    def strictExportPresence(value: Boolean): this.type = js.native
  }
  
  @JSImport("webpack-chain", "Optimization")
  @js.native
  open class Optimization () extends ChainedMap[Config] {
    
    def concatenateModules(value: Boolean): this.type = js.native
    
    def flagIncludedChunks(value: Boolean): this.type = js.native
    
    def mergeDuplicateChunks(value: Boolean): this.type = js.native
    
    def minimize(value: Boolean): this.type = js.native
    
    def minimizer(name: String): Plugin[this.type, typings.webpack.mod.Plugin] = js.native
    
    def namedChunks(value: Boolean): this.type = js.native
    
    def namedModules(value: Boolean): this.type = js.native
    
    def noEmitOnErrors(value: Boolean): this.type = js.native
    
    def nodeEnv(value: String): this.type = js.native
    def nodeEnv(value: Boolean): this.type = js.native
    
    def occurrenceOrder(value: Boolean): this.type = js.native
    
    def portableRecords(value: Boolean): this.type = js.native
    
    def providedExports(value: Boolean): this.type = js.native
    
    def removeAvailableModules(value: Boolean): this.type = js.native
    
    def removeEmptyChunks(value: Boolean): this.type = js.native
    
    def runtimeChunk(value: single | multiple): this.type = js.native
    def runtimeChunk(value: Boolean): this.type = js.native
    def runtimeChunk(value: RuntimeChunk): this.type = js.native
    
    def sideEffects(value: Boolean): this.type = js.native
    
    def splitChunks(value: SplitChunksOptions): this.type = js.native
    
    def usedExports(value: Boolean): this.type = js.native
  }
  
  @JSImport("webpack-chain", "Output")
  @js.native
  open class Output () extends ChainedMap[Config] {
    
    def auxiliaryComment(value: String): this.type = js.native
    def auxiliaryComment(value: StringDictionary[String]): this.type = js.native
    
    def chunkFilename(value: String): this.type = js.native
    
    def chunkLoadTimeout(value: Double): this.type = js.native
    
    def crossOriginLoading(value: String): this.type = js.native
    def crossOriginLoading(value: Boolean): this.type = js.native
    
    def devtoolFallbackModuleFilenameTemplate(value: Any): this.type = js.native
    
    def devtoolLineToLine(value: Any): this.type = js.native
    
    def devtoolModuleFilenameTemplate(value: Any): this.type = js.native
    
    def devtoolNamespace(value: String): this.type = js.native
    
    def filename(value: String): this.type = js.native
    
    def futureEmitAssets(value: Boolean): this.type = js.native
    
    def globalObject(value: String): this.type = js.native
    
    def hashDigest(value: String): this.type = js.native
    
    def hashDigestLength(value: Double): this.type = js.native
    
    def hashFunction(value: String): this.type = js.native
    
    def hashSalt(value: Any): this.type = js.native
    
    def hotUpdateChunkFilename(value: String): this.type = js.native
    
    def hotUpdateFunction(value: Any): this.type = js.native
    
    def hotUpdateMainFilename(value: String): this.type = js.native
    
    def jsonpFunction(value: String): this.type = js.native
    
    def library(value: String): this.type = js.native
    
    def libraryExport(value: String): this.type = js.native
    def libraryExport(value: js.Array[String]): this.type = js.native
    
    def libraryTarget(value: String): this.type = js.native
    
    def path(value: String): this.type = js.native
    
    def pathinfo(value: Boolean): this.type = js.native
    
    def publicPath(value: String): this.type = js.native
    
    def sourceMapFilename(value: String): this.type = js.native
    
    def sourcePrefix(value: String): this.type = js.native
    
    def strictModuleExceptionHandling(value: Boolean): this.type = js.native
    
    def umdNamedDefine(value: Boolean): this.type = js.native
  }
  
  @JSImport("webpack-chain", "Performance")
  @js.native
  open class Performance () extends ChainedMap[Config] {
    
    def assetFilter(value: js.Function1[/* assetFilename */ String, Boolean]): this.type = js.native
    
    def hints(value: error | warning): this.type = js.native
    def hints(value: Boolean): this.type = js.native
    
    def maxAssetSize(value: Double): this.type = js.native
    
    def maxEntrypointSize(value: Double): this.type = js.native
  }
  
  @JSImport("webpack-chain", "Plugin")
  @js.native
  open class Plugin[Parent, PluginType /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tapable.Plugin */ Any */] ()
    extends ChainedMap[Parent]
       with Orderable {
    
    /* CompleteClass */
    override def after(name: String): this.type = js.native
    
    /* CompleteClass */
    override def before(name: String): this.type = js.native
    
    def init[P /* <: PluginType | PluginClass[PluginType] */](
      value: js.Function2[
          /* plugin */ P, 
          /* import warning: importer.ImportType#apply Failed type conversion: P extends webpack-chain.webpack-chain.PluginClass<this> ? std.ConstructorParameters<P> : std.Array<any> */ /* args */ js.Any, 
          PluginType
        ]
    ): this.type = js.native
    
    def tap[P /* <: PluginClass[PluginType] */](f: js.Function1[/* args */ ConstructorParameters[P], ConstructorParameters[P]]): this.type = js.native
    
    def use(plugin: String): this.type = js.native
    def use(
      plugin: String,
      args: /* import warning: importer.ImportType#apply Failed type conversion: string extends webpack-chain.webpack-chain.PluginClass<webpack.webpack.Plugin> ? std.ConstructorParameters<string> : std.Array<any> */ js.Any
    ): this.type = js.native
    def use(plugin: PluginClass[PluginType]): this.type = js.native
    def use(
      plugin: PluginClass[PluginType],
      args: /* import warning: importer.ImportType#apply Failed type conversion: webpack-chain.webpack-chain.PluginClass<PluginType> extends webpack-chain.webpack-chain.PluginClass<webpack.webpack.Plugin> ? std.ConstructorParameters<webpack-chain.webpack-chain.PluginClass<PluginType>> : std.Array<any> */ js.Any
    ): this.type = js.native
    def use[P /* <: PluginType */](plugin: P): this.type = js.native
    def use[P /* <: PluginType */](
      plugin: P,
      args: /* import warning: importer.ImportType#apply Failed type conversion: P extends webpack-chain.webpack-chain.PluginClass<webpack.webpack.Plugin> ? std.ConstructorParameters<P> : std.Array<any> */ js.Any
    ): this.type = js.native
  }
  
  @JSImport("webpack-chain", "Plugins")
  @js.native
  open class Plugins[Parent, PluginType /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tapable.Plugin */ Any */] () extends TypedChainedMap[Parent, Plugin[Parent, PluginType]]
  
  @JSImport("webpack-chain", "Resolve")
  @js.native
  open class Resolve[T] () extends ChainedMap[T] {
    
    var alias: TypedChainedMap[this.type, String] = js.native
    
    var aliasFields: TypedChainedSet[this.type, String] = js.native
    
    def cachePredicate(value: js.Function1[/* data */ Path, Boolean]): this.type = js.native
    
    def cacheWithContext(value: Boolean): this.type = js.native
    
    var descriptionFiles: TypedChainedSet[this.type, String] = js.native
    
    def enforceExtension(value: Boolean): this.type = js.native
    
    def enforceModuleExtension(value: Boolean): this.type = js.native
    
    var extensions: TypedChainedSet[this.type, String] = js.native
    
    var mainFields: TypedChainedSet[this.type, String] = js.native
    
    var mainFiles: TypedChainedSet[this.type, String] = js.native
    
    var modules: TypedChainedSet[this.type, String] = js.native
    
    def plugin(name: String): Plugin[
        this.type, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.ResolvePlugin */ Any
      ] = js.native
    
    var plugins: TypedChainedMap[
        this.type, 
        Plugin[
          this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.ResolvePlugin */ Any
        ]
      ] = js.native
    
    def symlinks(value: Boolean): this.type = js.native
    
    def unsafeCache(value: js.Array[js.RegExp]): this.type = js.native
    def unsafeCache(value: js.RegExp): this.type = js.native
    def unsafeCache(value: Boolean): this.type = js.native
  }
  
  @JSImport("webpack-chain", "ResolveLoader")
  @js.native
  open class ResolveLoader () extends Resolve[Config] {
    
    var moduleExtensions: ChainedSet[this.type] = js.native
    
    var packageMains: ChainedSet[this.type] = js.native
  }
  
  @JSImport("webpack-chain", "Rule")
  @js.native
  open class Rule[T] ()
    extends ChainedMap[T]
       with Orderable {
    
    /* CompleteClass */
    override def after(name: String): this.type = js.native
    
    /* CompleteClass */
    override def before(name: String): this.type = js.native
    
    def enforce(value: pre | post): this.type = js.native
    
    var exclude: TypedChainedSet[
        this.type, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Condition */ Any
      ] = js.native
    
    var include: TypedChainedSet[
        this.type, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Condition */ Any
      ] = js.native
    
    def oneOf(name: String): Rule[Rule[Module]] = js.native
    
    var oneOfs: TypedChainedMap[this.type, Rule[Rule[Module]]] = js.native
    
    def parser(value: StringDictionary[Any]): this.type = js.native
    
    def post(): this.type = js.native
    
    def pre(): this.type = js.native
    
    var resolve: Resolve[Rule[T]] = js.native
    
    def resourceQuery(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Condition */ Any
        ]
    ): this.type = js.native
    def resourceQuery(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Condition */ Any
    ): this.type = js.native
    
    def rule(name: String): Rule[Rule[Module]] = js.native
    
    var rules: TypedChainedMap[this.type, Rule[Rule[Module]]] = js.native
    
    def test(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Condition */ Any
        ]
    ): this.type = js.native
    def test(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Condition */ Any
    ): this.type = js.native
    
    def `type`(
      value: javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashexperimental
    ): this.type = js.native
    
    def use(name: String): Use[this.type] = js.native
    
    var uses: TypedChainedMap[this.type, Use[Rule[Module]]] = js.native
  }
  
  @JSImport("webpack-chain", "TypedChainedMap")
  @js.native
  open class TypedChainedMap[Parent, Value] ()
    extends StObject
       with typings.webpackChain.mod._Config.TypedChainedMap[Parent, Value] {
    
    /* CompleteClass */
    override def end(): Parent = js.native
  }
  
  @JSImport("webpack-chain", "TypedChainedSet")
  @js.native
  open class TypedChainedSet[Parent, Value] ()
    extends StObject
       with typings.webpackChain.mod._Config.TypedChainedSet[Parent, Value] {
    
    /* CompleteClass */
    override def end(): Parent = js.native
  }
  
  @JSImport("webpack-chain", "Use")
  @js.native
  open class Use[Parent] ()
    extends ChainedMap[Parent]
       with Orderable {
    
    /* CompleteClass */
    override def after(name: String): this.type = js.native
    
    /* CompleteClass */
    override def before(name: String): this.type = js.native
    
    def loader(value: String): this.type = js.native
    
    def options(value: LoaderOptions): this.type = js.native
    
    def tap(f: js.Function1[/* options */ LoaderOptions, LoaderOptions]): this.type = js.native
  }
  
  @js.native
  trait Config
    extends StObject
       with typings.webpackChain.mod._Config.TypedChainedMap[Unit, Any] {
    
    def amd(value: StringDictionary[Boolean]): this.type = js.native
    
    def bail(value: Boolean): this.type = js.native
    
    def cache(value: Any): this.type = js.native
    def cache(value: Boolean): this.type = js.native
    
    def context(value: String): this.type = js.native
    
    var devServer: DevServer = js.native
    
    def devtool(value: DevTool): this.type = js.native
    
    def entry(name: String): EntryPoint = js.native
    
    var entryPoints: TypedChainedMap[Config, EntryPoint] = js.native
    
    def externals(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.ExternalsElement */ Any
        ]
    ): this.type = js.native
    def externals(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.ExternalsElement */ Any
    ): this.type = js.native
    
    def loader(value: Any): this.type = js.native
    
    def mode(value: none | development | production): this.type = js.native
    
    var module: Module = js.native
    
    def name(value: String): this.type = js.native
    
    var node: ChainedMap[this.type] = js.native
    
    var optimization: Optimization = js.native
    
    var output: Output = js.native
    
    def parallelism(value: Double): this.type = js.native
    
    var performance: Performance = js.native
    
    def plugin(name: String): Plugin[this.type, typings.webpack.mod.Plugin] = js.native
    
    var plugins: Plugins[this.type, typings.webpack.mod.Plugin] = js.native
    
    def profile(value: Boolean): this.type = js.native
    
    def recordsInputPath(value: String): this.type = js.native
    
    def recordsOutputPath(value: String): this.type = js.native
    
    def recordsPath(value: String): this.type = js.native
    
    var resolve: Resolve[Config] = js.native
    
    var resolveLoader: ResolveLoader = js.native
    
    def stats(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ Any
    ): this.type = js.native
    
    def target(value: String): this.type = js.native
    
    def toConfig(): Configuration = js.native
    
    def watch(value: Boolean): this.type = js.native
    
    def watchOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.WatchOptions */ Any
    ): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpackChain.webpackChainStrings.eval
    - typings.webpackChain.webpackChainStrings.`inline-source-map`
    - typings.webpackChain.webpackChainStrings.`cheap-eval-source-map`
    - typings.webpackChain.webpackChainStrings.`cheap-source-map`
    - typings.webpackChain.webpackChainStrings.`cheap-module-eval-source-map`
    - typings.webpackChain.webpackChainStrings.`cheap-module-source-map`
    - typings.webpackChain.webpackChainStrings.`eval-source-map`
    - typings.webpackChain.webpackChainStrings.`source-map`
    - typings.webpackChain.webpackChainStrings.`nosources-source-map`
    - typings.webpackChain.webpackChainStrings.`hidden-source-map`
    - typings.webpackChain.webpackChainStrings.`@eval`
    - typings.webpackChain.webpackChainStrings.`@inline-source-map`
    - typings.webpackChain.webpackChainStrings.`@cheap-eval-source-map`
    - typings.webpackChain.webpackChainStrings.`@cheap-source-map`
    - typings.webpackChain.webpackChainStrings.`@cheap-module-eval-source-map`
    - typings.webpackChain.webpackChainStrings.`@cheap-module-source-map`
    - typings.webpackChain.webpackChainStrings.`@eval-source-map`
    - typings.webpackChain.webpackChainStrings.`@source-map`
    - typings.webpackChain.webpackChainStrings.`@nosources-source-map`
    - typings.webpackChain.webpackChainStrings.`@hidden-source-map`
    - typings.webpackChain.webpackChainStrings.Numbersigneval
    - typings.webpackChain.webpackChainStrings.`Numbersigninline-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersigncheap-eval-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersigncheap-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersigncheap-module-eval-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersigncheap-module-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersigneval-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersignsource-map`
    - typings.webpackChain.webpackChainStrings.`Numbersignnosources-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersignhidden-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersign@eval`
    - typings.webpackChain.webpackChainStrings.`Numbersign@inline-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersign@cheap-eval-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersign@cheap-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersign@cheap-module-eval-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersign@cheap-module-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersign@eval-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersign@source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersign@nosources-source-map`
    - typings.webpackChain.webpackChainStrings.`Numbersign@hidden-source-map`
    - scala.Boolean
  */
  type DevTool = _DevTool | Boolean
  
  type LoaderOptions = StringDictionary[Any]
  
  trait Orderable extends StObject {
    
    def after(name: String): this.type
    
    def before(name: String): this.type
  }
  object Orderable {
    
    inline def apply(after: String => Orderable, before: String => Orderable): Orderable = {
      val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before))
      __obj.asInstanceOf[Orderable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Orderable] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: String => Orderable): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      inline def setBefore(value: String => Orderable): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PluginClass[PluginType /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tapable.Plugin */ Any */]
    extends StObject
       with Instantiable1[/* opts (repeated) */ Any, PluginType]
  
  trait RuntimeChunk extends StObject {
    
    var name: String | RuntimeChunkFunction
  }
  object RuntimeChunk {
    
    inline def apply(name: String | RuntimeChunkFunction): RuntimeChunk = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeChunk]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuntimeChunk] (val x: Self) extends AnyVal {
      
      inline def setName(value: String | RuntimeChunkFunction): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameFunction1(value: /* entryPoint */ EntryPoint => String): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
    }
  }
  
  type RuntimeChunkFunction = js.Function1[/* entryPoint */ EntryPoint, String]
  
  type SplitChunksOptions = StringDictionary[Any]
  
  object _Config {
    
    trait Chained[Parent] extends StObject {
      
      def end(): Parent
    }
    object Chained {
      
      inline def apply[Parent](end: () => Parent): typings.webpackChain.mod._Config.Chained[Parent] = {
        val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end))
        __obj.asInstanceOf[typings.webpackChain.mod._Config.Chained[Parent]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.webpackChain.mod._Config.Chained[?], Parent] (val x: Self & typings.webpackChain.mod._Config.Chained[Parent]) extends AnyVal {
        
        inline def setEnd(value: () => Parent): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      }
    }
    
    type ChainedMap[Parent] = typings.webpackChain.mod._Config.TypedChainedMap[Parent, Any]
    
    type ChainedSet[Parent] = typings.webpackChain.mod._Config.TypedChainedSet[Parent, Any]
    
    @js.native
    trait TypedChainedMap[Parent, Value]
      extends StObject
         with typings.webpackChain.mod._Config.Chained[Parent] {
      
      def clear(): this.type = js.native
      
      def delete(key: String): this.type = js.native
      
      def entries(): StringDictionary[Value] = js.native
      
      def get(key: String): Value = js.native
      
      def getOrCompute(key: String, compute: js.Function0[Value]): Value = js.native
      
      def has(key: String): Boolean = js.native
      
      def merge(obj: StringDictionary[Value]): this.type = js.native
      
      def set(key: String, value: Value): this.type = js.native
      
      def values(): js.Array[Value] = js.native
      
      def when(condition: Boolean, trueBrancher: js.Function1[/* obj */ this.type, Unit]): this.type = js.native
      def when(
        condition: Boolean,
        trueBrancher: js.Function1[/* obj */ this.type, Unit],
        falseBrancher: js.Function1[/* obj */ this.type, Unit]
      ): this.type = js.native
    }
    
    @js.native
    trait TypedChainedSet[Parent, Value]
      extends StObject
         with typings.webpackChain.mod._Config.Chained[Parent] {
      
      def add(value: Value): this.type = js.native
      
      def clear(): this.type = js.native
      
      def delete(key: String): this.type = js.native
      
      def has(key: String): Boolean = js.native
      
      def merge(arr: js.Array[Value]): this.type = js.native
      
      def prepend(value: Value): this.type = js.native
      
      def values(): js.Array[Value] = js.native
      
      def when(condition: Boolean, trueBrancher: js.Function1[/* obj */ this.type, Unit]): this.type = js.native
      def when(
        condition: Boolean,
        trueBrancher: js.Function1[/* obj */ this.type, Unit],
        falseBrancher: js.Function1[/* obj */ this.type, Unit]
      ): this.type = js.native
    }
  }
  
  trait _DevTool extends StObject
}
