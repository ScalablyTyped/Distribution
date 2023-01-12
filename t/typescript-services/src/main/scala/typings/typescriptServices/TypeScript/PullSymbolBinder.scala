package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullSymbolBinder extends StObject {
  
  /* private */ def bindAllDeclsToPullSymbol(askedDecl: Any): Any
  
  /* private */ def bindCallSignatureDeclarationToPullSymbol(callSignatureDeclaration: Any): Any
  
  /* private */ def bindCatchVariableToPullSymbol(variableDeclaration: Any): Any
  
  /* private */ def bindClassDeclarationToPullSymbol(classDecl: Any): Any
  
  /* private */ def bindConstructSignatureDeclarationToPullSymbol(constructSignatureDeclaration: Any): Any
  
  /* private */ def bindConstructorDeclarationToPullSymbol(constructorDeclaration: Any): Any
  
  /* private */ def bindConstructorTypeDeclarationToPullSymbol(constructorTypeDeclaration: Any): Any
  
  def bindDeclToPullSymbol(decl: PullDecl): Unit
  
  /* private */ def bindEnumDeclarationToPullSymbol(enumContainerDecl: Any): Any
  
  /* private */ def bindEnumIndexerDeclsToPullSymbols(enumContainerSymbol: Any): Any
  
  /* private */ def bindEnumMemberDeclarationToPullSymbol(propertyDeclaration: Any): Any
  
  /* private */ def bindFunctionDeclarationToPullSymbol(functionDeclaration: Any): Any
  
  /* private */ def bindFunctionExpressionToPullSymbol(functionExpressionDeclaration: Any): Any
  
  /* private */ def bindFunctionTypeDeclarationToPullSymbol(functionTypeDeclaration: Any): Any
  
  /* private */ def bindGetAccessorDeclarationToPullSymbol(getAccessorDeclaration: Any): Any
  
  /* private */ def bindImportDeclaration(importDeclaration: Any): Any
  
  /* private */ def bindIndexSignatureDeclarationToPullSymbol(indexSignatureDeclaration: Any): Any
  
  /* private */ def bindInterfaceDeclarationToPullSymbol(interfaceDecl: Any): Any
  
  /* private */ def bindMethodDeclarationToPullSymbol(methodDeclaration: Any): Any
  
  /* private */ def bindModuleDeclarationToPullSymbol(moduleContainerDecl: Any): Any
  
  /* private */ def bindObjectTypeDeclarationToPullSymbol(objectDecl: Any): Any
  
  /* private */ def bindParameterSymbols(functionDeclaration: Any, parameterList: Any, funcType: Any, signatureSymbol: Any): Any
  
  /* private */ def bindPropertyDeclarationToPullSymbol(propertyDeclaration: Any): Any
  
  /* private */ def bindSetAccessorDeclarationToPullSymbol(setAccessorDeclaration: Any): Any
  
  /* private */ def bindSingleDeclToPullSymbol(decl: Any): Any
  
  /* private */ def bindStaticPrototypePropertyOfClass(classAST: Any, classTypeSymbol: Any, constructorTypeSymbol: Any): Any
  
  /* private */ def bindVariableDeclarationToPullSymbol(variableDeclaration: Any): Any
  
  /* private */ def checkThatExportsMatch(decl: Any, prevSymbol: Any, reportError: Any): Any
  
  /* private */ var declsBeingBound: Any
  
  /* private */ def ensurePriorDeclarationsAreBound(container: Any, currentDecl: Any): Any
  
  /* private */ def findDeclsInContext(startingDecl: Any, declKind: Any, searchGlobally: Any): Any
  
  /* private */ def findExistingVariableSymbolForModuleValueDecl(decl: Any): Any
  
  /* private */ def getDeclsToBind(decl: Any): Any
  
  /* private */ def getExistingSymbol(decl: Any, searchKind: Any, parent: Any): Any
  
  /* private */ def getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList(signature: Any, currentSignatures: Any): Any
  
  /* private */ def getParent(decl: Any, returnInstanceType: Any): Any
  
  /* private */ var inBindingOtherDeclsWalker: Any
  
  /* private */ var semanticInfoChain: Any
  
  /* private */ def shouldBindDeclaration(decl: Any): Any
}
object PullSymbolBinder {
  
