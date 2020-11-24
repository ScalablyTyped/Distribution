package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullSymbolBinder extends js.Object {
  
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
  
  /* private */ def checkThatExportsMatch(decl: js.Any, prevSymbol: js.Any, reportError: js.Any): js.Any = js.native
  
  var declsBeingBound: js.Any = js.native
  
  /* private */ def ensurePriorDeclarationsAreBound(container: js.Any, currentDecl: js.Any): js.Any = js.native
  
  /* private */ def findDeclsInContext(startingDecl: js.Any, declKind: js.Any, searchGlobally: js.Any): js.Any = js.native
  
  /* private */ def findExistingVariableSymbolForModuleValueDecl(decl: js.Any): js.Any = js.native
  
  /* private */ def getDeclsToBind(decl: js.Any): js.Any = js.native
  
  /* private */ def getExistingSymbol(decl: js.Any, searchKind: js.Any, parent: js.Any): js.Any = js.native
  
  /* private */ def getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList(signature: js.Any, currentSignatures: js.Any): js.Any = js.native
  
  /* private */ def getParent(decl: js.Any, returnInstanceType: js.Any): js.Any = js.native
  
  var inBindingOtherDeclsWalker: js.Any = js.native
  
  var semanticInfoChain: js.Any = js.native
  
  /* private */ def shouldBindDeclaration(decl: js.Any): js.Any = js.native
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
  implicit class PullSymbolBinderOps[Self <: PullSymbolBinder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBindAllDeclsToPullSymbol(value: js.Any => js.Any): Self = this.set("bindAllDeclsToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindCallSignatureDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindCallSignatureDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindCatchVariableToPullSymbol(value: js.Any => js.Any): Self = this.set("bindCatchVariableToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindClassDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindClassDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindConstructSignatureDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindConstructSignatureDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindConstructorDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindConstructorDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindConstructorTypeDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindConstructorTypeDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindDeclToPullSymbol(value: PullDecl => Unit): Self = this.set("bindDeclToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindEnumDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindEnumDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindEnumIndexerDeclsToPullSymbols(value: js.Any => js.Any): Self = this.set("bindEnumIndexerDeclsToPullSymbols", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindEnumMemberDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindEnumMemberDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindFunctionDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindFunctionDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindFunctionExpressionToPullSymbol(value: js.Any => js.Any): Self = this.set("bindFunctionExpressionToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindFunctionTypeDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindFunctionTypeDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindGetAccessorDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindGetAccessorDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindImportDeclaration(value: js.Any => js.Any): Self = this.set("bindImportDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindIndexSignatureDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindIndexSignatureDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindInterfaceDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindInterfaceDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindMethodDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindMethodDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindModuleDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindModuleDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindObjectTypeDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindObjectTypeDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindParameterSymbols(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("bindParameterSymbols", js.Any.fromFunction4(value))
    
    @scala.inline
    def setBindPropertyDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindPropertyDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindSetAccessorDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindSetAccessorDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindSingleDeclToPullSymbol(value: js.Any => js.Any): Self = this.set("bindSingleDeclToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindStaticPrototypePropertyOfClass(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("bindStaticPrototypePropertyOfClass", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBindVariableDeclarationToPullSymbol(value: js.Any => js.Any): Self = this.set("bindVariableDeclarationToPullSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckThatExportsMatch(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("checkThatExportsMatch", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDeclsBeingBound(value: js.Any): Self = this.set("declsBeingBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnsurePriorDeclarationsAreBound(value: (js.Any, js.Any) => js.Any): Self = this.set("ensurePriorDeclarationsAreBound", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindDeclsInContext(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("findDeclsInContext", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFindExistingVariableSymbolForModuleValueDecl(value: js.Any => js.Any): Self = this.set("findExistingVariableSymbolForModuleValueDecl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDeclsToBind(value: js.Any => js.Any): Self = this.set("getDeclsToBind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetExistingSymbol(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("getExistingSymbol", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList(value: (js.Any, js.Any) => js.Any): Self = this.set("getIndexForInsertingSignatureAtEndOfEnclosingDeclInSignatureList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetParent(value: (js.Any, js.Any) => js.Any): Self = this.set("getParent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInBindingOtherDeclsWalker(value: js.Any): Self = this.set("inBindingOtherDeclsWalker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticInfoChain(value: js.Any): Self = this.set("semanticInfoChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldBindDeclaration(value: js.Any => js.Any): Self = this.set("shouldBindDeclaration", js.Any.fromFunction1(value))
  }
}
