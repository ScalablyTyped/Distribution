package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullTypeEnclosingTypeWalker extends StObject {
  
  def _canWalkStructure(): Boolean = js.native
  
  def _getCurrentSymbol(): PullSymbol = js.native
  
  /* private */ def _popSymbol(): js.Any = js.native
  
  /* private */ def _pushSymbol(symbol: js.Any): js.Any = js.native
  
  /* private */ def _setEnclosingTypeOfParentDecl(decl: js.Any, setSignature: js.Any): js.Any = js.native
  
  /* private */ def canDeclBeUsedAsEnclosingType(decl: js.Any): js.Any = js.native
  
  /* private */ def canSymbolBeUsedAsEnclosingType(symbol: js.Any): js.Any = js.native
  
  /* private */ def canSymbolOrDeclBeUsedAsEnclosingTypeHelper(name: js.Any, kind: js.Any): js.Any = js.native
  
  var enclosingTypeWalkerState: js.Any = js.native
  
  def endWalkingType(stateWhenStartedWalkingTypes: EnclosingTypeWalkerState): Unit = js.native
  
  def getBothKindOfIndexSignatures(resolver: PullTypeResolver, context: PullTypeResolutionContext, includeAugmentedType: Boolean): IndexSignatureInfo = js.native
  
  def getEnclosingType(): PullTypeSymbol = js.native
  
  def getGenerativeClassification(): GenerativeTypeClassification = js.native
  
  def postWalkIndexSignatureReturnType(): Unit = js.native
  def postWalkIndexSignatureReturnType(onlySignature: Boolean): Unit = js.native
  
  def postWalkMemberType(): Unit = js.native
  
  def postWalkParameterType(): Unit = js.native
  
  def postWalkReturnType(): Unit = js.native
  
  def postWalkSignature(): Unit = js.native
  
  def postWalkTypeArgument(): Unit = js.native
  
  def postWalkTypeParameterConstraint(): Unit = js.native
  
  def resetEnclosingTypeWalkerState(): EnclosingTypeWalkerState = js.native
  
  /* private */ def setDefaultTypeWalkerState(): js.Any = js.native
  
  def setEnclosingTypeForSymbol(symbol: PullSymbol): EnclosingTypeWalkerState = js.native
  
  def setEnclosingTypeWalkerState(enclosingTypeWalkerState: EnclosingTypeWalkerState): Unit = js.native
  
  /* private */ def setNonGenericEnclosingTypeWalkerState(): js.Any = js.native
  
  /* private */ def setSymbolAsEnclosingType(`type`: js.Any): js.Any = js.native
  
  def startWalkingType(symbol: PullTypeSymbol): EnclosingTypeWalkerState = js.native
  
  def walkIndexSignatureReturnType(indexSigInfo: IndexSignatureInfo, useStringIndexSignature: Boolean): Unit = js.native
  def walkIndexSignatureReturnType(indexSigInfo: IndexSignatureInfo, useStringIndexSignature: Boolean, onlySignature: Boolean): Unit = js.native
  
  def walkMemberType(memberName: String, resolver: PullTypeResolver): Unit = js.native
  
  def walkParameterType(iParam: Double): Unit = js.native
  
  def walkReturnType(): Unit = js.native
  
  def walkSignature(kind: PullElementKind, index: Double): Unit = js.native
  
  def walkTypeArgument(index: Double): Unit = js.native
  
  def walkTypeParameterConstraint(index: Double): Unit = js.native
}
