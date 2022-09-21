package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IEnvironment
import typings.typescriptServices.TypeScript.IFileReference
import typings.typescriptServices.TypeScript.IIndexable
import typings.typescriptServices.TypeScript.ILogger
import typings.typescriptServices.TypeScript.IPreProcessedFileInfo
import typings.typescriptServices.TypeScript.IScriptSnapshot
import typings.typescriptServices.TypeScript.TypeArgumentMap
import typings.typescriptServices.anon.ActualText
import typings.typescriptServices.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Environment: IEnvironment = ^.asInstanceOf[js.Dynamic].selectDynamic("Environment").asInstanceOf[IEnvironment]
inline def Environment_=(x: IEnvironment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Environment")(x.asInstanceOf[js.Any])

inline def LocalizedDiagnosticMessages: IIndexable[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("LocalizedDiagnosticMessages").asInstanceOf[IIndexable[Any]]
inline def LocalizedDiagnosticMessages_=(x: IIndexable[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocalizedDiagnosticMessages")(x.asInstanceOf[js.Any])

inline def astTranslationTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("astTranslationTime").asInstanceOf[Double]
inline def astTranslationTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("astTranslationTime")(x.asInstanceOf[js.Any])

inline def changePathToDTS(modPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("changePathToDTS")(modPath.asInstanceOf[js.Any]).asInstanceOf[String]

inline def compareDataObjects(dst: Any, src: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDataObjects")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def compilerDirectoryExistsTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("compilerDirectoryExistsTime").asInstanceOf[Double]
inline def compilerDirectoryExistsTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compilerDirectoryExistsTime")(x.asInstanceOf[js.Any])

inline def compilerDirectoryNameTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("compilerDirectoryNameTime").asInstanceOf[Double]
inline def compilerDirectoryNameTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compilerDirectoryNameTime")(x.asInstanceOf[js.Any])

inline def compilerFileExistsTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("compilerFileExistsTime").asInstanceOf[Double]
inline def compilerFileExistsTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compilerFileExistsTime")(x.asInstanceOf[js.Any])

inline def compilerResolvePathTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("compilerResolvePathTime").asInstanceOf[Double]
inline def compilerResolvePathTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compilerResolvePathTime")(x.asInstanceOf[js.Any])

inline def convertToDirectoryPath(dirPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToDirectoryPath")(dirPath.asInstanceOf[js.Any]).asInstanceOf[String]

inline def createIntrinsicsObject[T](): IIndexable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntrinsicsObject")().asInstanceOf[IIndexable[T]]

inline def declCacheHit: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("declCacheHit").asInstanceOf[Double]
inline def declCacheHit_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("declCacheHit")(x.asInstanceOf[js.Any])

inline def declCacheMiss: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("declCacheMiss").asInstanceOf[Double]
inline def declCacheMiss_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("declCacheMiss")(x.asInstanceOf[js.Any])

inline def declarationEmitFunctionDeclarationGetSymbolTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("declarationEmitFunctionDeclarationGetSymbolTime").asInstanceOf[Double]
inline def declarationEmitFunctionDeclarationGetSymbolTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("declarationEmitFunctionDeclarationGetSymbolTime")(x.asInstanceOf[js.Any])

inline def declarationEmitGetAccessorFunctionTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("declarationEmitGetAccessorFunctionTime").asInstanceOf[Double]
inline def declarationEmitGetAccessorFunctionTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("declarationEmitGetAccessorFunctionTime")(x.asInstanceOf[js.Any])

inline def declarationEmitGetBaseTypeTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("declarationEmitGetBaseTypeTime").asInstanceOf[Double]
inline def declarationEmitGetBaseTypeTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("declarationEmitGetBaseTypeTime")(x.asInstanceOf[js.Any])

inline def declarationEmitGetBoundDeclTypeTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("declarationEmitGetBoundDeclTypeTime").asInstanceOf[Double]
inline def declarationEmitGetBoundDeclTypeTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("declarationEmitGetBoundDeclTypeTime")(x.asInstanceOf[js.Any])

inline def declarationEmitGetImportDeclarationSymbolTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("declarationEmitGetImportDeclarationSymbolTime").asInstanceOf[Double]
inline def declarationEmitGetImportDeclarationSymbolTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("declarationEmitGetImportDeclarationSymbolTime")(x.asInstanceOf[js.Any])

inline def declarationEmitGetTypeParameterSymbolTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("declarationEmitGetTypeParameterSymbolTime").asInstanceOf[Double]
inline def declarationEmitGetTypeParameterSymbolTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("declarationEmitGetTypeParameterSymbolTime")(x.asInstanceOf[js.Any])

inline def declarationEmitIsExternallyVisibleTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("declarationEmitIsExternallyVisibleTime").asInstanceOf[Double]
inline def declarationEmitIsExternallyVisibleTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("declarationEmitIsExternallyVisibleTime")(x.asInstanceOf[js.Any])

inline def declarationEmitIsOverloadedCallSignatureTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("declarationEmitIsOverloadedCallSignatureTime").asInstanceOf[Double]
inline def declarationEmitIsOverloadedCallSignatureTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("declarationEmitIsOverloadedCallSignatureTime")(x.asInstanceOf[js.Any])

inline def declarationEmitTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("declarationEmitTime").asInstanceOf[Double]
inline def declarationEmitTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("declarationEmitTime")(x.asInstanceOf[js.Any])

inline def declarationEmitTypeSignatureTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("declarationEmitTypeSignatureTime").asInstanceOf[Double]
inline def declarationEmitTypeSignatureTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("declarationEmitTypeSignatureTime")(x.asInstanceOf[js.Any])

inline def diagnosticInformationMap: IIndexable[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("diagnosticInformationMap").asInstanceOf[IIndexable[Any]]
inline def diagnosticInformationMap_=(x: IIndexable[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diagnosticInformationMap")(x.asInstanceOf[js.Any])

inline def emitTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("emitTime").asInstanceOf[Double]
inline def emitTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emitTime")(x.asInstanceOf[js.Any])

inline def emitWriteFileTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("emitWriteFileTime").asInstanceOf[Double]
inline def emitWriteFileTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emitWriteFileTime")(x.asInstanceOf[js.Any])

inline def filePath(fullPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("filePath")(fullPath.asInstanceOf[js.Any]).asInstanceOf[String]

inline def filePathComponents(fullPath: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filePathComponents")(fullPath.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def fileResolutionGetDefaultLibraryTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("fileResolutionGetDefaultLibraryTime").asInstanceOf[Double]
inline def fileResolutionGetDefaultLibraryTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileResolutionGetDefaultLibraryTime")(x.asInstanceOf[js.Any])

inline def fileResolutionIOTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("fileResolutionIOTime").asInstanceOf[Double]
inline def fileResolutionIOTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileResolutionIOTime")(x.asInstanceOf[js.Any])

inline def fileResolutionImportFileSearchTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("fileResolutionImportFileSearchTime").asInstanceOf[Double]
inline def fileResolutionImportFileSearchTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileResolutionImportFileSearchTime")(x.asInstanceOf[js.Any])

inline def fileResolutionScanImportsTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("fileResolutionScanImportsTime").asInstanceOf[Double]
inline def fileResolutionScanImportsTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileResolutionScanImportsTime")(x.asInstanceOf[js.Any])

inline def fileResolutionTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("fileResolutionTime").asInstanceOf[Double]
inline def fileResolutionTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileResolutionTime")(x.asInstanceOf[js.Any])

inline def getAstWalkerFactory(): typings.typescriptServices.TypeScript.AstWalkerFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("getAstWalkerFactory")().asInstanceOf[typings.typescriptServices.TypeScript.AstWalkerFactory]

inline def getDeclareFilePath(fname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeclareFilePath")(fname.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getDiagnosticMessage(diagnosticKey: String, args: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDiagnosticMessage")(diagnosticKey.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getIDForTypeSubstitutions(
  instantiatingSignature: typings.typescriptServices.TypeScript.PullSignatureSymbol,
  typeArgumentMap: TypeArgumentMap
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getIDForTypeSubstitutions")(instantiatingSignature.asInstanceOf[js.Any], typeArgumentMap.asInstanceOf[js.Any])).asInstanceOf[String]
inline def getIDForTypeSubstitutions(
  instantiatingType: typings.typescriptServices.TypeScript.PullTypeSymbol,
  typeArgumentMap: TypeArgumentMap
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getIDForTypeSubstitutions")(instantiatingType.asInstanceOf[js.Any], typeArgumentMap.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getLastConstructor(classDecl: typings.typescriptServices.TypeScript.ClassDeclaration): typings.typescriptServices.TypeScript.ConstructorDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastConstructor")(classDecl.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.ConstructorDeclaration]

inline def getLocalizedText(diagnosticKey: String, args: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizedText")(diagnosticKey.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getParseOptions(settings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings): typings.typescriptServices.TypeScript.ParseOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getParseOptions")(settings.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.ParseOptions]

inline def getPathComponents(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathComponents")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def getPrettyName(modPath: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrettyName")(modPath.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def getPrettyName(modPath: String, quote: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPrettyName")(modPath.asInstanceOf[js.Any], quote.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def getPrettyName(modPath: String, quote: Boolean, treatAsFileName: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPrettyName")(modPath.asInstanceOf[js.Any], quote.asInstanceOf[js.Any], treatAsFileName.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def getPrettyName(modPath: String, quote: Unit, treatAsFileName: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPrettyName")(modPath.asInstanceOf[js.Any], quote.asInstanceOf[js.Any], treatAsFileName.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def getPropertyAssignmentNameTextFromIdentifier(identifier: typings.typescriptServices.TypeScript.AST): ActualText = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyAssignmentNameTextFromIdentifier")(identifier.asInstanceOf[js.Any]).asInstanceOf[ActualText]

inline def getReferencedFiles(fileName: String, sourceText: IScriptSnapshot): js.Array[IFileReference] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReferencedFiles")(fileName.asInstanceOf[js.Any], sourceText.asInstanceOf[js.Any])).asInstanceOf[js.Array[IFileReference]]

inline def getRelativePathToFixedPath(fixedModFilePath: String, absoluteModPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePathToFixedPath")(fixedModFilePath.asInstanceOf[js.Any], absoluteModPath.asInstanceOf[js.Any])).asInstanceOf[String]
inline def getRelativePathToFixedPath(fixedModFilePath: String, absoluteModPath: String, isAbsoultePathURL: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePathToFixedPath")(fixedModFilePath.asInstanceOf[js.Any], absoluteModPath.asInstanceOf[js.Any], isAbsoultePathURL.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getRootFilePath(outFname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootFilePath")(outFname.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTrimmedTextLines(comment: typings.typescriptServices.TypeScript.Comment): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTrimmedTextLines")(comment.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def hasFlag(`val`: Double, flag: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasFlag")(`val`.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def hasModifier(
  modifiers: js.Array[typings.typescriptServices.TypeScript.PullElementFlags],
  flag: typings.typescriptServices.TypeScript.PullElementFlags
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(modifiers.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def ioHostCreateDirectoryStructureTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ioHostCreateDirectoryStructureTime").asInstanceOf[Double]
inline def ioHostCreateDirectoryStructureTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ioHostCreateDirectoryStructureTime")(x.asInstanceOf[js.Any])

inline def ioHostDirectoryNameTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ioHostDirectoryNameTime").asInstanceOf[Double]
inline def ioHostDirectoryNameTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ioHostDirectoryNameTime")(x.asInstanceOf[js.Any])

inline def ioHostResolvePathTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ioHostResolvePathTime").asInstanceOf[Double]
inline def ioHostResolvePathTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ioHostResolvePathTime")(x.asInstanceOf[js.Any])

inline def ioHostWriteFileTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ioHostWriteFileTime").asInstanceOf[Double]
inline def ioHostWriteFileTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ioHostWriteFileTime")(x.asInstanceOf[js.Any])

inline def isDTSFile(fname: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDTSFile")(fname.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isDoubleQuoted(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDoubleQuoted")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isQuoted(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQuoted")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isRelative(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelative")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isRooted(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRooted")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isSingleQuoted(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleQuoted")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isTSFile(fname: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSFile")(fname.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isTypesOnlyLocation(ast: typings.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypesOnlyLocation")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def lastParameterIsRest(parameterList: typings.typescriptServices.TypeScript.ParameterList): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("lastParameterIsRest")(parameterList.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def nSpecializationsCreated: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("nSpecializationsCreated").asInstanceOf[Double]
inline def nSpecializationsCreated_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nSpecializationsCreated")(x.asInstanceOf[js.Any])

inline def nSpecializedSignaturesCreated: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("nSpecializedSignaturesCreated").asInstanceOf[Double]
inline def nSpecializedSignaturesCreated_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nSpecializedSignaturesCreated")(x.asInstanceOf[js.Any])

inline def nSpecializedTypeParameterCreated: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("nSpecializedTypeParameterCreated").asInstanceOf[Double]
inline def nSpecializedTypeParameterCreated_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nSpecializedTypeParameterCreated")(x.asInstanceOf[js.Any])

inline def newLine(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newLine")().asInstanceOf[String]

inline def nodeCreateBufferTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("nodeCreateBufferTime").asInstanceOf[Double]
inline def nodeCreateBufferTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeCreateBufferTime")(x.asInstanceOf[js.Any])

inline def nodeMakeDirectoryTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("nodeMakeDirectoryTime").asInstanceOf[Double]
inline def nodeMakeDirectoryTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeMakeDirectoryTime")(x.asInstanceOf[js.Any])

inline def nodeWriteFileSyncTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("nodeWriteFileSyncTime").asInstanceOf[Double]
inline def nodeWriteFileSyncTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeWriteFileSyncTime")(x.asInstanceOf[js.Any])

inline def normalizePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]

inline def preProcessFile(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("preProcessFile")(fileName.asInstanceOf[js.Any], sourceText.asInstanceOf[js.Any])).asInstanceOf[IPreProcessedFileInfo]
inline def preProcessFile(fileName: String, sourceText: IScriptSnapshot, readImportFiles: Boolean): IPreProcessedFileInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("preProcessFile")(fileName.asInstanceOf[js.Any], sourceText.asInstanceOf[js.Any], readImportFiles.asInstanceOf[js.Any])).asInstanceOf[IPreProcessedFileInfo]

inline def pullSymbolID: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("pullSymbolID").asInstanceOf[Double]
inline def pullSymbolID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pullSymbolID")(x.asInstanceOf[js.Any])

inline def quoteStr(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quoteStr")(str.asInstanceOf[js.Any]).asInstanceOf[String]

inline def sentinelEmptyArray: js.Array[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("sentinelEmptyArray").asInstanceOf[js.Array[Any]]
inline def sentinelEmptyArray_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sentinelEmptyArray")(x.asInstanceOf[js.Any])

inline def sourceCharactersCompiled: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("sourceCharactersCompiled").asInstanceOf[Double]
inline def sourceCharactersCompiled_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sourceCharactersCompiled")(x.asInstanceOf[js.Any])

inline def stripStartAndEndQuotes(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripStartAndEndQuotes")(str.asInstanceOf[js.Any]).asInstanceOf[String]

inline def structuralEqualsIncludingPosition(ast1: typings.typescriptServices.TypeScript.AST, ast2: typings.typescriptServices.TypeScript.AST): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("structuralEqualsIncludingPosition")(ast1.asInstanceOf[js.Any], ast2.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def structuralEqualsNotIncludingPosition(ast1: typings.typescriptServices.TypeScript.AST, ast2: typings.typescriptServices.TypeScript.AST): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("structuralEqualsNotIncludingPosition")(ast1.asInstanceOf[js.Any], ast2.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def switchToForwardSlashes(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("switchToForwardSlashes")(path.asInstanceOf[js.Any]).asInstanceOf[String]

inline def symbolCacheHit: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("symbolCacheHit").asInstanceOf[Double]
inline def symbolCacheHit_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolCacheHit")(x.asInstanceOf[js.Any])

inline def symbolCacheMiss: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("symbolCacheMiss").asInstanceOf[Double]
inline def symbolCacheMiss_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolCacheMiss")(x.asInstanceOf[js.Any])

inline def syntaxDiagnosticsTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("syntaxDiagnosticsTime").asInstanceOf[Double]
inline def syntaxDiagnosticsTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("syntaxDiagnosticsTime")(x.asInstanceOf[js.Any])

inline def syntaxTreeParseTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("syntaxTreeParseTime").asInstanceOf[Double]
inline def syntaxTreeParseTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("syntaxTreeParseTime")(x.asInstanceOf[js.Any])

inline def timeFunction(logger: ILogger, funcDescription: String, func: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("timeFunction")(logger.asInstanceOf[js.Any], funcDescription.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def trimModName(modName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimModName")(modName.asInstanceOf[js.Any]).asInstanceOf[String]

inline def tripleSlashReferenceRegExp: js.RegExp = ^.asInstanceOf[js.Dynamic].selectDynamic("tripleSlashReferenceRegExp").asInstanceOf[js.RegExp]
inline def tripleSlashReferenceRegExp_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tripleSlashReferenceRegExp")(x.asInstanceOf[js.Any])

inline def typeCheckTime: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("typeCheckTime").asInstanceOf[Double]
inline def typeCheckTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeCheckTime")(x.asInstanceOf[js.Any])
