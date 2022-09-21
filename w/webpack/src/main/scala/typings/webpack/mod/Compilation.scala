package typings.webpack.mod

import typings.std.Map
import typings.std.Set
import typings.std.WeakMap
import typings.std.WeakSet
import typings.webpack.anon.Add
import typings.webpack.anon.ChunkGraphEntries
import typings.webpack.anon.ContextInfo
import typings.webpack.anon.FactorizeModuleOptionsfac
import typings.webpack.anon.FactorizeModuleOptionsfacContext
import typings.webpack.anon.Info
import typings.webpack.anon.Javascript
import typings.webpack.anon.ReadonlyAsset
import typings.webpack.anon.ReadonlybuildModuleSyncHo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "Compilation")
@js.native
open class Compilation protected () extends StObject {
  /**
  	 * Creates an instance of Compilation.
  	 */
  def this(compiler: Compiler, params: CompilationParams) = this()
  
  def addAsyncEntrypoint(options: EntryOptions, module: Module, loc: DependencyLocation, request: String): Entrypoint = js.native
  
  /**
  	 * This method first looks to see if a name is provided for a new chunk,
  	 * and first looks to see if any named chunks already exist and reuse that chunk instead.
  	 */
  def addChunk(): Chunk = js.native
  def addChunk(name: String): Chunk = js.native
  
