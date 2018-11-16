package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullSymbol")
@js.native
class PullSymbol protected () extends js.Object {
  def this(name: java.lang.String, declKind: PullElementKind) = this()
  var _container: js.Any = js.native
  var _declarations: js.Any = js.native
  var _docComments: js.Any = js.native
  var _enclosingSignature: js.Any = js.native
  var inResolution: scala.Boolean = js.native
  var isOptional: scala.Boolean = js.native
  var isPrinting: scala.Boolean = js.native
  var isResolved: scala.Boolean = js.native
  var isSynthesized: js.Any = js.native
  var isVarArg: scala.Boolean = js.native
  var kind: PullElementKind = js.native
  var name: java.lang.String = js.native
  var pullSymbolID: scala.Double = js.native
  var rootSymbol: js.Any = js.native
  var `type`: PullTypeSymbol = js.native
  def _getResolver(): PullTypeResolver = js.native
  def _resolveDeclaredSymbol(): PullSymbol = js.native
  def addDeclaration(decl: PullDecl): scala.Unit = js.native
  def allDeclsHaveFlag(flag: PullElementFlags): scala.Boolean = js.native
  def anyDeclHasFlag(flag: PullElementFlags): scala.Boolean = js.native
  /* private */ def cleanDocCommentLine(line: js.Any, jsDocStyleComment: js.Any): js.Any = js.native
  /* private */ def cleanDocCommentLine(line: js.Any, jsDocStyleComment: js.Any, jsDocLineSpaceToRemove: js.Any): js.Any = js.native
  /* private */ def cleanJSDocComment(content: js.Any): js.Any = js.native
  /* private */ def cleanJSDocComment(content: js.Any, spacesToRemove: js.Any): js.Any = js.native
  /* private */ def consumeLeadingSpace(line: js.Any, startIndex: js.Any): js.Any = js.native
  /* private */ def consumeLeadingSpace(line: js.Any, startIndex: js.Any, maxSpacesToRemove: js.Any): js.Any = js.native
  def docComments(): java.lang.String = js.native
  def docComments(useConstructorAsClass: scala.Boolean): java.lang.String = js.native
  /* private */ def findAliasedTypeSymbols(scopeSymbol: js.Any): js.Any = js.native
  /* private */ def findAliasedTypeSymbols(scopeSymbol: js.Any, skipScopeSymbolAliasesLookIn: js.Any): js.Any = js.native
  /* private */ def findAliasedTypeSymbols(scopeSymbol: js.Any, skipScopeSymbolAliasesLookIn: js.Any, lookIntoOnlyExportedAlias: js.Any): js.Any = js.native
  /* private */ def findAliasedTypeSymbols(
    scopeSymbol: js.Any,
    skipScopeSymbolAliasesLookIn: js.Any,
    lookIntoOnlyExportedAlias: js.Any,
    aliasSymbols: js.Any
  ): js.Any = js.native
  /* private */ def findAliasedTypeSymbols(
    scopeSymbol: js.Any,
    skipScopeSymbolAliasesLookIn: js.Any,
    lookIntoOnlyExportedAlias: js.Any,
    aliasSymbols: js.Any,
    visitedScopeDeclarations: js.Any
  ): js.Any = js.native
  /* private */ def findQualifyingSymbolPathInScopeSymbol(scopeSymbol: js.Any): js.Any = js.native
  def fullName(): java.lang.String = js.native
  def fullName(scopeSymbol: PullSymbol): java.lang.String = js.native
  def getAliasSymbolName(
    scopeSymbol: PullSymbol,
    aliasNameGetter: js.Function1[/* symbol */ PullTypeAliasSymbol, java.lang.String],
    aliasPartsNameGetter: js.Function1[/* symbol */ PullTypeAliasSymbol, java.lang.String]
  ): java.lang.String = js.native
  def getAliasSymbolName(
    scopeSymbol: PullSymbol,
    aliasNameGetter: js.Function1[/* symbol */ PullTypeAliasSymbol, java.lang.String],
    aliasPartsNameGetter: js.Function1[/* symbol */ PullTypeAliasSymbol, java.lang.String],
    skipInternalAlias: scala.Boolean
  ): java.lang.String = js.native
  def getContainer(): PullTypeSymbol = js.native
  def getDeclarations(): js.Array[PullDecl] = js.native
  def getDisplayName(): java.lang.String = js.native
  def getDisplayName(scopeSymbol: PullSymbol): java.lang.String = js.native
  def getDisplayName(scopeSymbol: PullSymbol, useConstraintInName: scala.Boolean): java.lang.String = js.native
  def getDisplayName(scopeSymbol: PullSymbol, useConstraintInName: scala.Boolean, skipInternalAliasName: scala.Boolean): java.lang.String = js.native
  /* private */ def getDocCommentArray(symbol: js.Any): js.Any = js.native
  /* private */ def getDocCommentText(comments: js.Any): js.Any = js.native
  /* private */ def getDocCommentTextValue(comment: js.Any): js.Any = js.native
  /* private */ def getDocCommentsOfDecl(decl: js.Any): js.Any = js.native
  def getEnclosingSignature(): PullSignatureSymbol = js.native
  /* private */ def getExportedInternalAliasSymbol(scopeSymbol: js.Any): js.Any = js.native
  def getExternalAliasedSymbols(scopeSymbol: PullSymbol): js.Array[PullTypeAliasSymbol] = js.native
  def getIsSpecialized(): scala.Boolean = js.native
  def getIsSynthesized(): js.Any = js.native
  def getName(): java.lang.String = js.native
  def getName(scopeSymbol: PullSymbol): java.lang.String = js.native
  def getName(scopeSymbol: PullSymbol, useConstraintInName: scala.Boolean): java.lang.String = js.native
  def getNameAndTypeName(): java.lang.String = js.native
  def getNameAndTypeName(scopeSymbol: PullSymbol): java.lang.String = js.native
  def getNameAndTypeNameEx(): MemberName = js.native
  def getNameAndTypeNameEx(scopeSymbol: PullSymbol): MemberName = js.native
  def getNamePartForFullName(): java.lang.String = js.native
  /* private */ def getParameterDocCommentText(param: js.Any, fncDocComments: js.Any): js.Any = js.native
  def getRootSymbol(): PullSymbol = js.native
  def getScopedName(): java.lang.String = js.native
  def getScopedName(scopeSymbol: PullSymbol): java.lang.String = js.native
  def getScopedName(scopeSymbol: PullSymbol, skipTypeParametersInName: scala.Boolean): java.lang.String = js.native
  def getScopedName(
    scopeSymbol: PullSymbol,
    skipTypeParametersInName: scala.Boolean,
    useConstraintInName: scala.Boolean
  ): java.lang.String = js.native
  def getScopedName(
    scopeSymbol: PullSymbol,
    skipTypeParametersInName: scala.Boolean,
    useConstraintInName: scala.Boolean,
    skipInternalAliasName: scala.Boolean
  ): java.lang.String = js.native
  def getScopedNameEx(
    scopeSymbol: js.UndefOr[PullSymbol],
    skipTypeParametersInName: js.UndefOr[scala.Boolean],
    useConstraintInName: js.UndefOr[scala.Boolean],
    getPrettyTypeName: js.UndefOr[scala.Boolean],
    getTypeParamMarkerInfo: js.UndefOr[scala.Boolean],
    skipInternalAliasName: js.UndefOr[scala.Boolean]
  ): MemberName = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeName(scopeSymbol: PullSymbol): java.lang.String = js.native
  def getTypeName(scopeSymbol: PullSymbol, getPrettyTypeName: scala.Boolean): java.lang.String = js.native
  def getTypeNameEx(): MemberName = js.native
  def getTypeNameEx(scopeSymbol: PullSymbol): MemberName = js.native
  def getTypeNameEx(scopeSymbol: PullSymbol, getPrettyTypeName: scala.Boolean): MemberName = js.native
  /* private */ def getTypeNameForFunctionSignature(prefix: js.Any): js.Any = js.native
  /* private */ def getTypeNameForFunctionSignature(prefix: js.Any, scopeSymbol: js.Any): js.Any = js.native
  /* private */ def getTypeNameForFunctionSignature(prefix: js.Any, scopeSymbol: js.Any, getPrettyTypeName: js.Any): js.Any = js.native
  def hasDeclaration(decl: PullDecl): scala.Boolean = js.native
  def isAccessor(): scala.Boolean = js.native
  def isAlias(): scala.Boolean = js.native
  def isAny(): scala.Boolean = js.native
  def isArrayNamedTypeReference(): scala.Boolean = js.native
  def isContainer(): scala.Boolean = js.native
  def isError(): scala.Boolean = js.native
  def isExternallyVisible(): scala.Boolean = js.native
  def isExternallyVisible(inIsExternallyVisibleSymbols: js.Array[PullSymbol]): scala.Boolean = js.native
  def isInterface(): scala.Boolean = js.native
  def isMethod(): scala.Boolean = js.native
  def isPrimitive(): scala.Boolean = js.native
  def isProperty(): scala.Boolean = js.native
  def isSignature(): scala.Boolean = js.native
  /* private */ def isSpaceChar(line: js.Any, index: js.Any): js.Any = js.native
  def isType(): scala.Boolean = js.native
  def isTypeReference(): scala.Boolean = js.native
  def pathToRoot(): js.Array[PullSymbol] = js.native
  def setContainer(containerSymbol: PullTypeSymbol): scala.Unit = js.native
  def setEnclosingSignature(signature: PullSignatureSymbol): scala.Unit = js.native
  def setIsSynthesized(): scala.Unit = js.native
  def setIsSynthesized(value: scala.Boolean): scala.Unit = js.native
  def setResolved(): scala.Unit = js.native
  def setRootSymbol(symbol: PullSymbol): scala.Unit = js.native
  def setUnresolved(): scala.Unit = js.native
  def startResolving(): scala.Unit = js.native
  def toString(scopeSymbol: PullSymbol): java.lang.String = js.native
  def toString(scopeSymbol: PullSymbol, useConstraintInName: scala.Boolean): java.lang.String = js.native
}

