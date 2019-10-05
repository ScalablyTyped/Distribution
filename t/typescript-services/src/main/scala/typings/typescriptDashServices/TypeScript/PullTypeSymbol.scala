package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullTypeSymbol")
@js.native
class PullTypeSymbol protected ()
  extends PullSymbol
     with InstantiableSymbol {
  def this(name: String, kind: PullElementKind) = this()
  var _allCallSignatures: js.Any = js.native
  var _allConstructSignatures: js.Any = js.native
  var _allIndexSignatures: js.Any = js.native
  var _allIndexSignaturesOfAugmentedType: js.Any = js.native
  var _allowedToReferenceTypeParameters: js.Any = js.native
  var _arrayVersionOfThisType: js.Any = js.native
  var _associatedContainerTypeSymbol: js.Any = js.native
  var _callSignatures: js.Any = js.native
  var _complexInstantiationCache: js.Any = js.native
  var _constructSignatures: js.Any = js.native
  var _constructorMethod: js.Any = js.native
  var _containedNonMemberContainerCache: js.Any = js.native
  var _containedNonMemberNameCache: js.Any = js.native
  var _containedNonMemberTypeNameCache: js.Any = js.native
  var _enclosedContainerCache: js.Any = js.native
  var _enclosedMemberContainers: js.Any = js.native
  var _enclosedMemberTypes: js.Any = js.native
  var _enclosedTypeNameCache: js.Any = js.native
  var _extendedTypes: js.Any = js.native
  var _functionSymbol: js.Any = js.native
  var _hasBaseTypeConflict: js.Any = js.native
  var _hasDefaultConstructor: js.Any = js.native
  var _hasGenericMember: js.Any = js.native
  var _hasGenericSignature: js.Any = js.native
  var _implementedTypes: js.Any = js.native
  var _inMemberTypeNameEx: js.Any = js.native
  var _indexSignatures: js.Any = js.native
  var _isArrayNamedTypeReference: js.Any = js.native
  var _knownBaseTypeCount: js.Any = js.native
  var _memberNameCache: js.Any = js.native
  var _members: js.Any = js.native
  var _simpleInstantiationCache: js.Any = js.native
  var _specializedVersionsOfThisType: js.Any = js.native
  var _typeParameterNameCache: js.Any = js.native
  var _typeParameters: js.Any = js.native
  var _typesThatExplicitlyImplementThisType: js.Any = js.native
  var _typesThatExtendThisType: js.Any = js.native
  var _widenedType: js.Any = js.native
  var _wrapsTypeParameterCache: js.Any = js.native
  var inSymbolPrivacyCheck: Boolean = js.native
  var inWrapCheck: Boolean = js.native
  var inWrapInfiniteExpandingReferenceCheck: Boolean = js.native
  var typeReference: PullTypeReferenceSymbol = js.native
  def _wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReferenceRecurse(enclosingType: PullTypeSymbol, knownWrapMap: IBitMatrix): Boolean = js.native
  /* private */ def _wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReferenceStructure(enclosingType: js.Any, knownWrapMap: js.Any): js.Any = js.native
  /* private */ def _wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReferenceWorker(enclosingType: js.Any, knownWrapMap: js.Any): js.Any = js.native
  /* private */ def addCallOrConstructSignaturePrerequisiteBase(signature: js.Any): js.Any = js.native
  /* private */ def addCallSignaturePrerequisite(callSignature: js.Any): js.Any = js.native
  /* private */ def addConstructSignaturePrerequisite(constructSignature: js.Any): js.Any = js.native
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
  /* private */ def canUseSimpleInstantiationCache(typeArgumentMap: js.Any): js.Any = js.native
  /* private */ def computeIsArrayNamedTypeReference(): js.Any = js.native
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
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[PullTypeParameterSymbol] = js.native
  def getArrayType(): PullTypeSymbol = js.native
  def getAssociatedContainerType(): PullTypeSymbol = js.native
  /* private */ def getBaseClassConstructSignatures(baseType: js.Any): js.Any = js.native
  def getCallSignatures(): js.Array[PullSignatureSymbol] = js.native
  def getConstructSignatures(): js.Array[PullSignatureSymbol] = js.native
  def getConstructorMethod(): PullSymbol = js.native
  /* private */ def getDefaultClassConstructSignature(): js.Any = js.native
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
  /* private */ def getMemberTypeNameEx(topLevel: js.Any): js.Any = js.native
  /* private */ def getMemberTypeNameEx(topLevel: js.Any, scopeSymbol: js.Any): js.Any = js.native
  /* private */ def getMemberTypeNameEx(topLevel: js.Any, scopeSymbol: js.Any, getPrettyTypeName: js.Any): js.Any = js.native
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
  /* private */ def getSimpleInstantiationCacheId(typeArgumentMap: js.Any): js.Any = js.native
  def getSpecialization(typeArgumentMap: TypeArgumentMap): PullTypeSymbol = js.native
  def getTypeArguments(): js.Array[PullTypeSymbol] = js.native
  def getTypeArgumentsOrTypeParameters(): js.Array[PullTypeSymbol] = js.native
  def getTypeOfSymbol(): PullSymbol = js.native
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
  def getTypeParameters(): js.Array[PullTypeParameterSymbol] = js.native
  def getTypesThatExplicitlyImplementThisType(): js.Array[PullTypeSymbol] = js.native
  def getTypesThatExtendThisType(): js.Array[PullTypeSymbol] = js.native
  def getWrappingTypeParameterID(typeParameterArgumentMap: TypeArgumentMap): Double = js.native
  def getWrappingTypeParameterID(typeParameterArgumentMap: TypeArgumentMap, skipTypeArgumentCheck: Boolean): Double = js.native
  /* private */ def getWrappingTypeParameterIDFromSignatures(signatures: js.Any, typeParameterArgumentMap: js.Any): js.Any = js.native
  /* private */ def getWrappingTypeParameterIDWorker(typeParameterArgumentMap: js.Any, skipTypeArgumentCheck: js.Any): js.Any = js.native
  def hasBase(potentialBase: PullTypeSymbol): Boolean = js.native
  def hasBase(potentialBase: PullTypeSymbol, visited: js.Array[PullSymbol]): Boolean = js.native
  def hasBaseTypeConflict(): Boolean = js.native
  def hasMembers(): Boolean = js.native
  def hasOnlyOverloadCallSignatures(): Boolean = js.native
  def hasOwnCallSignatures(): Boolean = js.native
  def hasOwnConstructSignatures(): Boolean = js.native
  def hasOwnIndexSignatures(): Boolean = js.native
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
  def widenedType(resolver: PullTypeResolver, ast: AST, context: PullTypeResolutionContext): PullTypeSymbol = js.native
  def wrapsSomeTypeParameter(typeParameterArgumentMap: js.Array[CandidateInferenceInfo]): Boolean = js.native
  def wrapsSomeTypeParameter(typeParameterArgumentMap: TypeArgumentMap): Boolean = js.native
  def wrapsSomeTypeParameter(typeParameterArgumentMap: TypeArgumentMap, skipTypeArgumentCheck: Boolean): Boolean = js.native
  def wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReference(enclosingType: PullTypeSymbol): Boolean = js.native
}

