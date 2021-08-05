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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stylable/core", "CUSTOM_SELECTOR_RE")
  @js.native
  val CUSTOM_SELECTOR_RE: RegExp = js.native
  
  object CustomValueStrategy {
    
    @JSImport("@stylable/core", "CustomValueStrategy")
    @js.native
    val ^ : js.Any = js.native
    
    inline def args(fnNode: ParsedValue, customTypes: CustomTypes): js.Array[String | (Box_[String, js.Any])] = (^.asInstanceOf[js.Dynamic].applyDynamic("args")(fnNode.asInstanceOf[js.Any], customTypes.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | (Box_[String, js.Any])]]
    
    inline def named(fnNode: ParsedValue, customTypes: CustomTypes): BoxedValueMap = (^.asInstanceOf[js.Dynamic].applyDynamic("named")(fnNode.asInstanceOf[js.Any], customTypes.asInstanceOf[js.Any])).asInstanceOf[BoxedValueMap]
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
    
    @JSImport("@stylable/core", "SBTypesParsers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def stExtends(value: String): Ast = ^.asInstanceOf[js.Dynamic].applyDynamic("-st-extends")(value.asInstanceOf[js.Any]).asInstanceOf[Ast]
    
    inline def stGlobal(decl: Declaration, _diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("-st-global")(decl.asInstanceOf[js.Any], _diagnostics.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def stMixin(mixinNode: Declaration, strategy: js.Function1[/* type */ String, named | args]): js.Array[MixinValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("-st-mixin")(mixinNode.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[js.Array[MixinValue]]
    inline def stMixin(
      mixinNode: Declaration,
      strategy: js.Function1[/* type */ String, named | args],
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): js.Array[MixinValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("-st-mixin")(mixinNode.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[js.Array[MixinValue]]
    
    inline def stNamed(value: String, node: Declaration, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): KeyframesMap = (^.asInstanceOf[js.Dynamic].applyDynamic("-st-named")(value.asInstanceOf[js.Any], node.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[KeyframesMap]
    
    inline def stPartialMixin(mixinNode: Declaration, strategy: js.Function1[/* type */ String, named | args]): js.Array[MixinValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("-st-partial-mixin")(mixinNode.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[js.Array[MixinValue]]
    inline def stPartialMixin(
      mixinNode: Declaration,
      strategy: js.Function1[/* type */ String, named | args],
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): js.Array[MixinValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("-st-partial-mixin")(mixinNode.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[js.Array[MixinValue]]
    
    inline def stRoot(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("-st-root")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def stStates(value: String, decl: Declaration, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): MappedStates = (^.asInstanceOf[js.Dynamic].applyDynamic("-st-states")(value.asInstanceOf[js.Any], decl.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[MappedStates]
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
      requireModule: js.Function1[/* path */ String, js.Any],
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
    
    @JSImport("@stylable/core", "Stylable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(config: StylableConfig): typings.stylableCore.stylableMod.Stylable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[typings.stylableCore.stylableMod.Stylable]
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
      diagnostics: Unit,
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
      requireModule: js.Function1[/* modulePath */ String, js.Any]
    ) = this()
  }
  
  @JSImport("@stylable/core", "StylableTransformer")
  @js.native
  class StylableTransformer protected ()
    extends typings.stylableCore.stylableTransformerMod.StylableTransformer {
    def this(options: TransformerOptions) = this()
  }
  
  inline def appendMixin(
    mix: RefedMixin,
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    rule: SRule,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendMixin")(mix.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendMixin(
    mix: RefedMixin,
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    rule: SRule,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String],
    path: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendMixin")(mix.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def appendMixins(
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    rule: SRule,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendMixins")(transformer.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendMixins(
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    rule: SRule,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String],
    path: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendMixins")(transformer.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def assureRelativeUrlPrefix(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("assureRelativeUrlPrefix")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def box[Type /* <: String */, Value /* <: js.Any */](`type`: Type, value: Value): Box_[Type, Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Box_[Type, Value]]
  
  inline def cachedProcessFile[T](
    processor: processFn[T],
    fs: MinimalFS,
    resolvePath: js.Function2[/* path */ String, /* context */ js.UndefOr[String], String]
  ): FileProcessor[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cachedProcessFile")(processor.asInstanceOf[js.Any], fs.asInstanceOf[js.Any], resolvePath.asInstanceOf[js.Any])).asInstanceOf[FileProcessor[T]]
  
  inline def collectAssets(ast: Root_): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectAssets")(ast.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def createChecker(types: js.Array[String | js.Array[String]]): js.Function0[js.Function1[/* node */ SelectorAstNode, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createChecker")(types.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Function1[/* node */ SelectorAstNode, Boolean]]]
  
  inline def createCustomValue[Value, Args](hasProcessArgsCreateValueFlattenValueGetValue: ExtensionApi[Value, Args]): JSValueExtension[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCustomValue")(hasProcessArgsCreateValueFlattenValueGetValue.asInstanceOf[js.Any]).asInstanceOf[JSValueExtension[Value]]
  
  inline def createDefaultResolver(fileSystem: MinimalFS, resolveOptions: js.Any): ModuleResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultResolver")(fileSystem.asInstanceOf[js.Any], resolveOptions.asInstanceOf[js.Any])).asInstanceOf[ModuleResolver]
  
  inline def createEmptyMeta(root: Root_, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): typings.stylableCore.stylableMetaMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyMeta")(root.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableMetaMod.StylableMeta]
  
  inline def createInfrastructure(
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
  ): StylableInfrastructure = (^.asInstanceOf[js.Dynamic].applyDynamic("createInfrastructure")(projectRoot.asInstanceOf[js.Any], fileSystem.asInstanceOf[js.Any], onProcess.asInstanceOf[js.Any], resolveOptions.asInstanceOf[js.Any], resolveNamespace.asInstanceOf[js.Any], timedCacheOptions.asInstanceOf[js.Any], resolveModule.asInstanceOf[js.Any], cssParser.asInstanceOf[js.Any], createDiagnostics.asInstanceOf[js.Any])).asInstanceOf[StylableInfrastructure]
  
  inline def createMinimalFS(hasFilesTrimWS: MinimalFSSetup): Fs = ^.asInstanceOf[js.Dynamic].applyDynamic("createMinimalFS")(hasFilesTrimWS.asInstanceOf[js.Any]).asInstanceOf[Fs]
  
  inline def createSimpleSelectorChecker(): js.Function1[/* node */ SelectorAstNode, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleSelectorChecker")().asInstanceOf[js.Function1[/* node */ SelectorAstNode, Boolean]]
  
  inline def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any], mixinTarget.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: T, isRoot: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any], mixinTarget.asInstanceOf[js.Any], isRoot.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: Unit, isRoot: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any], mixinTarget.asInstanceOf[js.Any], isRoot.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any], mixinTarget.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: T, isRoot: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any], mixinTarget.asInstanceOf[js.Any], isRoot.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: Unit, isRoot: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any], mixinTarget.asInstanceOf[js.Any], isRoot.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def createWarningRule(
    extendedNode: String,
    scopedExtendedNode: String,
    extendedFile: String,
    extendingNode: String,
    scopedExtendingNode: String,
    extendingFile: String
  ): Rule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createWarningRule")(extendedNode.asInstanceOf[js.Any], scopedExtendedNode.asInstanceOf[js.Any], extendedFile.asInstanceOf[js.Any], extendingNode.asInstanceOf[js.Any], scopedExtendingNode.asInstanceOf[js.Any], extendingFile.asInstanceOf[js.Any])).asInstanceOf[Rule_]
  inline def createWarningRule(
    extendedNode: String,
    scopedExtendedNode: String,
    extendedFile: String,
    extendingNode: String,
    scopedExtendingNode: String,
    extendingFile: String,
    useScoped: Boolean
  ): Rule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createWarningRule")(extendedNode.asInstanceOf[js.Any], scopedExtendedNode.asInstanceOf[js.Any], extendedFile.asInstanceOf[js.Any], extendingNode.asInstanceOf[js.Any], scopedExtendingNode.asInstanceOf[js.Any], extendingFile.asInstanceOf[js.Any], useScoped.asInstanceOf[js.Any])).asInstanceOf[Rule_]
  
  inline def evalDeclarationValue(
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
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("evalDeclarationValue")(resolver.asInstanceOf[js.Any], value.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], valueHook.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], passedThrough.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def expandCustomSelectors(rule: Rule_, customSelectors: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expandCustomSelectors")(rule.asInstanceOf[js.Any], customSelectors.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def expandCustomSelectors(
    rule: Rule_,
    customSelectors: Record[String, String],
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expandCustomSelectors")(rule.asInstanceOf[js.Any], customSelectors.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def filterChunkNodesByType(chunk: SelectorChunk, typeOptions: js.Array[String]): js.Array[PartialSelectorAstNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterChunkNodesByType")(chunk.asInstanceOf[js.Any], typeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PartialSelectorAstNode]]
  
  inline def findDeclaration(importNode: Imported, test: js.Any): Declaration = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclaration")(importNode.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Declaration]
  
  inline def findRule(root: Root_, selector: String): Null | Declaration = (^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Null | Declaration]
  inline def findRule(root: Root_, selector: String, test: js.Any): Null | Declaration = (^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Null | Declaration]
  
  inline def fixChunkOrdering(selectorNode: SelectorAstNode, prefixType: SelectorAstNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixChunkOrdering")(selectorNode.asInstanceOf[js.Any], prefixType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fixRelativeUrls(ast: Root_, originPath: String, targetPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixRelativeUrls")(ast.asInstanceOf[js.Any], originPath.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object functionWarnings {
    
    @JSImport("@stylable/core", "functionWarnings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def CANNOT_FIND_IMPORTED_VAR(varName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CANNOT_FIND_IMPORTED_VAR")(varName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def CANNOT_USE_AS_VALUE(`type`: String, varName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("CANNOT_USE_AS_VALUE")(`type`.asInstanceOf[js.Any], varName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def CANNOT_USE_JS_AS_VALUE(varName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CANNOT_USE_JS_AS_VALUE")(varName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def COULD_NOT_RESOLVE_VALUE(args: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("COULD_NOT_RESOLVE_VALUE")(args.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def CYCLIC_VALUE(cyclicChain: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CYCLIC_VALUE")(cyclicChain.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def FAIL_TO_EXECUTE_FORMATTER(resolvedValue: String, message: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAIL_TO_EXECUTE_FORMATTER")(resolvedValue.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def MULTI_ARGS_IN_VALUE(args: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MULTI_ARGS_IN_VALUE")(args.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def UNKNOWN_FORMATTER(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_FORMATTER")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def UNKNOWN_VAR(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_VAR")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def generateScopedCSSVar(namespace: String, varName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateScopedCSSVar")(namespace.asInstanceOf[js.Any], varName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAlias(symbol: StylableSymbol): js.UndefOr[ImportSymbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlias")(symbol.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ImportSymbol]]
  
  inline def getBoxValue(path: js.Array[String], value: String, node: ParsedValue, customTypes: CustomTypes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoxValue")(path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], node.asInstanceOf[js.Any], customTypes.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getBoxValue(path: js.Array[String], value: Box_[String, js.Any], node: ParsedValue, customTypes: CustomTypes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoxValue")(path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], node.asInstanceOf[js.Any], customTypes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCssDocsForSymbol(meta: typings.stylableCore.stylableMetaMod.StylableMeta, symbol: StylableSymbol): CssDoc | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getCssDocsForSymbol")(meta.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[CssDoc | Null]
  
  inline def getDeclStylable(decl: SDecl): DeclStylableProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeclStylable")(decl.asInstanceOf[js.Any]).asInstanceOf[DeclStylableProps]
  
  inline def getFormatterArgs(node: ParsedValue): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getFormatterArgs(node: ParsedValue, allowComments: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any], allowComments.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getFormatterArgs(node: ParsedValue, allowComments: Boolean, _reportWarning: Unit, perserveQuotes: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any], allowComments.asInstanceOf[js.Any], _reportWarning.asInstanceOf[js.Any], perserveQuotes.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getFormatterArgs(node: ParsedValue, allowComments: Boolean, _reportWarning: ReportWarning): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any], allowComments.asInstanceOf[js.Any], _reportWarning.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getFormatterArgs(node: ParsedValue, allowComments: Boolean, _reportWarning: ReportWarning, perserveQuotes: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any], allowComments.asInstanceOf[js.Any], _reportWarning.asInstanceOf[js.Any], perserveQuotes.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getFormatterArgs(node: ParsedValue, allowComments: Unit, _reportWarning: Unit, perserveQuotes: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any], allowComments.asInstanceOf[js.Any], _reportWarning.asInstanceOf[js.Any], perserveQuotes.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getFormatterArgs(node: ParsedValue, allowComments: Unit, _reportWarning: ReportWarning): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any], allowComments.asInstanceOf[js.Any], _reportWarning.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getFormatterArgs(node: ParsedValue, allowComments: Unit, _reportWarning: ReportWarning, perserveQuotes: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any], allowComments.asInstanceOf[js.Any], _reportWarning.asInstanceOf[js.Any], perserveQuotes.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getNamedArgs(node: ParsedValue): js.Array[js.Array[ParsedValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamedArgs")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[ParsedValue]]]
  
  inline def getOriginDefinition(resolved: js.Array[CSSResolve[ClassSymbol | ElementSymbol]]): CSSResolve[ClassSymbol | ElementSymbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginDefinition")(resolved.asInstanceOf[js.Any]).asInstanceOf[CSSResolve[ClassSymbol | ElementSymbol]]
  
  inline def getSourcePath(root: Root_, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourcePath")(root.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStringValue(nodes: js.Array[ParsedValue]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringValue")(nodes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getStringValue(nodes: ParsedValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringValue")(nodes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def groupValues(nodes: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupValues")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def groupValues(nodes: js.Array[js.Any], divType: String): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupValues")(nodes.asInstanceOf[js.Any], divType.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def isAsset(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsset")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCSSVarProp(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCSSVarProp")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isChildOfAtRule(rule: Container, atRuleName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isChildOfAtRule")(rule.asInstanceOf[js.Any], atRuleName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCompRoot(name: String): RegExpMatchArray | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompRoot")(name.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray | Null]
  
  inline def isCssNativeFunction(name: String): /* is @stylable/core.@stylable/core/cjs/native-reserved-lists.nativeFunctions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCssNativeFunction")(name.asInstanceOf[js.Any]).asInstanceOf[/* is @stylable/core.@stylable/core/cjs/native-reserved-lists.nativeFunctions */ Boolean]
  
  inline def isCustomValue(symbol: js.Any): /* is @stylable/core.@stylable/core/cjs/custom-values.JSValueExtension<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomValue")(symbol.asInstanceOf[js.Any]).asInstanceOf[/* is @stylable/core.@stylable/core/cjs/custom-values.JSValueExtension<unknown> */ Boolean]
  
  inline def isExternal(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternal")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isGlobal(node: SelectorAstNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGlobal")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isImport(ast: SelectorAstNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImport")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInPath(
    extendPath: js.Array[CSSResolve[ClassSymbol | ElementSymbol]],
    hasHasName1HasSource1: CSSResolve[ClassSymbol | ElementSymbol]
  ): js.UndefOr[CSSResolve[ClassSymbol | ElementSymbol]] = (^.asInstanceOf[js.Dynamic].applyDynamic("isInPath")(extendPath.asInstanceOf[js.Any], hasHasName1HasSource1.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CSSResolve[ClassSymbol | ElementSymbol]]]
  
  inline def isNodeMatch(nodeA: PartialSelectorAstNode, nodeB: PartialSelectorAstNode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNodeMatch")(nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isRootValid(ast: SelectorAstNode, rootName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRootValid")(ast.asInstanceOf[js.Any], rootName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSimpleSelector(selectorAst: SelectorAstNode): Boolean | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleSelector")(selectorAst.asInstanceOf[js.Any]).asInstanceOf[Boolean | Unit]
  
  inline def isValidClassName(className: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidClassName")(className.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidDeclaration(decl: Declaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def listOptions(node: js.Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listOptions")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def makeAbsolute(resourcePath: String, rootContext: String, moduleContext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAbsolute")(resourcePath.asInstanceOf[js.Any], rootContext.asInstanceOf[js.Any], moduleContext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def matchAtKeyframes(selector: String): RegExpMatchArray | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("matchAtKeyframes")(selector.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray | Null]
  
  inline def matchAtMedia(selector: String): RegExpMatchArray | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("matchAtMedia")(selector.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray | Null]
  
  inline def matchSelectorTarget(sourceSelector: String, targetSelector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSelectorTarget")(sourceSelector.asInstanceOf[js.Any], targetSelector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mergeChunks(chunks: js.Array[js.Array[SelectorChunk2]]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeChunks")(chunks.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def mergeRules(mixinAst: Root_, rule: Rule_): Rule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeRules")(mixinAst.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[Rule_]
  
  @JSImport("@stylable/core", "mixinDeclRegExp")
  @js.native
  val mixinDeclRegExp: RegExp = js.native
  
  object mixinWarnings {
    
    @JSImport("@stylable/core", "mixinWarnings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def CIRCULAR_MIXIN(circularPaths: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CIRCULAR_MIXIN")(circularPaths.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def FAILED_TO_APPLY_MIXIN(error: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILED_TO_APPLY_MIXIN")(error.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def JS_MIXIN_NOT_A_FUNC(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("JS_MIXIN_NOT_A_FUNC")().asInstanceOf[String]
    
    inline def UNKNOWN_MIXIN_SYMBOL(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_MIXIN_SYMBOL")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object nativeFunctionsDic {
    
    @JSImport("@stylable/core", "nativeFunctionsDic")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@stylable/core", "nativeFunctionsDic.attr")
    @js.native
    def attr: Boolean = js.native
    inline def attr_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attr")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.blur")
    @js.native
    def blur: Boolean = js.native
    inline def blur_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blur")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.brightness")
    @js.native
    def brightness: Boolean = js.native
    inline def brightness_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brightness")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.calc")
    @js.native
    def calc: Boolean = js.native
    inline def calc_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calc")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.circle")
    @js.native
    def circle: Boolean = js.native
    inline def circle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("circle")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.constant")
    @js.native
    def constant: Boolean = js.native
    inline def constant_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constant")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.contrast")
    @js.native
    def contrast: Boolean = js.native
    inline def contrast_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contrast")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.counter")
    @js.native
    def counter: Boolean = js.native
    inline def counter_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("counter")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.counters")
    @js.native
    def counters: Boolean = js.native
    inline def counters_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("counters")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.cubic-bezier")
    @js.native
    def cubicBezier: Boolean = js.native
    
    inline def cubicBezier_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubic-bezier")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.drop-shadow")
    @js.native
    def dropShadow: Boolean = js.native
    
    inline def dropShadow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drop-shadow")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.ellipse")
    @js.native
    def ellipse: Boolean = js.native
    inline def ellipse_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipse")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.env")
    @js.native
    def env: Boolean = js.native
    inline def env_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("env")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.format")
    @js.native
    def format: Boolean = js.native
    inline def format_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.grayscale")
    @js.native
    def grayscale: Boolean = js.native
    inline def grayscale_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grayscale")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.hsl")
    @js.native
    def hsl: Boolean = js.native
    inline def hsl_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hsl")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.hsla")
    @js.native
    def hsla: Boolean = js.native
    inline def hsla_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hsla")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.hue-rotate")
    @js.native
    def hueRotate: Boolean = js.native
    
    inline def hueRotate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hue-rotate")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.hwb")
    @js.native
    def hwb: Boolean = js.native
    inline def hwb_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hwb")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.image")
    @js.native
    def image: Boolean = js.native
    inline def image_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.inset")
    @js.native
    def inset: Boolean = js.native
    inline def inset_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inset")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.invert")
    @js.native
    def invert: Boolean = js.native
    inline def invert_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invert")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.linear-gradient")
    @js.native
    def linearGradient: Boolean = js.native
    
    inline def linearGradient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linear-gradient")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.local")
    @js.native
    def local: Boolean = js.native
    inline def local_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("local")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.matrix")
    @js.native
    def matrix: Boolean = js.native
    
    @JSImport("@stylable/core", "nativeFunctionsDic.matrix3d")
    @js.native
    def matrix3d: Boolean = js.native
    inline def matrix3d_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrix3d")(x.asInstanceOf[js.Any])
    
    inline def matrix_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrix")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.minmax")
    @js.native
    def minmax: Boolean = js.native
    inline def minmax_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minmax")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.opacity")
    @js.native
    def opacity: Boolean = js.native
    inline def opacity_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.paint")
    @js.native
    def paint: Boolean = js.native
    inline def paint_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paint")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.path")
    @js.native
    def path: Boolean = js.native
    inline def path_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.perspective")
    @js.native
    def perspective: Boolean = js.native
    inline def perspective_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("perspective")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.polygon")
    @js.native
    def polygon: Boolean = js.native
    inline def polygon_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polygon")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.radial-gradient")
    @js.native
    def radialGradient: Boolean = js.native
    
    inline def radialGradient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radial-gradient")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rect")
    @js.native
    def rect: Boolean = js.native
    inline def rect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rect")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.repeat")
    @js.native
    def repeat: Boolean = js.native
    inline def repeat_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("repeat")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.repeating-linear-gradient")
    @js.native
    def repeatingLinearGradient: Boolean = js.native
    
    inline def repeatingLinearGradient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("repeating-linear-gradient")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.repeating-radial-gradient")
    @js.native
    def repeatingRadialGradient: Boolean = js.native
    
    inline def repeatingRadialGradient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("repeating-radial-gradient")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rgb")
    @js.native
    def rgb: Boolean = js.native
    inline def rgb_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rgb")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rgba")
    @js.native
    def rgba: Boolean = js.native
    inline def rgba_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rgba")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rotate")
    @js.native
    def rotate: Boolean = js.native
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rotate3d")
    @js.native
    def rotate3d: Boolean = js.native
    inline def rotate3d_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotate3d")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rotateX")
    @js.native
    def rotateX: Boolean = js.native
    inline def rotateX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotateX")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rotateY")
    @js.native
    def rotateY: Boolean = js.native
    inline def rotateY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotateY")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.rotateZ")
    @js.native
    def rotateZ: Boolean = js.native
    inline def rotateZ_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotateZ")(x.asInstanceOf[js.Any])
    
    inline def rotate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotate")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.saturate")
    @js.native
    def saturate: Boolean = js.native
    inline def saturate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("saturate")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.scale")
    @js.native
    def scale: Boolean = js.native
    
    @JSImport("@stylable/core", "nativeFunctionsDic.scale3d")
    @js.native
    def scale3d: Boolean = js.native
    inline def scale3d_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scale3d")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.scaleX")
    @js.native
    def scaleX: Boolean = js.native
    inline def scaleX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.scaleY")
    @js.native
    def scaleY: Boolean = js.native
    inline def scaleY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.scaleZ")
    @js.native
    def scaleZ: Boolean = js.native
    inline def scaleZ_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scaleZ")(x.asInstanceOf[js.Any])
    
    inline def scale_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scale")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.sepia")
    @js.native
    def sepia: Boolean = js.native
    inline def sepia_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sepia")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.skew")
    @js.native
    def skew: Boolean = js.native
    
    @JSImport("@stylable/core", "nativeFunctionsDic.skewX")
    @js.native
    def skewX: Boolean = js.native
    inline def skewX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skewX")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.skewY")
    @js.native
    def skewY: Boolean = js.native
    inline def skewY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skewY")(x.asInstanceOf[js.Any])
    
    inline def skew_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skew")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.symbols")
    @js.native
    def symbols: Boolean = js.native
    inline def symbols_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbols")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.translate")
    @js.native
    def translate: Boolean = js.native
    
    @JSImport("@stylable/core", "nativeFunctionsDic.translate3d")
    @js.native
    def translate3d: Boolean = js.native
    inline def translate3d_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translate3d")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.translateX")
    @js.native
    def translateX: Boolean = js.native
    inline def translateX_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translateX")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.translateY")
    @js.native
    def translateY: Boolean = js.native
    inline def translateY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translateY")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.translateZ")
    @js.native
    def translateZ: Boolean = js.native
    inline def translateZ_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translateZ")(x.asInstanceOf[js.Any])
    
    inline def translate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translate")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "nativeFunctionsDic.url")
    @js.native
    def url: Boolean = js.native
    inline def url_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("url")(x.asInstanceOf[js.Any])
    
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
  
  inline def noCollisionNamespace(): js.Function2[/* namespace */ String, /* source */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("noCollisionNamespace")().asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def noCollisionNamespace(hasPrefixUsedNamespaces: Prefix): js.Function2[/* namespace */ String, /* source */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("noCollisionNamespace")(hasPrefixUsedNamespaces.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any], hashSalt.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String,
    prefix: String
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any], hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String,
    prefix: String,
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any], hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], normalizeVersion.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String,
    prefix: Unit,
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any], hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], normalizeVersion.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: Unit,
    prefix: String
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any], hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: Unit,
    prefix: String,
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any], hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], normalizeVersion.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: Unit,
    prefix: Unit,
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any], hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], normalizeVersion.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  
  inline def parseSelector(selector: String): SelectorAstNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[SelectorAstNode]
  
  inline def process(root: Root_): typings.stylableCore.stylableMetaMod.StylableMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(root.asInstanceOf[js.Any]).asInstanceOf[typings.stylableCore.stylableMetaMod.StylableMeta]
  inline def process(
    root: Root_,
    diagnostics: Unit,
    resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
  ): typings.stylableCore.stylableMetaMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(root.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], resolveNamespace.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableMetaMod.StylableMeta]
  inline def process(root: Root_, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): typings.stylableCore.stylableMetaMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(root.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableMetaMod.StylableMeta]
  inline def process(
    root: Root_,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
  ): typings.stylableCore.stylableMetaMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(root.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], resolveNamespace.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableMetaMod.StylableMeta]
  
  inline def processDeclarationUrls(decl: Declaration, onUrl: OnUrlCallback, transform: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processDeclarationUrls")(decl.asInstanceOf[js.Any], onUrl.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def processDeclarationValue(
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
  ): OutputValue = (^.asInstanceOf[js.Dynamic].applyDynamic("processDeclarationValue")(resolver.asInstanceOf[js.Any], value.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], valueHook.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], passedThrough.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[OutputValue]
  
  inline def processNamespace(namespace: String, source: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("processNamespace")(namespace.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object processorWarnings {
    
    @JSImport("@stylable/core", "processorWarnings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def CANNOT_EXTEND_IN_COMPLEX(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CANNOT_EXTEND_IN_COMPLEX")().asInstanceOf[String]
    
    inline def CANNOT_RESOLVE_EXTEND(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CANNOT_RESOLVE_EXTEND")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def DEFAULT_IMPORT_IS_LOWER_CASE(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_IMPORT_IS_LOWER_CASE")().asInstanceOf[String]
    
    inline def EMPTY_IMPORT_FROM(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EMPTY_IMPORT_FROM")().asInstanceOf[String]
    
    inline def EMPTY_NAMESPACE_DEF(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EMPTY_NAMESPACE_DEF")().asInstanceOf[String]
    
    inline def FORBIDDEN_DEF_IN_COMPLEX_SELECTOR(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FORBIDDEN_DEF_IN_COMPLEX_SELECTOR")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def FROM_PROP_MISSING_IN_IMPORT(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FROM_PROP_MISSING_IN_IMPORT")().asInstanceOf[String]
    
    inline def GLOBAL_CSS_VAR_MISSING_COMMA(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GLOBAL_CSS_VAR_MISSING_COMMA")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def ILLEGAL_CSS_VAR_ARGS(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ILLEGAL_CSS_VAR_ARGS")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def ILLEGAL_CSS_VAR_USE(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ILLEGAL_CSS_VAR_USE")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def ILLEGAL_GLOBAL_CSS_VAR(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ILLEGAL_GLOBAL_CSS_VAR")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def ILLEGAL_PROP_IN_IMPORT(propName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ILLEGAL_PROP_IN_IMPORT")(propName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def INVALID_NAMESPACE_DEF(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_NAMESPACE_DEF")().asInstanceOf[String]
    
    inline def MISSING_SCOPING_PARAM(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MISSING_SCOPING_PARAM")().asInstanceOf[String]
    
    inline def MULTIPLE_FROM_IN_IMPORT(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MULTIPLE_FROM_IN_IMPORT")().asInstanceOf[String]
    
    inline def NO_IMPORT_IN_ST_SCOPE(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("NO_IMPORT_IN_ST_SCOPE")().asInstanceOf[String]
    
    inline def NO_KEYFRAMES_IN_ST_SCOPE(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("NO_KEYFRAMES_IN_ST_SCOPE")().asInstanceOf[String]
    
    inline def NO_VARS_DEF_IN_ST_SCOPE(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("NO_VARS_DEF_IN_ST_SCOPE")().asInstanceOf[String]
    
    inline def OVERRIDE_MIXIN(mixinType: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("OVERRIDE_MIXIN")(mixinType.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def OVERRIDE_TYPED_RULE(key: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("OVERRIDE_TYPED_RULE")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def PARTIAL_MIXIN_MISSING_ARGUMENTS(`type`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("PARTIAL_MIXIN_MISSING_ARGUMENTS")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def REDECLARE_SYMBOL(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("REDECLARE_SYMBOL")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def REDECLARE_SYMBOL_KEYFRAMES(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("REDECLARE_SYMBOL_KEYFRAMES")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def ROOT_AFTER_SPACING(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ROOT_AFTER_SPACING")().asInstanceOf[String]
    
    inline def STATE_DEFINITION_IN_COMPLEX(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("STATE_DEFINITION_IN_COMPLEX")().asInstanceOf[String]
    
    inline def STATE_DEFINITION_IN_ELEMENT(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("STATE_DEFINITION_IN_ELEMENT")().asInstanceOf[String]
    
    inline def UNKNOWN_MIXIN(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_MIXIN")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def UNSCOPED_CLASS(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSCOPED_CLASS")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def UNSCOPED_ELEMENT(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSCOPED_ELEMENT")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object pseudoStates {
    
    @JSImport("@stylable/core", "pseudoStates")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@stylable/core", "pseudoStates.booleanStateDelimiter")
    @js.native
    val booleanStateDelimiter: /* "--" */ String = js.native
    
    inline def createAttributeState(stateName: String, namespace: String, param: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createAttributeState")(stateName.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def createBooleanStateClassName(stateName: String, namespace: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createBooleanStateClassName")(stateName.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def createStateWithParamClassName(stateName: String, namespace: String, param: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createStateWithParamClassName")(stateName.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def processPseudoStates(value: String, decl: Declaration, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): MappedStates = (^.asInstanceOf[js.Dynamic].applyDynamic("processPseudoStates")(value.asInstanceOf[js.Any], decl.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[MappedStates]
    
    inline def resolveStateParam(param: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveStateParam")(param.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def setStateToNode(
      states: MappedStates,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      name: String,
      node: SelectorAstNode,
      namespace: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStateToNode")(states.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setStateToNode(
      states: MappedStates,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      name: String,
      node: SelectorAstNode,
      namespace: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStateToNode")(states.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object stateErrors {
      
      @JSImport("@stylable/core", "pseudoStates.stateErrors")
      @js.native
      val ^ : js.Any = js.native
      
      inline def NO_STATE_TYPE_GIVEN(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("NO_STATE_TYPE_GIVEN")(name.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def STATE_STARTS_WITH_HYPHEN(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("STATE_STARTS_WITH_HYPHEN")(name.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def TOO_MANY_ARGS_IN_VALIDATOR(name: String, validator: String, args: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("TOO_MANY_ARGS_IN_VALIDATOR")(name.asInstanceOf[js.Any], validator.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def TOO_MANY_STATE_TYPES(name: String, types: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("TOO_MANY_STATE_TYPES")(name.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def UNKNOWN_STATE_TYPE(name: String, `type`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_STATE_TYPE")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def UNKNOWN_STATE_USAGE(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_STATE_USAGE")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    }
    
    @JSImport("@stylable/core", "pseudoStates.stateMiddleDelimiter")
    @js.native
    val stateMiddleDelimiter: /* "-" */ String = js.native
    
    @JSImport("@stylable/core", "pseudoStates.stateWithParamDelimiter")
    @js.native
    val stateWithParamDelimiter: String = js.native
    
    inline def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: Null,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ClassSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableProcessorMod.StylableMeta]
    inline def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: Null,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ClassSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableProcessorMod.StylableMeta]
    inline def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: Null,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ElementSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableProcessorMod.StylableMeta]
    inline def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: Null,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ElementSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableProcessorMod.StylableMeta]
    inline def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: StylableSymbol,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ClassSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableProcessorMod.StylableMeta]
    inline def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: StylableSymbol,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ClassSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableProcessorMod.StylableMeta]
    inline def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: StylableSymbol,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ElementSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableProcessorMod.StylableMeta]
    inline def transformPseudoStateSelector(
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      node: SelectorAstNode,
      name: String,
      symbol: StylableSymbol,
      origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
      originSymbol: ElementSymbol,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_
    ): typings.stylableCore.stylableProcessorMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableProcessorMod.StylableMeta]
    
    inline def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[StateResult]
    inline def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Unit,
      validateDefinition: Boolean
    ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], validateDefinition.asInstanceOf[js.Any])).asInstanceOf[StateResult]
    inline def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Unit,
      validateDefinition: Boolean,
      validateValue: Boolean
    ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], validateDefinition.asInstanceOf[js.Any], validateValue.asInstanceOf[js.Any])).asInstanceOf[StateResult]
    inline def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Unit,
      validateDefinition: Unit,
      validateValue: Boolean
    ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], validateDefinition.asInstanceOf[js.Any], validateValue.asInstanceOf[js.Any])).asInstanceOf[StateResult]
    inline def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_
    ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[StateResult]
    inline def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_,
      validateDefinition: Boolean
    ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], validateDefinition.asInstanceOf[js.Any])).asInstanceOf[StateResult]
    inline def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_,
      validateDefinition: Boolean,
      validateValue: Boolean
    ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], validateDefinition.asInstanceOf[js.Any], validateValue.asInstanceOf[js.Any])).asInstanceOf[StateResult]
    inline def validateStateArgument(
      stateAst: StateParsedValue,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      value: String,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
      rule: Rule_,
      validateDefinition: Unit,
      validateValue: Boolean
    ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], validateDefinition.asInstanceOf[js.Any], validateValue.asInstanceOf[js.Any])).asInstanceOf[StateResult]
    
    inline def validateStateDefinition(
      decl: Declaration,
      meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
      resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
      diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateDefinition")(decl.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def removeSTDirective(root: Root_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSTDirective")(root.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeUnusedRules(
    ast: Root_,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    _import: Imported,
    usedFiles: js.Array[String],
    resolvePath: js.Function2[/* ctx */ String, /* path */ String, String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeUnusedRules")(ast.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], _import.asInstanceOf[js.Any], usedFiles.asInstanceOf[js.Any], resolvePath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@stylable/core", "reservedKeyFrames")
  @js.native
  val reservedKeyFrames: js.Array[String] = js.native
  
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node,
    variableOverride: Unit,
    path: js.Array[String]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node,
    variableOverride: Unit,
    path: js.Array[String],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node,
    variableOverride: Unit,
    path: Unit,
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node,
    variableOverride: Record[String, String]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: js.Array[String]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: js.Array[String],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: Unit,
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  
  inline def resolveCustomValues(
    meta: typings.stylableCore.stylableMetaMod.StylableMeta,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver
  ): StringDictionary[CustomValueExtension[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveCustomValues")(meta.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[CustomValueExtension[js.Any]]]
  
  object resolverWarnings {
    
    @JSImport("@stylable/core", "resolverWarnings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def UNKNOWN_IMPORTED_FILE(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_IMPORTED_FILE")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def UNKNOWN_IMPORTED_SYMBOL(name: String, path: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_IMPORTED_SYMBOL")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object rootValueMapping {
    
    @JSImport("@stylable/core", "rootValueMapping")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@stylable/core", "rootValueMapping.import")
    @js.native
    val `import`: Colonimport = js.native
    
    @JSImport("@stylable/core", "rootValueMapping.namespace")
    @js.native
    def namespace: typings.stylableCore.stylableCoreStrings.namespace = js.native
    inline def namespace_=(x: namespace): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("namespace")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "rootValueMapping.stScope")
    @js.native
    def stScope: `st-scope` = js.native
    inline def stScope_=(x: `st-scope`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stScope")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "rootValueMapping.vars")
    @js.native
    def vars: Colonvars = js.native
    inline def vars_=(x: Colonvars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vars")(x.asInstanceOf[js.Any])
  }
  
  inline def safeParse(css: String): Root_ = ^.asInstanceOf[js.Dynamic].applyDynamic("safeParse")(css.asInstanceOf[js.Any]).asInstanceOf[Root_]
  inline def safeParse(css: String, options: ProcessOptions): Root_ = (^.asInstanceOf[js.Dynamic].applyDynamic("safeParse")(css.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root_]
  
  inline def scopeCSSVar(
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    symbolName: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeCSSVar")(resolver.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], symbolName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def scopeSelector(scopeSelectorRule: String, targetSelectorRule: String): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeSelector")(scopeSelectorRule.asInstanceOf[js.Any], targetSelectorRule.asInstanceOf[js.Any])).asInstanceOf[Selector]
  inline def scopeSelector(scopeSelectorRule: String, targetSelectorRule: String, rootScopeLevel: Boolean): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeSelector")(scopeSelectorRule.asInstanceOf[js.Any], targetSelectorRule.asInstanceOf[js.Any], rootScopeLevel.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def separateChunks(selectorNode: SelectorAstNode): js.Array[js.Array[SelectorChunk]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separateChunks")(selectorNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[SelectorChunk]]]
  
  inline def separateChunks2(selectorNode: SelectorAstNode): js.Array[js.Array[SelectorChunk2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separateChunks2")(selectorNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[SelectorChunk2]]]
  
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
    
    @JSImport("@stylable/core", "strategies")
    @js.native
    val ^ : js.Any = js.native
    
    inline def args(node: js.Any): js.Array[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("args")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Value]]
    inline def args(node: js.Any, reportWarning: ReportWarning): js.Array[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("args")(node.asInstanceOf[js.Any], reportWarning.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value]]
    
    inline def named(node: js.Any): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("named")(node.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
    inline def named(node: js.Any, reportWarning: ReportWarning): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("named")(node.asInstanceOf[js.Any], reportWarning.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  }
  
  inline def stringifySelector(ast: SelectorAstNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifySelector")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@stylable/core", "systemValidators")
  @js.native
  val systemValidators: Record[String, StateParamType] = js.native
  
  inline def transformMatchesOnRule(rule: Rule_, lineBreak: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMatchesOnRule")(rule.asInstanceOf[js.Any], lineBreak.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object transformerWarnings {
    
    @JSImport("@stylable/core", "transformerWarnings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def CANNOT_EXTEND_JS(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CANNOT_EXTEND_JS")().asInstanceOf[String]
    
    inline def CANNOT_EXTEND_UNKNOWN_SYMBOL(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CANNOT_EXTEND_UNKNOWN_SYMBOL")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def IMPORT_ISNT_EXTENDABLE(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("IMPORT_ISNT_EXTENDABLE")().asInstanceOf[String]
    
    inline def KEYFRAME_NAME_RESERVED(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("KEYFRAME_NAME_RESERVED")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def UNKNOWN_IMPORT_ALIAS(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_IMPORT_ALIAS")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def UNKNOWN_PSEUDO_ELEMENT(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_PSEUDO_ELEMENT")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def traverseNode(node: SelectorAstNode, visitor: Visitor): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseNode")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def traverseNode(node: SelectorAstNode, visitor: Visitor, index: Double): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseNode")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def traverseNode(node: SelectorAstNode, visitor: Visitor, index: Double, nodes: js.Array[SelectorAstNode]): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseNode")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], index.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def traverseNode(node: SelectorAstNode, visitor: Visitor, index: Unit, nodes: js.Array[SelectorAstNode]): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseNode")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], index.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  
  inline def unbox[B /* <: Box_[String, js.Any] */](boxed: B): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unbox")(boxed.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def unbox[B /* <: Box_[String, js.Any] */](boxed: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unbox")(boxed.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def validateAllowedNodesUntil(node: ParsedValue, i: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAllowedNodesUntil")(node.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def validateAllowedNodesUntil(node: ParsedValue, i: Double, untilType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAllowedNodesUntil")(node.asInstanceOf[js.Any], i.asInstanceOf[js.Any], untilType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def validateAllowedNodesUntil(node: ParsedValue, i: Double, untilType: String, allowed: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAllowedNodesUntil")(node.asInstanceOf[js.Any], i.asInstanceOf[js.Any], untilType.asInstanceOf[js.Any], allowed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def validateAllowedNodesUntil(node: ParsedValue, i: Double, untilType: Unit, allowed: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAllowedNodesUntil")(node.asInstanceOf[js.Any], i.asInstanceOf[js.Any], untilType.asInstanceOf[js.Any], allowed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validateScopingSelector(
    atRule: AtRule_,
    hasScopingSelector: SRule,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateScopingSelector")(atRule.asInstanceOf[js.Any], hasScopingSelector.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object valueMapping {
    
    @JSImport("@stylable/core", "valueMapping")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@stylable/core", "valueMapping.default")
    @js.native
    def default: `-st-default` = js.native
    inline def default_=(x: `-st-default`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.extends")
    @js.native
    val `extends`: `-st-extends` = js.native
    
    @JSImport("@stylable/core", "valueMapping.from")
    @js.native
    def from: `-st-from` = js.native
    inline def from_=(x: `-st-from`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("from")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.global")
    @js.native
    def global: `-st-global` = js.native
    inline def global_=(x: `-st-global`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("global")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.mixin")
    @js.native
    def mixin: `-st-mixin` = js.native
    inline def mixin_=(x: `-st-mixin`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mixin")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.named")
    @js.native
    def named: `-st-named` = js.native
    inline def named_=(x: `-st-named`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("named")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.partialMixin")
    @js.native
    def partialMixin: `-st-partial-mixin` = js.native
    inline def partialMixin_=(x: `-st-partial-mixin`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("partialMixin")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.root")
    @js.native
    def root: `-st-root` = js.native
    inline def root_=(x: `-st-root`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core", "valueMapping.states")
    @js.native
    def states: `-st-states` = js.native
    inline def states_=(x: `-st-states`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("states")(x.asInstanceOf[js.Any])
  }
  
  object valueParserWarnings {
    
    @JSImport("@stylable/core", "valueParserWarnings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def CSS_MIXIN_FORCE_NAMED_PARAMS(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CSS_MIXIN_FORCE_NAMED_PARAMS")().asInstanceOf[String]
    
    inline def INVALID_NAMED_IMPORT_AS(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_NAMED_IMPORT_AS")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def INVALID_NESTED_KEYFRAMES(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_NESTED_KEYFRAMES")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def VALUE_CANNOT_BE_STRING(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("VALUE_CANNOT_BE_STRING")().asInstanceOf[String]
  }
}
