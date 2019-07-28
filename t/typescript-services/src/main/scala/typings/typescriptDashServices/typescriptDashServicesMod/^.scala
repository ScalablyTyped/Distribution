package typings.typescriptDashServices.typescriptDashServicesMod

import typings.std.RegExp
import typings.typescriptDashServices.Anon_ActualText
import typings.typescriptDashServices.TypeScriptNs.IEnvironment
import typings.typescriptDashServices.TypeScriptNs.IFileReference
import typings.typescriptDashServices.TypeScriptNs.IIndexable
import typings.typescriptDashServices.TypeScriptNs.ILogger
import typings.typescriptDashServices.TypeScriptNs.IPreProcessedFileInfo
import typings.typescriptDashServices.TypeScriptNs.IScriptSnapshot
import typings.typescriptDashServices.TypeScriptNs.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Environment: IEnvironment = js.native
  var LocalizedDiagnosticMessages: IIndexable[js.Any] = js.native
  var astTranslationTime: Double = js.native
  var compilerDirectoryExistsTime: Double = js.native
  var compilerDirectoryNameTime: Double = js.native
  var compilerFileExistsTime: Double = js.native
  var compilerResolvePathTime: Double = js.native
  var declCacheHit: Double = js.native
  var declCacheMiss: Double = js.native
  var declarationEmitFunctionDeclarationGetSymbolTime: Double = js.native
  var declarationEmitGetAccessorFunctionTime: Double = js.native
  var declarationEmitGetBaseTypeTime: Double = js.native
  var declarationEmitGetBoundDeclTypeTime: Double = js.native
  var declarationEmitGetImportDeclarationSymbolTime: Double = js.native
  var declarationEmitGetTypeParameterSymbolTime: Double = js.native
  var declarationEmitIsExternallyVisibleTime: Double = js.native
  var declarationEmitIsOverloadedCallSignatureTime: Double = js.native
  var declarationEmitTime: Double = js.native
  var declarationEmitTypeSignatureTime: Double = js.native
  var diagnosticInformationMap: IIndexable[js.Any] = js.native
  var emitTime: Double = js.native
  var emitWriteFileTime: Double = js.native
  var fileResolutionGetDefaultLibraryTime: Double = js.native
  var fileResolutionIOTime: Double = js.native
  var fileResolutionImportFileSearchTime: Double = js.native
  var fileResolutionScanImportsTime: Double = js.native
  var fileResolutionTime: Double = js.native
  var ioHostCreateDirectoryStructureTime: Double = js.native
  var ioHostDirectoryNameTime: Double = js.native
  var ioHostResolvePathTime: Double = js.native
  var ioHostWriteFileTime: Double = js.native
  var nSpecializationsCreated: Double = js.native
  var nSpecializedSignaturesCreated: Double = js.native
  var nSpecializedTypeParameterCreated: Double = js.native
  var nodeCreateBufferTime: Double = js.native
  var nodeMakeDirectoryTime: Double = js.native
  var nodeWriteFileSyncTime: Double = js.native
  var pullSymbolID: Double = js.native
  var sentinelEmptyArray: js.Array[js.Any] = js.native
  var sourceCharactersCompiled: Double = js.native
  var symbolCacheHit: Double = js.native
  var symbolCacheMiss: Double = js.native
  var syntaxDiagnosticsTime: Double = js.native
  var syntaxTreeParseTime: Double = js.native
  var tripleSlashReferenceRegExp: RegExp = js.native
  var typeCheckTime: Double = js.native
  def changePathToDTS(modPath: String): String = js.native
  def compareDataObjects(dst: js.Any, src: js.Any): Boolean = js.native
  def convertToDirectoryPath(dirPath: String): String = js.native
  def createIntrinsicsObject[T](): IIndexable[T] = js.native
  def filePath(fullPath: String): String = js.native
  def filePathComponents(fullPath: String): js.Array[String] = js.native
  def getAstWalkerFactory(): typings.typescriptDashServices.TypeScriptNs.AstWalkerFactory = js.native
  def getDeclareFilePath(fname: String): String = js.native
  def getDiagnosticMessage(diagnosticKey: String, args: js.Array[_]): String = js.native
  def getIDForTypeSubstitutions(
    instantiatingSignature: typings.typescriptDashServices.TypeScriptNs.PullSignatureSymbol,
    typeArgumentMap: TypeArgumentMap
  ): String = js.native
  def getIDForTypeSubstitutions(
    instantiatingType: typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol,
    typeArgumentMap: TypeArgumentMap
  ): String = js.native
  def getLastConstructor(classDecl: typings.typescriptDashServices.TypeScriptNs.ClassDeclaration): typings.typescriptDashServices.TypeScriptNs.ConstructorDeclaration = js.native
  def getLocalizedText(diagnosticKey: String, args: js.Array[_]): String = js.native
  def getParseOptions(settings: typings.typescriptDashServices.TypeScriptNs.ImmutableCompilationSettings): typings.typescriptDashServices.TypeScriptNs.ParseOptions = js.native
  def getPathComponents(path: String): js.Array[String] = js.native
  def getPrettyName(modPath: String): js.Any = js.native
  def getPrettyName(modPath: String, quote: Boolean): js.Any = js.native
  def getPrettyName(modPath: String, quote: Boolean, treatAsFileName: Boolean): js.Any = js.native
  def getPropertyAssignmentNameTextFromIdentifier(identifier: typings.typescriptDashServices.TypeScriptNs.AST): Anon_ActualText = js.native
  def getReferencedFiles(fileName: String, sourceText: IScriptSnapshot): js.Array[IFileReference] = js.native
  def getRelativePathToFixedPath(fixedModFilePath: String, absoluteModPath: String): String = js.native
  def getRelativePathToFixedPath(fixedModFilePath: String, absoluteModPath: String, isAbsoultePathURL: Boolean): String = js.native
  def getRootFilePath(outFname: String): String = js.native
  def getTrimmedTextLines(comment: typings.typescriptDashServices.TypeScriptNs.Comment): js.Array[String] = js.native
  def hasFlag(`val`: Double, flag: Double): Boolean = js.native
  def hasModifier(
    modifiers: js.Array[typings.typescriptDashServices.TypeScriptNs.PullElementFlags],
    flag: typings.typescriptDashServices.TypeScriptNs.PullElementFlags
  ): Boolean = js.native
  def isDTSFile(fname: String): Boolean = js.native
  def isDoubleQuoted(str: String): Boolean = js.native
  def isQuoted(str: String): Boolean = js.native
  def isRelative(path: String): Boolean = js.native
  def isRooted(path: String): Boolean = js.native
  def isSingleQuoted(str: String): Boolean = js.native
  def isTSFile(fname: String): Boolean = js.native
  def isTypesOnlyLocation(ast: typings.typescriptDashServices.TypeScriptNs.AST): Boolean = js.native
  def lastParameterIsRest(parameterList: typings.typescriptDashServices.TypeScriptNs.ParameterList): Boolean = js.native
  def newLine(): String = js.native
  def normalizePath(path: String): String = js.native
  def preProcessFile(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo = js.native
  def preProcessFile(fileName: String, sourceText: IScriptSnapshot, readImportFiles: Boolean): IPreProcessedFileInfo = js.native
  def quoteStr(str: String): String = js.native
  def stripStartAndEndQuotes(str: String): String = js.native
  def structuralEqualsIncludingPosition(
    ast1: typings.typescriptDashServices.TypeScriptNs.AST,
    ast2: typings.typescriptDashServices.TypeScriptNs.AST
  ): Boolean = js.native
  def structuralEqualsNotIncludingPosition(
    ast1: typings.typescriptDashServices.TypeScriptNs.AST,
    ast2: typings.typescriptDashServices.TypeScriptNs.AST
  ): Boolean = js.native
  def switchToForwardSlashes(path: String): String = js.native
  def timeFunction(logger: ILogger, funcDescription: String, func: js.Function0[_]): js.Any = js.native
  def trimModName(modName: String): String = js.native
}

