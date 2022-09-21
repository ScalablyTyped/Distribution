package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullTypeSymbol
  extends StObject
     with PullSymbol
     with InstantiableSymbol {
  
  /* private */ var _allCallSignatures: Any = js.native
  
  /* private */ var _allConstructSignatures: Any = js.native
  
  /* private */ var _allIndexSignatures: Any = js.native
  
  /* private */ var _allIndexSignaturesOfAugmentedType: Any = js.native
  
  /* private */ var _allowedToReferenceTypeParameters: Any = js.native
  
  /* private */ var _arrayVersionOfThisType: Any = js.native
  
  /* private */ var _associatedContainerTypeSymbol: Any = js.native
  
  /* private */ var _callSignatures: Any = js.native
  
  /* private */ var _complexInstantiationCache: Any = js.native
  
  /* private */ var _constructSignatures: Any = js.native
  
  /* private */ var _constructorMethod: Any = js.native
  
  /* private */ var _containedNonMemberContainerCache: Any = js.native
  
  /* private */ var _containedNonMemberNameCache: Any = js.native
  
  /* private */ var _containedNonMemberTypeNameCache: Any = js.native
  
  /* private */ var _enclosedContainerCache: Any = js.native
  
  /* private */ var _enclosedMemberContainers: Any = js.native
  
  /* private */ var _enclosedMemberTypes: Any = js.native
  
  /* private */ var _enclosedTypeNameCache: Any = js.native
  
  /* private */ var _extendedTypes: Any = js.native
  
  /* private */ var _functionSymbol: Any = js.native
  
  /* private */ var _hasBaseTypeConflict: Any = js.native
  
  /* private */ var _hasDefaultConstructor: Any = js.native
  
  /* private */ var _hasGenericMember: Any = js.native
  
  /* private */ var _hasGenericSignature: Any = js.native
  
  /* private */ var _implementedTypes: Any = js.native
  
  /* private */ var _inMemberTypeNameEx: Any = js.native
  
  /* private */ var _indexSignatures: Any = js.native
  
  /* private */ var _isArrayNamedTypeReference: Any = js.native
  
  /* private */ var _knownBaseTypeCount: Any = js.native
  
  /* private */ var _memberNameCache: Any = js.native
  
  /* private */ var _members: Any = js.native
  
  /* private */ var _simpleInstantiationCache: Any = js.native
  
  /* private */ var _specializedVersionsOfThisType: Any = js.native
  
  /* private */ var _typeParameterNameCache: Any = js.native
  
  /* private */ var _typeParameters: Any = js.native
  
  /* private */ var _typesThatExplicitlyImplementThisType: Any = js.native
  
  /* private */ var _typesThatExtendThisType: Any = js.native
  
  /* private */ var _widenedType: Any = js.native
  
  def _wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReferenceRecurse(enclosingType: PullTypeSymbol, knownWrapMap: IBitMatrix): Boolean = js.native
  
  /* private */ def _wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReferenceStructure(enclosingType: Any, knownWrapMap: Any): Any = js.native
  
  /* private */ def _wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReferenceWorker(enclosingType: Any, knownWrapMap: Any): Any = js.native
  
  /* private */ var _wrapsTypeParameterCache: Any = js.native
  
  /* private */ def addCallOrConstructSignaturePrerequisiteBase(signature: Any): Any = js.native
  
  /* private */ def addCallSignaturePrerequisite(callSignature: Any): Any = js.native
  
  /* private */ def addConstructSignaturePrerequisite(constructSignature: Any): Any = js.native
  
  def addEnclosedMemberContainer(enclosedContainer: PullTypeSymbol): Unit = js.native
  
  def addEnclosedMemberType(enclosedType: PullTypeSymbol): Unit = js.native
  
  def addEnclosedNonMember(enclosedNonMember: PullSymbol): Unit = js.native
  
  def addEnclosedNonMemberContainer(enclosedNonMemberContainer: PullTypeSymbol): Unit = js.native
  
  def addEnclosedNonMemberType(enclosedNonMemberType: PullTypeSymbol): Unit = js.native
  
  def addExtendedType(extendedType: PullTypeSymbol): Unit = js.native
  
  def addImplementedType(implementedType: PullTypeSymbol): Unit = js.native
  
  def addIndexSignature(indexSignature: PullSignatureSymbol): Unit = js.native
  
  def addMember(memberSymbol: PullSymbol): Unit = js.native
  
  def addSpecialization(specializedVersionOfThisType: PullTypeSymbol, typeArgumentMap: TypeArgumentMap): Unit = js.native
  
  def addTypeParameter(typeParameter: PullTypeParameterSymbol): Unit = js.native
  
  def addTypeThatExplicitlyImplementsThisType(`type`: PullTypeSymbol): Unit = js.native
  
  def addTypeThatExtendsThisType(`type`: PullTypeSymbol): Unit = js.native
  
  def appendCallSignature(callSignature: PullSignatureSymbol): Unit = js.native
  
  def appendConstructSignature(constructSignature: PullSignatureSymbol): Unit = js.native
  
  /* private */ def canUseSimpleInstantiationCache(typeArgumentMap: Any): Any = js.native
  
  /* private */ def computeIsArrayNamedTypeReference(): Any = js.native
  
  def findContainedNonMember(name: String): PullSymbol = js.native
  
  def findContainedNonMemberContainer(containerName: String): PullTypeSymbol = js.native
  def findContainedNonMemberContainer(containerName: String, kind: PullElementKind): PullTypeSymbol = js.native
  
  def findContainedNonMemberType(typeName: String): PullTypeSymbol = js.native
  def findContainedNonMemberType(typeName: String, kind: PullElementKind): PullTypeSymbol = js.native
  
  def findMember(name: String, lookInParent: Boolean): PullSymbol = js.native
  
  def findNestedContainer(name: String): PullTypeSymbol = js.native
  def findNestedContainer(name: String, kind: PullElementKind): PullTypeSymbol = js.native
  
  def findNestedType(name: String): PullTypeSymbol = js.native
  def findNestedType(name: String, kind: PullElementKind): PullTypeSymbol = js.native
  
  def findTypeParameter(name: String): PullTypeParameterSymbol = js.native
  
  def getAllMembers(searchDeclKind: PullElementKind, memberVisiblity: GetAllMembersVisiblity): js.Array[PullSymbol] = js.native
  
  def getArrayType(): PullTypeSymbol = js.native
  
  def getAssociatedContainerType(): PullTypeSymbol = js.native
  
  /* private */ def getBaseClassConstructSignatures(baseType: Any): Any = js.native
  
  def getCallSignatures(): js.Array[PullSignatureSymbol] = js.native
  
  def getConstructSignatures(): js.Array[PullSignatureSymbol] = js.native
  
  def getConstructorMethod(): PullSymbol = js.native
  
  /* private */ def getDefaultClassConstructSignature(): Any = js.native
  
  def getElementType(): PullTypeSymbol = js.native
  
  def getExtendedTypes(): js.Array[PullTypeSymbol] = js.native
  
  def getFunctionSymbol(): PullSymbol = js.native
  
  def getGenerativeTypeClassification(enclosingType: PullTypeSymbol): GenerativeTypeClassification = js.native
  
  def getHasDefaultConstructor(): Boolean = js.native
  
  def getHasGenericMember(): Boolean = js.native
  
  def getHasGenericSignature(): Boolean = js.native
  
  def getImplementedTypes(): js.Array[PullTypeSymbol] = js.native
  
  def getIndexSignatures(): js.Array[PullSignatureSymbol] = js.native
  
  def getIndexSignaturesOfAugmentedType(
    resolver: PullTypeResolver,
    globalFunctionInterface: PullTypeSymbol,
    globalObjectInterface: PullTypeSymbol
  ): js.Array[PullSignatureSymbol] = js.native
  
  /* InferMemberOverrides */
  override def getIsSpecialized(): Boolean = js.native
  
  def getKnownBaseTypeCount(): Double = js.native
  
  def getKnownSpecializations(): js.Array[PullTypeSymbol] = js.native
  
  /* private */ def getMemberTypeNameEx(topLevel: Any, scopeSymbol: Any, getPrettyTypeName: Any): Any = js.native
  
  def getMembers(): js.Array[PullSymbol] = js.native
  
  def getOwnCallSignatures(): js.Array[PullSignatureSymbol] = js.native
  
  def getOwnDeclaredConstructSignatures(): js.Array[PullSignatureSymbol] = js.native
  
  def getOwnIndexSignatures(): js.Array[PullSignatureSymbol] = js.native
  
  def getScopedNameEx(
    scopeSymbol: js.UndefOr[PullSymbol],
    skipTypeParametersInName: js.UndefOr[Boolean],
    useConstraintInName: js.UndefOr[Boolean],
    getPrettyTypeName: js.UndefOr[Boolean],
    getTypeParamMarkerInfo: js.UndefOr[Boolean],
    skipInternalAliasName: js.UndefOr[Boolean],
    shouldAllowArrayType: js.UndefOr[Boolean]
  ): MemberName = js.native
  
  /* private */ def getSimpleInstantiationCacheId(typeArgumentMap: Any): Any = js.native
  
  def getSpecialization(typeArgumentMap: TypeArgumentMap): PullTypeSymbol = js.native
  
  def getTypeArguments(): js.Array[PullTypeSymbol] = js.native
  
  def getTypeArgumentsOrTypeParameters(): js.Array[PullTypeSymbol] = js.native
  
  def getTypeOfSymbol(): PullSymbol = js.native
  
  def getTypeParameters(): js.Array[PullTypeParameterSymbol] = js.native
  
  def getTypesThatExplicitlyImplementThisType(): js.Array[PullTypeSymbol] = js.native
  
  def getTypesThatExtendThisType(): js.Array[PullTypeSymbol] = js.native
  
  def getWrappingTypeParameterID(typeParameterArgumentMap: TypeArgumentMap): Double = js.native
  def getWrappingTypeParameterID(typeParameterArgumentMap: TypeArgumentMap, skipTypeArgumentCheck: Boolean): Double = js.native
  
  /* private */ def getWrappingTypeParameterIDFromSignatures(signatures: Any, typeParameterArgumentMap: Any): Any = js.native
  
  /* private */ def getWrappingTypeParameterIDWorker(typeParameterArgumentMap: Any, skipTypeArgumentCheck: Any): Any = js.native
  
  def hasBase(potentialBase: PullTypeSymbol): Boolean = js.native
  def hasBase(potentialBase: PullTypeSymbol, visited: js.Array[PullSymbol]): Boolean = js.native
  
  def hasBaseTypeConflict(): Boolean = js.native
  
  def hasMembers(): Boolean = js.native
  
  def hasOnlyOverloadCallSignatures(): Boolean = js.native
  
  def hasOwnCallSignatures(): Boolean = js.native
  
  def hasOwnConstructSignatures(): Boolean = js.native
  
  def hasOwnIndexSignatures(): Boolean = js.native
  
  var inSymbolPrivacyCheck: Boolean = js.native
  
  var inWrapCheck: Boolean = js.native
  
  var inWrapInfiniteExpandingReferenceCheck: Boolean = js.native
  
  def incrementKnownBaseCount(): Unit = js.native
  
  def insertCallSignatureAtIndex(callSignature: PullSignatureSymbol, index: Double): Unit = js.native
  
  def insertConstructSignatureAtIndex(constructSignature: PullSignatureSymbol, index: Double): Unit = js.native
  
  def isClass(): Boolean = js.native
  
  def isConstructor(): Boolean = js.native
  
  def isEnum(): Boolean = js.native
  
  def isFunction(): Boolean = js.native
  
  def isFunctionType(): Boolean = js.native
  
  def isGeneric(): Boolean = js.native
  
  def isNamedTypeSymbol(): Boolean = js.native
  
  def isObject(): Boolean = js.native
  
  def isTypeParameter(): Boolean = js.native
  
  def isTypeVariable(): Boolean = js.native
  
  def isValidBaseKind(baseType: PullTypeSymbol, isExtendedType: Boolean): Boolean = js.native
  
  def resetKnownBaseTypeCount(): Unit = js.native
  
  def setArrayType(arrayType: PullTypeSymbol): Unit = js.native
  
  def setAssociatedContainerType(`type`: PullTypeSymbol): Unit = js.native
  
  def setConstructorMethod(constructorMethod: PullSymbol): Unit = js.native
  
  def setFunctionSymbol(symbol: PullSymbol): Unit = js.native
  
  def setHasBaseTypeConflict(): Unit = js.native
  
  def setHasDefaultConstructor(): Unit = js.native
  def setHasDefaultConstructor(hasOne: Boolean): Unit = js.native
  
  def setHasGenericMember(): Unit = js.native
  
  def setHasGenericSignature(): Unit = js.native
  
  var typeReference: PullTypeReferenceSymbol = js.native
  
  def widenedType(resolver: PullTypeResolver, ast: AST, context: PullTypeResolutionContext): PullTypeSymbol = js.native
  
  def wrapsSomeTypeParameter(typeParameterArgumentMap: js.Array[CandidateInferenceInfo]): Boolean = js.native
  def wrapsSomeTypeParameter(typeParameterArgumentMap: TypeArgumentMap): Boolean = js.native
  def wrapsSomeTypeParameter(typeParameterArgumentMap: TypeArgumentMap, skipTypeArgumentCheck: Boolean): Boolean = js.native
  
  def wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReference(enclosingType: PullTypeSymbol): Boolean = js.native
}
