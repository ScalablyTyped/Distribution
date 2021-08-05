package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.PullHelpers.PullTypeSymbolStructureWalker
import typings.typescriptServices.anon.AllSignatures
import typings.typescriptServices.anon.Getter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullHelpers {
  
  @JSImport("typescript-services", "PullHelpers")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typescript-services", "PullHelpers.OtherPullDeclsWalker")
  @js.native
  class OtherPullDeclsWalker ()
    extends StObject
       with typings.typescriptServices.TypeScript.PullHelpers.OtherPullDeclsWalker {
    
    /* private */ /* CompleteClass */
    var currentlyWalkingOtherDecls: js.Any = js.native
    
    /* CompleteClass */
    override def walkOtherPullDecls(
      currentDecl: typings.typescriptServices.TypeScript.PullDecl,
      otherDecls: js.Array[typings.typescriptServices.TypeScript.PullDecl],
      callBack: js.Function1[/* otherDecl */ typings.typescriptServices.TypeScript.PullDecl, Unit]
    ): Unit = js.native
  }
  
  inline def diagnosticFromDecl(decl: typings.typescriptServices.TypeScript.PullDecl, diagnosticKey: String): typings.typescriptServices.TypeScript.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnosticFromDecl")(decl.asInstanceOf[js.Any], diagnosticKey.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Diagnostic]
  inline def diagnosticFromDecl(
    decl: typings.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[js.Any]
  ): typings.typescriptServices.TypeScript.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnosticFromDecl")(decl.asInstanceOf[js.Any], diagnosticKey.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Diagnostic]
  inline def diagnosticFromDecl(
    decl: typings.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[js.Any],
    additionalLocations: js.Array[typings.typescriptServices.TypeScript.Location]
  ): typings.typescriptServices.TypeScript.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnosticFromDecl")(decl.asInstanceOf[js.Any], diagnosticKey.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any], additionalLocations.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Diagnostic]
  inline def diagnosticFromDecl(
    decl: typings.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: Unit,
    additionalLocations: js.Array[typings.typescriptServices.TypeScript.Location]
  ): typings.typescriptServices.TypeScript.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnosticFromDecl")(decl.asInstanceOf[js.Any], diagnosticKey.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any], additionalLocations.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Diagnostic]
  
  inline def getAccessorSymbol(
    getterOrSetter: typings.typescriptServices.TypeScript.AST,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain
  ): typings.typescriptServices.TypeScript.PullAccessorSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("getAccessorSymbol")(getterOrSetter.asInstanceOf[js.Any], semanticInfoChain.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.PullAccessorSymbol]
  
  inline def getGetterAndSetterFunction(
    funcDecl: typings.typescriptServices.TypeScript.AST,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain
  ): Getter = (^.asInstanceOf[js.Dynamic].applyDynamic("getGetterAndSetterFunction")(funcDecl.asInstanceOf[js.Any], semanticInfoChain.asInstanceOf[js.Any])).asInstanceOf[Getter]
  
  inline def getRootType(`type`: typings.typescriptServices.TypeScript.PullTypeSymbol): typings.typescriptServices.TypeScript.PullTypeSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootType")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.PullTypeSymbol]
  
  inline def getSignatureForFuncDecl(functionDecl: typings.typescriptServices.TypeScript.PullDecl): AllSignatures = ^.asInstanceOf[js.Dynamic].applyDynamic("getSignatureForFuncDecl")(functionDecl.asInstanceOf[js.Any]).asInstanceOf[AllSignatures]
  
  inline def isExportedSymbolInClodule(symbol: typings.typescriptServices.TypeScript.PullSymbol): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportedSymbolInClodule")(symbol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNameNumeric(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNameNumeric")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSymbolDeclaredInScopeChain(
    symbol: typings.typescriptServices.TypeScript.PullSymbol,
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolDeclaredInScopeChain")(symbol.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSymbolLocal(symbol: typings.typescriptServices.TypeScript.PullSymbol): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolLocal")(symbol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resolveDeclaredSymbolToUseType(symbol: typings.typescriptServices.TypeScript.PullSymbol): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDeclaredSymbolToUseType")(symbol.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def symbolIsEnum(source: typings.typescriptServices.TypeScript.PullSymbol): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("symbolIsEnum")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def symbolIsModule(symbol: typings.typescriptServices.TypeScript.PullSymbol): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("symbolIsModule")(symbol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def typeSymbolsAreIdentical(
    a: typings.typescriptServices.TypeScript.PullTypeSymbol,
    b: typings.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("typeSymbolsAreIdentical")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def walkPullTypeSymbolStructure(
    typeSymbol: typings.typescriptServices.TypeScript.PullTypeSymbol,
    walker: PullTypeSymbolStructureWalker
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPullTypeSymbolStructure")(typeSymbol.asInstanceOf[js.Any], walker.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
