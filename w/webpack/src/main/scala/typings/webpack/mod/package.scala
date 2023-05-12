package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.ArrayExpression
import typings.estree.mod.ArrowFunctionExpression
import typings.estree.mod.AssignmentExpression
import typings.estree.mod.AwaitExpression
import typings.estree.mod.BigIntLiteral
import typings.estree.mod.BinaryExpression
import typings.estree.mod.BlockStatement
import typings.estree.mod.BreakStatement
import typings.estree.mod.ChainExpression
import typings.estree.mod.ClassDeclaration
import typings.estree.mod.ClassExpression
import typings.estree.mod.ConditionalExpression
import typings.estree.mod.ContinueStatement
import typings.estree.mod.DebuggerStatement
import typings.estree.mod.DoWhileStatement
import typings.estree.mod.EmptyStatement
import typings.estree.mod.ExpressionStatement
import typings.estree.mod.ForInStatement
import typings.estree.mod.ForOfStatement
import typings.estree.mod.ForStatement
import typings.estree.mod.FunctionDeclaration
import typings.estree.mod.FunctionExpression
import typings.estree.mod.Identifier
import typings.estree.mod.IfStatement
import typings.estree.mod.ImportExpression
import typings.estree.mod.LabeledStatement
import typings.estree.mod.LogicalExpression
import typings.estree.mod.MemberExpression
import typings.estree.mod.MetaProperty
import typings.estree.mod.NewExpression
import typings.estree.mod.ObjectExpression
import typings.estree.mod.RegExpLiteral
import typings.estree.mod.ReturnStatement
import typings.estree.mod.SequenceExpression
import typings.estree.mod.SimpleCallExpression
import typings.estree.mod.SimpleLiteral
import typings.estree.mod.StaticBlock
import typings.estree.mod.SwitchStatement
import typings.estree.mod.TaggedTemplateExpression
import typings.estree.mod.TemplateLiteral
import typings.estree.mod.ThisExpression
import typings.estree.mod.ThrowStatement
import typings.estree.mod.TryStatement
import typings.estree.mod.UnaryExpression
import typings.estree.mod.UpdateExpression
import typings.estree.mod.VariableDeclaration
import typings.estree.mod.WhileStatement
import typings.estree.mod.WithStatement
import typings.estree.mod.YieldExpression
import typings.node.bufferMod.global.Buffer
import typings.schemaUtils.declarationsValidateMod.ValidationErrorConfiguration
import typings.std.Record
import typings.webpack.anon.Apply
import typings.webpack.anon.OmitStatsOptionscontextch
import typings.webpack.mod.^
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackInts.`-1`
import typings.webpack.webpackInts.`0`
import typings.webpack.webpackInts.`1`
import typings.webpack.webpackStrings.`root-of-chunk`
import typings.webpack.webpackStrings.chunk
import typings.webpack.webpackStrings.module
import typings.webpack.webpackStrings.nested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(options: js.Array[Configuration] & MultiCompilerOptions): MultiCompiler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[MultiCompiler]
inline def apply(options: js.Array[Configuration] & MultiCompilerOptions, callback: CallbackWebpack[MultiStats]): MultiCompiler = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MultiCompiler]
inline def apply(options: Configuration): Compiler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Compiler]
inline def apply(options: Configuration, callback: CallbackWebpack[Stats]): Compiler = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Compiler]

