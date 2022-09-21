package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullSymbolBinder")
@js.native
open class PullSymbolBinder protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PullSymbolBinder {
  def this(semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain) = this()
  
  /* private */ /* CompleteClass */
  override def bindAllDeclsToPullSymbol(askedDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindCallSignatureDeclarationToPullSymbol(callSignatureDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindCatchVariableToPullSymbol(variableDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindClassDeclarationToPullSymbol(classDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindConstructSignatureDeclarationToPullSymbol(constructSignatureDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindConstructorDeclarationToPullSymbol(constructorDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindConstructorTypeDeclarationToPullSymbol(constructorTypeDeclaration: Any): Any = js.native
  
  /* CompleteClass */
  override def bindDeclToPullSymbol(decl: typings.typescriptServices.TypeScript.PullDecl): Unit = js.native
  
  /* private */ /* CompleteClass */
  override def bindEnumDeclarationToPullSymbol(enumContainerDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindEnumIndexerDeclsToPullSymbols(enumContainerSymbol: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindEnumMemberDeclarationToPullSymbol(propertyDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindFunctionDeclarationToPullSymbol(functionDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindFunctionExpressionToPullSymbol(functionExpressionDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindFunctionTypeDeclarationToPullSymbol(functionTypeDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindGetAccessorDeclarationToPullSymbol(getAccessorDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindImportDeclaration(importDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindIndexSignatureDeclarationToPullSymbol(indexSignatureDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindInterfaceDeclarationToPullSymbol(interfaceDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindMethodDeclarationToPullSymbol(methodDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindModuleDeclarationToPullSymbol(moduleContainerDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindObjectTypeDeclarationToPullSymbol(objectDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindParameterSymbols(functionDeclaration: Any, parameterList: Any, funcType: Any, signatureSymbol: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindPropertyDeclarationToPullSymbol(propertyDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindSetAccessorDeclarationToPullSymbol(setAccessorDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindSingleDeclToPullSymbol(decl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindStaticPrototypePropertyOfClass(classAST: Any, classTypeSymbol: Any, constructorTypeSymbol: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def bindVariableDeclarationToPullSymbol(variableDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def checkThatExportsMatch(decl: Any, prevSymbol: Any, reportError: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var declsBeingBound: Any = js.native
  
  /* private */ /* CompleteClass */
  override def ensurePriorDeclarationsAreBound(container: Any, currentDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def findDeclsInContext(startingDecl: Any, declKind: Any, searchGlobally: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def findExistingVariableSymbolForModuleValueDecl(decl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getDeclsToBind(decl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getExistingSymbol(decl: Any, searchKind: Any, parent: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList(signature: Any, currentSignatures: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getParent(decl: Any, returnInstanceType: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var inBindingOtherDeclsWalker: Any = js.native
  
  /* private */ /* CompleteClass */
  var semanticInfoChain: Any = js.native
  
  /* private */ /* CompleteClass */
  override def shouldBindDeclaration(decl: Any): Any = js.native
}
