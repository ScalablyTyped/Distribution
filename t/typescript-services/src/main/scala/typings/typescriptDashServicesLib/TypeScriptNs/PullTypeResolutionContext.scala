package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullTypeResolutionContext")
@js.native
class PullTypeResolutionContext protected () extends js.Object {
  def this(resolver: PullTypeResolver) = this()
  def this(resolver: PullTypeResolver, inTypeCheck: scala.Boolean) = this()
  def this(resolver: PullTypeResolver, inTypeCheck: scala.Boolean, fileName: java.lang.String) = this()
  var contextStack: js.Any = js.native
  var enclosingTypeWalker1: js.Any = js.native
  var enclosingTypeWalker2: js.Any = js.native
  var fileName: java.lang.String = js.native
  var inBaseTypeResolution: js.Any = js.native
  var inTypeCheck: scala.Boolean = js.native
  var resolver: js.Any = js.native
  var typeCheckedNodes: js.Any = js.native
  /* private */ def _pushAnyContextualType(`type`: js.Any, provisional: js.Any, isInferentiallyTyping: js.Any, argContext: js.Any): js.Any = js.native
  def canTypeCheckAST(ast: AST): scala.Boolean = js.native
  def doneBaseTypeResolution(wasInBaseTypeResolution: scala.Boolean): scala.Unit = js.native
  def endWalkingTypes(statesWhenStartedWalkingTypes: typescriptDashServicesLib.Anon_StateWhenStartedWalkingTypes2): scala.Unit = js.native
  def fixAllTypeParametersReferencedByType(`type`: PullTypeSymbol, resolver: PullTypeResolver): PullTypeSymbol = js.native
  def fixAllTypeParametersReferencedByType(`type`: PullTypeSymbol, resolver: PullTypeResolver, argContext: TypeArgumentInferenceContext): PullTypeSymbol = js.native
  def getBothKindOfIndexSignatures(includeAugmentedType1: scala.Boolean, includeAugmentedType2: scala.Boolean): typescriptDashServicesLib.Anon_IndexSigs2 = js.native
  def getContextualType(): PullTypeSymbol = js.native
  /* private */ def getCurrentTypeArgumentInferenceContext(): js.Any = js.native
  def getSymbolForAST(ast: AST): PullSymbol = js.native
  def hasProvisionalErrors(): scala.Boolean = js.native
  def inProvisionalResolution(): scala.Boolean = js.native
  def isInBaseTypeResolution(): scala.Boolean = js.native
  def isInferentiallyTyping(): scala.Boolean = js.native
  def oneOfClassificationsIsInfinitelyExpanding(): scala.Boolean = js.native
  def popAnyContextualType(): PullContextualTypeContext = js.native
  def postDiagnostic(diagnostic: Diagnostic): scala.Unit = js.native
  def postWalkIndexSignatureReturnTypes(): scala.Unit = js.native
  def postWalkIndexSignatureReturnTypes(onlySignature: scala.Boolean): scala.Unit = js.native
  def postWalkMemberTypes(): scala.Unit = js.native
  def postWalkParameterTypes(): scala.Unit = js.native
  def postWalkReturnTypes(): scala.Unit = js.native
  def postWalkSignatures(): scala.Unit = js.native
  def postWalkTypeArgument(): scala.Unit = js.native
  def postWalkTypeParameterConstraints(): scala.Unit = js.native
  def propagateContextualType(`type`: PullTypeSymbol): scala.Unit = js.native
  def pushInferentialType(`type`: PullTypeSymbol, typeArgumentInferenceContext: TypeArgumentInferenceContext): scala.Unit = js.native
  def pushNewContextualType(`type`: PullTypeSymbol): scala.Unit = js.native
  def pushProvisionalType(`type`: PullTypeSymbol): scala.Unit = js.native
  def resetEnclosingTypeWalkerStates(): typescriptDashServicesLib.Anon_EnclosingTypeWalkerState2 = js.native
  def setEnclosingTypeForSymbols(symbol1: PullSymbol, symbol2: PullSymbol): typescriptDashServicesLib.Anon_EnclosingTypeWalkerState2 = js.native
  def setEnclosingTypeWalkerStates(enclosingTypeWalkerStates: typescriptDashServicesLib.Anon_EnclosingTypeWalkerState2): scala.Unit = js.native
  def setSymbolForAST(ast: AST, symbol: PullSymbol): scala.Unit = js.native
  def setTypeChecked(ast: AST): scala.Unit = js.native
  def setTypeInContext(symbol: PullSymbol, `type`: PullTypeSymbol): scala.Unit = js.native
  def startBaseTypeResolution(): scala.Boolean = js.native
  def startWalkingTypes(symbol1: PullTypeSymbol, symbol2: PullTypeSymbol): typescriptDashServicesLib.Anon_StateWhenStartedWalkingTypes2 = js.native
  def swapEnclosingTypeWalkers(): scala.Unit = js.native
  def typeCheck(): scala.Boolean = js.native
  def walkIndexSignatureReturnTypes(
    indexSigs: typescriptDashServicesLib.Anon_IndexSigs2,
    useStringIndexSignature1: scala.Boolean,
    useStringIndexSignature2: scala.Boolean
  ): scala.Unit = js.native
  def walkIndexSignatureReturnTypes(
    indexSigs: typescriptDashServicesLib.Anon_IndexSigs2,
    useStringIndexSignature1: scala.Boolean,
    useStringIndexSignature2: scala.Boolean,
    onlySignature: scala.Boolean
  ): scala.Unit = js.native
  def walkMemberTypes(memberName: java.lang.String): scala.Unit = js.native
  def walkParameterTypes(iParam: scala.Double): scala.Unit = js.native
  def walkReturnTypes(): scala.Unit = js.native
  def walkSignatures(kind: PullElementKind, index: scala.Double): scala.Unit = js.native
  def walkSignatures(kind: PullElementKind, index: scala.Double, index2: scala.Double): scala.Unit = js.native
  def walkTypeArgument(index: scala.Double): scala.Unit = js.native
  def walkTypeParameterConstraints(index: scala.Double): scala.Unit = js.native
}

