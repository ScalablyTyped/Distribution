package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullSignatureSymbol")
@js.native
class PullSignatureSymbol protected ()
  extends PullSymbol
     with InstantiableSymbol {
  def this(kind: PullElementKind) = this()
  def this(kind: PullElementKind, _isDefinition: scala.Boolean) = this()
  var _allowedToReferenceTypeParameters: js.Any = js.native
  var _instantiationCache: js.Any = js.native
  var _isDefinition: js.Any = js.native
  var _memberTypeParameterNameCache: js.Any = js.native
  var _stringConstantOverload: js.Any = js.native
  var _typeParameters: js.Array[PullTypeParameterSymbol] = js.native
  var _wrapsTypeParameterCache: js.Any = js.native
  var functionType: PullTypeSymbol = js.native
  var hasBeenChecked: scala.Boolean = js.native
  var hasOptionalParam: scala.Boolean = js.native
  var hasVarArgs: scala.Boolean = js.native
  var inWrapCheck: scala.Boolean = js.native
  var inWrapInfiniteExpandingReferenceCheck: scala.Boolean = js.native
  var nonOptionalParamCount: scala.Double = js.native
  var parameters: js.Array[PullSymbol] = js.native
  var returnType: PullTypeSymbol = js.native
  def _wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReference(enclosingType: PullTypeSymbol, knownWrapMap: IBitMatrix): scala.Boolean = js.native
  def _wrapsSomeTypeParameterIntoInfinitelyExpandingTypeReferenceWorker(enclosingType: PullTypeSymbol, knownWrapMap: IBitMatrix): scala.Boolean = js.native
  def addParameter(parameter: PullSymbol): scala.Unit = js.native
  def addParameter(parameter: PullSymbol, isOptional: scala.Boolean): scala.Unit = js.native
  def addSpecialization(specializedVersionOfThisSignature: PullSignatureSymbol, typeArgumentMap: TypeArgumentMap): scala.Unit = js.native
  def addTypeParameter(typeParameter: PullTypeParameterSymbol): scala.Unit = js.native
  def addTypeParametersFromReturnType(): scala.Unit = js.native
  def findTypeParameter(name: java.lang.String): PullTypeParameterSymbol = js.native
  def forAllCorrespondingParameterTypesInThisAndOtherSignature(
    otherSignature: PullSignatureSymbol,
    predicate: js.Function3[
      /* thisSignatureParameterType */ PullTypeSymbol, 
      /* otherSignatureParameterType */ PullTypeSymbol, 
      /* iterationIndex */ scala.Double, 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def forAllParameterTypes(
    length: scala.Double,
    predicate: js.Function2[/* parameterType */ PullTypeSymbol, /* iterationIndex */ scala.Double, scala.Boolean]
  ): scala.Boolean = js.native
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[PullTypeParameterSymbol] = js.native
  /* InferMemberOverrides */
  override def getIsSpecialized(): scala.Boolean = js.native
  def getParameterTypeAtIndex(iParam: scala.Double): PullTypeSymbol = js.native
  def getSignatureTypeNameEx(prefix: java.lang.String, shortform: scala.Boolean, brackets: scala.Boolean): MemberNameArray = js.native
  def getSignatureTypeNameEx(
    prefix: java.lang.String,
    shortform: scala.Boolean,
    brackets: scala.Boolean,
    scopeSymbol: PullSymbol
  ): MemberNameArray = js.native
  def getSignatureTypeNameEx(
    prefix: java.lang.String,
    shortform: scala.Boolean,
    brackets: scala.Boolean,
    scopeSymbol: PullSymbol,
    getParamMarkerInfo: scala.Boolean
  ): MemberNameArray = js.native
  def getSignatureTypeNameEx(
    prefix: java.lang.String,
    shortform: scala.Boolean,
    brackets: scala.Boolean,
    scopeSymbol: PullSymbol,
    getParamMarkerInfo: scala.Boolean,
    getTypeParamMarkerInfo: scala.Boolean
  ): MemberNameArray = js.native
  def getSpecialization(typeArgumentMap: TypeArgumentMap): PullSignatureSymbol = js.native
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
  def getTypeParameters(): js.Array[PullTypeParameterSymbol] = js.native
  def getWrappingTypeParameterID(typeParameterArgumentMap: TypeArgumentMap): scala.Double = js.native
  def getWrappingTypeParameterIDWorker(typeParameterArgumentMap: TypeArgumentMap): scala.Double = js.native
  def isDefinition(): scala.Boolean = js.native
  def isGeneric(): scala.Boolean = js.native
  def isStringConstantOverloadSignature(): scala.Boolean = js.native
  def wrapsSomeTypeParameter(typeParameterArgumentMap: TypeArgumentMap): scala.Boolean = js.native
}

@JSGlobal("TypeScript.PullSignatureSymbol")
@js.native
object PullSignatureSymbol extends js.Object {
  def getSignatureTypeMemberName(
    candidateSignature: typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol,
    signatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol],
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol
  ): typescriptDashServicesLib.TypeScriptNs.MemberNameArray = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol],
    prefix: java.lang.String,
    shortform: scala.Boolean,
    brackets: scala.Boolean
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol],
    prefix: java.lang.String,
    shortform: scala.Boolean,
    brackets: scala.Boolean,
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol],
    prefix: java.lang.String,
    shortform: scala.Boolean,
    brackets: scala.Boolean,
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    getPrettyTypeName: scala.Boolean
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol],
    prefix: java.lang.String,
    shortform: scala.Boolean,
    brackets: scala.Boolean,
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    getPrettyTypeName: scala.Boolean,
    candidateSignature: typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.MemberName] = js.native
}

