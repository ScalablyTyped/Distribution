package typings.tsNode.mod

import typings.tsNode.anon.FnCall
import typings.tsNode.anon.FnCallDiagNewLineIndent
import typings.tsNode.anon.FnCallHostDocumentRegistrySyntaxOnly
import typings.tsNode.anon.FnCallProgramSourceFileCancellationToken
import typings.tsNode.anon.FnCallSearchPathFileExistsConfigName
import typings.tsNode.anon.TypeofScriptSnapshot
import typings.typescript.anon.Config
import typings.typescript.mod.CancellationToken
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.DiagnosticMessageChain
import typings.typescript.mod.DocumentRegistry
import typings.typescript.mod.ExtendedConfigCacheEntry
import typings.typescript.mod.FileExtensionInfo
import typings.typescript.mod.FormatDiagnosticsHost
import typings.typescript.mod.LanguageService
import typings.typescript.mod.LanguageServiceHost
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSCommon extends js.Object {
  var ModuleKind: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleKind */ js.Any = js.native
  var ScriptSnapshot: TypeofScriptSnapshot = js.native
  var ScriptTarget: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ScriptTarget */ js.Any = js.native
  @JSName("createLanguageService")
  var createLanguageService_Original: FnCallHostDocumentRegistrySyntaxOnly = js.native
  @JSName("displayPartsToString")
  var displayPartsToString_Original: FnCall = js.native
  @JSName("findConfigFile")
  var findConfigFile_Original: FnCallSearchPathFileExistsConfigName = js.native
  @JSName("flattenDiagnosticMessageText")
  var flattenDiagnosticMessageText_Original: FnCallDiagNewLineIndent = js.native
  @JSName("formatDiagnosticsWithColorAndContext")
  var formatDiagnosticsWithColorAndContext_Original: js.Function2[/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost, String] = js.native
  @JSName("formatDiagnostics")
  var formatDiagnostics_Original: js.Function2[/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost, String] = js.native
  @JSName("getDefaultLibFilePath")
  var getDefaultLibFilePath_Original: js.Function1[/* options */ CompilerOptions, String] = js.native
  @JSName("getPreEmitDiagnostics")
  var getPreEmitDiagnostics_Original: FnCallProgramSourceFileCancellationToken = js.native
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
  ] = js.native
  @JSName("readConfigFile")
  var readConfigFile_Original: js.Function2[
    /* fileName */ String, 
    /* readFile */ js.Function1[/* path */ String, js.UndefOr[String]], 
    Config
  ] = js.native
  var sys: System = js.native
  @JSName("transpileModule")
  var transpileModule_Original: js.Function2[/* input */ String, /* transpileOptions */ TranspileOptions, TranspileOutput] = js.native
  var version: String = js.native
  def createLanguageService(host: LanguageServiceHost): LanguageService = js.native
  def createLanguageService(host: LanguageServiceHost, documentRegistry: js.UndefOr[scala.Nothing], syntaxOnly: Boolean): LanguageService = js.native
  def createLanguageService(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService = js.native
  def createLanguageService(host: LanguageServiceHost, documentRegistry: DocumentRegistry, syntaxOnly: Boolean): LanguageService = js.native
  def displayPartsToString(): String = js.native
  def displayPartsToString(displayParts: js.Array[SymbolDisplayPart]): String = js.native
  def findConfigFile(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean]): js.UndefOr[String] = js.native
  def findConfigFile(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean], configName: String): js.UndefOr[String] = js.native
  def flattenDiagnosticMessageText(diag: js.UndefOr[scala.Nothing], newLine: String): String = js.native
  def flattenDiagnosticMessageText(diag: js.UndefOr[scala.Nothing], newLine: String, indent: Double): String = js.native
  def flattenDiagnosticMessageText(diag: String, newLine: String): String = js.native
  def flattenDiagnosticMessageText(diag: String, newLine: String, indent: Double): String = js.native
  def flattenDiagnosticMessageText(diag: DiagnosticMessageChain, newLine: String): String = js.native
  def flattenDiagnosticMessageText(diag: DiagnosticMessageChain, newLine: String, indent: Double): String = js.native
  def formatDiagnostics(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): String = js.native
  def formatDiagnosticsWithColorAndContext(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): String = js.native
  def getDefaultLibFilePath(options: CompilerOptions): String = js.native
  def getPreEmitDiagnostics(program: Program): js.Array[Diagnostic] = js.native
  def getPreEmitDiagnostics(program: Program, sourceFile: js.UndefOr[scala.Nothing], cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  def getPreEmitDiagnostics(program: Program, sourceFile: SourceFile): js.Array[Diagnostic] = js.native
  def getPreEmitDiagnostics(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
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
  ): ParsedCommandLine = js.native
  def readConfigFile(fileName: String, readFile: js.Function1[/* path */ String, js.UndefOr[String]]): Config = js.native
  def transpileModule(input: String, transpileOptions: TranspileOptions): TranspileOutput = js.native
}

