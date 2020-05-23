package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullSymbolBinder extends js.Object {
  var declsBeingBound: js.Any = js.native
  var inBindingOtherDeclsWalker: js.Any = js.native
  var semanticInfoChain: js.Any = js.native
  /* private */ def bindAllDeclsToPullSymbol(askedDecl: js.Any): js.Any = js.native
  /* private */ def bindCallSignatureDeclarationToPullSymbol(callSignatureDeclaration: js.Any): js.Any = js.native
  /* private */ def bindCatchVariableToPullSymbol(variableDeclaration: js.Any): js.Any = js.native
  /* private */ def bindClassDeclarationToPullSymbol(classDecl: js.Any): js.Any = js.native
  /* private */ def bindConstructSignatureDeclarationToPullSymbol(constructSignatureDeclaration: js.Any): js.Any = js.native
  /* private */ def bindConstructorDeclarationToPullSymbol(constructorDeclaration: js.Any): js.Any = js.native
  /* private */ def bindConstructorTypeDeclarationToPullSymbol(constructorTypeDeclaration: js.Any): js.Any = js.native
  def bindDeclToPullSymbol(decl: PullDecl): Unit = js.native
  /* private */ def bindEnumDeclarationToPullSymbol(enumContainerDecl: js.Any): js.Any = js.native
  /* private */ def bindEnumIndexerDeclsToPullSymbols(enumContainerSymbol: js.Any): js.Any = js.native
  /* private */ def bindEnumMemberDeclarationToPullSymbol(propertyDeclaration: js.Any): js.Any = js.native
  /* private */ def bindFunctionDeclarationToPullSymbol(functionDeclaration: js.Any): js.Any = js.native
  /* private */ def bindFunctionExpressionToPullSymbol(functionExpressionDeclaration: js.Any): js.Any = js.native
  /* private */ def bindFunctionTypeDeclarationToPullSymbol(functionTypeDeclaration: js.Any): js.Any = js.native
  /* private */ def bindGetAccessorDeclarationToPullSymbol(getAccessorDeclaration: js.Any): js.Any = js.native
  /* private */ def bindImportDeclaration(importDeclaration: js.Any): js.Any = js.native
  /* private */ def bindIndexSignatureDeclarationToPullSymbol(indexSignatureDeclaration: js.Any): js.Any = js.native
  /* private */ def bindInterfaceDeclarationToPullSymbol(interfaceDecl: js.Any): js.Any = js.native
  /* private */ def bindMethodDeclarationToPullSymbol(methodDeclaration: js.Any): js.Any = js.native
  /* private */ def bindModuleDeclarationToPullSymbol(moduleContainerDecl: js.Any): js.Any = js.native
  /* private */ def bindObjectTypeDeclarationToPullSymbol(objectDecl: js.Any): js.Any = js.native
  /* private */ def bindParameterSymbols(functionDeclaration: js.Any, parameterList: js.Any, funcType: js.Any, signatureSymbol: js.Any): js.Any = js.native
  /* private */ def bindPropertyDeclarationToPullSymbol(propertyDeclaration: js.Any): js.Any = js.native
  /* private */ def bindSetAccessorDeclarationToPullSymbol(setAccessorDeclaration: js.Any): js.Any = js.native
  /* private */ def bindSingleDeclToPullSymbol(decl: js.Any): js.Any = js.native
  /* private */ def bindStaticPrototypePropertyOfClass(classAST: js.Any, classTypeSymbol: js.Any, constructorTypeSymbol: js.Any): js.Any = js.native
  /* private */ def bindVariableDeclarationToPullSymbol(variableDeclaration: js.Any): js.Any = js.native
  /* private */ def checkThatExportsMatch(decl: js.Any, prevSymbol: js.Any): js.Any = js.native
  /* private */ def checkThatExportsMatch(decl: js.Any, prevSymbol: js.Any, reportError: js.Any): js.Any = js.native
  /* private */ def ensurePriorDeclarationsAreBound(container: js.Any, currentDecl: js.Any): js.Any = js.native
  /* private */ def findDeclsInContext(startingDecl: js.Any, declKind: js.Any, searchGlobally: js.Any): js.Any = js.native
  /* private */ def findExistingVariableSymbolForModuleValueDecl(decl: js.Any): js.Any = js.native
  /* private */ def getDeclsToBind(decl: js.Any): js.Any = js.native
  /* private */ def getExistingSymbol(decl: js.Any, searchKind: js.Any, parent: js.Any): js.Any = js.native
  /* private */ def getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList(signature: js.Any, currentSignatures: js.Any): js.Any = js.native
  /* private */ def getParent(decl: js.Any): js.Any = js.native
  /* private */ def getParent(decl: js.Any, returnInstanceType: js.Any): js.Any = js.native
  /* private */ def shouldBindDeclaration(decl: js.Any): js.Any = js.native
}

