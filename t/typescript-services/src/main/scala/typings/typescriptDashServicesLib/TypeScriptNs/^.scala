package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript")
@js.native
object ^ extends js.Object {
  var DiagnosticCode: typescriptDashServicesLib.Anon_01isinaccessible = js.native
  var Environment: IEnvironment = js.native
  var LocalizedDiagnosticMessages: IIndexable[js.Any] = js.native
  var astTranslationTime: scala.Double = js.native
  var compilerDirectoryExistsTime: scala.Double = js.native
  var compilerDirectoryNameTime: scala.Double = js.native
  var compilerFileExistsTime: scala.Double = js.native
  var compilerResolvePathTime: scala.Double = js.native
  var declCacheHit: scala.Double = js.native
  var declCacheMiss: scala.Double = js.native
  var declarationEmitFunctionDeclarationGetSymbolTime: scala.Double = js.native
  var declarationEmitGetAccessorFunctionTime: scala.Double = js.native
  var declarationEmitGetBaseTypeTime: scala.Double = js.native
  var declarationEmitGetBoundDeclTypeTime: scala.Double = js.native
  var declarationEmitGetImportDeclarationSymbolTime: scala.Double = js.native
  var declarationEmitGetTypeParameterSymbolTime: scala.Double = js.native
  var declarationEmitIsExternallyVisibleTime: scala.Double = js.native
  var declarationEmitIsOverloadedCallSignatureTime: scala.Double = js.native
  var declarationEmitTime: scala.Double = js.native
  var declarationEmitTypeSignatureTime: scala.Double = js.native
  var diagnosticInformationMap: IIndexable[js.Any] = js.native
  var emitTime: scala.Double = js.native
  var emitWriteFileTime: scala.Double = js.native
  var fileResolutionGetDefaultLibraryTime: scala.Double = js.native
  var fileResolutionIOTime: scala.Double = js.native
  var fileResolutionImportFileSearchTime: scala.Double = js.native
  var fileResolutionScanImportsTime: scala.Double = js.native
  var fileResolutionTime: scala.Double = js.native
  var ioHostCreateDirectoryStructureTime: scala.Double = js.native
  var ioHostDirectoryNameTime: scala.Double = js.native
  var ioHostResolvePathTime: scala.Double = js.native
  var ioHostWriteFileTime: scala.Double = js.native
  var nSpecializationsCreated: scala.Double = js.native
  var nSpecializedSignaturesCreated: scala.Double = js.native
  var nSpecializedTypeParameterCreated: scala.Double = js.native
  var nodeCreateBufferTime: scala.Double = js.native
  var nodeMakeDirectoryTime: scala.Double = js.native
  var nodeWriteFileSyncTime: scala.Double = js.native
  var pullSymbolID: scala.Double = js.native
  var sentinelEmptyArray: js.Array[js.Any] = js.native
  var sourceCharactersCompiled: scala.Double = js.native
  var symbolCacheHit: scala.Double = js.native
  var symbolCacheMiss: scala.Double = js.native
  var syntaxDiagnosticsTime: scala.Double = js.native
  var syntaxTreeParseTime: scala.Double = js.native
  var tripleSlashReferenceRegExp: stdLib.RegExp = js.native
  var typeCheckTime: scala.Double = js.native
  def changePathToDTS(modPath: java.lang.String): java.lang.String = js.native
  def compareDataObjects(dst: js.Any, src: js.Any): scala.Boolean = js.native
  def convertToDirectoryPath(dirPath: java.lang.String): java.lang.String = js.native
  def createIntrinsicsObject[T](): IIndexable[T] = js.native
  def filePath(fullPath: java.lang.String): java.lang.String = js.native
  def filePathComponents(fullPath: java.lang.String): js.Array[java.lang.String] = js.native
  def getAstWalkerFactory(): AstWalkerFactory = js.native
  def getDeclareFilePath(fname: java.lang.String): java.lang.String = js.native
  def getDiagnosticMessage(diagnosticKey: java.lang.String, args: js.Array[_]): java.lang.String = js.native
  def getIDForTypeSubstitutions(instantiatingSignature: PullSignatureSymbol, typeArgumentMap: TypeArgumentMap): java.lang.String = js.native
  def getIDForTypeSubstitutions(instantiatingType: PullTypeSymbol, typeArgumentMap: TypeArgumentMap): java.lang.String = js.native
  def getLastConstructor(classDecl: ClassDeclaration): ConstructorDeclaration = js.native
  def getLocalizedText(diagnosticKey: java.lang.String, args: js.Array[_]): java.lang.String = js.native
  def getParseOptions(settings: ImmutableCompilationSettings): ParseOptions = js.native
  def getPathComponents(path: java.lang.String): js.Array[java.lang.String] = js.native
  def getPrettyName(modPath: java.lang.String): js.Any = js.native
  def getPrettyName(modPath: java.lang.String, quote: scala.Boolean): js.Any = js.native
  def getPrettyName(modPath: java.lang.String, quote: scala.Boolean, treatAsFileName: scala.Boolean): js.Any = js.native
  def getPropertyAssignmentNameTextFromIdentifier(identifier: AST): typescriptDashServicesLib.Anon_ActualText = js.native
  def getReferencedFiles(fileName: java.lang.String, sourceText: IScriptSnapshot): js.Array[IFileReference] = js.native
  def getRelativePathToFixedPath(fixedModFilePath: java.lang.String, absoluteModPath: java.lang.String): java.lang.String = js.native
  def getRelativePathToFixedPath(
    fixedModFilePath: java.lang.String,
    absoluteModPath: java.lang.String,
    isAbsoultePathURL: scala.Boolean
  ): java.lang.String = js.native
  def getRootFilePath(outFname: java.lang.String): java.lang.String = js.native
  def getTrimmedTextLines(comment: Comment): js.Array[java.lang.String] = js.native
  def hasFlag(`val`: scala.Double, flag: scala.Double): scala.Boolean = js.native
  def hasModifier(modifiers: js.Array[PullElementFlags], flag: PullElementFlags): scala.Boolean = js.native
  def isDTSFile(fname: java.lang.String): scala.Boolean = js.native
  def isDoubleQuoted(str: java.lang.String): scala.Boolean = js.native
  def isQuoted(str: java.lang.String): scala.Boolean = js.native
  def isRelative(path: java.lang.String): scala.Boolean = js.native
  def isRooted(path: java.lang.String): scala.Boolean = js.native
  def isSingleQuoted(str: java.lang.String): scala.Boolean = js.native
  def isTSFile(fname: java.lang.String): scala.Boolean = js.native
  def isTypesOnlyLocation(ast: AST): scala.Boolean = js.native
  def lastParameterIsRest(parameterList: ParameterList): scala.Boolean = js.native
  def newLine(): java.lang.String = js.native
  def normalizePath(path: java.lang.String): java.lang.String = js.native
  def preProcessFile(fileName: java.lang.String, sourceText: IScriptSnapshot): IPreProcessedFileInfo = js.native
  def preProcessFile(fileName: java.lang.String, sourceText: IScriptSnapshot, readImportFiles: scala.Boolean): IPreProcessedFileInfo = js.native
  def quoteStr(str: java.lang.String): java.lang.String = js.native
  def stripStartAndEndQuotes(str: java.lang.String): java.lang.String = js.native
  def structuralEqualsIncludingPosition(ast1: AST, ast2: AST): scala.Boolean = js.native
  def structuralEqualsNotIncludingPosition(ast1: AST, ast2: AST): scala.Boolean = js.native
  def switchToForwardSlashes(path: java.lang.String): java.lang.String = js.native
  def timeFunction(logger: ILogger, funcDescription: java.lang.String, func: js.Function0[_]): js.Any = js.native
  def trimModName(modName: java.lang.String): java.lang.String = js.native
}