  /**
  	 * If `module` is passed, `loc` and `request` must also be passed.
  	 */
  def addChunkInGroup(groupOptions: String): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: String, module: Unit, loc: Unit, request: String): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: String, module: Unit, loc: RealDependencyLocation): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: String, module: Unit, loc: RealDependencyLocation, request: String): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: String, module: Unit, loc: SyntheticDependencyLocation): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: String, module: Unit, loc: SyntheticDependencyLocation, request: String): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: String, module: Module): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: String, module: Module, loc: Unit, request: String): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: String, module: Module, loc: RealDependencyLocation): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: String, module: Module, loc: RealDependencyLocation, request: String): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: String, module: Module, loc: SyntheticDependencyLocation): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: String, module: Module, loc: SyntheticDependencyLocation, request: String): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: ChunkGroupOptions): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: ChunkGroupOptions, module: Unit, loc: Unit, request: String): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: ChunkGroupOptions, module: Unit, loc: RealDependencyLocation): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: ChunkGroupOptions, module: Unit, loc: RealDependencyLocation, request: String): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: ChunkGroupOptions, module: Unit, loc: SyntheticDependencyLocation): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: ChunkGroupOptions, module: Unit, loc: SyntheticDependencyLocation, request: String): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: ChunkGroupOptions, module: Module): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: ChunkGroupOptions, module: Module, loc: Unit, request: String): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: ChunkGroupOptions, module: Module, loc: RealDependencyLocation): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: ChunkGroupOptions, module: Module, loc: RealDependencyLocation, request: String): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: ChunkGroupOptions, module: Module, loc: SyntheticDependencyLocation): ChunkGroup = js.native
  def addChunkInGroup(groupOptions: ChunkGroupOptions, module: Module, loc: SyntheticDependencyLocation, request: String): ChunkGroup = js.native
  
  def addEntry(
    context: String,
    entry: Dependency,
    optionsOrName: String,
    callback: js.Function2[/* err */ js.UndefOr[Null | WebpackError], /* result */ js.UndefOr[Module], Unit]
  ): Unit = js.native
  def addEntry(
    context: String,
    entry: Dependency,
    optionsOrName: EntryOptions,
    callback: js.Function2[/* err */ js.UndefOr[Null | WebpackError], /* result */ js.UndefOr[Module], Unit]
  ): Unit = js.native
  
  def addInclude(
    context: String,
    dependency: Dependency,
    options: EntryOptions,
    callback: js.Function2[/* err */ js.UndefOr[Null | WebpackError], /* result */ js.UndefOr[Module], Unit]
  ): Unit = js.native
  
  def addModule(
    module: Module,
    callback: js.Function2[/* err */ js.UndefOr[Null | WebpackError], /* result */ js.UndefOr[Module], Unit]
  ): Unit = js.native
  
  def addModuleChain(
    context: String,
    dependency: Dependency,
    callback: js.Function2[/* err */ js.UndefOr[Null | WebpackError], /* result */ js.UndefOr[Module], Unit]
  ): Unit = js.native
  
  var addModuleQueue: AsyncQueue[Module, String, Module] = js.native
  
  def addModuleTree(
    __0: ContextInfo,
    callback: js.Function2[/* err */ js.UndefOr[Null | WebpackError], /* result */ js.UndefOr[Module], Unit]
  ): Unit = js.native
  
  def addRuntimeModule(chunk: Chunk, module: RuntimeModule): Unit = js.native
  def addRuntimeModule(chunk: Chunk, module: RuntimeModule, chunkGraph: ChunkGraph): Unit = js.native
  
  var additionalChunkAssets: js.Array[String] = js.native
  
  var assets: CompilationAssets = js.native
  
  var assetsInfo: Map[String, AssetInfo] = js.native
  
  def assignDepth(module: Module): Unit = js.native
  
  def assignDepths(modules: Set[Module]): Unit = js.native
  
  def assignRuntimeIds(): Unit = js.native
  
  var asyncEntrypoints: js.Array[Entrypoint] = js.native
  
  var bail: Boolean = js.native
  
  var buildDependencies: LazySet[String] = js.native
  
  /**
  	 * Schedules a build of the module object
  	 */
  def buildModule(
    module: Module,
    callback: js.Function2[/* err */ js.UndefOr[Null | WebpackError], /* result */ js.UndefOr[Module], Unit]
  ): Unit = js.native
  
  var buildQueue: AsyncQueue[Module, Module, Module] = js.native
  
  var buildTimeExecutedModules: WeakSet[Module] = js.native
  
  var builtModules: WeakSet[Module] = js.native
  
  def checkConstraints(): Unit = js.native
  
  var children: js.Array[Compilation] = js.native
  
  var childrenCounters: js.Object = js.native
  
  var chunkGraph: ChunkGraph = js.native
  
  var chunkGroups: js.Array[ChunkGroup] = js.native
  
  var chunkTemplate: ChunkTemplate = js.native
  
  var chunks: Set[Chunk] = js.native
  
  def clearAssets(): Unit = js.native
  
  var codeGeneratedModules: WeakSet[Module] = js.native
  
  def codeGeneration(): Unit = js.native
  def codeGeneration(callback: Any): Unit = js.native
  
  var codeGenerationResults: CodeGenerationResults = js.native
  
  var comparedForEmitAssets: Set[String] = js.native
  
  var compilationDependencies: Add = js.native
  
  var compiler: Compiler = js.native
  
  var compilerPath: String = js.native
  
  var contextDependencies: LazySet[String] = js.native
  
  /**
  	 * This function allows you to run another instance of webpack inside of webpack however as
  	 * a child with different settings and configurations (if desired) applied. It copies all hooks, plugins
  	 * from parent (or top level compiler) and creates a child Compilation
  	 */
  def createChildCompiler(name: String): Compiler = js.native
  def createChildCompiler(
    name: String,
    outputOptions: Unit,
    plugins: js.Array[
      (js.ThisFunction1[/* this */ Compiler, /* compiler */ Compiler, Unit]) | WebpackPluginInstance
    ]
  ): Compiler = js.native
  def createChildCompiler(name: String, outputOptions: OutputNormalized): Compiler = js.native
  def createChildCompiler(
    name: String,
    outputOptions: OutputNormalized,
    plugins: js.Array[
      (js.ThisFunction1[/* this */ Compiler, /* compiler */ Compiler, Unit]) | WebpackPluginInstance
    ]
  ): Compiler = js.native
  
  def createChunkAssets(callback: js.Function1[/* err */ js.UndefOr[Null | WebpackError], Unit]): Unit = js.native
  
  def createHash(): js.Array[typings.webpack.anon.Hash] = js.native
  
  def createModuleAssets(): Unit = js.native
  
  def createModuleHashes(): Unit = js.native
  
  def createStatsFactory(): StatsFactory = js.native
  def createStatsFactory(options: Any): StatsFactory = js.native
  
  def createStatsOptions(optionsOrPreset: String): NormalizedStatsOptions = js.native
  def createStatsOptions(optionsOrPreset: String, context: CreateStatsOptionsContext): NormalizedStatsOptions = js.native
  def createStatsOptions(optionsOrPreset: StatsOptions): NormalizedStatsOptions = js.native
  def createStatsOptions(optionsOrPreset: StatsOptions, context: CreateStatsOptionsContext): NormalizedStatsOptions = js.native
  
  def createStatsPrinter(): StatsPrinter = js.native
  def createStatsPrinter(options: Any): StatsPrinter = js.native
  
  /**
  	 * Modules in value are building during the build of Module in key.
  	 * Means value blocking key from finishing.
  	 * Needed to detect build cycles.
  	 */
  var creatingModuleDuringBuild: WeakMap[Module, Set[Module]] = js.native
  
  def deleteAsset(file: String): Unit = js.native
  
  var dependencyFactories: Map[DepConstructor, ModuleFactory] = js.native
  
  var dependencyTemplates: DependencyTemplates = js.native
  
  def emitAsset(file: String, source: Source): Unit = js.native
  def emitAsset(file: String, source: Source, assetInfo: AssetInfo): Unit = js.native
  
  var emittedAssets: Set[String] = js.native
  
  var endTime: Any = js.native
  
  var entries: Map[String, EntryData] = js.native
  
  var entrypoints: Map[String, Entrypoint] = js.native
  
  var errors: js.Array[WebpackError] = js.native
  
  def executeModule(
    module: Module,
    options: ExecuteModuleOptions,
    callback: js.Function2[
      /* err */ js.UndefOr[Null | WebpackError], 
      /* result */ js.UndefOr[ExecuteModuleResult], 
      Unit
    ]
  ): Unit = js.native
  
  def factorizeModule(
    options: FactorizeModuleOptionsfacContext,
    callback: js.Function2[
      /* err */ js.UndefOr[Null | WebpackError], 
      /* result */ js.UndefOr[ModuleFactoryResult], 
      Unit
    ]
  ): Unit = js.native
  def factorizeModule(
    options: FactorizeModuleOptionsfac,
    callback: js.Function2[/* err */ js.UndefOr[Null | WebpackError], /* result */ js.UndefOr[Module], Unit]
  ): Unit = js.native
  
  var factorizeQueue: AsyncQueue[FactorizeModuleOptions, String, Module | ModuleFactoryResult] = js.native
  
  var fileDependencies: LazySet[String] = js.native
  
  var fileSystemInfo: FileSystemInfo = js.native
  
  /**
  	 * Attempts to search for a module by its identifier
  	 */
  def findModule(identifier: String): js.UndefOr[Module] = js.native
  
  def finish(): Unit = js.native
  def finish(callback: Any): Unit = js.native
  
  var fullHash: js.UndefOr[String] = js.native
  
  def getAsset(name: String): js.UndefOr[ReadonlyAsset] = js.native
  
  def getAssetPath(filename: String, data: PathData): String = js.native
  def getAssetPath(
    filename: js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String],
    data: PathData
  ): String = js.native
  
  def getAssetPathWithInfo(filename: String, data: PathData): Info = js.native
  def getAssetPathWithInfo(
    filename: js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String],
    data: PathData
  ): Info = js.native
  
  def getAssets(): js.Array[ReadonlyAsset] = js.native
  
  def getCache(name: String): CacheFacade = js.native
  
  def getDependencyReferencedExports(dependency: Dependency, runtime: RuntimeSpec): js.Array[js.Array[String] | ReferencedExport] = js.native
  
  def getErrors(): js.Array[WebpackError] = js.native
  
  def getLogger(name: String): WebpackLogger = js.native
  def getLogger(name: js.Function0[String]): WebpackLogger = js.native
  
  /**
  	 * Fetches a module from a compilation by its identifier
  	 */
  def getModule(module: Module): Module = js.native
  
  def getPath(filename: String): String = js.native
  def getPath(filename: String, data: PathData): String = js.native
  def getPath(filename: js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String]): String = js.native
  def getPath(
    filename: js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String],
    data: PathData
  ): String = js.native
  
  def getPathWithInfo(filename: String): Info = js.native
  def getPathWithInfo(filename: String, data: PathData): Info = js.native
  def getPathWithInfo(filename: js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String]): Info = js.native
  def getPathWithInfo(
    filename: js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String],
    data: PathData
  ): Info = js.native
  
  def getRenderManifest(options: RenderManifestOptions): js.Array[RenderManifestEntry] = js.native
  
  def getStats(): Stats = js.native
  
  def getWarnings(): js.Array[WebpackError] = js.native
  
  var globalEntry: EntryData = js.native
  
  def handleModuleCreation(
    __0: HandleModuleCreationOptions,
    callback: js.Function2[/* err */ js.UndefOr[Null | WebpackError], /* result */ js.UndefOr[Module], Unit]
  ): Unit = js.native
  
  var hash: js.UndefOr[String] = js.native
  
  var hooks: ReadonlybuildModuleSyncHo = js.native
  
  var inputFileSystem: InputFileSystem = js.native
  
  var logger: WebpackLogger = js.native
  
  var logging: Map[String, js.Array[LogEntry]] = js.native
  
  var mainTemplate: MainTemplate = js.native
  
  var missingDependencies: LazySet[String] = js.native
  
  var moduleGraph: ModuleGraph = js.native
  
  var moduleMemCaches: js.UndefOr[Map[Module, WeakTupleMap[Any, Any]]] = js.native
  
  var moduleMemCaches2: js.UndefOr[Map[Module, WeakTupleMap[Any, Any]]] = js.native
  
  var moduleTemplates: Javascript = js.native
  
  var modules: Set[Module] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namedChunkGroups: Map[String, ChunkGroup] = js.native
  
  var namedChunks: Map[String, Chunk] = js.native
  
  var needAdditionalPass: Boolean = js.native
  
  var options: WebpackOptionsNormalized = js.native
  
  var outputOptions: OutputNormalized = js.native
  
  var params: CompilationParams = js.native
  
  def patchChunksAfterReasonRemoval(module: Module, chunk: Chunk): Unit = js.native
  
  var processDependenciesQueue: AsyncQueue[Module, Module, Module] = js.native
  
  def processModuleDependencies(
    module: Module,
    callback: js.Function2[/* err */ js.UndefOr[Null | WebpackError], /* result */ js.UndefOr[Module], Unit]
  ): Unit = js.native
  
  def processModuleDependenciesNonRecursive(module: Module): Unit = js.native
  
  def processRuntimeRequirements(): Unit = js.native
  def processRuntimeRequirements(__0: ChunkGraphEntries): Unit = js.native
  
  var profile: Boolean = js.native
  
  def rebuildModule(
    module: Module,
    callback: js.Function2[/* err */ js.UndefOr[Null | WebpackError], /* result */ js.UndefOr[Module], Unit]
  ): Unit = js.native
  
  var rebuildQueue: AsyncQueue[Module, Module, Module] = js.native
  
  var records: Any = js.native
  
  def removeChunkFromDependencies(block: DependenciesBlock, chunk: Chunk): Unit = js.native
  
  def removeReasonsOfDependencyBlock(module: Module, block: DependenciesBlockLike): Unit = js.native
  
  def renameAsset(): Unit = js.native
  def renameAsset(file: Any): Unit = js.native
  def renameAsset(file: Any, newFile: Any): Unit = js.native
  def renameAsset(file: Unit, newFile: Any): Unit = js.native
  
  def reportDependencyErrorsAndWarnings(module: Module, blocks: js.Array[DependenciesBlock]): Boolean = js.native
  
  var requestShortener: RequestShortener = js.native
  
  var resolverFactory: ResolverFactory = js.native
  
  var runtimeTemplate: RuntimeTemplate = js.native
  
  def seal(callback: js.Function1[/* err */ js.UndefOr[Null | WebpackError], Unit]): Unit = js.native
  
  def sortItemsWithChunkIds(): Unit = js.native
  
  var startTime: Any = js.native
  
  def summarizeDependencies(): Unit = js.native
  
  def unseal(): Unit = js.native
  
  def updateAsset(file: String, newSourceOrFunction: js.Function1[/* arg0 */ Source, Source]): Unit = js.native
  def updateAsset(
    file: String,
    newSourceOrFunction: js.Function1[/* arg0 */ Source, Source],
    assetInfoUpdateOrFunction: js.Function1[/* arg0 */ js.UndefOr[AssetInfo], AssetInfo]
  ): Unit = js.native
  def updateAsset(
    file: String,
    newSourceOrFunction: js.Function1[/* arg0 */ Source, Source],
    assetInfoUpdateOrFunction: AssetInfo
  ): Unit = js.native
  def updateAsset(file: String, newSourceOrFunction: Source): Unit = js.native
  def updateAsset(
    file: String,
    newSourceOrFunction: Source,
    assetInfoUpdateOrFunction: js.Function1[/* arg0 */ js.UndefOr[AssetInfo], AssetInfo]
  ): Unit = js.native
  def updateAsset(file: String, newSourceOrFunction: Source, assetInfoUpdateOrFunction: AssetInfo): Unit = js.native
  
  var usedChunkIds: Set[String | Double] = js.native
  
  var usedModuleIds: Set[Double] = js.native
  
  var valueCacheVersions: Map[String, String | Set[String]] = js.native
  
  var warnings: js.Array[WebpackError] = js.native
}
object Compilation {
  
