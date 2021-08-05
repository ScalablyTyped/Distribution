package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullSymbol extends StObject {
  
  /* private */ var _container: js.Any = js.native
  
  /* private */ var _declarations: js.Any = js.native
  
  /* private */ var _docComments: js.Any = js.native
  
  /* private */ var _enclosingSignature: js.Any = js.native
  
  def _getResolver(): PullTypeResolver = js.native
  
  def _resolveDeclaredSymbol(): PullSymbol = js.native
  
  def addDeclaration(decl: PullDecl): Unit = js.native
  
  def allDeclsHaveFlag(flag: PullElementFlags): Boolean = js.native
  
  def anyDeclHasFlag(flag: PullElementFlags): Boolean = js.native
  
  /* private */ def cleanDocCommentLine(line: js.Any, jsDocStyleComment: js.Any, jsDocLineSpaceToRemove: js.Any): js.Any = js.native
  
  /* private */ def cleanJSDocComment(content: js.Any, spacesToRemove: js.Any): js.Any = js.native
  
  /* private */ def consumeLeadingSpace(line: js.Any, startIndex: js.Any, maxSpacesToRemove: js.Any): js.Any = js.native
  
  def docComments(): String = js.native
  def docComments(useConstructorAsClass: Boolean): String = js.native
  
  /* private */ def findAliasedTypeSymbols(
    scopeSymbol: js.Any,
    skipScopeSymbolAliasesLookIn: js.Any,
    lookIntoOnlyExportedAlias: js.Any,
    aliasSymbols: js.Any,
    visitedScopeDeclarations: js.Any
  ): js.Any = js.native
  
  /* private */ def findQualifyingSymbolPathInScopeSymbol(scopeSymbol: js.Any): js.Any = js.native
  
  def fullName(): String = js.native
  def fullName(scopeSymbol: PullSymbol): String = js.native
  
  def getAliasSymbolName(
    scopeSymbol: PullSymbol,
    aliasNameGetter: js.Function1[/* symbol */ PullTypeAliasSymbol, String],
    aliasPartsNameGetter: js.Function1[/* symbol */ PullTypeAliasSymbol, String]
  ): String = js.native
  def getAliasSymbolName(
    scopeSymbol: PullSymbol,
    aliasNameGetter: js.Function1[/* symbol */ PullTypeAliasSymbol, String],
    aliasPartsNameGetter: js.Function1[/* symbol */ PullTypeAliasSymbol, String],
    skipInternalAlias: Boolean
  ): String = js.native
  
  def getContainer(): PullTypeSymbol = js.native
  
  def getDeclarations(): js.Array[PullDecl] = js.native
  
  def getDisplayName(): String = js.native
  def getDisplayName(scopeSymbol: Unit, useConstraintInName: Boolean): String = js.native
  def getDisplayName(scopeSymbol: Unit, useConstraintInName: Boolean, skipInternalAliasName: Boolean): String = js.native
  def getDisplayName(scopeSymbol: Unit, useConstraintInName: Unit, skipInternalAliasName: Boolean): String = js.native
  def getDisplayName(scopeSymbol: PullSymbol): String = js.native
  def getDisplayName(scopeSymbol: PullSymbol, useConstraintInName: Boolean): String = js.native
  def getDisplayName(scopeSymbol: PullSymbol, useConstraintInName: Boolean, skipInternalAliasName: Boolean): String = js.native
  def getDisplayName(scopeSymbol: PullSymbol, useConstraintInName: Unit, skipInternalAliasName: Boolean): String = js.native
  
  /* private */ def getDocCommentArray(symbol: js.Any): js.Any = js.native
  
  /* private */ def getDocCommentText(comments: js.Any): js.Any = js.native
  
  /* private */ def getDocCommentTextValue(comment: js.Any): js.Any = js.native
  
  /* private */ def getDocCommentsOfDecl(decl: js.Any): js.Any = js.native
  
  def getEnclosingSignature(): PullSignatureSymbol = js.native
  
  /* private */ def getExportedInternalAliasSymbol(scopeSymbol: js.Any): js.Any = js.native
  
  def getExternalAliasedSymbols(scopeSymbol: PullSymbol): js.Array[PullTypeAliasSymbol] = js.native
  
  def getIsSpecialized(): Boolean = js.native
  
  def getIsSynthesized(): js.Any = js.native
  
  def getName(): String = js.native
  def getName(scopeSymbol: Unit, useConstraintInName: Boolean): String = js.native
  def getName(scopeSymbol: PullSymbol): String = js.native
  def getName(scopeSymbol: PullSymbol, useConstraintInName: Boolean): String = js.native
  
  def getNameAndTypeName(): String = js.native
  def getNameAndTypeName(scopeSymbol: PullSymbol): String = js.native
  
  def getNameAndTypeNameEx(): MemberName = js.native
  def getNameAndTypeNameEx(scopeSymbol: PullSymbol): MemberName = js.native
  
  def getNamePartForFullName(): String = js.native
  
  /* private */ def getParameterDocCommentText(param: js.Any, fncDocComments: js.Any): js.Any = js.native
  
  def getRootSymbol(): PullSymbol = js.native
  
  def getScopedName(): String = js.native
  def getScopedName(scopeSymbol: Unit, skipTypeParametersInName: Boolean): String = js.native
  def getScopedName(scopeSymbol: Unit, skipTypeParametersInName: Boolean, useConstraintInName: Boolean): String = js.native
  def getScopedName(
    scopeSymbol: Unit,
    skipTypeParametersInName: Boolean,
    useConstraintInName: Boolean,
    skipInternalAliasName: Boolean
  ): String = js.native
  def getScopedName(
    scopeSymbol: Unit,
    skipTypeParametersInName: Boolean,
    useConstraintInName: Unit,
    skipInternalAliasName: Boolean
  ): String = js.native
  def getScopedName(scopeSymbol: Unit, skipTypeParametersInName: Unit, useConstraintInName: Boolean): String = js.native
  def getScopedName(
    scopeSymbol: Unit,
    skipTypeParametersInName: Unit,
    useConstraintInName: Boolean,
    skipInternalAliasName: Boolean
  ): String = js.native
  def getScopedName(
    scopeSymbol: Unit,
    skipTypeParametersInName: Unit,
    useConstraintInName: Unit,
    skipInternalAliasName: Boolean
  ): String = js.native
  def getScopedName(scopeSymbol: PullSymbol): String = js.native
  def getScopedName(scopeSymbol: PullSymbol, skipTypeParametersInName: Boolean): String = js.native
  def getScopedName(scopeSymbol: PullSymbol, skipTypeParametersInName: Boolean, useConstraintInName: Boolean): String = js.native
  def getScopedName(
    scopeSymbol: PullSymbol,
    skipTypeParametersInName: Boolean,
    useConstraintInName: Boolean,
    skipInternalAliasName: Boolean
  ): String = js.native
  def getScopedName(
    scopeSymbol: PullSymbol,
    skipTypeParametersInName: Boolean,
    useConstraintInName: Unit,
    skipInternalAliasName: Boolean
  ): String = js.native
  def getScopedName(scopeSymbol: PullSymbol, skipTypeParametersInName: Unit, useConstraintInName: Boolean): String = js.native
  def getScopedName(
    scopeSymbol: PullSymbol,
    skipTypeParametersInName: Unit,
    useConstraintInName: Boolean,
    skipInternalAliasName: Boolean
  ): String = js.native
  def getScopedName(
    scopeSymbol: PullSymbol,
    skipTypeParametersInName: Unit,
    useConstraintInName: Unit,
    skipInternalAliasName: Boolean
  ): String = js.native
  
  def getScopedNameEx(
    scopeSymbol: js.UndefOr[PullSymbol],
    skipTypeParametersInName: js.UndefOr[Boolean],
    useConstraintInName: js.UndefOr[Boolean],
    getPrettyTypeName: js.UndefOr[Boolean],
    getTypeParamMarkerInfo: js.UndefOr[Boolean],
    skipInternalAliasName: js.UndefOr[Boolean]
  ): MemberName = js.native
  
  def getTypeName(): String = js.native
  def getTypeName(scopeSymbol: Unit, getPrettyTypeName: Boolean): String = js.native
  def getTypeName(scopeSymbol: PullSymbol): String = js.native
  def getTypeName(scopeSymbol: PullSymbol, getPrettyTypeName: Boolean): String = js.native
  
  def getTypeNameEx(): MemberName = js.native
  def getTypeNameEx(scopeSymbol: Unit, getPrettyTypeName: Boolean): MemberName = js.native
  def getTypeNameEx(scopeSymbol: PullSymbol): MemberName = js.native
  def getTypeNameEx(scopeSymbol: PullSymbol, getPrettyTypeName: Boolean): MemberName = js.native
  
  /* private */ def getTypeNameForFunctionSignature(prefix: js.Any, scopeSymbol: js.Any, getPrettyTypeName: js.Any): js.Any = js.native
  
  def hasDeclaration(decl: PullDecl): Boolean = js.native
  
  var inResolution: Boolean = js.native
  
  def isAccessor(): Boolean = js.native
  
  def isAlias(): Boolean = js.native
  
  def isAny(): Boolean = js.native
  
  def isArrayNamedTypeReference(): Boolean = js.native
  
  def isContainer(): Boolean = js.native
  
  def isError(): Boolean = js.native
  
  def isExternallyVisible(): Boolean = js.native
  def isExternallyVisible(inIsExternallyVisibleSymbols: js.Array[PullSymbol]): Boolean = js.native
  
  def isInterface(): Boolean = js.native
  
  def isMethod(): Boolean = js.native
  
  var isOptional: Boolean = js.native
  
  def isPrimitive(): Boolean = js.native
  
  var isPrinting: Boolean = js.native
  
  def isProperty(): Boolean = js.native
  
  var isResolved: Boolean = js.native
  
  def isSignature(): Boolean = js.native
  
  /* private */ def isSpaceChar(line: js.Any, index: js.Any): js.Any = js.native
  
  /* private */ var isSynthesized: js.Any = js.native
  
  def isType(): Boolean = js.native
  
  def isTypeReference(): Boolean = js.native
  
  var isVarArg: Boolean = js.native
  
  var kind: PullElementKind = js.native
  
  var name: String = js.native
  
  def pathToRoot(): js.Array[PullSymbol] = js.native
  
  var pullSymbolID: Double = js.native
  
  /* private */ var rootSymbol: js.Any = js.native
  
  def setContainer(containerSymbol: PullTypeSymbol): Unit = js.native
  
  def setEnclosingSignature(signature: PullSignatureSymbol): Unit = js.native
  
  def setIsSynthesized(): Unit = js.native
  def setIsSynthesized(value: Boolean): Unit = js.native
  
  def setResolved(): Unit = js.native
  
  def setRootSymbol(symbol: PullSymbol): Unit = js.native
  
  def setUnresolved(): Unit = js.native
  
  def startResolving(): Unit = js.native
  
  def toString(scopeSymbol: Unit, useConstraintInName: Boolean): String = js.native
  def toString(scopeSymbol: PullSymbol): String = js.native
  def toString(scopeSymbol: PullSymbol, useConstraintInName: Boolean): String = js.native
  
  var `type`: PullTypeSymbol = js.native
}