@JSGlobal("TypeScript.PullSymbol")
@js.native
object PullSymbol extends js.Object {
  def _isExternalModuleReferenceAlias(aliasSymbol: typescriptDashServicesLib.TypeScriptNs.PullTypeAliasSymbol): scala.Boolean = js.native
  /* private */ def getDefaultConstructorSymbolForDocComments(classSymbol: js.Any): js.Any = js.native
  def getIsExternallyVisible(
    symbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    fromIsExternallyVisibleSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    inIsExternallyVisibleSymbols: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSymbol]
  ): scala.Boolean = js.native
  def getTypeParameterString(typars: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol]): java.lang.String = js.native
  def getTypeParameterString(
    typars: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol
  ): java.lang.String = js.native
  def getTypeParameterString(
    typars: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    useContraintInName: scala.Boolean
  ): java.lang.String = js.native
  def getTypeParameterStringEx(typeParameters: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol]): typescriptDashServicesLib.TypeScriptNs.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol
  ): typescriptDashServicesLib.TypeScriptNs.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    getTypeParamMarkerInfo: scala.Boolean
  ): typescriptDashServicesLib.TypeScriptNs.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    getTypeParamMarkerInfo: scala.Boolean,
    useContraintInName: scala.Boolean
  ): typescriptDashServicesLib.TypeScriptNs.MemberNameArray = js.native
  /* private */ def unqualifiedNameReferencesDifferentSymbolInScope(symbol: js.Any, scopePath: js.Any, endScopePathIndex: js.Any): js.Any = js.native
}

