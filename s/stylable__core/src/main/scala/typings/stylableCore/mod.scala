package typings.stylableCore

import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.AtRule_
import typings.postcss.mod.Container
import typings.postcss.mod.Declaration
import typings.postcss.mod.Node
import typings.postcss.mod.ProcessOptions
import typings.postcss.mod.Root_
import typings.postcss.mod.Rule_
import typings.std.Record
import typings.std.RegExp
import typings.std.RegExpMatchArray
import typings.stylableCore.anon.Ast
import typings.stylableCore.anon.Cwd
import typings.stylableCore.anon.Dirname
import typings.stylableCore.anon.Fs
import typings.stylableCore.anon.KeyframesMap
import typings.stylableCore.anon.OmitTimedCacheOptionscrea
import typings.stylableCore.anon.OutputValue
import typings.stylableCore.anon.PartialSelectorAstNode
import typings.stylableCore.anon.Prefix
import typings.stylableCore.anon.Selector
import typings.stylableCore.anon.Value
import typings.stylableCore.cachedProcessFileMod.FileProcessor
import typings.stylableCore.cachedProcessFileMod.MinimalFS
import typings.stylableCore.cachedProcessFileMod.processFn
import typings.stylableCore.createInfraStructureMod.StylableInfrastructure
import typings.stylableCore.cssdocsMod.CssDoc
import typings.stylableCore.customValuesMod.Box_
import typings.stylableCore.customValuesMod.BoxedValueMap
import typings.stylableCore.customValuesMod.CustomTypes
import typings.stylableCore.customValuesMod.CustomValueExtension
import typings.stylableCore.customValuesMod.ExtensionApi
import typings.stylableCore.customValuesMod.JSValueExtension
import typings.stylableCore.diagnosticsMod.Diagnostic
import typings.stylableCore.memoryMinimalFsMod.MinimalFSSetup
import typings.stylableCore.parserMod.CssParser
import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import typings.stylableCore.selectorUtilsMod.SelectorChunk
import typings.stylableCore.selectorUtilsMod.SelectorChunk2
import typings.stylableCore.selectorUtilsMod.Visitor
import typings.stylableCore.stateValidatorsMod.StateParamType
import typings.stylableCore.stateValidatorsMod.StateResult
import typings.stylableCore.stylableAssetsMod.OnUrlCallback
import typings.stylableCore.stylableCoreStrings.Colonimport
import typings.stylableCore.stylableCoreStrings.Colonvars
import typings.stylableCore.stylableCoreStrings.`-st-default`
import typings.stylableCore.stylableCoreStrings.`-st-extends`
import typings.stylableCore.stylableCoreStrings.`-st-from`
import typings.stylableCore.stylableCoreStrings.`-st-global`
import typings.stylableCore.stylableCoreStrings.`-st-mixin`
import typings.stylableCore.stylableCoreStrings.`-st-named`
import typings.stylableCore.stylableCoreStrings.`-st-partial-mixin`
import typings.stylableCore.stylableCoreStrings.`-st-root`
import typings.stylableCore.stylableCoreStrings.`-st-states`
import typings.stylableCore.stylableCoreStrings.`st-scope`
import typings.stylableCore.stylableCoreStrings.args
import typings.stylableCore.stylableCoreStrings.development
import typings.stylableCore.stylableCoreStrings.named
import typings.stylableCore.stylableCoreStrings.namespace
import typings.stylableCore.stylableCoreStrings.production
import typings.stylableCore.stylableMetaMod.ClassSymbol
import typings.stylableCore.stylableMetaMod.ElementSymbol
import typings.stylableCore.stylableMetaMod.ImportSymbol
import typings.stylableCore.stylableMetaMod.Imported
import typings.stylableCore.stylableMetaMod.RefedMixin
import typings.stylableCore.stylableMetaMod.StylableSymbol
import typings.stylableCore.stylableMod.StylableConfig
import typings.stylableCore.stylableProcessorMod.DeclStylableProps
import typings.stylableCore.stylableProcessorMod.SDecl
import typings.stylableCore.stylableProcessorMod.SRule
import typings.stylableCore.stylableResolverMod.CSSResolve
import typings.stylableCore.stylableTransformerMod.TransformHooks
import typings.stylableCore.stylableTransformerMod.TransformerOptions
import typings.stylableCore.stylableTransformerMod.replaceValueHook
import typings.stylableCore.stylableValueParsersMod.MappedStates
import typings.stylableCore.stylableValueParsersMod.MixinValue
import typings.stylableCore.stylableValueParsersMod.ReportWarning
import typings.stylableCore.typesMod.IStylableOptimizer
import typings.stylableCore.typesMod.ModuleResolver
import typings.stylableCore.typesMod.ParsedValue
import typings.stylableCore.typesMod.StateParsedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/core", "CUSTOM_SELECTOR_RE")
  @js.native
  val CUSTOM_SELECTOR_RE: RegExp = js.native
  
  object CustomValueStrategy {
    
    @JSImport("@stylable/core", "CustomValueStrategy.args")
    @js.native
    def args(fnNode: ParsedValue, customTypes: CustomTypes): js.Array[String | (Box_[String, _])] = js.native
    
    @JSImport("@stylable/core", "CustomValueStrategy.named")
    @js.native
    def named(fnNode: ParsedValue, customTypes: CustomTypes): BoxedValueMap = js.native
  }
  
  @JSImport("@stylable/core", "Diagnostics")
  @js.native
  class Diagnostics ()
    extends typings.stylableCore.diagnosticsMod.Diagnostics {
    def this(reports: js.Array[Diagnostic]) = this()
  }
  
  @JSImport("@stylable/core", "RESERVED_ROOT_NAME")
  @js.native
  val RESERVED_ROOT_NAME: /* "root" */ String = js.native
  
  object SBTypesParsers {
    
    @JSImport("@stylable/core", "SBTypesParsers.-st-extends")
    @js.native
    def stExtends(value: String): Ast = js.native
    
    @JSImport("@stylable/core", "SBTypesParsers.-st-global")
    @js.native
    def stGlobal(decl: Declaration, _diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): js.Any = js.native
    
    @JSImport("@stylable/core", "SBTypesParsers.-st-mixin")
    @js.native
    def stMixin(mixinNode: Declaration, strategy: js.Function1[/* type */ String, named | args]): js.Array[MixinValue] = js.native
    @JSImport("@stylable/core", "SBTypesParsers.-st-mixin")
    @js.native
    def stMixin(
      mixinNode: Declaration,
      strategy: js.Function1[/* type */ String, named | args],
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): js.Array[MixinValue] = js.native
    
    @JSImport("@stylable/core", "SBTypesParsers.-st-named")
    @js.native
    def stNamed(value: String, node: Declaration, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): KeyframesMap = js.native
    
    @JSImport("@stylable/core", "SBTypesParsers.-st-partial-mixin")
    @js.native
    def stPartialMixin(mixinNode: Declaration, strategy: js.Function1[/* type */ String, named | args]): js.Array[MixinValue] = js.native
    @JSImport("@stylable/core", "SBTypesParsers.-st-partial-mixin")
    @js.native
    def stPartialMixin(
      mixinNode: Declaration,
      strategy: js.Function1[/* type */ String, named | args],
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): js.Array[MixinValue] = js.native
    
    @JSImport("@stylable/core", "SBTypesParsers.-st-root")
    @js.native
    def stRoot(value: String): Boolean = js.native
    
    @JSImport("@stylable/core", "SBTypesParsers.-st-states")
    @js.native
    def stStates(value: String, decl: Declaration, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): MappedStates = js.native
  }
  
  @JSImport("@stylable/core", "STYLABLE_NAMED_MATCHER")
  @js.native
  val STYLABLE_NAMED_MATCHER: RegExp = js.native
  
  @JSImport("@stylable/core", "STYLABLE_VALUE_MATCHER")
  @js.native
  val STYLABLE_VALUE_MATCHER: RegExp = js.native
  
  @JSImport("@stylable/core", "Stylable")
  @js.native
  class Stylable protected ()
    extends typings.stylableCore.stylableMod.Stylable {
    def this(
      projectRoot: String,
      fileSystem: MinimalFS,
      requireModule: js.Function1[/* path */ String, _],
      delimiter: js.UndefOr[String],
      onProcess: js.UndefOr[
            js.Function2[
              /* meta */ typings.stylableCore.stylableProcessorMod.StylableMeta, 
              /* path */ String, 
              typings.stylableCore.stylableProcessorMod.StylableMeta
            ]
          ],
      diagnostics: js.UndefOr[typings.stylableCore.diagnosticsMod.Diagnostics],
      hooks: js.UndefOr[TransformHooks],
      resolveOptions: js.UndefOr[js.Any],
      optimizer: js.UndefOr[IStylableOptimizer],
      mode: js.UndefOr[production | development],
      resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]],
      timedCacheOptions: js.UndefOr[OmitTimedCacheOptionscrea],
      resolveModule: js.UndefOr[ModuleResolver],
      cssParser: js.UndefOr[CssParser]
    ) = this()
  }
  /* static members */
  object Stylable {
    
    @JSImport("@stylable/core", "Stylable.create")
    @js.native
    def create(config: StylableConfig): typings.stylableCore.stylableMod.Stylable = js.native
  }
  
  @JSImport("@stylable/core", "StylableMeta")
  @js.native
  class StylableMeta protected ()
    extends typings.stylableCore.stylableProcessorMod.StylableMeta {
    def this(ast: Root_, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics) = this()
  }
  
  @JSImport("@stylable/core", "StylableProcessor")
  @js.native
  class StylableProcessor ()
    extends typings.stylableCore.stylableProcessorMod.StylableProcessor {
    def this(diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics) = this()
    def this(
      diagnostics: js.UndefOr[scala.Nothing],
      resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
    ) = this()
    def this(
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
    ) = this()
  }
  
  @JSImport("@stylable/core", "StylableResolver")
  @js.native
  class StylableResolver protected ()
    extends typings.stylableCore.stylableResolverMod.StylableResolver {
    def this(
      fileProcessor: FileProcessor[typings.stylableCore.stylableProcessorMod.StylableMeta],
      requireModule: js.Function1[/* modulePath */ String, _]
    ) = this()
  }
  
  @JSImport("@stylable/core", "StylableTransformer")
  @js.native
  class StylableTransformer protected ()
    extends typings.stylableCore.stylableTransformerMod.StylableTransformer {
    def this(options: TransformerOptions) = this()
  }
  
  @JSImport("@stylable/core", "appendMixin")
  @js.native
  def appendMixin(
    mix: RefedMixin,
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    rule: SRule,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String]
  ): Unit = js.native
  @JSImport("@stylable/core", "appendMixin")
  @js.native
  def appendMixin(
    mix: RefedMixin,
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    rule: SRule,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String],
    path: js.Array[String]
  ): Unit = js.native
  
  @JSImport("@stylable/core", "appendMixins")
  @js.native
  def appendMixins(
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    rule: SRule,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String]
  ): Unit = js.native
  @JSImport("@stylable/core", "appendMixins")
  @js.native
  def appendMixins(
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    rule: SRule,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String],
    path: js.Array[String]
  ): Unit = js.native
  
  @JSImport("@stylable/core", "assureRelativeUrlPrefix")
  @js.native
  def assureRelativeUrlPrefix(url: String): String = js.native
  
  @JSImport("@stylable/core", "box")
  @js.native
  def box[Type /* <: String */, Value /* <: js.Any */](`type`: Type, value: Value): Box_[Type, Value] = js.native
  
  @JSImport("@stylable/core", "cachedProcessFile")
  @js.native
  def cachedProcessFile[T](
    processor: processFn[T],
    fs: MinimalFS,
    resolvePath: js.Function2[/* path */ String, /* context */ js.UndefOr[String], String]
  ): FileProcessor[T] = js.native
  
  @JSImport("@stylable/core", "collectAssets")
  @js.native
  def collectAssets(ast: Root_): js.Array[String] = js.native
  
  @JSImport("@stylable/core", "createChecker")
  @js.native
  def createChecker(types: js.Array[String | js.Array[String]]): js.Function0[js.Function1[/* node */ SelectorAstNode, Boolean]] = js.native
  
  @JSImport("@stylable/core", "createCustomValue")
  @js.native
  def createCustomValue[Value, Args](hasProcessArgsCreateValueFlattenValueGetValue: ExtensionApi[Value, Args]): JSValueExtension[Value] = js.native
  
  @JSImport("@stylable/core", "createDefaultResolver")
  @js.native
  def createDefaultResolver(fileSystem: MinimalFS, resolveOptions: js.Any): ModuleResolver = js.native
  
  @JSImport("@stylable/core", "createEmptyMeta")
  @js.native
  def createEmptyMeta(root: Root_, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
  
  @JSImport("@stylable/core", "createInfrastructure")
  @js.native
  def createInfrastructure(
    projectRoot: String,
    fileSystem: MinimalFS,
    onProcess: js.UndefOr[
      js.Function2[
        /* meta */ typings.stylableCore.stylableProcessorMod.StylableMeta, 
        /* path */ String, 
        typings.stylableCore.stylableProcessorMod.StylableMeta
      ]
    ],
    resolveOptions: js.UndefOr[js.Any],
    resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]],
    timedCacheOptions: js.UndefOr[OmitTimedCacheOptionscrea],
    resolveModule: js.UndefOr[ModuleResolver],
    cssParser: js.UndefOr[CssParser],
    createDiagnostics: js.UndefOr[js.Function1[/* from */ String, typings.stylableCore.diagnosticsMod.Diagnostics]]
  ): StylableInfrastructure = js.native
  
  @JSImport("@stylable/core", "createMinimalFS")
  @js.native
  def createMinimalFS(hasFilesTrimWS: MinimalFSSetup): Fs = js.native
  
  @JSImport("@stylable/core", "createSimpleSelectorChecker")
  @js.native
  def createSimpleSelectorChecker(): js.Function1[/* node */ SelectorAstNode, Boolean] = js.native
  
  @JSImport("@stylable/core", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String): T = js.native
  @JSImport("@stylable/core", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: T): T = js.native
  @JSImport("@stylable/core", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: T, isRoot: Boolean): T = js.native
  @JSImport("@stylable/core", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: js.UndefOr[scala.Nothing], isRoot: Boolean): T = js.native
  @JSImport("@stylable/core", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String): T = js.native
  @JSImport("@stylable/core", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: T): T = js.native
  @JSImport("@stylable/core", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: T, isRoot: Boolean): T = js.native
  @JSImport("@stylable/core", "createSubsetAst")
  @js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: js.UndefOr[scala.Nothing], isRoot: Boolean): T = js.native
  
  @JSImport("@stylable/core", "createWarningRule")
  @js.native
  def createWarningRule(
    extendedNode: String,
    scopedExtendedNode: String,
    extendedFile: String,
    extendingNode: String,
    scopedExtendingNode: String,
    extendingFile: String
  ): Rule_ = js.native
  @JSImport("@stylable/core", "createWarningRule")
  @js.native
  def createWarningRule(
    extendedNode: String,
    scopedExtendedNode: String,
    extendedFile: String,
    extendingNode: String,
    scopedExtendingNode: String,
    extendingFile: String,
    useScoped: Boolean
  ): Rule_ = js.native
  
  @JSImport("@stylable/core", "evalDeclarationValue")
  @js.native
  def evalDeclarationValue(
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    value: String,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    node: js.UndefOr[Node],
    variableOverride: js.UndefOr[(Record[String, String]) | Null],
    valueHook: js.UndefOr[replaceValueHook],
    diagnostics: js.UndefOr[typings.stylableCore.diagnosticsMod.Diagnostics],
    passedThrough: js.UndefOr[js.Array[String]],
    cssVarsMapping: js.UndefOr[Record[String, String]],
    args: js.UndefOr[js.Array[String]]
  ): String = js.native
  
  @JSImport("@stylable/core", "expandCustomSelectors")
  @js.native
  def expandCustomSelectors(rule: Rule_, customSelectors: Record[String, String]): String = js.native
  @JSImport("@stylable/core", "expandCustomSelectors")
  @js.native
  def expandCustomSelectors(
    rule: Rule_,
    customSelectors: Record[String, String],
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
  ): String = js.native
  
  @JSImport("@stylable/core", "filterChunkNodesByType")
  @js.native
  def filterChunkNodesByType(chunk: SelectorChunk, typeOptions: js.Array[String]): js.Array[PartialSelectorAstNode] = js.native
  
  @JSImport("@stylable/core", "findDeclaration")
  @js.native
  def findDeclaration(importNode: Imported, test: js.Any): Declaration = js.native
  
  @JSImport("@stylable/core", "findRule")
  @js.native
  def findRule(root: Root_, selector: String): Null | Declaration = js.native
  @JSImport("@stylable/core", "findRule")
  @js.native
  def findRule(root: Root_, selector: String, test: js.Any): Null | Declaration = js.native
  
  @JSImport("@stylable/core", "fixChunkOrdering")
  @js.native
  def fixChunkOrdering(selectorNode: SelectorAstNode, prefixType: SelectorAstNode): Unit = js.native
  
  @JSImport("@stylable/core", "fixRelativeUrls")
  @js.native
  def fixRelativeUrls(ast: Root_, originPath: String, targetPath: String): Unit = js.native
  
  object functionWarnings {
    
    @JSImport("@stylable/core", "functionWarnings.CANNOT_FIND_IMPORTED_VAR")
    @js.native
    def CANNOT_FIND_IMPORTED_VAR(varName: String): String = js.native
    
    @JSImport("@stylable/core", "functionWarnings.CANNOT_USE_AS_VALUE")
    @js.native
    def CANNOT_USE_AS_VALUE(`type`: String, varName: String): String = js.native
    
    @JSImport("@stylable/core", "functionWarnings.CANNOT_USE_JS_AS_VALUE")
    @js.native
    def CANNOT_USE_JS_AS_VALUE(varName: String): String = js.native
    
    @JSImport("@stylable/core", "functionWarnings.COULD_NOT_RESOLVE_VALUE")
    @js.native
    def COULD_NOT_RESOLVE_VALUE(args: String): String = js.native
    
    @JSImport("@stylable/core", "functionWarnings.CYCLIC_VALUE")
    @js.native
    def CYCLIC_VALUE(cyclicChain: js.Array[String]): String = js.native
    
    @JSImport("@stylable/core", "functionWarnings.FAIL_TO_EXECUTE_FORMATTER")
    @js.native
    def FAIL_TO_EXECUTE_FORMATTER(resolvedValue: String, message: String): String = js.native
    
    @JSImport("@stylable/core", "functionWarnings.MULTI_ARGS_IN_VALUE")
    @js.native
    def MULTI_ARGS_IN_VALUE(args: String): String = js.native
    
    @JSImport("@stylable/core", "functionWarnings.UNKNOWN_FORMATTER")
    @js.native
    def UNKNOWN_FORMATTER(name: String): String = js.native
    
    @JSImport("@stylable/core", "functionWarnings.UNKNOWN_VAR")
    @js.native
    def UNKNOWN_VAR(name: String): String = js.native
  }
  
  @JSImport("@stylable/core", "generateScopedCSSVar")
  @js.native
  def generateScopedCSSVar(namespace: String, varName: String): String = js.native
  
  @JSImport("@stylable/core", "getAlias")
  @js.native
  def getAlias(symbol: StylableSymbol): js.UndefOr[ImportSymbol] = js.native
  
  @JSImport("@stylable/core", "getBoxValue")
  @js.native
  def getBoxValue(path: js.Array[String], value: String, node: ParsedValue, customTypes: CustomTypes): String = js.native
  @JSImport("@stylable/core", "getBoxValue")
  @js.native
  def getBoxValue(path: js.Array[String], value: Box_[String, _], node: ParsedValue, customTypes: CustomTypes): String = js.native
  
  @JSImport("@stylable/core", "getCssDocsForSymbol")
  @js.native
  def getCssDocsForSymbol(meta: typings.stylableCore.stylableMetaMod.StylableMeta, symbol: StylableSymbol): CssDoc | Null = js.native
  
  @JSImport("@stylable/core", "getDeclStylable")
  @js.native
  def getDeclStylable(decl: SDecl): DeclStylableProps = js.native
  
  @JSImport("@stylable/core", "getFormatterArgs")
  @js.native
  def getFormatterArgs(node: ParsedValue): js.Array[String] = js.native
  @JSImport("@stylable/core", "getFormatterArgs")
  @js.native
  def getFormatterArgs(
    node: ParsedValue,
    allowComments: js.UndefOr[scala.Nothing],
    _reportWarning: js.UndefOr[scala.Nothing],
    perserveQuotes: Boolean
  ): js.Array[String] = js.native
  @JSImport("@stylable/core", "getFormatterArgs")
  @js.native
  def getFormatterArgs(node: ParsedValue, allowComments: js.UndefOr[scala.Nothing], _reportWarning: ReportWarning): js.Array[String] = js.native
  @JSImport("@stylable/core", "getFormatterArgs")
  @js.native
  def getFormatterArgs(
    node: ParsedValue,
    allowComments: js.UndefOr[scala.Nothing],
    _reportWarning: ReportWarning,
    perserveQuotes: Boolean
  ): js.Array[String] = js.native
  @JSImport("@stylable/core", "getFormatterArgs")
  @js.native
  def getFormatterArgs(node: ParsedValue, allowComments: Boolean): js.Array[String] = js.native
  @JSImport("@stylable/core", "getFormatterArgs")
  @js.native
  def getFormatterArgs(
    node: ParsedValue,
    allowComments: Boolean,
    _reportWarning: js.UndefOr[scala.Nothing],
    perserveQuotes: Boolean
  ): js.Array[String] = js.native
  @JSImport("@stylable/core", "getFormatterArgs")
  @js.native
  def getFormatterArgs(node: ParsedValue, allowComments: Boolean, _reportWarning: ReportWarning): js.Array[String] = js.native
  @JSImport("@stylable/core", "getFormatterArgs")
  @js.native
  def getFormatterArgs(node: ParsedValue, allowComments: Boolean, _reportWarning: ReportWarning, perserveQuotes: Boolean): js.Array[String] = js.native
  
  @JSImport("@stylable/core", "getNamedArgs")
  @js.native
  def getNamedArgs(node: ParsedValue): js.Array[js.Array[ParsedValue]] = js.native
  
  @JSImport("@stylable/core", "getOriginDefinition")
  @js.native
  def getOriginDefinition(resolved: js.Array[CSSResolve[ClassSymbol | ElementSymbol]]): CSSResolve[ClassSymbol | ElementSymbol] = js.native
  
  @JSImport("@stylable/core", "getSourcePath")
  @js.native
  def getSourcePath(root: Root_, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): String = js.native
  
  @JSImport("@stylable/core", "getStringValue")
  @js.native
  def getStringValue(nodes: js.Array[ParsedValue]): String = js.native
  @JSImport("@stylable/core", "getStringValue")
  @js.native
  def getStringValue(nodes: ParsedValue): String = js.native
  
  @JSImport("@stylable/core", "groupValues")
  @js.native
  def groupValues(nodes: js.Array[_]): js.Array[_] = js.native
  @JSImport("@stylable/core", "groupValues")
  @js.native
  def groupValues(nodes: js.Array[_], divType: String): js.Array[_] = js.native
  
  @JSImport("@stylable/core", "isAsset")
  @js.native
  def isAsset(url: String): Boolean = js.native
  
  @JSImport("@stylable/core", "isCSSVarProp")
  @js.native
  def isCSSVarProp(value: String): Boolean = js.native
  
  @JSImport("@stylable/core", "isChildOfAtRule")
  @js.native
  def isChildOfAtRule(rule: Container, atRuleName: String): Boolean = js.native
  
  @JSImport("@stylable/core", "isCompRoot")
  @js.native
  def isCompRoot(name: String): RegExpMatchArray | Null = js.native
  
  @JSImport("@stylable/core", "isCssNativeFunction")
  @js.native
  def isCssNativeFunction(name: String): /* is @stylable/core.@stylable/core/cjs/native-reserved-lists.nativeFunctions */ Boolean = js.native
  
  @JSImport("@stylable/core", "isCustomValue")
  @js.native
  def isCustomValue(symbol: js.Any): /* is @stylable/core.@stylable/core/cjs/custom-values.JSValueExtension<unknown> */ Boolean = js.native
  
  @JSImport("@stylable/core", "isExternal")
  @js.native
  def isExternal(url: String): Boolean = js.native
  
  @JSImport("@stylable/core", "isGlobal")
  @js.native
  def isGlobal(node: SelectorAstNode): Boolean = js.native
  
  @JSImport("@stylable/core", "isImport")
  @js.native
  def isImport(ast: SelectorAstNode): Boolean = js.native
  
  @JSImport("@stylable/core", "isInPath")
  @js.native
  def isInPath(
    extendPath: js.Array[CSSResolve[ClassSymbol | ElementSymbol]],
    hasSymbolMeta: CSSResolve[ClassSymbol | ElementSymbol]
  ): js.UndefOr[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
  
  @JSImport("@stylable/core", "isNodeMatch")
  @js.native
  def isNodeMatch(nodeA: PartialSelectorAstNode, nodeB: PartialSelectorAstNode): Boolean = js.native
  
  @JSImport("@stylable/core", "isRootValid")
  @js.native
  def isRootValid(ast: SelectorAstNode, rootName: String): Boolean = js.native
  
  @JSImport("@stylable/core", "isSimpleSelector")
  @js.native
  def isSimpleSelector(selectorAst: SelectorAstNode): Boolean | Unit = js.native
  
  @JSImport("@stylable/core", "isValidClassName")
  @js.native
  def isValidClassName(className: String): Boolean = js.native
  
  @JSImport("@stylable/core", "isValidDeclaration")
  @js.native
  def isValidDeclaration(decl: Declaration): Boolean = js.native
  
  @JSImport("@stylable/core", "listOptions")
  @js.native
  def listOptions(node: js.Any): js.Array[String] = js.native
  
  @JSImport("@stylable/core", "makeAbsolute")
  @js.native
  def makeAbsolute(resourcePath: String, rootContext: String, moduleContext: String): String = js.native
  
  @JSImport("@stylable/core", "matchAtKeyframes")
  @js.native
  def matchAtKeyframes(selector: String): RegExpMatchArray | Null = js.native
  
  @JSImport("@stylable/core", "matchAtMedia")
  @js.native
  def matchAtMedia(selector: String): RegExpMatchArray | Null = js.native
  
  @JSImport("@stylable/core", "matchSelectorTarget")
  @js.native
  def matchSelectorTarget(sourceSelector: String, targetSelector: String): Boolean = js.native
  
  @JSImport("@stylable/core", "mergeChunks")
  @js.native
  def mergeChunks(chunks: js.Array[js.Array[SelectorChunk2]]): js.Any = js.native
  
  @JSImport("@stylable/core", "mergeRules")
  @js.native
  def mergeRules(mixinAst: Root_, rule: Rule_): Rule_ = js.native
  
  @JSImport("@stylable/core", "mixinDeclRegExp")
  @js.native
  val mixinDeclRegExp: RegExp = js.native
  
  object mixinWarnings {
    
    @JSImport("@stylable/core", "mixinWarnings.CIRCULAR_MIXIN")
    @js.native
    def CIRCULAR_MIXIN(circularPaths: js.Array[String]): String = js.native
    
    @JSImport("@stylable/core", "mixinWarnings.FAILED_TO_APPLY_MIXIN")
    @js.native
    def FAILED_TO_APPLY_MIXIN(error: String): String = js.native
    
    @JSImport("@stylable/core", "mixinWarnings.JS_MIXIN_NOT_A_FUNC")
    @js.native
    def JS_MIXIN_NOT_A_FUNC(): String = js.native
    
    @JSImport("@stylable/core", "mixinWarnings.UNKNOWN_MIXIN_SYMBOL")
    @js.native
    def UNKNOWN_MIXIN_SYMBOL(name: String): String = js.native
  }
  
  object nativeFunctionsDic {
    
    @JSImport("@stylable/core", "nativeFunctionsDic")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@stylable/core", "nativeFunctionsDic.attr")
    @js.native
    def attr: Boolean = js.native
    @scala.inline
    def attr_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attr")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.blur")
    @js.native
    def blur: Boolean = js.native
    @scala.inline
    def blur_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blur")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.brightness")
    @js.native
    def brightness: Boolean = js.native
    @scala.inline
    def brightness_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brightness")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.calc")
    @js.native
    def calc: Boolean = js.native
    @scala.inline
    def calc_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calc")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.circle")
    @js.native
    def circle: Boolean = js.native
    @scala.inline
    def circle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("circle")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.constant")
    @js.native
    def constant: Boolean = js.native
    @scala.inline
    def constant_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constant")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.contrast")
    @js.native
    def contrast: Boolean = js.native
    @scala.inline
    def contrast_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contrast")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.counter")
    @js.native
    def counter: Boolean = js.native
    @scala.inline
    def counter_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("counter")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.counters")
    @js.native
    def counters: Boolean = js.native
    @scala.inline
    def counters_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("counters")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.cubic-bezier")
    @js.native
    def cubicBezier: Boolean = js.native
    
    @scala.inline
    def cubicBezier_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubic-bezier")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.drop-shadow")
    @js.native
    def dropShadow: Boolean = js.native
    
    @scala.inline
    def dropShadow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drop-shadow")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.ellipse")
    @js.native
    def ellipse: Boolean = js.native
    @scala.inline
    def ellipse_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipse")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.env")
    @js.native
    def env: Boolean = js.native
    @scala.inline
    def env_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("env")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.format")
    @js.native
    def format: Boolean = js.native
    @scala.inline
    def format_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.grayscale")
    @js.native
    def grayscale: Boolean = js.native
    @scala.inline
    def grayscale_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grayscale")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.hsl")
    @js.native
    def hsl: Boolean = js.native
    @scala.inline
    def hsl_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hsl")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.hsla")
    @js.native
    def hsla: Boolean = js.native
    @scala.inline
    def hsla_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hsla")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.hue-rotate")
    @js.native
    def hueRotate: Boolean = js.native
    
    @scala.inline
    def hueRotate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hue-rotate")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.hwb")
    @js.native
    def hwb: Boolean = js.native
    @scala.inline
    def hwb_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hwb")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.image")
    @js.native
    def image: Boolean = js.native
    @scala.inline
    def image_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.inset")
    @js.native
    def inset: Boolean = js.native
    @scala.inline
    def inset_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inset")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.invert")
    @js.native
    def invert: Boolean = js.native
    @scala.inline
    def invert_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invert")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.linear-gradient")
    @js.native
    def linearGradient: Boolean = js.native
    
    @scala.inline
    def linearGradient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linear-gradient")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.local")
    @js.native
    def local: Boolean = js.native
    @scala.inline
    def local_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("local")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.matrix")
    @js.native
    def matrix: Boolean = js.native
    
    @JSImport("@stylable/core", "nativeFunctionsDic.matrix3d")
    @js.native
    def matrix3d: Boolean = js.native
    @scala.inline
    def matrix3d_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrix3d")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def matrix_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrix")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.minmax")
    @js.native
    def minmax: Boolean = js.native
    @scala.inline
    def minmax_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minmax")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.opacity")
    @js.native
    def opacity: Boolean = js.native
    @scala.inline
    def opacity_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.paint")
    @js.native
    def paint: Boolean = js.native
    @scala.inline
    def paint_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paint")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.path")
    @js.native
    def path: Boolean = js.native
    @scala.inline
    def path_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.perspective")
    @js.native
    def perspective: Boolean = js.native
    @scala.inline
    def perspective_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("perspective")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.polygon")
    @js.native
    def polygon: Boolean = js.native
    @scala.inline
    def polygon_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polygon")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.radial-gradient")
    @js.native
    def radialGradient: Boolean = js.native
    
    @scala.inline
    def radialGradient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radial-gradient")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rect")
    @js.native
    def rect: Boolean = js.native
    @scala.inline
    def rect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rect")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.repeat")
    @js.native
    def repeat: Boolean = js.native
    @scala.inline
    def repeat_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("repeat")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.repeating-linear-gradient")
    @js.native
    def repeatingLinearGradient: Boolean = js.native
    
    @scala.inline
    def repeatingLinearGradient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("repeating-linear-gradient")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.repeating-radial-gradient")
    @js.native
    def repeatingRadialGradient: Boolean = js.native
    
    @scala.inline
    def repeatingRadialGradient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("repeating-radial-gradient")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rgb")
    @js.native
    def rgb: Boolean = js.native
    @scala.inline
    def rgb_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rgb")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rgba")
    @js.native
    def rgba: Boolean = js.native
    @scala.inline
    def rgba_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rgba")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rotate")
    @js.native
    def rotate: Boolean = js.native
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rotate3d")
    @js.native
    def rotate3d: Boolean = js.native
    @scala.inline
    def rotate3d_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotate3d")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rotateX")
    @js.native
    def rotateX: Boolean = js.native
    @scala.inline
    def rotateX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotateX")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rotateY")
    @js.native
    def rotateY: Boolean = js.native
    @scala.inline
    def rotateY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotateY")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rotateZ")
    @js.native
    def rotateZ: Boolean = js.native
    @scala.inline
    def rotateZ_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotateZ")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rotate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotate")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.saturate")
    @js.native
    def saturate: Boolean = js.native
    @scala.inline
    def saturate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("saturate")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.scale")
    @js.native
    def scale: Boolean = js.native
    
    @JSImport("@stylable/core", "nativeFunctionsDic.scale3d")
    @js.native
    def scale3d: Boolean = js.native
    @scala.inline
    def scale3d_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scale3d")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.scaleX")
    @js.native
    def scaleX: Boolean = js.native
    @scala.inline
    def scaleX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.scaleY")
    @js.native
    def scaleY: Boolean = js.native
    @scala.inline
    def scaleY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.scaleZ")
    @js.native
    def scaleZ: Boolean = js.native
    @scala.inline
    def scaleZ_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scaleZ")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def scale_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scale")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.sepia")
    @js.native
    def sepia: Boolean = js.native
    @scala.inline
    def sepia_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sepia")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.skew")
    @js.native
    def skew: Boolean = js.native
    
    @JSImport("@stylable/core", "nativeFunctionsDic.skewX")
    @js.native
    def skewX: Boolean = js.native
    @scala.inline
    def skewX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skewX")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.skewY")
    @js.native
    def skewY: Boolean = js.native
    @scala.inline
    def skewY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skewY")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def skew_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skew")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.symbols")
    @js.native
    def symbols: Boolean = js.native
    @scala.inline
    def symbols_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbols")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.translate")
    @js.native
    def translate: Boolean = js.native
    
    @JSImport("@stylable/core", "nativeFunctionsDic.translate3d")
    @js.native
    def translate3d: Boolean = js.native
    @scala.inline
    def translate3d_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translate3d")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.translateX")
    @js.native
    def translateX: Boolean = js.native
    @scala.inline
    def translateX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translateX")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.translateY")
    @js.native
    def translateY: Boolean = js.native
    @scala.inline
    def translateY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translateY")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.translateZ")
    @js.native
    def translateZ: Boolean = js.native
    @scala.inline
    def translateZ_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translateZ")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def translate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translate")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.url")
    @js.native
    def url: Boolean = js.native
    @scala.inline
    def url_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("url")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.var")
    @js.native
    val `var`: Boolean = js.native
  }
  
  @JSImport("@stylable/core", "nativePseudoClasses")
  @js.native
  val nativePseudoClasses: js.Array[String] = js.native
  
  @JSImport("@stylable/core", "nativePseudoElements")
  @js.native
  val nativePseudoElements: js.Array[String] = js.native
  
  @JSImport("@stylable/core", "noCollisionNamespace")
  @js.native
  def noCollisionNamespace(): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  @JSImport("@stylable/core", "noCollisionNamespace")
  @js.native
  def noCollisionNamespace(hasPrefixUsed: Prefix): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  
  @JSImport("@stylable/core", "packageNamespaceFactory")
  @js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  @JSImport("@stylable/core", "packageNamespaceFactory")
  @js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: js.UndefOr[scala.Nothing],
    prefix: js.UndefOr[scala.Nothing],
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  @JSImport("@stylable/core", "packageNamespaceFactory")
  @js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: js.UndefOr[scala.Nothing],
    prefix: String
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  @JSImport("@stylable/core", "packageNamespaceFactory")
  @js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: js.UndefOr[scala.Nothing],
    prefix: String,
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  @JSImport("@stylable/core", "packageNamespaceFactory")
  @js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  @JSImport("@stylable/core", "packageNamespaceFactory")
  @js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String,
    prefix: js.UndefOr[scala.Nothing],
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  @JSImport("@stylable/core", "packageNamespaceFactory")
  @js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String,
    prefix: String
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  @JSImport("@stylable/core", "packageNamespaceFactory")
  @js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String,
    prefix: String,
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  
  @JSImport("@stylable/core", "parseSelector")
  @js.native
  def parseSelector(selector: String): SelectorAstNode = js.native
  
  @JSImport("@stylable/core", "process")
  @js.native
  def process(root: Root_): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
  @JSImport("@stylable/core", "process")
  @js.native
  def process(
    root: Root_,
    diagnostics: js.UndefOr[scala.Nothing],
    resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
  ): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
  @JSImport("@stylable/core", "process")
  @js.native
  def process(root: Root_, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
  @JSImport("@stylable/core", "process")
  @js.native
  def process(
    root: Root_,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
  ): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
  
  @JSImport("@stylable/core", "processDeclarationUrls")
  @js.native
  def processDeclarationUrls(decl: Declaration, onUrl: OnUrlCallback, transform: Boolean): Unit = js.native
  
  @JSImport("@stylable/core", "processDeclarationValue")
  @js.native
  def processDeclarationValue(
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    value: String,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    node: js.UndefOr[Node],
    variableOverride: js.UndefOr[(Record[String, String]) | Null],
    valueHook: js.UndefOr[replaceValueHook],
    diagnostics: js.UndefOr[typings.stylableCore.diagnosticsMod.Diagnostics],
    passedThrough: js.UndefOr[js.Array[String]],
    cssVarsMapping: js.UndefOr[Record[String, String]],
    args: js.UndefOr[js.Array[String]]
  ): OutputValue = js.native
  
  @JSImport("@stylable/core", "processNamespace")
  @js.native
  def processNamespace(namespace: String, source: String): String = js.native
  
  object processorWarnings {
    
    @JSImport("@stylable/core", "processorWarnings.CANNOT_EXTEND_IN_COMPLEX")
    @js.native
    def CANNOT_EXTEND_IN_COMPLEX(): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.CANNOT_RESOLVE_EXTEND")
    @js.native
    def CANNOT_RESOLVE_EXTEND(name: String): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.DEFAULT_IMPORT_IS_LOWER_CASE")
    @js.native
    def DEFAULT_IMPORT_IS_LOWER_CASE(): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.EMPTY_IMPORT_FROM")
    @js.native
    def EMPTY_IMPORT_FROM(): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.EMPTY_NAMESPACE_DEF")
    @js.native
    def EMPTY_NAMESPACE_DEF(): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.FORBIDDEN_DEF_IN_COMPLEX_SELECTOR")
    @js.native
    def FORBIDDEN_DEF_IN_COMPLEX_SELECTOR(name: String): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.FROM_PROP_MISSING_IN_IMPORT")
    @js.native
    def FROM_PROP_MISSING_IN_IMPORT(): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.GLOBAL_CSS_VAR_MISSING_COMMA")
    @js.native
    def GLOBAL_CSS_VAR_MISSING_COMMA(name: String): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.ILLEGAL_CSS_VAR_ARGS")
    @js.native
    def ILLEGAL_CSS_VAR_ARGS(name: String): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.ILLEGAL_CSS_VAR_USE")
    @js.native
    def ILLEGAL_CSS_VAR_USE(name: String): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.ILLEGAL_GLOBAL_CSS_VAR")
    @js.native
    def ILLEGAL_GLOBAL_CSS_VAR(name: String): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.ILLEGAL_PROP_IN_IMPORT")
    @js.native
    def ILLEGAL_PROP_IN_IMPORT(propName: String): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.INVALID_NAMESPACE_DEF")
    @js.native
    def INVALID_NAMESPACE_DEF(): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.MISSING_SCOPING_PARAM")
    @js.native
    def MISSING_SCOPING_PARAM(): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.MULTIPLE_FROM_IN_IMPORT")
    @js.native
    def MULTIPLE_FROM_IN_IMPORT(): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.NO_IMPORT_IN_ST_SCOPE")
    @js.native
    def NO_IMPORT_IN_ST_SCOPE(): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.NO_KEYFRAMES_IN_ST_SCOPE")
    @js.native
    def NO_KEYFRAMES_IN_ST_SCOPE(): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.NO_VARS_DEF_IN_ST_SCOPE")
    @js.native
    def NO_VARS_DEF_IN_ST_SCOPE(): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.OVERRIDE_MIXIN")
    @js.native
    def OVERRIDE_MIXIN(mixinType: String): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.OVERRIDE_TYPED_RULE")
    @js.native
    def OVERRIDE_TYPED_RULE(key: String, name: String): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.PARTIAL_MIXIN_MISSING_ARGUMENTS")
    @js.native
    def PARTIAL_MIXIN_MISSING_ARGUMENTS(`type`: String): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.REDECLARE_SYMBOL")
    @js.native
    def REDECLARE_SYMBOL(name: String): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.REDECLARE_SYMBOL_KEYFRAMES")
    @js.native
    def REDECLARE_SYMBOL_KEYFRAMES(name: String): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.ROOT_AFTER_SPACING")
    @js.native
    def ROOT_AFTER_SPACING(): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.STATE_DEFINITION_IN_COMPLEX")
    @js.native
    def STATE_DEFINITION_IN_COMPLEX(): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.STATE_DEFINITION_IN_ELEMENT")
    @js.native
    def STATE_DEFINITION_IN_ELEMENT(): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.UNKNOWN_MIXIN")
    @js.native
    def UNKNOWN_MIXIN(name: String): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.UNSCOPED_CLASS")
    @js.native
    def UNSCOPED_CLASS(name: String): String = js.native
    
    @JSImport("@stylable/core", "processorWarnings.UNSCOPED_ELEMENT")
    @js.native
    def UNSCOPED_ELEMENT(name: String): String = js.native
  }
  
  object pseudoStates {
    
    @JSImport("@stylable/core", "pseudoStates.booleanStateDelimiter")
    @js.native
    val booleanStateDelimiter: /* "--" */ String = js.native
    
    @JSImport("@stylable/core", "pseudoStates.createAttributeState")
    @js.native
    def createAttributeState(stateName: String, namespace: String, param: String): String = js.native
    
    @JSImport("@stylable/core", "pseudoStates.createBooleanStateClassName")
    @js.native
    def createBooleanStateClassName(stateName: String, namespace: String): String = js.native
    
    @JSImport("@stylable/core", "pseudoStates.createStateWithParamClassName")
    @js.native
    def createStateWithParamClassName(stateName: String, namespace: String, param: String): String = js.native
    
    @JSImport("@stylable/core", "pseudoStates.processPseudoStates")
    @js.native
    def processPseudoStates(value: String, decl: Declaration, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): MappedStates = js.native
    
    @JSImport("@stylable/core", "pseudoStates.resolveStateParam")
    @js.native
    def resolveStateParam(param: String): String = js.native
    
    @JSImport("@stylable/core", "pseudoStates.setStateToNode")
    @js.native
    def setStateToNode(
      states: MappedStates,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      name: String,
      node: SelectorAstNode,
      namespace: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): Unit = js.native
    @JSImport("@stylable/core", "pseudoStates.setStateToNode")
    @js.native
    def setStateToNode(
      states: MappedStates,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      name: String,
      node: SelectorAstNode,
      namespace: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_
    ): Unit = js.native
    
    object stateErrors {
      
      @JSImport("@stylable/core", "pseudoStates.stateErrors.NO_STATE_TYPE_GIVEN")
      @js.native
      def NO_STATE_TYPE_GIVEN(name: String): String = js.native
      
      @JSImport("@stylable/core", "pseudoStates.stateErrors.STATE_STARTS_WITH_HYPHEN")
      @js.native
      def STATE_STARTS_WITH_HYPHEN(name: String): String = js.native
      
      @JSImport("@stylable/core", "pseudoStates.stateErrors.TOO_MANY_ARGS_IN_VALIDATOR")
      @js.native
      def TOO_MANY_ARGS_IN_VALIDATOR(name: String, validator: String, args: js.Array[String]): String = js.native
      
      @JSImport("@stylable/core", "pseudoStates.stateErrors.TOO_MANY_STATE_TYPES")
      @js.native
      def TOO_MANY_STATE_TYPES(name: String, types: js.Array[String]): String = js.native
      
      @JSImport("@stylable/core", "pseudoStates.stateErrors.UNKNOWN_STATE_TYPE")
      @js.native
      def UNKNOWN_STATE_TYPE(name: String, `type`: String): String = js.native
      
      @JSImport("@stylable/core", "pseudoStates.stateErrors.UNKNOWN_STATE_USAGE")
      @js.native
      def UNKNOWN_STATE_USAGE(name: String): String = js.native
    }
    
    @JSImport("@stylable/core", "pseudoStates.stateMiddleDelimiter")
    @js.native
    val stateMiddleDelimiter: /* "-" */ String = js.native
    
    @JSImport("@stylable/core", "pseudoStates.stateWithParamDelimiter")
    @js.native
    val stateWithParamDelimiter: String = js.native
    
    @JSImport("@stylable/core", "pseudoStates.transformPseudoStateSelector")
    @js.native
    def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: Null,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ClassSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
    @JSImport("@stylable/core", "pseudoStates.transformPseudoStateSelector")
    @js.native
    def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: Null,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ClassSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
    @JSImport("@stylable/core", "pseudoStates.transformPseudoStateSelector")
    @js.native
    def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: Null,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ElementSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
    @JSImport("@stylable/core", "pseudoStates.transformPseudoStateSelector")
    @js.native
    def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: Null,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ElementSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
    @JSImport("@stylable/core", "pseudoStates.transformPseudoStateSelector")
    @js.native
    def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: StylableSymbol,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ClassSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
    @JSImport("@stylable/core", "pseudoStates.transformPseudoStateSelector")
    @js.native
    def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: StylableSymbol,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ClassSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
    @JSImport("@stylable/core", "pseudoStates.transformPseudoStateSelector")
    @js.native
    def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: StylableSymbol,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ElementSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
    @JSImport("@stylable/core", "pseudoStates.transformPseudoStateSelector")
    @js.native
    def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: StylableSymbol,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ElementSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
    
    @JSImport("@stylable/core", "pseudoStates.validateStateArgument")
    @js.native
    def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): StateResult = js.native
    @JSImport("@stylable/core", "pseudoStates.validateStateArgument")
    @js.native
    def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: js.UndefOr[scala.Nothing],
      validateDefinition: js.UndefOr[scala.Nothing],
      validateValue: Boolean
    ): StateResult = js.native
    @JSImport("@stylable/core", "pseudoStates.validateStateArgument")
    @js.native
    def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: js.UndefOr[scala.Nothing],
      validateDefinition: Boolean
    ): StateResult = js.native
    @JSImport("@stylable/core", "pseudoStates.validateStateArgument")
    @js.native
    def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: js.UndefOr[scala.Nothing],
      validateDefinition: Boolean,
      validateValue: Boolean
    ): StateResult = js.native
    @JSImport("@stylable/core", "pseudoStates.validateStateArgument")
    @js.native
    def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_
    ): StateResult = js.native
    @JSImport("@stylable/core", "pseudoStates.validateStateArgument")
    @js.native
    def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_,
      validateDefinition: js.UndefOr[scala.Nothing],
      validateValue: Boolean
    ): StateResult = js.native
    @JSImport("@stylable/core", "pseudoStates.validateStateArgument")
    @js.native
    def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_,
      validateDefinition: Boolean
    ): StateResult = js.native
    @JSImport("@stylable/core", "pseudoStates.validateStateArgument")
    @js.native
    def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_,
      validateDefinition: Boolean,
      validateValue: Boolean
    ): StateResult = js.native
    
    @JSImport("@stylable/core", "pseudoStates.validateStateDefinition")
    @js.native
    def validateStateDefinition(
      decl: Declaration,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): Unit = js.native
  }
  
  @JSImport("@stylable/core", "removeSTDirective")
  @js.native
  def removeSTDirective(root: Root_): Unit = js.native
  
  @JSImport("@stylable/core", "removeUnusedRules")
  @js.native
  def removeUnusedRules(
    ast: Root_,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    _import: Imported,
    usedFiles: js.Array[String],
    resolvePath: js.Function2[/* ctx */ String, /* path */ String, String]
  ): Unit = js.native
  
  @JSImport("@stylable/core", "reservedKeyFrames")
  @js.native
  val reservedKeyFrames: js.Array[String] = js.native
  
  @JSImport("@stylable/core", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node
  ): Record[String, String] = js.native
  @JSImport("@stylable/core", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node,
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.UndefOr[scala.Nothing],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = js.native
  @JSImport("@stylable/core", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node,
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.Array[String]
  ): Record[String, String] = js.native
  @JSImport("@stylable/core", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node,
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.Array[String],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = js.native
  @JSImport("@stylable/core", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node,
    variableOverride: Record[String, String]
  ): Record[String, String] = js.native
  @JSImport("@stylable/core", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: js.UndefOr[scala.Nothing],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = js.native
  @JSImport("@stylable/core", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: js.Array[String]
  ): Record[String, String] = js.native
  @JSImport("@stylable/core", "resolveArgumentsValue")
  @js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: js.Array[String],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = js.native
  
  @JSImport("@stylable/core", "resolveCustomValues")
  @js.native
  def resolveCustomValues(
    meta: typings.stylableCore.stylableMetaMod.StylableMeta,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver
  ): StringDictionary[CustomValueExtension[_]] = js.native
  
  object resolverWarnings {
    
    @JSImport("@stylable/core", "resolverWarnings.UNKNOWN_IMPORTED_FILE")
    @js.native
    def UNKNOWN_IMPORTED_FILE(path: String): String = js.native
    
    @JSImport("@stylable/core", "resolverWarnings.UNKNOWN_IMPORTED_SYMBOL")
    @js.native
    def UNKNOWN_IMPORTED_SYMBOL(name: String, path: String): String = js.native
  }
  
  object rootValueMapping {
    
    @JSImport("@stylable/core", "rootValueMapping")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@stylable/core", "rootValueMapping.namespace")
    @js.native
    def namespace: typings.stylableCore.stylableCoreStrings.namespace = js.native
    @scala.inline
    def namespace_=(x: namespace): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("namespace")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "rootValueMapping.stScope")
    @js.native
    def stScope: `st-scope` = js.native
    @scala.inline
    def stScope_=(x: `st-scope`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stScope")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "rootValueMapping.vars")
    @js.native
    def vars: Colonvars = js.native
    @scala.inline
    def vars_=(x: Colonvars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vars")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "rootValueMapping.import")
    @js.native
    val `import`: Colonimport = js.native
  }
  
  @JSImport("@stylable/core", "safeParse")
  @js.native
  def safeParse(css: String): Root_ = js.native
  @JSImport("@stylable/core", "safeParse")
  @js.native
  def safeParse(css: String, options: ProcessOptions): Root_ = js.native
  
  @JSImport("@stylable/core", "scopeCSSVar")
  @js.native
  def scopeCSSVar(
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    symbolName: String
  ): String = js.native
  
  @JSImport("@stylable/core", "scopeSelector")
  @js.native
  def scopeSelector(scopeSelectorRule: String, targetSelectorRule: String): Selector = js.native
  @JSImport("@stylable/core", "scopeSelector")
  @js.native
  def scopeSelector(scopeSelectorRule: String, targetSelectorRule: String, rootScopeLevel: Boolean): Selector = js.native
  
  @JSImport("@stylable/core", "separateChunks")
  @js.native
  def separateChunks(selectorNode: SelectorAstNode): js.Array[js.Array[SelectorChunk]] = js.native
  
  @JSImport("@stylable/core", "separateChunks2")
  @js.native
  def separateChunks2(selectorNode: SelectorAstNode): js.Array[js.Array[SelectorChunk2]] = js.native
  
  @JSImport("@stylable/core", "stTypes")
  @js.native
  val stTypes: CustomTypes = js.native
  
  @JSImport("@stylable/core", "stValues")
  @js.native
  val stValues: js.Array[String] = js.native
  
  @JSImport("@stylable/core", "stValuesMap")
  @js.native
  val stValuesMap: Record[String, Boolean] = js.native
  
  object strategies {
    
    @JSImport("@stylable/core", "strategies.args")
    @js.native
    def args(node: js.Any): js.Array[Value] = js.native
    @JSImport("@stylable/core", "strategies.args")
    @js.native
    def args(node: js.Any, reportWarning: ReportWarning): js.Array[Value] = js.native
    
    @JSImport("@stylable/core", "strategies.named")
    @js.native
    def named(node: js.Any): Record[String, String] = js.native
    @JSImport("@stylable/core", "strategies.named")
    @js.native
    def named(node: js.Any, reportWarning: ReportWarning): Record[String, String] = js.native
  }
  
  @JSImport("@stylable/core", "stringifySelector")
  @js.native
  def stringifySelector(ast: SelectorAstNode): String = js.native
  
  @JSImport("@stylable/core", "systemValidators")
  @js.native
  val systemValidators: Record[String, StateParamType] = js.native
  
  @JSImport("@stylable/core", "transformMatchesOnRule")
  @js.native
  def transformMatchesOnRule(rule: Rule_, lineBreak: Boolean): String = js.native
  
  object transformerWarnings {
    
    @JSImport("@stylable/core", "transformerWarnings.CANNOT_EXTEND_JS")
    @js.native
    def CANNOT_EXTEND_JS(): String = js.native
    
    @JSImport("@stylable/core", "transformerWarnings.CANNOT_EXTEND_UNKNOWN_SYMBOL")
    @js.native
    def CANNOT_EXTEND_UNKNOWN_SYMBOL(name: String): String = js.native
    
    @JSImport("@stylable/core", "transformerWarnings.IMPORT_ISNT_EXTENDABLE")
    @js.native
    def IMPORT_ISNT_EXTENDABLE(): String = js.native
    
    @JSImport("@stylable/core", "transformerWarnings.KEYFRAME_NAME_RESERVED")
    @js.native
    def KEYFRAME_NAME_RESERVED(name: String): String = js.native
    
    @JSImport("@stylable/core", "transformerWarnings.UNKNOWN_IMPORT_ALIAS")
    @js.native
    def UNKNOWN_IMPORT_ALIAS(name: String): String = js.native
    
    @JSImport("@stylable/core", "transformerWarnings.UNKNOWN_PSEUDO_ELEMENT")
    @js.native
    def UNKNOWN_PSEUDO_ELEMENT(name: String): String = js.native
  }
  
  @JSImport("@stylable/core", "traverseNode")
  @js.native
  def traverseNode(node: SelectorAstNode, visitor: Visitor): Boolean | Unit = js.native
  @JSImport("@stylable/core", "traverseNode")
  @js.native
  def traverseNode(
    node: SelectorAstNode,
    visitor: Visitor,
    index: js.UndefOr[scala.Nothing],
    nodes: js.Array[SelectorAstNode]
  ): Boolean | Unit = js.native
  @JSImport("@stylable/core", "traverseNode")
  @js.native
  def traverseNode(node: SelectorAstNode, visitor: Visitor, index: Double): Boolean | Unit = js.native
  @JSImport("@stylable/core", "traverseNode")
  @js.native
  def traverseNode(node: SelectorAstNode, visitor: Visitor, index: Double, nodes: js.Array[SelectorAstNode]): Boolean | Unit = js.native
  
  @JSImport("@stylable/core", "unbox")
  @js.native
  def unbox[B /* <: Box_[String, _] */](boxed: B): js.Any = js.native
  @JSImport("@stylable/core", "unbox")
  @js.native
  def unbox[B /* <: Box_[String, _] */](boxed: String): js.Any = js.native
  
  @JSImport("@stylable/core", "validateAllowedNodesUntil")
  @js.native
  def validateAllowedNodesUntil(node: ParsedValue, i: Double): Boolean = js.native
  @JSImport("@stylable/core", "validateAllowedNodesUntil")
  @js.native
  def validateAllowedNodesUntil(node: ParsedValue, i: Double, untilType: js.UndefOr[scala.Nothing], allowed: js.Array[String]): Boolean = js.native
  @JSImport("@stylable/core", "validateAllowedNodesUntil")
  @js.native
  def validateAllowedNodesUntil(node: ParsedValue, i: Double, untilType: String): Boolean = js.native
  @JSImport("@stylable/core", "validateAllowedNodesUntil")
  @js.native
  def validateAllowedNodesUntil(node: ParsedValue, i: Double, untilType: String, allowed: js.Array[String]): Boolean = js.native
  
  @JSImport("@stylable/core", "validateScopingSelector")
  @js.native
  def validateScopingSelector(atRule: AtRule_, hasSelector: SRule, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): Unit = js.native
  
  object valueMapping {
    
    @JSImport("@stylable/core", "valueMapping")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@stylable/core", "valueMapping.default")
    @js.native
    def default: `-st-default` = js.native
    @scala.inline
    def default_=(x: `-st-default`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.from")
    @js.native
    def from: `-st-from` = js.native
    @scala.inline
    def from_=(x: `-st-from`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("from")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.global")
    @js.native
    def global: `-st-global` = js.native
    @scala.inline
    def global_=(x: `-st-global`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("global")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.mixin")
    @js.native
    def mixin: `-st-mixin` = js.native
    @scala.inline
    def mixin_=(x: `-st-mixin`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mixin")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.named")
    @js.native
    def named: `-st-named` = js.native
    @scala.inline
    def named_=(x: `-st-named`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("named")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.partialMixin")
    @js.native
    def partialMixin: `-st-partial-mixin` = js.native
    @scala.inline
    def partialMixin_=(x: `-st-partial-mixin`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("partialMixin")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.root")
    @js.native
    def root: `-st-root` = js.native
    @scala.inline
    def root_=(x: `-st-root`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.states")
    @js.native
    def states: `-st-states` = js.native
    @scala.inline
    def states_=(x: `-st-states`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("states")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.extends")
    @js.native
    val `extends`: `-st-extends` = js.native
  }
  
  object valueParserWarnings {
    
    @JSImport("@stylable/core", "valueParserWarnings.CSS_MIXIN_FORCE_NAMED_PARAMS")
    @js.native
    def CSS_MIXIN_FORCE_NAMED_PARAMS(): String = js.native
    
    @JSImport("@stylable/core", "valueParserWarnings.INVALID_NAMED_IMPORT_AS")
    @js.native
    def INVALID_NAMED_IMPORT_AS(name: String): String = js.native
    
    @JSImport("@stylable/core", "valueParserWarnings.INVALID_NESTED_KEYFRAMES")
    @js.native
    def INVALID_NESTED_KEYFRAMES(name: String): String = js.native
    
    @JSImport("@stylable/core", "valueParserWarnings.VALUE_CANNOT_BE_STRING")
    @js.native
    def VALUE_CANNOT_BE_STRING(): String = js.native
  }
}
