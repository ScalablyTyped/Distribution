package typings.tsNode

import typings.makeError.mod.BaseError
import typings.tsNode.anon.FnCall
import typings.tsNode.anon.FnCallDiagNewLineIndent
import typings.tsNode.anon.FnCallHostDocumentRegistrySyntaxOnlyOrLanguageServiceMode
import typings.tsNode.anon.FnCallProgramSourceFileCancellationToken
import typings.tsNode.anon.FnCallSearchPathFileExistsConfigName
import typings.tsNode.anon.TypeofScriptSnapshot
import typings.typescript.anon.Config
import typings.typescript.mod.CancellationToken
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.CustomTransformers
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.DiagnosticMessageChain
import typings.typescript.mod.DocumentRegistry
import typings.typescript.mod.ExtendedConfigCacheEntry
import typings.typescript.mod.FileExtensionInfo
import typings.typescript.mod.FormatDiagnosticsHost
import typings.typescript.mod.LanguageService
import typings.typescript.mod.LanguageServiceHost
import typings.typescript.mod.LanguageServiceMode
import typings.typescript.mod.Map
import typings.typescript.mod.ParseConfigHost
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.Path
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import typings.typescript.mod.SymbolDisplayPart
import typings.typescript.mod.System
import typings.typescript.mod.TranspileOptions
import typings.typescript.mod.TranspileOutput
import typings.typescript.mod.WatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ts-node", "DEFAULTS")
  @js.native
  val DEFAULTS: Options = js.native
  
  @JSImport("ts-node", "INSPECT_CUSTOM")
  @js.native
  val INSPECT_CUSTOM: js.Symbol = js.native
  
  @JSImport("ts-node", "TSError")
  @js.native
  class TSError protected () extends BaseError {
    def this(diagnosticText: String, diagnosticCodes: js.Array[Double]) = this()
    
    var diagnosticCodes: js.Array[Double] = js.native
    
    var diagnosticText: String = js.native
  }
  
  @JSImport("ts-node", "VERSION")
  @js.native
  val VERSION: js.Any = js.native
  
  @scala.inline
  def normalizeSlashes(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSlashes")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parse(): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[js.UndefOr[js.Object]]
  @scala.inline
  def parse(value: String): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Object]]
  
  @scala.inline
  def register(): Register_ = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Register_]
  @scala.inline
  def register(opts: Options): Register_ = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(opts.asInstanceOf[js.Any]).asInstanceOf[Register_]
  
  @scala.inline
  def split(): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")().asInstanceOf[js.UndefOr[js.Array[String]]]
  @scala.inline
  def split(value: String): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
  
  trait Options extends StObject {
    
    var cache: js.UndefOr[Boolean | Null] = js.undefined
    
    var cacheDirectory: js.UndefOr[String] = js.undefined
    
    var compiler: js.UndefOr[String] = js.undefined
    
    var compilerOptions: js.UndefOr[js.Object] = js.undefined
    
    var fileExists: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.undefined
    
    var files: js.UndefOr[Boolean | Null] = js.undefined
    
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ignoreDiagnostics: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
    
    var pretty: js.UndefOr[Boolean | Null] = js.undefined
    
    var project: js.UndefOr[String] = js.undefined
    
    var readFile: js.UndefOr[js.Function1[/* path */ String, js.UndefOr[String]]] = js.undefined
    
    var skipIgnore: js.UndefOr[Boolean | Null] = js.undefined
    
    var skipProject: js.UndefOr[Boolean | Null] = js.undefined
    
    var transformers: js.UndefOr[CustomTransformers] = js.undefined
    
    var transpileOnly: js.UndefOr[Boolean | Null] = js.undefined
    
    var typeCheck: js.UndefOr[Boolean | Null] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      @scala.inline
      def setCacheNull: Self = StObject.set(x, "cache", null)
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCompiler(value: String): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptions(value: js.Object): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      @scala.inline
      def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      @scala.inline
      def setFileExists(value: /* path */ String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFileExistsUndefined: Self = StObject.set(x, "fileExists", js.undefined)
      
      @scala.inline
      def setFiles(value: Boolean): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesNull: Self = StObject.set(x, "files", null)
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDiagnostics(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "ignoreDiagnostics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDiagnosticsUndefined: Self = StObject.set(x, "ignoreDiagnostics", js.undefined)
      
      @scala.inline
      def setIgnoreDiagnosticsVarargs(value: (Double | String)*): Self = StObject.set(x, "ignoreDiagnostics", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyNull: Self = StObject.set(x, "pretty", null)
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      @scala.inline
      def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setReadFile(value: /* path */ String => js.UndefOr[String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
      
      @scala.inline
      def setSkipIgnore(value: Boolean): Self = StObject.set(x, "skipIgnore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIgnoreNull: Self = StObject.set(x, "skipIgnore", null)
      
      @scala.inline
      def setSkipIgnoreUndefined: Self = StObject.set(x, "skipIgnore", js.undefined)
      
      @scala.inline
      def setSkipProject(value: Boolean): Self = StObject.set(x, "skipProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipProjectNull: Self = StObject.set(x, "skipProject", null)
      
      @scala.inline
      def setSkipProjectUndefined: Self = StObject.set(x, "skipProject", js.undefined)
      
      @scala.inline
      def setTransformers(value: CustomTransformers): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
      
      @scala.inline
      def setTranspileOnly(value: Boolean): Self = StObject.set(x, "transpileOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranspileOnlyNull: Self = StObject.set(x, "transpileOnly", null)
      
      @scala.inline
      def setTranspileOnlyUndefined: Self = StObject.set(x, "transpileOnly", js.undefined)
      
      @scala.inline
      def setTypeCheck(value: Boolean): Self = StObject.set(x, "typeCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeCheckNull: Self = StObject.set(x, "typeCheck", null)
      
      @scala.inline
      def setTypeCheckUndefined: Self = StObject.set(x, "typeCheck", js.undefined)
    }
  }
  
  @js.native
  trait Register_ extends StObject {
    
    var cachedir: String = js.native
    
    def compile(code: String, fileName: String): String = js.native
    def compile(code: String, fileName: String, lineOffset: Double): String = js.native
    
    var cwd: String = js.native
    
    var extensions: js.Array[String] = js.native
    
    def getTypeInfo(code: String, fileName: String, position: Double): TypeInfo = js.native
    
    var ts: TSCommon = js.native
  }
  
  trait TSCommon extends StObject {
    
    var ModuleKind: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleKind */ js.Any
    
    var ScriptSnapshot: TypeofScriptSnapshot
    
    var ScriptTarget: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ScriptTarget */ js.Any
    
    def createLanguageService(host: LanguageServiceHost): LanguageService
    def createLanguageService(host: LanguageServiceHost, documentRegistry: Unit, syntaxOnlyOrLanguageServiceMode: Boolean): LanguageService
    def createLanguageService(
      host: LanguageServiceHost,
      documentRegistry: Unit,
      syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
    ): LanguageService
    def createLanguageService(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService
    def createLanguageService(
      host: LanguageServiceHost,
      documentRegistry: DocumentRegistry,
      syntaxOnlyOrLanguageServiceMode: Boolean
    ): LanguageService
    def createLanguageService(
      host: LanguageServiceHost,
      documentRegistry: DocumentRegistry,
      syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
    ): LanguageService
    @JSName("createLanguageService")
    var createLanguageService_Original: FnCallHostDocumentRegistrySyntaxOnlyOrLanguageServiceMode
    
    def displayPartsToString(): String
    def displayPartsToString(displayParts: js.Array[SymbolDisplayPart]): String
    @JSName("displayPartsToString")
    var displayPartsToString_Original: FnCall
    
    def findConfigFile(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean]): js.UndefOr[String]
    def findConfigFile(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean], configName: String): js.UndefOr[String]
    @JSName("findConfigFile")
    var findConfigFile_Original: FnCallSearchPathFileExistsConfigName
    
    def flattenDiagnosticMessageText(diag: String, newLine: String): String
    def flattenDiagnosticMessageText(diag: String, newLine: String, indent: Double): String
    def flattenDiagnosticMessageText(diag: Unit, newLine: String): String
    def flattenDiagnosticMessageText(diag: Unit, newLine: String, indent: Double): String
    def flattenDiagnosticMessageText(diag: DiagnosticMessageChain, newLine: String): String
    def flattenDiagnosticMessageText(diag: DiagnosticMessageChain, newLine: String, indent: Double): String
    @JSName("flattenDiagnosticMessageText")
    var flattenDiagnosticMessageText_Original: FnCallDiagNewLineIndent
    
    def formatDiagnostics(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): String
    
    def formatDiagnosticsWithColorAndContext(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): String
    @JSName("formatDiagnosticsWithColorAndContext")
    var formatDiagnosticsWithColorAndContext_Original: js.Function2[/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost, String]
    
    @JSName("formatDiagnostics")
    var formatDiagnostics_Original: js.Function2[/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost, String]
    
    def getDefaultLibFilePath(options: CompilerOptions): String
    @JSName("getDefaultLibFilePath")
    var getDefaultLibFilePath_Original: js.Function1[/* options */ CompilerOptions, String]
    
    def getPreEmitDiagnostics(program: Program): js.Array[Diagnostic]
    def getPreEmitDiagnostics(program: Program, sourceFile: Unit, cancellationToken: CancellationToken): js.Array[Diagnostic]
    def getPreEmitDiagnostics(program: Program, sourceFile: SourceFile): js.Array[Diagnostic]
    def getPreEmitDiagnostics(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic]
    @JSName("getPreEmitDiagnostics")
    var getPreEmitDiagnostics_Original: FnCallProgramSourceFileCancellationToken
    
    def parseJsonConfigFileContent(
      json: js.Any,
      host: ParseConfigHost,
      basePath: String,
      existingOptions: js.UndefOr[CompilerOptions],
      configFileName: js.UndefOr[String],
      resolutionStack: js.UndefOr[js.Array[Path]],
      extraFileExtensions: js.UndefOr[js.Array[FileExtensionInfo]],
      extendedConfigCache: js.UndefOr[Map[ExtendedConfigCacheEntry]],
      existingWatchOptions: js.UndefOr[WatchOptions]
    ): ParsedCommandLine
    @JSName("parseJsonConfigFileContent")
    var parseJsonConfigFileContent_Original: js.Function9[
        /* json */ js.Any, 
        /* host */ ParseConfigHost, 
        /* basePath */ String, 
        /* existingOptions */ js.UndefOr[CompilerOptions], 
        /* configFileName */ js.UndefOr[String], 
        /* resolutionStack */ js.UndefOr[js.Array[Path]], 
        /* extraFileExtensions */ js.UndefOr[js.Array[FileExtensionInfo]], 
        /* extendedConfigCache */ js.UndefOr[Map[ExtendedConfigCacheEntry]], 
        /* existingWatchOptions */ js.UndefOr[WatchOptions], 
        ParsedCommandLine
      ]
    
    def readConfigFile(fileName: String, readFile: js.Function1[/* path */ String, js.UndefOr[String]]): Config
    @JSName("readConfigFile")
    var readConfigFile_Original: js.Function2[
        /* fileName */ String, 
        /* readFile */ js.Function1[/* path */ String, js.UndefOr[String]], 
        Config
      ]
    
    var sys: System
    
    def transpileModule(input: String, transpileOptions: TranspileOptions): TranspileOutput
    @JSName("transpileModule")
    var transpileModule_Original: js.Function2[/* input */ String, /* transpileOptions */ TranspileOptions, TranspileOutput]
    
    var version: String
  }
  object TSCommon {
    
    @scala.inline
    def apply(
      ModuleKind: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleKind */ js.Any,
      ScriptSnapshot: TypeofScriptSnapshot,
      ScriptTarget: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ScriptTarget */ js.Any,
      createLanguageService: FnCallHostDocumentRegistrySyntaxOnlyOrLanguageServiceMode,
      displayPartsToString: FnCall,
      findConfigFile: FnCallSearchPathFileExistsConfigName,
      flattenDiagnosticMessageText: FnCallDiagNewLineIndent,
      formatDiagnostics: (/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost) => String,
      formatDiagnosticsWithColorAndContext: (/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost) => String,
      getDefaultLibFilePath: /* options */ CompilerOptions => String,
      getPreEmitDiagnostics: FnCallProgramSourceFileCancellationToken,
      parseJsonConfigFileContent: (/* json */ js.Any, /* host */ ParseConfigHost, /* basePath */ String, /* existingOptions */ js.UndefOr[CompilerOptions], /* configFileName */ js.UndefOr[String], /* resolutionStack */ js.UndefOr[js.Array[Path]], /* extraFileExtensions */ js.UndefOr[js.Array[FileExtensionInfo]], /* extendedConfigCache */ js.UndefOr[Map[ExtendedConfigCacheEntry]], /* existingWatchOptions */ js.UndefOr[WatchOptions]) => ParsedCommandLine,
      readConfigFile: (/* fileName */ String, /* readFile */ js.Function1[/* path */ String, js.UndefOr[String]]) => Config,
      sys: System,
      transpileModule: (/* input */ String, /* transpileOptions */ TranspileOptions) => TranspileOutput,
      version: String
    ): TSCommon = {
      val __obj = js.Dynamic.literal(ModuleKind = ModuleKind.asInstanceOf[js.Any], ScriptSnapshot = ScriptSnapshot.asInstanceOf[js.Any], ScriptTarget = ScriptTarget.asInstanceOf[js.Any], createLanguageService = createLanguageService.asInstanceOf[js.Any], displayPartsToString = displayPartsToString.asInstanceOf[js.Any], findConfigFile = findConfigFile.asInstanceOf[js.Any], flattenDiagnosticMessageText = flattenDiagnosticMessageText.asInstanceOf[js.Any], formatDiagnostics = js.Any.fromFunction2(formatDiagnostics), formatDiagnosticsWithColorAndContext = js.Any.fromFunction2(formatDiagnosticsWithColorAndContext), getDefaultLibFilePath = js.Any.fromFunction1(getDefaultLibFilePath), getPreEmitDiagnostics = getPreEmitDiagnostics.asInstanceOf[js.Any], parseJsonConfigFileContent = js.Any.fromFunction9(parseJsonConfigFileContent), readConfigFile = js.Any.fromFunction2(readConfigFile), sys = sys.asInstanceOf[js.Any], transpileModule = js.Any.fromFunction2(transpileModule), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSCommon]
    }
    
    @scala.inline
    implicit class TSCommonMutableBuilder[Self <: TSCommon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateLanguageService(value: FnCallHostDocumentRegistrySyntaxOnlyOrLanguageServiceMode): Self = StObject.set(x, "createLanguageService", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayPartsToString(value: FnCall): Self = StObject.set(x, "displayPartsToString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindConfigFile(value: FnCallSearchPathFileExistsConfigName): Self = StObject.set(x, "findConfigFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenDiagnosticMessageText(value: FnCallDiagNewLineIndent): Self = StObject.set(x, "flattenDiagnosticMessageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatDiagnostics(value: (/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost) => String): Self = StObject.set(x, "formatDiagnostics", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatDiagnosticsWithColorAndContext(value: (/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost) => String): Self = StObject.set(x, "formatDiagnosticsWithColorAndContext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDefaultLibFilePath(value: /* options */ CompilerOptions => String): Self = StObject.set(x, "getDefaultLibFilePath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPreEmitDiagnostics(value: FnCallProgramSourceFileCancellationToken): Self = StObject.set(x, "getPreEmitDiagnostics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleKind(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleKind */ js.Any
      ): Self = StObject.set(x, "ModuleKind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseJsonConfigFileContent(
        value: (/* json */ js.Any, /* host */ ParseConfigHost, /* basePath */ String, /* existingOptions */ js.UndefOr[CompilerOptions], /* configFileName */ js.UndefOr[String], /* resolutionStack */ js.UndefOr[js.Array[Path]], /* extraFileExtensions */ js.UndefOr[js.Array[FileExtensionInfo]], /* extendedConfigCache */ js.UndefOr[Map[ExtendedConfigCacheEntry]], /* existingWatchOptions */ js.UndefOr[WatchOptions]) => ParsedCommandLine
      ): Self = StObject.set(x, "parseJsonConfigFileContent", js.Any.fromFunction9(value))
      
      @scala.inline
      def setReadConfigFile(
        value: (/* fileName */ String, /* readFile */ js.Function1[/* path */ String, js.UndefOr[String]]) => Config
      ): Self = StObject.set(x, "readConfigFile", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScriptSnapshot(value: TypeofScriptSnapshot): Self = StObject.set(x, "ScriptSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptTarget(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ScriptTarget */ js.Any
      ): Self = StObject.set(x, "ScriptTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: System): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranspileModule(value: (/* input */ String, /* transpileOptions */ TranspileOptions) => TranspileOutput): Self = StObject.set(x, "transpileModule", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeInfo extends StObject {
    
    var comment: String
    
    var name: String
  }
  object TypeInfo {
    
    @scala.inline
    def apply(comment: String, name: String): TypeInfo = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeInfo]
    }
    
    @scala.inline
    implicit class TypeInfoMutableBuilder[Self <: TypeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
