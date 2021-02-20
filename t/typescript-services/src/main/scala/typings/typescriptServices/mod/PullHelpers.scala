package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.PullHelpers.PullTypeSymbolStructureWalker
import typings.typescriptServices.anon.AllSignatures
import typings.typescriptServices.anon.Getter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullHelpers {
  
  @JSImport("typescript-services", "PullHelpers.OtherPullDeclsWalker")
  @js.native
  class OtherPullDeclsWalker ()
    extends typings.typescriptServices.TypeScript.PullHelpers.OtherPullDeclsWalker
  
  @JSImport("typescript-services", "PullHelpers.diagnosticFromDecl")
  @js.native
  def diagnosticFromDecl(decl: typings.typescriptServices.TypeScript.PullDecl, diagnosticKey: String): typings.typescriptServices.TypeScript.Diagnostic = js.native
  @JSImport("typescript-services", "PullHelpers.diagnosticFromDecl")
  @js.native
  def diagnosticFromDecl(
    decl: typings.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.UndefOr[scala.Nothing],
    additionalLocations: js.Array[typings.typescriptServices.TypeScript.Location]
  ): typings.typescriptServices.TypeScript.Diagnostic = js.native
  @JSImport("typescript-services", "PullHelpers.diagnosticFromDecl")
  @js.native
  def diagnosticFromDecl(
    decl: typings.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ): typings.typescriptServices.TypeScript.Diagnostic = js.native
  @JSImport("typescript-services", "PullHelpers.diagnosticFromDecl")
  @js.native
  def diagnosticFromDecl(
    decl: typings.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typings.typescriptServices.TypeScript.Location]
  ): typings.typescriptServices.TypeScript.Diagnostic = js.native
  
  @JSImport("typescript-services", "PullHelpers.getAccessorSymbol")
  @js.native
  def getAccessorSymbol(
    getterOrSetter: typings.typescriptServices.TypeScript.AST,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain
  ): typings.typescriptServices.TypeScript.PullAccessorSymbol = js.native
  
  @JSImport("typescript-services", "PullHelpers.getGetterAndSetterFunction")
  @js.native
  def getGetterAndSetterFunction(
    funcDecl: typings.typescriptServices.TypeScript.AST,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain
  ): Getter = js.native
  
  @JSImport("typescript-services", "PullHelpers.getRootType")
  @js.native
  def getRootType(`type`: typings.typescriptServices.TypeScript.PullTypeSymbol): typings.typescriptServices.TypeScript.PullTypeSymbol = js.native
  
  @JSImport("typescript-services", "PullHelpers.getSignatureForFuncDecl")
  @js.native
  def getSignatureForFuncDecl(functionDecl: typings.typescriptServices.TypeScript.PullDecl): AllSignatures = js.native
  
  @JSImport("typescript-services", "PullHelpers.isExportedSymbolInClodule")
  @js.native
  def isExportedSymbolInClodule(symbol: typings.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  
  @JSImport("typescript-services", "PullHelpers.isNameNumeric")
  @js.native
  def isNameNumeric(name: String): Boolean = js.native
  
  @JSImport("typescript-services", "PullHelpers.isSymbolDeclaredInScopeChain")
  @js.native
  def isSymbolDeclaredInScopeChain(
    symbol: typings.typescriptServices.TypeScript.PullSymbol,
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol
  ): Boolean = js.native
  
  @JSImport("typescript-services", "PullHelpers.isSymbolLocal")
  @js.native
  def isSymbolLocal(symbol: typings.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  
  @JSImport("typescript-services", "PullHelpers.resolveDeclaredSymbolToUseType")
  @js.native
  def resolveDeclaredSymbolToUseType(symbol: typings.typescriptServices.TypeScript.PullSymbol): Unit = js.native
  
  @JSImport("typescript-services", "PullHelpers.symbolIsEnum")
  @js.native
  def symbolIsEnum(source: typings.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  
  @JSImport("typescript-services", "PullHelpers.symbolIsModule")
  @js.native
  def symbolIsModule(symbol: typings.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  
  @JSImport("typescript-services", "PullHelpers.typeSymbolsAreIdentical")
  @js.native
  def typeSymbolsAreIdentical(
    a: typings.typescriptServices.TypeScript.PullTypeSymbol,
    b: typings.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  
  @JSImport("typescript-services", "PullHelpers.walkPullTypeSymbolStructure")
  @js.native
  def walkPullTypeSymbolStructure(
    typeSymbol: typings.typescriptServices.TypeScript.PullTypeSymbol,
    walker: PullTypeSymbolStructureWalker
  ): Unit = js.native
}
