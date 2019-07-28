package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullSignatureSymbol")
@js.native
class PullSignatureSymbol protected ()
  extends PullSymbol
     with InstantiableSymbol {
  def this(kind: PullElementKind) = this()
  def this(kind: PullElementKind, _isDefinition: Boolean) = this()
  var _allowedToReferenceTypeParameters: js.Any = js.native
  var _instantiationCache: js.Any = js.native
  var _isDefinition: js.Any = js.native
  var _memberTypeParameterNameCache: js.Any = js.native
  var _stringConstantOverload: js.Any = js.native
  var _typeParameters: js.Array[PullTypeParameterSymbol] = js.native
  var _wrapsTypeParameterCache: js.Any = js.native
  var functionType: PullTypeSymbol = js.native
  var hasBeenChecked: Boolean = js.native
  var hasOptionalParam: Boolean = js.native
  var hasVarArgs: Boolean = js.native
  var inWrapCheck: Boolean = js.native
  var inWrapInfiniteExpandingReferenceCheck: Boolean = js.native
  var nonOptionalParamCount: Double = js.native
  var parameters: js.Array[PullSymbol] = js.native
  var returnType: PullTypeSymbol = js.native
  def _wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReference(enclosingType: PullTypeSymbol, knownWrapMap: IBitMatrix): Boolean = js.native
  def _wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReferenceWorker(enclosingType: PullTypeSymbol, knownWrapMap: IBitMatrix): Boolean = js.native
  def addParameter(parameter: PullSymbol): Unit = js.native
  def addParameter(parameter: PullSymbol, isOptional: Boolean): Unit = js.native
  def addSpecialization(specializedVersionOfThisSignature: PullSignatureSymbol, typeArgumentMap: TypeArgumentMap): Unit = js.native
  def addTypeParameter(typeParameter: PullTypeParameterSymbol): Unit = js.native
  def addTypeParametersFromReturnType(): Unit = js.native
  def findTypeParameter(name: String): PullTypeParameterSymbol = js.native
  def forAllCorrespondingParameterTypesInThisAndOtherSignature(
    otherSignature: PullSignatureSymbol,
    predicate: js.Function3[
      /* thisSignatureParameterType */ PullTypeSymbol, 
      /* otherSignatureParameterType */ PullTypeSymbol, 
      /* iterationIndex */ Double, 
      Boolean
    ]
  ): Boolean = js.native
  def forAllParameterTypes(
    length: Double,
    predicate: js.Function2[/* parameterType */ PullTypeSymbol, /* iterationIndex */ Double, Boolean]
  ): Boolean = js.native
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[PullTypeParameterSymbol] = js.native
  /* InferMemberOverrides */
  override def getIsSpecialized(): Boolean = js.native
  def getParameterTypeAtIndex(iParam: Double): PullTypeSymbol = js.native
  def getSignatureTypeNameEx(prefix: String, shortform: Boolean, brackets: Boolean): MemberNameArray = js.native
  def getSignatureTypeNameEx(prefix: String, shortform: Boolean, brackets: Boolean, scopeSymbol: PullSymbol): MemberNameArray = js.native
  def getSignatureTypeNameEx(
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: PullSymbol,
    getParamMarkerInfo: Boolean
  ): MemberNameArray = js.native
  def getSignatureTypeNameEx(
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: PullSymbol,
    getParamMarkerInfo: Boolean,
    getTypeParamMarkerInfo: Boolean
  ): MemberNameArray = js.native
  def getSpecialization(typeArgumentMap: TypeArgumentMap): PullSignatureSymbol = js.native
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
  def getTypeParameters(): js.Array[PullTypeParameterSymbol] = js.native
  def getWrappingTypeParameterID(typeParameterArgumentMap: TypeArgumentMap): Double = js.native
  def getWrappingTypeParameterIDWorker(typeParameterArgumentMap: TypeArgumentMap): Double = js.native
  def isDefinition(): Boolean = js.native
  def isGeneric(): Boolean = js.native
  def isStringConstantOverloadSignature(): Boolean = js.native
  def wrapsSomeTypeParameter(typeParameterArgumentMap: TypeArgumentMap): Boolean = js.native
}

/* static members */
@JSGlobal("TypeScript.PullSignatureSymbol")
@js.native
object PullSignatureSymbol extends js.Object {
  def getSignatureTypeMemberName(
    candidateSignature: PullSignatureSymbol,
    signatures: js.Array[PullSignatureSymbol],
    scopeSymbol: PullSymbol
  ): MemberNameArray = js.native
  def getSignaturesTypeNameEx(signatures: js.Array[PullSignatureSymbol], prefix: String, shortform: Boolean, brackets: Boolean): js.Array[MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: PullSymbol
  ): js.Array[MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: PullSymbol,
    getPrettyTypeName: Boolean
  ): js.Array[MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: PullSymbol,
    getPrettyTypeName: Boolean,
    candidateSignature: PullSignatureSymbol
  ): js.Array[MemberName] = js.native
}

