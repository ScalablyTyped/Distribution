package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullSymbolBinder extends StObject {
  
  /* private */ def bindAllDeclsToPullSymbol(askedDecl: js.Any): js.Any
  
  /* private */ def bindCallSignatureDeclarationToPullSymbol(callSignatureDeclaration: js.Any): js.Any
  
  /* private */ def bindCatchVariableToPullSymbol(variableDeclaration: js.Any): js.Any
  
  /* private */ def bindClassDeclarationToPullSymbol(classDecl: js.Any): js.Any
  
  /* private */ def bindConstructSignatureDeclarationToPullSymbol(constructSignatureDeclaration: js.Any): js.Any
  
  /* private */ def bindConstructorDeclarationToPullSymbol(constructorDeclaration: js.Any): js.Any
  
  /* private */ def bindConstructorTypeDeclarationToPullSymbol(constructorTypeDeclaration: js.Any): js.Any
  
  def bindDeclToPullSymbol(decl: PullDecl): Unit
  
  /* private */ def bindEnumDeclarationToPullSymbol(enumContainerDecl: js.Any): js.Any
  
  /* private */ def bindEnumIndexerDeclsToPullSymbols(enumContainerSymbol: js.Any): js.Any
  
  /* private */ def bindEnumMemberDeclarationToPullSymbol(propertyDeclaration: js.Any): js.Any
  
  /* private */ def bindFunctionDeclarationToPullSymbol(functionDeclaration: js.Any): js.Any
  
  /* private */ def bindFunctionExpressionToPullSymbol(functionExpressionDeclaration: js.Any): js.Any
  
  /* private */ def bindFunctionTypeDeclarationToPullSymbol(functionTypeDeclaration: js.Any): js.Any
  
  /* private */ def bindGetAccessorDeclarationToPullSymbol(getAccessorDeclaration: js.Any): js.Any
  
  /* private */ def bindImportDeclaration(importDeclaration: js.Any): js.Any
  
  /* private */ def bindIndexSignatureDeclarationToPullSymbol(indexSignatureDeclaration: js.Any): js.Any
  
  /* private */ def bindInterfaceDeclarationToPullSymbol(interfaceDecl: js.Any): js.Any
  
  /* private */ def bindMethodDeclarationToPullSymbol(methodDeclaration: js.Any): js.Any
  
  /* private */ def bindModuleDeclarationToPullSymbol(moduleContainerDecl: js.Any): js.Any
  
  /* private */ def bindObjectTypeDeclarationToPullSymbol(objectDecl: js.Any): js.Any
  
  /* private */ def bindParameterSymbols(functionDeclaration: js.Any, parameterList: js.Any, funcType: js.Any, signatureSymbol: js.Any): js.Any
  
  /* private */ def bindPropertyDeclarationToPullSymbol(propertyDeclaration: js.Any): js.Any
  
  /* private */ def bindSetAccessorDeclarationToPullSymbol(setAccessorDeclaration: js.Any): js.Any
  
  /* private */ def bindSingleDeclToPullSymbol(decl: js.Any): js.Any
  
  /* private */ def bindStaticPrototypePropertyOfClass(classAST: js.Any, classTypeSymbol: js.Any, constructorTypeSymbol: js.Any): js.Any
  
  /* private */ def bindVariableDeclarationToPullSymbol(variableDeclaration: js.Any): js.Any
  
  /* private */ def checkThatExportsMatch(decl: js.Any, prevSymbol: js.Any, reportError: js.Any): js.Any
  
  var declsBeingBound: js.Any
  
  /* private */ def ensurePriorDeclarationsAreBound(container: js.Any, currentDecl: js.Any): js.Any
  
  /* private */ def findDeclsInContext(startingDecl: js.Any, declKind: js.Any, searchGlobally: js.Any): js.Any
  
  /* private */ def findExistingVariableSymbolForModuleValueDecl(decl: js.Any): js.Any
  
  /* private */ def getDeclsToBind(decl: js.Any): js.Any
  
  /* private */ def getExistingSymbol(decl: js.Any, searchKind: js.Any, parent: js.Any): js.Any
  
  /* private */ def getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList(signature: js.Any, currentSignatures: js.Any): js.Any
  
  /* private */ def getParent(decl: js.Any, returnInstanceType: js.Any): js.Any
  
  var inBindingOtherDeclsWalker: js.Any
  
  var semanticInfoChain: js.Any
  
  /* private */ def shouldBindDeclaration(decl: js.Any): js.Any
}
object PullSymbolBinder {
  
