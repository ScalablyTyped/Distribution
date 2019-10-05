package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.Anon_AllSignatures
import typings.typescriptDashServices.Anon_Getter
import typings.typescriptDashServices.TypeScript.PullHelpers.PullTypeSymbolStructureWalker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullHelpers")
@js.native
object PullHelpers extends js.Object {
  @js.native
  class OtherPullDeclsWalker ()
    extends typings.typescriptDashServices.TypeScript.PullHelpers.OtherPullDeclsWalker
  
  def diagnosticFromDecl(decl: typings.typescriptDashServices.TypeScript.PullDecl, diagnosticKey: String): typings.typescriptDashServices.TypeScript.Diagnostic = js.native
  def diagnosticFromDecl(
    decl: typings.typescriptDashServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ): typings.typescriptDashServices.TypeScript.Diagnostic = js.native
  def diagnosticFromDecl(
    decl: typings.typescriptDashServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typings.typescriptDashServices.TypeScript.Location]
  ): typings.typescriptDashServices.TypeScript.Diagnostic = js.native
  def getAccessorSymbol(
    getterOrSetter: typings.typescriptDashServices.TypeScript.AST,
    semanticInfoChain: typings.typescriptDashServices.TypeScript.SemanticInfoChain
  ): typings.typescriptDashServices.TypeScript.PullAccessorSymbol = js.native
  def getGetterAndSetterFunction(
    funcDecl: typings.typescriptDashServices.TypeScript.AST,
    semanticInfoChain: typings.typescriptDashServices.TypeScript.SemanticInfoChain
  ): Anon_Getter = js.native
  def getRootType(`type`: typings.typescriptDashServices.TypeScript.PullTypeSymbol): typings.typescriptDashServices.TypeScript.PullTypeSymbol = js.native
  def getSignatureForFuncDecl(functionDecl: typings.typescriptDashServices.TypeScript.PullDecl): Anon_AllSignatures = js.native
  def isExportedSymbolInClodule(symbol: typings.typescriptDashServices.TypeScript.PullSymbol): Boolean = js.native
  def isNameNumeric(name: String): Boolean = js.native
  def isSymbolDeclaredInScopeChain(
    symbol: typings.typescriptDashServices.TypeScript.PullSymbol,
    scopeSymbol: typings.typescriptDashServices.TypeScript.PullSymbol
  ): Boolean = js.native
  def isSymbolLocal(symbol: typings.typescriptDashServices.TypeScript.PullSymbol): Boolean = js.native
  def resolveDeclaredSymbolToUseType(symbol: typings.typescriptDashServices.TypeScript.PullSymbol): Unit = js.native
  def symbolIsEnum(source: typings.typescriptDashServices.TypeScript.PullSymbol): Boolean = js.native
  def symbolIsModule(symbol: typings.typescriptDashServices.TypeScript.PullSymbol): Boolean = js.native
  def typeSymbolsAreIdentical(
    a: typings.typescriptDashServices.TypeScript.PullTypeSymbol,
    b: typings.typescriptDashServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  def walkPullTypeSymbolStructure(
    typeSymbol: typings.typescriptDashServices.TypeScript.PullTypeSymbol,
    walker: PullTypeSymbolStructureWalker
  ): Unit = js.native
}

