package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullTypeResolver extends StObject {
  
  def _addUnhiddenSignaturesFromBaseType(
    derivedTypeSignatures: js.Array[PullSignatureSymbol],
    baseTypeSignatures: js.Array[PullSignatureSymbol],
    signaturesBeingAggregated: js.Array[PullSignatureSymbol]
  ): Unit = js.native
  
  /* private */ var _cachedAnyTypeArgs: Any = js.native
  
  /* private */ var _cachedArrayInterfaceType: Any = js.native
  
  /* private */ var _cachedBooleanInterfaceType: Any = js.native
  
  /* private */ var _cachedFunctionArgumentsSymbol: Any = js.native
  
  /* private */ var _cachedFunctionInterfaceType: Any = js.native
  
  /* private */ var _cachedIArgumentsInterfaceType: Any = js.native
  
  /* private */ var _cachedNumberInterfaceType: Any = js.native
  
  /* private */ var _cachedObjectInterfaceType: Any = js.native
  
  /* private */ var _cachedRegExpInterfaceType: Any = js.native
  
  /* private */ var _cachedStringInterfaceType: Any = js.native
  
  def _getBothKindsOfIndexSignatures(enclosingType: PullTypeSymbol, context: PullTypeResolutionContext, includeAugmentedType: Boolean): IndexSignatureInfo = js.native
  
  def _getNamedPropertySymbolOfAugmentedType(symbolName: String, parent: PullTypeSymbol): PullSymbol = js.native
  
  /* private */ def addFilteredDecls(decls: Any, declSearchKind: Any, result: Any): Any = js.native
  
  /* private */ def alterPotentialGenericFunctionTypeToInstantiatedFunctionTypeForTypeArgumentInference(expressionSymbol: Any, context: Any): Any = js.native
  
  /* private */ var assignableCache: Any = js.native
  
  /* private */ def baseListPrivacyErrorReporter(
    classOrInterface: Any,
    declSymbol: Any,
    baseAst: Any,
    isExtendedType: Any,
    symbol: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def bestCommonTypeOfThreeTypes(type1: Any, type2: Any, type3: Any, context: Any): Any = js.native
  
  /* private */ def bestCommonTypeOfTwoTypes(type1: Any, type2: Any, context: Any): Any = js.native
  
  /* private */ def bindObjectLiteralMembers(
    objectLiteralDeclaration: Any,
    objectLiteralTypeSymbol: Any,
    objectLiteralMembers: Any,
    isUsingExistingSymbol: Any,
    pullTypeContext: Any
  ): Any = js.native
  
  /* private */ def cachedArrayInterfaceType(): Any = js.native
  
  /* private */ def cachedBooleanInterfaceType(): Any = js.native
  
  /* private */ def cachedFunctionArgumentsSymbol(): Any = js.native
  
  /* private */ def cachedFunctionInterfaceType(): Any = js.native
  
  /* private */ def cachedIArgumentsInterfaceType(): Any = js.native
  
  /* private */ def cachedNumberInterfaceType(): Any = js.native
  
  /* private */ def cachedObjectInterfaceType(): Any = js.native
  
  /* private */ def cachedRegExpInterfaceType(): Any = js.native
  
  /* private */ def cachedStringInterfaceType(): Any = js.native
  
  /* private */ def canTypeCheckAST(ast: Any, context: Any): Any = js.native
  
  /* private */ def checkArgumentsCollides(ast: Any, context: Any): Any = js.native
  
  /* private */ def checkAssignability(ast: Any, source: Any, target: Any, context: Any): Any = js.native
  
  /* private */ def checkExternalModuleRequireExportsCollides(ast: Any, name: Any, context: Any): Any = js.native
  
  /* private */ def checkForPrivateMemberAccess(name: Any, expressionType: Any, resolvedName: Any, context: Any): Any = js.native
  
  /* private */ def checkForSuperMemberAccess(expression: Any, name: Any, resolvedName: Any, context: Any): Any = js.native
  
  /* private */ def checkForThisCaptureInArrowFunction(expression: Any): Any = js.native
  
  /* private */ def checkFunctionTypePrivacy(
    funcDeclAST: Any,
    isStatic: Any,
    typeParameters: Any,
    parameters: Any,
    returnTypeAnnotation: Any,
    block: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def checkIfGetterAndSetterTypeMatch(funcDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def checkIndexOfRestArgumentInitializationCollides(ast: Any, isDeclaration: Any, context: Any): Any = js.native
  
  /* private */ def checkIndexSignatureIdentityBetweenBases(
    interfaceName: Any,
    interfaceSymbol: Any,
    baseTypeSymbol: Any,
    allInheritedSignatures: Any,
    derivedTypeHasOwnNumberSignature: Any,
    derivedTypeHasOwnStringSignature: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def checkInheritedMembersAgainstInheritedIndexSignatures(
    interfaceName: Any,
    interfaceSymbol: Any,
    inheritedIndexSignatures: Any,
    inheritedMembers: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def checkInitializersInEnumDeclarations(decl: Any, context: Any): Any = js.native
  
  /* private */ def checkInterfaceDeclForIdenticalTypeParameters(interfaceDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def checkNameAsPartOfInitializerExpressionForInstanceMemberVariable(nameAST: Any, nameSymbol: Any, context: Any): Any = js.native
  
  /* private */ def checkNameForCompilerGeneratedDeclarationCollision(astWithName: Any, isDeclaration: Any, name: Any, context: Any): Any = js.native
  
  /* private */ def checkNamedPropertyIdentityBetweenBases(
    interfaceName: Any,
    interfaceSymbol: Any,
    baseTypeSymbol: Any,
    inheritedMembersMap: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def checkSuperCaptureVariableCollides(superAST: Any, isDeclaration: Any, context: Any): Any = js.native
  
  /* private */ def checkSymbolPrivacy(declSymbol: Any, symbol: Any, privacyErrorReporter: Any): Any = js.native
  
  /* private */ def checkThatInheritedNumberSignatureIsSubtypeOfInheritedStringSignature(interfaceName: Any, interfaceSymbol: Any, inheritedIndexSignatures: Any, context: Any): Any = js.native
  
  /* private */ def checkThatNonVoidFunctionHasReturnExpressionOrThrowStatement(functionDecl: Any, returnTypeAnnotation: Any, returnTypeSymbol: Any, block: Any, context: Any): Any = js.native
  
  /* private */ def checkThisCaptureVariableCollides(_thisAST: Any, isDeclaration: Any, context: Any): Any = js.native
  
  /* private */ def checkTypeCompatibilityBetweenBases(name: Any, typeSymbol: Any, context: Any): Any = js.native
  
  /* private */ def checkTypeForDuplicateIndexSignatures(enclosingTypeSymbol: Any): Any = js.native
  
  /* private */ def checkTypePrivacyOfSignatures(declSymbol: Any, signatures: Any, privacyErrorReporter: Any): Any = js.native
  
  /* private */ def checkUniquenessOfImportNames(decls: Any, doesNameExistOutside: Any): Any = js.native
  
  /* private */ var compilationSettings: Any = js.native
  
  /* private */ def computeArrayLiteralExpressionSymbol(arrayLit: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def computeDottedNameExpression(expression: Any, name: Any, context: Any, checkSuperPrivateAndStaticAccess: Any): Any = js.native
  
  /* private */ def computeDottedNameExpressionFromLHS(lhs: Any, expression: Any, name: Any, context: Any, checkSuperPrivateAndStaticAccess: Any): Any = js.native
  
  /* private */ def computeElementAccessExpressionSymbolAndDiagnostic(callEx: Any, context: Any): Any = js.native
  
  /* private */ def computeInvocationExpressionSymbol(callEx: Any, context: Any, additionalResults: Any): Any = js.native
  
  /* private */ def computeNameExpression(nameAST: Any, context: Any): Any = js.native
  
  /* private */ def computeObjectCreationExpressionSymbol(callEx: Any, context: Any, additionalResults: Any): Any = js.native
  
  /* private */ def computeObjectLiteralExpression(objectLitAST: Any, isContextuallyTyped: Any, context: Any, additionalResults: Any): Any = js.native
  
  /* private */ def computeQualifiedName(dottedNameAST: Any, context: Any): Any = js.native
  
  /* private */ def computeTypeNameExpression(nameAST: Any, context: Any): Any = js.native
  
  /* private */ def computeTypeOfConditionalExpression(leftType: Any, rightType: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def computeTypeReferenceSymbol(term: Any, context: Any): Any = js.native
  
  /* private */ def computeValueSymbolFromAST(valueDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def conditionExpressionTypesAreValid(leftType: Any, rightType: Any, expressionType: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def constructorHasSuperCall(constructorDecl: Any): Any = js.native
  
  /* private */ def containsSingleThrowStatement(block: Any): Any = js.native
  
  def createInstantiatedType(`type`: PullTypeSymbol, typeArguments: js.Array[PullTypeSymbol]): PullTypeSymbol = js.native
  
  /* private */ def determineRelevantIndexerForMember(member: Any, numberIndexSignature: Any, stringIndexSignature: Any): Any = js.native
  
  /* private */ def enclosingClassIsDerived(classDecl: Any): Any = js.native
  
  /* private */ def ensureAllSymbolsAreBound(containerSymbol: Any): Any = js.native
  
  /* private */ def filterSymbol(symbol: Any, kind: Any, enclosingDecl: Any, context: Any): Any = js.native
  
  def findBestCommonType(collection: IPullTypeCollection, context: PullTypeResolutionContext): PullTypeSymbol = js.native
  def findBestCommonType(
    collection: IPullTypeCollection,
    context: PullTypeResolutionContext,
    comparisonInfo: TypeComparisonInfo
  ): PullTypeSymbol = js.native
  
  /* private */ def findConstructorDeclOfEnclosingType(decl: Any): Any = js.native
  
  /* private */ def functionArgumentTypePrivacyErrorReporter(
    declAST: Any,
    isStatic: Any,
    parameters: Any,
    argIndex: Any,
    paramSymbol: Any,
    symbol: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def functionReturnTypePrivacyErrorReporter(
    declAST: Any,
    isStatic: Any,
    returnTypeAnnotation: Any,
    block: Any,
    funcReturnType: Any,
    symbol: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def functionTypeArgumentArgumentTypePrivacyErrorReporter(declAST: Any, isStatic: Any, typeParameterAST: Any, typeParameter: Any, symbol: Any, context: Any): Any = js.native
  
  /* private */ def genericTypeIsUsedWithoutRequiredTypeArguments(typeSymbol: Any, term: Any, context: Any): Any = js.native
  
  def getASTForDecl(decl: PullDecl): AST = js.native
  
  /* private */ def getApparentType(`type`: Any): Any = js.native
  
  def getArrayNamedType(): PullTypeSymbol = js.native
  
  /* private */ def getArrayType(elementType: Any): Any = js.native
  
  /* private */ def getBothKindsOfIndexSignaturesExcludingAugmentedType(enclosingType: Any, context: Any): Any = js.native
  
  /* private */ def getBothKindsOfIndexSignaturesIncludingAugmentedType(enclosingType: Any, context: Any): Any = js.native
  
  /* private */ def getCallTargetErrorSpanAST(callEx: Any): Any = js.native
  
  /* private */ def getContextualClassSymbolForEnclosingDecl(ast: Any, enclosingDecl: Any): Any = js.native
  
  /* private */ def getCurrentParameterIndexForFunction(parameter: Any, funcDecl: Any): Any = js.native
  
  /* private */ def getEnclosingClassDeclaration(ast: Any): Any = js.native
  
  def getEnclosingDecl(decl: PullDecl): PullDecl = js.native
  
  /* private */ def getEnclosingDeclForAST(ast: Any): Any = js.native
  
  /* private */ def getEnclosingFunctionDeclaration(ast: Any): Any = js.native
  
  /* private */ def getEnclosingLabels(ast: Any, breakable: Any, crossFunctions: Any): Any = js.native
  
  /* private */ def getEnclosingSymbolForAST(ast: Any): Any = js.native
  
  /* private */ def getEnumTypeSymbol(enumElement: Any, context: Any): Any = js.native
  
  /* private */ def getExportedMemberSymbol(symbol: Any, parent: Any): Any = js.native
  
  /* private */ def getFirstStatementOfBlockOrNull(block: Any): Any = js.native
  
  /* private */ def getInstanceTypeForAssignment(lhs: Any, `type`: Any, context: Any): Any = js.native
  
  /* private */ def getMemberSymbolOfKind(symbolName: Any, kind: Any, pullTypeSymbol: Any, enclosingDecl: Any, context: Any): Any = js.native
  
  /* private */ def getNamedPropertySymbol(symbolName: Any, declSearchKind: Any, parent: Any): Any = js.native
  
  def getNewErrorTypeSymbol(): PullErrorTypeSymbol = js.native
  def getNewErrorTypeSymbol(name: String): PullErrorTypeSymbol = js.native
  
  /* private */ def getPropertyAssignmentName(propertyAssignment: Any): Any = js.native
  
  /* private */ def getSomeInnermostFunctionScopeDecl(declPath: Any): Any = js.native
  
  /* private */ def getSymbolForAST(ast: Any, context: Any): Any = js.native
  
  /* private */ def getSymbolForRelationshipCheck(symbol: Any): Any = js.native
  
  /* private */ def getSymbolFromDeclPath(symbolName: Any, declPath: Any, declSearchKind: Any): Any = js.native
  
  def getVisibleContextSymbols(enclosingDecl: PullDecl, context: PullTypeResolutionContext): js.Array[PullSymbol] = js.native
  
  def getVisibleDecls(enclosingDecl: PullDecl): js.Array[PullDecl] = js.native
  
  /* private */ def getVisibleDeclsFromDeclPath(declPath: Any, declSearchKind: Any): Any = js.native
  
  def getVisibleMembersFromExpression(expression: AST, enclosingDecl: PullDecl, context: PullTypeResolutionContext): js.Array[PullSymbol] = js.native
  
  /* private */ def hasClassTypeSymbolConflictAsValue(baseDeclAST: Any, typeSymbol: Any, enclosingDecl: Any, context: Any): Any = js.native
  
  /* private */ def hasRestParameterCodeGen(someFunctionDecl: Any): Any = js.native
  
  /* private */ var identicalCache: Any = js.native
  
  /* private */ def inArgumentListOfSuperInvocation(ast: Any): Any = js.native
  
  /* private */ def inClassExtendsHeritageClause(ast: Any): Any = js.native
  
  /* private */ def inConstructorParameterList(ast: Any): Any = js.native
  
  /* private */ def inIterationStatement(ast: Any, crossFunctions: Any): Any = js.native
  
  /* private */ var inResolvingOtherDeclsWalker: Any = js.native
  
  /* private */ def inStaticMemberVariableDeclaration(ast: Any): Any = js.native
  
  /* private */ def inSwitchStatement(ast: Any): Any = js.native
  
  /* private */ def inTypeArgumentList(ast: Any): Any = js.native
  
  /* private */ def inTypeQuery(ast: Any): Any = js.native
  
  /* private */ def inferArgumentTypesForSignature(argContext: Any, comparisonInfo: Any, context: Any): Any = js.native
  
  /* private */ def infinitelyExpandingSourceTypeIsRelatableToTargetType(
    sourceType: Any,
    targetType: Any,
    assignableTo: Any,
    comparisonCache: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def infinitelyExpandingTypesAreIdentical(sourceType: Any, targetType: Any, context: Any): Any = js.native
  
  def instantiateSignature(signature: PullSignatureSymbol, typeParameterArgumentMap: TypeArgumentMap): PullSignatureSymbol = js.native
  
  /* private */ def instantiateSignatureInContext(
    signatureAToInstantiate: Any,
    contextualSignatureB: Any,
    context: Any,
    shouldFixContextualSignatureParameterTypes: Any
  ): Any = js.native
  
  def instantiateSignatureToAny(signature: PullSignatureSymbol): PullSignatureSymbol = js.native
  
  def instantiateType(`type`: PullTypeSymbol, typeParameterArgumentMap: TypeArgumentMap): PullTypeSymbol = js.native
  
  def instantiateTypeParameter(typeParameter: PullTypeParameterSymbol, typeParameterArgumentMap: TypeArgumentMap): PullTypeParameterSymbol = js.native
  
  def instantiateTypeToAny(typeToSpecialize: PullTypeSymbol, context: PullTypeResolutionContext): PullTypeSymbol = js.native
  
  /* private */ def isAnyFunctionExpressionOrDeclaration(ast: Any): Any = js.native
  
  /* private */ def isAnyOrEquivalent(`type`: Any): Any = js.native
  
  /* private */ def isAnyOrNumberOrEnum(`type`: Any): Any = js.native
  
  /* private */ def isForInVariableDeclarator(ast: Any): Any = js.native
  
  /* private */ def isFromFunctionScope(nameSymbol: Any, functionScopeDecl: Any): Any = js.native
  
  /* private */ def isFunctionAccessorOrNonArrowFunctionExpression(decl: Any): Any = js.native
  
  /* private */ def isFunctionOrNonArrowFunctionExpression(decl: Any): Any = js.native
  
  /* private */ def isFunctionTypeWithExactlyOneCallSignatureAndNoOtherMembers(`type`: Any, callSignatureShouldBeGeneric: Any): Any = js.native
  
  /* private */ def isInEnumDecl(decl: Any): Any = js.native
  
  /* private */ def isInStaticMemberContext(decl: Any): Any = js.native
  
  /* private */ def isIterationStatement(ast: Any): Any = js.native
  
  /* private */ def isLastNameOfModuleNameModuleReference(ast: Any): Any = js.native
  
  /* private */ def isLeftSideOfQualifiedName(ast: Any): Any = js.native
  
  /* private */ def isReference(ast: Any, astSymbol: Any): Any = js.native
  
  /* private */ def isSourceTypeParameterConstrainedToTargetTypeParameter(source: Any, target: Any): Any = js.native
  
  /* private */ def isSuperInvocationExpression(ast: Any): Any = js.native
  
  /* private */ def isSuperInvocationExpressionStatement(node: Any): Any = js.native
  
  /* private */ def isTypeRefWithoutTypeArgs(term: Any): Any = js.native
  
  /* private */ def labelIsOnContinuableConstruct(statement: Any): Any = js.native
  
  /* private */ def needsToWidenObjectLiteralType(`type`: Any, ast: Any, context: Any): Any = js.native
  
  /* private */ def overloadHasCorrectArity(signature: Any, args: Any): Any = js.native
  
  /* private */ def overloadIsApplicable(signature: Any, args: Any, context: Any, comparisonInfo: Any): Any = js.native
  
  /* private */ def overloadIsApplicableForAnyFunctionExpressionArgument(
    paramType: Any,
    arg: Any,
    typeParameters: Any,
    parameters: Any,
    returnTypeAnnotation: Any,
    block: Any,
    bodyExpression: Any,
    argIndex: Any,
    context: Any,
    comparisonInfo: Any
  ): Any = js.native
  
  /* private */ def overloadIsApplicableForArgument(paramType: Any, arg: Any, argIndex: Any, context: Any, comparisonInfo: Any): Any = js.native
  
  /* private */ def overloadIsApplicableForArgumentHelper(paramType: Any, argSym: Any, argumentIndex: Any, comparisonInfo: Any, arg: Any, context: Any): Any = js.native
  
  /* private */ def overloadIsApplicableForArrayLiteralArgument(paramType: Any, arg: Any, argIndex: Any, context: Any, comparisonInfo: Any): Any = js.native
  
  /* private */ def overloadIsApplicableForObjectLiteralArgument(paramType: Any, arg: Any, argIndex: Any, context: Any, comparisonInfo: Any): Any = js.native
  
  /* private */ def overloadIsApplicableForOtherArgument(paramType: Any, arg: Any, argIndex: Any, context: Any, comparisonInfo: Any): Any = js.native
  
  /* private */ def postOverloadResolutionDiagnostics(diagnostic: Any, additionalResults: Any, context: Any): Any = js.native
  
  /* private */ def postTypeCheck(ast: Any, context: Any): Any = js.native
  
  /* private */ def postTypeCheckClassDeclaration(classDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def postTypeCheckEnumDeclaration(ast: Any, context: Any): Any = js.native
  
  /* private */ def postTypeCheckFunctionDeclaration(funcDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def postTypeCheckImportDeclaration(importStatementAST: Any, context: Any): Any = js.native
  
  /* private */ def postTypeCheckModuleDeclaration(ast: Any, context: Any): Any = js.native
  
  /* private */ def postTypeCheckNameExpression(nameAST: Any, context: Any): Any = js.native
  
  /* private */ def postTypeCheckVariableDeclaratorOrParameter(varDeclOrParameter: Any, context: Any): Any = js.native
  
  /* private */ var postTypeCheckWorkitems: Any = js.native
  
  /* private */ def processPostTypeCheckWorkItems(context: Any): Any = js.native
  
  /* private */ def propertiesAreIdentical(propertySymbol1: Any, propertySymbol2: Any, context: Any): Any = js.native
  
  /* private */ def propertiesAreIdenticalWithNewEnclosingTypes(type1: Any, type2: Any, property1: Any, property2: Any, context: Any): Any = js.native
  
  /* private */ def relateFunctionSignatureToTypeParameters(expressionSignature: Any, parameterSignature: Any, argContext: Any, context: Any): Any = js.native
  
  /* private */ def relateInifinitelyExpandingTypeToTypeParameters(expressionType: Any, parameterType: Any, argContext: Any, context: Any): Any = js.native
  
  /* private */ def relateObjectTypeToTypeParameters(objectType: Any, parameterType: Any, argContext: Any, context: Any): Any = js.native
  
  /* private */ def relateSignatureGroupToTypeParameters(
    argumentSignatures: Any,
    parameterSignatures: Any,
    signatureKind: Any,
    argContext: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def relateTypeArgumentsOfTypeToTypeParameters(expressionType: Any, parameterType: Any, argContext: Any, context: Any): Any = js.native
  
  def relateTypeToTypeParameters(
    expressionType: PullTypeSymbol,
    parameterType: PullTypeSymbol,
    argContext: TypeArgumentInferenceContext,
    context: PullTypeResolutionContext
  ): Unit = js.native
  
  /* private */ def relateTypeToTypeParametersInEnclosingType(expressionType: Any, parameterType: Any, argContext: Any, context: Any): Any = js.native
  
  def relateTypeToTypeParametersWithNewEnclosingTypes(
    expressionType: PullTypeSymbol,
    parameterType: PullTypeSymbol,
    argContext: TypeArgumentInferenceContext,
    context: PullTypeResolutionContext
  ): Unit = js.native
  
  /* private */ def reportErrorThatMemberIsNotSubtypeOfIndexer(member: Any, indexSignature: Any, astForError: Any, context: Any, comparisonInfo: Any): Any = js.native
  
  def resolveAST(ast: AST, isContextuallyTyped: Boolean, context: PullTypeResolutionContext): PullSymbol = js.native
  
  /* private */ def resolveAccessorDeclaration(funcDeclAst: Any, context: Any): Any = js.native
  
  /* private */ def resolveAndTypeCheckVariableDeclarationTypeExpr(varDeclOrParameter: Any, name: Any, typeExpr: Any, context: Any): Any = js.native
  
  /* private */ def resolveAndTypeCheckVariableDeclaratorOrParameterInitExpr(varDeclOrParameter: Any, name: Any, typeExpr: Any, init: Any, context: Any, typeExprSymbol: Any): Any = js.native
  
  /* private */ def resolveAnyFunctionDeclaration(funcDecl: Any, context: Any): Any = js.native
  
  /* private */ def resolveAnyFunctionExpression(
    funcDeclAST: Any,
    typeParameters: Any,
    parameters: Any,
    returnTypeAnnotation: Any,
    block: Any,
    bodyExpression: Any,
    isContextuallyTyped: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def resolveAnyFunctionExpressionParameters(
    funcDeclAST: Any,
    typeParameters: Any,
    parameters: Any,
    returnTypeAnnotation: Any,
    isContextuallyTyped: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def resolveAnyFunctionTypeSignature(funcDeclAST: Any, typeParameters: Any, parameterList: Any, returnTypeAnnotation: Any, context: Any): Any = js.native
  
  /* private */ def resolveArrayLiteralExpression(arrayLit: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def resolveAssignmentExpression(binaryExpression: Any, context: Any): Any = js.native
  
  /* private */ def resolveBinaryAdditionOperation(binaryExpression: Any, context: Any): Any = js.native
  
  /* private */ def resolveBinaryArithmeticExpression(binaryExpression: Any, context: Any): Any = js.native
  
  /* private */ def resolveBlock(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveBreakStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveCallSignature(funcDecl: Any, context: Any): Any = js.native
  
  /* private */ def resolveCastExpression(assertionExpression: Any, context: Any): Any = js.native
  
  /* private */ def resolveCatchClause(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveClassDeclaration(classDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def resolveCommaExpression(commaExpression: Any, context: Any): Any = js.native
  
  /* private */ def resolveConditionalExpression(trinex: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def resolveConstraint(constraint: Any, context: Any): Any = js.native
  
  /* private */ def resolveConstructSignature(funcDecl: Any, context: Any): Any = js.native
  
  /* private */ def resolveConstructorDeclaration(funcDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def resolveContinueStatement(ast: Any, context: Any): Any = js.native
  
  def resolveDeclaredSymbol[TSymbol /* <: PullSymbol */](symbol: TSymbol): TSymbol = js.native
  def resolveDeclaredSymbol[TSymbol /* <: PullSymbol */](symbol: TSymbol, context: PullTypeResolutionContext): TSymbol = js.native
  
  /* private */ def resolveDeclaredSymbolWorker[TSymbol /* <: PullSymbol */](symbol: Any, context: Any): Any = js.native
  
  /* private */ def resolveDeleteExpression(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveDoStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveDottedNameExpression(dottedNameAST: Any, expression: Any, name: Any, context: Any): Any = js.native
  
  /* private */ def resolveElementAccessExpression(callEx: Any, context: Any): Any = js.native
  
  /* private */ def resolveElseClause(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveEnumDeclaration(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveEnumElement(enumElement: Any, context: Any): Any = js.native
  
  /* private */ def resolveEqualsValueClause(clause: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def resolveExportAssignmentStatement(exportAssignmentAST: Any, context: Any): Any = js.native
  
  /* private */ def resolveExpressionAST(ast: Any, isContextuallyOrInferentiallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def resolveExpressionStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveExpressionWorker(ast: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def resolveExternalModuleReference(idText: Any, currentFileName: Any): Any = js.native
  
  /* private */ def resolveFinallyClause(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveFirstExportAssignmentStatement(moduleElements: Any, context: Any): Any = js.native
  
  /* private */ def resolveFirstTypeParameterDeclaration(typeParameterSymbol: Any, context: Any): Any = js.native
  
  /* private */ def resolveForInStatement(forInStatement: Any, context: Any): Any = js.native
  
  /* private */ def resolveForStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveFunctionBodyReturnTypes(
    funcDeclAST: Any,
    block: Any,
    bodyExpression: Any,
    signature: Any,
    useContextualType: Any,
    enclosingDecl: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def resolveFunctionDeclaration(
    funcDeclAST: Any,
    isStatic: Any,
    name: Any,
    typeParameters: Any,
    parameterList: Any,
    returnTypeAnnotation: Any,
    block: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def resolveFunctionExpression(funcDecl: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def resolveFunctionExpressionParameter(
    argDeclAST: Any,
    id: Any,
    typeExpr: Any,
    equalsValueClause: Any,
    contextParam: Any,
    enclosingDecl: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def resolveFunctionPropertyAssignment(funcProp: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def resolveFunctionTypeSignatureParameter(argDeclAST: Any, signature: Any, enclosingDecl: Any, context: Any): Any = js.native
  
  /* private */ def resolveGenericTypeReference(genericTypeAST: Any, context: Any): Any = js.native
  
  /* private */ def resolveGetAccessorDeclaration(
    funcDeclAST: Any,
    parameters: Any,
    returnTypeAnnotation: Any,
    block: Any,
    setterAnnotatedType: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def resolveGetterReturnTypeAnnotation(getterFunctionDeclarationAst: Any, enclosingDecl: Any, context: Any): Any = js.native
  
  /* private */ def resolveIdentifierOfInternalModuleReference(importDecl: Any, identifier: Any, moduleSymbol: Any, enclosingDecl: Any, context: Any): Any = js.native
  
  /* private */ def resolveIfStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveImportDeclaration(importStatementAST: Any, context: Any): Any = js.native
  
  /* private */ def resolveInExpression(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveIndexMemberDeclaration(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveIndexSignature(funcDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def resolveInstanceOfExpression(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveInterfaceDeclaration(interfaceDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def resolveInternalModuleReference(importStatementAST: Any, context: Any): Any = js.native
  
  def resolveInvocationExpression(callEx: InvocationExpression, context: PullTypeResolutionContext): PullSymbol = js.native
  def resolveInvocationExpression(
    callEx: InvocationExpression,
    context: PullTypeResolutionContext,
    additionalResults: PullAdditionalCallResolutionData
  ): PullSymbol = js.native
  
  /* private */ def resolveLabeledStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveList(list: Any, context: Any): Any = js.native
  
  /* private */ def resolveLogicalAndExpression(binex: Any, context: Any): Any = js.native
  
  /* private */ def resolveLogicalNotExpression(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveLogicalOperation(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveLogicalOrExpression(binex: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def resolveMemberAccessExpression(dottedNameAST: Any, context: Any): Any = js.native
  
  /* private */ def resolveMemberFunctionDeclaration(funcDecl: Any, context: Any): Any = js.native
  
  /* private */ def resolveMemberVariableDeclaration(varDecl: Any, context: Any): Any = js.native
  
  /* private */ def resolveMethodSignature(funcDecl: Any, context: Any): Any = js.native
  
  /* private */ def resolveModuleDeclaration(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveModuleReference(importDecl: Any, moduleNameExpr: Any, enclosingDecl: Any, context: Any, declPath: Any): Any = js.native
  
  /* private */ def resolveModuleSymbol(containerSymbol: Any, context: Any, moduleDeclAST: Any, moduleDeclNameAST: Any, sourceUnitAST: Any): Any = js.native
  
  /* private */ def resolveNameExpression(nameAST: Any, context: Any): Any = js.native
  
  def resolveObjectCreationExpression(callEx: ObjectCreationExpression, context: PullTypeResolutionContext): PullSymbol = js.native
  def resolveObjectCreationExpression(
    callEx: ObjectCreationExpression,
    context: PullTypeResolutionContext,
    additionalResults: PullAdditionalCallResolutionData
  ): PullSymbol = js.native
  
  def resolveObjectLiteralExpression(
    expressionAST: ObjectLiteralExpression,
    isContextuallyTyped: Boolean,
    context: PullTypeResolutionContext
  ): PullSymbol = js.native
  def resolveObjectLiteralExpression(
    expressionAST: ObjectLiteralExpression,
    isContextuallyTyped: Boolean,
    context: PullTypeResolutionContext,
    additionalResults: PullAdditionalObjectLiteralResolutionData
  ): PullSymbol = js.native
  
  /* private */ def resolveObjectLiteralMembers(
    objectLiteralDeclaration: Any,
    objectLiteralTypeSymbol: Any,
    objectLiteralContextualType: Any,
    objectLiteralMembers: Any,
    stringIndexerSignature: Any,
    numericIndexerSignature: Any,
    allMemberTypes: Any,
    allNumericMemberTypes: Any,
    boundMemberSymbols: Any,
    isUsingExistingSymbol: Any,
    pullTypeContext: Any,
    additionalResults: Any
  ): Any = js.native
  
  /* private */ def resolveObjectTypeTypeReference(objectType: Any, context: Any): Any = js.native
  
  /* private */ def resolveOtherDecl(otherDecl: Any, context: Any): Any = js.native
  
  /* private */ def resolveOtherDeclarations(astName: Any, context: Any): Any = js.native
  
  /* private */ def resolveOverloads(application: Any, group: Any, haveTypeArgumentsAtCallSite: Any, context: Any, diagnostics: Any): Any = js.native
  
  /* private */ def resolveParameter(parameter: Any, context: Any): Any = js.native
  
  /* private */ def resolveParameterList(list: Any, context: Any): Any = js.native
  
  /* private */ def resolveParenthesizedArrowFunctionExpression(funcDecl: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def resolveParenthesizedExpression(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolvePostfixUnaryExpression(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolvePropertySignature(varDecl: Any, context: Any): Any = js.native
  
  /* private */ def resolveQualifiedName(dottedNameAST: Any, context: Any): Any = js.native
  
  /* private */ def resolveReferenceTypeDeclaration(classOrInterface: Any, name: Any, heritageClauses: Any, context: Any): Any = js.native
  
  /* private */ def resolveRegularExpressionLiteral(): Any = js.native
  
  /* private */ def resolveReturnExpression(expression: Any, enclosingFunction: Any, context: Any): Any = js.native
  
  /* private */ def resolveReturnStatement(returnAST: Any, context: Any): Any = js.native
  
  /* private */ def resolveReturnTypeAnnotationOfFunctionDeclaration(funcDeclAST: Any, returnTypeAnnotation: Any, context: Any): Any = js.native
  
  /* private */ def resolveSeparatedList(list: Any, context: Any): Any = js.native
  
  /* private */ def resolveSetAccessorDeclaration(funcDeclAST: Any, parameterList: Any, context: Any): Any = js.native
  
  /* private */ def resolveSetterArgumentTypeAnnotation(setterFunctionDeclarationAst: Any, enclosingDecl: Any, context: Any): Any = js.native
  
  /* private */ def resolveSimpleArrowFunctionExpression(funcDecl: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def resolveSimplePropertyAssignment(propertyAssignment: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def resolveSingleModuleDeclaration(ast: Any, astName: Any, context: Any): Any = js.native
  
  /* private */ def resolveSourceUnit(sourceUnit: Any, context: Any): Any = js.native
  
  /* private */ def resolveSuperExpression(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveSwitchStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveThisExpression(thisExpression: Any, context: Any): Any = js.native
  
  /* private */ def resolveThrowStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveTryStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveTypeAnnotation(typeAnnotation: Any, context: Any): Any = js.native
  
  /* private */ def resolveTypeNameExpression(nameAST: Any, context: Any): Any = js.native
  
  /* private */ def resolveTypeOfExpression(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveTypeParameterDeclaration(typeParameterAST: Any, context: Any): Any = js.native
  
  def resolveTypeReference(typeRef: AST, context: PullTypeResolutionContext): PullTypeSymbol = js.native
  
  /* private */ def resolveTypeSymbolSignatures(typeSymbol: Any, context: Any): Any = js.native
  
  /* private */ def resolveUnaryArithmeticOperation(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveVariableDeclarationList(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveVariableDeclarator(varDecl: Any, context: Any): Any = js.native
  
  /* private */ def resolveVariableDeclaratorOrParameterOrEnumElement(varDeclOrParameter: Any, modifiers: Any, name: Any, typeExpr: Any, init: Any, context: Any): Any = js.native
  
  /* private */ def resolveVariableStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveVoidExpression(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveWhileStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def resolveWithStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def scanVariableDeclarationGroups(enclosingDecl: Any, firstDeclHandler: Any, subsequentDeclHandler: Any): Any = js.native
  
  var semanticInfoChain: SemanticInfoChain = js.native
  
  /* private */ def setSymbolForAST(ast: Any, symbol: Any, context: Any): Any = js.native
  
  /* private */ def setTypeChecked(ast: Any, context: Any): Any = js.native
  
  /* private */ def setTypeParameterIdentity(tp1: Any, tp2: Any, `val`: Any): Any = js.native
  
  /* private */ def shouldContextuallyTypeAnyFunctionExpression(
    functionExpressionAST: Any,
    typeParameters: Any,
    parameters: Any,
    returnTypeAnnotation: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def signatureGroupIsRelatableToTarget(
    source: Any,
    target: Any,
    sourceSG: Any,
    targetSG: Any,
    assignableTo: Any,
    comparisonCache: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def signatureGroupsAreIdentical(sg1: Any, sg2: Any, context: Any): Any = js.native
  
  /* private */ def signatureIsAssignableToTarget(
    s1: Any,
    s2: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def signatureIsRelatableToTarget(
    sourceSig: Any,
    targetSig: Any,
    assignableTo: Any,
    comparisonCache: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def signatureIsRelatableToTargetWorker(
    sourceSig: Any,
    targetSig: Any,
    assignableTo: Any,
    comparisonCache: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  def signatureReturnTypesAreIdentical(s1: PullSignatureSymbol, s2: PullSignatureSymbol, context: PullTypeResolutionContext): Boolean = js.native
  
  /* private */ def signatureTypeParametersParametersAndReturnTypesAreIdentical(s1: Any, s2: Any, context: Any, includingReturnType: Any): Any = js.native
  
  /* private */ def signaturesAreIdentical(s1: Any, s2: Any, context: Any, includingReturnType: Any): Any = js.native
  
  def signaturesAreIdenticalWithNewEnclosingTypes(s1: PullSignatureSymbol, s2: PullSignatureSymbol, context: PullTypeResolutionContext): Boolean = js.native
  def signaturesAreIdenticalWithNewEnclosingTypes(
    s1: PullSignatureSymbol,
    s2: PullSignatureSymbol,
    context: PullTypeResolutionContext,
    includingReturnType: Boolean
  ): Boolean = js.native
  
  def signaturesAreIdenticalWorker(s1: PullSignatureSymbol, s2: PullSignatureSymbol, context: PullTypeResolutionContext): Boolean = js.native
  def signaturesAreIdenticalWorker(
    s1: PullSignatureSymbol,
    s2: PullSignatureSymbol,
    context: PullTypeResolutionContext,
    includingReturnType: Boolean
  ): Boolean = js.native
  
  /* private */ def sourceCallSignaturesAreAssignableToTargetCallSignatures(
    source: Any,
    target: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourceCallSignaturesAreRelatableToTargetCallSignatures(
    source: Any,
    target: Any,
    assignableTo: Any,
    comparisonCache: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourceConstructSignaturesAreAssignableToTargetConstructSignatures(
    source: Any,
    target: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourceConstructSignaturesAreRelatableToTargetConstructSignatures(
    source: Any,
    target: Any,
    assignableTo: Any,
    comparisonCache: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourceIndexSignaturesAreAssignableToTargetIndexSignatures(
    source: Any,
    target: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourceIndexSignaturesAreRelatableToTargetIndexSignatures(
    source: Any,
    target: Any,
    assignableTo: Any,
    comparisonCache: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourceIsAssignableToTarget(
    source: Any,
    target: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourceIsAssignableToTargetWithNewEnclosingTypes(
    source: Any,
    target: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourceIsRelatableToTarget(
    source: Any,
    target: Any,
    assignableTo: Any,
    comparisonCache: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourceIsRelatableToTargetInCache(source: Any, target: Any, comparisonCache: Any, comparisonInfo: Any): Any = js.native
  
  /* private */ def sourceIsRelatableToTargetInEnclosingTypes(
    source: Any,
    target: Any,
    assignableTo: Any,
    comparisonCache: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourceIsRelatableToTargetWithNewEnclosingTypes(
    source: Any,
    target: Any,
    assignableTo: Any,
    comparisonCache: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourceIsRelatableToTargetWorker(
    source: Any,
    target: Any,
    assignableTo: Any,
    comparisonCache: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourceIsSubtypeOfTarget(
    source: Any,
    target: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourceMembersAreAssignableToTargetMembers(
    source: Any,
    target: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourceMembersAreRelatableToTargetMembers(
    source: Any,
    target: Any,
    assignableTo: Any,
    comparisonCache: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourcePropertyIsAssignableToTargetProperty(
    source: Any,
    target: Any,
    sourceProp: Any,
    targetProp: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def sourcePropertyIsRelatableToTargetProperty(
    source: Any,
    target: Any,
    sourceProp: Any,
    targetProp: Any,
    assignableTo: Any,
    comparisonCache: Any,
    ast: Any,
    context: Any,
    comparisonInfo: Any,
    isComparingInstantiatedSignatures: Any
  ): Any = js.native
  
  /* private */ def stampObjectLiteralWithIndexSignature(objectLiteralSymbol: Any, indexerTypeCandidates: Any, contextualIndexSignature: Any, context: Any): Any = js.native
  
  /* private */ var subtypeCache: Any = js.native
  
  /* private */ def superCallMustBeFirstStatementInConstructor(constructorDecl: Any): Any = js.native
  
  /* private */ def symbolsShareDeclaration(symbol1: Any, symbol2: Any): Any = js.native
  
  /* private */ def typeCheckAST(ast: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckAccessorDeclaration(funcDeclAst: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckAnyFunctionDeclaration(
    funcDeclAST: Any,
    isStatic: Any,
    name: Any,
    typeParameters: Any,
    parameters: Any,
    returnTypeAnnotation: Any,
    block: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def typeCheckAnyFunctionExpression(
    funcDeclAST: Any,
    typeParameters: Any,
    parameters: Any,
    returnTypeAnnotation: Any,
    block: Any,
    bodyExpression: Any,
    isContextuallyTyped: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def typeCheckBase(
    classOrInterface: Any,
    name: Any,
    typeSymbol: Any,
    baseDeclAST: Any,
    isExtendedType: Any,
    enclosingDecl: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def typeCheckBases(
    classOrInterface: Any,
    name: Any,
    heritageClauses: Any,
    typeSymbol: Any,
    enclosingDecl: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def typeCheckBinaryArithmeticExpression(binaryExpression: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckBreakStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ var typeCheckCallBacks: Any = js.native
  
  /* private */ def typeCheckCallSignature(funcDecl: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckCastExpression(assertionExpression: Any, context: Any, typeAssertionType: Any): Any = js.native
  
  /* private */ def typeCheckCatchClause(ast: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckClassDeclaration(classDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckConstructSignature(funcDecl: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckConstructorDeclaration(funcDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckContinueStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckDoStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckElementAccessExpression(callEx: Any, context: Any, symbolAndDiagnostic: Any): Any = js.native
  
  /* private */ def typeCheckElseClause(ast: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckEnumDeclaration(ast: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckEnumElement(enumElement: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckFinallyClause(ast: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckForInStatement(forInStatement: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckFunctionExpression(funcDecl: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckFunctionOverloads(funcDecl: Any, context: Any, signature: Any, allSignatures: Any): Any = js.native
  
  /* private */ def typeCheckFunctionPropertyAssignment(funcProp: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckGetAccessorDeclaration(funcDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckIfClassImplementsType(classDecl: Any, classSymbol: Any, implementedType: Any, enclosingDecl: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckIfStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckIfTypeExtendsType(
    classOrInterface: Any,
    name: Any,
    typeSymbol: Any,
    extendedType: Any,
    enclosingDecl: Any,
    context: Any
  ): Any = js.native
  
  /* private */ def typeCheckIfTypeMemberPropertyOkToOverride(
    typeSymbol: Any,
    extendedType: Any,
    typeMember: Any,
    extendedTypeMember: Any,
    enclosingDecl: Any,
    comparisonInfo: Any
  ): Any = js.native
  
  /* private */ def typeCheckImportDeclaration(importStatementAST: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckInExpression(binaryExpression: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckIndexSignature(funcDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckInstanceOfExpression(binaryExpression: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckInterfaceDeclaration(interfaceDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckInvocationExpression(callEx: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckLabeledStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckLogicalOperation(binex: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckMemberFunctionDeclaration(funcDecl: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckMemberVariableDeclaration(varDecl: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckMembersAgainstIndexer(containerType: Any, containerTypeDecl: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckMethodSignature(funcDecl: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckModuleDeclaration(ast: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckNameExpression(nameAST: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckObjectCreationExpression(callEx: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckObjectTypeTypeReference(objectType: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckParameter(parameter: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckParenthesizedArrowFunctionExpression(arrowFunction: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckPostfixUnaryExpression(unaryExpression: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckPropertySignature(varDecl: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckReturnExpression(expression: Any, expressionType: Any, enclosingFunction: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckSetAccessorDeclaration(funcDeclAST: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckSimpleArrowFunctionExpression(arrowFunction: Any, isContextuallyTyped: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckSingleModuleDeclaration(ast: Any, astName: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckSourceUnit(sourceUnit: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckSuperExpression(ast: Any, context: Any, enclosingDecl: Any): Any = js.native
  
  /* private */ def typeCheckSwitchStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckThisExpression(thisExpression: Any, context: Any, enclosingDecl: Any): Any = js.native
  
  /* private */ def typeCheckTryStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckTypeParameterDeclaration(typeParameterAST: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckTypeParametersOfTypeDeclaration(classOrInterface: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckUnaryArithmeticOperation(unaryExpression: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckVariableDeclarator(varDecl: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckVariableDeclaratorOrParameterOrEnumElement(varDeclOrParameter: Any, modifiers: Any, name: Any, typeExpr: Any, init: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckWhileStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def typeCheckWithStatement(ast: Any, context: Any): Any = js.native
  
  /* private */ def typeIsAssignableToFunction(source: Any, ast: Any, context: Any): Any = js.native
  
  /* private */ def typeIsBestCommonTypeCandidate(candidateType: Any, collection: Any, context: Any): Any = js.native
  
  /* private */ def typeParameterOfTypeDeclarationPrivacyErrorReporter(classOrInterface: Any, typeParameterAST: Any, typeParameter: Any, symbol: Any, context: Any): Any = js.native
  
  /* private */ def typeParametersAreIdentical(tp1: Any, tp2: Any, context: Any): Any = js.native
  
  /* private */ def typeParametersAreIdenticalWorker(tp1: Any, tp2: Any, context: Any): Any = js.native
  
  /* private */ def typeParametersAreInScopeAtArgumentList(typeParameters: Any, args: Any): Any = js.native
  
  def typesAreIdentical(t1: PullTypeSymbol, t2: PullTypeSymbol, context: PullTypeResolutionContext): Boolean = js.native
  
  /* private */ def typesAreIdenticalInEnclosingTypes(t1: Any, t2: Any, context: Any): Any = js.native
  
  /* private */ def typesAreIdenticalWithNewEnclosingTypes(t1: Any, t2: Any, context: Any): Any = js.native
  
  /* private */ def typesAreIdenticalWorker(t1: Any, t2: Any, context: Any): Any = js.native
  
  /* private */ def validateVariableDeclarationGroups(enclosingDecl: Any, context: Any): Any = js.native
  
  /* private */ def variablePrivacyErrorReporter(declAST: Any, declSymbol: Any, symbol: Any, context: Any): Any = js.native
  
  /* private */ def verifyUniquenessOfImportNamesInModule(decl: Any): Any = js.native
  
  /* private */ def verifyUniquenessOfImportNamesInSourceUnit(sourceUnit: Any): Any = js.native
  
  /* private */ def widenArrayType(`type`: Any, ast: Any, context: Any): Any = js.native
  
  /* private */ def widenObjectLiteralType(`type`: Any, ast: Any, context: Any): Any = js.native
  
  def widenType(`type`: PullTypeSymbol, ast: AST, context: PullTypeResolutionContext): PullTypeSymbol = js.native
}