  @scala.inline
  def apply(
    bindAllDeclsToPullSymbol: js.Any => js.Any,
    bindCallSignatureDeclarationToPullSymbol: js.Any => js.Any,
    bindCatchVariableToPullSymbol: js.Any => js.Any,
    bindClassDeclarationToPullSymbol: js.Any => js.Any,
    bindConstructSignatureDeclarationToPullSymbol: js.Any => js.Any,
    bindConstructorDeclarationToPullSymbol: js.Any => js.Any,
    bindConstructorTypeDeclarationToPullSymbol: js.Any => js.Any,
    bindDeclToPullSymbol: PullDecl => Unit,
    bindEnumDeclarationToPullSymbol: js.Any => js.Any,
    bindEnumIndexerDeclsToPullSymbols: js.Any => js.Any,
    bindEnumMemberDeclarationToPullSymbol: js.Any => js.Any,
    bindFunctionDeclarationToPullSymbol: js.Any => js.Any,
    bindFunctionExpressionToPullSymbol: js.Any => js.Any,
    bindFunctionTypeDeclarationToPullSymbol: js.Any => js.Any,
    bindGetAccessorDeclarationToPullSymbol: js.Any => js.Any,
    bindImportDeclaration: js.Any => js.Any,
    bindIndexSignatureDeclarationToPullSymbol: js.Any => js.Any,
    bindInterfaceDeclarationToPullSymbol: js.Any => js.Any,
    bindMethodDeclarationToPullSymbol: js.Any => js.Any,
    bindModuleDeclarationToPullSymbol: js.Any => js.Any,
    bindObjectTypeDeclarationToPullSymbol: js.Any => js.Any,
    bindParameterSymbols: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    bindPropertyDeclarationToPullSymbol: js.Any => js.Any,
    bindSetAccessorDeclarationToPullSymbol: js.Any => js.Any,
    bindSingleDeclToPullSymbol: js.Any => js.Any,
    bindStaticPrototypePropertyOfClass: (js.Any, js.Any, js.Any) => js.Any,
    bindVariableDeclarationToPullSymbol: js.Any => js.Any,
    checkThatExportsMatch: (js.Any, js.Any, js.Any) => js.Any,
    declsBeingBound: js.Any,
    ensurePriorDeclarationsAreBound: (js.Any, js.Any) => js.Any,
    findDeclsInContext: (js.Any, js.Any, js.Any) => js.Any,
    findExistingVariableSymbolForModuleValueDecl: js.Any => js.Any,
    getDeclsToBind: js.Any => js.Any,
    getExistingSymbol: (js.Any, js.Any, js.Any) => js.Any,
    getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList: (js.Any, js.Any) => js.Any,
    getParent: (js.Any, js.Any) => js.Any,
    inBindingOtherDeclsWalker: js.Any,
    semanticInfoChain: js.Any,
    shouldBindDeclaration: js.Any => js.Any
  ): PullSymbolBinder = {
    val __obj = js.Dynamic.literal(bindAllDeclsToPullSymbol = js.Any.fromFunction1(bindAllDeclsToPullSymbol), bindCallSignatureDeclarationToPullSymbol = js.Any.fromFunction1(bindCallSignatureDeclarationToPullSymbol), bindCatchVariableToPullSymbol = js.Any.fromFunction1(bindCatchVariableToPullSymbol), bindClassDeclarationToPullSymbol = js.Any.fromFunction1(bindClassDeclarationToPullSymbol), bindConstructSignatureDeclarationToPullSymbol = js.Any.fromFunction1(bindConstructSignatureDeclarationToPullSymbol), bindConstructorDeclarationToPullSymbol = js.Any.fromFunction1(bindConstructorDeclarationToPullSymbol), bindConstructorTypeDeclarationToPullSymbol = js.Any.fromFunction1(bindConstructorTypeDeclarationToPullSymbol), bindDeclToPullSymbol = js.Any.fromFunction1(bindDeclToPullSymbol), bindEnumDeclarationToPullSymbol = js.Any.fromFunction1(bindEnumDeclarationToPullSymbol), bindEnumIndexerDeclsToPullSymbols = js.Any.fromFunction1(bindEnumIndexerDeclsToPullSymbols), bindEnumMemberDeclarationToPullSymbol = js.Any.fromFunction1(bindEnumMemberDeclarationToPullSymbol), bindFunctionDeclarationToPullSymbol = js.Any.fromFunction1(bindFunctionDeclarationToPullSymbol), bindFunctionExpressionToPullSymbol = js.Any.fromFunction1(bindFunctionExpressionToPullSymbol), bindFunctionTypeDeclarationToPullSymbol = js.Any.fromFunction1(bindFunctionTypeDeclarationToPullSymbol), bindGetAccessorDeclarationToPullSymbol = js.Any.fromFunction1(bindGetAccessorDeclarationToPullSymbol), bindImportDeclaration = js.Any.fromFunction1(bindImportDeclaration), bindIndexSignatureDeclarationToPullSymbol = js.Any.fromFunction1(bindIndexSignatureDeclarationToPullSymbol), bindInterfaceDeclarationToPullSymbol = js.Any.fromFunction1(bindInterfaceDeclarationToPullSymbol), bindMethodDeclarationToPullSymbol = js.Any.fromFunction1(bindMethodDeclarationToPullSymbol), bindModuleDeclarationToPullSymbol = js.Any.fromFunction1(bindModuleDeclarationToPullSymbol), bindObjectTypeDeclarationToPullSymbol = js.Any.fromFunction1(bindObjectTypeDeclarationToPullSymbol), bindParameterSymbols = js.Any.fromFunction4(bindParameterSymbols), bindPropertyDeclarationToPullSymbol = js.Any.fromFunction1(bindPropertyDeclarationToPullSymbol), bindSetAccessorDeclarationToPullSymbol = js.Any.fromFunction1(bindSetAccessorDeclarationToPullSymbol), bindSingleDeclToPullSymbol = js.Any.fromFunction1(bindSingleDeclToPullSymbol), bindStaticPrototypePropertyOfClass = js.Any.fromFunction3(bindStaticPrototypePropertyOfClass), bindVariableDeclarationToPullSymbol = js.Any.fromFunction1(bindVariableDeclarationToPullSymbol), checkThatExportsMatch = js.Any.fromFunction3(checkThatExportsMatch), declsBeingBound = declsBeingBound.asInstanceOf[js.Any], ensurePriorDeclarationsAreBound = js.Any.fromFunction2(ensurePriorDeclarationsAreBound), findDeclsInContext = js.Any.fromFunction3(findDeclsInContext), findExistingVariableSymbolForModuleValueDecl = js.Any.fromFunction1(findExistingVariableSymbolForModuleValueDecl), getDeclsToBind = js.Any.fromFunction1(getDeclsToBind), getExistingSymbol = js.Any.fromFunction3(getExistingSymbol), getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList = js.Any.fromFunction2(getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList), getParent = js.Any.fromFunction2(getParent), inBindingOtherDeclsWalker = inBindingOtherDeclsWalker.asInstanceOf[js.Any], semanticInfoChain = semanticInfoChain.asInstanceOf[js.Any], shouldBindDeclaration = js.Any.fromFunction1(shouldBindDeclaration))
    __obj.asInstanceOf[PullSymbolBinder]
  }
  
