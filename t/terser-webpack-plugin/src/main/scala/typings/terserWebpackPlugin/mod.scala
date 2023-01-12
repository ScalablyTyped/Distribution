package typings.terserWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.jestWorker.mod.Worker
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.terser.mod.ECMA
import typings.terserWebpackPlugin.anon.Col
import typings.terserWebpackPlugin.anon.Implementation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @typedef {import("schema-utils/declarations/validate").Schema} Schema */
  /** @typedef {import("webpack").Compiler} Compiler */
  /** @typedef {import("webpack").Compilation} Compilation */
  /** @typedef {import("webpack").WebpackError} WebpackError */
  /** @typedef {import("webpack").Asset} Asset */
  /** @typedef {import("./utils.js").TerserECMA} TerserECMA */
  /** @typedef {import("./utils.js").TerserOptions} TerserOptions */
  /** @typedef {import("jest-worker").Worker} JestWorker */
  /** @typedef {import("@jridgewell/trace-mapping").SourceMapInput} SourceMapInput */
  /** @typedef {RegExp | string} Rule */
  /** @typedef {Rule[] | Rule} Rules */
  /**
    * @callback ExtractCommentsFunction
    * @param {any} astNode
    * @param {{ value: string, type: 'comment1' | 'comment2' | 'comment3' | 'comment4', pos: number, line: number, col: number }} comment
    * @returns {boolean}
    */
  /**
    * @typedef {boolean | 'all' | 'some' | RegExp | ExtractCommentsFunction} ExtractCommentsCondition
    */
  /**
    * @typedef {string | ((fileData: any) => string)} ExtractCommentsFilename
    */
  /**
    * @typedef {boolean | string | ((commentsFile: string) => string)} ExtractCommentsBanner
    */
  /**
    * @typedef {Object} ExtractCommentsObject
    * @property {ExtractCommentsCondition} [condition]
    * @property {ExtractCommentsFilename} [filename]
    * @property {ExtractCommentsBanner} [banner]
    */
  /**
    * @typedef {ExtractCommentsCondition | ExtractCommentsObject} ExtractCommentsOptions
    */
  /**
    * @typedef {Object} MinimizedResult
    * @property {string} code
    * @property {SourceMapInput} [map]
    * @property {Array<Error | string>} [errors]
    * @property {Array<Error | string>} [warnings]
    * @property {Array<string>} [extractedComments]
    */
  /**
    * @typedef {{ [file: string]: string }} Input
    */
  /**
    * @typedef {{ [key: string]: any }} CustomOptions
    */
  /**
    * @template T
    * @typedef {T extends infer U ? U : CustomOptions} InferDefaultType
    */
  /**
    * @typedef {Object} PredefinedOptions
    * @property {boolean} [module]
    * @property {TerserECMA} [ecma]
    */
  /**
    * @template T
    * @typedef {PredefinedOptions & InferDefaultType<T>} MinimizerOptions
    */
  /**
    * @template T
    * @callback BasicMinimizerImplementation
    * @param {Input} input
    * @param {SourceMapInput | undefined} sourceMap
    * @param {MinimizerOptions<T>} minifyOptions
    * @param {ExtractCommentsOptions | undefined} extractComments
    * @returns {Promise<MinimizedResult>}
    */
  /**
    * @typedef {object} MinimizeFunctionHelpers
    * @property {() => string | undefined} [getMinimizerVersion]
    */
  /**
    * @template T
    * @typedef {BasicMinimizerImplementation<T> & MinimizeFunctionHelpers} MinimizerImplementation
    */
  /**
    * @template T
    * @typedef {Object} InternalOptions
    * @property {string} name
    * @property {string} input
    * @property {SourceMapInput | undefined} inputSourceMap
    * @property {ExtractCommentsOptions | undefined} extractComments
    * @property {{ implementation: MinimizerImplementation<T>, options: MinimizerOptions<T> }} minimizer
    */
  /**
    * @template T
    * @typedef {JestWorker & { transform: (options: string) => MinimizedResult, minify: (options: InternalOptions<T>) => MinimizedResult }} MinimizerWorker
    */
  /**
    * @typedef {undefined | boolean | number} Parallel
    */
  /**
    * @typedef {Object} BasePluginOptions
    * @property {Rules} [test]
    * @property {Rules} [include]
    * @property {Rules} [exclude]
    * @property {ExtractCommentsOptions} [extractComments]
    * @property {Parallel} [parallel]
    */
  /**
    * @template T
    * @typedef {T extends TerserOptions ? { minify?: MinimizerImplementation<T> | undefined, terserOptions?: MinimizerOptions<T> | undefined } : { minify: MinimizerImplementation<T>, terserOptions?: MinimizerOptions<T> | undefined }} DefinedDefaultMinimizerAndOptions
    */
  /**
    * @template T
    * @typedef {BasePluginOptions & { minimizer: { implementation: MinimizerImplementation<T>, options: MinimizerOptions<T> } }} InternalPluginOptions
    */
  /**
    * @template [T=TerserOptions]
    */
  @JSImport("terser-webpack-plugin", JSImport.Namespace)
  @js.native
  /**
    * @param {BasePluginOptions & DefinedDefaultMinimizerAndOptions<T>} [options]
    */
  open class ^[T] ()
    extends StObject
       with TerserPlugin[T] {
    def this(options: BasePluginOptions & DefinedDefaultMinimizerAndOptions[T]) = this()
    
    /**
      * @param {Compiler} compiler
      * @returns {void}
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /**
      * @private
      * @param {Compiler} compiler
      * @param {Compilation} compilation
      * @param {Record<string, import("webpack").sources.Source>} assets
      * @param {{availableNumberOfCores: number}} optimizeOptions
      * @returns {Promise<void>}
      */
    /* private */ /* CompleteClass */
    var optimize: Any = js.native
    
    /**
      * @private
      * @type {InternalPluginOptions<T>}
      */
    /* private */ /* CompleteClass */
    var options: Any = js.native
  }
  @JSImport("terser-webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @private
    * @param {any} error
    * @param {string} file
    * @param {TraceMap} [sourceMap]
    * @param {Compilation["requestShortener"]} [requestShortener]
    * @returns {Error}
    */
  /* static member */
  @JSImport("terser-webpack-plugin", "buildError")
  @js.native
  def buildError: Any = js.native
  inline def buildError_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildError")(x.asInstanceOf[js.Any])
  
  /**
    * @private
    * @param {unknown} warning
    * @param {string} file
    * @returns {Error}
    */
  /* static member */
  @JSImport("terser-webpack-plugin", "buildWarning")
  @js.native
  def buildWarning: Any = js.native
  inline def buildWarning_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildWarning")(x.asInstanceOf[js.Any])
  
  object esbuildMinify {
    
    inline def apply(
      input: typings.terserWebpackPlugin.typesUtilsMod.Input,
      sourceMap: Unit,
      minimizerOptions: typings.terserWebpackPlugin.typesUtilsMod.PredefinedOptions & typings.terserWebpackPlugin.typesUtilsMod.CustomOptions
    ): js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult]]
    inline def apply(
      input: typings.terserWebpackPlugin.typesUtilsMod.Input,
      sourceMap: typings.terserWebpackPlugin.typesUtilsMod.SourceMapInput,
      minimizerOptions: typings.terserWebpackPlugin.typesUtilsMod.PredefinedOptions & typings.terserWebpackPlugin.typesUtilsMod.CustomOptions
    ): js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult]]
    
    @JSImport("terser-webpack-plugin", "esbuildMinify")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @returns {string | undefined}
      */
    inline def getMinimizerVersion(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinimizerVersion")().asInstanceOf[js.UndefOr[String]]
  }
  
  /**
    * @private
    * @param {Parallel} parallel
    * @returns {number}
    */
  /* static member */
  @JSImport("terser-webpack-plugin", "getAvailableNumberOfCores")
  @js.native
  def getAvailableNumberOfCores: Any = js.native
  inline def getAvailableNumberOfCores_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAvailableNumberOfCores")(x.asInstanceOf[js.Any])
  
  /**
    * @private
    * @param {any} environment
    * @returns {TerserECMA}
    */
  /* static member */
  @JSImport("terser-webpack-plugin", "getEcmaVersion")
  @js.native
  def getEcmaVersion: Any = js.native
  inline def getEcmaVersion_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getEcmaVersion")(x.asInstanceOf[js.Any])
  
  /**
    * @private
    * @param {any} input
    * @returns {boolean}
    */
  /* static member */
  @JSImport("terser-webpack-plugin", "isSourceMap")
  @js.native
  def isSourceMap: Any = js.native
  inline def isSourceMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSourceMap")(x.asInstanceOf[js.Any])
  
  object swcMinify {
    
    inline def apply(
      input: typings.terserWebpackPlugin.typesUtilsMod.Input,
      sourceMap: Unit,
      minimizerOptions: typings.terserWebpackPlugin.typesUtilsMod.PredefinedOptions & typings.terserWebpackPlugin.typesUtilsMod.CustomOptions
    ): js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult]]
    inline def apply(
      input: typings.terserWebpackPlugin.typesUtilsMod.Input,
      sourceMap: typings.terserWebpackPlugin.typesUtilsMod.SourceMapInput,
      minimizerOptions: typings.terserWebpackPlugin.typesUtilsMod.PredefinedOptions & typings.terserWebpackPlugin.typesUtilsMod.CustomOptions
    ): js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult]]
    
    @JSImport("terser-webpack-plugin", "swcMinify")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @returns {string | undefined}
      */
    inline def getMinimizerVersion(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinimizerVersion")().asInstanceOf[js.UndefOr[String]]
  }
  
  object terserMinify {
    
    inline def apply(
      input: typings.terserWebpackPlugin.typesUtilsMod.Input,
      sourceMap: Unit,
      minimizerOptions: typings.terserWebpackPlugin.typesUtilsMod.PredefinedOptions & typings.terserWebpackPlugin.typesUtilsMod.CustomOptions
    ): js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult]]
    inline def apply(
      input: typings.terserWebpackPlugin.typesUtilsMod.Input,
      sourceMap: Unit,
      minimizerOptions: typings.terserWebpackPlugin.typesUtilsMod.PredefinedOptions & typings.terserWebpackPlugin.typesUtilsMod.CustomOptions,
      extractComments: typings.terserWebpackPlugin.typesUtilsMod.ExtractCommentsOptions
    ): js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any], extractComments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult]]
    inline def apply(
      input: typings.terserWebpackPlugin.typesUtilsMod.Input,
      sourceMap: typings.terserWebpackPlugin.typesUtilsMod.SourceMapInput,
      minimizerOptions: typings.terserWebpackPlugin.typesUtilsMod.PredefinedOptions & typings.terserWebpackPlugin.typesUtilsMod.CustomOptions
    ): js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult]]
    inline def apply(
      input: typings.terserWebpackPlugin.typesUtilsMod.Input,
      sourceMap: typings.terserWebpackPlugin.typesUtilsMod.SourceMapInput,
      minimizerOptions: typings.terserWebpackPlugin.typesUtilsMod.PredefinedOptions & typings.terserWebpackPlugin.typesUtilsMod.CustomOptions,
      extractComments: typings.terserWebpackPlugin.typesUtilsMod.ExtractCommentsOptions
    ): js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any], extractComments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult]]
    
    @JSImport("terser-webpack-plugin", "terserMinify")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @returns {string | undefined}
      */
    inline def getMinimizerVersion(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinimizerVersion")().asInstanceOf[js.UndefOr[String]]
  }
  
  object uglifyJsMinify {
    
    inline def apply(
      input: typings.terserWebpackPlugin.typesUtilsMod.Input,
      sourceMap: Unit,
      minimizerOptions: typings.terserWebpackPlugin.typesUtilsMod.PredefinedOptions & typings.terserWebpackPlugin.typesUtilsMod.CustomOptions
    ): js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult]]
    inline def apply(
      input: typings.terserWebpackPlugin.typesUtilsMod.Input,
      sourceMap: Unit,
      minimizerOptions: typings.terserWebpackPlugin.typesUtilsMod.PredefinedOptions & typings.terserWebpackPlugin.typesUtilsMod.CustomOptions,
      extractComments: typings.terserWebpackPlugin.typesUtilsMod.ExtractCommentsOptions
    ): js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any], extractComments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult]]
    inline def apply(
      input: typings.terserWebpackPlugin.typesUtilsMod.Input,
      sourceMap: typings.terserWebpackPlugin.typesUtilsMod.SourceMapInput,
      minimizerOptions: typings.terserWebpackPlugin.typesUtilsMod.PredefinedOptions & typings.terserWebpackPlugin.typesUtilsMod.CustomOptions
    ): js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult]]
    inline def apply(
      input: typings.terserWebpackPlugin.typesUtilsMod.Input,
      sourceMap: typings.terserWebpackPlugin.typesUtilsMod.SourceMapInput,
      minimizerOptions: typings.terserWebpackPlugin.typesUtilsMod.PredefinedOptions & typings.terserWebpackPlugin.typesUtilsMod.CustomOptions,
      extractComments: typings.terserWebpackPlugin.typesUtilsMod.ExtractCommentsOptions
    ): js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any], extractComments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.terserWebpackPlugin.typesUtilsMod.MinimizedResult]]
    
    @JSImport("terser-webpack-plugin", "uglifyJsMinify")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @returns {string | undefined}
      */
    inline def getMinimizerVersion(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinimizerVersion")().asInstanceOf[js.UndefOr[String]]
  }
  
  type Asset = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Asset */ Any
  
  trait BasePluginOptions extends StObject {
    
    var exclude: js.UndefOr[Rules] = js.undefined
    
    var extractComments: js.UndefOr[ExtractCommentsOptions] = js.undefined
    
    var include: js.UndefOr[Rules] = js.undefined
    
    var parallel: js.UndefOr[Parallel] = js.undefined
    
    var test: js.UndefOr[Rules] = js.undefined
  }
  object BasePluginOptions {
    
    inline def apply(): BasePluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasePluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BasePluginOptions] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: Rules): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: Rule*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExtractComments(value: ExtractCommentsOptions): Self = StObject.set(x, "extractComments", value.asInstanceOf[js.Any])
      
      inline def setExtractCommentsFunction2(value: (/* astNode */ Any, /* comment */ Col) => Boolean): Self = StObject.set(x, "extractComments", js.Any.fromFunction2(value))
      
      inline def setExtractCommentsUndefined: Self = StObject.set(x, "extractComments", js.undefined)
      
      inline def setInclude(value: Rules): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: Rule*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setParallel(value: Parallel): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setTest(value: Rules): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTestVarargs(value: Rule*): Self = StObject.set(x, "test", js.Array(value*))
    }
  }
  
  type BasicMinimizerImplementation[T] = js.Function4[
    /* input */ Input, 
    /* sourceMap */ js.UndefOr[SourceMapInput], 
    /* minifyOptions */ MinimizerOptions[T], 
    /* extractComments */ js.UndefOr[ExtractCommentsOptions], 
    js.Promise[MinimizedResult]
  ]
  
  type Compilation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compilation */ Any
  
  type Compiler = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ Any
  
  type CustomOptions = StringDictionary[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends terser-webpack-plugin.terser-webpack-plugin.TerserOptions ? {  minify :terser-webpack-plugin.terser-webpack-plugin.MinimizerImplementation<T> | undefined,   terserOptions :terser-webpack-plugin.terser-webpack-plugin.MinimizerOptions<T> | undefined} : {  minify :terser-webpack-plugin.terser-webpack-plugin.MinimizerImplementation<T>,   terserOptions :terser-webpack-plugin.terser-webpack-plugin.MinimizerOptions<T> | undefined}
    }}}
    */
  @js.native
  trait DefinedDefaultMinimizerAndOptions[T] extends StObject
  
  type ExtractCommentsBanner = String | Boolean | (js.Function1[/* commentsFile */ String, String])
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.terserWebpackPlugin.terserWebpackPluginStrings.all
    - typings.terserWebpackPlugin.terserWebpackPluginStrings.some
    - js.RegExp
    - typings.terserWebpackPlugin.mod.ExtractCommentsFunction
  */
  type ExtractCommentsCondition = _ExtractCommentsCondition | Boolean | js.RegExp | ExtractCommentsFunction
  
  type ExtractCommentsFilename = String | (js.Function1[/* fileData */ Any, String])
  
  type ExtractCommentsFunction = js.Function2[/* astNode */ Any, /* comment */ Col, Boolean]
  
  trait ExtractCommentsObject
    extends StObject
       with _ExtractCommentsOptions {
    
    var banner: js.UndefOr[ExtractCommentsBanner] = js.undefined
    
    var condition: js.UndefOr[ExtractCommentsCondition] = js.undefined
    
    var filename: js.UndefOr[ExtractCommentsFilename] = js.undefined
  }
  object ExtractCommentsObject {
    
    inline def apply(): ExtractCommentsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractCommentsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtractCommentsObject] (val x: Self) extends AnyVal {
      
      inline def setBanner(value: ExtractCommentsBanner): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
      
      inline def setBannerFunction1(value: /* commentsFile */ String => String): Self = StObject.set(x, "banner", js.Any.fromFunction1(value))
      
      inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
      
      inline def setCondition(value: ExtractCommentsCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionFunction2(value: (/* astNode */ Any, /* comment */ Col) => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction2(value))
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setFilename(value: ExtractCommentsFilename): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameFunction1(value: /* fileData */ Any => String): Self = StObject.set(x, "filename", js.Any.fromFunction1(value))
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.terserWebpackPlugin.mod.ExtractCommentsCondition
    - typings.terserWebpackPlugin.mod.ExtractCommentsObject
  */
  type ExtractCommentsOptions = _ExtractCommentsOptions | Boolean | js.RegExp | ExtractCommentsFunction
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends infer U ? U : terser-webpack-plugin.terser-webpack-plugin.CustomOptions
    }}}
    */
  type InferDefaultType[T] = CustomOptions
  
  type Input = StringDictionary[String]
  
  trait InternalOptions[T] extends StObject {
    
    var extractComments: js.UndefOr[ExtractCommentsOptions] = js.undefined
    
    var input: String
    
    var inputSourceMap: js.UndefOr[SourceMapInput] = js.undefined
    
    var minimizer: Implementation[T]
    
    var name: String
  }
  object InternalOptions {
    
    inline def apply[T](input: String, minimizer: Implementation[T], name: String): InternalOptions[T] = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], minimizer = minimizer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalOptions[?], T] (val x: Self & InternalOptions[T]) extends AnyVal {
      
      inline def setExtractComments(value: ExtractCommentsOptions): Self = StObject.set(x, "extractComments", value.asInstanceOf[js.Any])
      
      inline def setExtractCommentsFunction2(value: (/* astNode */ Any, /* comment */ Col) => Boolean): Self = StObject.set(x, "extractComments", js.Any.fromFunction2(value))
      
      inline def setExtractCommentsUndefined: Self = StObject.set(x, "extractComments", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputSourceMap(value: SourceMapInput): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
      
      inline def setInputSourceMapUndefined: Self = StObject.set(x, "inputSourceMap", js.undefined)
      
      inline def setMinimizer(value: Implementation[T]): Self = StObject.set(x, "minimizer", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalPluginOptions[T]
    extends StObject
       with BasePluginOptions {
    
    var minimizer: Implementation[T]
  }
  object InternalPluginOptions {
    
    inline def apply[T](minimizer: Implementation[T]): InternalPluginOptions[T] = {
      val __obj = js.Dynamic.literal(minimizer = minimizer.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalPluginOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalPluginOptions[?], T] (val x: Self & InternalPluginOptions[T]) extends AnyVal {
      
      inline def setMinimizer(value: Implementation[T]): Self = StObject.set(x, "minimizer", value.asInstanceOf[js.Any])
    }
  }
  
  type JestWorker = Worker
  
  trait MinimizeFunctionHelpers extends StObject {
    
    var getMinimizerVersion: js.UndefOr[js.Function0[js.UndefOr[String]]] = js.undefined
  }
  object MinimizeFunctionHelpers {
    
    inline def apply(): MinimizeFunctionHelpers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinimizeFunctionHelpers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinimizeFunctionHelpers] (val x: Self) extends AnyVal {
      
      inline def setGetMinimizerVersion(value: () => js.UndefOr[String]): Self = StObject.set(x, "getMinimizerVersion", js.Any.fromFunction0(value))
      
      inline def setGetMinimizerVersionUndefined: Self = StObject.set(x, "getMinimizerVersion", js.undefined)
    }
  }
  
  trait MinimizedResult extends StObject {
    
    var code: String
    
    var errors: js.UndefOr[js.Array[String | js.Error]] = js.undefined
    
    var extractedComments: js.UndefOr[js.Array[String]] = js.undefined
    
    var map: js.UndefOr[typings.jridgewellTraceMapping.distTypesTypesMod.SourceMapInput] = js.undefined
    
    var warnings: js.UndefOr[js.Array[String | js.Error]] = js.undefined
  }
  object MinimizedResult {
    
    inline def apply(code: String): MinimizedResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinimizedResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinimizedResult] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[String | js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: (String | js.Error)*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setExtractedComments(value: js.Array[String]): Self = StObject.set(x, "extractedComments", value.asInstanceOf[js.Any])
      
      inline def setExtractedCommentsUndefined: Self = StObject.set(x, "extractedComments", js.undefined)
      
      inline def setExtractedCommentsVarargs(value: String*): Self = StObject.set(x, "extractedComments", js.Array(value*))
      
      inline def setMap(value: typings.jridgewellTraceMapping.distTypesTypesMod.SourceMapInput): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setWarnings(value: js.Array[String | js.Error]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      inline def setWarningsVarargs(value: (String | js.Error)*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  @js.native
  trait MinimizerImplementation[T]
    extends BasicMinimizerImplementation[T]
       with MinimizeFunctionHelpers {
    
    /* InferMemberOverrides */
    override def apply(
      arg1: /* input */ Input,
      arg2: /* sourceMap */ js.UndefOr[SourceMapInput],
      arg3: /* minifyOptions */ MinimizerOptions[T],
      arg4: /* extractComments */ js.UndefOr[ExtractCommentsOptions]
    ): js.Promise[MinimizedResult] = js.native
  }
  
  type MinimizerOptions[T] = PredefinedOptions & InferDefaultType[T]
  
  @js.native
  trait MinimizerWorker[T]
    extends StObject
       with typings.std.Worker {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def minify(options: InternalOptions[T]): MinimizedResult = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    def transform(options: String): MinimizedResult = js.native
  }
  
  type Parallel = js.UndefOr[Boolean | Double]
  
  trait PredefinedOptions extends StObject {
    
    var ecma: js.UndefOr[ECMA] = js.undefined
    
    var module: js.UndefOr[Boolean] = js.undefined
  }
  object PredefinedOptions {
    
    inline def apply(): PredefinedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PredefinedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PredefinedOptions] (val x: Self) extends AnyVal {
      
      inline def setEcma(value: ECMA): Self = StObject.set(x, "ecma", value.asInstanceOf[js.Any])
      
      inline def setEcmaUndefined: Self = StObject.set(x, "ecma", js.undefined)
      
      inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    }
  }
  
  type Rule = js.RegExp | String
  
  type Rules = js.Array[Rule] | Rule
  
  type Schema = typings.schemaUtils.declarationsValidateMod.Schema
  
  type SourceMapInput = typings.jridgewellTraceMapping.distTypesTypesMod.SourceMapInput
  
  type TerserECMA = typings.terserWebpackPlugin.typesUtilsMod.TerserECMA
  
  type TerserOptions = typings.terserWebpackPlugin.typesUtilsMod.TerserOptions
  
  /** @typedef {import("schema-utils/declarations/validate").Schema} Schema */
  /** @typedef {import("webpack").Compiler} Compiler */
  /** @typedef {import("webpack").Compilation} Compilation */
  /** @typedef {import("webpack").WebpackError} WebpackError */
  /** @typedef {import("webpack").Asset} Asset */
  /** @typedef {import("./utils.js").TerserECMA} TerserECMA */
  /** @typedef {import("./utils.js").TerserOptions} TerserOptions */
  /** @typedef {import("jest-worker").Worker} JestWorker */
  /** @typedef {import("@jridgewell/trace-mapping").SourceMapInput} SourceMapInput */
  /** @typedef {RegExp | string} Rule */
  /** @typedef {Rule[] | Rule} Rules */
  /**
    * @callback ExtractCommentsFunction
    * @param {any} astNode
    * @param {{ value: string, type: 'comment1' | 'comment2' | 'comment3' | 'comment4', pos: number, line: number, col: number }} comment
    * @returns {boolean}
    */
  /**
    * @typedef {boolean | 'all' | 'some' | RegExp | ExtractCommentsFunction} ExtractCommentsCondition
    */
  /**
    * @typedef {string | ((fileData: any) => string)} ExtractCommentsFilename
    */
  /**
    * @typedef {boolean | string | ((commentsFile: string) => string)} ExtractCommentsBanner
    */
  /**
    * @typedef {Object} ExtractCommentsObject
    * @property {ExtractCommentsCondition} [condition]
    * @property {ExtractCommentsFilename} [filename]
    * @property {ExtractCommentsBanner} [banner]
    */
  /**
    * @typedef {ExtractCommentsCondition | ExtractCommentsObject} ExtractCommentsOptions
    */
  /**
    * @typedef {Object} MinimizedResult
    * @property {string} code
    * @property {SourceMapInput} [map]
    * @property {Array<Error | string>} [errors]
    * @property {Array<Error | string>} [warnings]
    * @property {Array<string>} [extractedComments]
    */
  /**
    * @typedef {{ [file: string]: string }} Input
    */
  /**
    * @typedef {{ [key: string]: any }} CustomOptions
    */
  /**
    * @template T
    * @typedef {T extends infer U ? U : CustomOptions} InferDefaultType
    */
  /**
    * @typedef {Object} PredefinedOptions
    * @property {boolean} [module]
    * @property {TerserECMA} [ecma]
    */
  /**
    * @template T
    * @typedef {PredefinedOptions & InferDefaultType<T>} MinimizerOptions
    */
  /**
    * @template T
    * @callback BasicMinimizerImplementation
    * @param {Input} input
    * @param {SourceMapInput | undefined} sourceMap
    * @param {MinimizerOptions<T>} minifyOptions
    * @param {ExtractCommentsOptions | undefined} extractComments
    * @returns {Promise<MinimizedResult>}
    */
  /**
    * @typedef {object} MinimizeFunctionHelpers
    * @property {() => string | undefined} [getMinimizerVersion]
    */
  /**
    * @template T
    * @typedef {BasicMinimizerImplementation<T> & MinimizeFunctionHelpers} MinimizerImplementation
    */
  /**
    * @template T
    * @typedef {Object} InternalOptions
    * @property {string} name
    * @property {string} input
    * @property {SourceMapInput | undefined} inputSourceMap
    * @property {ExtractCommentsOptions | undefined} extractComments
    * @property {{ implementation: MinimizerImplementation<T>, options: MinimizerOptions<T> }} minimizer
    */
  /**
    * @template T
    * @typedef {JestWorker & { transform: (options: string) => MinimizedResult, minify: (options: InternalOptions<T>) => MinimizedResult }} MinimizerWorker
    */
  /**
    * @typedef {undefined | boolean | number} Parallel
    */
  /**
    * @typedef {Object} BasePluginOptions
    * @property {Rules} [test]
    * @property {Rules} [include]
    * @property {Rules} [exclude]
    * @property {ExtractCommentsOptions} [extractComments]
    * @property {Parallel} [parallel]
    */
  /**
    * @template T
    * @typedef {T extends TerserOptions ? { minify?: MinimizerImplementation<T> | undefined, terserOptions?: MinimizerOptions<T> | undefined } : { minify: MinimizerImplementation<T>, terserOptions?: MinimizerOptions<T> | undefined }} DefinedDefaultMinimizerAndOptions
    */
  /**
    * @template T
    * @typedef {BasePluginOptions & { minimizer: { implementation: MinimizerImplementation<T>, options: MinimizerOptions<T> } }} InternalPluginOptions
    */
  /**
    * @template [T=TerserOptions]
    */
  trait TerserPlugin[T] extends StObject {
    
    /**
      * @param {Compiler} compiler
      * @returns {void}
      */
    @JSName("apply")
    def apply(compiler: Compiler): Unit
    
    /**
      * @private
      * @param {Compiler} compiler
      * @param {Compilation} compilation
      * @param {Record<string, import("webpack").sources.Source>} assets
      * @param {{availableNumberOfCores: number}} optimizeOptions
      * @returns {Promise<void>}
      */
    /* private */ var optimize: Any
    
    /**
      * @private
      * @type {InternalPluginOptions<T>}
      */
    /* private */ var options: Any
  }
  object TerserPlugin {
    
    inline def apply[T](apply: Compiler => Unit, optimize: Any, options: Any): TerserPlugin[T] = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), optimize = optimize.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[TerserPlugin[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TerserPlugin[?], T] (val x: Self & TerserPlugin[T]) extends AnyVal {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setOptimize(value: Any): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type WebpackError = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.WebpackError */ Any
  
  trait _ExtractCommentsCondition
    extends StObject
       with _ExtractCommentsOptions
  
  trait _ExtractCommentsOptions extends StObject
}
