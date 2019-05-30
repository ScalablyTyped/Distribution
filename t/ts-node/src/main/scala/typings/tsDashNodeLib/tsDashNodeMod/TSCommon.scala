package typings
package tsDashNodeLib.tsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSCommon extends js.Object {
  var ModuleKind: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ModuleKind */ js.Any = js.native
  var ScriptSnapshot: tsDashNodeLib.TypeofScriptSnapshot = js.native
  var ScriptTarget: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ts.ScriptTarget */ js.Any = js.native
  @JSName("createLanguageService")
  var createLanguageService_Original: tsDashNodeLib.Fn_DocumentRegistry = js.native
  @JSName("displayPartsToString")
  var displayPartsToString_Original: tsDashNodeLib.Fn_DisplayParts = js.native
  @JSName("findConfigFile")
  var findConfigFile_Original: tsDashNodeLib.Fn_ConfigName = js.native
  @JSName("flattenDiagnosticMessageText")
  var flattenDiagnosticMessageText_Original: tsDashNodeLib.Fn_MessageText = js.native
  @JSName("formatDiagnosticsWithColorAndContext")
  var formatDiagnosticsWithColorAndContext_Original: js.Function2[
    /* diagnostics */ js.Array[typescriptLib.typescriptMod.Diagnostic], 
    /* host */ typescriptLib.typescriptMod.FormatDiagnosticsHost, 
    java.lang.String
  ] = js.native
  @JSName("formatDiagnostics")
  var formatDiagnostics_Original: js.Function2[
    /* diagnostics */ js.Array[typescriptLib.typescriptMod.Diagnostic], 
    /* host */ typescriptLib.typescriptMod.FormatDiagnosticsHost, 
    java.lang.String
  ] = js.native
  @JSName("getDefaultLibFilePath")
  var getDefaultLibFilePath_Original: js.Function1[/* options */ typescriptLib.typescriptMod.CompilerOptions, java.lang.String] = js.native
  @JSName("getPreEmitDiagnostics")
  var getPreEmitDiagnostics_Original: tsDashNodeLib.Fn_CancellationToken = js.native
  @JSName("parseJsonConfigFileContent")
  var parseJsonConfigFileContent_Original: tsDashNodeLib.Fn_BasePath = js.native
  @JSName("readConfigFile")
  var readConfigFile_Original: js.Function2[
    /* fileName */ java.lang.String, 
    /* readFile */ js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]], 
    typescriptLib.Anon_Config
  ] = js.native
  var sys: typescriptLib.typescriptMod.System = js.native
  @JSName("transpileModule")
  var transpileModule_Original: js.Function2[
    /* input */ java.lang.String, 
    /* transpileOptions */ typescriptLib.typescriptMod.TranspileOptions, 
    typescriptLib.typescriptMod.TranspileOutput
  ] = js.native
  var version: java.lang.String = js.native
  def createLanguageService(host: typescriptLib.typescriptMod.LanguageServiceHost): typescriptLib.typescriptMod.LanguageService = js.native
  def createLanguageService(
    host: typescriptLib.typescriptMod.LanguageServiceHost,
    documentRegistry: typescriptLib.typescriptMod.DocumentRegistry
  ): typescriptLib.typescriptMod.LanguageService = js.native
  def createLanguageService(
    host: typescriptLib.typescriptMod.LanguageServiceHost,
    documentRegistry: typescriptLib.typescriptMod.DocumentRegistry,
    syntaxOnly: scala.Boolean
  ): typescriptLib.typescriptMod.LanguageService = js.native
  def displayPartsToString(): java.lang.String = js.native
  def displayPartsToString(displayParts: js.Array[typescriptLib.typescriptMod.SymbolDisplayPart]): java.lang.String = js.native
  def findConfigFile(
    searchPath: java.lang.String,
    fileExists: js.Function1[/* fileName */ java.lang.String, scala.Boolean]
  ): js.UndefOr[java.lang.String] = js.native
  def findConfigFile(
    searchPath: java.lang.String,
    fileExists: js.Function1[/* fileName */ java.lang.String, scala.Boolean],
    configName: java.lang.String
  ): js.UndefOr[java.lang.String] = js.native
  def flattenDiagnosticMessageText(messageText: js.UndefOr[scala.Nothing], newLine: java.lang.String): java.lang.String = js.native
  def flattenDiagnosticMessageText(messageText: java.lang.String, newLine: java.lang.String): java.lang.String = js.native
  def flattenDiagnosticMessageText(messageText: typescriptLib.typescriptMod.DiagnosticMessageChain, newLine: java.lang.String): java.lang.String = js.native
  def formatDiagnostics(
    diagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    host: typescriptLib.typescriptMod.FormatDiagnosticsHost
  ): java.lang.String = js.native
  def formatDiagnosticsWithColorAndContext(
    diagnostics: js.Array[typescriptLib.typescriptMod.Diagnostic],
    host: typescriptLib.typescriptMod.FormatDiagnosticsHost
  ): java.lang.String = js.native
  def getDefaultLibFilePath(options: typescriptLib.typescriptMod.CompilerOptions): java.lang.String = js.native
  def getPreEmitDiagnostics(program: typescriptLib.typescriptMod.Program): js.Array[typescriptLib.typescriptMod.Diagnostic] = js.native
  def getPreEmitDiagnostics(program: typescriptLib.typescriptMod.Program, sourceFile: typescriptLib.typescriptMod.SourceFile): js.Array[typescriptLib.typescriptMod.Diagnostic] = js.native
  def getPreEmitDiagnostics(
    program: typescriptLib.typescriptMod.Program,
    sourceFile: typescriptLib.typescriptMod.SourceFile,
    cancellationToken: typescriptLib.typescriptMod.CancellationToken
  ): js.Array[typescriptLib.typescriptMod.Diagnostic] = js.native
  def parseJsonConfigFileContent(json: js.Any, host: typescriptLib.typescriptMod.ParseConfigHost, basePath: java.lang.String): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions,
    configFileName: java.lang.String
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.Path]
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.Path],
    extraFileExtensions: js.Array[typescriptLib.typescriptMod.FileExtensionInfo]
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.Path],
    extraFileExtensions: js.Array[typescriptLib.typescriptMod.FileExtensionInfo],
    extendedConfigCache: typescriptLib.typescriptMod.Map[typescriptLib.typescriptMod.ExtendedConfigCacheEntry]
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def readConfigFile(
    fileName: java.lang.String,
    readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]
  ): typescriptLib.Anon_Config = js.native
  def transpileModule(input: java.lang.String, transpileOptions: typescriptLib.typescriptMod.TranspileOptions): typescriptLib.typescriptMod.TranspileOutput = js.native
}