  @scala.inline
  implicit class PullSymbolBinderMutableBuilder[Self <: PullSymbolBinder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindAllDeclsToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindAllDeclsToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindCallSignatureDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindCallSignatureDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindCatchVariableToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindCatchVariableToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindClassDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindClassDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindConstructSignatureDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindConstructSignatureDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindConstructorDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindConstructorDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindConstructorTypeDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindConstructorTypeDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindDeclToPullSymbol(value: PullDecl => Unit): Self = StObject.set(x, "bindDeclToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindEnumDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindEnumDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindEnumIndexerDeclsToPullSymbols(value: js.Any => js.Any): Self = StObject.set(x, "bindEnumIndexerDeclsToPullSymbols", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindEnumMemberDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindEnumMemberDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindFunctionDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindFunctionDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindFunctionExpressionToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindFunctionExpressionToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindFunctionTypeDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindFunctionTypeDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindGetAccessorDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindGetAccessorDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindImportDeclaration(value: js.Any => js.Any): Self = StObject.set(x, "bindImportDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindIndexSignatureDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindIndexSignatureDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindInterfaceDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindInterfaceDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindMethodDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindMethodDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindModuleDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindModuleDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindObjectTypeDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindObjectTypeDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindParameterSymbols(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "bindParameterSymbols", js.Any.fromFunction4(value))
    
    @scala.inline
    def setBindPropertyDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindPropertyDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindSetAccessorDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindSetAccessorDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindSingleDeclToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindSingleDeclToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindStaticPrototypePropertyOfClass(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "bindStaticPrototypePropertyOfClass", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBindVariableDeclarationToPullSymbol(value: js.Any => js.Any): Self = StObject.set(x, "bindVariableDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckThatExportsMatch(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "checkThatExportsMatch", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDeclsBeingBound(value: js.Any): Self = StObject.set(x, "declsBeingBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnsurePriorDeclarationsAreBound(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "ensurePriorDeclarationsAreBound", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindDeclsInContext(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "findDeclsInContext", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFindExistingVariableSymbolForModuleValueDecl(value: js.Any => js.Any): Self = StObject.set(x, "findExistingVariableSymbolForModuleValueDecl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDeclsToBind(value: js.Any => js.Any): Self = StObject.set(x, "getDeclsToBind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetExistingSymbol(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "getExistingSymbol", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetParent(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "getParent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInBindingOtherDeclsWalker(value: js.Any): Self = StObject.set(x, "inBindingOtherDeclsWalker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticInfoChain(value: js.Any): Self = StObject.set(x, "semanticInfoChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldBindDeclaration(value: js.Any => js.Any): Self = StObject.set(x, "shouldBindDeclaration", js.Any.fromFunction1(value))
  }
}
