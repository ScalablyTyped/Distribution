package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullTypeResolver extends js.Object {
  
  def _addUnhiddenSignaturesFromBaseType(
    derivedTypeSignatures: js.Array[PullSignatureSymbol],
    baseTypeSignatures: js.Array[PullSignatureSymbol],
    signaturesBeingAggregated: js.Array[PullSignatureSymbol]
  ): Unit = js.native
  
  var _cachedAnyTypeArgs: js.Any = js.native
  
  var _cachedArrayInterfaceType: js.Any = js.native
  
  var _cachedBooleanInterfaceType: js.Any = js.native
  
  var _cachedFunctionArgumentsSymbol: js.Any = js.native
  
  var _cachedFunctionInterfaceType: js.Any = js.native
  
  var _cachedIArgumentsInterfaceType: js.Any = js.native
  
  var _cachedNumberInterfaceType: js.Any = js.native
  
  var _cachedObjectInterfaceType: js.Any = js.native
  
  var _cachedRegExpInterfaceType: js.Any = js.native
  
  var _cachedStringInterfaceType: js.Any = js.native
  
  def _getBothKindsOfIndexSignatures(enclosingType: PullTypeSymbol, context: PullTypeResolutionContext, includeAugmentedType: Boolean): IndexSignatureInfo = js.native
  
  def _getNamedPropertySymbolOfAugmentedType(symbolName: String, parent: PullTypeSymbol): PullSymbol = js.native
  
  /* private */ def addFilteredDecls(decls: js.Any, declSearchKind: js.Any, result: js.Any): js.Any = js.native
  
  /* private */ def alterPotentialGenericFunctionTypeToInstantiatedFunctionTypeForTypeArgumentInference(expressionSymbol: js.Any, context: js.Any): js.Any = js.native
  
  var assignableCache: js.Any = js.native
  
  /* private */ def baseListPrivacyErrorReporter(
    classOrInterface: js.Any,
    declSymbol: js.Any,
    baseAst: js.Any,
    isExtendedType: js.Any,
    symbol: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def bestCommonTypeOfThreeTypes(type1: js.Any, type2: js.Any, type3: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def bestCommonTypeOfTwoTypes(type1: js.Any, type2: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def bindObjectLiteralMembers(
    objectLiteralDeclaration: js.Any,
    objectLiteralTypeSymbol: js.Any,
    objectLiteralMembers: js.Any,
    isUsingExistingSymbol: js.Any,
    pullTypeContext: js.Any
  ): js.Any = js.native
  
  /* private */ def cachedArrayInterfaceType(): js.Any = js.native
  
  /* private */ def cachedBooleanInterfaceType(): js.Any = js.native
  
  /* private */ def cachedFunctionArgumentsSymbol(): js.Any = js.native
  
  /* private */ def cachedFunctionInterfaceType(): js.Any = js.native
  
  /* private */ def cachedIArgumentsInterfaceType(): js.Any = js.native
  
  /* private */ def cachedNumberInterfaceType(): js.Any = js.native
  
  /* private */ def cachedObjectInterfaceType(): js.Any = js.native
  
  /* private */ def cachedRegExpInterfaceType(): js.Any = js.native
  
  /* private */ def cachedStringInterfaceType(): js.Any = js.native
  
  /* private */ def canTypeCheckAST(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkArgumentsCollides(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkAssignability(ast: js.Any, source: js.Any, target: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkExternalModuleRequireExportsCollides(ast: js.Any, name: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkForPrivateMemberAccess(name: js.Any, expressionType: js.Any, resolvedName: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkForSuperMemberAccess(expression: js.Any, name: js.Any, resolvedName: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkForThisCaptureInArrowFunction(expression: js.Any): js.Any = js.native
  
  /* private */ def checkFunctionTypePrivacy(
    funcDeclAST: js.Any,
    isStatic: js.Any,
    typeParameters: js.Any,
    parameters: js.Any,
    returnTypeAnnotation: js.Any,
    block: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def checkIfGetterAndSetterTypeMatch(funcDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkIndexOfRestArgumentInitializationCollides(ast: js.Any, isDeclaration: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkIndexSignatureIdentityBetweenBases(
    interfaceName: js.Any,
    interfaceSymbol: js.Any,
    baseTypeSymbol: js.Any,
    allInheritedSignatures: js.Any,
    derivedTypeHasOwnNumberSignature: js.Any,
    derivedTypeHasOwnStringSignature: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def checkInheritedMembersAgainstInheritedIndexSignatures(
    interfaceName: js.Any,
    interfaceSymbol: js.Any,
    inheritedIndexSignatures: js.Any,
    inheritedMembers: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def checkInitializersInEnumDeclarations(decl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkInterfaceDeclForIdenticalTypeParameters(interfaceDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkNameAsPartOfInitializerExpressionForInstanceMemberVariable(nameAST: js.Any, nameSymbol: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkNameForCompilerGeneratedDeclarationCollision(astWithName: js.Any, isDeclaration: js.Any, name: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkNamedPropertyIdentityBetweenBases(
    interfaceName: js.Any,
    interfaceSymbol: js.Any,
    baseTypeSymbol: js.Any,
    inheritedMembersMap: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def checkSuperCaptureVariableCollides(superAST: js.Any, isDeclaration: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkSymbolPrivacy(declSymbol: js.Any, symbol: js.Any, privacyErrorReporter: js.Any): js.Any = js.native
  
  /* private */ def checkThatInheritedNumberSignatureIsSubtypeOfInheritedStringSignature(interfaceName: js.Any, interfaceSymbol: js.Any, inheritedIndexSignatures: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkThatNonVoidFunctionHasReturnExpressionOrThrowStatement(
    functionDecl: js.Any,
    returnTypeAnnotation: js.Any,
    returnTypeSymbol: js.Any,
    block: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def checkThisCaptureVariableCollides(_thisAST: js.Any, isDeclaration: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkTypeCompatibilityBetweenBases(name: js.Any, typeSymbol: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def checkTypeForDuplicateIndexSignatures(enclosingTypeSymbol: js.Any): js.Any = js.native
  
  /* private */ def checkTypePrivacyOfSignatures(declSymbol: js.Any, signatures: js.Any, privacyErrorReporter: js.Any): js.Any = js.native
  
  /* private */ def checkUniquenessOfImportNames(decls: js.Any, doesNameExistOutside: js.Any): js.Any = js.native
  
  var compilationSettings: js.Any = js.native
  
  /* private */ def computeArrayLiteralExpressionSymbol(arrayLit: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def computeDottedNameExpression(expression: js.Any, name: js.Any, context: js.Any, checkSuperPrivateAndStaticAccess: js.Any): js.Any = js.native
  
  /* private */ def computeDottedNameExpressionFromLHS(
    lhs: js.Any,
    expression: js.Any,
    name: js.Any,
    context: js.Any,
    checkSuperPrivateAndStaticAccess: js.Any
  ): js.Any = js.native
  
  /* private */ def computeElementAccessExpressionSymbolAndDiagnostic(callEx: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def computeInvocationExpressionSymbol(callEx: js.Any, context: js.Any, additionalResults: js.Any): js.Any = js.native
  
  /* private */ def computeNameExpression(nameAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def computeObjectCreationExpressionSymbol(callEx: js.Any, context: js.Any, additionalResults: js.Any): js.Any = js.native
  
  /* private */ def computeObjectLiteralExpression(objectLitAST: js.Any, isContextuallyTyped: js.Any, context: js.Any, additionalResults: js.Any): js.Any = js.native
  
  /* private */ def computeQualifiedName(dottedNameAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def computeTypeNameExpression(nameAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def computeTypeOfConditionalExpression(leftType: js.Any, rightType: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def computeTypeReferenceSymbol(term: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def computeValueSymbolFromAST(valueDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def conditionExpressionTypesAreValid(
    leftType: js.Any,
    rightType: js.Any,
    expressionType: js.Any,
    isContextuallyTyped: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def constructorHasSuperCall(constructorDecl: js.Any): js.Any = js.native
  
  /* private */ def containsSingleThrowStatement(block: js.Any): js.Any = js.native
  
  def createInstantiatedType(`type`: PullTypeSymbol, typeArguments: js.Array[PullTypeSymbol]): PullTypeSymbol = js.native
  
  /* private */ def determineRelevantIndexerForMember(member: js.Any, numberIndexSignature: js.Any, stringIndexSignature: js.Any): js.Any = js.native
  
  /* private */ def enclosingClassIsDerived(classDecl: js.Any): js.Any = js.native
  
  /* private */ def ensureAllSymbolsAreBound(containerSymbol: js.Any): js.Any = js.native
  
  /* private */ def filterSymbol(symbol: js.Any, kind: js.Any, enclosingDecl: js.Any, context: js.Any): js.Any = js.native
  
  def findBestCommonType(collection: IPullTypeCollection, context: PullTypeResolutionContext): PullTypeSymbol = js.native
  def findBestCommonType(
    collection: IPullTypeCollection,
    context: PullTypeResolutionContext,
    comparisonInfo: TypeComparisonInfo
  ): PullTypeSymbol = js.native
  
  /* private */ def findConstructorDeclOfEnclosingType(decl: js.Any): js.Any = js.native
  
  /* private */ def functionArgumentTypePrivacyErrorReporter(
    declAST: js.Any,
    isStatic: js.Any,
    parameters: js.Any,
    argIndex: js.Any,
    paramSymbol: js.Any,
    symbol: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def functionReturnTypePrivacyErrorReporter(
    declAST: js.Any,
    isStatic: js.Any,
    returnTypeAnnotation: js.Any,
    block: js.Any,
    funcReturnType: js.Any,
    symbol: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def functionTypeArgumentArgumentTypePrivacyErrorReporter(
    declAST: js.Any,
    isStatic: js.Any,
    typeParameterAST: js.Any,
    typeParameter: js.Any,
    symbol: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def genericTypeIsUsedWithoutRequiredTypeArguments(typeSymbol: js.Any, term: js.Any, context: js.Any): js.Any = js.native
  
  def getASTForDecl(decl: PullDecl): AST = js.native
  
  /* private */ def getApparentType(`type`: js.Any): js.Any = js.native
  
  def getArrayNamedType(): PullTypeSymbol = js.native
  
  /* private */ def getArrayType(elementType: js.Any): js.Any = js.native
  
  /* private */ def getBothKindsOfIndexSignaturesExcludingAugmentedType(enclosingType: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def getBothKindsOfIndexSignaturesIncludingAugmentedType(enclosingType: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def getCallTargetErrorSpanAST(callEx: js.Any): js.Any = js.native
  
  /* private */ def getContextualClassSymbolForEnclosingDecl(ast: js.Any, enclosingDecl: js.Any): js.Any = js.native
  
  /* private */ def getCurrentParameterIndexForFunction(parameter: js.Any, funcDecl: js.Any): js.Any = js.native
  
  /* private */ def getEnclosingClassDeclaration(ast: js.Any): js.Any = js.native
  
  def getEnclosingDecl(decl: PullDecl): PullDecl = js.native
  
  /* private */ def getEnclosingDeclForAST(ast: js.Any): js.Any = js.native
  
  /* private */ def getEnclosingFunctionDeclaration(ast: js.Any): js.Any = js.native
  
  /* private */ def getEnclosingLabels(ast: js.Any, breakable: js.Any, crossFunctions: js.Any): js.Any = js.native
  
  /* private */ def getEnclosingSymbolForAST(ast: js.Any): js.Any = js.native
  
  /* private */ def getEnumTypeSymbol(enumElement: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def getExportedMemberSymbol(symbol: js.Any, parent: js.Any): js.Any = js.native
  
  /* private */ def getFirstStatementOfBlockOrNull(block: js.Any): js.Any = js.native
  
  /* private */ def getInstanceTypeForAssignment(lhs: js.Any, `type`: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def getMemberSymbolOfKind(symbolName: js.Any, kind: js.Any, pullTypeSymbol: js.Any, enclosingDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def getNamedPropertySymbol(symbolName: js.Any, declSearchKind: js.Any, parent: js.Any): js.Any = js.native
  
  def getNewErrorTypeSymbol(): PullErrorTypeSymbol = js.native
  def getNewErrorTypeSymbol(name: String): PullErrorTypeSymbol = js.native
  
  /* private */ def getPropertyAssignmentName(propertyAssignment: js.Any): js.Any = js.native
  
  /* private */ def getSomeInnermostFunctionScopeDecl(declPath: js.Any): js.Any = js.native
  
  /* private */ def getSymbolForAST(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def getSymbolForRelationshipCheck(symbol: js.Any): js.Any = js.native
  
  /* private */ def getSymbolFromDeclPath(symbolName: js.Any, declPath: js.Any, declSearchKind: js.Any): js.Any = js.native
  
  def getVisibleContextSymbols(enclosingDecl: PullDecl, context: PullTypeResolutionContext): js.Array[PullSymbol] = js.native
  
  def getVisibleDecls(enclosingDecl: PullDecl): js.Array[PullDecl] = js.native
  
  /* private */ def getVisibleDeclsFromDeclPath(declPath: js.Any, declSearchKind: js.Any): js.Any = js.native
  
  def getVisibleMembersFromExpression(expression: AST, enclosingDecl: PullDecl, context: PullTypeResolutionContext): js.Array[PullSymbol] = js.native
  
  /* private */ def hasClassTypeSymbolConflictAsValue(baseDeclAST: js.Any, typeSymbol: js.Any, enclosingDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def hasRestParameterCodeGen(someFunctionDecl: js.Any): js.Any = js.native
  
  var identicalCache: js.Any = js.native
  
  /* private */ def inArgumentListOfSuperInvocation(ast: js.Any): js.Any = js.native
  
  /* private */ def inClassExtendsHeritageClause(ast: js.Any): js.Any = js.native
  
  /* private */ def inConstructorParameterList(ast: js.Any): js.Any = js.native
  
  /* private */ def inIterationStatement(ast: js.Any, crossFunctions: js.Any): js.Any = js.native
  
  var inResolvingOtherDeclsWalker: js.Any = js.native
  
  /* private */ def inStaticMemberVariableDeclaration(ast: js.Any): js.Any = js.native
  
  /* private */ def inSwitchStatement(ast: js.Any): js.Any = js.native
  
  /* private */ def inTypeArgumentList(ast: js.Any): js.Any = js.native
  
  /* private */ def inTypeQuery(ast: js.Any): js.Any = js.native
  
  /* private */ def inferArgumentTypesForSignature(argContext: js.Any, comparisonInfo: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def infinitelyExpandingSourceTypeIsRelatableToTargetType(
    sourceType: js.Any,
    targetType: js.Any,
    assignableTo: js.Any,
    comparisonCache: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def infinitelyExpandingTypesAreIdentical(sourceType: js.Any, targetType: js.Any, context: js.Any): js.Any = js.native
  
  def instantiateSignature(signature: PullSignatureSymbol, typeParameterArgumentMap: TypeArgumentMap): PullSignatureSymbol = js.native
  
  /* private */ def instantiateSignatureInContext(
    signatureAToInstantiate: js.Any,
    contextualSignatureB: js.Any,
    context: js.Any,
    shouldFixContextualSignatureParameterTypes: js.Any
  ): js.Any = js.native
  
  def instantiateSignatureToAny(signature: PullSignatureSymbol): PullSignatureSymbol = js.native
  
  def instantiateType(`type`: PullTypeSymbol, typeParameterArgumentMap: TypeArgumentMap): PullTypeSymbol = js.native
  
  def instantiateTypeParameter(typeParameter: PullTypeParameterSymbol, typeParameterArgumentMap: TypeArgumentMap): PullTypeParameterSymbol = js.native
  
  def instantiateTypeToAny(typeToSpecialize: PullTypeSymbol, context: PullTypeResolutionContext): PullTypeSymbol = js.native
  
  /* private */ def isAnyFunctionExpressionOrDeclaration(ast: js.Any): js.Any = js.native
  
  /* private */ def isAnyOrEquivalent(`type`: js.Any): js.Any = js.native
  
  /* private */ def isAnyOrNumberOrEnum(`type`: js.Any): js.Any = js.native
  
  /* private */ def isForInVariableDeclarator(ast: js.Any): js.Any = js.native
  
  /* private */ def isFromFunctionScope(nameSymbol: js.Any, functionScopeDecl: js.Any): js.Any = js.native
  
  /* private */ def isFunctionAccessorOrNonArrowFunctionExpression(decl: js.Any): js.Any = js.native
  
  /* private */ def isFunctionOrNonArrowFunctionExpression(decl: js.Any): js.Any = js.native
  
  /* private */ def isFunctionTypeWithExactlyOneCallSignatureAndNoOtherMembers(`type`: js.Any, callSignatureShouldBeGeneric: js.Any): js.Any = js.native
  
  /* private */ def isInEnumDecl(decl: js.Any): js.Any = js.native
  
  /* private */ def isInStaticMemberContext(decl: js.Any): js.Any = js.native
  
  /* private */ def isIterationStatement(ast: js.Any): js.Any = js.native
  
  /* private */ def isLastNameOfModuleNameModuleReference(ast: js.Any): js.Any = js.native
  
  /* private */ def isLeftSideOfQualifiedName(ast: js.Any): js.Any = js.native
  
  /* private */ def isReference(ast: js.Any, astSymbol: js.Any): js.Any = js.native
  
  /* private */ def isSourceTypeParameterConstrainedToTargetTypeParameter(source: js.Any, target: js.Any): js.Any = js.native
  
  /* private */ def isSuperInvocationExpression(ast: js.Any): js.Any = js.native
  
  /* private */ def isSuperInvocationExpressionStatement(node: js.Any): js.Any = js.native
  
  /* private */ def isTypeRefWithoutTypeArgs(term: js.Any): js.Any = js.native
  
  /* private */ def labelIsOnContinuableConstruct(statement: js.Any): js.Any = js.native
  
  /* private */ def needsToWidenObjectLiteralType(`type`: js.Any, ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def overloadHasCorrectArity(signature: js.Any, args: js.Any): js.Any = js.native
  
  /* private */ def overloadIsApplicable(signature: js.Any, args: js.Any, context: js.Any, comparisonInfo: js.Any): js.Any = js.native
  
  /* private */ def overloadIsApplicableForAnyFunctionExpressionArgument(
    paramType: js.Any,
    arg: js.Any,
    typeParameters: js.Any,
    parameters: js.Any,
    returnTypeAnnotation: js.Any,
    block: js.Any,
    bodyExpression: js.Any,
    argIndex: js.Any,
    context: js.Any,
    comparisonInfo: js.Any
  ): js.Any = js.native
  
  /* private */ def overloadIsApplicableForArgument(paramType: js.Any, arg: js.Any, argIndex: js.Any, context: js.Any, comparisonInfo: js.Any): js.Any = js.native
  
  /* private */ def overloadIsApplicableForArgumentHelper(
    paramType: js.Any,
    argSym: js.Any,
    argumentIndex: js.Any,
    comparisonInfo: js.Any,
    arg: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def overloadIsApplicableForArrayLiteralArgument(paramType: js.Any, arg: js.Any, argIndex: js.Any, context: js.Any, comparisonInfo: js.Any): js.Any = js.native
  
  /* private */ def overloadIsApplicableForObjectLiteralArgument(paramType: js.Any, arg: js.Any, argIndex: js.Any, context: js.Any, comparisonInfo: js.Any): js.Any = js.native
  
  /* private */ def overloadIsApplicableForOtherArgument(paramType: js.Any, arg: js.Any, argIndex: js.Any, context: js.Any, comparisonInfo: js.Any): js.Any = js.native
  
  /* private */ def postOverloadResolutionDiagnostics(diagnostic: js.Any, additionalResults: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def postTypeCheck(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def postTypeCheckClassDeclaration(classDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def postTypeCheckEnumDeclaration(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def postTypeCheckFunctionDeclaration(funcDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def postTypeCheckImportDeclaration(importStatementAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def postTypeCheckModuleDeclaration(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def postTypeCheckNameExpression(nameAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def postTypeCheckVariableDeclaratorOrParameter(varDeclOrParameter: js.Any, context: js.Any): js.Any = js.native
  
  var postTypeCheckWorkitems: js.Any = js.native
  
  /* private */ def processPostTypeCheckWorkItems(context: js.Any): js.Any = js.native
  
  /* private */ def propertiesAreIdentical(propertySymbol1: js.Any, propertySymbol2: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def propertiesAreIdenticalWithNewEnclosingTypes(type1: js.Any, type2: js.Any, property1: js.Any, property2: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def relateFunctionSignatureToTypeParameters(expressionSignature: js.Any, parameterSignature: js.Any, argContext: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def relateInifinitelyExpandingTypeToTypeParameters(expressionType: js.Any, parameterType: js.Any, argContext: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def relateObjectTypeToTypeParameters(objectType: js.Any, parameterType: js.Any, argContext: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def relateSignatureGroupToTypeParameters(
    argumentSignatures: js.Any,
    parameterSignatures: js.Any,
    signatureKind: js.Any,
    argContext: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def relateTypeArgumentsOfTypeToTypeParameters(expressionType: js.Any, parameterType: js.Any, argContext: js.Any, context: js.Any): js.Any = js.native
  
  def relateTypeToTypeParameters(
    expressionType: PullTypeSymbol,
    parameterType: PullTypeSymbol,
    argContext: TypeArgumentInferenceContext,
    context: PullTypeResolutionContext
  ): Unit = js.native
  
  /* private */ def relateTypeToTypeParametersInEnclosingType(expressionType: js.Any, parameterType: js.Any, argContext: js.Any, context: js.Any): js.Any = js.native
  
  def relateTypeToTypeParametersWithNewEnclosingTypes(
    expressionType: PullTypeSymbol,
    parameterType: PullTypeSymbol,
    argContext: TypeArgumentInferenceContext,
    context: PullTypeResolutionContext
  ): Unit = js.native
  
  /* private */ def reportErrorThatMemberIsNotSubtypeOfIndexer(
    member: js.Any,
    indexSignature: js.Any,
    astForError: js.Any,
    context: js.Any,
    comparisonInfo: js.Any
  ): js.Any = js.native
  
  def resolveAST(ast: AST, isContextuallyTyped: Boolean, context: PullTypeResolutionContext): PullSymbol = js.native
  
  /* private */ def resolveAccessorDeclaration(funcDeclAst: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveAndTypeCheckVariableDeclarationTypeExpr(varDeclOrParameter: js.Any, name: js.Any, typeExpr: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveAndTypeCheckVariableDeclaratorOrParameterInitExpr(
    varDeclOrParameter: js.Any,
    name: js.Any,
    typeExpr: js.Any,
    init: js.Any,
    context: js.Any,
    typeExprSymbol: js.Any
  ): js.Any = js.native
  
  /* private */ def resolveAnyFunctionDeclaration(funcDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveAnyFunctionExpression(
    funcDeclAST: js.Any,
    typeParameters: js.Any,
    parameters: js.Any,
    returnTypeAnnotation: js.Any,
    block: js.Any,
    bodyExpression: js.Any,
    isContextuallyTyped: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def resolveAnyFunctionExpressionParameters(
    funcDeclAST: js.Any,
    typeParameters: js.Any,
    parameters: js.Any,
    returnTypeAnnotation: js.Any,
    isContextuallyTyped: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def resolveAnyFunctionTypeSignature(
    funcDeclAST: js.Any,
    typeParameters: js.Any,
    parameterList: js.Any,
    returnTypeAnnotation: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def resolveArrayLiteralExpression(arrayLit: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveAssignmentExpression(binaryExpression: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveBinaryAdditionOperation(binaryExpression: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveBinaryArithmeticExpression(binaryExpression: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveBlock(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveBreakStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveCallSignature(funcDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveCastExpression(assertionExpression: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveCatchClause(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveClassDeclaration(classDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveCommaExpression(commaExpression: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveConditionalExpression(trinex: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveConstraint(constraint: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveConstructSignature(funcDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveConstructorDeclaration(funcDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveContinueStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  def resolveDeclaredSymbol[TSymbol /* <: PullSymbol */](symbol: TSymbol): TSymbol = js.native
  def resolveDeclaredSymbol[TSymbol /* <: PullSymbol */](symbol: TSymbol, context: PullTypeResolutionContext): TSymbol = js.native
  
  /* private */ def resolveDeclaredSymbolWorker[TSymbol /* <: PullSymbol */](symbol: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveDeleteExpression(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveDoStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveDottedNameExpression(dottedNameAST: js.Any, expression: js.Any, name: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveElementAccessExpression(callEx: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveElseClause(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveEnumDeclaration(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveEnumElement(enumElement: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveEqualsValueClause(clause: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveExportAssignmentStatement(exportAssignmentAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveExpressionAST(ast: js.Any, isContextuallyOrInferentiallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveExpressionStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveExpressionWorker(ast: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveExternalModuleReference(idText: js.Any, currentFileName: js.Any): js.Any = js.native
  
  /* private */ def resolveFinallyClause(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveFirstExportAssignmentStatement(moduleElements: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveFirstTypeParameterDeclaration(typeParameterSymbol: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveForInStatement(forInStatement: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveForStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveFunctionBodyReturnTypes(
    funcDeclAST: js.Any,
    block: js.Any,
    bodyExpression: js.Any,
    signature: js.Any,
    useContextualType: js.Any,
    enclosingDecl: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def resolveFunctionDeclaration(
    funcDeclAST: js.Any,
    isStatic: js.Any,
    name: js.Any,
    typeParameters: js.Any,
    parameterList: js.Any,
    returnTypeAnnotation: js.Any,
    block: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def resolveFunctionExpression(funcDecl: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveFunctionExpressionParameter(
    argDeclAST: js.Any,
    id: js.Any,
    typeExpr: js.Any,
    equalsValueClause: js.Any,
    contextParam: js.Any,
    enclosingDecl: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def resolveFunctionPropertyAssignment(funcProp: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveFunctionTypeSignatureParameter(argDeclAST: js.Any, signature: js.Any, enclosingDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveGenericTypeReference(genericTypeAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveGetAccessorDeclaration(
    funcDeclAST: js.Any,
    parameters: js.Any,
    returnTypeAnnotation: js.Any,
    block: js.Any,
    setterAnnotatedType: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def resolveGetterReturnTypeAnnotation(getterFunctionDeclarationAst: js.Any, enclosingDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveIdentifierOfInternalModuleReference(
    importDecl: js.Any,
    identifier: js.Any,
    moduleSymbol: js.Any,
    enclosingDecl: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def resolveIfStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveImportDeclaration(importStatementAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveInExpression(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveIndexMemberDeclaration(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveIndexSignature(funcDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveInstanceOfExpression(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveInterfaceDeclaration(interfaceDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveInternalModuleReference(importStatementAST: js.Any, context: js.Any): js.Any = js.native
  
  def resolveInvocationExpression(callEx: InvocationExpression, context: PullTypeResolutionContext): PullSymbol = js.native
  def resolveInvocationExpression(
    callEx: InvocationExpression,
    context: PullTypeResolutionContext,
    additionalResults: PullAdditionalCallResolutionData
  ): PullSymbol = js.native
  
  /* private */ def resolveLabeledStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveList(list: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveLogicalAndExpression(binex: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveLogicalNotExpression(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveLogicalOperation(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveLogicalOrExpression(binex: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveMemberAccessExpression(dottedNameAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveMemberFunctionDeclaration(funcDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveMemberVariableDeclaration(varDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveMethodSignature(funcDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveModuleDeclaration(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveModuleReference(
    importDecl: js.Any,
    moduleNameExpr: js.Any,
    enclosingDecl: js.Any,
    context: js.Any,
    declPath: js.Any
  ): js.Any = js.native
  
  /* private */ def resolveModuleSymbol(
    containerSymbol: js.Any,
    context: js.Any,
    moduleDeclAST: js.Any,
    moduleDeclNameAST: js.Any,
    sourceUnitAST: js.Any
  ): js.Any = js.native
  
  /* private */ def resolveNameExpression(nameAST: js.Any, context: js.Any): js.Any = js.native
  
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
    objectLiteralDeclaration: js.Any,
    objectLiteralTypeSymbol: js.Any,
    objectLiteralContextualType: js.Any,
    objectLiteralMembers: js.Any,
    stringIndexerSignature: js.Any,
    numericIndexerSignature: js.Any,
    allMemberTypes: js.Any,
    allNumericMemberTypes: js.Any,
    boundMemberSymbols: js.Any,
    isUsingExistingSymbol: js.Any,
    pullTypeContext: js.Any,
    additionalResults: js.Any
  ): js.Any = js.native
  
  /* private */ def resolveObjectTypeTypeReference(objectType: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveOtherDecl(otherDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveOtherDeclarations(astName: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveOverloads(
    application: js.Any,
    group: js.Any,
    haveTypeArgumentsAtCallSite: js.Any,
    context: js.Any,
    diagnostics: js.Any
  ): js.Any = js.native
  
  /* private */ def resolveParameter(parameter: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveParameterList(list: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveParenthesizedArrowFunctionExpression(funcDecl: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveParenthesizedExpression(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolvePostfixUnaryExpression(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolvePropertySignature(varDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveQualifiedName(dottedNameAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveReferenceTypeDeclaration(classOrInterface: js.Any, name: js.Any, heritageClauses: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveRegularExpressionLiteral(): js.Any = js.native
  
  /* private */ def resolveReturnExpression(expression: js.Any, enclosingFunction: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveReturnStatement(returnAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveReturnTypeAnnotationOfFunctionDeclaration(funcDeclAST: js.Any, returnTypeAnnotation: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveSeparatedList(list: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveSetAccessorDeclaration(funcDeclAST: js.Any, parameterList: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveSetterArgumentTypeAnnotation(setterFunctionDeclarationAst: js.Any, enclosingDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveSimpleArrowFunctionExpression(funcDecl: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveSimplePropertyAssignment(propertyAssignment: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveSingleModuleDeclaration(ast: js.Any, astName: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveSourceUnit(sourceUnit: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveSuperExpression(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveSwitchStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveThisExpression(thisExpression: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveThrowStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveTryStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveTypeAnnotation(typeAnnotation: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveTypeNameExpression(nameAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveTypeOfExpression(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveTypeParameterDeclaration(typeParameterAST: js.Any, context: js.Any): js.Any = js.native
  
  def resolveTypeReference(typeRef: AST, context: PullTypeResolutionContext): PullTypeSymbol = js.native
  
  /* private */ def resolveTypeSymbolSignatures(typeSymbol: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveUnaryArithmeticOperation(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveVariableDeclarationList(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveVariableDeclarator(varDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveVariableDeclaratorOrParameterOrEnumElement(
    varDeclOrParameter: js.Any,
    modifiers: js.Any,
    name: js.Any,
    typeExpr: js.Any,
    init: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def resolveVariableStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveVoidExpression(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveWhileStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def resolveWithStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def scanVariableDeclarationGroups(enclosingDecl: js.Any, firstDeclHandler: js.Any, subsequentDeclHandler: js.Any): js.Any = js.native
  
  var semanticInfoChain: SemanticInfoChain = js.native
  
  /* private */ def setSymbolForAST(ast: js.Any, symbol: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def setTypeChecked(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def setTypeParameterIdentity(tp1: js.Any, tp2: js.Any, `val`: js.Any): js.Any = js.native
  
  /* private */ def shouldContextuallyTypeAnyFunctionExpression(
    functionExpressionAST: js.Any,
    typeParameters: js.Any,
    parameters: js.Any,
    returnTypeAnnotation: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def signatureGroupIsRelatableToTarget(
    source: js.Any,
    target: js.Any,
    sourceSG: js.Any,
    targetSG: js.Any,
    assignableTo: js.Any,
    comparisonCache: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def signatureGroupsAreIdentical(sg1: js.Any, sg2: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def signatureIsAssignableToTarget(
    s1: js.Any,
    s2: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def signatureIsRelatableToTarget(
    sourceSig: js.Any,
    targetSig: js.Any,
    assignableTo: js.Any,
    comparisonCache: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def signatureIsRelatableToTargetWorker(
    sourceSig: js.Any,
    targetSig: js.Any,
    assignableTo: js.Any,
    comparisonCache: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  def signatureReturnTypesAreIdentical(s1: PullSignatureSymbol, s2: PullSignatureSymbol, context: PullTypeResolutionContext): Boolean = js.native
  
  /* private */ def signatureTypeParametersParametersAndReturnTypesAreIdentical(s1: js.Any, s2: js.Any, context: js.Any, includingReturnType: js.Any): js.Any = js.native
  
  /* private */ def signaturesAreIdentical(s1: js.Any, s2: js.Any, context: js.Any, includingReturnType: js.Any): js.Any = js.native
  
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
    source: js.Any,
    target: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourceCallSignaturesAreRelatableToTargetCallSignatures(
    source: js.Any,
    target: js.Any,
    assignableTo: js.Any,
    comparisonCache: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourceConstructSignaturesAreAssignableToTargetConstructSignatures(
    source: js.Any,
    target: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourceConstructSignaturesAreRelatableToTargetConstructSignatures(
    source: js.Any,
    target: js.Any,
    assignableTo: js.Any,
    comparisonCache: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourceIndexSignaturesAreAssignableToTargetIndexSignatures(
    source: js.Any,
    target: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourceIndexSignaturesAreRelatableToTargetIndexSignatures(
    source: js.Any,
    target: js.Any,
    assignableTo: js.Any,
    comparisonCache: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourceIsAssignableToTarget(
    source: js.Any,
    target: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourceIsAssignableToTargetWithNewEnclosingTypes(
    source: js.Any,
    target: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourceIsRelatableToTarget(
    source: js.Any,
    target: js.Any,
    assignableTo: js.Any,
    comparisonCache: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourceIsRelatableToTargetInCache(source: js.Any, target: js.Any, comparisonCache: js.Any, comparisonInfo: js.Any): js.Any = js.native
  
  /* private */ def sourceIsRelatableToTargetInEnclosingTypes(
    source: js.Any,
    target: js.Any,
    assignableTo: js.Any,
    comparisonCache: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourceIsRelatableToTargetWithNewEnclosingTypes(
    source: js.Any,
    target: js.Any,
    assignableTo: js.Any,
    comparisonCache: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourceIsRelatableToTargetWorker(
    source: js.Any,
    target: js.Any,
    assignableTo: js.Any,
    comparisonCache: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourceIsSubtypeOfTarget(
    source: js.Any,
    target: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourceMembersAreAssignableToTargetMembers(
    source: js.Any,
    target: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourceMembersAreRelatableToTargetMembers(
    source: js.Any,
    target: js.Any,
    assignableTo: js.Any,
    comparisonCache: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourcePropertyIsAssignableToTargetProperty(
    source: js.Any,
    target: js.Any,
    sourceProp: js.Any,
    targetProp: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def sourcePropertyIsRelatableToTargetProperty(
    source: js.Any,
    target: js.Any,
    sourceProp: js.Any,
    targetProp: js.Any,
    assignableTo: js.Any,
    comparisonCache: js.Any,
    ast: js.Any,
    context: js.Any,
    comparisonInfo: js.Any,
    isComparingInstantiatedSignatures: js.Any
  ): js.Any = js.native
  
  /* private */ def stampObjectLiteralWithIndexSignature(
    objectLiteralSymbol: js.Any,
    indexerTypeCandidates: js.Any,
    contextualIndexSignature: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  var subtypeCache: js.Any = js.native
  
  /* private */ def superCallMustBeFirstStatementInConstructor(constructorDecl: js.Any): js.Any = js.native
  
  /* private */ def symbolsShareDeclaration(symbol1: js.Any, symbol2: js.Any): js.Any = js.native
  
  /* private */ def typeCheckAST(ast: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckAccessorDeclaration(funcDeclAst: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckAnyFunctionDeclaration(
    funcDeclAST: js.Any,
    isStatic: js.Any,
    name: js.Any,
    typeParameters: js.Any,
    parameters: js.Any,
    returnTypeAnnotation: js.Any,
    block: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def typeCheckAnyFunctionExpression(
    funcDeclAST: js.Any,
    typeParameters: js.Any,
    parameters: js.Any,
    returnTypeAnnotation: js.Any,
    block: js.Any,
    bodyExpression: js.Any,
    isContextuallyTyped: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def typeCheckBase(
    classOrInterface: js.Any,
    name: js.Any,
    typeSymbol: js.Any,
    baseDeclAST: js.Any,
    isExtendedType: js.Any,
    enclosingDecl: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def typeCheckBases(
    classOrInterface: js.Any,
    name: js.Any,
    heritageClauses: js.Any,
    typeSymbol: js.Any,
    enclosingDecl: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def typeCheckBinaryArithmeticExpression(binaryExpression: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckBreakStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  var typeCheckCallBacks: js.Any = js.native
  
  /* private */ def typeCheckCallSignature(funcDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckCastExpression(assertionExpression: js.Any, context: js.Any, typeAssertionType: js.Any): js.Any = js.native
  
  /* private */ def typeCheckCatchClause(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckClassDeclaration(classDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckConstructSignature(funcDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckConstructorDeclaration(funcDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckContinueStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckDoStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckElementAccessExpression(callEx: js.Any, context: js.Any, symbolAndDiagnostic: js.Any): js.Any = js.native
  
  /* private */ def typeCheckElseClause(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckEnumDeclaration(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckEnumElement(enumElement: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckFinallyClause(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckForInStatement(forInStatement: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckFunctionExpression(funcDecl: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckFunctionOverloads(funcDecl: js.Any, context: js.Any, signature: js.Any, allSignatures: js.Any): js.Any = js.native
  
  /* private */ def typeCheckFunctionPropertyAssignment(funcProp: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckGetAccessorDeclaration(funcDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckIfClassImplementsType(
    classDecl: js.Any,
    classSymbol: js.Any,
    implementedType: js.Any,
    enclosingDecl: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def typeCheckIfStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckIfTypeExtendsType(
    classOrInterface: js.Any,
    name: js.Any,
    typeSymbol: js.Any,
    extendedType: js.Any,
    enclosingDecl: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def typeCheckIfTypeMemberPropertyOkToOverride(
    typeSymbol: js.Any,
    extendedType: js.Any,
    typeMember: js.Any,
    extendedTypeMember: js.Any,
    enclosingDecl: js.Any,
    comparisonInfo: js.Any
  ): js.Any = js.native
  
  /* private */ def typeCheckImportDeclaration(importStatementAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckInExpression(binaryExpression: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckIndexSignature(funcDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckInstanceOfExpression(binaryExpression: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckInterfaceDeclaration(interfaceDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckInvocationExpression(callEx: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckLabeledStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckLogicalOperation(binex: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckMemberFunctionDeclaration(funcDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckMemberVariableDeclaration(varDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckMembersAgainstIndexer(containerType: js.Any, containerTypeDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckMethodSignature(funcDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckModuleDeclaration(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckNameExpression(nameAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckObjectCreationExpression(callEx: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckObjectTypeTypeReference(objectType: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckParameter(parameter: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckParenthesizedArrowFunctionExpression(arrowFunction: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckPostfixUnaryExpression(unaryExpression: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckPropertySignature(varDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckReturnExpression(expression: js.Any, expressionType: js.Any, enclosingFunction: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckSetAccessorDeclaration(funcDeclAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckSimpleArrowFunctionExpression(arrowFunction: js.Any, isContextuallyTyped: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckSingleModuleDeclaration(ast: js.Any, astName: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckSourceUnit(sourceUnit: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckSuperExpression(ast: js.Any, context: js.Any, enclosingDecl: js.Any): js.Any = js.native
  
  /* private */ def typeCheckSwitchStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckThisExpression(thisExpression: js.Any, context: js.Any, enclosingDecl: js.Any): js.Any = js.native
  
  /* private */ def typeCheckTryStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckTypeParameterDeclaration(typeParameterAST: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckTypeParametersOfTypeDeclaration(classOrInterface: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckUnaryArithmeticOperation(unaryExpression: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckVariableDeclarator(varDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckVariableDeclaratorOrParameterOrEnumElement(
    varDeclOrParameter: js.Any,
    modifiers: js.Any,
    name: js.Any,
    typeExpr: js.Any,
    init: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def typeCheckWhileStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeCheckWithStatement(ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeIsAssignableToFunction(source: js.Any, ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeIsBestCommonTypeCandidate(candidateType: js.Any, collection: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeParameterOfTypeDeclarationPrivacyErrorReporter(
    classOrInterface: js.Any,
    typeParameterAST: js.Any,
    typeParameter: js.Any,
    symbol: js.Any,
    context: js.Any
  ): js.Any = js.native
  
  /* private */ def typeParametersAreIdentical(tp1: js.Any, tp2: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeParametersAreIdenticalWorker(tp1: js.Any, tp2: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typeParametersAreInScopeAtArgumentList(typeParameters: js.Any, args: js.Any): js.Any = js.native
  
  def typesAreIdentical(t1: PullTypeSymbol, t2: PullTypeSymbol, context: PullTypeResolutionContext): Boolean = js.native
  
  /* private */ def typesAreIdenticalInEnclosingTypes(t1: js.Any, t2: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typesAreIdenticalWithNewEnclosingTypes(t1: js.Any, t2: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def typesAreIdenticalWorker(t1: js.Any, t2: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def validateVariableDeclarationGroups(enclosingDecl: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def variablePrivacyErrorReporter(declAST: js.Any, declSymbol: js.Any, symbol: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def verifyUniquenessOfImportNamesInModule(decl: js.Any): js.Any = js.native
  
  /* private */ def verifyUniquenessOfImportNamesInSourceUnit(sourceUnit: js.Any): js.Any = js.native
  
  /* private */ def widenArrayType(`type`: js.Any, ast: js.Any, context: js.Any): js.Any = js.native
  
  /* private */ def widenObjectLiteralType(`type`: js.Any, ast: js.Any, context: js.Any): js.Any = js.native
  
  def widenType(`type`: PullTypeSymbol, ast: AST, context: PullTypeResolutionContext): PullTypeSymbol = js.native
}
