package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.PullHelpers.PullTypeSymbolStructureWalker
import typings.typescriptServices.anon.AllSignatures
import typings.typescriptServices.anon.Getter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullHelpers")
@js.native
object PullHelpers extends js.Object {
  @js.native
  class OtherPullDeclsWalker ()
    extends typings.typescriptServices.TypeScript.PullHelpers.OtherPullDeclsWalker {
    /* CompleteClass */
    override var currentlyWalkingOtherDecls: js.Any = js.native
    /* CompleteClass */
    override def walkOtherPullDecls(
      currentDecl: typings.typescriptServices.TypeScript.PullDecl,
      otherDecls: js.Array[typings.typescriptServices.TypeScript.PullDecl],
      callBack: js.Function1[/* otherDecl */ typings.typescriptServices.TypeScript.PullDecl, Unit]
    ): Unit = js.native
  }
  
  def diagnosticFromDecl(decl: typings.typescriptServices.TypeScript.PullDecl, diagnosticKey: String): typings.typescriptServices.TypeScript.Diagnostic = js.native
  def diagnosticFromDecl(
    decl: typings.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ): typings.typescriptServices.TypeScript.Diagnostic = js.native
  def diagnosticFromDecl(
    decl: typings.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typings.typescriptServices.TypeScript.Location]
  ): typings.typescriptServices.TypeScript.Diagnostic = js.native
  def getAccessorSymbol(
    getterOrSetter: typings.typescriptServices.TypeScript.AST,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain
  ): typings.typescriptServices.TypeScript.PullAccessorSymbol = js.native
  def getGetterAndSetterFunction(
    funcDecl: typings.typescriptServices.TypeScript.AST,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain
  ): Getter = js.native
  def getRootType(`type`: typings.typescriptServices.TypeScript.PullTypeSymbol): typings.typescriptServices.TypeScript.PullTypeSymbol = js.native
  def getSignatureForFuncDecl(functionDecl: typings.typescriptServices.TypeScript.PullDecl): AllSignatures = js.native
  def isExportedSymbolInClodule(symbol: typings.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  def isNameNumeric(name: String): Boolean = js.native
  def isSymbolDeclaredInScopeChain(
    symbol: typings.typescriptServices.TypeScript.PullSymbol,
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol
  ): Boolean = js.native
  def isSymbolLocal(symbol: typings.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  def resolveDeclaredSymbolToUseType(symbol: typings.typescriptServices.TypeScript.PullSymbol): Unit = js.native
  def symbolIsEnum(source: typings.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  def symbolIsModule(symbol: typings.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  def typeSymbolsAreIdentical(
    a: typings.typescriptServices.TypeScript.PullTypeSymbol,
    b: typings.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  def walkPullTypeSymbolStructure(
    typeSymbol: typings.typescriptServices.TypeScript.PullTypeSymbol,
    walker: PullTypeSymbolStructureWalker
  ): Unit = js.native
}