  inline def apply(
    bindAllDeclsToPullSymbol: Any => Any,
    bindCallSignatureDeclarationToPullSymbol: Any => Any,
    bindCatchVariableToPullSymbol: Any => Any,
    bindClassDeclarationToPullSymbol: Any => Any,
    bindConstructSignatureDeclarationToPullSymbol: Any => Any,
    bindConstructorDeclarationToPullSymbol: Any => Any,
    bindConstructorTypeDeclarationToPullSymbol: Any => Any,
    bindDeclToPullSymbol: PullDecl => Unit,
    bindEnumDeclarationToPullSymbol: Any => Any,
    bindEnumIndexerDeclsToPullSymbols: Any => Any,
    bindEnumMemberDeclarationToPullSymbol: Any => Any,
    bindFunctionDeclarationToPullSymbol: Any => Any,
    bindFunctionExpressionToPullSymbol: Any => Any,
    bindFunctionTypeDeclarationToPullSymbol: Any => Any,
    bindGetAccessorDeclarationToPullSymbol: Any => Any,
    bindImportDeclaration: Any => Any,
    bindIndexSignatureDeclarationToPullSymbol: Any => Any,
    bindInterfaceDeclarationToPullSymbol: Any => Any,
    bindMethodDeclarationToPullSymbol: Any => Any,
    bindModuleDeclarationToPullSymbol: Any => Any,
    bindObjectTypeDeclarationToPullSymbol: Any => Any,
    bindParameterSymbols: (Any, Any, Any, Any) => Any,
    bindPropertyDeclarationToPullSymbol: Any => Any,
    bindSetAccessorDeclarationToPullSymbol: Any => Any,
    bindSingleDeclToPullSymbol: Any => Any,
    bindStaticPrototypePropertyOfClass: (Any, Any, Any) => Any,
    bindVariableDeclarationToPullSymbol: Any => Any,
    checkThatExportsMatch: (Any, Any, Any) => Any,
    declsBeingBound: Any,
    ensurePriorDeclarationsAreBound: (Any, Any) => Any,
    findDeclsInContext: (Any, Any, Any) => Any,
    findExistingVariableSymbolForModuleValueDecl: Any => Any,
    getDeclsToBind: Any => Any,
    getExistingSymbol: (Any, Any, Any) => Any,
    getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList: (Any, Any) => Any,
    getParent: (Any, Any) => Any,
    inBindingOtherDeclsWalker: Any,
    semanticInfoChain: Any,
    shouldBindDeclaration: Any => Any
  ): PullSymbolBinder = {
    val __obj = js.Dynamic.literal(bindAllDeclsToPullSymbol = js.Any.fromFunction1(bindAllDeclsToPullSymbol), bindCallSignatureDeclarationToPullSymbol = js.Any.fromFunction1(bindCallSignatureDeclarationToPullSymbol), bindCatchVariableToPullSymbol = js.Any.fromFunction1(bindCatchVariableToPullSymbol), bindClassDeclarationToPullSymbol = js.Any.fromFunction1(bindClassDeclarationToPullSymbol), bindConstructSignatureDeclarationToPullSymbol = js.Any.fromFunction1(bindConstructSignatureDeclarationToPullSymbol), bindConstructorDeclarationToPullSymbol = js.Any.fromFunction1(bindConstructorDeclarationToPullSymbol), bindConstructorTypeDeclarationToPullSymbol = js.Any.fromFunction1(bindConstructorTypeDeclarationToPullSymbol), bindDeclToPullSymbol = js.Any.fromFunction1(bindDeclToPullSymbol), bindEnumDeclarationToPullSymbol = js.Any.fromFunction1(bindEnumDeclarationToPullSymbol), bindEnumIndexerDeclsToPullSymbols = js.Any.fromFunction1(bindEnumIndexerDeclsToPullSymbols), bindEnumMemberDeclarationToPullSymbol = js.Any.fromFunction1(bindEnumMemberDeclarationToPullSymbol), bindFunctionDeclarationToPullSymbol = js.Any.fromFunction1(bindFunctionDeclarationToPullSymbol), bindFunctionExpressionToPullSymbol = js.Any.fromFunction1(bindFunctionExpressionToPullSymbol), bindFunctionTypeDeclarationToPullSymbol = js.Any.fromFunction1(bindFunctionTypeDeclarationToPullSymbol), bindGetAccessorDeclarationToPullSymbol = js.Any.fromFunction1(bindGetAccessorDeclarationToPullSymbol), bindImportDeclaration = js.Any.fromFunction1(bindImportDeclaration), bindIndexSignatureDeclarationToPullSymbol = js.Any.fromFunction1(bindIndexSignatureDeclarationToPullSymbol), bindInterfaceDeclarationToPullSymbol = js.Any.fromFunction1(bindInterfaceDeclarationToPullSymbol), bindMethodDeclarationToPullSymbol = js.Any.fromFunction1(bindMethodDeclarationToPullSymbol), bindModuleDeclarationToPullSymbol = js.Any.fromFunction1(bindModuleDeclarationToPullSymbol), bindObjectTypeDeclarationToPullSymbol = js.Any.fromFunction1(bindObjectTypeDeclarationToPullSymbol), bindParameterSymbols = js.Any.fromFunction4(bindParameterSymbols), bindPropertyDeclarationToPullSymbol = js.Any.fromFunction1(bindPropertyDeclarationToPullSymbol), bindSetAccessorDeclarationToPullSymbol = js.Any.fromFunction1(bindSetAccessorDeclarationToPullSymbol), bindSingleDeclToPullSymbol = js.Any.fromFunction1(bindSingleDeclToPullSymbol), bindStaticPrototypePropertyOfClass = js.Any.fromFunction3(bindStaticPrototypePropertyOfClass), bindVariableDeclarationToPullSymbol = js.Any.fromFunction1(bindVariableDeclarationToPullSymbol), checkThatExportsMatch = js.Any.fromFunction3(checkThatExportsMatch), declsBeingBound = declsBeingBound.asInstanceOf[js.Any], ensurePriorDeclarationsAreBound = js.Any.fromFunction2(ensurePriorDeclarationsAreBound), findDeclsInContext = js.Any.fromFunction3(findDeclsInContext), findExistingVariableSymbolForModuleValueDecl = js.Any.fromFunction1(findExistingVariableSymbolForModuleValueDecl), getDeclsToBind = js.Any.fromFunction1(getDeclsToBind), getExistingSymbol = js.Any.fromFunction3(getExistingSymbol), getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList = js.Any.fromFunction2(getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList), getParent = js.Any.fromFunction2(getParent), inBindingOtherDeclsWalker = inBindingOtherDeclsWalker.asInstanceOf[js.Any], semanticInfoChain = semanticInfoChain.asInstanceOf[js.Any], shouldBindDeclaration = js.Any.fromFunction1(shouldBindDeclaration))
    __obj.asInstanceOf[PullSymbolBinder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PullSymbolBinder] (val x: Self) extends AnyVal {
    
    inline def setBindAllDeclsToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindAllDeclsToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindCallSignatureDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindCallSignatureDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindCatchVariableToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindCatchVariableToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindClassDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindClassDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindConstructSignatureDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindConstructSignatureDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindConstructorDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindConstructorDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindConstructorTypeDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindConstructorTypeDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindDeclToPullSymbol(value: PullDecl => Unit): Self = StObject.set(x, "bindDeclToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindEnumDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindEnumDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindEnumIndexerDeclsToPullSymbols(value: Any => Any): Self = StObject.set(x, "bindEnumIndexerDeclsToPullSymbols", js.Any.fromFunction1(value))
    
    inline def setBindEnumMemberDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindEnumMemberDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindFunctionDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindFunctionDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindFunctionExpressionToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindFunctionExpressionToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindFunctionTypeDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindFunctionTypeDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindGetAccessorDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindGetAccessorDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindImportDeclaration(value: Any => Any): Self = StObject.set(x, "bindImportDeclaration", js.Any.fromFunction1(value))
    
    inline def setBindIndexSignatureDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindIndexSignatureDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindInterfaceDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindInterfaceDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindMethodDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindMethodDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindModuleDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindModuleDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindObjectTypeDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindObjectTypeDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindParameterSymbols(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "bindParameterSymbols", js.Any.fromFunction4(value))
    
    inline def setBindPropertyDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindPropertyDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindSetAccessorDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindSetAccessorDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindSingleDeclToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindSingleDeclToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setBindStaticPrototypePropertyOfClass(value: (Any, Any, Any) => Any): Self = StObject.set(x, "bindStaticPrototypePropertyOfClass", js.Any.fromFunction3(value))
    
    inline def setBindVariableDeclarationToPullSymbol(value: Any => Any): Self = StObject.set(x, "bindVariableDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    inline def setCheckThatExportsMatch(value: (Any, Any, Any) => Any): Self = StObject.set(x, "checkThatExportsMatch", js.Any.fromFunction3(value))
    
    inline def setDeclsBeingBound(value: Any): Self = StObject.set(x, "declsBeingBound", value.asInstanceOf[js.Any])
    
    inline def setEnsurePriorDeclarationsAreBound(value: (Any, Any) => Any): Self = StObject.set(x, "ensurePriorDeclarationsAreBound", js.Any.fromFunction2(value))
    
    inline def setFindDeclsInContext(value: (Any, Any, Any) => Any): Self = StObject.set(x, "findDeclsInContext", js.Any.fromFunction3(value))
    
    inline def setFindExistingVariableSymbolForModuleValueDecl(value: Any => Any): Self = StObject.set(x, "findExistingVariableSymbolForModuleValueDecl", js.Any.fromFunction1(value))
    
    inline def setGetDeclsToBind(value: Any => Any): Self = StObject.set(x, "getDeclsToBind", js.Any.fromFunction1(value))
    
    inline def setGetExistingSymbol(value: (Any, Any, Any) => Any): Self = StObject.set(x, "getExistingSymbol", js.Any.fromFunction3(value))
    
    inline def setGetIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList(value: (Any, Any) => Any): Self = StObject.set(x, "getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList", js.Any.fromFunction2(value))
    
    inline def setGetParent(value: (Any, Any) => Any): Self = StObject.set(x, "getParent", js.Any.fromFunction2(value))
    
    inline def setInBindingOtherDeclsWalker(value: Any): Self = StObject.set(x, "inBindingOtherDeclsWalker", value.asInstanceOf[js.Any])
    
    inline def setSemanticInfoChain(value: Any): Self = StObject.set(x, "semanticInfoChain", value.asInstanceOf[js.Any])
    
    inline def setShouldBindDeclaration(value: Any => Any): Self = StObject.set(x, "shouldBindDeclaration", js.Any.fromFunction1(value))
  }
}