inline def validate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")().asInstanceOf[Unit]
inline def validate(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def validateSchema(
  schema: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<webpack.anon.FnCall>[0] */ js.Any,
  options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<webpack.anon.FnCall>[1] */ js.Any
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateSchema")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def validateSchema(
  schema: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<webpack.anon.FnCall>[0] */ js.Any,
  options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<webpack.anon.FnCall>[1] */ js.Any,
  validationConfiguration: ValidationErrorConfiguration
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateSchema")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validationConfiguration.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

inline def webpack(options: js.Array[Configuration] & MultiCompilerOptions): MultiCompiler = ^.asInstanceOf[js.Dynamic].applyDynamic("webpack")(options.asInstanceOf[js.Any]).asInstanceOf[MultiCompiler]
inline def webpack(options: js.Array[Configuration] & MultiCompilerOptions, callback: CallbackWebpack[MultiStats]): MultiCompiler = (^.asInstanceOf[js.Dynamic].applyDynamic("webpack")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MultiCompiler]
inline def webpack(options: Configuration): Compiler = ^.asInstanceOf[js.Dynamic].applyDynamic("webpack")(options.asInstanceOf[js.Any]).asInstanceOf[Compiler]
inline def webpack(options: Configuration, callback: CallbackWebpack[Stats]): Compiler = (^.asInstanceOf[js.Dynamic].applyDynamic("webpack")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Compiler]

type AliasOptionNewRequest = String | `false` | js.Array[String]

type AliasOptions = StringDictionary[AliasOptionNewRequest]

type AssetFilterItemTypes = String | js.RegExp | (js.Function2[/* name */ String, /* asset */ StatsAsset, Boolean])

type AssetInfo = KnownAssetInfo & (Record[String, Any])

type AuxiliaryComment = String | LibraryCustomUmdCommentObject

type BannerPluginArgument = String | BannerPluginOptions | (js.Function1[/* data */ typings.webpack.anon.Chunk, String])

type BuildMeta = KnownBuildMeta & (Record[String, Any])

type CallExpression = SimpleCallExpression | NewExpression

type CallbackAsyncQueue[T] = js.Function2[/* err */ js.UndefOr[Null | WebpackError], /* result */ js.UndefOr[T], Any]

type CallbackCache[T] = js.Function2[/* err */ js.UndefOr[Null | WebpackError], /* result */ js.UndefOr[T], Unit]

type CallbackFunction[T] = js.Function2[/* err */ js.UndefOr[Null | js.Error], /* result */ js.UndefOr[T], Any]

type CallbackNormalErrorCache[T] = js.Function2[/* err */ js.UndefOr[Null | js.Error], /* result */ js.UndefOr[T], Unit]

type CallbackWebpack[T] = js.Function2[/* err */ js.UndefOr[js.Error], /* stats */ js.UndefOr[T], Unit]

type Cell[T] = js.UndefOr[T]

type CodeValue = js.UndefOr[
Null | String | Double | js.BigInt | Boolean | js.Function | js.RegExp | RuntimeValue | (StringDictionary[
  RecursiveArrayOrRecord[
    js.UndefOr[
      Null | String | Double | js.BigInt | Boolean | js.Function | js.RegExp | RuntimeValue
    ]
  ]
]) | (js.Array[
  RecursiveArrayOrRecord[
    js.UndefOr[
      Null | String | Double | js.BigInt | Boolean | js.Function | js.RegExp | RuntimeValue
    ]
  ]
])]

type CodeValuePrimitive = js.UndefOr[Null | String | Double | js.BigInt | Boolean | js.Function | js.RegExp]

type Comparator[T] = js.Function2[/* arg0 */ T, /* arg1 */ T, `0` | `1` | `-1`]

type CompatSource = Source

type CompilationAssets = StringDictionary[Source]

type ConnectionState = Boolean | js.Symbol

type ConstDependencyTemplate = NullDependencyTemplate

type Consumes = (js.Array[String | ConsumesObject]) | ConsumesObject

/**
  * Modules that should be consumed from share scope. Property names are used to match requested modules in this compilation. Relative requests are resolved, module requests are matched unresolved, absolute paths will match resolved requests. A trailing slash will match all requests with this prefix. In this case shareKey must also have a trailing slash.
  */
type ConsumesObject = StringDictionary[String | ConsumesConfig]

type ContainerOptionsFormat[T] = (Record[String, String | js.Array[String] | T]) | (js.Array[String | (Record[String, String | js.Array[String] | T])])

type CreateStatsOptionsContext = KnownCreateStatsOptionsContext & (Record[String, Any])

type Declaration = FunctionDeclaration | VariableDeclaration | ClassDeclaration

/**
  * Options for the webpack-dev-server.
  */
type DevServer = StringDictionary[Any]

/**
  * The mappings from request to module info.
  */
type DllReferencePluginOptionsContent = StringDictionary[typings.webpack.anon.BuildMeta]

type Entry = String | (js.Function0[String | EntryObject | js.Array[String] | js.Promise[EntryStatic]]) | EntryObject | js.Array[String]

type EntryDependency = ModuleDependency

type EntryItem = String | js.Array[String]

type EntryNormalized = js.Function0[js.Promise[EntryStaticNormalized]] | EntryStaticNormalized

/**
  * Multiple entry bundles are created. The key is the entry name. The value can be a string, an array or an entry description object.
  */
type EntryObject = StringDictionary[String | js.Array[String] | EntryDescription]

type EntryStatic = String | EntryObject | js.Array[String]

/**
  * Multiple entry bundles are created. The key is the entry name. The value is an entry description object.
  */
type EntryStaticNormalized = StringDictionary[EntryDescriptionNormalized]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.webpack.mod.ScopeInfo
  - typings.webpack.mod.VariableInfo
*/
type ExportedVariableInfo = _ExportedVariableInfo | String

type Exposes = (js.Array[String | ExposesObject]) | ExposesObject

/**
  * Modules that should be exposed by this container. Property names are used as public paths.
  */
type ExposesObject = StringDictionary[String | ExposesConfig | js.Array[String]]

type Expression = UnaryExpression | ArrayExpression | ArrowFunctionExpression | AssignmentExpression | AwaitExpression | BinaryExpression | SimpleCallExpression | NewExpression | ChainExpression | ClassExpression | ConditionalExpression | FunctionExpression | Identifier | ImportExpression | SimpleLiteral | RegExpLiteral | BigIntLiteral | LogicalExpression | MemberExpression | MetaProperty | ObjectExpression | SequenceExpression | TaggedTemplateExpression | TemplateLiteral | ThisExpression | UpdateExpression | YieldExpression

type ExtensionAliasOptions = StringDictionary[String | js.Array[String]]

type ExternalItem = String | js.RegExp | (ExternalItemObjectKnown & ExternalItemObjectUnknown) | (js.Function2[
/* data */ ExternalItemFunctionData, 
/* callback */ js.Function2[
  /* err */ js.UndefOr[js.Error], 
  /* result */ js.UndefOr[String | Boolean | js.Array[String] | StringDictionary[Any]], 
  Unit
], 
Unit]) | (js.Function1[/* data */ ExternalItemFunctionData, js.Promise[ExternalItemValue]])

/**
  * If an dependency matches exactly a property of the object, the property value is used as dependency.
  */
type ExternalItemObjectUnknown = StringDictionary[ExternalItemValue]

type ExternalItemValue = String | Boolean | js.Array[String] | StringDictionary[Any]

type Externals = String | js.RegExp | js.Array[ExternalItem] | (ExternalItemObjectKnown & ExternalItemObjectUnknown) | (js.Function2[
/* data */ ExternalItemFunctionData, 
/* callback */ js.Function2[
  /* err */ js.UndefOr[js.Error], 
  /* result */ js.UndefOr[String | Boolean | js.Array[String] | StringDictionary[Any]], 
  Unit
], 
Unit]) | (js.Function1[/* data */ ExternalItemFunctionData, js.Promise[ExternalItemValue]])

type FakeHook[T] = T & FakeHookMarker

type FileSystemCallback[T] = js.Function2[
/* err */ js.UndefOr[Null | (PossibleFileSystemError & js.Error)], 
/* result */ js.UndefOr[T], 
Any]

type FilterItemTypes = String | js.RegExp | (js.Function1[/* value */ String, Boolean])

/**
  * Specify options for each generator.
  */
type GeneratorOptionsByModuleTypeUnknown = StringDictionary[StringDictionary[Any]]

type HarmonyImportDependencyTemplate = DependencyTemplate

type HelperRuntimeModule = RuntimeModule

type ImportSource = js.UndefOr[Null | String | SimpleLiteral | RegExpLiteral | BigIntLiteral]

type InternalCell[T] = T | js.Symbol

type JsonpChunkLoadingRuntimeModule = RuntimeModule

type LibraryExport = String | js.Array[String]

type LibraryName = String | js.Array[String] | LibraryCustomUmdObject

type LoadScriptRuntimeModule = HelperRuntimeModule

/**
  * Custom values available in the loader context.
  */
type Loader = StringDictionary[Any]

type LoaderDefinitionFunction[OptionsType, ContextAdditions] = js.ThisFunction3[
/* this */ NormalModuleLoaderContext[OptionsType] & LoaderRunnerLoaderContext[OptionsType] & LoaderPluginLoaderContext & HotModuleReplacementPluginLoaderContext & ContextAdditions, 
/* content */ String, 
/* sourceMap */ js.UndefOr[String | SourceMap], 
/* additionalData */ js.UndefOr[AdditionalData], 
String | Unit | Buffer | (js.Promise[String | Buffer])]

type Matcher = String | js.RegExp | (js.Array[js.RegExp | String])

type ModuleFilterItemTypes = String | js.RegExp | (js.Function3[
/* name */ String, 
/* module */ StatsModule, 
/* type */ module | chunk | `root-of-chunk` | nested, 
Boolean])

type NodeEstreeIndex = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 74, starting with typings.estree.mod.UnaryExpression, typings.estree.mod.ArrayExpression, typings.estree.mod.ArrowFunctionExpression */ Any

type NormalizedStatsOptions = KnownNormalizedStatsOptions & OmitStatsOptionscontextch & (Record[String, Any])

type NullDependency = Dependency

type NullDependencyTemplate = DependencyTemplate

type ParameterizedComparator[TArg, T] = js.Function1[/* arg0 */ TArg, Comparator[T]]

/**
  * Specify options for each parser.
  */
type ParserOptionsByModuleTypeUnknown = StringDictionary[StringDictionary[Any]]

type ParserState = (Record[String, Any]) & ParserStateBase

type PitchLoaderDefinitionFunction[OptionsType, ContextAdditions] = js.ThisFunction3[
/* this */ NormalModuleLoaderContext[OptionsType] & LoaderRunnerLoaderContext[OptionsType] & LoaderPluginLoaderContext & HotModuleReplacementPluginLoaderContext & ContextAdditions, 
/* remainingRequest */ String, 
/* previousRequest */ String, 
/* data */ js.Object, 
String | Unit | Buffer | (js.Promise[String | Buffer])]

type Plugin = Apply | (js.ThisFunction1[/* this */ Resolver, /* arg1 */ Resolver, Unit])

type PreparsedAst = StringDictionary[Any]

type ProgressPluginArgument = ProgressPluginOptions | (js.Function3[/* percentage */ Double, /* msg */ String, /* repeated */ String, Unit])

type Provides = (js.Array[String | ProvidesObject]) | ProvidesObject

/**
  * Modules that should be provided as shared modules to the share scope. Property names are used as share keys.
  */
type ProvidesObject = StringDictionary[String | ProvidesConfig]

type RawLoaderDefinitionFunction[OptionsType, ContextAdditions] = js.ThisFunction3[
/* this */ NormalModuleLoaderContext[OptionsType] & LoaderRunnerLoaderContext[OptionsType] & LoaderPluginLoaderContext & HotModuleReplacementPluginLoaderContext & ContextAdditions, 
/* content */ Buffer, 
/* sourceMap */ js.UndefOr[String | SourceMap], 
/* additionalData */ js.UndefOr[AdditionalData], 
String | Unit | Buffer | (js.Promise[String | Buffer])]

/** 
NOTE: Rewritten from type alias:
{{{
type RecursiveArrayOrRecord = {[index: string] : webpack.webpack.RecursiveArrayOrRecord<T>} | std.Array<webpack.webpack.RecursiveArrayOrRecord<T>> | T
}}}
to avoid circular code involving: 
- webpack.webpack.CodeValue
- webpack.webpack.RecursiveArrayOrRecord
*/
type RecursiveArrayOrRecord[T] = StringDictionary[Any] | js.Array[Any] | T

type Remotes = (js.Array[String | RemotesObject]) | RemotesObject

/**
  * Container locations from which modules should be resolved and loaded at runtime. Property names are used as request scopes.
  */
type RemotesObject = StringDictionary[String | RemotesConfig | js.Array[String]]

type Rule = String | js.RegExp

/** 
NOTE: Rewritten from type alias:
{{{
type RuleSetCondition = string | std.RegExp | (value : string): boolean | webpack.webpack.RuleSetLogicalConditions | std.Array<webpack.webpack.RuleSetCondition>
}}}
to avoid circular code involving: 
- webpack.webpack.RuleSetCondition
*/
type RuleSetCondition = String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[Any]

/** 
NOTE: Rewritten from type alias:
{{{
type RuleSetConditionAbsolute = string | std.RegExp | (value : string): boolean | webpack.webpack.RuleSetLogicalConditionsAbsolute | std.Array<webpack.webpack.RuleSetConditionAbsolute>
}}}
to avoid circular code involving: 
- webpack.webpack.RuleSetConditionAbsolute
*/
type RuleSetConditionAbsolute = String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[Any]

/** 
NOTE: Rewritten from type alias:
{{{
type RuleSetConditionOrConditions = string | std.RegExp | (value : string): boolean | webpack.webpack.RuleSetLogicalConditions | std.Array<webpack.webpack.RuleSetCondition>
}}}
to avoid circular code involving: 
- webpack.webpack.RuleSetCondition
- webpack.webpack.RuleSetConditionOrConditions
*/
type RuleSetConditionOrConditions = String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[Any]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[typings.webpack.mod.RuleSetUseItem]
  - js.Function1[
/ * data * / typings.webpack.anon.Compiler, 
js.Array[typings.webpack.mod.RuleSetUseItem]]
  - typings.webpack.anon.Ident
  - typings.webpack.mod.TypeWebpackOptions
*/
type RuleSetUse = _RuleSetUse | js.Array[RuleSetUseItem] | (js.Function1[/* data */ typings.webpack.anon.Compiler, js.Array[RuleSetUseItem]]) | String

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.webpack.anon.Ident
  - typings.webpack.mod.TypeWebpackOptions
*/
type RuleSetUseItem = _RuleSetUseItem | String

type RuntimeCondition = js.UndefOr[String | Boolean | SortableSet[String]]

type RuntimeSpec = js.UndefOr[String | SortableSet[String]]

type Selector[A, B] = js.Function1[/* input */ A, B]

type Shared = (js.Array[String | SharedObject]) | SharedObject

/**
  * Modules that should be shared in the share scope. Property names are used to match requested modules in this compilation. Relative requests are resolved, module requests are matched unresolved, absolute paths will match resolved requests. A trailing slash will match all requests with this prefix. In this case shareKey must also have a trailing slash.
  */
type SharedObject = StringDictionary[String | SharedConfig]

type SizeOnlySource = Source

type SplitChunksSizes = StringDictionary[Double]

type Statement = FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement

type StatsAsset = KnownStatsAsset & (Record[String, Any])

type StatsChunk = KnownStatsChunk & (Record[String, Any])

type StatsChunkGroup = KnownStatsChunkGroup & (Record[String, Any])

type StatsChunkOrigin = KnownStatsChunkOrigin & (Record[String, Any])

type StatsCompilation = KnownStatsCompilation & (Record[String, Any])

type StatsError = KnownStatsError & (Record[String, Any])

type StatsFactoryContext = KnownStatsFactoryContext & (Record[String, Any])

type StatsLogging = KnownStatsLogging & (Record[String, Any])

type StatsLoggingEntry = KnownStatsLoggingEntry & (Record[String, Any])

type StatsModule = KnownStatsModule & (Record[String, Any])

type StatsModuleIssuer = KnownStatsModuleIssuer & (Record[String, Any])

type StatsModuleReason = KnownStatsModuleReason & (Record[String, Any])

type StatsModuleTraceDependency = KnownStatsModuleTraceDependency & (Record[String, Any])

type StatsModuleTraceItem = KnownStatsModuleTraceItem & (Record[String, Any])

type StatsPrinterContext = KnownStatsPrinterContext & (Record[String, Any])

type StatsProfile = KnownStatsProfile & (Record[String, Any])

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typings.webpack.mod.StatsOptions
  - typings.webpack.webpackStrings.none
  - typings.webpack.webpackStrings.verbose
  - typings.webpack.webpackStrings.summary
  - typings.webpack.webpackStrings.`errors-only`
  - typings.webpack.webpackStrings.`errors-warnings`
  - typings.webpack.webpackStrings.minimal
  - typings.webpack.webpackStrings.normal
  - typings.webpack.webpackStrings.detailed
*/
type StatsValue = _StatsValue | Boolean

type WarningFilterItemTypes = String | js.RegExp | (js.Function2[/* warning */ StatsError, /* value */ String, Boolean])

type WebpackPluginFunction = js.ThisFunction1[/* this */ Compiler, /* compiler */ Compiler, Unit]
