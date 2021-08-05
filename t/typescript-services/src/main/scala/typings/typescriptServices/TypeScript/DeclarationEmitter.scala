package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclarationEmitter extends StObject {
  
  /* private */ def canEmitDeclarations(declAST: js.Any): js.Any
  
  /* private */ var compiler: js.Any
  
  /* private */ var declFile: js.Any
  
  var document: Document
  
  /* private */ def emitAccessorDeclarationComments(funcDecl: js.Any): js.Any
  
  /* private */ def emitArgDecl(argDecl: js.Any, id: js.Any, isOptional: js.Any, isPrivate: js.Any): js.Any
  
  /* private */ def emitBaseList(bases: js.Any, useExtendsList: js.Any): js.Any
  
  /* private */ def emitCallSignature(funcDecl: js.Any): js.Any
  
  /* private */ def emitClassElementModifiers(modifiers: js.Any): js.Any
  
  /* private */ def emitClassMembersFromConstructorDefinition(funcDecl: js.Any): js.Any
  
  /* private */ def emitComment(comment: js.Any): js.Any
  
  /* private */ def emitConstructSignature(funcDecl: js.Any): js.Any
  
  /* private */ def emitDeclFlags(declarationAST: js.Any, typeString: js.Any): js.Any
  
  /* private */ def emitDeclarationComments(ast: js.Any, endLine: js.Any): js.Any
  
  def emitDeclarations(sourceUnit: SourceUnit): Unit
  
  /* private */ def emitDeclarationsForAST(ast: js.Any): js.Any
  
  /* private */ def emitDeclarationsForClassDeclaration(classDecl: js.Any): js.Any
  
  /* private */ def emitDeclarationsForConstructorDeclaration(funcDecl: js.Any): js.Any
  
  /* private */ def emitDeclarationsForEnumDeclaration(moduleDecl: js.Any): js.Any
  
  /* private */ def emitDeclarationsForExportAssignment(ast: js.Any): js.Any
  
  /* private */ def emitDeclarationsForFunctionDeclaration(funcDecl: js.Any): js.Any
  
  /* private */ def emitDeclarationsForGetAccessor(funcDecl: js.Any): js.Any
  
  /* private */ def emitDeclarationsForImportDeclaration(importDeclAST: js.Any): js.Any
  
  /* private */ def emitDeclarationsForInterfaceDeclaration(interfaceDecl: js.Any): js.Any
  
  /* private */ def emitDeclarationsForList(list: js.Any): js.Any
  
  /* private */ def emitDeclarationsForMemberVariableDeclaration(varDecl: js.Any): js.Any
  
  /* private */ def emitDeclarationsForModuleDeclaration(moduleDecl: js.Any): js.Any
  
  /* private */ def emitDeclarationsForSetAccessor(funcDecl: js.Any): js.Any
  
  /* private */ def emitDeclarationsForSourceUnit(sourceUnit: js.Any): js.Any
  
  /* private */ def emitDeclarationsForVariableDeclaration(variableDeclaration: js.Any): js.Any
  
  /* private */ def emitDeclarationsForVariableStatement(variableStatement: js.Any): js.Any
  
  /* private */ def emitHeritageClause(clause: js.Any): js.Any
  
  /* private */ def emitHeritageClauses(clauses: js.Any): js.Any
  
  /* private */ def emitIndent(): js.Any
  
  /* private */ def emitIndexMemberDeclaration(funcDecl: js.Any): js.Any
  
  /* private */ def emitIndexSignature(funcDecl: js.Any): js.Any
  
  /* private */ def emitMemberAccessorDeclaration(funcDecl: js.Any, modifiers: js.Any, name: js.Any): js.Any
  
  /* private */ def emitMemberFunctionDeclaration(funcDecl: js.Any): js.Any
  
  /* private */ def emitMethodSignature(funcDecl: js.Any): js.Any
  
  /* private */ var emitOptions: js.Any
  
  /* private */ def emitParameterList(isPrivate: js.Any, parameterList: js.Any): js.Any
  
  /* private */ def emitParameters(isPrivate: js.Any, parameterList: js.Any): js.Any
  
  /* private */ def emitPropertySignature(varDecl: js.Any): js.Any
  
  /* private */ def emitReferencePaths(sourceUnit: js.Any): js.Any
  
  /* private */ def emitSeparatedList(list: js.Any): js.Any
  
  /* private */ def emitTypeNamesMember(memberName: js.Any, emitIndent: js.Any): js.Any
  
  /* private */ def emitTypeOfVariableDeclaratorOrParameter(boundDecl: js.Any): js.Any
  
  /* private */ def emitTypeParameters(typeParams: js.Any, funcSignature: js.Any): js.Any
  
  /* private */ def emitTypeSignature(ast: js.Any, `type`: js.Any): js.Any
  
  /* private */ def emitVariableDeclarator(varDecl: js.Any, isFirstVarInList: js.Any, isLastVarInList: js.Any): js.Any
  
  /* private */ var emittedReferencePaths: js.Any
  
  /* private */ var emittingFileName: js.Any
  
  /* private */ def getDeclFlagsString(pullDecl: js.Any, typeString: js.Any): js.Any
  
  /* private */ def getIndentString(declIndent: js.Any): js.Any
  
  def getOutputFile(): OutputFile
  
  /* private */ var indenter: js.Any
  
  /* private */ def isOverloadedCallSignature(funcDecl: js.Any): js.Any
  
  /* private */ def resolveScriptReference(document: js.Any, reference: js.Any): js.Any
  
  /* private */ var semanticInfoChain: js.Any
  
  /* private */ def writeDeclarationComments(declComments: js.Any, endLine: js.Any): js.Any
}
object DeclarationEmitter {
  
