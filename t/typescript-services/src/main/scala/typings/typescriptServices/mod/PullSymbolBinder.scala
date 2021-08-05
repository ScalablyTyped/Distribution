package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullSymbolBinder")
@js.native
class PullSymbolBinder protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PullSymbolBinder {
  def this(semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain) = this()
  
  /* private */ /* CompleteClass */
  override def bindAllDeclsToPullSymbol(askedDecl: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindCallSignatureDeclarationToPullSymbol(callSignatureDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindCatchVariableToPullSymbol(variableDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindClassDeclarationToPullSymbol(classDecl: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindConstructSignatureDeclarationToPullSymbol(constructSignatureDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindConstructorDeclarationToPullSymbol(constructorDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindConstructorTypeDeclarationToPullSymbol(constructorTypeDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def bindDeclToPullSymbol(decl: typings.typescriptServices.TypeScript.PullDecl): Unit = js.native
  
  /* private */ /* CompleteClass */
  override def bindEnumDeclarationToPullSymbol(enumContainerDecl: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindEnumIndexerDeclsToPullSymbols(enumContainerSymbol: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindEnumMemberDeclarationToPullSymbol(propertyDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindFunctionDeclarationToPullSymbol(functionDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindFunctionExpressionToPullSymbol(functionExpressionDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindFunctionTypeDeclarationToPullSymbol(functionTypeDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindGetAccessorDeclarationToPullSymbol(getAccessorDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindImportDeclaration(importDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindIndexSignatureDeclarationToPullSymbol(indexSignatureDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindInterfaceDeclarationToPullSymbol(interfaceDecl: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindMethodDeclarationToPullSymbol(methodDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindModuleDeclarationToPullSymbol(moduleContainerDecl: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindObjectTypeDeclarationToPullSymbol(objectDecl: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindParameterSymbols(functionDeclaration: js.Any, parameterList: js.Any, funcType: js.Any, signatureSymbol: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindPropertyDeclarationToPullSymbol(propertyDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindSetAccessorDeclarationToPullSymbol(setAccessorDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindSingleDeclToPullSymbol(decl: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindStaticPrototypePropertyOfClass(classAST: js.Any, classTypeSymbol: js.Any, constructorTypeSymbol: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindVariableDeclarationToPullSymbol(variableDeclaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def checkThatExportsMatch(decl: js.Any, prevSymbol: js.Any, reportError: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  var declsBeingBound: js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def ensurePriorDeclarationsAreBound(container: js.Any, currentDecl: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def findDeclsInContext(startingDecl: js.Any, declKind: js.Any, searchGlobally: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def findExistingVariableSymbolForModuleValueDecl(decl: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getDeclsToBind(decl: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getExistingSymbol(decl: js.Any, searchKind: js.Any, parent: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList(signature: js.Any, currentSignatures: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getParent(decl: js.Any, returnInstanceType: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  var inBindingOtherDeclsWalker: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var semanticInfoChain: js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def shouldBindDeclaration(decl: js.Any): js.Any = js.native
}
