package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullTypeSymbol")
@js.native
class PullTypeSymbol protected ()
  extends PullSymbol
     with InstantiableSymbol {
  def this(name: java.lang.String, kind: PullElementKind) = this()
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
  var inSymbolPrivacyCheck: scala.Boolean = js.native
  var inWrapCheck: scala.Boolean = js.native
  var inWrapInfiniteExpandingReferenceCheck: scala.Boolean = js.native
  var typeReference: PullTypeReferenceSymbol = js.native
  def _wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReferenceRecurse(enclosingType: PullTypeSymbol, knownWrapMap: IBitMatrix): scala.Boolean = js.native
  /* private */ def _wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReferenceStructure(enclosingType: js.Any, knownWrapMap: js.Any): js.Any = js.native
  /* private */ def _wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReferenceWorker(enclosingType: js.Any, knownWrapMap: js.Any): js.Any = js.native
  /* private */ def addCallOrConstructSignaturePrerequisiteBase(signature: js.Any): js.Any = js.native
  /* private */ def addCallSignaturePrerequisite(callSignature: js.Any): js.Any = js.native
  /* private */ def addConstructSignaturePrerequisite(constructSignature: js.Any): js.Any = js.native
  def addEnclosedMemberContainer(enclosedContainer: PullTypeSymbol): scala.Unit = js.native
  def addEnclosedMemberType(enclosedType: PullTypeSymbol): scala.Unit = js.native
  def addEnclosedNonMember(enclosedNonMember: PullSymbol): scala.Unit = js.native
  def addEnclosedNonMemberContainer(enclosedNonMemberContainer: PullTypeSymbol): scala.Unit = js.native
  def addEnclosedNonMemberType(enclosedNonMemberType: PullTypeSymbol): scala.Unit = js.native
  def addExtendedType(extendedType: PullTypeSymbol): scala.Unit = js.native
  def addImplementedType(implementedType: PullTypeSymbol): scala.Unit = js.native
  def addIndexSignature(indexSignature: PullSignatureSymbol): scala.Unit = js.native
  def addMember(memberSymbol: PullSymbol): scala.Unit = js.native
  def addSpecialization(specializedVersionOfThisType: PullTypeSymbol, typeArgumentMap: TypeArgumentMap): scala.Unit = js.native
  def addTypeParameter(typeParameter: PullTypeParameterSymbol): scala.Unit = js.native
  def addTypeThatExplicitlyImplementsThisType(`type`: PullTypeSymbol): scala.Unit = js.native
  def addTypeThatExtendsThisType(`type`: PullTypeSymbol): scala.Unit = js.native
  def appendCallSignature(callSignature: PullSignatureSymbol): scala.Unit = js.native
  def appendConstructSignature(constructSignature: PullSignatureSymbol): scala.Unit = js.native
  /* private */ def canUseSimpleInstantiationCache(typeArgumentMap: js.Any): js.Any = js.native
  /* private */ def computeIsArrayNamedTypeReference(): js.Any = js.native
  def findContainedNonMember(name: java.lang.String): PullSymbol = js.native
  def findContainedNonMemberContainer(containerName: java.lang.String): PullTypeSymbol = js.native
  def findContainedNonMemberContainer(containerName: java.lang.String, kind: PullElementKind): PullTypeSymbol = js.native
  def findContainedNonMemberType(typeName: java.lang.String): PullTypeSymbol = js.native
  def findContainedNonMemberType(typeName: java.lang.String, kind: PullElementKind): PullTypeSymbol = js.native
  def findMember(name: java.lang.String, lookInParent: scala.Boolean): PullSymbol = js.native
  def findNestedContainer(name: java.lang.String): PullTypeSymbol = js.native
  def findNestedContainer(name: java.lang.String, kind: PullElementKind): PullTypeSymbol = js.native
  def findNestedType(name: java.lang.String): PullTypeSymbol = js.native
  def findNestedType(name: java.lang.String, kind: PullElementKind): PullTypeSymbol = js.native
  def findTypeParameter(name: java.lang.String): PullTypeParameterSymbol = js.native
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
  def getHasDefaultConstructor(): scala.Boolean = js.native
  def getHasGenericMember(): scala.Boolean = js.native
  def getHasGenericSignature(): scala.Boolean = js.native
  def getImplementedTypes(): js.Array[PullTypeSymbol] = js.native
  def getIndexSignatures(): js.Array[PullSignatureSymbol] = js.native
  def getIndexSignaturesOfAugmentedType(
    resolver: PullTypeResolver,
    globalFunctionInterface: PullTypeSymbol,
    globalObjectInterface: PullTypeSymbol
  ): js.Array[PullSignatureSymbol] = js.native
  /* InferMemberOverrides */
  override def getIsSpecialized(): scala.Boolean = js.native
  def getKnownBaseTypeCount(): scala.Double = js.native
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
    skipTypeParametersInName: js.UndefOr[scala.Boolean],
    useConstraintInName: js.UndefOr[scala.Boolean],
    getPrettyTypeName: js.UndefOr[scala.Boolean],
    getTypeParamMarkerInfo: js.UndefOr[scala.Boolean],
    skipInternalAliasName: js.UndefOr[scala.Boolean],
    shouldAllowArrayType: js.UndefOr[scala.Boolean]
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
  def getWrappingTypeParameterID(typeParameterArgumentMap: TypeArgumentMap): scala.Double = js.native
  def getWrappingTypeParameterID(typeParameterArgumentMap: TypeArgumentMap, skipTypeArgumentCheck: scala.Boolean): scala.Double = js.native
  /* private */ def getWrappingTypeParameterIDFromSignatures(signatures: js.Any, typeParameterArgumentMap: js.Any): js.Any = js.native
  /* private */ def getWrappingTypeParameterIDWorker(typeParameterArgumentMap: js.Any, skipTypeArgumentCheck: js.Any): js.Any = js.native
  def hasBase(potentialBase: PullTypeSymbol): scala.Boolean = js.native
  def hasBase(potentialBase: PullTypeSymbol, visited: js.Array[PullSymbol]): scala.Boolean = js.native
  def hasBaseTypeConflict(): scala.Boolean = js.native
  def hasMembers(): scala.Boolean = js.native
  def hasOnlyOverloadCallSignatures(): scala.Boolean = js.native
  def hasOwnCallSignatures(): scala.Boolean = js.native
  def hasOwnConstructSignatures(): scala.Boolean = js.native
  def hasOwnIndexSignatures(): scala.Boolean = js.native
  def incrementKnownBaseCount(): scala.Unit = js.native
  def insertCallSignatureAtIndex(callSignature: PullSignatureSymbol, index: scala.Double): scala.Unit = js.native
  def insertConstructSignatureAtIndex(constructSignature: PullSignatureSymbol, index: scala.Double): scala.Unit = js.native
  def isClass(): scala.Boolean = js.native
  def isConstructor(): scala.Boolean = js.native
  def isEnum(): scala.Boolean = js.native
  def isFunction(): scala.Boolean = js.native
  def isFunctionType(): scala.Boolean = js.native
  def isGeneric(): scala.Boolean = js.native
  def isNamedTypeSymbol(): scala.Boolean = js.native
  def isObject(): scala.Boolean = js.native
  def isTypeParameter(): scala.Boolean = js.native
  def isTypeVariable(): scala.Boolean = js.native
  def isValidBaseKind(baseType: PullTypeSymbol, isExtendedType: scala.Boolean): scala.Boolean = js.native
  def resetKnownBaseTypeCount(): scala.Unit = js.native
  def setArrayType(arrayType: PullTypeSymbol): scala.Unit = js.native
  def setAssociatedContainerType(`type`: PullTypeSymbol): scala.Unit = js.native
  def setConstructorMethod(constructorMethod: PullSymbol): scala.Unit = js.native
  def setFunctionSymbol(symbol: PullSymbol): scala.Unit = js.native
  def setHasBaseTypeConflict(): scala.Unit = js.native
  def setHasDefaultConstructor(): scala.Unit = js.native
  def setHasDefaultConstructor(hasOne: scala.Boolean): scala.Unit = js.native
  def setHasGenericMember(): scala.Unit = js.native
  def setHasGenericSignature(): scala.Unit = js.native
  def widenedType(resolver: PullTypeResolver, ast: AST, context: PullTypeResolutionContext): PullTypeSymbol = js.native
  def wrapsSomeTypeParameter(typeParameterArgumentMap: js.Array[CandidateInferenceInfo]): scala.Boolean = js.native
  def wrapsSomeTypeParameter(typeParameterArgumentMap: TypeArgumentMap): scala.Boolean = js.native
  def wrapsSomeTypeParameter(typeParameterArgumentMap: TypeArgumentMap, skipTypeArgumentCheck: scala.Boolean): scala.Boolean = js.native
  def wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReference(enclosingType: PullTypeSymbol): scala.Boolean = js.native
}

