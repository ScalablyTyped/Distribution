package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.PullHelpers.PullTypeSymbolStructureWalker
import typings.typescriptServices.anon.AllSignatures
import typings.typescriptServices.anon.Getter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullHelpers {
  
  @JSGlobal("TypeScript.PullHelpers.OtherPullDeclsWalker")
  @js.native
  class OtherPullDeclsWalker ()
    extends typings.typescriptServices.TypeScript.PullHelpers.OtherPullDeclsWalker
  
  @JSGlobal("TypeScript.PullHelpers.diagnosticFromDecl")
  @js.native
  def diagnosticFromDecl(decl: typings.typescriptServices.TypeScript.PullDecl, diagnosticKey: String): typings.typescriptServices.TypeScript.Diagnostic = js.native
  @JSGlobal("TypeScript.PullHelpers.diagnosticFromDecl")
  @js.native
  def diagnosticFromDecl(
    decl: typings.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.UndefOr[scala.Nothing],
    additionalLocations: js.Array[typings.typescriptServices.TypeScript.Location]
  ): typings.typescriptServices.TypeScript.Diagnostic = js.native
  @JSGlobal("TypeScript.PullHelpers.diagnosticFromDecl")
  @js.native
  def diagnosticFromDecl(
    decl: typings.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ): typings.typescriptServices.TypeScript.Diagnostic = js.native
  @JSGlobal("TypeScript.PullHelpers.diagnosticFromDecl")
  @js.native
  def diagnosticFromDecl(
    decl: typings.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typings.typescriptServices.TypeScript.Location]
  ): typings.typescriptServices.TypeScript.Diagnostic = js.native
  
  @JSGlobal("TypeScript.PullHelpers.getAccessorSymbol")
  @js.native
  def getAccessorSymbol(
    getterOrSetter: typings.typescriptServices.TypeScript.AST,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain
  ): typings.typescriptServices.TypeScript.PullAccessorSymbol = js.native
  
  @JSGlobal("TypeScript.PullHelpers.getGetterAndSetterFunction")
  @js.native
  def getGetterAndSetterFunction(
    funcDecl: typings.typescriptServices.TypeScript.AST,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain
  ): Getter = js.native
  
  @JSGlobal("TypeScript.PullHelpers.getRootType")
  @js.native
  def getRootType(`type`: typings.typescriptServices.TypeScript.PullTypeSymbol): typings.typescriptServices.TypeScript.PullTypeSymbol = js.native
  
  @JSGlobal("TypeScript.PullHelpers.getSignatureForFuncDecl")
  @js.native
  def getSignatureForFuncDecl(functionDecl: typings.typescriptServices.TypeScript.PullDecl): AllSignatures = js.native
  
  @JSGlobal("TypeScript.PullHelpers.isExportedSymbolInClodule")
  @js.native
  def isExportedSymbolInClodule(symbol: typings.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  
  @JSGlobal("TypeScript.PullHelpers.isNameNumeric")
  @js.native
  def isNameNumeric(name: String): Boolean = js.native
  
  @JSGlobal("TypeScript.PullHelpers.isSymbolDeclaredInScopeChain")
  @js.native
  def isSymbolDeclaredInScopeChain(
    symbol: typings.typescriptServices.TypeScript.PullSymbol,
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol
  ): Boolean = js.native
  
  @JSGlobal("TypeScript.PullHelpers.isSymbolLocal")
  @js.native
  def isSymbolLocal(symbol: typings.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  
  @JSGlobal("TypeScript.PullHelpers.resolveDeclaredSymbolToUseType")
  @js.native
  def resolveDeclaredSymbolToUseType(symbol: typings.typescriptServices.TypeScript.PullSymbol): Unit = js.native
  
  @JSGlobal("TypeScript.PullHelpers.symbolIsEnum")
  @js.native
  def symbolIsEnum(source: typings.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  
  @JSGlobal("TypeScript.PullHelpers.symbolIsModule")
  @js.native
  def symbolIsModule(symbol: typings.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  
  @JSGlobal("TypeScript.PullHelpers.typeSymbolsAreIdentical")
  @js.native
  def typeSymbolsAreIdentical(
    a: typings.typescriptServices.TypeScript.PullTypeSymbol,
    b: typings.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  
  @JSGlobal("TypeScript.PullHelpers.walkPullTypeSymbolStructure")
  @js.native
  def walkPullTypeSymbolStructure(
    typeSymbol: typings.typescriptServices.TypeScript.PullTypeSymbol,
    walker: PullTypeSymbolStructureWalker
  ): Unit = js.native
}
