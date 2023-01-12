package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclarationEmitter extends StObject {
  
  /* private */ def canEmitDeclarations(declAST: Any): Any
  
  /* private */ var compiler: Any
  
  /* private */ var declFile: Any
  
  var document: Document
  
  /* private */ def emitAccessorDeclarationComments(funcDecl: Any): Any
  
  /* private */ def emitArgDecl(argDecl: Any, id: Any, isOptional: Any, isPrivate: Any): Any
  
  /* private */ def emitBaseList(bases: Any, useExtendsList: Any): Any
  
  /* private */ def emitCallSignature(funcDecl: Any): Any
  
  /* private */ def emitClassElementModifiers(modifiers: Any): Any
  
  /* private */ def emitClassMembersFromConstructorDefinition(funcDecl: Any): Any
  
  /* private */ def emitComment(comment: Any): Any
  
  /* private */ def emitConstructSignature(funcDecl: Any): Any
  
  /* private */ def emitDeclFlags(declarationAST: Any, typeString: Any): Any
  
  /* private */ def emitDeclarationComments(ast: Any, endLine: Any): Any
  
  def emitDeclarations(sourceUnit: SourceUnit): Unit
  
  /* private */ def emitDeclarationsForAST(ast: Any): Any
  
  /* private */ def emitDeclarationsForClassDeclaration(classDecl: Any): Any
  
  /* private */ def emitDeclarationsForConstructorDeclaration(funcDecl: Any): Any
  
  /* private */ def emitDeclarationsForEnumDeclaration(moduleDecl: Any): Any
  
  /* private */ def emitDeclarationsForExportAssignment(ast: Any): Any
  
  /* private */ def emitDeclarationsForFunctionDeclaration(funcDecl: Any): Any
  
  /* private */ def emitDeclarationsForGetAccessor(funcDecl: Any): Any
  
  /* private */ def emitDeclarationsForImportDeclaration(importDeclAST: Any): Any
  
  /* private */ def emitDeclarationsForInterfaceDeclaration(interfaceDecl: Any): Any
  
  /* private */ def emitDeclarationsForList(list: Any): Any
  
  /* private */ def emitDeclarationsForMemberVariableDeclaration(varDecl: Any): Any
  
  /* private */ def emitDeclarationsForModuleDeclaration(moduleDecl: Any): Any
  
  /* private */ def emitDeclarationsForSetAccessor(funcDecl: Any): Any
  
  /* private */ def emitDeclarationsForSourceUnit(sourceUnit: Any): Any
  
  /* private */ def emitDeclarationsForVariableDeclaration(variableDeclaration: Any): Any
  
  /* private */ def emitDeclarationsForVariableStatement(variableStatement: Any): Any
  
  /* private */ def emitHeritageClause(clause: Any): Any
  
  /* private */ def emitHeritageClauses(clauses: Any): Any
  
  /* private */ def emitIndent(): Any
  
  /* private */ def emitIndexMemberDeclaration(funcDecl: Any): Any
  
  /* private */ def emitIndexSignature(funcDecl: Any): Any
  
  /* private */ def emitMemberAccessorDeclaration(funcDecl: Any, modifiers: Any, name: Any): Any
  
  /* private */ def emitMemberFunctionDeclaration(funcDecl: Any): Any
  
  /* private */ def emitMethodSignature(funcDecl: Any): Any
  
  /* private */ var emitOptions: Any
  
  /* private */ def emitParameterList(isPrivate: Any, parameterList: Any): Any
  
  /* private */ def emitParameters(isPrivate: Any, parameterList: Any): Any
  
  /* private */ def emitPropertySignature(varDecl: Any): Any
  
  /* private */ def emitReferencePaths(sourceUnit: Any): Any
  
  /* private */ def emitSeparatedList(list: Any): Any
  
  /* private */ def emitTypeNamesMember(memberName: Any, emitIndent: Any): Any
  
  /* private */ def emitTypeOfVariableDeclaratorOrParameter(boundDecl: Any): Any
  
  /* private */ def emitTypeParameters(typeParams: Any, funcSignature: Any): Any
  
  /* private */ def emitTypeSignature(ast: Any, `type`: Any): Any
  
  /* private */ def emitVariableDeclarator(varDecl: Any, isFirstVarInList: Any, isLastVarInList: Any): Any
  
  /* private */ var emittedReferencePaths: Any
  
  /* private */ var emittingFileName: Any
  
  /* private */ def getDeclFlagsString(pullDecl: Any, typeString: Any): Any
  
  /* private */ def getIndentString(declIndent: Any): Any
  
  def getOutputFile(): OutputFile
  
  /* private */ var indenter: Any
  
  /* private */ def isOverloadedCallSignature(funcDecl: Any): Any
  
  /* private */ def resolveScriptReference(document: Any, reference: Any): Any
  
  /* private */ var semanticInfoChain: Any
  
  /* private */ def writeDeclarationComments(declComments: Any, endLine: Any): Any
}
object DeclarationEmitter {
  
