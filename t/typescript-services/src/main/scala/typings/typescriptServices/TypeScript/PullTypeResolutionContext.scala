package typings.typescriptServices.TypeScript

import typings.typescriptServices.anon.EnclosingTypeWalkerState1
import typings.typescriptServices.anon.IndexSigs1
import typings.typescriptServices.anon.StateWhenStartedWalkingTypes1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullTypeResolutionContext extends StObject {
  
  /* private */ def _pushAnyContextualType(`type`: js.Any, provisional: js.Any, isInferentiallyTyping: js.Any, argContext: js.Any): js.Any = js.native
  
  def canTypeCheckAST(ast: AST): Boolean = js.native
  
  var contextStack: js.Any = js.native
  
  def doneBaseTypeResolution(wasInBaseTypeResolution: Boolean): Unit = js.native
  
  var enclosingTypeWalker1: js.Any = js.native
  
  var enclosingTypeWalker2: js.Any = js.native
  
  def endWalkingTypes(statesWhenStartedWalkingTypes: StateWhenStartedWalkingTypes1): Unit = js.native
  
  var fileName: String = js.native
  
  def fixAllTypeParametersReferencedByType(`type`: PullTypeSymbol, resolver: PullTypeResolver): PullTypeSymbol = js.native
  def fixAllTypeParametersReferencedByType(`type`: PullTypeSymbol, resolver: PullTypeResolver, argContext: TypeArgumentInferenceContext): PullTypeSymbol = js.native
  
  def getBothKindOfIndexSignatures(includeAugmentedType1: Boolean, includeAugmentedType2: Boolean): IndexSigs1 = js.native
  
  def getContextualType(): PullTypeSymbol = js.native
  
  /* private */ def getCurrentTypeArgumentInferenceContext(): js.Any = js.native
  
  def getSymbolForAST(ast: AST): PullSymbol = js.native
  
  def hasProvisionalErrors(): Boolean = js.native
  
  var inBaseTypeResolution: js.Any = js.native
  
  def inProvisionalResolution(): Boolean = js.native
  
  var inTypeCheck: Boolean = js.native
  
  def isInBaseTypeResolution(): Boolean = js.native
  
  def isInferentiallyTyping(): Boolean = js.native
  
  def oneOfClassificationsIsInfinitelyExpanding(): Boolean = js.native
  
  def popAnyContextualType(): PullContextualTypeContext = js.native
  
  def postDiagnostic(diagnostic: Diagnostic): Unit = js.native
  
  def postWalkIndexSignatureReturnTypes(): Unit = js.native
  def postWalkIndexSignatureReturnTypes(onlySignature: Boolean): Unit = js.native
  
  def postWalkMemberTypes(): Unit = js.native
  
  def postWalkParameterTypes(): Unit = js.native
  
  def postWalkReturnTypes(): Unit = js.native
  
  def postWalkSignatures(): Unit = js.native
  
  def postWalkTypeArgument(): Unit = js.native
  
  def postWalkTypeParameterConstraints(): Unit = js.native
  
  def propagateContextualType(`type`: PullTypeSymbol): Unit = js.native
  
  def pushInferentialType(`type`: PullTypeSymbol, typeArgumentInferenceContext: TypeArgumentInferenceContext): Unit = js.native
  
  def pushNewContextualType(`type`: PullTypeSymbol): Unit = js.native
  
  def pushProvisionalType(`type`: PullTypeSymbol): Unit = js.native
  
  def resetEnclosingTypeWalkerStates(): EnclosingTypeWalkerState1 = js.native
  
  var resolver: js.Any = js.native
  
  def setEnclosingTypeForSymbols(symbol1: PullSymbol, symbol2: PullSymbol): EnclosingTypeWalkerState1 = js.native
  
  def setEnclosingTypeWalkerStates(enclosingTypeWalkerStates: EnclosingTypeWalkerState1): Unit = js.native
  
  def setSymbolForAST(ast: AST, symbol: PullSymbol): Unit = js.native
  
  def setTypeChecked(ast: AST): Unit = js.native
  
  def setTypeInContext(symbol: PullSymbol, `type`: PullTypeSymbol): Unit = js.native
  
  def startBaseTypeResolution(): Boolean = js.native
  
  def startWalkingTypes(symbol1: PullTypeSymbol, symbol2: PullTypeSymbol): StateWhenStartedWalkingTypes1 = js.native
  
  def swapEnclosingTypeWalkers(): Unit = js.native
  
  def typeCheck(): Boolean = js.native
  
  var typeCheckedNodes: js.Any = js.native
  
  def walkIndexSignatureReturnTypes(indexSigs: IndexSigs1, useStringIndexSignature1: Boolean, useStringIndexSignature2: Boolean): Unit = js.native
  def walkIndexSignatureReturnTypes(
    indexSigs: IndexSigs1,
    useStringIndexSignature1: Boolean,
    useStringIndexSignature2: Boolean,
    onlySignature: Boolean
  ): Unit = js.native
  
  def walkMemberTypes(memberName: String): Unit = js.native
  
  def walkParameterTypes(iParam: Double): Unit = js.native
  
  def walkReturnTypes(): Unit = js.native
  
  def walkSignatures(kind: PullElementKind, index: Double): Unit = js.native
  def walkSignatures(kind: PullElementKind, index: Double, index2: Double): Unit = js.native
  
  def walkTypeArgument(index: Double): Unit = js.native
  
  def walkTypeParameterConstraints(index: Double): Unit = js.native
}
