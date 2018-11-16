package typings
package tsDashNodeLib.tsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSCommon extends js.Object {
  var ModuleKind: js.Any = js.native
  var ScriptSnapshot: tsDashNodeLib.Anon_FromString = js.native
  var ScriptTarget: js.Any = js.native
  @JSName("createLanguageService")
  var createLanguageService_Original: js.Function3[
    /* host */ typescriptLib.typescriptMod.tsNs.LanguageServiceHost, 
    /* documentRegistry */ typescriptLib.typescriptMod.tsNs.DocumentRegistry, 
    /* syntaxOnly */ scala.Boolean, 
    typescriptLib.typescriptMod.tsNs.LanguageService
  ] = js.native
  @JSName("displayPartsToString")
  var displayPartsToString_Original: js.Function0[java.lang.String] = js.native
  @JSName("findConfigFile")
  var findConfigFile_Original: js.Function3[
    /* searchPath */ java.lang.String, 
    /* fileExists */ js.Function1[/* fileName */ java.lang.String, scala.Boolean], 
    /* configName */ java.lang.String, 
    js.UndefOr[java.lang.String]
  ] = js.native
  @JSName("flattenDiagnosticMessageText")
  var flattenDiagnosticMessageText_Original: js.Function2[
    /* messageText */ js.UndefOr[scala.Nothing], 
    /* newLine */ java.lang.String, 
    java.lang.String
  ] = js.native
  @JSName("formatDiagnosticsWithColorAndContext")
  var formatDiagnosticsWithColorAndContext_Original: js.Function2[
    /* diagnostics */ js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic], 
    /* host */ typescriptLib.typescriptMod.tsNs.FormatDiagnosticsHost, 
    java.lang.String
  ] = js.native
  @JSName("formatDiagnostics")
  var formatDiagnostics_Original: js.Function2[
    /* diagnostics */ js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic], 
    /* host */ typescriptLib.typescriptMod.tsNs.FormatDiagnosticsHost, 
    java.lang.String
  ] = js.native
  @JSName("getDefaultLibFilePath")
  var getDefaultLibFilePath_Original: js.Function1[/* options */ typescriptLib.typescriptMod.tsNs.CompilerOptions, java.lang.String] = js.native
  @JSName("getPreEmitDiagnostics")
  var getPreEmitDiagnostics_Original: js.Function3[
    /* program */ typescriptLib.typescriptMod.tsNs.Program, 
    /* sourceFile */ typescriptLib.typescriptMod.tsNs.SourceFile, 
    /* cancellationToken */ typescriptLib.typescriptMod.tsNs.CancellationToken, 
    js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ] = js.native
  @JSName("parseJsonConfigFileContent")
  var parseJsonConfigFileContent_Original: js.Function7[
    /* json */ js.Any, 
    /* host */ typescriptLib.typescriptMod.tsNs.ParseConfigHost, 
    /* basePath */ java.lang.String, 
    /* existingOptions */ typescriptLib.typescriptMod.tsNs.CompilerOptions, 
    /* configFileName */ java.lang.String, 
    /* resolutionStack */ js.Array[typescriptLib.typescriptMod.tsNs.Path], 
    /* extraFileExtensions */ js.Array[typescriptLib.typescriptMod.tsNs.FileExtensionInfo], 
    typescriptLib.typescriptMod.tsNs.ParsedCommandLine
  ] = js.native
  @JSName("readConfigFile")
  var readConfigFile_Original: js.Function2[
    /* fileName */ java.lang.String, 
    /* readFile */ js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]], 
    typescriptLib.Anon_Config
  ] = js.native
  var sys: typescriptLib.typescriptMod.tsNs.System = js.native
  @JSName("transpileModule")
  var transpileModule_Original: js.Function2[
    /* input */ java.lang.String, 
    /* transpileOptions */ typescriptLib.typescriptMod.tsNs.TranspileOptions, 
    typescriptLib.typescriptMod.tsNs.TranspileOutput
  ] = js.native
  var version: java.lang.String = js.native
  def createLanguageService(
    host: typescriptLib.typescriptMod.tsNs.LanguageServiceHost,
    documentRegistry: typescriptLib.typescriptMod.tsNs.DocumentRegistry,
    syntaxOnly: scala.Boolean
  ): typescriptLib.typescriptMod.tsNs.LanguageService = js.native
  def displayPartsToString(): java.lang.String = js.native
  def findConfigFile(
    searchPath: java.lang.String,
    fileExists: js.Function1[/* fileName */ java.lang.String, scala.Boolean],
    configName: java.lang.String
  ): js.UndefOr[java.lang.String] = js.native
  def flattenDiagnosticMessageText(messageText: js.UndefOr[scala.Nothing], newLine: java.lang.String): java.lang.String = js.native
  def formatDiagnostics(
    diagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    host: typescriptLib.typescriptMod.tsNs.FormatDiagnosticsHost
  ): java.lang.String = js.native
  def formatDiagnosticsWithColorAndContext(
    diagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    host: typescriptLib.typescriptMod.tsNs.FormatDiagnosticsHost
  ): java.lang.String = js.native
  def getDefaultLibFilePath(options: typescriptLib.typescriptMod.tsNs.CompilerOptions): java.lang.String = js.native
  def getPreEmitDiagnostics(
    program: typescriptLib.typescriptMod.tsNs.Program,
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    cancellationToken: typescriptLib.typescriptMod.tsNs.CancellationToken
  ): js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic] = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: typescriptLib.typescriptMod.tsNs.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.tsNs.Path],
    extraFileExtensions: js.Array[typescriptLib.typescriptMod.tsNs.FileExtensionInfo]
  ): typescriptLib.typescriptMod.tsNs.ParsedCommandLine = js.native
  def readConfigFile(
    fileName: java.lang.String,
    readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]
  ): typescriptLib.Anon_Config = js.native
  def transpileModule(input: java.lang.String, transpileOptions: typescriptLib.typescriptMod.tsNs.TranspileOptions): typescriptLib.typescriptMod.tsNs.TranspileOutput = js.native
}