  inline def apply(
    canEmitDeclarations: Any => Any,
    compiler: Any,
    declFile: Any,
    document: Document,
    emitAccessorDeclarationComments: Any => Any,
    emitArgDecl: (Any, Any, Any, Any) => Any,
    emitBaseList: (Any, Any) => Any,
    emitCallSignature: Any => Any,
    emitClassElementModifiers: Any => Any,
    emitClassMembersFromConstructorDefinition: Any => Any,
    emitComment: Any => Any,
    emitConstructSignature: Any => Any,
    emitDeclFlags: (Any, Any) => Any,
    emitDeclarationComments: (Any, Any) => Any,
    emitDeclarations: SourceUnit => Unit,
    emitDeclarationsForAST: Any => Any,
    emitDeclarationsForClassDeclaration: Any => Any,
    emitDeclarationsForConstructorDeclaration: Any => Any,
    emitDeclarationsForEnumDeclaration: Any => Any,
    emitDeclarationsForExportAssignment: Any => Any,
    emitDeclarationsForFunctionDeclaration: Any => Any,
    emitDeclarationsForGetAccessor: Any => Any,
    emitDeclarationsForImportDeclaration: Any => Any,
    emitDeclarationsForInterfaceDeclaration: Any => Any,
    emitDeclarationsForList: Any => Any,
    emitDeclarationsForMemberVariableDeclaration: Any => Any,
    emitDeclarationsForModuleDeclaration: Any => Any,
    emitDeclarationsForSetAccessor: Any => Any,
    emitDeclarationsForSourceUnit: Any => Any,
    emitDeclarationsForVariableDeclaration: Any => Any,
    emitDeclarationsForVariableStatement: Any => Any,
    emitHeritageClause: Any => Any,
    emitHeritageClauses: Any => Any,
    emitIndent: () => Any,
    emitIndexMemberDeclaration: Any => Any,
    emitIndexSignature: Any => Any,
    emitMemberAccessorDeclaration: (Any, Any, Any) => Any,
    emitMemberFunctionDeclaration: Any => Any,
    emitMethodSignature: Any => Any,
    emitOptions: Any,
    emitParameterList: (Any, Any) => Any,
    emitParameters: (Any, Any) => Any,
    emitPropertySignature: Any => Any,
    emitReferencePaths: Any => Any,
    emitSeparatedList: Any => Any,
    emitTypeNamesMember: (Any, Any) => Any,
    emitTypeOfVariableDeclaratorOrParameter: Any => Any,
    emitTypeParameters: (Any, Any) => Any,
    emitTypeSignature: (Any, Any) => Any,
    emitVariableDeclarator: (Any, Any, Any) => Any,
    emittedReferencePaths: Any,
    emittingFileName: Any,
    getDeclFlagsString: (Any, Any) => Any,
    getIndentString: Any => Any,
    getOutputFile: () => OutputFile,
    indenter: Any,
    isOverloadedCallSignature: Any => Any,
    resolveScriptReference: (Any, Any) => Any,
    semanticInfoChain: Any,
    writeDeclarationComments: (Any, Any) => Any
  ): DeclarationEmitter = {
    val __obj = js.Dynamic.literal(canEmitDeclarations = js.Any.fromFunction1(canEmitDeclarations), compiler = compiler.asInstanceOf[js.Any], declFile = declFile.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], emitAccessorDeclarationComments = js.Any.fromFunction1(emitAccessorDeclarationComments), emitArgDecl = js.Any.fromFunction4(emitArgDecl), emitBaseList = js.Any.fromFunction2(emitBaseList), emitCallSignature = js.Any.fromFunction1(emitCallSignature), emitClassElementModifiers = js.Any.fromFunction1(emitClassElementModifiers), emitClassMembersFromConstructorDefinition = js.Any.fromFunction1(emitClassMembersFromConstructorDefinition), emitComment = js.Any.fromFunction1(emitComment), emitConstructSignature = js.Any.fromFunction1(emitConstructSignature), emitDeclFlags = js.Any.fromFunction2(emitDeclFlags), emitDeclarationComments = js.Any.fromFunction2(emitDeclarationComments), emitDeclarations = js.Any.fromFunction1(emitDeclarations), emitDeclarationsForAST = js.Any.fromFunction1(emitDeclarationsForAST), emitDeclarationsForClassDeclaration = js.Any.fromFunction1(emitDeclarationsForClassDeclaration), emitDeclarationsForConstructorDeclaration = js.Any.fromFunction1(emitDeclarationsForConstructorDeclaration), emitDeclarationsForEnumDeclaration = js.Any.fromFunction1(emitDeclarationsForEnumDeclaration), emitDeclarationsForExportAssignment = js.Any.fromFunction1(emitDeclarationsForExportAssignment), emitDeclarationsForFunctionDeclaration = js.Any.fromFunction1(emitDeclarationsForFunctionDeclaration), emitDeclarationsForGetAccessor = js.Any.fromFunction1(emitDeclarationsForGetAccessor), emitDeclarationsForImportDeclaration = js.Any.fromFunction1(emitDeclarationsForImportDeclaration), emitDeclarationsForInterfaceDeclaration = js.Any.fromFunction1(emitDeclarationsForInterfaceDeclaration), emitDeclarationsForList = js.Any.fromFunction1(emitDeclarationsForList), emitDeclarationsForMemberVariableDeclaration = js.Any.fromFunction1(emitDeclarationsForMemberVariableDeclaration), emitDeclarationsForModuleDeclaration = js.Any.fromFunction1(emitDeclarationsForModuleDeclaration), emitDeclarationsForSetAccessor = js.Any.fromFunction1(emitDeclarationsForSetAccessor), emitDeclarationsForSourceUnit = js.Any.fromFunction1(emitDeclarationsForSourceUnit), emitDeclarationsForVariableDeclaration = js.Any.fromFunction1(emitDeclarationsForVariableDeclaration), emitDeclarationsForVariableStatement = js.Any.fromFunction1(emitDeclarationsForVariableStatement), emitHeritageClause = js.Any.fromFunction1(emitHeritageClause), emitHeritageClauses = js.Any.fromFunction1(emitHeritageClauses), emitIndent = js.Any.fromFunction0(emitIndent), emitIndexMemberDeclaration = js.Any.fromFunction1(emitIndexMemberDeclaration), emitIndexSignature = js.Any.fromFunction1(emitIndexSignature), emitMemberAccessorDeclaration = js.Any.fromFunction3(emitMemberAccessorDeclaration), emitMemberFunctionDeclaration = js.Any.fromFunction1(emitMemberFunctionDeclaration), emitMethodSignature = js.Any.fromFunction1(emitMethodSignature), emitOptions = emitOptions.asInstanceOf[js.Any], emitParameterList = js.Any.fromFunction2(emitParameterList), emitParameters = js.Any.fromFunction2(emitParameters), emitPropertySignature = js.Any.fromFunction1(emitPropertySignature), emitReferencePaths = js.Any.fromFunction1(emitReferencePaths), emitSeparatedList = js.Any.fromFunction1(emitSeparatedList), emitTypeNamesMember = js.Any.fromFunction2(emitTypeNamesMember), emitTypeOfVariableDeclaratorOrParameter = js.Any.fromFunction1(emitTypeOfVariableDeclaratorOrParameter), emitTypeParameters = js.Any.fromFunction2(emitTypeParameters), emitTypeSignature = js.Any.fromFunction2(emitTypeSignature), emitVariableDeclarator = js.Any.fromFunction3(emitVariableDeclarator), emittedReferencePaths = emittedReferencePaths.asInstanceOf[js.Any], emittingFileName = emittingFileName.asInstanceOf[js.Any], getDeclFlagsString = js.Any.fromFunction2(getDeclFlagsString), getIndentString = js.Any.fromFunction1(getIndentString), getOutputFile = js.Any.fromFunction0(getOutputFile), indenter = indenter.asInstanceOf[js.Any], isOverloadedCallSignature = js.Any.fromFunction1(isOverloadedCallSignature), resolveScriptReference = js.Any.fromFunction2(resolveScriptReference), semanticInfoChain = semanticInfoChain.asInstanceOf[js.Any], writeDeclarationComments = js.Any.fromFunction2(writeDeclarationComments))
    __obj.asInstanceOf[DeclarationEmitter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeclarationEmitter] (val x: Self) extends AnyVal {
    
    inline def setCanEmitDeclarations(value: Any => Any): Self = StObject.set(x, "canEmitDeclarations", js.Any.fromFunction1(value))
    
    inline def setCompiler(value: Any): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setDeclFile(value: Any): Self = StObject.set(x, "declFile", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setEmitAccessorDeclarationComments(value: Any => Any): Self = StObject.set(x, "emitAccessorDeclarationComments", js.Any.fromFunction1(value))
    
    inline def setEmitArgDecl(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "emitArgDecl", js.Any.fromFunction4(value))
    
    inline def setEmitBaseList(value: (Any, Any) => Any): Self = StObject.set(x, "emitBaseList", js.Any.fromFunction2(value))
    
    inline def setEmitCallSignature(value: Any => Any): Self = StObject.set(x, "emitCallSignature", js.Any.fromFunction1(value))
    
    inline def setEmitClassElementModifiers(value: Any => Any): Self = StObject.set(x, "emitClassElementModifiers", js.Any.fromFunction1(value))
    
    inline def setEmitClassMembersFromConstructorDefinition(value: Any => Any): Self = StObject.set(x, "emitClassMembersFromConstructorDefinition", js.Any.fromFunction1(value))
    
    inline def setEmitComment(value: Any => Any): Self = StObject.set(x, "emitComment", js.Any.fromFunction1(value))
    
    inline def setEmitConstructSignature(value: Any => Any): Self = StObject.set(x, "emitConstructSignature", js.Any.fromFunction1(value))
    
    inline def setEmitDeclFlags(value: (Any, Any) => Any): Self = StObject.set(x, "emitDeclFlags", js.Any.fromFunction2(value))
    
    inline def setEmitDeclarationComments(value: (Any, Any) => Any): Self = StObject.set(x, "emitDeclarationComments", js.Any.fromFunction2(value))
    
    inline def setEmitDeclarations(value: SourceUnit => Unit): Self = StObject.set(x, "emitDeclarations", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForAST(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForAST", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForClassDeclaration(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForClassDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForConstructorDeclaration(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForConstructorDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForEnumDeclaration(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForEnumDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForExportAssignment(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForExportAssignment", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForFunctionDeclaration(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForFunctionDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForGetAccessor(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForGetAccessor", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForImportDeclaration(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForImportDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForInterfaceDeclaration(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForInterfaceDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForList(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForList", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForMemberVariableDeclaration(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForMemberVariableDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForModuleDeclaration(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForModuleDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForSetAccessor(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForSetAccessor", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForSourceUnit(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForSourceUnit", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForVariableDeclaration(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForVariableDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitDeclarationsForVariableStatement(value: Any => Any): Self = StObject.set(x, "emitDeclarationsForVariableStatement", js.Any.fromFunction1(value))
    
    inline def setEmitHeritageClause(value: Any => Any): Self = StObject.set(x, "emitHeritageClause", js.Any.fromFunction1(value))
    
    inline def setEmitHeritageClauses(value: Any => Any): Self = StObject.set(x, "emitHeritageClauses", js.Any.fromFunction1(value))
    
    inline def setEmitIndent(value: () => Any): Self = StObject.set(x, "emitIndent", js.Any.fromFunction0(value))
    
    inline def setEmitIndexMemberDeclaration(value: Any => Any): Self = StObject.set(x, "emitIndexMemberDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitIndexSignature(value: Any => Any): Self = StObject.set(x, "emitIndexSignature", js.Any.fromFunction1(value))
    
    inline def setEmitMemberAccessorDeclaration(value: (Any, Any, Any) => Any): Self = StObject.set(x, "emitMemberAccessorDeclaration", js.Any.fromFunction3(value))
    
    inline def setEmitMemberFunctionDeclaration(value: Any => Any): Self = StObject.set(x, "emitMemberFunctionDeclaration", js.Any.fromFunction1(value))
    
    inline def setEmitMethodSignature(value: Any => Any): Self = StObject.set(x, "emitMethodSignature", js.Any.fromFunction1(value))
    
    inline def setEmitOptions(value: Any): Self = StObject.set(x, "emitOptions", value.asInstanceOf[js.Any])
    
    inline def setEmitParameterList(value: (Any, Any) => Any): Self = StObject.set(x, "emitParameterList", js.Any.fromFunction2(value))
    
    inline def setEmitParameters(value: (Any, Any) => Any): Self = StObject.set(x, "emitParameters", js.Any.fromFunction2(value))
    
    inline def setEmitPropertySignature(value: Any => Any): Self = StObject.set(x, "emitPropertySignature", js.Any.fromFunction1(value))
    
    inline def setEmitReferencePaths(value: Any => Any): Self = StObject.set(x, "emitReferencePaths", js.Any.fromFunction1(value))
    
    inline def setEmitSeparatedList(value: Any => Any): Self = StObject.set(x, "emitSeparatedList", js.Any.fromFunction1(value))
    
    inline def setEmitTypeNamesMember(value: (Any, Any) => Any): Self = StObject.set(x, "emitTypeNamesMember", js.Any.fromFunction2(value))
    
    inline def setEmitTypeOfVariableDeclaratorOrParameter(value: Any => Any): Self = StObject.set(x, "emitTypeOfVariableDeclaratorOrParameter", js.Any.fromFunction1(value))
    
    inline def setEmitTypeParameters(value: (Any, Any) => Any): Self = StObject.set(x, "emitTypeParameters", js.Any.fromFunction2(value))
    
    inline def setEmitTypeSignature(value: (Any, Any) => Any): Self = StObject.set(x, "emitTypeSignature", js.Any.fromFunction2(value))
    
    inline def setEmitVariableDeclarator(value: (Any, Any, Any) => Any): Self = StObject.set(x, "emitVariableDeclarator", js.Any.fromFunction3(value))
    
    inline def setEmittedReferencePaths(value: Any): Self = StObject.set(x, "emittedReferencePaths", value.asInstanceOf[js.Any])
    
    inline def setEmittingFileName(value: Any): Self = StObject.set(x, "emittingFileName", value.asInstanceOf[js.Any])
    
    inline def setGetDeclFlagsString(value: (Any, Any) => Any): Self = StObject.set(x, "getDeclFlagsString", js.Any.fromFunction2(value))
    
    inline def setGetIndentString(value: Any => Any): Self = StObject.set(x, "getIndentString", js.Any.fromFunction1(value))
    
    inline def setGetOutputFile(value: () => OutputFile): Self = StObject.set(x, "getOutputFile", js.Any.fromFunction0(value))
    
    inline def setIndenter(value: Any): Self = StObject.set(x, "indenter", value.asInstanceOf[js.Any])
    
    inline def setIsOverloadedCallSignature(value: Any => Any): Self = StObject.set(x, "isOverloadedCallSignature", js.Any.fromFunction1(value))
    
    inline def setResolveScriptReference(value: (Any, Any) => Any): Self = StObject.set(x, "resolveScriptReference", js.Any.fromFunction2(value))
    
    inline def setSemanticInfoChain(value: Any): Self = StObject.set(x, "semanticInfoChain", value.asInstanceOf[js.Any])
    
    inline def setWriteDeclarationComments(value: (Any, Any) => Any): Self = StObject.set(x, "writeDeclarationComments", js.Any.fromFunction2(value))
  }
}
