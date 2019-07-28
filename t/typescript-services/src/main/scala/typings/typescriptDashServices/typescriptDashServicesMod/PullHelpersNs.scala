package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.Anon_AllSignatures
import typings.typescriptDashServices.Anon_Getter
import typings.typescriptDashServices.TypeScriptNs.PullHelpersNs.PullTypeSymbolStructureWalker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullHelpers")
@js.native
object PullHelpersNs extends js.Object {
  @js.native
  class OtherPullDeclsWalker ()
    extends typings.typescriptDashServices.TypeScriptNs.PullHelpersNs.OtherPullDeclsWalker
  
  def diagnosticFromDecl(decl: typings.typescriptDashServices.TypeScriptNs.PullDecl, diagnosticKey: String): typings.typescriptDashServices.TypeScriptNs.Diagnostic = js.native
  def diagnosticFromDecl(
    decl: typings.typescriptDashServices.TypeScriptNs.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ): typings.typescriptDashServices.TypeScriptNs.Diagnostic = js.native
  def diagnosticFromDecl(
    decl: typings.typescriptDashServices.TypeScriptNs.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typings.typescriptDashServices.TypeScriptNs.Location]
  ): typings.typescriptDashServices.TypeScriptNs.Diagnostic = js.native
  def getAccessorSymbol(
    getterOrSetter: typings.typescriptDashServices.TypeScriptNs.AST,
    semanticInfoChain: typings.typescriptDashServices.TypeScriptNs.SemanticInfoChain
  ): typings.typescriptDashServices.TypeScriptNs.PullAccessorSymbol = js.native
  def getGetterAndSetterFunction(
    funcDecl: typings.typescriptDashServices.TypeScriptNs.AST,
    semanticInfoChain: typings.typescriptDashServices.TypeScriptNs.SemanticInfoChain
  ): Anon_Getter = js.native
  def getRootType(`type`: typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol): typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol = js.native
  def getSignatureForFuncDecl(functionDecl: typings.typescriptDashServices.TypeScriptNs.PullDecl): Anon_AllSignatures = js.native
  def isExportedSymbolInClodule(symbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol): Boolean = js.native
  def isNameNumeric(name: String): Boolean = js.native
  def isSymbolDeclaredInScopeChain(
    symbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol,
    scopeSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol
  ): Boolean = js.native
  def isSymbolLocal(symbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol): Boolean = js.native
  def resolveDeclaredSymbolToUseType(symbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol): Unit = js.native
  def symbolIsEnum(source: typings.typescriptDashServices.TypeScriptNs.PullSymbol): Boolean = js.native
  def symbolIsModule(symbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol): Boolean = js.native
  def typeSymbolsAreIdentical(
    a: typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol,
    b: typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol
  ): Boolean = js.native
  def walkPullTypeSymbolStructure(
    typeSymbol: typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol,
    walker: PullTypeSymbolStructureWalker
  ): Unit = js.native
}