  inline def apply(
    canEmitDeclarations: js.Any => js.Any,
    compiler: js.Any,
    declFile: js.Any,
    document: Document,
    emitAccessorDeclarationComments: js.Any => js.Any,
    emitArgDecl: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    emitBaseList: (js.Any, js.Any) => js.Any,
    emitCallSignature: js.Any => js.Any,
    emitClassElementModifiers: js.Any => js.Any,
    emitClassMembersFromConstructorDefinition: js.Any => js.Any,
    emitComment: js.Any => js.Any,
    emitConstructSignature: js.Any => js.Any,
    emitDeclFlags: (js.Any, js.Any) => js.Any,
    emitDeclarationComments: (js.Any, js.Any) => js.Any,
    emitDeclarations: SourceUnit => Unit,
    emitDeclarationsForAST: js.Any => js.Any,
    emitDeclarationsForClassDeclaration: js.Any => js.Any,
    emitDeclarationsForConstructorDeclaration: js.Any => js.Any,
    emitDeclarationsForEnumDeclaration: js.Any => js.Any,
    emitDeclarationsForExportAssignment: js.Any => js.Any,
    emitDeclarationsForFunctionDeclaration: js.Any => js.Any,
    emitDeclarationsForGetAccessor: js.Any => js.Any,
    emitDeclarationsForImportDeclaration: js.Any => js.Any,
    emitDeclarationsForInterfaceDeclaration: js.Any => js.Any,
    emitDeclarationsForList: js.Any => js.Any,
    emitDeclarationsForMemberVariableDeclaration: js.Any => js.Any,
    emitDeclarationsForModuleDeclaration: js.Any => js.Any,
    emitDeclarationsForSetAccessor: js.Any => js.Any,
    emitDeclarationsForSourceUnit: js.Any => js.Any,
    emitDeclarationsForVariableDeclaration: js.Any => js.Any,
    emitDeclarationsForVariableStatement: js.Any => js.Any,
    emitHeritageClause: js.Any => js.Any,
    emitHeritageClauses: js.Any => js.Any,
    emitIndent: () => js.Any,
    emitIndexMemberDeclaration: js.Any => js.Any,
    emitIndexSignature: js.Any => js.Any,
    emitMemberAccessorDeclaration: (js.Any, js.Any, js.Any) => js.Any,
    emitMemberFunctionDeclaration: js.Any => js.Any,
    emitMethodSignature: js.Any => js.Any,
    emitOptions: js.Any,
    emitParameterList: (js.Any, js.Any) => js.Any,
    emitParameters: (js.Any, js.Any) => js.Any,
    emitPropertySignature: js.Any => js.Any,
    emitReferencePaths: js.Any => js.Any,
    emitSeparatedList: js.Any => js.Any,
    emitTypeNamesMember: (js.Any, js.Any) => js.Any,
    emitTypeOfVariableDeclaratorOrParameter: js.Any => js.Any,
    emitTypeParameters: (js.Any, js.Any) => js.Any,
    emitTypeSignature: (js.Any, js.Any) => js.Any,
    emitVariableDeclarator: (js.Any, js.Any, js.Any) => js.Any,
    emittedReferencePaths: js.Any,
    emittingFileName: js.Any,
    getDeclFlagsString: (js.Any, js.Any) => js.Any,
    getIndentString: js.Any => js.Any,
    getOutputFile: () => OutputFile,
    indenter: js.Any,
    isOverloadedCallSignature: js.Any => js.Any,
    resolveScriptReference: (js.Any, js.Any) => js.Any,
    semanticInfoChain: js.Any,
    writeDeclarationComments: (js.Any, js.Any) => js.Any
  ): DeclarationEmitter = {
    val __obj = js.Dynamic.literal(canEmitDeclarations = js.Any.fromFunction1(canEmitDeclarations), compiler = compiler.asInstanceOf[js.Any], declFile = declFile.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], emitAccessorDeclarationComments = js.Any.fromFunction1(emitAccessorDeclarationComments), emitArgDecl = js.Any.fromFunction4(emitArgDecl), emitBaseList = js.Any.fromFunction2(emitBaseList), emitCallSignature = js.Any.fromFunction1(emitCallSignature), emitClassElementModifiers = js.Any.fromFunction1(emitClassElementModifiers), emitClassMembersFromConstructorDefinition = js.Any.fromFunction1(emitClassMembersFromConstructorDefinition), emitComment = js.Any.fromFunction1(emitComment), emitConstructSignature = js.Any.fromFunction1(emitConstructSignature), emitDeclFlags = js.Any.fromFunction2(emitDeclFlags), emitDeclarationComments = js.Any.fromFunction2(emitDeclarationComments), emitDeclarations = js.Any.fromFunction1(emitDeclarations), emitDeclarationsForAST = js.Any.fromFunction1(emitDeclarationsForAST), emitDeclarationsForClassDeclaration = js.Any.fromFunction1(emitDeclarationsForClassDeclaration), emitDeclarationsForConstructorDeclaration = js.Any.fromFunction1(emitDeclarationsForConstructorDeclaration), emitDeclarationsForEnumDeclaration = js.Any.fromFunction1(emitDeclarationsForEnumDeclaration), emitDeclarationsForExportAssignment = js.Any.fromFunction1(emitDeclarationsForExportAssignment), emitDeclarationsForFunctionDeclaration = js.Any.fromFunction1(emitDeclarationsForFunctionDeclaration), emitDeclarationsForGetAccessor = js.Any.fromFunction1(emitDeclarationsForGetAccessor), emitDeclarationsForImportDeclaration = js.Any.fromFunction1(emitDeclarationsForImportDeclaration), emitDeclarationsForInterfaceDeclaration = js.Any.fromFunction1(emitDeclarationsForInterfaceDeclaration), emitDeclarationsForList = js.Any.fromFunction1(emitDeclarationsForList), emitDeclarationsForMemberVariableDeclaration = js.Any.fromFunction1(emitDeclarationsForMemberVariableDeclaration), emitDeclarationsForModuleDeclaration = js.Any.fromFunction1(emitDeclarationsForModuleDeclaration), emitDeclarationsForSetAccessor = js.Any.fromFunction1(emitDeclarationsForSetAccessor), emitDeclarationsForSourceUnit = js.Any.fromFunction1(emitDeclarationsForSourceUnit), emitDeclarationsForVariableDeclaration = js.Any.fromFunction1(emitDeclarationsForVariableDeclaration), emitDeclarationsForVariableStatement = js.Any.fromFunction1(emitDeclarationsForVariableStatement), emitHeritageClause = js.Any.fromFunction1(emitHeritageClause), emitHeritageClauses = js.Any.fromFunction1(emitHeritageClauses), emitIndent = js.Any.fromFunction0(emitIndent), emitIndexMemberDeclaration = js.Any.fromFunction1(emitIndexMemberDeclaration), emitIndexSignature = js.Any.fromFunction1(emitIndexSignature), emitMemberAccessorDeclaration = js.Any.fromFunction3(emitMemberAccessorDeclaration), emitMemberFunctionDeclaration = js.Any.fromFunction1(emitMemberFunctionDeclaration), emitMethodSignature = js.Any.fromFunction1(emitMethodSignature), emitOptions = emitOptions.asInstanceOf[js.Any], emitParameterList = js.Any.fromFunction2(emitParameterList), emitParameters = js.Any.fromFunction2(emitParameters), emitPropertySignature = js.Any.fromFunction1(emitPropertySignature), emitReferencePaths = js.Any.fromFunction1(emitReferencePaths), emitSeparatedList = js.Any.fromFunction1(emitSeparatedList), emitTypeNamesMember = js.Any.fromFunction2(emitTypeNamesMember), emitTypeOfVariableDeclaratorOrParameter = js.Any.fromFunction1(emitTypeOfVariableDeclaratorOrParameter), emitTypeParameters = js.Any.fromFunction2(emitTypeParameters), emitTypeSignature = js.Any.fromFunction2(emitTypeSignature), emitVariableDeclarator = js.Any.fromFunction3(emitVariableDeclarator), emittedReferencePaths = emittedReferencePaths.asInstanceOf[js.Any], emittingFileName = emittingFileName.asInstanceOf[js.Any], getDeclFlagsString = js.Any.fromFunction2(getDeclFlagsString), getIndentString = js.Any.fromFunction1(getIndentString), getOutputFile = js.Any.fromFunction0(getOutputFile), indenter = indenter.asInstanceOf[js.Any], isOverloadedCallSignature = js.Any.fromFunction1(isOverloadedCallSignature), resolveScriptReference = js.Any.fromFunction2(resolveScriptReference), semanticInfoChain = semanticInfoChain.asInstanceOf[js.Any], writeDeclarationComments = js.Any.fromFunction2(writeDeclarationComments))
    __obj.asInstanceOf[DeclarationEmitter]
  }
  
  extension [Self <: DeclarationEmitter](x: Self) {
    
    inline def setCanEmitDeclarations(value: js.Any => js.Any): Self = StObject.set(x, "canEmitDeclarations", js.Any.fromFunction1(value))
    
    inline def setCompiler(value: js.Any): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setDeclFile(value: js.Any): Self = StObject.set(x, "declFile", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setEmitAccessorDeclarationComments(value: js.Any => js.Any): Self = StObject.set(x, "emitAccessorDeclarationComments", js.Any.fromFunction1(value))
    
    inline def setEmitArgDecl(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "emitArgDecl", js.Any.fromFunction4(value))
    
    inline def setEmitBaseList(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "emitBaseList", js.Any.fromFunction2(value))
    
    inline def setEmitCallSignature(value: js.Any => js.Any): Self = StObject.set(x, "emitCallSignature", js.Any.fromFunction1(value))
    
    inline def setEmitClassElementModifiers(value: js.Any => js.Any): Self = StObject.set(x, "emitClassElementModifiers", js.Any.fromFunction1(value))
    
    inline def setEmitClassMembersFromConstructorDefinition(value: js.Any => js.Any): Self = StObject.set(x, "emitClassMembersFromConstructorDefinition", js.Any.fromFunction1(value))
    
    inline def setEmitComment(value: js.Any => js.Any): Self = StObject.set(x, "emitComment", js.Any.fromFunction1(value))
    
    inline def setEmitConstructSignature(value: js.Any => js.Any): Self = StObject.set(x, "emitConstructSignature", js.Any.fromFunction1(value))
    
    inline def setEmitDeclFlags(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "emitDeclFlags", js.Any.fromFunction2(value))
    
    inline def setEmitDeclarationComments(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "emitDeclarationComments", js.Any.fromFunction2(value))
    
    inline def setEmitDeclarations(value: SourceUnit => Unit): Self = StObject.set(x, "emitDeclarations", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForAST(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForAST", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForClassDeclaration(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForClassDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForConstructorDeclaration(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForConstructorDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForEnumDeclaration(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForEnumDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForExportAssignment(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForExportAssignment", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForFunctionDeclaration(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForFunctionDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForGetAccessor(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForGetAccessor", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForImportDeclaration(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForImportDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForInterfaceDeclaration(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForInterfaceDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForList(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForList", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForMemberVariableDeclaration(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForMemberVariableDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForModuleDeclaration(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForModuleDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForSetAccessor(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForSetAccessor", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForSourceUnit(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForSourceUnit", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForVariableDeclaration(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForVariableDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForVariableStatement(value: js.Any => js.Any): Self = StObject.set(x, "emitDeclarationsForVariableStatement", js.Any.fromFunction1(value))
    
    inline def setEmitHeritageClause(value: js.Any => js.Any): Self = StObject.set(x, "emitHeritageClause", js.Any.fromFunction1(value))
    
    inline def setEmitHeritageClauses(value: js.Any => js.Any): Self = StObject.set(x, "emitHeritageClauses", js.Any.fromFunction1(value))
    
    inline def setEmitIndent(value: () => js.Any): Self = StObject.set(x, "emitIndent", js.Any.fromFunction0(value))
    
    inline def setEmitIndexMemberDeclaration(value: js.Any => js.Any): Self = StObject.set(x, "emitIndexMemberDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitIndexSignature(value: js.Any => js.Any): Self = StObject.set(x, "emitIndexSignature", js.Any.fromFunction1(value))
    
    inline def setEmitMemberAccessorDeclaration(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "emitMemberAccessorDeclaration", js.Any.fromFunction3(value))
    
    inline def setEmitMemberFunctionDeclaration(value: js.Any => js.Any): Self = StObject.set(x, "emitMemberFunctionDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitMethodSignature(value: js.Any => js.Any): Self = StObject.set(x, "emitMethodSignature", js.Any.fromFunction1(value))
    
    inline def setEmitOptions(value: js.Any): Self = StObject.set(x, "emitOptions", value.asInstanceOf[js.Any])
    
    inline def setEmitParameterList(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "emitParameterList", js.Any.fromFunction2(value))
    
    inline def setEmitParameters(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "emitParameters", js.Any.fromFunction2(value))
    
    inline def setEmitPropertySignature(value: js.Any => js.Any): Self = StObject.set(x, "emitPropertySignature", js.Any.fromFunction1(value))
    
    inline def setEmitReferencePaths(value: js.Any => js.Any): Self = StObject.set(x, "emitReferencePaths", js.Any.fromFunction1(value))
    
    inline def setEmitSeparatedList(value: js.Any => js.Any): Self = StObject.set(x, "emitSeparatedList", js.Any.fromFunction1(value))
    
    inline def setEmitTypeNamesMember(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "emitTypeNamesMember", js.Any.fromFunction2(value))
    
    inline def setEmitTypeOfVariableDeclaratorOrParameter(value: js.Any => js.Any): Self = StObject.set(x, "emitTypeOfVariableDeclaratorOrParameter", js.Any.fromFunction1(value))
    
    inline def setEmitTypeParameters(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "emitTypeParameters", js.Any.fromFunction2(value))
    
    inline def setEmitTypeSignature(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "emitTypeSignature", js.Any.fromFunction2(value))
    
    inline def setEmitVariableDeclarator(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "emitVariableDeclarator", js.Any.fromFunction3(value))
    
    inline def setEmittedReferencePaths(value: js.Any): Self = StObject.set(x, "emittedReferencePaths", value.asInstanceOf[js.Any])
    
    inline def setEmittingFileName(value: js.Any): Self = StObject.set(x, "emittingFileName", value.asInstanceOf[js.Any])
    
    inline def setGetDeclFlagsString(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "getDeclFlagsString", js.Any.fromFunction2(value))
    
    inline def setGetIndentString(value: js.Any => js.Any): Self = StObject.set(x, "getIndentString", js.Any.fromFunction1(value))
    
    inline def setGetOutputFile(value: () => OutputFile): Self = StObject.set(x, "getOutputFile", js.Any.fromFunction0(value))
    
    inline def setIndenter(value: js.Any): Self = StObject.set(x, "indenter", value.asInstanceOf[js.Any])
    
    inline def setIsOverloadedCallSignature(value: js.Any => js.Any): Self = StObject.set(x, "isOverloadedCallSignature", js.Any.fromFunction1(value))
    
    inline def setResolveScriptReference(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "resolveScriptReference", js.Any.fromFunction2(value))
    
    inline def setSemanticInfoChain(value: js.Any): Self = StObject.set(x, "semanticInfoChain", value.asInstanceOf[js.Any])
    
    inline def setWriteDeclarationComments(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "writeDeclarationComments", js.Any.fromFunction2(value))
  }
}
