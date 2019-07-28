package typings.typescriptDashServices.TypeScriptNs.PullHelpersNs

import typings.typescriptDashServices.Anon_AllSignatures
import typings.typescriptDashServices.Anon_Getter
import typings.typescriptDashServices.TypeScriptNs.AST
import typings.typescriptDashServices.TypeScriptNs.Diagnostic
import typings.typescriptDashServices.TypeScriptNs.Location
import typings.typescriptDashServices.TypeScriptNs.PullAccessorSymbol
import typings.typescriptDashServices.TypeScriptNs.PullDecl
import typings.typescriptDashServices.TypeScriptNs.PullSymbol
import typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol
import typings.typescriptDashServices.TypeScriptNs.SemanticInfoChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullHelpers")
@js.native
object ^ extends js.Object {
  def diagnosticFromDecl(decl: PullDecl, diagnosticKey: String): Diagnostic = js.native
  def diagnosticFromDecl(decl: PullDecl, diagnosticKey: String, _arguments: js.Array[_]): Diagnostic = js.native
  def diagnosticFromDecl(
    decl: PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[Location]
  ): Diagnostic = js.native
  def getAccessorSymbol(getterOrSetter: AST, semanticInfoChain: SemanticInfoChain): PullAccessorSymbol = js.native
  def getGetterAndSetterFunction(funcDecl: AST, semanticInfoChain: SemanticInfoChain): Anon_Getter = js.native
  def getRootType(`type`: PullTypeSymbol): PullTypeSymbol = js.native
  def getSignatureForFuncDecl(functionDecl: PullDecl): Anon_AllSignatures = js.native
  def isExportedSymbolInClodule(symbol: PullSymbol): Boolean = js.native
  def isNameNumeric(name: String): Boolean = js.native
  def isSymbolDeclaredInScopeChain(symbol: PullSymbol, scopeSymbol: PullSymbol): Boolean = js.native
  def isSymbolLocal(symbol: PullSymbol): Boolean = js.native
  def resolveDeclaredSymbolToUseType(symbol: PullSymbol): Unit = js.native
  def symbolIsEnum(source: PullSymbol): Boolean = js.native
  def symbolIsModule(symbol: PullSymbol): Boolean = js.native
  def typeSymbolsAreIdentical(a: PullTypeSymbol, b: PullTypeSymbol): Boolean = js.native
  def walkPullTypeSymbolStructure(typeSymbol: PullTypeSymbol, walker: PullTypeSymbolStructureWalker): Unit = js.native
}