  @JSImport("webpack", "Compilation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	 * Add additional assets to the compilation.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_ADDITIONAL")
  @js.native
  def PROCESS_ASSETS_STAGE_ADDITIONAL: Double = js.native
  inline def PROCESS_ASSETS_STAGE_ADDITIONAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_ADDITIONAL")(x.asInstanceOf[js.Any])
  
  /**
  	 * Add additional sections to existing assets, like a banner or initialization code.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_ADDITIONS")
  @js.native
  def PROCESS_ASSETS_STAGE_ADDITIONS: Double = js.native
  inline def PROCESS_ASSETS_STAGE_ADDITIONS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_ADDITIONS")(x.asInstanceOf[js.Any])
  
  /**
  	 * Analyse existing assets.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_ANALYSE")
  @js.native
  def PROCESS_ASSETS_STAGE_ANALYSE: Double = js.native
  inline def PROCESS_ASSETS_STAGE_ANALYSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_ANALYSE")(x.asInstanceOf[js.Any])
  
  /**
  	 * Derive new assets from existing assets.
  	 * Existing assets should not be treated as complete.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_DERIVED")
  @js.native
  def PROCESS_ASSETS_STAGE_DERIVED: Double = js.native
  inline def PROCESS_ASSETS_STAGE_DERIVED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_DERIVED")(x.asInstanceOf[js.Any])
  
  /**
  	 * Add development tooling to assets, e. g. by extracting a SourceMap.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_DEV_TOOLING")
  @js.native
  def PROCESS_ASSETS_STAGE_DEV_TOOLING: Double = js.native
  inline def PROCESS_ASSETS_STAGE_DEV_TOOLING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_DEV_TOOLING")(x.asInstanceOf[js.Any])
  
  /**
  	 * Optimize existing assets in a general way.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_OPTIMIZE")
  @js.native
  def PROCESS_ASSETS_STAGE_OPTIMIZE: Double = js.native
  inline def PROCESS_ASSETS_STAGE_OPTIMIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_OPTIMIZE")(x.asInstanceOf[js.Any])
  
  /**
  	 * Optimize the compatibility of existing assets, e. g. add polyfills or vendor-prefixes.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_OPTIMIZE_COMPATIBILITY")
  @js.native
  def PROCESS_ASSETS_STAGE_OPTIMIZE_COMPATIBILITY: Double = js.native
  inline def PROCESS_ASSETS_STAGE_OPTIMIZE_COMPATIBILITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_OPTIMIZE_COMPATIBILITY")(x.asInstanceOf[js.Any])
  
  /**
  	 * Optimize the count of existing assets, e. g. by merging them.
  	 * Only assets of the same type should be merged.
  	 * For assets of different types see PROCESS_ASSETS_STAGE_OPTIMIZE_INLINE.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_OPTIMIZE_COUNT")
  @js.native
  def PROCESS_ASSETS_STAGE_OPTIMIZE_COUNT: Double = js.native
  inline def PROCESS_ASSETS_STAGE_OPTIMIZE_COUNT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_OPTIMIZE_COUNT")(x.asInstanceOf[js.Any])
  
  /**
  	 * Optimize the hashes of the assets, e. g. by generating real hashes of the asset content.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_OPTIMIZE_HASH")
  @js.native
  def PROCESS_ASSETS_STAGE_OPTIMIZE_HASH: Double = js.native
  inline def PROCESS_ASSETS_STAGE_OPTIMIZE_HASH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_OPTIMIZE_HASH")(x.asInstanceOf[js.Any])
  
  /**
  	 * Optimize the count of existing assets, e. g. by inlining assets of into other assets.
  	 * Only assets of different types should be inlined.
  	 * For assets of the same type see PROCESS_ASSETS_STAGE_OPTIMIZE_COUNT.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_OPTIMIZE_INLINE")
  @js.native
  def PROCESS_ASSETS_STAGE_OPTIMIZE_INLINE: Double = js.native
  inline def PROCESS_ASSETS_STAGE_OPTIMIZE_INLINE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_OPTIMIZE_INLINE")(x.asInstanceOf[js.Any])
  
  /**
  	 * Optimize the size of existing assets, e. g. by minimizing or omitting whitespace.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_OPTIMIZE_SIZE")
  @js.native
  def PROCESS_ASSETS_STAGE_OPTIMIZE_SIZE: Double = js.native
  inline def PROCESS_ASSETS_STAGE_OPTIMIZE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_OPTIMIZE_SIZE")(x.asInstanceOf[js.Any])
  
  /**
  	 * Optimize the transfer of existing assets, e. g. by preparing a compressed (gzip) file as separate asset.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_OPTIMIZE_TRANSFER")
  @js.native
  def PROCESS_ASSETS_STAGE_OPTIMIZE_TRANSFER: Double = js.native
  inline def PROCESS_ASSETS_STAGE_OPTIMIZE_TRANSFER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_OPTIMIZE_TRANSFER")(x.asInstanceOf[js.Any])
  
  /**
  	 * Basic preprocessing of assets.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_PRE_PROCESS")
  @js.native
  def PROCESS_ASSETS_STAGE_PRE_PROCESS: Double = js.native
  inline def PROCESS_ASSETS_STAGE_PRE_PROCESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_PRE_PROCESS")(x.asInstanceOf[js.Any])
  
  /**
  	 * Creating assets for reporting purposes.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_REPORT")
  @js.native
  def PROCESS_ASSETS_STAGE_REPORT: Double = js.native
  inline def PROCESS_ASSETS_STAGE_REPORT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_REPORT")(x.asInstanceOf[js.Any])
  
  /**
  	 * Summarize the list of existing assets
  	 * e. g. creating an assets manifest of Service Workers.
  	 */
  /* static member */
  @JSImport("webpack", "Compilation.PROCESS_ASSETS_STAGE_SUMMARIZE")
  @js.native
  def PROCESS_ASSETS_STAGE_SUMMARIZE: Double = js.native
  inline def PROCESS_ASSETS_STAGE_SUMMARIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_ASSETS_STAGE_SUMMARIZE")(x.asInstanceOf[js.Any])
}
