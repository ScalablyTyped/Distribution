package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullTypeEnclosingTypeWalker")
@js.native
class PullTypeEnclosingTypeWalker () extends js.Object {
  var enclosingTypeWalkerState: js.Any = js.native
  def _canWalkStructure(): scala.Boolean = js.native
  def _getCurrentSymbol(): PullSymbol = js.native
  /* private */ def _popSymbol(): js.Any = js.native
  /* private */ def _pushSymbol(symbol: js.Any): js.Any = js.native
  /* private */ def _setEnclosingTypeOfParentDecl(decl: js.Any, setSignature: js.Any): js.Any = js.native
  /* private */ def canDeclBeUsedAsEnclosingType(decl: js.Any): js.Any = js.native
  /* private */ def canSymbolBeUsedAsEnclosingType(symbol: js.Any): js.Any = js.native
  /* private */ def canSymbolOrDeclBeUsedAsEnclosingTypeHelper(name: js.Any, kind: js.Any): js.Any = js.native
  def endWalkingType(stateWhenStartedWalkingTypes: EnclosingTypeWalkerState): scala.Unit = js.native
  def getBothKindOfIndexSignatures(
    resolver: PullTypeResolver,
    context: PullTypeResolutionContext,
    includeAugmentedType: scala.Boolean
  ): IndexSignatureInfo = js.native
  def getEnclosingType(): PullTypeSymbol = js.native
  def getGenerativeClassification(): GenerativeTypeClassification = js.native
  def postWalkIndexSignatureReturnType(): scala.Unit = js.native
  def postWalkIndexSignatureReturnType(onlySignature: scala.Boolean): scala.Unit = js.native
  def postWalkMemberType(): scala.Unit = js.native
  def postWalkParameterType(): scala.Unit = js.native
  def postWalkReturnType(): scala.Unit = js.native
  def postWalkSignature(): scala.Unit = js.native
  def postWalkTypeArgument(): scala.Unit = js.native
  def postWalkTypeParameterConstraint(): scala.Unit = js.native
  def resetEnclosingTypeWalkerState(): EnclosingTypeWalkerState = js.native
  /* private */ def setDefaultTypeWalkerState(): js.Any = js.native
  def setEnclosingTypeForSymbol(symbol: PullSymbol): EnclosingTypeWalkerState = js.native
  def setEnclosingTypeWalkerState(enclosingTypeWalkerState: EnclosingTypeWalkerState): scala.Unit = js.native
  /* private */ def setNonGenericEnclosingTypeWalkerState(): js.Any = js.native
  /* private */ def setSymbolAsEnclosingType(`type`: js.Any): js.Any = js.native
  def startWalkingType(symbol: PullTypeSymbol): EnclosingTypeWalkerState = js.native
  def walkIndexSignatureReturnType(indexSigInfo: IndexSignatureInfo, useStringIndexSignature: scala.Boolean): scala.Unit = js.native
  def walkIndexSignatureReturnType(
    indexSigInfo: IndexSignatureInfo,
    useStringIndexSignature: scala.Boolean,
    onlySignature: scala.Boolean
  ): scala.Unit = js.native
  def walkMemberType(memberName: java.lang.String, resolver: PullTypeResolver): scala.Unit = js.native
  def walkParameterType(iParam: scala.Double): scala.Unit = js.native
  def walkReturnType(): scala.Unit = js.native
  def walkSignature(kind: PullElementKind, index: scala.Double): scala.Unit = js.native
  def walkTypeArgument(index: scala.Double): scala.Unit = js.native
  def walkTypeParameterConstraint(index: scala.Double): scala.Unit = js.native
}

@JSGlobal("TypeScript.PullTypeEnclosingTypeWalker")
@js.native
object PullTypeEnclosingTypeWalker extends js.Object {
  var _defaultEnclosingTypeWalkerState: js.Any = js.native
  var _nonGenericEnclosingTypeWalkerState: js.Any = js.native
}

