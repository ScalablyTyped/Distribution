package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullSymbolBinder")
@js.native
class PullSymbolBinder protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PullSymbolBinder {
  def this(semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain) = this()
  
  /* CompleteClass */
  /* private */ override def bindAllDeclsToPullSymbol(askedDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindCallSignatureDeclarationToPullSymbol(callSignatureDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindCatchVariableToPullSymbol(variableDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindClassDeclarationToPullSymbol(classDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindConstructSignatureDeclarationToPullSymbol(constructSignatureDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindConstructorDeclarationToPullSymbol(constructorDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindConstructorTypeDeclarationToPullSymbol(constructorTypeDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def bindDeclToPullSymbol(decl: typings.typescriptServices.TypeScript.PullDecl): Unit = js.native
  
  /* CompleteClass */
  /* private */ override def bindEnumDeclarationToPullSymbol(enumContainerDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindEnumIndexerDeclsToPullSymbols(enumContainerSymbol: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindEnumMemberDeclarationToPullSymbol(propertyDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindFunctionDeclarationToPullSymbol(functionDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindFunctionExpressionToPullSymbol(functionExpressionDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindFunctionTypeDeclarationToPullSymbol(functionTypeDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindGetAccessorDeclarationToPullSymbol(getAccessorDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindImportDeclaration(importDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindIndexSignatureDeclarationToPullSymbol(indexSignatureDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindInterfaceDeclarationToPullSymbol(interfaceDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindMethodDeclarationToPullSymbol(methodDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindModuleDeclarationToPullSymbol(moduleContainerDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindObjectTypeDeclarationToPullSymbol(objectDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindParameterSymbols(functionDeclaration: js.Any, parameterList: js.Any, funcType: js.Any, signatureSymbol: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindPropertyDeclarationToPullSymbol(propertyDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindSetAccessorDeclarationToPullSymbol(setAccessorDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindSingleDeclToPullSymbol(decl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindStaticPrototypePropertyOfClass(classAST: js.Any, classTypeSymbol: js.Any, constructorTypeSymbol: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def bindVariableDeclarationToPullSymbol(variableDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def checkThatExportsMatch(decl: js.Any, prevSymbol: js.Any, reportError: js.Any): js.Any = js.native
  
  /* CompleteClass */
  var declsBeingBound: js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def ensurePriorDeclarationsAreBound(container: js.Any, currentDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def findDeclsInContext(startingDecl: js.Any, declKind: js.Any, searchGlobally: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def findExistingVariableSymbolForModuleValueDecl(decl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def getDeclsToBind(decl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def getExistingSymbol(decl: js.Any, searchKind: js.Any, parent: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList(signature: js.Any, currentSignatures: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def getParent(decl: js.Any, returnInstanceType: js.Any): js.Any = js.native
  
  /* CompleteClass */
  var inBindingOtherDeclsWalker: js.Any = js.native
  
  /* CompleteClass */
  var semanticInfoChain: js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def shouldBindDeclaration(decl: js.Any): js.Any = js.native
}
