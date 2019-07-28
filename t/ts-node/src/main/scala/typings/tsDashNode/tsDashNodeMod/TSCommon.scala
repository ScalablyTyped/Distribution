package typings.tsDashNode.tsDashNodeMod

import typings.tsDashNode.Fn_BasePath
import typings.tsDashNode.Fn_CancellationToken
import typings.tsDashNode.Fn_ConfigName
import typings.tsDashNode.Fn_DisplayParts
import typings.tsDashNode.Fn_DocumentRegistry
import typings.tsDashNode.Fn_MessageText
import typings.tsDashNode.TypeofScriptSnapshot
import typings.typescript.Anon_Config
import typings.typescript.typescriptMod.CancellationToken
import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.Diagnostic
import typings.typescript.typescriptMod.DiagnosticMessageChain
import typings.typescript.typescriptMod.DocumentRegistry
import typings.typescript.typescriptMod.ExtendedConfigCacheEntry
import typings.typescript.typescriptMod.FileExtensionInfo
import typings.typescript.typescriptMod.FormatDiagnosticsHost
import typings.typescript.typescriptMod.LanguageService
import typings.typescript.typescriptMod.LanguageServiceHost
import typings.typescript.typescriptMod.Map
import typings.typescript.typescriptMod.ParseConfigHost
import typings.typescript.typescriptMod.ParsedCommandLine
import typings.typescript.typescriptMod.Path
import typings.typescript.typescriptMod.Program
import typings.typescript.typescriptMod.SourceFile
import typings.typescript.typescriptMod.SymbolDisplayPart
import typings.typescript.typescriptMod.System
import typings.typescript.typescriptMod.TranspileOptions
import typings.typescript.typescriptMod.TranspileOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSCommon extends js.Object {
  var ModuleKind: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleKind */ js.Any = js.native
  var ScriptSnapshot: TypeofScriptSnapshot = js.native
  var ScriptTarget: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ScriptTarget */ js.Any = js.native
  @JSName("createLanguageService")
  var createLanguageService_Original: Fn_DocumentRegistry = js.native
  @JSName("displayPartsToString")
  var displayPartsToString_Original: Fn_DisplayParts = js.native
  @JSName("findConfigFile")
  var findConfigFile_Original: Fn_ConfigName = js.native
  @JSName("flattenDiagnosticMessageText")
  var flattenDiagnosticMessageText_Original: Fn_MessageText = js.native
  @JSName("formatDiagnosticsWithColorAndContext")
  var formatDiagnosticsWithColorAndContext_Original: js.Function2[/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost, String] = js.native
  @JSName("formatDiagnostics")
  var formatDiagnostics_Original: js.Function2[/* diagnostics */ js.Array[Diagnostic], /* host */ FormatDiagnosticsHost, String] = js.native
  @JSName("getDefaultLibFilePath")
  var getDefaultLibFilePath_Original: js.Function1[/* options */ CompilerOptions, String] = js.native
  @JSName("getPreEmitDiagnostics")
  var getPreEmitDiagnostics_Original: Fn_CancellationToken = js.native
  @JSName("parseJsonConfigFileContent")
  var parseJsonConfigFileContent_Original: Fn_BasePath = js.native
  @JSName("readConfigFile")
  var readConfigFile_Original: js.Function2[
    /* fileName */ String, 
    /* readFile */ js.Function1[/* path */ String, js.UndefOr[String]], 
    Anon_Config
  ] = js.native
  var sys: System = js.native
  @JSName("transpileModule")
  var transpileModule_Original: js.Function2[/* input */ String, /* transpileOptions */ TranspileOptions, TranspileOutput] = js.native
  var version: String = js.native
  def createLanguageService(host: LanguageServiceHost): LanguageService = js.native
  def createLanguageService(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService = js.native
  def createLanguageService(host: LanguageServiceHost, documentRegistry: DocumentRegistry, syntaxOnly: Boolean): LanguageService = js.native
  def displayPartsToString(): String = js.native
  def displayPartsToString(displayParts: js.Array[SymbolDisplayPart]): String = js.native
  def findConfigFile(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean]): js.UndefOr[String] = js.native
  def findConfigFile(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean], configName: String): js.UndefOr[String] = js.native
  def flattenDiagnosticMessageText(messageText: js.UndefOr[scala.Nothing], newLine: String): String = js.native
  def flattenDiagnosticMessageText(messageText: String, newLine: String): String = js.native
  def flattenDiagnosticMessageText(messageText: DiagnosticMessageChain, newLine: String): String = js.native
  def formatDiagnostics(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): String = js.native
  def formatDiagnosticsWithColorAndContext(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): String = js.native
  def getDefaultLibFilePath(options: CompilerOptions): String = js.native
  def getPreEmitDiagnostics(program: Program): js.Array[Diagnostic] = js.native
  def getPreEmitDiagnostics(program: Program, sourceFile: SourceFile): js.Array[Diagnostic] = js.native
  def getPreEmitDiagnostics(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  def parseJsonConfigFileContent(json: js.Any, host: ParseConfigHost, basePath: String): ParsedCommandLine = js.native
  def parseJsonConfigFileContent(json: js.Any, host: ParseConfigHost, basePath: String, existingOptions: CompilerOptions): ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String
  ): ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String,
    resolutionStack: js.Array[Path]
  ): ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String,
    resolutionStack: js.Array[Path],
    extraFileExtensions: js.Array[FileExtensionInfo]
  ): ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String,
    resolutionStack: js.Array[Path],
    extraFileExtensions: js.Array[FileExtensionInfo],
    extendedConfigCache: Map[ExtendedConfigCacheEntry]
  ): ParsedCommandLine = js.native
  def readConfigFile(fileName: String, readFile: js.Function1[/* path */ String, js.UndefOr[String]]): Anon_Config = js.native
  def transpileModule(input: String, transpileOptions: TranspileOptions): TranspileOutput = js.native
}

